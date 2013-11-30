package com.gafinance.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.regex.Matcher;

import org.apache.commons.io.IOUtils;

import echosign.api.EchoSignDocumentService16Locator;
import echosign.api.EchoSignDocumentService16PortType;
import echosign.api.dto.CallbackInfo;
import echosign.api.dto.DocumentCreationInfo;
import echosign.api.dto.FileInfo;
import echosign.api.dto.SignatureFlow;
import echosign.api.dto.SignatureType;
import echosign.api.dto12.SendDocumentInteractiveOptions;
import echosign.api.dto14.DocumentContent;
import echosign.api.dto14.GetDocumentUrlsOptions;
import echosign.api.dto14.GetDocumentUrlsResult;
import echosign.api.dto14.GetDocumentsOptions;
import echosign.api.dto14.RecipientInfo;
import echosign.api.dto14.RecipientRole;
import echosign.api.dto14.SigningUrlResult;
import echosign.api.dto16.DocumentKey;
import echosign.api.dto16.EmbeddedWidgetCreationResult;
import echosign.api.dto16.GetDocumentsResult;
import echosign.api.dto16.UrlWidgetCreationResult;
import echosign.api.dto8.GetFormDataResult;
import echosign.api.dto8.WidgetCreationInfo;
import echosign.api.dto8.WidgetPersonalizationInfo;

/**
 * 
 */

/**
 * @author Viplav Fauzdar Date - 08/08/2013 This class uses Eclipse JAX-WS
 *         Client to connect to echosign SOAP web service
 * 
 */
public class EchoSign {

	private java.util.logging.Logger logger = java.util.logging.Logger
			.getLogger(this.getClass().getName());

	private String js = null, dockey = null, errorcode = null, url = null,
			apiKey = null, fileName = null, destfileName = null, callbackurl = null;
	long pollfreq = 10000;

	public String getJS() {
		return js;
	}

	public String getDocumentKey() {
		return dockey;
	}

	public String getError() {
		return errorcode;
	}
        
        public EchoSignDocumentService16PortType getPort(){
            return port;
        }

	public EchoSign(String url, String apiKey, String fileName,
			String destfileName, String callbackurl) throws Exception {
		this.url = url;
		this.apiKey = apiKey;
		this.fileName = fileName;
		this.destfileName = destfileName;
		this.callbackurl = callbackurl;
		
		port = getPort(url);
	}

	private static EchoSignDocumentService16PortType cachedPort;

	/**
	 * Get Port with URL. If URL is NULL then use default URL
	 * */
	protected static EchoSignDocumentService16PortType getPort(String url)
			throws Exception {
		if (cachedPort == null) {
			EchoSignDocumentService16Locator locator = new EchoSignDocumentService16Locator();
			if (url != null)
				cachedPort = locator
						.getEchoSignDocumentService16HttpPort(new java.net.URL(
								url));
			else
				cachedPort = locator.getEchoSignDocumentService16HttpPort();
		}
		return cachedPort;
	}

	public void test() throws Exception {
		logger.info("Ping test: " + getPort(url).testPing(apiKey).getMessage());
	}
	

	EchoSignDocumentService16PortType port;
	EmbeddedWidgetCreationResult widgetresult;
	
	public WidgetCreationInfo widgetInfo() throws Exception{
		WidgetCreationInfo widgetInfo = new WidgetCreationInfo();

		File file = new File(fileName);
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		IOUtils.copy(new FileInputStream(file), bytes);

		widgetInfo.setName("Embedded Widget");
		FileInfo[] fileInfos = { new FileInfo(bytes.toByteArray(), fileName,
				null, null, null, null, null) };
		widgetInfo.setFileInfos(fileInfos);
		
		widgetInfo.setSignatureFlow(SignatureFlow.SENDER_SIGNATURE_NOT_REQUIRED);//.fromString("SEQUENTIAL"));

		//SenderInfo senderinfo = new SenderInfo()); //** not needed. will default to api key owner	
		
		CallbackInfo callbackinfo = new CallbackInfo();
		callbackinfo.setSignedDocumentUrl(callbackurl);
		widgetInfo.setCallbackInfo(callbackinfo);		
		
		return widgetInfo;
	}

	public void createWidget() throws Exception {		
				
		widgetresult = port.createEmbeddedWidget(apiKey, null, widgetInfo());

		if (widgetresult.getSuccess()) {
				
			js = widgetresult.getJavascript();
			logger.info("EchoSign JS: " + js);
			dockey = widgetresult.getDocumentKey();
			logger.info("Document Key: " + dockey);						
						
		}
	}
        
        public void createPersonalWidget(String email) throws Exception {		
				
		widgetresult = port.createPersonalEmbeddedWidget(apiKey, null, widgetInfo(), new WidgetPersonalizationInfo(null, null, email, null, null));

		if (widgetresult.getSuccess()) {
				
			js = widgetresult.getJavascript();
			logger.info("EchoSign JS: " + js);
			dockey = widgetresult.getDocumentKey();
			logger.info("Document Key: " + dockey);	
                        //logger.info("Form Data:" + port.getFormData(apiKey, dockey).getFormDataCsv());
						
		}
	}
	
