/**
 * AUthor: Viplav Fauzdar version: 1.0.0 Date: 07/15/2013
 */
$(document).ready(function() {

	/** 
	 * js for index.html 
	 * */
	
	var sessionid, userid, roleid, lname, fname; 

	checkSess1(); //check session on load (or refresh)
	setInterval(function(){ checkSess1(); },15*60*1000);	//check session after every x seconds.

	function checkSess1(){
		//alert('checking session....')
		if(getCookie("loggedinsessionid")==null){
			$("#bg_susi").show();
			$("#greeting").html("");			
			$("#btn_signout").hide();
			$("#lnk_register").show();
			$("#lnk_settings").hide();
			$.get("jsp/logout.jsp");
		}else{
			//check with the server if the logged in session is still valid -- this and settimeout not working right. visit later
			$.get('jsp/checksession.jsp',function(data,status){				
				//compare to cookie value				
				data=$.trim(data);				
				//alert(getCookie("loggedinsessionid") + " , " + data)
				if(!data.match(getCookie("loggedinsessionid"))){					
					//remove cookie by setting expires to -ve value
					setCookie("loggedinsessionid","",-1);
					setCookie("greeting","",-1);
					setCookie("userid","",-1);
					setCookie("roleid","",-1);
					//call itself to complete log off
					//checkSess1(); //** not necessary because session has expired. just go back to index.html					
					$.get("jsp/logout.jsp"); 
					//window.location='index.html';
					location.reload();
				}
			});
			$("#bg_susi").hide();
			$("#btn_signout").show();
			$("#lnk_register").hide();
			$("#lnk_settings").show();
			$("#greeting").html(getCookie("greeting"));
		}
	}				
	
	validateForm("#frm_login","right");
	
	$("#btn_signin").click(function() {		
		$('#mdl_login').modal('show');		
		$("#btn_login").click(function() {			
			if($('#frm_login').valid()){				
				//alert($("#password1").val());
				loaderOn();			
				$.post("jsp/login.jsp",{username: $("#username1").val(), password: $("#password1").val()},function(data,status){
					loaderOff();
					if(data.match('success')){					
						var sessdata = data.split(",");
						sessionid = sessdata[1];
						userid  = sessdata[2];
						setCookie("userid",userid);
						roleid = sessdata[3];
						setCookie("roleid",roleid);
						lname = sessdata[4];
						fname = sessdata[5];
						fname = fname.substr(0,1).toUpperCase() + fname.substring(1,fname.length);
						lname = lname.substr(0,1).toUpperCase() + lname.substring(1,lname.length);
						appalert("Welcome " + fname + " " + lname,"success");
						$("#bg_susi").hide();
						$("#greeting").html("Howdy, " + fname + " " + lname);// + " (" + $("#username1").val() + ")");			
						$("#btn_signout").show();
						$("#lnk_register").hide();
						$("#lnk_settings").show();
						setCookie("loggedinsessionid",sessionid,24*60*60*1000);
						setCookie("greeting",$("#greeting").html(),24*60*60*1000); //** leave cookie for 1 day. The cookie is forced to expire once server session has expired!
						setTimeout(function(){
							//window.location='index.html'; //below not needed
							location.reload();
						},1000);
						$('#mdl_login').modal('hide');
					}else{
						appalert(data,"error");				
					}				
				});
			}
		});
	});

	$("#btn_signout").click(function() {
		//appalert('Signing out! Goodbye!!'');
		var data = $.ajax({
			async:true,
			type: "POST",
			url: "jsp/logout.jsp"
		}).responseText;
		appalert("Goodbye!","info");
		setTimeout(function(){
			//window.location='index.html'; //below not needed
			location.reload();
		},1000);
		
		/*$("#bg_susi").show();
		$("#greeting").html("");			
		$("#btn_signout").hide();
		$("#lnk_register").show();
		$("#lnk_profile").hide();*/
	});	
		

	//load project widget when page loads
	loaderOn();
	$.post("projectwidget.jsp?t=" + Math.random(),function(data,status){
		loaderOff();
	    $("#div_projects").html(data);		   		
	});	
		
	$("#lnk_register").click(function() {
		//$("#li_register").addClass("active");
		loaderOn();
		$.post("register.jsp?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#div_register").html(data);		   		
		});		
	 });

	$("#btn_signup").click(function() {
		loaderOn();
		$.post("register.jsp?t=" + Math.random(),function(data,status){
		    loaderOff();
		    $("#div_register").html(data);		   		
		});
	 });

	$("#lnk_account").click(function() {
		loaderOn();
		$.post("account.jsp?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#div_profile").html(data);		   		
		});
	 });
	
	$("#lnk_profile").click(function() {		
		loaderOn();
		if(getCookie("roleid")==1)
			pg = "projectpage.jsp";
		else
			pg = "profile.jsp";
		$.post(pg + "?t=" + Math.random() + "&id=" + getCookie("userid"),function(data,status){
			loaderOff();
			$("#myCarousel").hide();
			$("#row_fillers").hide();
		    $("#div_projects").html(data);		   		
		});
	 });

	$("#lnk_projects").click(function() {
		loaderOn();
		$.post("projectwidget.jsp?action=list&t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 
	 $("#ftr_lnk_projects").click(function() {
		loaderOn();
		$.post("projectwidget.jsp?action=list&t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 

	$("#lnk_contact").click(function() {
		loaderOn();
		$.post("contact.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 
	 $("#ftr_lnk_contact").click(function() {
		loaderOn();
		$.post("contact.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	
	$("#lnk_blog").click(function() {
		loaderOn();
		$.post("blog.jsp?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	
	$("#lnk_about").click(function() {
		loaderOn();
		$.post("about.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 
	 $("#ftr_lnk_about").click(function() {
		loaderOn();
		$.post("about.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 
	$("#lnk_faq").click(function() {
		loaderOn();
		$.post("faq.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });
	 
	 $("#ftr_lnk_faq").click(function() {
		loaderOn();
		$.post("faq.html?t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
		    $("#div_projects").html(data);	
			//$("#div_project_display").html(data);			   		
		});
	 });

	$("#btn_srch_projects").click(function() {
		loaderOn();		
		$.post("projectwidget.jsp?action=search&srch_projects=" + $('#srch_projects').val() + "&t=" + Math.random(),function(data,status){
			loaderOff();
		    $("#myCarousel").hide();
		    $("#row_fillers").hide();
			$("#div_projects").html(data);			   		
		});
	 });	
	
	//var subjects = ['Alabama','Alaska','Arizona','Arkansas','California','Colorado','Connecticut','Delaware','District Of Columbia','Florida','Georgia','Hawaii','Idaho','Illinois','Indiana','Iowa','Kansas','Kentucky','Louisiana','Maine','Maryland','Massachusetts','Michigan','Minnesota','Mississippi','Missouri','Montana','Nebraska','Nevada','New Hampshire','New Jersey','New Mexico','New York','North Carolina','North Dakota','Ohio','Oklahoma','Oregon','PALAU','Pennsylvania','PUERTO RICO','Rhode Island','South Carolina','South Dakota','Tennessee','Texas','Utah','Vermont','Virginia','Washington','West Virginia','Wisconsin','Wyoming']; 
	//$('#state').typeahead({source: subjects})

	
	
	//** reset passwrod
	$("#lnk_passreset").click(function() {
		if($('#username1').val()!=""){
			loaderOn();
			$.post("jsp/passreset.jsp?username=" + $('#username1').val() + "&t=" + Math.random(),function(data,status){
				loaderOff();
				appalert(data,status);				
			});
		}else{
			appalert('Please specify the username!','error');
		}			
	});

	
	//** lock background scrolling
	$('.modal').on('shown', function () {
		$('body').on('wheel.modal mousewheel.modal', function () {
		  return false;
		});
	});
	$('.modal').on('hidden', function () {
		$('body').off('wheel.modal mousewheel.modal');
	});	
	
	// end js for index
	
			
	
}); //** end of document ready



