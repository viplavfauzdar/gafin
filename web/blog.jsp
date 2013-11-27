<%response.addHeader("X-Frame-Options", "ALLOW-FROM //wp-gafinance.rhcloud.com"); %>
<div class="container">	
	<ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active">Blog</li>
	</ul>
	<h2 style="text-align: center">Latest Updates</h2>
	<div class="well">
	<iframe src="<%=getServletContext().getInitParameter("BLOG_URL")%>/?author=1" style="border:0;height:800px;width:100%"></iframe>
	</div>
</div>