
<%@page import="com.gafinance.utils.EchoSign"%>
<%@page import="echosign.api.dto16.DocumentKey"%>
<%@include file="db.jsp"%>
<%
	//java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());
	String signtype = request.getParameter("signtype");
	String email1 = request.getParameter("email1");
	String email2 = request.getParameter("email2");
	//String userid =  request.getParameter("userid");
	String userid =  (String)session.getAttribute("userid");
	String projectid =  request.getParameter("projectid");
	//** check if user folder exists. if not create it
	//try{
		java.io.File file = new java.io.File(getServletContext().getInitParameter("PATH") 	+ "/data/" +userid);
		if(!file.exists()) file.mkdir();
	//}catch(Exception e){
	//	throw new Exception(e);
	//}
	String doc = null;
	//if(signtype.matches("one"))
		doc = request.getParameter("doc");//getServletContext().getInitParameter("ECHOSIGN_DOC1");
	//else
	//	doc = getServletContext().getInitParameter("ECHOSIGN_DOC2");
	
	EchoSign es = new EchoSign(
			getServletContext().getInitParameter("ECHOSIGN_URL"),
			getServletContext().getInitParameter("ECHOSIGN_APIKEY"), getServletContext().getInitParameter("PATH") + doc,
			 "", getServletContext().getInitParameter("ECHOSIGN_CALLBACKURL")); //** dest file not needed because of callback url
	
	//Long.parseLong(getServletContext().getInitParameter("ECHOSIGN_POLLFREQ")));
	String dockey=null;
	if(signtype.matches("one")){
		//logger.info("EchoSign Creating Widget...");
		//es.createWidget(); 		
		//out.println(es.getJS());
		//dockey = es.getDocumentKey();
		//logger.info("EchoSign decoded doc key: " + dockey);//javax.mail.internet.MimeUtility.decodeText(dockey));
		//out.println(es.getDocumentURL(javax.mail.internet.MimeUtility.decodeText(dockey)));
		/*
		* https://secure.echosign.com/public/embedesignhtml?rdid=68RNJPJ3DY6A7H - URL hacked via created widget
		* https://secure.echosign.com/public/hostedForm?formid=68RNJPJ3DY6A7H - URL returned by create URL but hangs and has adobe headers/footers
		*/
		String url = es.createPersonalUrl(email1); //don't want sign confirm
		dockey = es.getDocumentKey();
		session.setAttribute("echosign_dockey",dockey);
		logger.info(url);
		url = url.replace("hostedForm?formid=", "embedesignhtml?rdid=");
		logger.info(url);
		out.println(url);
	}else{
		logger.info("EchoSign Sending Document to: " + email1 + ", " + email2);
		DocumentKey[] dc = es.sendDocument(email1,email2);//"vauzr2450@gmail.com","ummagumma2450@gmail.com");
		logger.info("EchoSign DocumentKey Array length: " + dc.length);
		logger.info("EchoSign Email1:" + dc[0].getRecipientEmail());
		dockey = dc[0].getDocumentKey();
		logger.info("EchoSign Document1:" + dockey);
		String signurl = es.getSigningURL(dockey); //** use thread to track the second signer by calling this again after 1st signs
		logger.info("Signing URL: " +signurl);
		out.println(signurl);		
		//out.println("<h3>Document sent for signatures to " + email1 + " and " + email2);
	}
	//es.personalize("vauzr2450@gmail.com");
	//out.println(es.getJS());
	//es.personalize("ummagumma2450@gmail.com");
	//out.println(es.getJS());
	
	
	
	//out.println(dc[0].getRecipientEmail());
	//out.println(dc[0].getDocumentKey());
	//out.println(dc[1].getRecipientEmail());
	//out.println(dc[1].getDocumentKey());
	
	//** write the document info to table to track for call back
	try{
		String qry = "insert into documents(user_id, project_id, document_key, document) values(?, ?, ?, ?)";
		logger.info(qry);
		PreparedStatement pstmt = con.prepareStatement(qry);
		pstmt.setString(1, userid);
		pstmt.setString(2, projectid);
		pstmt.setString(3, dockey);
		pstmt.setString(4, doc);
		int rs = pstmt.executeUpdate();
		if(rs>0) logger.info("Successfully inserted document info!");
	} catch (Exception e) {
		//out.println(e);
		logger.severe("Error: " + e);
		throw new Exception(e);
	} finally {
		try {
			if (con != null) {
				con.close();
			}			
		} catch (Exception e) {
		}
	}

%>