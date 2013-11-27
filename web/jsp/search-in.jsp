<!DOCTYPE html>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>

<div class='container'>
	<div class='row'>
		<div class='span12 well form-horizontal'>
			<Strong>Search Type </Strong><select id="table">
				<option value="user">User Info</option>
				<option value="project">Project Info</option>
				<option value="location">Location Info</option>
			</select>
			<%@include file="db.jsp"%>
			<%
				try {														
					
					logger.info("Source database connection established!");
					java.sql.Statement smt = con.createStatement();
					String qry = "select * from user limit 1";						
					logger.info(qry);
					ResultSet rs = smt.executeQuery(qry);
					ResultSetMetaData rsmd = rs.getMetaData();
					int cols = rsmd.getColumnCount();					
					String output="";						
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
						output = output + "<option value='" + field + "' id='" + field + "'>" + placeholder + "</option>";						
					}										
					out.println("<Strong>Search Fields </Strong><select id='sel' class='input-medium'>" + output + "</select>");					
					
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
			<button class='btn btn-primary' id='btn_add' data-toggle="tooltip" data-placement="bottom" title="Click to add search criteria!">+</button>
			<button class='btn btn-danger' id='btn_exec' data-toggle="tooltip" data-placement="bottom" title="Click to search!">Execute</button>
			<button class='btn' id='btn_clr'>Clear</button>
		</div>
	</div>
	<div id='params' class='row'></div>
	<div id='srch_results'></div>
</div>

<script>
	$("[data-toggle=tooltip]").tooltip();

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
			if($(this).val()!="")
				qrystr = qrystr + $(this).attr('id') + '=' + $(this).val() + '&';
		});		
		//alert(qrystr);
		//$('#results').load('test1.jsp',qrystr);
		$.get("search-out.jsp?" + qrystr,function(data,status){
			$('#srch_results').html(data);
			//alert(data);
		});		
	});	

	$("#btn_clr").click(function() {
		$('#params').html('');
	});	
</script>
