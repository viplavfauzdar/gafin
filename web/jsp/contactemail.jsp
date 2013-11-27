<%@include file="logging.jsp"%>
<%@page import="com.gafinance.utils.SendMail"%>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String message = request.getParameter("message");
logger.info(name + "," + email +  "," + message);

SendMail s = new SendMail();
s.Send(getServletContext().getInitParameter("WEBSITE_EMAIL"), getServletContext().getInitParameter("WEBSITE_EMAIL_PASS"), getServletContext().getInitParameter("WEBSITE_EMAIL"), email, "Inquiry email from finance georgia website!", "<b>Email message from:</b>" + name + "<p><b>Message:</b>" + message);
out.println("Message sent!");
%>