
<div class="container">
<ul class="breadcrumb">
	<li><a href="index.html">Home</a> <span class="divider">/</span></li>
	<li class="active">Business</li>
</ul>	
<h2 style="text-align: center">Business</h2>
<div class="row">

<div class="tabbable span12">
	<ul class="nav nav-tabs">
 		<li class="active" style='width:50%'><a href="#tab1" data-toggle="tab">Profile</a></li>
 		<!--<li style='width:50%'><a href="#tab2" data-toggle="tab">News & Updates</a></li>-->
	</ul>
	
			
		<%@include file="jsp/db.jsp"%>
		<%
			//response.addHeader("X-Frame-Options:", "ALLOW-FROM https://www.youtube.com");
			//response.addHeader("Access-Control-Allow-Origin:", "*");
			String username=null, commission = null;
			String id = request.getParameter("id");
			int id1 = 1;
			if (id != null)
				id1 = Integer.parseInt(id);
			try {
				logger.info("Source database connection established!");
				java.sql.Statement smt = con.createStatement();
				String qry = "select p.id, project_name, description, video_url, p.user_id, target_amount, sum(i.amount) raised_amount, l.website, summary, l.facebook, l.google_plus, " 
						+ "l.twitter, l.linkedin, (select email from user where id=p.user_id) projectemail, (select username from user where id=p.user_id) username, p.commission from project p inner join location l on p.user_id = l.user_id left outer join investment i "
						+ "on p.id = i.project_id where p.user_id = ? group by p.id,l.id";
				logger.info(qry);
				PreparedStatement pstmt = con.prepareStatement(qry);
				pstmt.setInt(1, id1);
				ResultSet rs = pstmt.executeQuery();
				//ResultSet rs = smt.executeQuery(qry);
				if (rs.next()) {
					int trg = rs.getInt(6);
					int rsd = rs.getInt(7);
					int prcnt = 0;
					if (trg != 0)
						prcnt = 100 * rsd / trg;
					String desc = rs.getString(3);
					if (desc != null){
						desc = desc.replace("\n\n", "<br>");
						desc = desc.replace("\n", "<br>");
					}
					//if((desc!=null) && desc.length() > 150)
					//	desc = desc.substring(0,150);
					String url = rs.getString(4);
					String website = rs.getString(8);
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
					String projectemail = rs.getString(14);
					username = rs.getString(15);
					commission = rs.getString(16);
		%>

 		
 	<div class="tab-content"><!-- style="border-left:1px solid #ddd;border-right:1px solid #ddd;border-bottom:1px solid #ddd;padding:5px">  -->  		
   		<div class="tab-pane active" id="tab1">
   		
   	<div class="row">
		<div class="span8">
			<div class="well">
				<h2><%=rs.getString(2)%></h2>
				<img src="data/<%=rs.getString(5)%>/projectpic.jpg"
					alt="project picture" class="img-rounded" style='height:350px;width:580px;'/>
				<h3>Summary</h3>
				<p><%=rs.getString(9)%>
				<h3>Description</h3>
				<p><%=desc%>               
				<%	
				//String requestURL = request.getRequestURL();
				//String servletPath = request.getServletPath();
				//log.info("LOCALHOST: " + requestURL + servletPath);
				if (url != null) {	%>				
				<h3>Video</h3> 
				<!--<video id="frm_video" width="580" height="350" controls>
					  <source src="data/1/video.mov" type='video/mp4'>					  
				</video>-->
				<iframe src="<%=url%>" width="580" height="350" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe> 
				<!--<iframe id="frm_video" src="http://vimeo.com/79577522" style="border: 0px; width: 580px; height: 350px" allowfullscreen allowscriptaccess></iframe>-->
				<!--<embed scr="data/<%=rs.getString(5)%>/<%=url%>"></embed>-->
				<!--<iframe id="frm_video" src="data/<%=rs.getString(5)%>/<%=url%>" style="border: 0px; width: 580px; height: 350px" allowfullscreen allowscriptaccess></iframe>-->
					<!-- VIMEO: <iframe src="//player.vimeo.com/video/72625185?title=0&amp;byline=0&amp;color=ffffff" width="500" height="209" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe> <p><a href="http://vimeo.com/72625185">Le Castle Vania - Prophication (2013)</a> from <a href="http://vimeo.com/evanviera">Evan Viera</a> on <a href="https://vimeo.com">Vimeo</a>.</p>
					YOUTUBE: <iframe width="560px" height="315px" src="//www.youtube.com/embed/3AETf3s4Afg" frameborder="0" allowfullscreen></iframe> 
					<p>YT API: <iframe id="player" type="text/html" width="640" height="390"  src="https://www.youtube.com/embed/A2MBnAMLzdo?enablejsapi=1&origin=https://24.126.149.255" frameborder="0"></iframe>  -->				
				<%}	%>				
			</div>
		</div>

		<div class="span4">
			<div class="well">
				<div class='well'>
					<h3 class="text-error">
						Target: $<strong class="num"><%=trg%></strong>
					</h3>
					<h3 class="text-success">
						Invested: $<strong class="num" id="rsd_amt"><%=rsd%></strong>
					</h3>
					<p>
						<button class="btn btn-large btn-warning" id="btn_invest">Invest</button>
					</p>

					<%
						// ** show business plan button only if file exists
						java.io.File fex = new java.io.File(getServletContext().getInitParameter("PATH") + "/data/" + rs.getString(5) + "/executivesummary.pdf");							
						logger.info("Checking for exec summ: " + fex.exists());							
						if(fex.exists()){
					%>
					<p>
						<button class="btn btn-info" id="btn_exsm" style="width: 200px">
							Executive Summary
						</button>
					<%} %>
					<%
						// ** show business plan button only if file exists
						java.io.File fba = new java.io.File(getServletContext().getInitParameter("PATH") + "/data/" + rs.getString(5) + "/businessplan.pdf");							
						logger.info("Checking for business plan: " + fba.exists());							
						if(fba.exists()){
					%>
					<p>
						<button class="btn btn-info" id="btn_busplan" style="width: 200px">
							Business Plan
						</button>
					<%} %>
					<%
						// ** show business plan button only if file exists
						java.io.File fpp = new java.io.File(getServletContext().getInitParameter("PATH") + "/data/" + rs.getString(5) + "/financials.pdf");							
						logger.info("Checking for ppm: " + fpp.exists());							
						if(fpp.exists()){
					%>
					<p>
						<button class="btn btn-info" id="btn_ppm" style="width: 200px">
							Financials
						</button>
					<%} %>	
				
				</div>	
					
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
					<h3 class='text-warning'>Investors</h3>
					<div class='well'>									
					<table width="100%">
					<%
					//** show investors
					String qry2 = "select u.id, u.username, sum(ifnull(i.amount,0)+ifnull(i.commission,0)) from user u inner join investment i on u.id = i.user_id inner join project p on p.id = i.project_id and p.user_id = ? group by u.id, u.username";
					logger.info(qry2);
					PreparedStatement pstmt2 = con.prepareStatement(qry2);
					pstmt2.setInt(1, id1);
					ResultSet rs2 = pstmt2.executeQuery();
					int ivtrow=0;
					while (rs2.next()) {
						if(ivtrow/2.0==ivtrow/2) out.println("<tr>");
					%>
						<td align="center"><img src="data/<%=rs2.getString(1)%>/profilepic.jpg"  alt="profile picture" class="img-rounded" style='height:100px;width:100px;'/>
						<br><label class="label label-info"><%=rs2.getString(2)%></label>
						<br><label class="label label-important">$<span class="num"><%=rs2.getString(3)%></span></label>
					<%ivtrow++;}	%>
					</table>
					</div>
					
				</div>
					
			</div>

<style>
.num {}

#mdl_busplan {
	top: 10px;
	bottom: 50px;	
}
</style>
<script>
$(document).ready(function() {
	//alert('<%=commission%>');
	$('.num').number(true, 0);
	
	//try{
	//$("frm_video").attr('src','<%=url%>');
	//}catch(err){
		//$("frm_video").attr('src','http://192.168.1.136:8081');
	//}	
	
	//** incase of missing pics or pics that didn't load
	$("img").error(function () {
		$(this).unbind("error").attr("src", "img/placeholder.jpg");
	});
	
	var userid=<%=session.getAttribute("userid")%>;
	var roleid=<%=session.getAttribute("roleid")%>;
	
	$('.num').number(true, 0);
		
	var mdlbusplan = function(){
		$('#mdl_busplan').modal().css({
			width : function() {
				return ($(document).width() * .8) + 'px';
			},
			'margin-left' : function() {
				return -($(this).width() / 2);
			}
		});
		$('#mdl_busplan').modal('show');		
	};
	
	$('#btn_exsm').click(function() {
		if(userid==null){ appalert("Please register or login to continue!","error"); return; }
		$('#btn_cls_subagre').show();
		$('#ftr_busplan').hide();
		$('#frame_busplan').attr('src','');
		$('#hdr_busplan').html('Executive Summary');
		$('#frame_busplan').attr('src','data/<%=rs.getString(5)%>/executivesummary.pdf?t=' + Math.random());	
		mdlbusplan();	
	});
	$('#btn_busplan').click(function() {
		if(userid==null){ appalert("Please register or login to continue!","error"); return; }
		$('#btn_cls_subagre').show();
		$('#ftr_busplan').hide();
		$('#frame_busplan').attr('src','');
		$('#hdr_busplan').html('Business Plan');
		$('#frame_busplan').attr('src','data/<%=rs.getString(5)%>/businessplan.pdf?t=' + Math.random());
		mdlbusplan();	
	});
	$('#btn_ppm').click(function() {
		if(userid==null){ appalert("Please register or login to continue!","error"); return; }
		$('#btn_cls_subagre').show();
		$('#ftr_busplan').hide();
		$('#frame_busplan').attr('src','');
		$('#hdr_busplan').html('Financials');
		$('#frame_busplan').attr('src','data/<%=rs.getString(5)%>/financials.pdf?t=' + Math.random());
		mdlbusplan();	
	});
	
	$('#btn_invest').click(function() {
		$('#btn_cls_subagre').hide();
		$('#btn_cont_invst').hide();
		if(userid==null){ appalert("Please register or login to invest!","error"); return; }
		if(roleid==1){ appalert("You need to register as an investor to invest!","error"); return; }
		loaderOn();
		$('#ftr_busplan').show();
		$('#hdr_busplan').html('Subscription Agreement');
		$('#frame_busplan').attr('src','');				    		
		/* Two Singtures Not needed
		$.get('jsp/echosign.jsp?signtype=two&userid=' + userid + '&projectid=<%=id1%>&email1=<%=session.getAttribute("emailid")%>&email2=<%=projectemail%>&t= + Math.random()',function(data,status){	
			$('#frame_busplan').attr('src',$.trim(data));
			loaderOff();
			mdlbusplan();
		});*/
		$('#frame_busplan').attr('scrolling', 'yes');	
		$.post('jsp/echosign.jsp?t=' + Math.random() + '&signtype=one&doc=/data/<%=rs.getString(5)%>/subscriptionagreement.pdf&userid=' + userid + '&email1=<%=session.getAttribute("emailid")%>', function(data,status){	
			$('#frame_busplan').attr('src',$.trim(data));				    			
			loaderOff();
			mdlbusplan();
		});
		//** check download and show continue button after download		
		//** temporarily disabled
		//var chkechodoc = setInterval(function(){$.post('jsp/echosigncheck.jsp?t=' + Math.random(),function(data,status){
				//alert('checking....');
		//		if(data.match("download success")){
					//alert('success' + data);
					$('#btn_cont_invst').show();
		//			clearInterval(chkechodoc);
		//		}
		//	});},3000);		
	});
	
	$('#btn_cont_invst').click(function() {
		$('#mdl_busplan').modal('hide');
		$('#frame_invest').hide();
		$('#div_payicons').show();
		$('#mdl_invest').modal('show');
	});
	//** reload project page to show updated raised amount and also the investor thunmb. LEAVE AS IS!
	$('#btn_invst_cls').click(function() {
		loaderOn();
		$.get("projectpage.jsp?id=<%=id1%>&t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
			$("#row_fillers").hide();
		    $("#div_projects").html(data);		   		
		});	
	});
	
	$('#img_authnet').click(function() {
		$('#frame_invest').attr('src','jsp/authnet.jsp?t=' + Math.random());
		$('#frame_invest').show();		
		$('#div_payicons').hide();
	});
	
	$('#img_paypal').click(function() {
		$('#frame_invest').attr('src','jsp/paypal.jsp?t=' + Math.random());
		$('#frame_invest').show();
		$('#div_payicons').hide();			
	});
	
	$('#btn_pay').click(function() {
		loaderOn();	
		$.post("jsp/balancedacc.jsp",{action:"transact", projectid:"<%=rs.getString(1)%>", tran_amt: $("#txt_amt").val(), email_comp:"<%=projectemail%>", commission: "<%=commission%>"},function(data,status){		
				$('#mdl_bdy_invest').html("<h4 class='text-error'>" + data + "</h4>");
				appalert(data,status);
				loaderOff(); 
				//alert($('#txt_amt').val() + ' , ' + $('#rsd_amt').html());
				//$('#rsd_amt').html($('#txt_amt').val() + $('#rsd_amt').html()); //** revists. no need to reload the page
		});		
	});		

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
<!--<div class="tab-pane" id="tab2">-->
<!--<div class="well">-->
	<!-- <iframe src="http://wp-gafinance.rhcloud.com/?page_id=27" style="border:0;height:800px;width:100%;margin:0px"></iframe>  -->
	<!--<iframe src='<%=getServletContext().getInitParameter("BLOG_URL")%>/vip-load-blog.php?username=<%=username%>' style="border:0;height:800px;width:100%;margin:0px"></iframe>-->
<!--</div>-->
</div>
</div> <!-- /tab content -->
</div> <!-- /tababble -->
</div> <!-- /top row -->
</div> <!-- /container -->

<!-- ====================== Subagree Modal ============================ -->	
<div id="mdl_busplan" class="modal hide fade" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" id="btn_cls_subagre">×</button>
			<h3 id="hdr_busplan"></h3>
	</div>	
		<iframe id="frame_busplan" src='' style='border: 0px; width: 100%; height: 90%' scrolling='no'></iframe>
	<!-- <div id="div_busplan"></div>  -->
<div class="modal-footer" id="ftr_busplan" style="display:none">
		<button class="btn btn-danger" id="btn_cont_invst">Continue</button>
	</div>		
</div>
<!-- / End Business Plan Modal -->	

<!-- ====================== Invest Modal ============================ -->	
<div id="mdl_invest" class="modal hide fade" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" id="btn_invst_cls">×</button>
			<h3>Invest</h3>
	</div>
	<div class="modal-body" id="mdl_bdy_invest">
		<div class="input-append"><input type="text" class="input-mini" placeholder="Amount" id="txt_amt"><button class="btn" id="btn_pay">Invest</button></div>			
		<!-- <div id="div_payicons"><a href="#"><img src="img/authnet.gif" id="img_authnet"></a><a href="#"><img src="img/paypal_logo.gif" id="img_paypal"></a>  -->
		<p><P class='help-inline'>Please click the invest button only once!</div>
		<iframe id="frame_invest" src='' style='border: 0px solid black; width: 100%; height: 150px;' scrolling='no'></iframe>				
	</div>
</div>
<!-- / End Invest Modal -->
