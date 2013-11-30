<%@page import="com.gafinance.utils.EchoSign"%>
<%@page import="echosign.api.dto16.DocumentKey"%>
<%@page import="java.util.logging.*"%>
<%
    Logger logger = Logger.getLogger(this.getClass().getName());
    String dockey=null;
    if (request.getParameter("callback") == null) {
        EchoSign es = new EchoSign(
                "https://secure.echosign.com/services/EchoSignDocumentService16",
                "WKAPQRU2PN3FXB", "E:/netbeans_workspace/gafin/web/docs/listingagreement.docx",
                "", "https://50.155.52.170/gafin/test/estest.jsp?callback=true");
        String url = es.createPersonalUrl("fauz@fauz.com");
        //es.createPersonalWidget("fauz@fauz.com");        
        dockey = es.getDocumentKey();
        Byte b = Byte.valueOf(dockey);
        logger.info(b.toString());
        
        //logger.info(new String(org.apache.commons.codec.binary.Base64.decodeBase64(dockey),"UTF-8"));
        //logger.info(javax.mail.internet.MimeUtility.decodeText(dockey));
        //logger.info(new String(org.apache.axis.encoding.Base64.decode(dockey)));
        //logger.info(javax.mail.internet.MimeUtility.decodeWord(dockey));
        //out.println(es.getJS());
        url = url.replace("hostedForm?formid=", "embedesignhtml?rdid=");		
        out.println("<iframe src=" + url + " style='border: 0px; width: 100%; height: 90%' scrolling='no'></iframe>");
    } else {
        logger.info(request.getQueryString());
        String documentKey = request.getParameter("documentKey");
        String widgetKey = request.getParameter("widgetKey");
        logger.info(documentKey + " , " + widgetKey);
        EchoSign es = new EchoSign("https://secure.echosign.com/services/EchoSignDocumentService16",
                "WKAPQRU2PN3FXB", "",
                "E:/netbeans_workspace/gafin/web/test/listingagreement.pdf", "");
        logger.info(es.getPort().getFormData("XLTDZ5434E4N75", dockey).getFormDataCsv());
        String returnfilename = es.getDocuments(documentKey);
        logger.info(returnfilename);
        out.println("success!!");
    }
    
     
%>