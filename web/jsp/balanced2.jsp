<%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<%@page import="com.balancedpayments.*"%>
<%@page import="com.balancedpayments.core.*"%>
<%@page import="com.balancedpayments.errors.*"%>
<%@page import="java.util.*"%>

<%
	Settings.configure("74e10d3e0c3b11e3aae6026ba7cd33d0");
	out.println("<p>My Marketplace");
	Marketplace mp = Marketplace.mine();
	out.println("<p>Who am I? -> " + Merchant.me().name + " -> "
			+ Merchant.me().uri);
	out.println("<p>Whats my marketplace? -> " + mp.name + " -> "
			+ mp.uri);	

	if (request.getParameter("action") == null) {

		//** Business bank account
		Map<String, Object> identity = new HashMap<String, Object>();
		identity.put("type", "person");
		identity.put("name", "Jane Doe");
		identity.put("street_address", "801 High St");
		identity.put("postal_code", "94301");
		identity.put("country_code", "USA");
		identity.put("dob", "1979-02");
		identity.put("phone_number", "+16505551234");

		BankAccount bank_account = mp.tokenizeBankAccount(
				"Jack Q Company", "125125125", "1125125125",
				BankAccount.Checking);

		Account company = mp
				.createMerchantAccount("Jane D Company",
						"company@example.org", bank_account.uri,
						identity, null);
		out.println("<p>Our **Company** account is -> " + company.uri);

		//** Investor bank account
		Map<String, Object> identity2 = new HashMap<String, Object>();
		identity2.put("type", "person");
		identity2.put("name", "John Doe");
		identity2.put("street_address", "123 Elm St");
		identity2.put("postal_code", "30030");
		identity2.put("country_code", "USA");
		identity2.put("dob", "1976-06");
		identity2.put("phone_number", "+16782211212");

		BankAccount bank_account2 = mp.tokenizeBankAccount(
				"John D Investor", "123123123", "123123123",
				BankAccount.Checking);

		Account investor = mp.createMerchantAccount("Jack Q Company",
				"investor@example.org", bank_account2.uri, identity2,
				null);
		out.println("<p>Our **Investor** account is -> "
				+ investor.uri);
	} else {
		
		//** retreive accounts
		Account invest=null, comp=null;
		Account.Collection accounts =  mp.accounts; 
		for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
			Account acc = (Account)iterator.next();
	        out.println("<p>" + acc.name);
	        out.println("<p>" + acc.uri);	        
	        if(acc.email_address.equals("investor@example.org")) invest = Account.get(acc.uri);
	        if(acc.email_address.equals("company@example.org")) comp = Account.get(acc.uri);	        	        
	    }
		out.println(invest);
		out.println(comp);
				
		//** transact
		//invest = Account.get("/v1/marketplaces/TEST-MP3yOpW27ObBjMoGVbRyVyhO/accounts/AC2bYVUALyRpVOubDPcL4Yum");
		invest.debit(10000,"Buying 100 shares!",null,null,null);
		mp.owner_account.credit(1000, "Commission 10 percent");
		//comp = Account.get("/v1/marketplaces/TEST-MP3yOpW27ObBjMoGVbRyVyhO/accounts/AC1Qh4ICxjfHReHPDtZ4Dg9W");
		comp.credit(9000, "Selling 100 shares!");
		
	}
%>

