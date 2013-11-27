<%@include file="logging.jsp"%>
<%
if(session!=null) {
	logger.info("Current session ID: " + session.getId());
	session.invalidate();
	session = request.getSession(false);
	session = null;
}
logger.info("session: " + session);
//response.sendRedirect("../index.html");//?t=" + (new java.util.Date()).getTime()); //doesnt' redirect
//request.getRequestDispatcher("../index.html").forward(request, response); //thorws response committed exception
%>