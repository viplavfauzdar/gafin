<%@ page errorPage="error.jsp" %>
<%
//not used. sing save.jsp instead
String uri="http://24.126.149.255/wordpress/vip-add-user.php?username=" + request.getParameter("username") + "&password1=" + request.getParameter("password1") + "&email=" + request.getParameter("email");
out.println(uri);
java.net.URL url = new java.net.URL(uri);
out.println(url.openConnection().getContent());
%>