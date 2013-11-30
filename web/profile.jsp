
<div class="container">
<ul class="breadcrumb">
	<li><a href="index.html">Home</a> <span class="divider">/</span></li>
	<li class="active">Profile</li>
</ul>	
<h2 style="text-align: center">Profile</h2>
<div class="row">

<div class="tabbable span12">
	<ul class="nav nav-tabs">
 		<li class="active" style='width:50%'><a href="#tab1" data-toggle="tab">Profile</a></li>
 		<li style='width:50%'><a href="#tab2" data-toggle="tab">News & Updates</a></li>
	</ul>
	
			
		<%@include file="jsp/db.jsp"%>
		<%
			//response.addHeader("X-Frame-Options:", "ALLOW-FROM https://www.youtube.com");
			//response.addHeader("Access-Control-Allow-Origin:", "*");
			String username=null;
			String id = request.getParameter("id");
			int id1 = 1;
			if (id != null)
				id1 = Integer.parseInt(id);
			try {
				logger.info("ID:" + id);
				java.sql.Statement smt = con.createStatement();
				//String qry = "select u.username, u.first_name, u.last_name, u.mi, u.description, u.email, case when u.investor_type='A' then 'Accredited' else 'Un-Accredited' end invtype, l.zip, l.website, l.facebook, l.google_plus, l.twitter, l.linkedin, " 
				//		+ "i.project_id, (select project_name from project p where p.id = i.project_id) projectname, sum(ifnull(i.amount,0)+ifnull(i.commission,0)) investment " 
				//		+ "from user u inner join location l on u.id = l.user_id left outer join investment i on u.id = i.user_id where u.id=? group by i.project_id";
				String qry = "select u.username, u.first_name, u.last_name, u.mi, u.about_me, u.email, case when u.investor_type='A' then 'Accredited' else 'Un-Accredited' end invtype, l.zip, l.website, " 
						+ "l.facebook, l.google_plus, l.twitter, l.linkedin, sum(ifnull(i.amount,0)+ifnull(i.commission,0)) investment " 
						+ "from user u inner join location l on u.id = l.user_id left outer join investment i on u.id = i.user_id where u.id=?";
				logger.info(qry);
				PreparedStatement pstmt = con.prepareStatement(qry);
				pstmt.setInt(1, id1);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					/*int trg = rs.getInt(6);
					int rsd = rs.getInt(7);
					int prcnt = 0;
					if (trg != 0)
						prcnt = 100 * rsd / trg;
					String desc = rs.getString(3);
					if (desc != null){
						desc = desc.replace("\n\n", "<br>");
						desc = desc.replace("\n", "<br>");
					}	*/
					username = rs.getString(1);
					String fname = rs.getString(2);
					String lname = rs.getString(3);
					String mi = maskNullStr(rs.getString(4));
					String desc = maskNullStr(rs.getString(5));
					String email = rs.getString(6);
					String invtype = rs.getString(7);
					String zip = rs.getString(8);					
					String website = rs.getString(9);
					if (website == null)
						website = "#";
					String fb = rs.getString(10);
					if (fb == null)
						fb = "#";
					String gp = rs.getString(11);
					if (gp == null)
						gp = "#";
					String tw = rs.getString(12);
					if (tw == null)
						tw = "#";
					String ln = rs.getString(13);
					if (ln == null)
						ln = "#";
					int invt = rs.getInt(14);
					//String projectemail = rs.getString(14);
					//username = rs.getString(15);
		%>

 		
 	<div class="tab-content"><!-- style="border-left:1px solid #ddd;border-right:1px solid #ddd;border-bottom:1px solid #ddd;padding:5px">  -->  		
   		<div class="tab-pane active" id="tab1">
   		
   	<div class="row">
		<div class="span8">
			<div class="well">
				<h2><%=fname + " " + mi + " " + lname%></h2>
				<img src="data/<%=id%>/profilepic.jpg"
					alt="project picture" class="img-rounded" style='height:350px;width:580px;'/>				
				<h4 class="text-info">About Me</h4>
				<h5><%=desc%></h5>
				<h4 class="text-info">About Myself</h4>
				<h5>Investment: $<strong class="num"><%=invt%></strong>
				<h5>Investor Type: <%=invtype%>
				<h5>Email: <%=email%>				
				<h5>Zip: <%=zip%>								
			</div>
		</div>

		<div class="span4">
			<div class="well">				
					
					<!-- SOCIAL -->
					<div class='well'>
					<label class="label label-inverse">					
					<a href="<%=website%>" target="_new">WWW</a>
					</label>					
						<a href="<%=fb%>" target="_new"><img src="img/icon_header_face.png"></a>
						<a href="<%=gp%>" target="_new"><img src="img/icon_header_g.png"></a> 
						<a href="<%=tw%>" target="_new"><img src="img/icon_header_tw.png"></a> 
						<a href="<%=ln%>" target="_new"><img src="img/icon_header_in.png"></a>					
					</div>	
				
					<!-- INVESTORS -->
					<h3 class='text-warning'>Investments</h3>
					<div class='well'>									
					<table width="100%">
					<%
					//** show investors
					String qry2 = "select p.user_id, p.project_name, sum(ifnull(i.amount,0)+ifnull(i.commission,0)) from project p inner join investment i on p.id = i.project_id and i.user_id = ? group by p.id, p.project_name";
					logger.info(qry2);
					PreparedStatement pstmt2 = con.prepareStatement(qry2);
					pstmt2.setInt(1, id1);
					ResultSet rs2 = pstmt2.executeQuery();
					int ivtrow=0;
					while (rs2.next()) {
						if(ivtrow/2.0==ivtrow/2) out.println("<tr>");
					%>
						<td align="center"><img src="data/<%=rs2.getString(1)%>/projectpic.jpg"  alt="project picture" class="img-rounded" style='height:100px;width:100px;'/>
						<br><label class="label label-info"><%=rs2.getString(2)%></label>
						<br><label class="label label-important">$<span class="num"><%=rs2.getString(3)%></span></label>
					<%ivtrow++;}	%>
					</table>
					</div>
					
				</div>
					
			</div>

<style>
	.num {}
</style>
<script>
$(document).ready(function() {

	$('.num').number(true, 0);
	
	//** incase of missing pics or pics that didn't load
	$("img").error(function () {
		$(this).unbind("error").attr("src", "img/placeholder.jpg");
	});
	
	var userid=<%=session.getAttribute("userid")%>;
	var roleid=<%=session.getAttribute("roleid")%>;
	
	$('.num').number(true, 0);
		
	

});
</script>

			<%
}//** end rs if
} catch (Exception e) {	
	logger.severe("Error: " + e);
	throw new Exception(e);
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
</div>
	
<div class="tab-pane" id="tab2">
<div class="well">
	<!-- <iframe src="http://wp-gafinance.rhcloud.com/?page_id=27" style="border:0;height:800px;width:100%;margin:0px"></iframe>  -->
	<iframe src='http://24.126.149.255/wordpress/vip-load-blog.php?username=<%=username%>' style="border:0;height:800px;width:100%;margin:0px"></iframe>
</div>
</div>
</div> <!-- /tab content -->
</div> <!-- /tababble -->
</div> <!-- /top row -->
</div> <!-- /container -->

