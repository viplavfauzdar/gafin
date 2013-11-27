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
logger.info("Accessing bank account for userid & email: " + userid + " , " + email);
		
try {
	
	Settings.configure("081c11281bcf11e3aaa5026ba7f8ec28");
	Marketplace mp = Marketplace.mine();
	logger.info("My marketplace -> " + mp.name + " -> " + mp.uri);
	
	PreparedStatement pstmt = null;
	String qry = "select first_name, last_name, email, dob, address, city, state, zip, phone1, p.project_name from user u left outer join project p on u.id = p.user_id inner join location l " 
		+ "on u.id = l.user_id where u.id = ?";
	logger.info(qry);
	pstmt = con.prepareStatement(qry);
	pstmt.setString(1, userid);		
	ResultSet rs = pstmt.executeQuery();		
	
	if (rs.next()) {
		
		if(email==null) email = rs.getString(3); //get email from db
		logger.info("Accessing bank account for userid & email: " + userid + " , " + email);
		
		String busname = rs.getString(10);
		if(busname==null){
			busname = rs.getString(1) + " " + rs.getString(2);
		}
		
		if(action.equals("create")){
													
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
						
			BankAccount bank_account = mp.
					tokenizeBankAccount(request.getParameter("account_name"), request.getParameter("account_number"), request.getParameter("routing_number"),request.getParameter("account_type"));
		
			Account company = mp.
					createMerchantAccount(busname, email, bank_account.uri, identity, null);
			if(company!=null)
				response.sendRedirect("balancedacc.jsp?action=list");
			else
				out.println("There was a problem creating the account");
			
			/*out.println("<p><b>Customer:</b> " + company.name);									
			out.println("<p><b>Bank Name:</b> " + maskNullStr(bank_account.bank_name));	
			out.println("<p><b>Account Name:</b> " + maskNullStr(bank_account.name));
			out.println("<p><b>Account Type:</b> " + maskNullStr(bank_account.type));
			out.println("<p><b>Account Number:</b> " + bank_account.account_number);
			out.println("<p><b>Routing Number:</b> " + bank_account.routing_number);*/						
			
		}else if(action.equals("verify")){
			
			//** retreive customer by email
			Account cust=null;
			Account.Collection accounts = mp.accounts; 
			for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
				Account acc = (Account)iterator.next();
				logger.info("Customer Name: " + acc.name);
				logger.info("Customer URI: " + acc.uri);	        	        
		        if(acc.email_address.equals(email)) cust = Account.get(acc.uri);	        	        
		    }
			logger.info("Customer: " + cust.name);
			
			//** retreive bank accounts (only one account allowed for now)
			BankAccount ba=null;
			BankAccount.Collection bankaccounts = cust.bank_accounts; //mp.bank_accounts;// mp.accounts; 
			for (Iterator<BankAccount> iterator = bankaccounts.iterator(); iterator.hasNext();) {
				BankAccount bankacc = (BankAccount)iterator.next();			
		        if(bankacc.customer!=null) {
		        	out.println("<p>Bank Acc Name: " + bankacc.name);
		        	out.println("<p>Bank Acc URI: " + bankacc.uri);	        	        
			        ba = BankAccount.get(bankacc.uri);
		        }	        	        	       
		    }
			out.println("<p><b>Bank Account:</b>" + ba.account_number);			
			
			//** verify ACH
			BankAccountVerification verification = ba.getVerification();
			if(verification!=null){
				if(verification.state.equals("pending")){
					verification.confirm(Integer.parseInt(request.getParameter("ach_amt1")), Integer.parseInt(request.getParameter("ach_amt2")));
					//verification.save();	//throws an error. dont need this
				}
				out.println("<p><b>Bank Account Verification State:</b>" + verification.state);			
			}
			
		}else if(action.equals("transact")){
			
			//** retreive merchant accounts
			Account invest=null, comp=null;
			Account.Collection accounts =  mp.accounts; 
			for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
				Account acc = (Account)iterator.next();
		        out.println("<p>" + acc.name);
		        out.println("<p>" + acc.uri);	        
		        if(acc.email_address.equals(request.getParameter("email_inv"))) invest = Account.get(acc.uri);
		        if(acc.email_address.equals(request.getParameter("email_comp"))) comp = Account.get(acc.uri);	        	        
		    }
			out.println(invest);
			out.println(comp);
					
			int amt = Integer.parseInt(request.getParameter("tran_amt"));		
			int com = amt/10;
			int deb = (amt*90)/100;
			logger.info("Investment Amount: " + amt + " Commision: " + com + " Debit:" + deb);		
			
			//** transact
			invest.debit(amt*100,"Invested $" + amt + " into " + comp.name,null,null,null);
			mp.owner_account.credit(com*100, "Commission of $" + com + " received from investor " + invest.name + " and company " + comp.name);
			comp.credit(deb*100, "Raised $" + deb + " from " + invest.name);
					
		}else if(action.equals("list")){
			
			//** retreive customer by email
			Account cust=null;
			Account.Collection accounts = mp.accounts; 
			for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
				Account acc = (Account)iterator.next();
		        logger.info("Customer Name: " + acc.name);
		        logger.info("Customer URI: " + acc.uri);	        	        
		        if(acc.email_address.equals(email)) cust = Account.get(acc.uri);	        	        
		    }
			if(cust!=null){
				out.println("<p><b>Customer: </b>" + cust.name + "<button class='btn btn-danger pull-right' id='btn_acc_del'>Delete Account</button>");
				%>
				<script>
				$('#btn_acc_del').click(function(){
					alert('are you sure?');						
					loaderOn();
					$.get('jsp/balancedacc.jsp?action=delete&t=' + Math.random(),function(data,status){
						alert(data);
						appalert(data,status);
						loaderOff();
					});				
				});
				</script>
				<%
				
				//** retreive bank accounts (only one account allowed for now)
				BankAccount ba=null;
				BankAccount.Collection bankaccounts = cust.bank_accounts; //mp.bank_accounts;// mp.accounts; 
				for (Iterator<BankAccount> iterator = bankaccounts.iterator(); iterator.hasNext();) {
					BankAccount bankacc = (BankAccount)iterator.next();			
			        if(bankacc.customer!=null) {
			        	logger.info("Bank Acc Name: " + bankacc.name);
			        	logger.info("Bank Acc URI: " + bankacc.uri);	        	        
				        ba = BankAccount.get(bankacc.uri);
			        }	        	        	       
			    }
				if(ba!=null){
					out.println("<p><b>Bank Name:</b> " + maskNullStr(ba.bank_name));	
					out.println("<p><b>Account Name:</b> " + maskNullStr(ba.name));
					out.println("<p><b>Account Type:</b> " + maskNullStr(ba.type));
					out.println("<p><b>Account Number:</b> " + ba.account_number);
					out.println("<p><b>Routing Number:</b> " + ba.routing_number);
					session.setAttribute("bank_account", ba);
				
					BankAccountVerification verification = ba.getVerification();
					if(verification==null){
						out.println("<p><b>ACH Verification Status: </b>Awaiting ACH deposits!");
					}else{
						out.println("<p><b>ACH Verification Status: </b>" + verification.state);
						if(verification.state.equals("pending")){
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
									$.get('jsp/balancedacc.jsp?action=verify&t=' + Math.random() + '&' + $('#frm_ach').serialize(),function(data,status){
										alert(data);
										appalert(data,status);
										loaderOff();
									});
								}
							});
							</script>
							
							<%
						}
					}
				}
			}else{
				logger.info("No existing merchant. Creating new one.");
				out.println("No existing merchant. Creating new one.");
			}
		}else if(action.equals("delete")){
			
			BankAccount bacc = (BankAccount)session.getAttribute("bank_account");
			logger.info("deleting account: " + bacc);
			bacc.unstore();
			//bacc.save();
			//bacc.delete();
			out.println("Account deleted!");
		}	
	}//end rs
	
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