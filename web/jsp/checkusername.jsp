<%@include file="db.jsp"%>
<%
	String username = request.getParameter("username");		
	try {		
		java.sql.Statement smt = con.createStatement();		
		String qry = "select id from user where username = ?";
		logger.info(qry);
		PreparedStatement pstmt = con.prepareStatement(qry);
		pstmt.setString(1, username);		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {			
			out.println("Username " + username + " taken. Please select another one!");
			logger.info("Username " + username + " taken. Please select another one!");
		} else {
			out.println("Username " + username + " available!");
			logger.info("Username " + username + " available!");
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