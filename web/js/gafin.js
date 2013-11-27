/**
 * Author: Viplav Fauzdar version: 1.0.0 Date: 07/15/2013
 */

/*
 * Common JS
 * */

//global error handler for ajax errors
$(document).ajaxError(function(event, jqxhr, settings, exception) {
	 if(jqxhr.responseText!="") appalert("Ajax Error: " + jqxhr.responseText,"error");
	 loaderOff();
});

var testfunc=function(){
	alert('This should be visible from all pages');
};

//message alerts - for some reason I need in some ajax returned pages but not in others
var appalert = function(m,c) {
	//alert(window.location);
	$('#alert_msg').html('<strong>' + m + '</strong>');		
	if(c=='info'){
		$("#alert_main").removeClass("alert-error");
		$("#alert_main").removeClass("alert-success");
		$("#alert_main").addClass("alert-info");
	}
	if(c=='success'){
		$("#alert_main").removeClass("alert-error");
		$("#alert_main").removeClass("alert-info");
		$("#alert_main").addClass("alert-success");
	}
	if(c=='error'){
		$("#alert_main").removeClass("alert-info");
		$("#alert_main").removeClass("alert-success");
		$("#alert_main").addClass("alert-error");
	}			
	$("#alert_main").alert().hide();	
	$("#alert_main").alert().show();
	$("#alert_main").delay(0).addClass("in").fadeOut(8000);							
};


//$('form').each(function () {		
//$(this).validate({		
//});
var validateForm = function(formname, plcmnt){
	$(formname).validate({				
		showErrors: function(errorMap, errorList) {
	    $.each(this.successList, function(index, value) {
	      return $(value).popover("hide");
	    });
	    return $.each(errorList, function(index, value) {
	      var _popover;
	      _popover = $(value.element).popover({
	        trigger: "manual",
	        placement: plcmnt,
	        content: value.message,
	        template: "<div class=\"popover\"><div class=\"arrow\"></div><div class=\"popover-inner\"><div class=\"popover-content\"><p></p></div></div></div>"
	      });
	      _popover.data("popover").options.content = value.message;
	      return $(value.element).popover("show");
	    });
	  }	
	});
};

jQuery.validator.addMethod("password", function( value, element ) {
	var result = this.optional(element) || value.length >= 8 && /\d/.test(value) && /[a-z]/i.test(value);
	if (!result) {
		//element.value = "";
		var validator = this;
		setTimeout(function() {
			validator.blockFocusCleanup = true;
			element.focus();
			validator.blockFocusCleanup = false;
		}, 1);
	}
	return result;
}, "Your password must be at least 8 characters long and contain at least one number and one character.");

var confirmdialog = function(msg,callback){
  $('#confirm_msg').html(msg);
  $('#mdl_confirmdialog').modal('show');    
  $('#btn_yes').click(function(){
    if(callback) callback(true);
    $('#btn_yes').unbind('click');
  });
  $('#btn_no').click(function(){
    if(callback) callback(false);
    $('#btn_no').unbind('click');
  });    
};

function setCookie(c_name,value,ms){
	var exdate=new Date();
	exdate.setTime(exdate.getTime() + ms);
	var c_value=escape(value) + ((ms==null) ? "" : "; expires="+exdate.toUTCString());
	document.cookie=c_name + "=" + c_value;
}	

function getCookie(c_name){
	var c_value = document.cookie;
	var c_start = c_value.indexOf(" " + c_name + "=");
	if (c_start == -1){
  		c_start = c_value.indexOf(c_name + "=");
  	}
	if (c_start == -1){
  		c_value = null;
  	}else{
	  c_start = c_value.indexOf("=", c_start) + 1;
	  var c_end = c_value.indexOf(";", c_start);
	if (c_end == -1){
		c_end = c_value.length;
	}
	c_value = unescape(c_value.substring(c_start,c_end));
	}
	return c_value;
}	

//** end common js

/*
 *  JS for projectwidget 
 *  */
// just wont work
//** end js for projectwidget

