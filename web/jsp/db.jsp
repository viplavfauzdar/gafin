<%@page import="java.sql.*"%>
<%@include file="logging.jsp"%>
<%
Connection con = null;
try {
	//Tomcat DBCP
	javax.naming.Context initContext = new javax.naming.InitialContext();
	javax.naming.Context envContext = (javax.naming.Context)initContext.lookup("java:/comp/env");
	javax.sql.DataSource dataSource = (javax.sql.DataSource)envContext.lookup("jdbc/MysqlDS");
	con = dataSource.getConnection();		
} catch (Exception e) {	
	logger.severe(e.getMessage());
	throw new Exception(e);
}
%>
