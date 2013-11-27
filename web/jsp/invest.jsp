<%@include file="db.jsp"%>
<%	
	String userid = (String)session.getAttribute("userid");//.getParameter("userid"); //get from session
	String projectid = request.getParameter("projectid"); //get from project page
	String amount = request.getParameter("amount"); //get from project page
	try {		
		java.sql.Statement smt = con.createStatement();		
		String qry = "insert into investment(user_id, project_id, amount) values(?, ?, ?)";
		logger.info(qry);
		PreparedStatement pstmt = con.prepareStatement(qry,PreparedStatement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, userid);
		pstmt.setString(2, projectid);
		pstmt.setString(3, amount);		
		pstmt.executeUpdate();
		ResultSet rs1 = pstmt.getGeneratedKeys();
		if (rs1.next()) {						
			out.println("You have successfully invested $" + amount);// + 
			logger.info("Generated pkey: " + rs1.getString(1));
		} else {
			out.println("Investment failed!");			
		}
	} catch (Exception e) {		
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