	public String createUrl() throws Exception{
		UrlWidgetCreationResult result = port.createUrlWidget(apiKey, null, widgetInfo());
		String url=null;
		if (result.getSuccess()){
			url = result.getUrl();
			dockey = result.getDocumentKey();
			logger.info("EchoSign CreateURL url: " + url);
			logger.info("EchoSign CreateURL doc key: " + dockey);
		}else{
			logger.severe("Error: " + result.getErrorCode());
		}
		return url;
	}
	
	public String createPersonalUrl(String email) throws Exception{
		UrlWidgetCreationResult result = port.createPersonalUrlWidget(apiKey, null, widgetInfo(),new WidgetPersonalizationInfo(null, null, email, null, null));
		String url=null;
		if (result.getSuccess()){
			url = result.getUrl();
			dockey = result.getDocumentKey();
			logger.info("EchoSign CreateURL url: " + url);
			logger.info("EchoSign CreateURL doc key: " + dockey);
		}else{
			logger.severe("Error: " + result.getErrorCode());
		}
		return url;
	}
	
	public void personalize(String email) throws Exception{
		WidgetPersonalizationInfo personalizationInfo = new WidgetPersonalizationInfo();
		personalizationInfo.setEmail(email);
		personalizationInfo.setReusable(false);
		EmbeddedWidgetCreationResult widgetresult1 = port.personalizeEmbeddedWidget(apiKey, widgetresult.getJavascript(), personalizationInfo);
		js =  widgetresult1.getJavascript();
		logger.info("Personalized EchoSign JS: " + js);
		dockey = widgetresult1.getDocumentKey();
		logger.info("Personalized Document Key: " + dockey);		
	}
	
	public DocumentKey[] sendDocument(String email1, String email2) throws Exception{
		DocumentCreationInfo docinfo = new DocumentCreationInfo();
		
		File file = new File(fileName);
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		IOUtils.copy(new FileInputStream(file), bytes);

		docinfo.setName("Test Widget");
		FileInfo[] fileInfos = { new FileInfo(bytes.toByteArray(), fileName,
				null, null, null, null, null) };
		docinfo.setFileInfos(fileInfos);
		
		docinfo.setName("Sent Document");
		
		RecipientInfo[] rcptinfo = {new RecipientInfo(email1,"",RecipientRole.SIGNER), new RecipientInfo(email2,"",RecipientRole.SIGNER)};
		docinfo.setRecipients(rcptinfo);
		docinfo.setSignatureType(SignatureType.ESIGN);
		docinfo.setSignatureFlow(SignatureFlow.SENDER_SIGNATURE_NOT_REQUIRED);
		
		CallbackInfo callbackinfo = new CallbackInfo();
		callbackinfo.setSignedDocumentUrl(callbackurl);
		docinfo.setCallbackInfo(callbackinfo);		
		
		DocumentKey[] dockeys = port.sendDocument(apiKey, null, docinfo);
		return dockeys;
	}
	
	//** doesnt do shit. not useful. just gives me the status
	public String sendDocumentInteractive(String email1, String email2) throws Exception{
		DocumentCreationInfo docinfo = new DocumentCreationInfo();
		
		File file = new File(fileName);
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		IOUtils.copy(new FileInputStream(file), bytes);

		docinfo.setName("Test Widget");
		FileInfo[] fileInfos = { new FileInfo(bytes.toByteArray(), fileName,
				null, null, null, null, null) };
		docinfo.setFileInfos(fileInfos);
		
		docinfo.setName("Sent Document");
		
		RecipientInfo[] rcptinfo = {new RecipientInfo(email1,"",RecipientRole.SIGNER), new RecipientInfo(email2,"",RecipientRole.SIGNER)};
		docinfo.setRecipients(rcptinfo);
		docinfo.setSignatureType(SignatureType.ESIGN);
		docinfo.setSignatureFlow(SignatureFlow.SENDER_SIGNATURE_NOT_REQUIRED);
		
		CallbackInfo callbackinfo = new CallbackInfo();
		callbackinfo.setSignedDocumentUrl(callbackurl);
		docinfo.setCallbackInfo(callbackinfo);		
		
		return ""+port.sendDocumentInteractive(apiKey, null, docinfo, new SendDocumentInteractiveOptions(false,true,false)).getEmbeddedCode();			
	}
	
	public String getSigningURL(String signingurldockey) throws Exception{
		SigningUrlResult result = port.getSigningUrl(apiKey, signingurldockey);
		String signingurl=null;
		while(!result.getSuccess()){
			logger.info("Waiting.....");
			Thread.sleep(2000);
			result = port.getSigningUrl(apiKey, signingurldockey);
		}
		signingurl = result.getSigningUrls()[0].getEsignUrl();
		//else
		//	logger.info("Get Signing URL Error: " + result.getErrorCode());
		return signingurl;
	}
	
