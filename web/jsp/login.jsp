
<%@include file="db.jsp"%>
<%	
	//session.setMaxInactiveInterval(25);
	String username = request.getParameter("username");
	String password = request.getParameter("password");	
	try {		
		String qry = "select id, role_id, last_name, first_name, email, locked from user where username = ? and password1 = SHA1(?)";
		logger.info(qry);
		PreparedStatement pstmt = con.prepareStatement(qry);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			if(rs.getInt(6)==1){
				out.println("Account locked out! Please reset the password to continue!");
			}else{
				session.setAttribute("username", username);
				session.setAttribute("userid", rs.getString(1));
				session.setAttribute("roleid", rs.getString(2));
				session.setAttribute("emailid", rs.getString(5));
				out.println("success," + session.getId() + "," + rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4));	
			}			
		} else {
			out.println("Login Failed! Invalid username or password!!");
			String loginattempt = (String)session.getAttribute("loginattempt");			
			int la=0;
			if(loginattempt!=null) la = Integer.parseInt(loginattempt);
			logger.info("login attempt: " + loginattempt + " , " + la);
			la++;
			session.setAttribute("loginattempt", ""+la);			
			if(la>5) out.println("Too many failed login attempts. Please reset the password to continue!");
			pstmt = con.prepareStatement("update user set locked=1 where username = ?");
			pstmt.setString(1, username);			
			pstmt.executeUpdate();
		}		
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