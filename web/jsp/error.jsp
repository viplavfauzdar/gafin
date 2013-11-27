<%@page isErrorPage = "true"%>
<%//@include file="logging.jsp"%> 
  <%
  java.util.logging.Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());
  	if(exception!=null){ 
  		out.println(exception);
  		logger.severe(exception.getMessage());
  		exception.printStackTrace();
  	}else{%>
  		<!DOCTYPE html>
		<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
		<script src="../js/jquery.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<body>
		<div id="alert_error" class="alert alert-danger" style="position:fixed;z-index:50000; top:20px;right:20px;"> 
		  <!-- <button type="button" class="close" data-dismiss="alert">×</button> removes it deo DOM  -->  	
		  <strong>Server Error:</strong><%
	  		out.println(request.getParameter("error"));
  			logger.severe("Error as param: "+request.getParameter("error")); %>
  		</div>
		<script>
			$("#alert_error").delay(200).addClass("in").fadeOut(8000);
		</script>
		</body>
  <%			
  	}
  %>
