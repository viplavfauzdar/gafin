<script>
    $(document).ready(function() {
        var userid = "";

        $('#mdl_user').modal('show');

        $('#btn_bk_project').click(function() {
            $('#mdl_project').modal('hide');
            $('#mdl_user').modal('show');
        });
        $('#btn_bk_location').click(function() {
            $('#mdl_location').modal('hide');
            if ($('#role_id').val() == '1')
                $('#mdl_project').modal('show');
            else
                $('#mdl_user').modal('show');
        });
        var qrystr_user = "", qrystr_project = "", qrystr_location = "";
        $('#div_acc').hide();
        $('#btn_nxt_user').click(function() {
            var $inputs = $('#frm_user :input');
            qrystr_user = "table=user&";
            $inputs.each(function() {
                if ($(this).attr('id') != 'email1' && $(this).attr('id') != 'password2')
                    qrystr_user = qrystr_user + $(this).attr('id') + '=' + $(this).val() + '&';
            });
            qrystr_user = qrystr_user.substring(0, qrystr_user.length - 1);
            if ($('#frm_user').valid()) {
                loaderOn();
                $.ajax({
                    async: false,
                    type: 'POST',
                    url: 'jsp/save.jsp?' + encodeURI(qrystr_user),
                    success: function(data) {
                        appalert('Successfully saved your information.', 'success');
                        userid = $.trim(data);
                    }
                });
                $('#mdl_user').modal('hide');
                $('#div_acc').show();
                if ($('#role_id').val() == '1') {
                    $('#hdr_pptosnda').html('Listing Agreement');
                    $('#frame_pptosnda').attr('src', '');
                    $('#frame_pptosnda').attr('scrolling', 'yes');
                    $('#frame_pptosnda').css({height: ($('#mdl_pptosnda').height() - 200) + 'px'});
                    $('#cls_pptosnda').hide();
                    $('#div_acc').show();
                    $('#btn_acc_cont').hide();
                    loaderOn();
                    $.post('jsp/echosign.jsp?t=' + Math.random() + '&signtype=one&doc=listingagreement.pdf&userid=' + userid + '&email1=' + $('#email').val(), function(data, status) {
                        $('#frame_pptosnda').attr('src', $.trim(data));
                        loaderOff();
                        mdlppShow();
                    });
                    //** check download and show i agree button after download		
                    //** temporary disabled
                    var chkechodoc1 = setInterval(function() {
                        $.post('jsp/echosigncheck.jsp?t=' + Math.random(), function(data, status) {
                            if (data.match("download success")) {
                                $('#btn_acc_cont').show();
                                clearInterval(chkechodoc1);
                            }
                        });
                    }, 3000);
                    $('#cls_pptosnda').click(function() {
                        $('#mdl_project').modal('show');
                    });
                    $('#btn_acc_cont').click(function() {
                        $('#mdl_project').modal('show');
                    });
                } else {
                    if ($('#investor_type').val() == 'U') {
                        $('#hdr_pptosnda').html('Risk Disclosure');
                        $('#frame_pptosnda').attr('scrolling', 'yes');
                        $('#frame_pptosnda').attr('src', 'docs/checklist_unaccinvestor.htm?t=' + Math.random());
                        $('#cls_pptosnda').hide();
                        $('#div_acc').show();
                        $('#frame_pptosnda').css({height: ($('#mdl_pptosnda').height() - 200) + 'px'});
                        $('#frame_pptosnda').attr('scrolling', 'yes');
                        mdlppShow();
                        loaderOff();
                    } else {
                        $('#hdr_pptosnda').html('Investor Checklist');
                        $('#frame_pptosnda').attr('src', '');
                        $('#cls_pptosnda').hide();
                        $('#div_acc').show();
                        $('#frame_pptosnda').css({height: ($('#mdl_pptosnda').height() - 200) + 'px'});
                        $('#frame_pptosnda').attr('scrolling', 'yes');
                        //$('#frame_pptosnda').attr('src',encodeURI('jsp/echosign.jsp?t=' + Math.random() + '&signtype=one&doc=checklist_accinvestor.docx&userid=' + userid));
                        $('#btn_acc_cont').hide();
                        $.post('jsp/echosign.jsp?t=' + Math.random() + '&signtype=one&doc=checklist_accinvestor.pdf&userid=' + userid + '&email1=' + $('#email').val(), function(data, status) {
                            $('#frame_pptosnda').attr('src', $.trim(data));
                            mdlppShow();
                            loaderOff();
                        });
                        //** check download and show i agree button after download
                        //** temporarily disabled
                        setInterval(function() {
                            $.post('jsp/echosigncheck.jsp?t=' + Math.random(), function(data, status) {
                                if (data.match("download success")) {
                                    $('#btn_acc_cont').show();
                                }
                            });
                        }, 3000);
                    }
                    $('#cls_pptosnda').click(function() {
                        $('#mdl_location').modal('show');
                    });
                    $('#btn_acc_cont').click(function() {
                        $('#mdl_location').modal('show');
                    });
                }
            }
        });

        $('#btn_nxt_project').click(function() {
            var $inputs = $('#frm_project :input');
            qrystr_project = "table=project&";
            $inputs.each(function() {
                if ($(this).attr('id').match('target_amount'))
                    $(this).val($(this).val().replace('$', '').replace(',', '').replace(',', '').replace(',', ''));
                qrystr_project = qrystr_project + $(this).attr('id') + '=' + $(this).val() + '&';

            });
            qrystr_project = qrystr_project.substring(0, qrystr_project.length - 1);
            qrystr_project = qrystr_project.replace(/(\r\n|\n|\r)/gm, "<br>");
            $('#target_amount').focus();
            if ($('#frm_project').valid()) {
                loaderOn();
                $.post('jsp/save.jsp?' + encodeURI(qrystr_project), function(data, status) {
                    appalert('Successfully saved your information.', status);
                    loaderOff();
                });
                $('#mdl_project').modal('hide');
                $('#mdl_location').modal('show');
            }
        });

        $('#btn_nxt_location').click(function() {
            var $inputs = $('#frm_location :input');
            qrystr_location = "table=location&";
            $inputs.each(function() {
                qrystr_location = qrystr_location + $(this).attr('id') + '=' + $(this).val() + '&';
            });
            qrystr_location = qrystr_location.substring(0, qrystr_location.length - 1);
            if ($('#frm_location').valid()) {
                loaderOn();
                $.post('jsp/save.jsp?' + encodeURI(qrystr_location), function(data, status) {
                    appalert(data, status);
                    if (status.match('success')) {
                        $('#mdl_location').modal('hide');
                        appalert("Registeration successful! Please signin to continue!!", "success");
                        //** below blog url info from bootbox disabled 06.03.2014
                        //<p>In addition a <u>blog account</u> has been created for you with the same username and password as above. <p>Please <a href=<%=getServletContext().getInitParameter("BLOG_URL")%>/wp-admin target=_new>click here</a> to access the blog and post your updates.
                        bootbox.alert("<h4>Thank you for registering with Finance Georgia.</h4><h5>Please make a note of the information below:</h5><p><b>Username: </b>" + $('#username').val() + "<p><b>Password:</b> your chosen password <p>You should <u>log back</u> in to continue finishing your profile including setting up a <u>bank account</u> and uploading pictures and documents. <p>An email has also been sent to you with this information.<p>-Thanks <br><small>Finance Georgia Team.</small>", function() {
                            $('#frame_files').attr('src', 'jsp/files.jsp?t=' + Math.random());
                            $('#mdl_upload').modal('show');
                        });
                    } else {
                        appalert("Registeration unsuccessful! Please try later!!", "error");
                    }
                    loaderOff();
                });
            }
        });

        // ** invalidate the session to force login
        var killSess = function() {
            $.get('jsp/logout.jsp');
            setTimeout(function() {
                location.reload();
            }, 2000);
        };
        $('#btn_upl_cls1').click(function() {
            killSess();
        });
        $('#btn_upl_cls2').click(function() {
            killSess();
        });


        validateForm("#frm_user", "right");
        validateForm("#frm_project", "top");
        validateForm("#frm_location", "right");

        $("input.zipcode").mask("99999");
        $("input.phone").mask("(999) 999-9999");
        /*
         jQuery.validator.addMethod("password", function( value, element ) {
         var result = this.optional(element) || value.length >= 8 && /\d/.test(value) && /[a-z]/i.test(value);
         if (!result) {			
         var validator = this;
         setTimeout(function() {
         validator.blockFocusCleanup = true;
         element.focus();
         validator.blockFocusCleanup = false;
         }, 1);
         }
         return result;
         }, "Your password must be at least 8 characters long and contain at least one number and one character.");
         */
        //** privacy policy etc
        var mdlppShow = function() {
            $('#mdl_pptosnda').modal().css({
                width: function() {
                    return ($(document).width() * .8) + 'px';
                },
                'margin-left': function() {
                    return -($(this).width() / 2);
                }
            });
            loaderOn();
            $('#mdl_pptosnda').modal('show');
            loaderOff();
        };
        $('#lnk_pp').click(function() {
            $('#frame_pptosnda').attr('src', '');
            $('#hdr_pptosnda').html('Privacy Policy');
            $('#frame_pptosnda').attr('scrolling','yes');
            $('#frame_pptosnda').attr('src', 'docs/privacypolicy.htm?t=' + Math.random());
            mdlppShow();
        });
        $('#lnk_tos').click(function() {
            $('#frame_pptosnda').attr('src', '');
            $('#hdr_pptosnda').html('Terms of Service');
            $('#frame_pptosnda').attr('scrolling','yes');
            $('#frame_pptosnda').attr('src', 'docs/termsofservice.htm?t=' + Math.random());
            mdlppShow();
        });
        $('#lnk_nda').click(function() {
            $('#frame_pptosnda').attr('src', '');
            $('#hdr_pptosnda').html('Non Disclosure Agreement');
            $('#frame_pptosnda').attr('src', 'docs/nondisclosureagreement.pdf?t=' + Math.random());
            mdlppShow();
        });

        //** investor type - accredited or unaccredited.
        $('#spn_invtyp').hide();
        $('#investor_type').hide();
        $('#role_id').change(function() {
            if ($('#role_id').val() == "2") {
                $('#spn_invtyp').show();
                $('#investor_type').show();
            } else {
                $('#spn_invtyp').hide();
                $('#investor_type').val("U"); //** if role is project then this should be blank //** causing issues - leave as U (ignore if role = 1)
                $('#investor_type').hide();
            }
        });

        //$("[data-toggle=popover]").popover();

        var chkuser = function() {
            if ($("#username").valid()) {
                $.post("jsp/checkusername.jsp", {username: $("#username").val()}, function(data) {
                    $("#chk_usr").popover({
                        placement: "right",
                        trigger: "manual",
                        content: data
                    });
                    //pp.data("popover").options.content = data;
                    $("#chk_usr").popover("show");
                    if (data.match('taken')) {
                        $("#div_user").removeClass('success');
                        $("#div_user").addClass('error');
                        $("#username").focus();
                    } else {
                        $("#div_user").removeClass('error');
                        $("#div_user").addClass('success');
                    }
                    $("#password1").focus(function() {
                        $("#chk_usr").popover("hide");
                    });
                    $( "#username" ).blur(function() {
                        $("#chk_usr").popover("hide");
                    });
                });
            }
        };
                
        $('#chk_usr').click(function() {
            chkuser();
        });

        $('#username').blur(function() {
            chkuser();
        });

        $('.modal').on('shown', function() {
            $('body').on('wheel.modal mousewheel.modal', function() {
                return false;
            });
        });
        $('.modal').on('hidden', function() {
            $('body').off('wheel.modal mousewheel.modal');
        });

        //** format target amount to currency
        $('#target_amount').autoNumeric('init', {aSign: '$', aPad: 'false'});
        
        $("#DOB").datepicker({
            changeMonth: true,
            changeYear: true,
            yearRange: "1920:2020",
            dateFormat: "yy-mm-dd"
        });

    });//end of document onload

