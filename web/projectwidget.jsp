<div class="container">
<%if(request.getParameter("action")!=null){%>	
<ul class="breadcrumb">
	<li><a href="index.html">Home</a> <span class="divider">/</span></li>
	<li class="active">Portfolio</li>
</ul>
<%} %>
<div class="row">
<h1 style="text-align: center">Investment Portfolio</h1>
<%@include file="jsp/db.jsp"%>
<%	
	String action=maskNullStr(request.getParameter("action"));
	String id = request.getParameter("id");
	int id1 = 1;
	String qry = null;
	if(id!=null){
		id1 = Integer.parseInt(id);
		qry = "select id, project_name, summary, user_id, target_amount, (select sum(amount) from investment where project_id=p.id) raised_amount from project p where id in (" + id1 + "," + (id1+1) + "," + (id1+2) + ")  order by id desc";		
	}else if(action.equals("list")){
		qry = "select id, project_name, summary, user_id, target_amount, (select sum(amount) from investment where project_id=p.id) raised_amount from project p order by id desc limit 12";		
	}else if(action.equals("search")){
		String srch_projects=maskNullStr(request.getParameter("srch_projects"));
		qry = "select id, project_name, summary, user_id, target_amount, (select sum(amount) from investment where project_id=p.id) raised_amount from project p where upper(project_name) like '%" + srch_projects.toUpperCase() + "%'";
	}else {
		qry = "select id, project_name, summary, user_id, target_amount, (select sum(amount) from investment where project_id=p.id) raised_amount from project p order by id desc limit 3";	
	}	
	logger.info(qry);
	try {		
		java.sql.Statement smt = con.createStatement();		
		ResultSet rs = smt.executeQuery(qry);
		while (rs.next()) {
			id1 = rs.getInt(1);
			int trg = rs.getInt(5);
			int rsd = rs.getInt(6);
			int prcnt = 0;
			if(trg!=0) prcnt = 100*rsd/trg;
			String desc = rs.getString(3);
			if((desc!=null) && desc.length() > 150)
				desc = desc.substring(0,150);
%>

	<div class="span4">
		<div class="thumbnail" style="height: 450px;">
			<h3 style="text-align: center"><%=rs.getString(2)%></h3>
			<a href="#div_top" class="thumbnail"><img src="data/<%=rs.getString(4)%>/projectpic.jpg" alt="http://placehold.it/100x100" style='height:200px;width:280px' id="img_project_<%=rs.getString(4)%>" class="img-rounded"/></a>
			<div class="progress progress-info">
	  			<div class="bar" style="width:<%=prcnt%>%" ></div>
			</div>
			<strong class="text-error">Target: $<strong class="num"><%=trg%></strong></strong> <strong class="pull-right text-success"> Pledged: $<strong class="num"><%=rsd%></strong></strong>
			<div class="caption">			
				<p><%=desc%>....<a href="#" id="lnk_project_<%=rs.getString(4)%>">view details</a> <br />
			</div>
		</div>
	</div>

<script>

$("#img_project_<%=rs.getString(4)%>").click(function() {
	loaderOn();
	$.get("projectpage.jsp?id=<%=rs.getString(4)%>&t=" + Math.random(),function(data,status){
		loaderOff();
	    $("#myCarousel").hide();
		$("#row_fillers").hide();
	    $("#div_projects").html(data);		   		
	});
});

$("#lnk_project_<%=rs.getString(4)%>").click(function() {
	loaderOn();
	$.get("projectpage.jsp?id=<%=rs.getString(4)%>&t=" + Math.random(),function(data,status){
		loaderOff();
	    $("#myCarousel").hide();
		$("#row_fillers").hide();
	    $("#div_projects").html(data);		   		
	});
});

</script>

<%
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
</div>
	<div class="pagination pagination-small pull-right">
		<ul>
			<li><a id="lnk_previous" href="#div_projects">«</a></li>
			<!-- <li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>  -->
			<li><a id="lnk_next" href="#div_projects">»</a></li>
		</ul>
	</div>
</div>
<style>
	.num{}
</style>
<script>
$(document).ready(function() {

	//** incase of missing pics or pics that didn't load
	$("img").error(function () {
		$(this).unbind("error").attr("src", "img/placeholder.jpg");
	});
	
	$('.num').number(true, 0);

	$("#lnk_previous").click(function() {	
		$.get("projectwidget.jsp?id=<%=id1-3%>&t=" + Math.random(),function(data,status){		    
		    $("#div_projects").html(data);		   		
		});
	});

	$("#lnk_next").click(function() {	
		$.get("projectwidget.jsp?id=<%=id1+3%>&t=" + Math.random(),function(data,status){	
		    $("#div_projects").html(data);		   		
		});
	});
});
</script>
