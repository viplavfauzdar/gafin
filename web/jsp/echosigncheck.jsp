<%@include file="db.jsp"%>
<%
//** diabled because of some change in the API side. document key is different from widget/form generation and callback fro echosign
//widget/form - 2AAABLblqZhBZibb9r_hmT7ZvK7x-hR2IP5K6zq9wcNvhYzu5nWvjCic30RGaGarSVh_a23eqkZo*
//callback - (documentKey, widgetKey): XA2YW4C3G682Q6X , XAXW2CP4Y6T5W74
out.println("download success"); //take this out when fixed
/*
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
*/
%>