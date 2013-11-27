<%@page import="com.gafinance.utils.EchoSign"%>
<%@page import="echosign.api.dto16.DocumentKey"%>
<%@page import="java.util.logging.*"%>
<%
    Logger logger = Logger.getLogger(this.getClass().getName());
    if (request.getParameter("callback") == null) {
        EchoSign es = new EchoSign(
                "https://secure.echosign.com/services/EchoSignDocumentService16",
                "W8KKB42KXW34XN", "E:/netbeans_workspace/gafin/web/docs/listingagreement.pdf",
                "", "https://24.126.149.255/gafin/test/estest.jsp?callback=true");
        String url = es.createPersonalUrl("fauz@fauz.com");
        String dockey = es.getDocumentKey();
        logger.info(dockey);
        url = url.replace("hostedForm?formid=", "embedesignhtml?rdid=");		
        out.println("<iframe src=" + url + " style='border: 0px; width: 100%; height: 90%' scrolling='no'></iframe>");
    } else {
        logger.info(request.getQueryString());
        String documentKey = request.getParameter("documentKey");
        String widgetKey = request.getParameter("widgetKey");
        logger.info(documentKey + " , " + widgetKey);
        EchoSign es = new EchoSign("https://secure.echosign.com/services/EchoSignDocumentService16",
                "W8KKB42KXW34XN", "",
                "E:/netbeans_workspace/gafin/web/test/listingagreement_" + (new java.util.Date()).getTime() + ".pdf", "");
        String returnfilename = es.getDocuments(documentKey);
        out.println(returnfilename);
    }
%>