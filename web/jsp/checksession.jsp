<%@include file="logging.jsp"%>
<%
//return the session id. on client side compare to the logged in session in cookie. if different then logout
logger.info("Checcking session: " + session.getId());
out.println(session.getId());
%>