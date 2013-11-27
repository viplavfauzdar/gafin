<%@include file="../jsp/db.jsp"%>
<%
	try {																
		
		String paramname = "", paramvalue = "", where="where", qry="", output = "";				
		for (java.util.Enumeration e = request.getParameterNames(); e
				.hasMoreElements();) {				
			paramname = (String) e.nextElement();
			if(!paramname.equals("action")){ 
				paramvalue = request.getParameter(paramname);
				where = where + " lower(" + paramname + ") like '%" + paramvalue.toLowerCase() + "%' and ";
			}	
		}					
		logger.info(where);
		
		logger.info("Source database connection established!");
		java.sql.Statement smt = con.createStatement();
		
		if(!where.equals("")) where = where.substring(0,where.length()-5);
		qry = "select id, username 'Username', case role_id when 1 then 'Project' when 2 then 'Investor' end Role, first_name 'First Name', last_name 'Last Name', email 'Email', createdate 'Created', updatedate 'Updated', case  deletedind when 1 then 'Yes' else 'No' end 'Deleted' from user " + where + " order by createdate desc";					
		logger.info(qry);
		
		ResultSet rs = smt.executeQuery(qry);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();					
								
		for (int i = 1; i < cols + 1; i++) {
			output = output + "<th>" + rsmd.getColumnLabel(i);
		}
		
		while (rs.next()) {
			output = output + "<tr>";
			for (int i = 1; i < cols + 1; i++) {
				output = output + "<td>" + maskNullStr(rs.getString(i));
			}
		}
		out.println("<table class='table table-striped table-hover'><tr>" + output + "</table>");
		
		
	} catch (Exception e) {
		out.println(e);
		logger.severe("Error: " + e);
	} finally {
		try {
			if (con != null) {
				con.close();
			}
			logger.info("Source database connection closed!");
		} catch (Exception e) {
		}
	}
%>