</script>
</head>

<body>
    <p>

        <!-- USER -->
    <div id="mdl_user" class="modal hide fade" tabindex="-1" role="dialog"
         data-backdrop="static" data-keyboard="false">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">×</button>
            <h3>Registration: Step 1</h3>
        </div>
        <div class="modal-body">
            <fieldset>
                <legend>Please tell us about yourself!</legend>
                <strong class="text-error">Please DO NOT use the browser's back button! Please complete all the steps (there are only 3) in the registration process!!</strong>
                <form id='frm_user'>
                    <br> <input type='text' id='first_name' name='first_name'
                                class='input-medium' placeholder='First Name' required minlength="2" maxlength="20" lettersonly="true"> <input
                                type='text' id='mi' name='mi' class='input-mini' placeholder='MI' maxlength=1 lettersonly="true">
                    <input type='text' id='last_name' name='last_name' class='input-medium'
                           placeholder='Last Name' required minlength="2" maxlength="20" lettersonly="true"> <br> <input type='text'
                           id='email' name='email' class='input-xlarge' placeholder='Email' required email="true"><!-- <span class="help-inline">This will be your username.</span>  -->
                    <input type='text' id='email1' name='email1' class='input-xlarge' placeholder='Confirm Email'  required email="true" equalTo="#email"> 
                    <br> <input type='text' id='DOB' name='DOB' class='input-medium' placeholder='Date of Birth' required dateISO="true"> <span class="help-inline">Date of Birth (mm/dd/yyyy)</span>
                    <br> <span id='div_user' class="control-group"><div class="input-append"><input type='text' id='username' name='username' class='input-medium'
                                                                                                    placeholder='Username' required minlength="8" maxlength="15" required> <a href="#" class="btn" id="chk_usr">Check</a></div></span>
                    <br><input type='password' id='password1' name='password1' class='input-medium' placeholder='Password' required>
                    <input type='password' id='password2' name='password2' class='input-medium' placeholder='Confirm Password' required>
                    <br><textarea rows='3' id='about_me' name='about_me' class='input-xlarge'
                                  placeholder='A little about you in 200 characters or less' style='width: 500px' maxlength="200"></textarea>	 
                    <br> <select
                        id="role_id" class="span2" placeholder="Registration">
                        <option value="1">Business</option>
                        <option value="2">Investor</option>                        
                    </select> <span class="help-inline">What are you registering</span>
                    <a href="#"><i class="icon-question-sign" data-toggle="popover" data-placement="top" data-html="true" title="Registration Type" data-content="Register a Project if you are going to raise capital!"></i></a>                    
                    <br> <span id="spn_invtyp"><select id="investor_type" class="span2" placeholder="Investor Type" required>
                            <option value="U">Un-Accredited</option>
                            <option value="A">Accredited</option>
                        </select>
                        <span class="help-inline">What type of Investor are you</span>
                        <a href="#"><i class="icon-question-sign" data-toggle="popover" data-placement="top" data-html="true" title="Accredited Investor" data-content="An accredited investor is someone who is meets certain financial criteria! Please check on the <a href=#>SEC website</a> to learn more!!"></i></a>
                    </span>
                    <br> <label class="checkbox"><input type="checkbox" id="pptosnda" name="pptosnda" value="1" required>
                        I agree to the <a href="#" id="lnk_pp">privacy policy</a> and <a href="#" id="lnk_tos">terms of service</a> <!-- and the <a href="#" id="lnk_nda">non-disclosure agreement</a>-->.</label>
                </form>
            </fieldset>
        </div>
        <div class="modal-footer">
            <button class="btn" data-dismiss="modal">Close</button>
            <button class="btn btn-primary" id="btn_nxt_user">Next</button>
        </div>
    </div>

    <!-- PROJECT -->
    <div id="mdl_project" class="modal hide fade" tabindex="-1"
         role="dialog" data-backdrop="static" data-keyboard="false">
        <div class="modal-header">
            <!-- <button type="button" class="close" data-dismiss="modal">×</button>  -->
            <h3>Registration: Step 2</h3>
        </div>
        <div class="modal-body">
            <fieldset>
                <legend>Please tell us about your business!</legend>
                <form id='frm_project'>
                    <br> <input type='text' id='project_name' name='project_name' class='input-large'
                                placeholder='Project Name' required minlength="2" maxlength="20"> 
                    <br><textarea rows='3' id='summary' name='summary' class='input-xlarge'
                                  placeholder='Summary - minimuum characters 20, maximum characters 500' style='width: 500px' required minlength="20" maxlength="500"></textarea>						
                    <br><textarea rows='10' id='description' name='description' class='input-xlarge'
                                  placeholder='Description - minimuum characters 200, maximum characters 5000' style='width: 500px' required minlength="200" maxlength="5000"></textarea>
                    <br> <input type='text' id='video_url'
                                class='input-xlarge' placeholder='Video Url' url="true">					
                    <br> <input type='text' id='target_amount' name='target_amount' class='input-medium' placeholder='Target Amount' required><!-- number="true" min="1000" max="1000000"> -->
                </form>
            </fieldset>
        </div>
        <div class="modal-footer">
            <!-- <button class="btn" data-dismiss="modal">Close</button>  -->
            <!-- <button class="btn" data-dismiss="modal" id='btn_bk_project'>Back</button>  -->
            <button class="btn btn-primary" id="btn_nxt_project">Next</button>
        </div>
    </div>

    <!-- LOCATION -->
    <div id="mdl_location" class="modal hide fade" tabindex="-1"
         role="dialog" data-backdrop="static" data-keyboard="false">
        <div class="modal-header">
            <!-- <button type="button" class="close" data-dismiss="modal">×</button>  -->
            <h3>Registration: Step 3</h3>
        </div>
        <div class="modal-body">
            <fieldset>
                <legend>Please give us some more details</legend>
                <form id='frm_location'>
                    <br> <input type='text' id='address' name='address'
                                class='input-xlarge' placeholder='Address' required minlength="5" maxlength="40"> <br> <input
                                type='text' id='city' name='city' class='input-medium'
                                placeholder='City'  required minlength="2" maxlength="20" lettersonly="true"> <input type='text' id='state'
                                class='input-mini uneditable-input' data-provide='typeahead' data-items='4' value="Georgia" disabled> 						
                    <input type='text'
                           id='zip' name='zip' class='input-mini zipcode' placeholder='Zip' required>
                    <br><input type='text'
                               id='phone1' name='phone1' class='input-medium phone' placeholder='Phone Number' required phoneUS=true>
                    <br><input type='text'
                               id='mobile' name='mobile' class='input-medium phone' placeholder='Mobile Number' phoneUS=true>
                    <br><input type='text'
                               id='fax' name='fax' class='input-medium phone' placeholder='Fax Number' phoneUS=true>												
                    <!-- <input type='text' id='country' class='input-medium'
                            placeholder='Country'>-->
                    <br> <input type='text' id='website' name='website'
                                class='input-xlarge' placeholder='Website' url="true">
                    <div class="input-prepend">
                        <span class="add-on"><img src='img/facebook.png'></span> <input
                            type='text' id='facebook' class='input-xlarge'
                            placeholder='Facebook URL'>
                    </div>
                    <div class="input-prepend">
                        <span class="add-on"><img src='img/googleplus.png'></span> <input
                            type='text' id='google_plus' name='google_plus' class='input-xlarge'
                            placeholder='Google+  URL'>
                    </div>
                    <div class="input-prepend">
                        <span class="add-on"><img src='img/twitter.png'></span> <input
                            type='text' id='twitter' name='twitter' class='input-xlarge'
                            placeholder='Twitter URL'>
                    </div>
                    <div class="input-prepend">
                        <span class="add-on"><img src='img/linkedin.png'></span> <input
                            type='text' id='linkedin' name='linkedin' class='input-xlarge'
                            placeholder='LinkedIn URL'>
                    </div>
                </form>
            </fieldset>
        </div>			
        <div class="modal-footer">
            <!-- <button class="btn" data-dismiss="modal">Close</button>  -->
            <!-- <button class="btn" data-dismiss="modal" id='btn_bk_location'>Back</button>  -->
            <button class="btn btn-primary" id="btn_nxt_location">Continue</button>
        </div>
    </div>

    <!--  ========================== UPLOAD ======================= -->
    <div id="mdl_upload" class="modal hide fade" tabindex="-1" role="dialog"
         data-backdrop="static" data-keyboard="false">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" id="btn_upl_cls1">×</button>
            <h3>Registration: Step 4 (Optional)</h3>
        </div>
        <div class="modal-body">
            <fieldset>
                <legend>Upload Files</legend>														
                <iframe id="frame_files" src='' style='border: 0px; width: 100%; height: 1200px' scrolling='no'></iframe>
            </fieldset>
        </div>
        <div class="modal-footer">
            <button class="btn btn-primary" data-dismiss="modal" id="btn_upl_cls2">Finish</button>			
        </div>
    </div>
    <!-- ====================== PP TOS NDA ============================ -->	
    <div id="mdl_pptosnda" class="modal hide fade" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false" style="top: 10px; bottom: 10px">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" id="cls_pptosnda">×</button>
            <h3 id="hdr_pptosnda"></h3>
        </div>		
        <iframe id="frame_pptosnda" src='' style='border: 0px; width: 100%; height: 90%' scrolling='no'></iframe>
        <div id="div_acc">
            <div class="well-small"><small>By pressing the "I Agree" button below, you attest that you have read and/or completed this questionnaire truthfully and accurately in all respects and that you 
                    have read and agreed to the terms of the Privacy Policy and Legal Notices of this Site, which you should read carefully. 
                    In connection with the accompanying Accredited Investor Questionnaire, you hereby, warrant, represent and certify to Finance Georgia Online Inc. 
                    that you meet the requirements of an Accredited Investor as defined above.</small></div>		
            <div class="modal-footer">	
                <button class="btn btn-primary" data-dismiss="modal" id="btn_acc_cont">I Agree</button>			
            </div>
        </div>
    </div>
    <!-- / PP TOS NDA  -->	