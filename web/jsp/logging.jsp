<%@page trimDirectiveWhitespaces="true"%>
<%@ page errorPage="error.jsp" %>
<%@page import="java.util.logging.*"%>
<%
Logger logger = Logger.getLogger(this.getClass().getName()); // Using JULI instead!
session.setAttribute("logger",logger);
%>
<%!
public String maskNullStr(String str){
	if(str==null) str = "";
	return str;
}%>