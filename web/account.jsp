
<script>
$(document).ready(function() {
	$('#btn_edit').click(function() {
		if(tabname.match('User')) $("#frm_user :input").removeAttr("disabled");
		if(tabname.match('Project')) $("#frm_project :input").removeAttr("disabled");
		if(tabname.match('Location')) $("#frm_location :input").removeAttr("disabled");
		$("#btn_save").removeAttr('disabled');
		$("#approved").attr('disabled','disabled');
		$("#state").attr('disabled','disabled');
	});

	$('#mdl_profile').modal().css({
		width : function() {
			return ($(document).width() * .6) + 'px';
		},
		'margin-left' : function() {
			return -($(this).width() / 2);
		}						
	});

	$('#btn_acc_del').hide();
	var tabname="User";
	$('#myTab a').click(function (e) {
		 e.preventDefault();
		 if(tabname.match('User')) $("#frm_user :input").attr("disabled","disabled");
		 if(tabname.match('Project')) $("#frm_project :input").attr("disabled","disabled");
		 if(tabname.match('Location')) $("#frm_location :input").attr("disabled","disabled");
		 $('#btn_acc_del').hide();
		 $("#btn_save").attr('disabled','disabled');
		 if($(this).text().match('Files')){
			 $('#btn_edit').hide();
			 $('#btn_save').hide();
			 $('#frame_files2').attr('src','jsp/files.jsp?t=' + Math.random());
		 }else if($(this).text().match('Bank Account')){
			 $('#btn_save').show();
			 $("#btn_save").removeAttr('disabled');
			 $('#btn_edit').hide();
			 $('#frm_acc').hide();
			 loaderOn();
			 $.post('jsp/balancedacc.jsp?t=' + Math.random() + '&action=list',function(data,success){
				 loaderOff();
				 data = $.trim(data);
				 //appalert(data,success);
				 //alert(data);
				 if(data.match("No existing Account. Creating new one.")){ 
					$('#frm_acc').show();
					$('#btn_save').show();
					$('#div_acc').html('');
					$('#btn_acc_del').hide();
				 }else{
					$('#frm_acc').hide();
					$('#btn_save').hide();					
					$('#div_acc').html(data);
					$('#btn_acc_del').show();
				 }					 				 
			 });
		 }else{
			 $('#btn_edit').show();
			 $('#btn_save').show();
		 }
		 $(this).tab('show');
		 tabname = $(this).text();
	});		

	$('#btn_save').click(function() {			

			if(tabname.match('User') && $('#frm_user').valid()){				
				var $inputs = $('#tab_user :input');
				var qrystr = "";
				$inputs.each(function() {
					if (!$(this).attr('id').match('btn') && $(this).attr('id')!='email1' && $(this).attr('id')!='password2')
						qrystr = qrystr + $(this).attr('id') + '=' + $(this).val() + '&';
				});
				qrystr = qrystr.substring(0, qrystr.length - 1);
				$.post("jsp/save.jsp?action=update&table=user&" + encodeURI(qrystr),function(data, status) {
					if(data==1)
						appalert("Successfully saved the information!!","success");
					else	
						appalert("There was an error saving your changes. Please try again!!","error");
				});
			}

			if(tabname.match('Project') && $('#frm_project').valid()){
				var $inputs = $('#tab_project :input');
				var qrystr = "";
				$inputs.each(function() {
					if (!$(this).attr('id').match('btn') && !$(this).attr('id').match('approved'))
						qrystr = qrystr + $(this).attr('id') + '=' + $(this).val() + '&';																	
				});
				qrystr = qrystr.substring(0, qrystr.length - 1);
				qrystr = qrystr.replace(/(\r\n|\n|\r)/gm,"<br />");												
				$.post("jsp/save.jsp?action=update&table=project&" + encodeURI(qrystr),	function(data, status) {
					if(data==1)
						appalert("Successfully saved the information!!","success");
					else	
						appalert("There was an error saving your changes. Please try again!!","error");
				});
			}

			if(tabname.match('Location') && $('#frm_location').valid()){
				var $inputs = $('#tab_location :input');
				var qrystr = "";
				$inputs.each(function() {
					if (!$(this).attr('id').match('btn'))
						qrystr = qrystr + $(this).attr('id') + '=' + $(this).val() + '&';
				});
				qrystr = qrystr.substring(0, qrystr.length - 1);					
				$.post("jsp/save.jsp?action=update&table=location&" + encodeURI(qrystr),function(data, status) {
					if(data==1)
						appalert("Successfully saved the information!!","success");
					else	
						appalert("There was an error saving your changes. Please try again!!","error");
				});
			}

			if(tabname.match('Bank Account') && $('#frm_acc').valid()){
				loaderOn();
				$.post('jsp/balancedacc.jsp?action=create&&t=' + Math.random() + '&' + $('#frm_acc').serialize(),function(data,status){
					//alert(data);
					//appalert(data,status);
					if(data!="") {
						$('#btn_acc_del').show();
						$('#btn_save').hide();
						$('#frm_acc').hide();
						$('#div_acc').html(data);
					}
					loaderOff();					
				});
			}				
						
	});

	$('form').each(function () {				
		validateForm(this);							
	});	

	$("input.zipcode").mask("99999");
	$("input.phone").mask("(999) 999-9999");

	$("#btn_close1").click(function() {
		loadprjpg();
	});

	$("#btn_close2").click(function() {
		loadprjpg();
	});

	var loadprjpg = function(){
		loaderOn();
		if(getCookie("roleid")==1)
			pg = "projectpage.jsp";
		else
			pg = "profile.jsp";
		$.get(pg + '?id=<%=session.getAttribute("userid")%>&t=' + Math.random(),function(data,status){
			loaderOff();
			$("#myCarousel").hide();
			$("#row_fillers").hide();
			$("#div_projects").html(data);		   		
		});
	};

	$('.modal').on('shown', function () {
		$('body').on('wheel.modal mousewheel.modal', function () {
		  return false;
		});
	});
	$('.modal').on('hidden', function () {
		$('body').off('wheel.modal mousewheel.modal');
	});	

	//** bank account
	validateForm("#frm_acc","right");
	validateForm("#frm_ach","right");
	validateForm("#frm_tran","right");

	$('#p_ein').hide();
	$('#acctype').change(function(){
		if($('#acctype').val()=="business"){ 
			$('#p_ein').show();		
		}else{
			$('#p_ein').hide();
		}
	});

	/*$('#btn_acc_ver').click(function(){
		if($('#frm_ach').valid()){		
			loaderOn();
			$.get('jsp/balancedacc.jsp?action=verify&t=' + Math.random(),function(data,status){
				alert(data);
				appalert(data,status);
				loaderOff();
			});
		}
	});*/

	$('#btn_acc_del').click(function(){
		bootbox.confirm('<h5 class=text-error>Are you sure you want to delete the account?</h5>',function(result){
			if(result){		  					
				loaderOn();
				$.post('jsp/balancedacc.jsp?action=delete&t=' + Math.random(),function(data,status){
					//alert(data);
					appalert(data,status);
					$('#frm_acc').show();
					$('#div_acc').html('');
					$('#btn_acc_del').hide();
					$('#btn_save').show();
					loaderOff();
				});
			}else{
				//do nothing
			}
		});				
	});
        
        $("#DOB").datepicker({
            changeMonth: true,
            changeYear: true,
            yearRange: "1920:2020",
            dateFormat: "yy-mm-dd"
        });

});//end of doc ready			

