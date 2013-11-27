<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="java.util.regex.*"%>
<%@page import="echosign.api.clientv16.*"%>
<%@page import="echosign.api.clientv16.dto.*"%>
<%@page import="echosign.api.clientv16.dto7.*"%>
<%@page import="echosign.api.clientv16.dto8.*"%>
<%@page import="echosign.api.clientv16.dto9.*"%>
<%@page import="echosign.api.clientv16.dto12.*"%>
<%@page import="echosign.api.clientv16.dto14.*"%>
<%@page import="echosign.api.clientv16.dto15.*"%>
<%@page import="echosign.api.clientv16.dto16.*"%>
<%@page import="echosign.api.clientv16.service.*"%>
<%@page import="org.apache.commons.io.IOUtils"%>


<%
	echosign.api.demo.EchoSignDocumentServiceDemoExtended e = new echosign.api.demo.EchoSignDocumentServiceDemoExtended();
	//out.println(e.createEmbeddedWidget("https://secure.echosign.com/services/EchoSignDocumentService16", "W8KKB42KXW34XN", "Business_Plan_Template_Executive_Summary.pdf"));
	String url =  "https://secure.echosign.com/services/EchoSignDocumentService16";
	String apiKey = "W8KKB42KXW34XN";
	String fileName = "E:/GIT/MyRepos/GAFinance2/web/test/echosign_template.docx";
		
	WidgetCreationInfo widgetInfo = new WidgetCreationInfo();
	widgetInfo.setName("Test embedded widget " + new Date());
	widgetInfo
			.setFileInfos(createArrayOfFileInfos(new String[] { fileName }));

	EmbeddedWidgetCreationResult result = getService(url)
			.createEmbeddedWidget(apiKey, null, widgetInfo);

	if (result.isSuccess()){
		out.println(result.getJavascript());
		String key = result.getDocumentKey();
		out.println("<p>Document Key: " + key);
		/** need to spawn a thread
		* to track and download signed document esp one for two signators
		*/		
		/*Thread t = new Thread(); 
		(new Thread).run({
		GetFormDataResult getFormDataResult = getService(url).getFormData(apiKey, key);
	    while (!getFormDataResult.isSuccess()) {
	    	getFormDataResult = getService(url).getFormData(apiKey, key);
	    	try {wait(1000);}catch(Exception ex1){}
	    }	
	      out.println("<p>Form Data CSV Values:");
	      out.println(getFormDataResult.getFormDataCsv());
		});*/
	    //} else {
	    //  out.print("<p>Error getting form data: " + getFormDataResult.getErrorCode());
	    //  if (getFormDataResult.getErrorMessage() != null)
	    //    out.println(" " + getFormDataResult.getErrorMessage());
	    //  else
	    //    out.println();
	    //}				
	}else{
		out.println("<p>Return code: "
				+ result.getErrorCode()
				+ " "
				+ ((result.getErrorMessage() != null) ? result
						.getErrorMessage() : ""));
	}
%>
<%!
protected static ArrayOfFileInfo createArrayOfFileInfos(String[] fileNames) throws IOException
{
  ArrayOfFileInfo fileInfos = new ArrayOfFileInfo();
  for (String fileName : fileNames) {
    File file = new File(fileName);
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    IOUtils.copy(new FileInputStream(file), bytes);

    FileInfo fileInfo = new FileInfo();
    fileInfo.setFileName(file.getName());
    fileInfo.setFile(bytes.toByteArray());
    
    fileInfos.getFileInfo().add(fileInfo);
  }
  return fileInfos;
}

private static EchoSignDocumentService16PortType cachedService;

protected static EchoSignDocumentService16PortType getService(String url) {
    if (cachedService == null) {
      EchoSignDocumentService16Client client = new EchoSignDocumentService16Client();
      cachedService = client.getEchoSignDocumentService16HttpPort(url);
    }
    return cachedService;
  }
%>