<%@include file="logging.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>File Upload</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery.js"></script>
<script src="../js/jquery.validate.min.js"></script>
<script src="../js/additional-methods.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</head>
<body>
	<%
		String folder = request.getParameter("folder");
		String filename = request.getParameter("filename");
		//if (folder != null)
		//	session.setAttribute("folder", folder);
		//if (filename != null)
		//	session.setAttribute("filename", filename);
		//folder = (String) session.getAttribute("folder");
		//filename = (String) session.getAttribute("filename");
	%>


	<%@page import="java.io.*"%>
	<%@page import="java.util.*"%>
	<%@page import="org.apache.commons.fileupload.servlet.*"%>
	<%@page import="org.apache.commons.fileupload.*"%>
	<%@page import="org.apache.commons.fileupload.disk.*"%>

	<%
		boolean isMultipartContent = ServletFileUpload
				.isMultipartContent(request);
		if (!isMultipartContent) {
			logger.info("Nothing to upload!!");
			//return;
		} else {

			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				List<FileItem> fields = upload.parseRequest(request);
				logger.info("Number of fields: " + fields.size());
				Iterator<FileItem> it = fields.iterator();
				if (!it.hasNext()) {
					logger.info("No fields found");
					return;
				}

				InputStream filecontent = null;
				String fn = null;
				while (it.hasNext()) {
					FileItem fileItem = it.next();
					boolean isFormField = fileItem.isFormField();
					if (isFormField) {
						System.out
								.println("Regular form field - FIELD NAME: "
										+ fileItem.getFieldName()
										+ " STRING: "
										+ fileItem.getString());
						if (((String) fileItem.getFieldName())
								.equals("folder"))
							folder = fileItem.getString();
						if (((String) fileItem.getFieldName())
								.equals("filename"))
							filename = fileItem.getString();
					} else {
						logger.info("file form field - FIELD NAME: "
								+ fileItem.getFieldName() + "\nNAME: "
								+ fileItem.getName() + "\nCONTENT TYPE: "
								+ fileItem.getContentType()
								+ "\nSIZE (BYTES): " + fileItem.getSize()
								+ "\nTO STRING: " + fileItem.toString());
						filecontent = fileItem.getInputStream();
						fn = fileItem.getName();
					}
				}
				if (!fn.equals("")) {
					//get file extension by first reversing the file name since it can contain more than one '.'
					String ext = (new StringBuilder(fn)).reverse()
							.toString();
					ext = ext.substring(0, ext.indexOf("."));
					ext = new StringBuilder(ext).reverse().toString();
					//create dir by userid or projectid					
					File fd = new File(
							getServletContext().getInitParameter("PATH") + "/data/" + folder);
					logger.info("File exists: "+fd.exists());
					fd.mkdir();
					//}
					String fn1 = fd + "/" + filename; //fileItem.getFieldName()
					//+ "." + ext;
					//write to file
					OutputStream out1 = new FileOutputStream(new File(fn1));
					int read = 0;
					final byte[] bytes = new byte[1024];
					while ((read = filecontent.read(bytes)) != -1) {
						out1.write(bytes, 0, read);
					}
					out1.close();
					filecontent.close();
				}
			} catch (FileUploadException e) {				
				logger.info("Error: " + e);
				throw new Exception(e);
			} catch (Exception e) {
				logger.info("Error: " + e);
				throw new Exception(e);
			}

		}//end of if multipart
%>
<table>
<tr valign="top"><td>
<form name="frm_file" id="frm_file" action="fileupload.jsp"
	method="post" enctype="multipart/form-data" style="border:0px solid black">
	<input type="hidden" name="folder" value="<%=folder%>">
	<input type="hidden" name="filename" value="<%=filename%>">
	<input type="file" size="50" id="file1" name="file1">
	<br><input type="submit" value="Upload">
</form>
</div>
<td>
<%
		Random rand = new Random();		
		logger.info("folder/file: " + folder + "/" + filename);
		//check if file exists so as not to show ugly thumb
		File fd = new File(getServletContext().getInitParameter("PATH") + "/data/" + folder	+ "/" + filename);		
		logger.info("File Exists: " + fd.exists());
		if (fd.exists()) {
			//display whats in folder or what is uploaded
			if (filename.indexOf("pdf") != -1) {
				out.println("<iframe class='help-inline' src='../data/"
						+ folder
						+ "/"
						+ filename
						+ "' style='border:0px;height:240px;width:200px;cursor:pointer' id='frame_docs' data-toggle='tooltip'></iframe>"); //data-placement='right' title='Click to Enlarge!'
			} else {
				out.println("<img src='../data/" + folder + "/" + filename
						+ "?t='" + rand.nextFloat() + " style='height:150px;width:150px;cursor:pointer' id='img_pics' />"); //data-toggle='tooltip' data-placement='right' title='Click to Enlarge!'
			}
		}
	%>
</table>
	<script>
		//$("[data-toggle=tooltip]").tooltip();
	
		$("#frm_file").validate({
			rules : {
				file1 : {extension : "jpg|jpeg|pdf"}
			},
			messages : {
				file1 : {extension : "<span class='text-error'>Invalid file type!</span>" 	}
			}
		});
		
		var mdlfview = function(){
			$('#mdl_fview').modal().css({
				width : function() {
					return ($(document).width() * .8) + 'px';
				},
				'margin-left' : function() {
					return -($(this).width() / 2);
				}
			});
			$('#mdl_fview').modal('show');		
		};		
		
		/*$('#frame_docs').click(function() {
			$('#hdr_fview').html('<%=filename%>');
			$('#frame_fview').attr('src',src='../data/<%=folder%>/<%=filename%>?t=' + Math.random());	
			mdlfview();	
		});

		$('#img_pics').click(function() {
			$('#hdr_fview').html('<%=filename%>');
			$('#frame_fview').attr('src',src='../data/<%=folder%>/<%=filename%>?t=' + Math.random());	
			mdlfview();	
		});*/

		
				
	</script>
	
<!-- ====================== Full View ============================ -->	
<div id="mdl_fview" class="modal hide fade" tabindex="-1" role="dialog" data-backdrop="static" data-keyboard="false" style="top:10px;bottom:10px;">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">×</button>
			<h3 id="hdr_fview"></h3>
	</div>	
		<iframe id="frame_fview" src='' style='border: 0px; width: 100%; height: 90%' scrolling='no'></iframe>		
</div>
<!-- / Full View -->	

</body>
</html>