	public String getDocumentURL(String documentkey) throws Exception{
		GetDocumentUrlsOptions option = new GetDocumentUrlsOptions();
		GetDocumentUrlsResult result = port.getDocumentUrls(apiKey, documentkey, option);
		String docurl=null;
		if(result.getSuccess())
			docurl = result.getUrls()[0].getUrl();
		else
			logger.info("Get Document URL Error: " + result.getErrorCode());
		return docurl;
	}
	
	public String getDocuments(String downloaddockey) throws Exception {
		String returnfilename=null;
		GetDocumentsOptions options = new GetDocumentsOptions();
		GetDocumentsResult result = port.getDocuments(apiKey,
				downloaddockey, options);

		if (result.getSuccess()) {
			DocumentContent[] docContentList = result.getDocuments();

			for (int docNdx = 0; docNdx < docContentList.length; ++docNdx) {
				DocumentContent docContent = docContentList[docNdx];
				logger.info("Document Name=" + docContent.getName()
						+ " Type=" + docContent.getMimetype() + " Size="
						+ docContent.getBytes().length);
				returnfilename = createDocumentFileName(destfileName, docNdx,
						docContentList.length);
				FileOutputStream stream = new FileOutputStream(new File(returnfilename));
				try {
					stream.write(docContent.getBytes());
				} finally {
					stream.close();
				}
			}
			logger.info("Document downloaded successfully: " + destfileName);			
		} else {
			logger.info("Document Error: " + result.getErrorCode());
			
		}
		return returnfilename;
	}

	private String createDocumentFileName(String fileName, int docNdx,
			int docNum) {
		java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat(
				"_MM_dd_yyyy_HH_mm_ss");
		fileName = fileName
				.replace(".pdf", fmt.format(new Date()) + ".pdf");
		if (docNum > 1)
			return fileName.replaceFirst(Matcher.quoteReplacement(".pdf"),
					"_" + docNdx + ".pdf");
		else
			return fileName;
	}
	
	public void trackDocument(long pollfreq){
		// start tracking now
		this.pollfreq = pollfreq;
		new DocumentTracker().start();
	}

	/**
	 * need to spawn a thread to track and download signed document esp one for
	 * two signators
	 */
	class DocumentTracker extends Thread {

		public String getFormData() throws Exception {
			GetFormDataResult formdata;
			while (true) {
				formdata = port.getFormData(apiKey,
						widgetresult.getDocumentKey());				
				logger.info("Waiting for doc to be signed...."
						+ formdata.getErrorCode() + " signed: " + formdata.getSuccess());								
				if(formdata.getSuccess()) break;		
				Thread.sleep(pollfreq);
			}

			String formdatacsv = formdata.getFormDataCsv();
			logger.info("Form Data CSV: " + formdatacsv);

			String childdocumentKey = null;
			String[] lines = formdatacsv.split("\n");
			String[] firline = lines[0].split(",");
			String[] secline = lines[1].split(",");
			for (int i = 0; i < firline.length; i++)
				if (firline[i].contains("Document Key"))
					childdocumentKey = secline[i];
			childdocumentKey = childdocumentKey.replace("\"", "");

			logger.info("Child Document Key: " + childdocumentKey);
			return childdocumentKey;
		}
		
		public void run() {
			try {
				getDocuments(getFormData());
			} catch (Exception ex) {
				logger.severe("Error getting document: " + ex);
			}
		}

	}// end of document tracker

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			EchoSign es = new EchoSign(null, "W8KKB42KXW34XN", "E:/GIT/MyRepos/GAFinance2/web/docs/ClassicLetter.doc", "E:/GIT/MyRepos/GAFinance2/web/docs/ClassicLetter.pdf", "http://24.126.149.255:8081/gafin/test/test.jsp");
			es.test();
			//System.out.println(es.sendDocumentInteractive("vauzr2450@gmail.com","ummagumma2450@gmail.com"));
			es.createWidget();
			//System.out.println(es.getJS());
			//System.out.println(es.getDocumentKey());
			String url = es.createUrl();
			System.out.println(url);			
			url = url.replace("hostedForm?formid=", "embedesignhtml?rdid=");
			System.out.println(url);
			//DocumentKey[] dc = es.sendDocument("vauzr2450@gmail.com","ummagumma2450@gmail.com"); //** always returns just the first document key			
			//System.out.println(dc[0].getRecipientEmail());
			//System.out.println(es.getSigningURL(dc[0].getDocumentKey()));
			//System.out.println(es.getDocumentURL(dc[0].getDocumentKey())); //** throws null pointer for signing url
			//while(dc.length<2){
			//	Thread.sleep(20000);
			//}
			//System.out.println(dc[1].getRecipientEmail()); //** never gets here
			//System.out.println(dc[1].getDocumentKey());
			// "E:/GIT/MyRepos/GAFinance2/web/test/test_out.pdf"
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
