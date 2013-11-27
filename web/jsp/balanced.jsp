<%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<%@page import="com.balancedpayments.*"%>
<%@page import="com.balancedpayments.core.*"%>
<%@page import="com.balancedpayments.errors.*"%>
<%@page import="java.util.*"%>

<%
try{
	Settings.configure("2a5e577c0b7711e38532026ba7cd33d0");
	
	/*java.util.Map<String, Object> payload = new java.util.HashMap<String, Object>();
	payload.put("account_number", "9900000001");
	payload.put("name", "Viplav Fauzdar");
	payload.put("routing_number", "121000358");
	payload.put("type", "checking");
	
	BankAccount bankAccount = new BankAccount(payload);*/
	//BankAccount.Collection bankAccounts = new BankAccount.Collection("/v1/bank_accounts");
	//BankAccount ba = new BankAccount("/v1/marketplaces/TEST-MP5R7eCuIyeefQCkqDeiDHpK/accounts/AC5R9jIicboIAKr1sLYU2O9G/bank_accounts");
	
	//APIKey key = new APIKey();
	//key.save();
	//out.println("<br>Our secret is -> " + key.secret);
	
	//out.println("<br>Configure with our secret");
	//Settings.configure(key.secret);

	out.println("<br>My Marketplace");
	Marketplace mp =null;//new Marketplace();  //have to restart the JVM for this new MP to work as its returning a singleton instance
	mp = Marketplace.mine(); 
	mp.save();
			
	out.println("<br>Who am I? Easy Merchant.me().uri -> " + Merchant.me().uri);
	
	out.println("<br>Whats my marketplace? Easy Marketplace.mine().uri -> " + Marketplace.mine().uri);
	
	if(request.getParameter("action")==null){						
		
		out.println("<br>My marketplace's name is: " + mp.name);
		out.println("<br>Changing it to TestFooey..");
		mp.name = "VIPLAV-MarketPlace";
		mp.save();
		out.println("<br>My marketplace's name is now: " + mp.name);
		
		out.println("<br>Cool, let's create (aka tokenize) a card!");
		Card card = mp.tokenizeCard("5105105105105100", 12, 2015);
		out.println("<br>Our card is " + card.uri);
		
		out.println("<br>Now create our **buyer** account associated with that card");
		Account buyer = mp.createBuyerAccount("buyer", "buyer1235344@example.org", card.uri, null);
		out.println("<br>Our **buyer** account is: " + buyer.uri);
		
		out.println("<br>Lets hold some moneyfrom the buyer, say $15");
		Hold hold = buyer.hold(1500);
		
		out.println("And now capture that money\n");
		Debit debit = hold.capture();
		out.println("<br>Which gives us this debit -> " + debit.uri);
		
		mp.refresh();
		out.println("<br>Sweet, now we have this much in escrow -> " + mp.in_escrow);
		
		out.println("<br>But lets refund the full amount");
		Refund refund = debit.refund();
		
		mp.refresh();
		out.println("<br>So now we have this much in escrow -> " + mp.in_escrow);
		
		out.println("<br>That was the buyer, now lets add a **merchant** account");
		
		Map<String, Object> identity = new HashMap<String, Object>();
		identity.put("type", "person");
		identity.put("name", "Billy Jones");
		identity.put("street_address", "801 High St");
		identity.put("postal_code", "94301");
		identity.put("country_code", "USA");
		identity.put("dob", "1979-02");
		identity.put("phone_number", "+16505551234");
		
		BankAccount bank_account = mp.tokenizeBankAccount(
		        "Jack Q Merchant",
		        "123123123",
		        "123123123",
		        BankAccount.Checking);
		
		Account merchant = mp.createMerchantAccount(
		        "Jack Q Merchant",
		        "merchant23345@example.org",
		        bank_account.uri,
		        identity,
		        null);
		out.println("<br>Our **merchant** account is -> " + merchant.uri);
		
		out.println("<br>Our **buyer** wants to purchase something from our **merchant** for $130");
		debit = buyer.debit(13000, "TestFooey.COM");
		
		out.println("<br>Lets credit the **merchant** $110 of that $130");
		Credit credit = merchant.credit(11000, "Purchase on TestFooey");
		
		out.println("<br>We are the marketplace and charge 15%%, so we just earned $20!");
		mp.owner_account.credit(2000, "Commission for TestFooey");
		
		out.println("<br>Now the **buyer** wants to deactivate their card.");
		card.is_valid = false; //invalidate();//throws runtime error
		card.save();
		
		out.println("<br>Hey I stored the URI, how can I get the object?");
		out.println(Account.get(buyer.uri));	
		out.println(Credit.get(credit.uri));	
		out.println(Debit.get(debit.uri));
		
		out.println("<br>And there you have it :)");
		
	}else{
		Account merchant1 = Account.get("/v1/marketplaces/TEST-MP1iadkTXqzQZW7JTHNr4iEO/accounts/AC2TmhO2nPI3Oe9caU1qeKZo");
		merchant1.debit(1000);
		mp.owner_account.credit(1000, "My commision");		
		
	}
	
	
}catch(Exception e){
	e.printStackTrace();
}
%>