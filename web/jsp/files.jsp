<!DOCTYPE html>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<%
String roleid = (String)session.getAttribute("roleid");
String userid = (String)session.getAttribute("userid");
//if(roleid==null) roleid = request.getParameter("roleid"); //** sec prob. someone can get it directly
//if(userid==null) userid = request.getParameter("userid");
System.out.println("Files Page (userid , role): " + userid + "," + roleid);
if(roleid.equals("1")){ 
	out.println("<strong>Profile Picture</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=profilepic.jpg' style='border:0px solid red; width: 100%' scrolling='no'></iframe>");
	out.println("<strong>Project Picture</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=projectpic.jpg' style='border:0px solid red; width: 100%' scrolling='no'></iframe>");
	out.println("<strong>Executive Summary</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=executivesummary.pdf' style='border:0px solid red; width: 100%;height: 250px;' scrolling='no'></iframe>");
	out.println("<strong>Business Plan</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=businessplan.pdf' style='border:0px solid red; width: 100%;height: 250px;' scrolling='no'></iframe>");
	out.println("<strong>Financials</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=financials.pdf' style='border:0px solid red; width: 100%;height: 250px;' scrolling='no'></iframe>");
}else{
	out.println("<strong>Profile Picture</strong><iframe src='fileupload.jsp?folder=" + userid + "&filename=profilepic.jpg' style='border:0px solid red; width: 100%' scrolling='no'></iframe>");
}
%>
