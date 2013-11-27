<%@include file="db.jsp"%>
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<%@page import="com.balancedpayments.*"%>
<%@page import="com.balancedpayments.core.*"%>
<%@page import="com.balancedpayments.errors.*"%>
<%@page import="java.util.*"%>

<%
logger.info(request.getQueryString());

String action = request.getParameter("action");
String userid = request.getParameter("userid");//only for testing
String email = request.getParameter("email");//only for testing	
		
if(userid==null) userid = (String)session.getAttribute("userid");
if(email==null) email = (String)session.getAttribute("emailid");
logger.info("Accessing bank account for userid & email: " + userid + " , " + email);

Account customer = (Account)session.getAttribute("balanced_customer");
BankAccount bank_account = (BankAccount)session.getAttribute("balanced_bank_account");
logger.info("customer and account: " + customer + " , " + bank_account);
		
try {
	//** dev
	//Balanced.configure("ak-test-i6gbc3Uyckzi8lk2Matr5TBq1BoUhFCT");
	//Settings.configure("ak-test-i6gbc3Uyckzi8lk2Matr5TBq1BoUhFCT");
	Settings.configure("ak-test-2jhJpyDoZe38TwkdwAJoPHBPkfL0xdgJI");
	//** prod
	//Settings.configure((String)getServletContext().getInitParameter("BALANCED_API_KEY"));
	
	logger.info("Settings configured!");
	Marketplace mp = Marketplace.mine();
	logger.info("My marketplace -> " + mp.name + " -> " + mp.uri);		
		
	if(action.equals("create")){
		
		PreparedStatement pstmt = null;
		String qry = "select first_name, last_name, email, dob, address, city, state, zip, phone1, p.project_name from user u left outer join project p on u.id = p.user_id inner join location l " 
			+ "on u.id = l.user_id where u.id = ?";
		logger.info(qry);
		pstmt = con.prepareStatement(qry);
		pstmt.setString(1, userid);		
		ResultSet rs = pstmt.executeQuery();		
		
		if (rs.next()) {
			
			email = rs.getString(3); //get email from db
			logger.info("Accessing bank account for userid & email: " + userid + " , " + email);
			
			String busname = rs.getString(10);
			if(busname==null){
				busname = rs.getString(1) + " " + rs.getString(2);
			}
												
			//** customer account
			Map<String, Object> identity = new HashMap<String, Object>();
			identity.put("type", request.getParameter("acctype"));			
			if(request.getParameter("acctype").equals("business")){
				identity.put("business_name", busname);
				identity.put("tax_id", request.getParameter("ein"));
				Map<String, Object> personPayload = new HashMap<String, Object>();
				personPayload.put("dob", rs.getString(4));
				personPayload.put("name", rs.getString(1) + " " + rs.getString(2));
				personPayload.put("phone_number", rs.getString(9));
				personPayload.put("postal_code", rs.getString(8));
				personPayload.put("street_address", rs.getString(5));
				identity.put("person", personPayload);
			}else{				
				identity.put("name", rs.getString(1) + " " + rs.getString(2));
				identity.put("dob", rs.getString(4));
			}			
			identity.put("street_address", rs.getString(5));
			identity.put("city", rs.getString(6));
			identity.put("state", rs.getString(7));
			identity.put("postal_code", rs.getString(8));
			identity.put("country_code", "USA");			
			identity.put("phone_number",  rs.getString(9));
												
			bank_account = mp.
					tokenizeBankAccount(request.getParameter("account_name"), request.getParameter("account_number"), request.getParameter("routing_number"),request.getParameter("account_type"));
			logger.info("Bank Account URI:" + bank_account.uri);
		
			if(customer==null) 
				customer = mp.createMerchantAccount(busname, email, bank_account.uri, identity, null);
			else
				customer.associateBankAccount(bank_account.uri);
			
			if(customer!=null){
				session.setAttribute("balanced_customer", customer);
				session.setAttribute("balanced_bank_account", bank_account);
				response.sendRedirect("balancedacc.jsp?action=list");			
			}else{
				out.println("There was a problem creating the account");
			}
			
			/*out.println("<p><b>Customer:</b> " + company.name);									
			out.println("<p><b>Bank Name:</b> " + maskNullStr(bank_account.bank_name));	
			out.println("<p><b>Account Name:</b> " + maskNullStr(bank_account.name));
			out.println("<p><b>Account Type:</b> " + maskNullStr(bank_account.type));
			out.println("<p><b>Account Number:</b> " + bank_account.account_number);
			out.println("<p><b>Routing Number:</b> " + bank_account.routing_number);*/
			
		}//end rs
		
	}else if(action.equals("verify")){					
		
		//** verify ACH
		BankAccountVerification verification = bank_account.getVerification();
		if(verification!=null){
			if(verification.state.equals("pending") || verification.state.equals("deposit_succeeded")){
				try{
					verification.confirm(Integer.parseInt(request.getParameter("ach_amt1")), Integer.parseInt(request.getParameter("ach_amt2")));
					//verification.save();	//throws an error. dont need this
				}catch(Exception ve){
					logger.info("Verification Error: " + ve);					
					response.sendRedirect("balancedacc.jsp?action=list");
				}
			}
			out.println("<p><b>Bank Account Verification State:</b>" + verification.state);
			response.sendRedirect("balancedacc.jsp?action=list");
		}
		
	}else if(action.equals("transact")){
		
		//** retreive merchant accounts
		Account invest=null, comp=null;
		Account.Collection accounts =  mp.accounts; 
		for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
			Account acc = (Account)iterator.next();
	        logger.info(acc.name);
	        logger.info(acc.uri);	        
	        //if(acc.email_address.equals(request.getParameter("email_inv"))) invest = Account.get(acc.uri);
	        if(acc.email_address.equals(email)) invest = Account.get(acc.uri);
	        if(acc.email_address.equals(request.getParameter("email_comp"))) comp = Account.get(acc.uri);	        	        
	    }
		logger.info("Investor and Company: " + invest + comp);
				
		int amt = Integer.parseInt(request.getParameter("tran_amt"));		
		int com = amt*(Integer.parseInt(request.getParameter("commission")))/100;
		int deb = (amt*(100-Integer.parseInt(request.getParameter("commission"))))/100;
		logger.info("Investment Amount: " + amt + " Commision: " + com + " Debit:" + deb);		
		
		//** transact
		invest.debit(amt*100,"Invested $" + amt + " into " + comp.name,null,null,null);
		mp.owner_account.credit(com*100, "Commission of $" + com + " received from investor " + invest.name + " and company " + comp.name);
		comp.credit(deb*100, "Raised $" + deb + " from " + invest.name);
		
		java.sql.Statement smt = con.createStatement();		
		String qry = "insert into investment(user_id, project_id, amount, commission) values(?, ?, ?, ?)";
		logger.info(qry);
		PreparedStatement pstmt = con.prepareStatement(qry,PreparedStatement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, userid);
		pstmt.setString(2, request.getParameter("projectid"));
		pstmt.setInt(3, deb);
		pstmt.setInt(4, com);
		pstmt.executeUpdate();
		ResultSet rs1 = pstmt.getGeneratedKeys();
		if (rs1.next()) {						
			out.println("You have successfully invested $" + amt);// + "<br>The commission paid to Finance Georgia is $" + com); 
			logger.info("Generated pkey: " + rs1.getString(1));
		} else {
			out.println("Investment failed!");			
		}
				
	}else if(action.equals("list")){
		customer = null;	
		if(customer==null){
			//** retreive customer by email			
			Account.Collection accounts = mp.accounts; 
			for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
				Account acc = (Account)iterator.next();
		        logger.info("Customer Name: " + acc.name);
		        logger.info("Customer URI: " + acc.uri);	        	        
		        if(acc.email_address.equals(email)){ 
		        	customer = Account.get(acc.uri);
		        	session.setAttribute("balanced_customer", customer);
		        }
		    }
		}
		
		if(customer!=null){
			logger.info("This customer: " + customer.name);
			out.println("<p><b>Customer: </b>" + customer.name + "</p>");			
		}
		
		bank_account = null;
		if(bank_account==null && customer!=null){
			//** retreive bank accounts (only one account allowed for now)
			BankAccount ba=null;
			BankAccount.Collection bankaccounts = customer.bank_accounts; //mp.bank_accounts;// mp.accounts; 
			for (Iterator<BankAccount> iterator = bankaccounts.iterator(); iterator.hasNext();) {
				BankAccount bankacc = (BankAccount)iterator.next();			
		        if(bankacc.customer!=null) {
		        	logger.info("Bank Acc Name: " + bankacc.name);
		        	logger.info("Bank Acc URI: " + bankacc.uri);	        	        
		        	bank_account = BankAccount.get(bankacc.uri);
		        }	        	        	       
		    }
		}
		if(bank_account!=null){
			out.println("<p><b>Bank Name:</b> " + maskNullStr(bank_account.bank_name));	
			out.println("<p><b>Account Name:</b> " + maskNullStr(bank_account.name));
			out.println("<p><b>Account Type:</b> " + maskNullStr(bank_account.type));
			out.println("<p><b>Account Number:</b> " + bank_account.account_number);
			out.println("<p><b>Routing Number:</b> " + bank_account.routing_number);
			session.setAttribute("balanced_bank_account", bank_account);
		
			BankAccountVerification verification = bank_account.getVerification();
			logger.info("Bank Acccount Verification: " + verification);
			if(verification==null){
				out.println("<p><b>ACH Verification Status: </b>Awaiting ACH deposits!");
			}else{
				out.println("<p><b>ACH Verification Status: </b>" + verification.state);
				if(verification.state.equals("pending") || verification.state.equals("deposit_succeeded")){
					out.println("<div class='well'><b>ACH Verification Attempts: </b>" + verification.attempts + " of " + (verification.attempts + verification.remaining_attempts));						
					out.println("<form id='frm_ach' style='margin:0px'>");								
					out.println("<h5>ACH Amounts</h5>"); 
					out.println("<input type='text' id='ach_amt1' name='ach_amt1' class='input-mini' placeholder='Amt 1' required number='true' min='1' max='99'>");
					out.println("<input type='text' id='ach_amt2' name='ach_amt2' class='input-mini' placeholder='Amt 2' required number='true' min='1' max='99'>"); 
					out.println("<label class='help-inline'>*Please enter amounts in whole cents (ex. 43 and not 0.43)</label>");																	
					out.println("</form>");
					out.println("<button class='btn btn-info' id='btn_acc_ver'>Verify ACH Deposits</button></div>");
					%>
					
					<script>
					validateForm("#frm_ach","right");
					$('#btn_acc_ver').click(function(){
						if($('#frm_ach').valid()){		
							loaderOn();
							$.post('jsp/balancedacc.jsp?action=verify&t=' + Math.random() + '&' + $('#frm_ach').serialize(),function(data,status){
								//alert(data);
								//appalert(data,status);
								$('#div_acc').html(data);
								loaderOff();
							});
						}
					});
					</script>
					
					<%
				}else{
					if(verification.state.equals("failed")) out.println("<p class='text-error'>* ACH verification failed. Please delete the account and try again!</p>");
				}
			}
		}else{
			logger.info("No existing Account. Creating new one.");
			out.println("No existing Account. Creating new one.");
		}
	}else if(action.equals("delete")){
				
		logger.info("deleting account: " + bank_account);
		bank_account.unstore();
		//bacc.save();
		//bank_account.delete(); works same as unstore
		session.setAttribute("balanced_bank_account", null);
		out.println("Account deleted!");
		response.sendRedirect("balancedacc.jsp?action=list");
	}	
	
	
} catch(Exception e) {		
	logger.severe("Error: " + e);	
	HTTPError herr = (HTTPError)e;
	logger.info(herr.status);
	logger.info(herr.raw);
	logger.info(((APIError)herr).description);
	throw new Exception(((APIError)herr).description);
} finally {
	try {
		if (con != null) {
			con.close();
		}			
	} catch (Exception e) {
	}
}
%>