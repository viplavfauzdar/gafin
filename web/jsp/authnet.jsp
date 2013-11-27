<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery.js"></script>
<script src="../js/jquery.validate.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</head>

<body>
<%@ page errorPage="error.jsp" %>
<%@ page import="net.authorize.sim.*" %>

<%
    String apiLoginId = "7Rb74uuAb";//"YOUR_API_LOGIN_ID";
    String transactionKey = "32szFaaUAF6P498S";//"YOUR_TRANSACTION_KEY";
    //String relayResponseUrl = "http://24.126.149.255:8081/gafin/jsp/authnetresp.jsp";//relay_response.jsp";
    String relayResponseUrl = getServletContext().getInitParameter("HOSTURL") + "/jsp/authnetresp.jsp";
	//String relayResponseUrl = "http://app1-gafinance.rhcloud.com/jsp/authnetresp.jsp";

    String amount = "0.99";
    Fingerprint fingerprint = Fingerprint.createFingerprint(
        apiLoginId,
        transactionKey,
        1234567890,  // random sequence used for creating the finger print
        amount);

    long x_fp_sequence = fingerprint.getSequence();
    long x_fp_timestamp = fingerprint.getTimeStamp();
    String x_fp_hash = fingerprint.getFingerprintHash();
    
%>

<h4>Authorize.net payment</h4>
<FORM NAME='secure_redirect_form' ID='secure_redirect_form_id'
 ACTION='https://test.authorize.net/gateway/transact.dll' METHOD='POST' class="form-inline">
  <input type='text' class='input-medium' name='x_card_num' id='x_card_num' minlength='15' required number="true" placeholder='Credit Card Number'>    
  <input type='text' class='input-small' name='x_exp_date' minlength='5' required placeholder='Exp(mm/yy)'>
  <input type='text' class='input-small' name='x_amount' size='9' readonly value='<%=amount%>' required number='true' placeholder='Amount' min='0' max='10000'>
  <INPUT TYPE='HIDDEN' NAME='x_invoice_num' VALUE='<%=System.currentTimeMillis()%>'>
  <INPUT TYPE='HIDDEN' NAME='x_relay_url' VALUE='<%=relayResponseUrl%>'>
  <INPUT TYPE='HIDDEN' NAME='x_login' VALUE='<%=apiLoginId%>'>
  <INPUT TYPE='HIDDEN' NAME='x_fp_sequence' VALUE='<%=x_fp_sequence%>'>
  <INPUT TYPE='HIDDEN' NAME='x_fp_timestamp' VALUE='<%=x_fp_timestamp%>'>
  <INPUT TYPE='HIDDEN' NAME='x_fp_hash' VALUE='<%=x_fp_hash%>'>
  <INPUT TYPE='HIDDEN' NAME='x_version' VALUE='3.1'>
  <INPUT TYPE='HIDDEN' NAME='x_method' VALUE='CC'>
  <INPUT TYPE='HIDDEN' NAME='x_type' VALUE='AUTH_CAPTURE'>
  <INPUT TYPE='HIDDEN' NAME='x_amount' VALUE='<%=amount%>'>
  <INPUT TYPE='HIDDEN' NAME='x_test_request' VALUE='FALSE'>
  <INPUT TYPE='HIDDEN' NAME='notes' VALUE='extra hot please'>
  <INPUT TYPE='SUBMIT' NAME='buy_button' VALUE='Invest' class="btn btn-warning">
</FORM>

<script>
$("#secure_redirect_form_id").validate({				
showErrors: function(errorMap, errorList) {
    $.each(this.successList, function(index, value) {
      return $(value).popover("hide");
    });
    return $.each(errorList, function(index, value) {
      var _popover;
      _popover = $(value.element).popover({
        trigger: "manual",
        placement: "bottom",
        content: value.message,
        template: "<div class=\"popover\"><div class=\"arrow\"></div><div class=\"popover-inner\"><div class=\"popover-content\"><p></p></div></div></div>"
      });
      _popover.data("popover").options.content = value.message;
      return $(value.element).popover("show");
    });
  }	
});
</script>


</body>
</html>
