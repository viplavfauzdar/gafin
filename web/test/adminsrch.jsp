<!DOCTYPE html>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>

<div class='container'>
	<div class='row'>
		<div class='span12 well form-horizontal'>

			<%@include file="../jsp/db.jsp"%>
			<%
				try {					
					
					String action = request.getParameter("action");					
					
					String paramname = "", paramvalue = "", where="", qry="", output = "";				
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
					if(action==null){
						qry = "select * from user limit 1";
					}else{
						where = where.substring(0,where.length()-5);
						qry = "select * from user where " + where;
					}	
					logger.info(qry);
					ResultSet rs = smt.executeQuery(qry);
					ResultSetMetaData rsmd = rs.getMetaData();
					int cols = rsmd.getColumnCount();					
											
					for (int i = 1; i < cols + 1; i++) {
						String field = rsmd.getColumnLabel(i);
						String placeholder = "";
						if (field.indexOf("_") != -1) {
							String field1 = "", field2 = "";
							field1 = field.substring(0, field.indexOf("_"));
							field2 = field.substring(field.indexOf("_") + 1,
									field.length());
							field1 = field1.substring(0, 1).toUpperCase()
									+ field1.substring(1, field1.length());
							field2 = field2.substring(0, 1).toUpperCase()
									+ field2.substring(1, field2.length());
							placeholder = field1 + " " + field2;
						} else {
							placeholder = field.substring(0, 1).toUpperCase()
									+ field.substring(1, field.length());
						}
						if(action==null)
							output = output + "<option value='" + field + "' id='" + field + "'>" + placeholder + "</option>";
						else
							output = output + "<th>" + placeholder;
					}
					
					if(action==null){
						out.println("<select id='sel' class='input-medium'>" + output + "</select>");
					}else{
						while (rs.next()) {
							output = output + "<tr>";
							for (int i = 1; i < cols + 1; i++) {
								output = output + "<td>" + maskNullStr(rs.getString(i));
							}
						}
						out.println("<table class='table table-striped table-hover'><tr>" + output + "</table>");
					}
					
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
			<button class='btn btn-primary' id='btn_add'>+</button>
			<button class='btn btn-danger' id='btn_exec'>Execute</button>
		</div>
	</div>
	<div id='params' class='row'></div>
	<div id='srch_results' class='row'></div>
</div>

<script>
	
	var $inputs;
	$("#btn_add").click(function() {
		var opt = $('#sel').val();
		//alert(opt);
		if(opt!=null){
			$('#params').append("<div class='span3'><strong>" + $('#' + opt).text() + "</strong><input type=text id=" + opt + "></div>");						
			$('#' + opt).remove();
			$inputs = $('#params :input');
		}
	});

	$("#btn_exec").click(function() {
		var qrystr="";
		$inputs.each(function() {
			qrystr = qrystr + $(this).attr('id') + '=' + $(this).val() + '&';
		});		
		alert(qrystr);
		//$('#results').load('test1.jsp',qrystr);
		$.get("test1.jsp?action=execute&" + qrystr,function(data,status){
			$('#srch_results').html(data);
			//alert(data);
		});
	});		
</script>