</script>

<%@include file="jsp/db.jsp"%>
<%	
	String userid = maskNullStr((String) session.getAttribute("userid"));
	String roleid = maskNullStr((String) session.getAttribute("roleid"));
	logger.info("profile page userid, role: " + userid + "," + roleid);
	if(userid.equals("")) response.sendRedirect("/index.html");
	logger.info(request.getQueryString());
	String header = "", result = "", rows = "";
	try {
		logger.info("Source database connection established!");
		String[] tables1 = { "user", "project", "location" };
		String[] tables2 = { "user", "location" };
		String[] tables;
		if(roleid.equals("1"))
			tables = tables1;
		else
			tables = tables2;
%>

<div id='mdl_profile' class='modal hide fade' tabindex='-1'
	role='dialog' data-backdrop='static' data-keyboard='false' style='top:30px'>	
		<div class='modal-header'>
			<button type='button' class='close' data-dismiss='modal'
				aria-hidden='true' id='btn_close1'>×</button>
			<h3>Profile</h3>
		</div>
		<ul class="nav nav-tabs" id="myTab">
					<li class="active"><a href="#tab_user">User Info</a></li>						
					<%if(roleid.equals("1")){%><li><a href="#tab_project">Project Info</a></li> <%} %>
					<li><a href="#tab_location">Location Info</a></li>
					<li><a href="#tab_files">Files</a></li>	
					<li><a href="#tab_account">Bank Account</a></li>				
				</ul>

		<div class='modal-body'>
			<!-- <div class="container well" style='width: 50%'>  -->

				<div class="tab-content">
					<%  
						String active = "active";
						for (int ii = 0; ii < tables.length; ii++) {
								java.sql.Statement smt = con.createStatement();
								String qry = "";
								if (tables[ii].equals("user"))
									qry = "select first_name, mi, last_name, email, DOB, password1, about_me userdesc from user where id="
											+ userid;
								if (tables[ii].equals("project"))
									qry = "select project_name, summary, description, video_url, target_amount, case approved when 1 then 'Approved' when 2 then 'Denied' else 'Pending' end approved from project where user_id="
											+ userid;
								if (tables[ii].equals("location"))
									qry = "select address, city, state, zip, phone1, mobile, fax, website, facebook, google_plus, twitter, linkedin from location where user_id="
											+ userid;
								logger.info(qry);
								ResultSet rs = smt.executeQuery(qry);
								ResultSetMetaData rsmd = rs.getMetaData();
								int cols = rsmd.getColumnCount();
								//<span class='btn-group pull-right'><button class='btn btn-primary' id='btn_edit'>Edit</button><button class='btn btn-primary' id='btn_save' disabled>Save</button></span>
								out.println("<div class='tab-pane form-horizontal " + active + "' id='tab_"
										+ tables[ii] + "'><form id='frm_" + tables[ii] + "'>");
								active="";																							
								if (rs.next()) {
									for (int i = 1; i < cols + 1; i++) {
										String field = rsmd.getColumnLabel(i);
										String placeholder = "";
										if (field.indexOf("_") != -1) {
											String field1 = "", field2 = "";
											field1 = field.substring(0, field.indexOf("_"));
											field2 = field.substring(
													field.indexOf("_") + 1, field.length());
											field1 = field1.substring(0, 1).toUpperCase()
													+ field1.substring(1, field1.length());
											field2 = field2.substring(0, 1).toUpperCase()
													+ field2.substring(1, field2.length());
											placeholder = field1 + " " + field2;
										} else {
											placeholder = field.substring(0, 1)
													.toUpperCase()
													+ field.substring(1, field.length());
										}										
										if (field.equals("mi")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");											
											out.println("<div class='controls'><input type=text class='input-mini' id="
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "'></div></div>");
										} else if (field.equals("email")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large' id="
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' required email='true'></div></div>");
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>Confirm " + placeholder + "</label>");
											out.println("<div class='controls'><input type=text class='input-large' id=email1 name='email1'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' required equalTo='#email'></div></div>");
										} else if (field.equals("password1")) {											
											placeholder = "Password";
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=password class='input-medium' id="
													+ field + " name='" + field + "'"
													+ " disabled value='"													
													+ "'></div></div>");
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>Confirm " + placeholder + "</label>");
											out.println("<div class='controls'><input type=password class='input-medium' id=password2 name='password2'"
													+ " disabled equalTo='#password1' value='"													
													+ "'></div></div>");		
										} else if (field.equals("userdesc")) {
											out.println("<div class='control-group'><label class='control-label' for='description'>Description</label>");										
											out.println("<div class='controls'><textarea rows='3' style='width:500px' id='about_me' name='about_me'"
													+ "' class='input-medium' "
													+ "placeholder='Description' disabled required minlength='20' maxlength='200'>"
													+ maskNullStr(rs.getString(i))
													+ "</textarea></div></div>"); 
										} else if (field.equals("summary")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><textarea rows='3' style='width:500px' id='"
													+ field + "' name='" + field + "'"
													+ "' class='input-medium' "
													+ "placeholder='Summary' disabled required minlength='20' maxlength='200'>"
													+ maskNullStr(rs.getString(i))
													+ "</textarea></div></div>"); 
										} else if (field.equals("description")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><textarea rows='10' style='width:500px' id='"
													+ field + "' name='" + field + "'"
													+ "' class='input-medium' "
													+ "placeholder='Description' disabled required minlength='200' maxlength='2000'>"
													+ maskNullStr(rs.getString(i))
													+ "</textarea></div></div>");
										} else if (field.equals("website") || field.equals("video_url") || field.equals("facebook") || field.equals("google_plus") || field.equals("twitter") || field.equals("linkedin")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large' id="													
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' url='true'></div></div>");
										} else if (field.equals("target_amount")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large' id="													
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' number='true' min='1000' max='1000000'></div></div>");
										} else if (field.equals("phone1") || field.equals("mobile") || field.equals("fax")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large phone' id="													
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' ></div></div>");
										} else if (field.equals("zip")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large zipcode' id="													
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' number='true' required></div></div>");
										} else if (field.equals("DOB")) {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>Date of Birth</label>");										
											out.println("<div class='controls'><input type=text class='input-medium' id="													
													+ field + " name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' required dateISO='true'></div></div>");
										} else {
											out.println("<div class='control-group'><label class='control-label' for='"
													+ field + "'>" + placeholder + "</label>");										
											out.println("<div class='controls'><input type=text class='input-large' id='"													
													+ field + "' name='" + field + "'"
													+ " disabled value='"
													+ maskNullStr(rs.getString(i))
													+ "' required></div></div>");
										}
									}
								}
								out.println("</form></div>");
							}
					%>
					<div class="tab-pane" id="tab_files">
						<iframe id='frame_files2' src='' style='border: 0px; width: 100%; height: 1200px' scrolling='no'></iframe>
					</div>
					<div class="tab-pane" id="tab_account">																																			
						<form id='frm_acc'>								    
							<input type='text' id='account_name' name='account_name' class='input-xlarge' placeholder='Account Name' required minlength="10" maxlength="20"> 
							<br><select id="acctype" name="acctype" class="span2">
									<option value="person">Personal</option>
									<option value="business">Business</option>
								</select> <label class="help-inline">Account Type (Personal or Business)</label>
							<span id="p_ein"><br><input type='text' id='ein' name='ein' class='input-large' placeholder='EIN' required minlength="5" maxlength="9" number="true"> 
								<input type='text' id='ein2' name='ein2' class='input-large' placeholder='Confirm EIN' required minlength="9" maxlength="15" number="true" equalTo="#ein"></span> 	 
							<br><input type='text' id='routing_number' name='routing_number' class='input-large' placeholder='Routing Number' required minlength="9" maxlength="15" number="true"> 
								<input type='text' id='routing_number2' name='routing_number2' class='input-large' placeholder='Confirm Routing Number' required minlength="9" maxlength="15" number="true" equalTo="#routing_number">
							<br><input type='text' id='account_number' name='account_number' class='input-large' placeholder='Account Number' required minlength="10" maxlength="15" number="true">
								<input type='text' id='account_number2' name='account_number2' class='input-large' placeholder='Confirm Account Number' required minlength="10" maxlength="15" number="true" equalTo="#account_number">
							<br><select id="account_type" name="account_type" class="span2">
									<option value="CHECKING">Checking</option>
									<option value="SAVINGS">Savings</option>											
								</select> <label class="help-inline">Account Type (Checking or Saving)</label>
							<br> <span class="text-error"><strong>Note: </strong>The account above will be verified with <strong><u>two small ACH deposits</u></strong>. To activate your account you will need to log back in and 
							<strong><u>confirm the deposit amounts</u></strong> under your profile settings.</span>						
						</form>	
						<div id="div_acc">	
						</div>										
					</div>
				</div>
		</div>	
			<div class='modal-footer'>
				<button class='btn' data-dismiss='modal' aria-hidden='true' id='btn_close2'>Close</button>
				<button id='btn_edit' class='btn btn-primary'>Edit</button>
				<button id='btn_save' class='btn btn-primary' disabled>Save</button>
				<button class='btn btn-danger' id='btn_acc_del'>Delete Account</button>
			</div>		
	</div>		
		<%
		//out.println("");
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