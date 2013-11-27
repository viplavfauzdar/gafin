<%@include file="db.jsp"%>
<%
try{
	String qry = "select downloaded_document from documents where document_key = ?";
	logger.info(qry);
	PreparedStatement pstmt = con.prepareStatement(qry);
	pstmt.setString(1,(String)session.getAttribute("echosign_dockey"));
	out.println(session.getAttribute("echosign_dockey"));
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()){
		if(rs.getString(1)!=null){
			out.println("download success " + rs.getString(1));
			session.setAttribute("echosign_dockey",null);
		}
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