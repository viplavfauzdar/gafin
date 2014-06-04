<%@include file="db.jsp"%>
<%
	try {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");		
		String userid = (String)session.getAttribute("userid");		
		String action = request.getParameter("action");
		String table = request.getParameter("table");
					
		String paramname = "", paramvalue = "", fields="", values = "", insertqry = "", updateqry = "'", projectid = "", roleid = "", values2 = "";
		boolean parampassword = false; int colcount = 1; 
		java.util.Vector<String> vecvalues = new java.util.Vector<String>(); 
								
		for (java.util.Enumeration e = request.getParameterNames(); e
				.hasMoreElements();) {
			paramname = (String) e.nextElement();
			if(!paramname.equals("action") && !paramname.equals("table")){
				paramvalue = maskNullStr(request.getParameter(paramname));								 				
				
				//** XSS filtering using Jsoup
				paramvalue = org.jsoup.Jsoup.clean(paramvalue, org.jsoup.safety.Whitelist.basic());
				if(paramname.equals("description")) logger.info("DESC: " + paramvalue);
				
				// ** should simply check all fields
				paramvalue = paramvalue.replace("'", "\\'");
				//paramvalue = paramvalue.replaceAll("<br>", "\n");					
				//paramvalue = paramvalue.replaceAll("<br/>", "\n");
				paramvalue = paramvalue.replace("<br />", "\n");								

				if(paramname.equals("role_id")){
					session.setAttribute("roleid", paramvalue);
				}
				if(paramname.equals("email")){
					session.setAttribute("emailid", paramvalue);
				}
				logger.info(paramname + "=" + paramvalue);
				if(paramvalue!=null && !paramvalue.equals("null") && !paramvalue.equals("")){
					fields = fields  + "," +  paramname;					
					if(paramname.equals("password1")){
						values = values + "," + "SHA1('" + paramvalue + "')";
						values2 = values2 + ",SHA1(?)";
						updateqry = updateqry + paramname + "=SHA1(?),";
						vecvalues.addElement(paramvalue);						
					}else{
						values = values + "," + paramvalue;
						values2 = values2 + ",?";
						vecvalues.addElement(paramvalue);						
						updateqry = updateqry + paramname + "=?,";
					}					
				}
				colcount++;
			}
		}//** end for
		
		logger.info("Number of values: " + vecvalues.size());
		
		logger.info("UserID: " + userid + " table: " + table + " Action: " + action);
		if(userid!=null && !table.equals("user") && action==null) {
			fields = fields.substring(1,fields.length());
			fields = fields + ",user_id";
			values = "'" + userid + values;
			values2 = values2.substring(1,values2.length());
			values2 = values2 + ",?";
			vecvalues.addElement(userid);
		}else{
			fields = fields.substring(1,fields.length());
			values = values.substring(2,values.length());
			values2 = values2.substring(1,values2.length());
		}
		
		logger.info(values2);
		
		java.sql.Statement smt = con.createStatement();		
		if(action == null){
			//** source page is registration					
			insertqry = "insert into " + table + "(" + fields + ") values(" + values2 + ")";
			logger.info(insertqry);
			PreparedStatement pstmt = con.prepareStatement(insertqry,PreparedStatement.RETURN_GENERATED_KEYS);						
			for(int k=1;k<vecvalues.size()+1;k++){
				logger.info("PreparedStatement.setString(" + k + "," + vecvalues.elementAt(k-1) + ")");
				pstmt.setString(k, vecvalues.elementAt(k-1));			
			}
			
			pstmt.executeUpdate();						
			ResultSet rs = pstmt.getGeneratedKeys();
			String pkey= null;
			if(rs.next()) pkey = rs.getString(1);
			if(table.equals("user")) session.setAttribute("userid", pkey); //need it for file upload			
			if(table.equals("project"))	session.setAttribute("projectid", pkey);				
			logger.info("PKEY:" + pkey);
			out.println(pkey);
			
			if(table.equals("user")){
				//** create wordpress account
                                //** blog url disabled for now 06.03.2014
				/*String uri=getServletContext().getInitParameter("BLOG_URL") + "/vip-add-user.php?username=" + request.getParameter("username") + "&password1=" + request.getParameter("password1") + "&email=" + request.getParameter("email");
				logger.info(uri);
				java.net.URL url = new java.net.URL(uri);
				logger.info(""+url.openConnection().getContent());
				*/
                            
				//** send confirmation email
				com.gafinance.utils.SendMail s = new com.gafinance.utils.SendMail();
				s.Send(getServletContext().getInitParameter("WEBSITE_EMAIL"), getServletContext().getInitParameter("WEBSITE_EMAIL_PASS"), request.getParameter("email"), getServletContext().getInitParameter("WEBSITE_EMAIL"), "Thank you for registering with Finance Georgia", "<h4>Thank you for registering with Finance Georgia.</h4><h5>Please make a note of the information below:</h5><p><b>Username: </b>" + request.getParameter("username") + "<p><b>Password:</b> your chosen password<p>In addition a <u>blog account</u> has been created for you with the same username and password as above. <p>Please <a href=" + getServletContext().getInitParameter("BLOG_URL")+ "/wp-admin target=_new>click here</a> to access the blog and post your updates. <p>You should <u>log back</u> in to continue finishing your profile including setting up a <u>bank account</u> and uploading pictures and documents. <p>An email has also been sent to you with this information.<p>-Thanks <br><small>Finance Georgia Team.</small>");
			}
		}else{		
			//** update
			if(table.equals("user"))
				updateqry = "update " + table + " set " + updateqry.substring(1,updateqry.length()-1) + " where id=?";		
			else
				updateqry = "update " + table + " set " + updateqry.substring(1,updateqry.length()-1) + " where user_id=?";
			logger.info(updateqry);

			PreparedStatement pstmt = con.prepareStatement(updateqry);
			int kk=0;
			for(int k=1;k<vecvalues.size()+1;k++){
				logger.info("PreparedStatement.setString(" + k + "," + vecvalues.elementAt(k-1) + ")");
				pstmt.setString(k, vecvalues.elementAt(k-1));			
				kk=k;
			}
			pstmt.setString(kk+1,userid);
			out.println(pstmt.executeUpdate()); //** return rows update for success message in browser
		}
		
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