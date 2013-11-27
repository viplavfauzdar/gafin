<%//@page import="org.owasp.esapi.ESAPI"%>
<%@page import="org.jsoup.Jsoup"%>
<%@ page errorPage="../jsp/error.jsp" %>
<% 
String unsafe=request.getParameter("input");
if(unsafe!=null){

	out.println("<P>unsafe: " + unsafe);

	String safe = Jsoup.clean(unsafe, org.jsoup.safety.Whitelist.none());
	out.println("<P>safe none: " + safe);

	safe = Jsoup.clean(unsafe, org.jsoup.safety.Whitelist.simpleText());
	out.println("<P>safe simple text: " + safe);

	safe = Jsoup.clean(unsafe, org.jsoup.safety.Whitelist.basic());
	out.println("<P>safe basic: " + safe);

	safe = Jsoup.clean(unsafe, org.jsoup.safety.Whitelist.relaxed());
	out.println("<P>safe relaxed: " + safe);
}

try{
	//safe = ESAPI.encoder().encodeForURL(safe);
	
}catch(Exception e){
	out.println(e);
}
%>

<form method=post>
<textarea rows=10 cols=40 name=input></textarea>
<input type=submit>
</form>


<script>function test(){ alert("hello"); }</script><input type=button onclick=test(); value=click>
