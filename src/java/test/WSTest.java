package test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Matcher;

import org.apache.commons.io.IOUtils;

import echosign.api.EchoSignDocumentService16Locator;
import echosign.api.EchoSignDocumentService16PortType;
import echosign.api.dto.FileInfo;
import echosign.api.dto14.DocumentContent;
import echosign.api.dto14.GetDocumentsOptions;
import echosign.api.dto16.EmbeddedWidgetCreationResult;
import echosign.api.dto16.GetDocumentsResult;
import echosign.api.dto8.GetFormDataResult;
import echosign.api.dto8.WidgetCreationInfo;

/**
 * 
 */

/**
 * @author Viplav
 * 
 */
public class WSTest {

	/**
	 * @param args
	 */
	// EchoSignDocumentService16 s;

	public void test(String fileName, String destfileName,
			String childdocumentKey) throws Exception {

		EchoSignDocumentService16Locator l = new EchoSignDocumentService16Locator();
		EchoSignDocumentService16PortType p = l
				.getEchoSignDocumentService16HttpPort();
		System.out.println("Ping test: " + p.testPing("W8KKB42KXW34XN"));

		if (childdocumentKey == null) {
			WidgetCreationInfo widgetInfo = new WidgetCreationInfo();

			// String fileName =
			// "E:/GIT/MyRepos/GAFinance2/web/test/echosign_template.docx";
			File file = new File(fileName);
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			IOUtils.copy(new FileInputStream(file), bytes);

			widgetInfo.setName("Test Widget");
			FileInfo[] fileInfos = { new FileInfo(bytes.toByteArray(),
					fileName, null, null, null, null, null) };
			widgetInfo.setFileInfos(fileInfos);

			// SenderInfo senderinfo = new SenderInfo();

			EmbeddedWidgetCreationResult e = p.createEmbeddedWidget(
					"W8KKB42KXW34XN", null, widgetInfo);

			System.out.println("Document Key: " + e.getDocumentKey());
			System.out.println("JS: " + e.getJavascript());

			GetFormDataResult f = p.getFormData("W8KKB42KXW34XN",
					e.getDocumentKey());
			while (!f.getSuccess()) {
				System.out.println("Waiting for doc to be signed...."
						+ f.getErrorCode());
				f = p.getFormData("W8KKB42KXW34XN", e.getDocumentKey());
				Thread.sleep(10000);
			}

			String formdata = f.getFormDataCsv();
			System.out.println("Form Data CSV: " + formdata);

			// String childdocumentKey = null;
			String[] lines = formdata.split("\n");
			String[] firline = lines[0].split(",");
			String[] secline = lines[1].split(",");
			for (int i = 0; i < firline.length; i++)
				if (firline[i].contains("Document Key"))
					childdocumentKey = secline[i];
			childdocumentKey = childdocumentKey.replace("\"", "");

		}

		System.out.println("Child Document Key: " + childdocumentKey);

		GetDocumentsOptions options = new GetDocumentsOptions();
		GetDocumentsResult result = p.getDocuments("W8KKB42KXW34XN",
				childdocumentKey, options);

		if (result.getSuccess()) {
			DocumentContent[] docContentList = result.getDocuments();

			for (int docNdx = 0; docNdx < docContentList.length; ++docNdx) {
				DocumentContent docContent = docContentList[docNdx];
				System.out.println("Document Name=" + docContent.getName()
						+ " Type=" + docContent.getMimetype() + " Size="
						+ docContent.getBytes().length);
				FileOutputStream stream = new FileOutputStream(new File(
						createDocumentFileName(destfileName, docNdx,
								docContentList.length)));
				try {
					stream.write(docContent.getBytes());
				} finally {
					stream.close();
				}

			}
			
			System.out.println("Document downloaded successfully: " + destfileName);

		} else {
			System.out.println("Document Error: " + result.getErrorCode());
		}
	}

	private String createDocumentFileName(String fileName, int docNdx,
			int docNum) {
		if (docNum > 1)
			return fileName.replaceFirst(Matcher.quoteReplacement(".pdf"), "_"
					+ docNdx + ".pdf");
		else
			return fileName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			(new WSTest()).test("E:/GIT/MyRepos/GAFinance2/web/test/test.pdf",
					"E:/GIT/MyRepos/GAFinance2/web/test/test_out.pdf",null);//"WHQEZK4A5M6D66");// ,
																		// args[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
