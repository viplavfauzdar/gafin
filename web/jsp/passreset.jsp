<%@include file="db.jsp"%>
<%@page import="com.gafinance.utils.SendMail"%>
<%
	String action = request.getParameter("action");
	String username = request.getParameter("username");	
	String key = request.getParameter("key");
	try {
		PreparedStatement pstmt = null;
		if(action==null){
			String qry = "select first_name, last_name, email from user where username = ?";
			logger.info(qry);
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, username);		
			ResultSet rs = pstmt.executeQuery();
			key = session.getId();
			if (rs.next()) {
				String message = "Hello " + rs.getString(1) + " " + rs.getString(2) + ",<p> Please click on the link below to rest your password<p>" + getServletContext().getInitParameter("HOSTURL") + 
						"/jsp/passreset.jsp?action=reset&username=" + username + "&key=" + key;
				logger.info("Password reset request email: " + rs.getString(3) + " Message: " + message);
				SendMail s = new SendMail();
				s.Send(getServletContext().getInitParameter("WEBSITE_EMAIL"), getServletContext().getInitParameter("WEBSITE_EMAIL_PASS"), rs.getString(3), getServletContext().getInitParameter("WEBSITE_EMAIL"), "Georgia Finance password reset request!", message);
				out.println("An email message has been sent with <br>instructions to reset your password!");		
			}
			pstmt = con.prepareStatement("update user set passreset_key=? where username=?");
			pstmt.setString(1, key);
			pstmt.setString(2, username);			
			logger.info("Password reset key update result: " + pstmt.executeUpdate());
		}else{%>
			<!DOCTYPE html>
			<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
			<script src="../js/jquery-1.10.2.min.js"></script>
			<script src="../js/bootstrap.min.js"></script>
			<script src="../js/jquery.validate.min.js"></script>
			<script src="../js/additional-methods.min.js"></script>
			<script src="../js/jquery.maskedinput.js"></script>
			<script src="../js/jquery.number.min.js"></script>
			<script src="../js/gafin.js"></script>
			<div class='container'>						
				<div class="row">
					<div class="span3">
						<img src="../img/finga_logo.png" alt="Logo goes here!" style="height: 80px;margin: 5px"/> 
					</div>
					<div class="span9">
						<h1 class="text-info">Password Reset Form</h1>
					</div>
				</div>
		<%
			String password = request.getParameter("password1");
			if(password==null){%>
				<div class='row well'>
					<form method='get' id='frm_passreset' name='frm_passreset'>
						<input type='hidden' id='action' name='action' value='doreset'>
						<input type='hidden' id='username' name='username' value='<%=username%>'>
						<input type='hidden' id='key' name='key' value='<%=key%>'>				
						<br><input type='password' id='password1' name='password1' placeholder='Password' required>
						<br><input type='password' id='password2' name='password2' placeholder='Confirm password' required equalTo='#password1'>
						<br><button class='btn btn-danger' type='submit'>Reset Password</button>
					</form>
				</div>			
			<%}else{
				pstmt = con.prepareStatement("update user set locked=null, passreset_key=null, password1=SHA1(?) where username=? and passreset_key=?");
				pstmt.setString(1, password);
				pstmt.setString(2, username);
				pstmt.setString(3, key);
				if(pstmt.executeUpdate()==1)
					out.println("<h4 class='text-success'>Password reset successful! Please <a href='../index.html'>login</a> to continue</h2>");
				else
					out.println("<h4 class='text-error'>Password could not be reset. Please try again!</h2>");					
			}
			%>
			</div>				
			<script>
				validateForm("#frm_passreset","right");
			</script>
		<%}
	} catch (Exception e) {		
		logger.severe("Error: " + e);
		throw new Exception(e);
	} finally {
		try {
			if (con != null) {
				con.close();
			}			
		} catch (Exception e) {
		}
	}
%>