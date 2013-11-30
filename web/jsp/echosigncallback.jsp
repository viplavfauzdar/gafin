
<%@include file="db.jsp"%>
<%@page import="com.gafinance.utils.EchoSign"%>
<%
logger.info(request.getQueryString());
String documentKey = request.getParameter("documentKey");
String widgetKey = request.getParameter("widgetKey");
logger.info("Echosign Callback: (documentKey, widgetKey): " + documentKey + " , " + widgetKey);

if(widgetKey==null) widgetKey = documentKey; //** happens when emails sent for 2 signature.

//** get document info from table
try{
	String qry = "select user_id, document from documents where document_key = ?";
	logger.info(qry);
	PreparedStatement pstmt = con.prepareStatement(qry);
	pstmt.setString(1, widgetKey);			
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {		
		EchoSign es = new EchoSign(getServletContext().getInitParameter("ECHOSIGN_URL"),
				getServletContext().getInitParameter("ECHOSIGN_APIKEY"), "",
				getServletContext().getInitParameter("PATH") + "/data/" + rs.getString(1) + "/" + rs.getString(2), "");
		String returnfilename = es.getDocuments(documentKey);
		if(returnfilename!=null){
                        out.println("success!");
                        PreparedStatement pstmt1 = con.prepareStatement("update documents set downloaded_document=? where user_id=? and document_key = ?");
			pstmt1.setString(1, returnfilename);
			pstmt1.setString(2, rs.getString(1));
			pstmt1.setString(3, widgetKey);
			int res = pstmt1.executeUpdate();
			if(res>0) 
				logger.info("Successfully updated downloaded doc info!");
			else
				throw new Exception("Error updating downloaded doc info!");
		}
	}
} catch (Exception ex) {			
	logger.severe("Error: " + ex);
	throw new Exception(ex);
} finally {
	try {
		if (con != null) {
			con.close();
		}			
	} catch (Exception ex) {
		logger.severe("Error closing db connetion: " + ex);
		throw new Exception(ex);
	}
}
%>