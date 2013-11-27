package echosign.api;

public class EchoSignDocumentService16PortTypeProxy implements echosign.api.EchoSignDocumentService16PortType {
  private String _endpoint = null;
  private echosign.api.EchoSignDocumentService16PortType echoSignDocumentService16PortType = null;
  
  public EchoSignDocumentService16PortTypeProxy() {
    _initEchoSignDocumentService16PortTypeProxy();
  }
  
  public EchoSignDocumentService16PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initEchoSignDocumentService16PortTypeProxy();
  }
  
  private void _initEchoSignDocumentService16PortTypeProxy() {
    try {
      echoSignDocumentService16PortType = (new echosign.api.EchoSignDocumentService16Locator()).getEchoSignDocumentService16HttpPort();
      if (echoSignDocumentService16PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)echoSignDocumentService16PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)echoSignDocumentService16PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (echoSignDocumentService16PortType != null)
      ((javax.xml.rpc.Stub)echoSignDocumentService16PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public echosign.api.EchoSignDocumentService16PortType getEchoSignDocumentService16PortType() {
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType;
  }
  
  public echosign.api.dto.CancelDocumentResult cancelDocument(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment, boolean notifySigner) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.cancelDocument(apiKey, documentKey, comment, notifySigner);
  }
  
  public echosign.api.dto7.CreateAccountResult createAccount(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userCreationInfo, echosign.api.dto7.AccountCreationInfo accountCreationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createAccount(apiKey, userCreationInfo, accountCreationInfo);
  }
  
  public echosign.api.dto16.EmbeddedWidgetCreationResult createEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createEmbeddedWidget(apiKey, senderInfo, widgetInfo);
  }
  
  public echosign.api.dto16.FormCreationResult createForm(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.FormCreationInfo formInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createForm(apiKey, senderInfo, formInfo);
  }
  
  public echosign.api.dto16.CreateGroupResult createGroup(java.lang.String apiKey, java.lang.String groupName) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createGroup(apiKey, groupName);
  }
  
  public echosign.api.dto16.LibraryDocumentCreationResult createLibraryDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto9.LibraryDocumentCreationInfo libraryDocumentCreationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createLibraryDocument(apiKey, senderInfo, libraryDocumentCreationInfo);
  }
  
  public echosign.api.dto16.EmbeddedWidgetCreationResult createPersonalEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createPersonalEmbeddedWidget(apiKey, senderInfo, widgetInfo, personalizationInfo);
  }
  
  public echosign.api.dto16.UrlWidgetCreationResult createPersonalUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createPersonalUrlWidget(apiKey, senderInfo, widgetInfo, personalizationInfo);
  }
  
  public echosign.api.dto16.UrlWidgetCreationResult createUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createUrlWidget(apiKey, senderInfo, widgetInfo);
  }
  
  public java.lang.String createUser(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.createUser(apiKey, userInfo);
  }
  
  public echosign.api.dto15.DeleteGroupResult deleteGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.deleteGroup(apiKey, groupKey);
  }
  
  public echosign.api.dto13.DeliverDocumentResult deliverDocument(java.lang.String apiKey, echosign.api.dto.FileInfo fileInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.deliverDocument(apiKey, fileInfo);
  }
  
  public echosign.api.dto16.DisableWidgetResult disableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.DisableWidgetOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.disableWidget(apiKey, documentKey, options);
  }
  
  public echosign.api.dto16.EnableWidgetResult enableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.EnableWidgetOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.enableWidget(apiKey, documentKey, options);
  }
  
  public echosign.api.dto9.AuditTrailResult getAuditTrail(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getAuditTrail(apiKey, documentKey);
  }
  
  public byte[] getDocumentByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentByVersion(apiKey, versionKey);
  }
  
  public echosign.api.dto16.GetDocumentImageUrlsResult getDocumentImageUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentImageUrlsOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentImageUrls(apiKey, documentKey, options);
  }
  
  public echosign.api.dto16.DocumentInfo getDocumentInfo(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentInfo(apiKey, documentKey);
  }
  
  public echosign.api.dto16.DocumentInfoList getDocumentInfosByExternalId(java.lang.String apiKey, java.lang.String email, java.lang.String password, echosign.api.dto.ExternalId externalId) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentInfosByExternalId(apiKey, email, password, externalId);
  }
  
  public echosign.api.dto.DocumentUrlResult getDocumentUrlByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentUrlByVersion(apiKey, versionKey);
  }
  
  public echosign.api.dto14.GetDocumentUrlsResult getDocumentUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentUrlsOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentUrls(apiKey, documentKey, options);
  }
  
  public echosign.api.dto16.GetDocumentsResult getDocuments(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentsOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocuments(apiKey, documentKey, options);
  }
  
  public echosign.api.dto16.GetDocumentsForUserResult getDocumentsForUser(java.lang.String apiKey, java.lang.String userKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getDocumentsForUser(apiKey, userKey);
  }
  
  public echosign.api.dto8.GetFormDataResult getFormData(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getFormData(apiKey, documentKey);
  }
  
  public echosign.api.dto16.GetGroupsInAccountResult getGroupsInAccount(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getGroupsInAccount(apiKey);
  }
  
  public echosign.api.dto.DocumentImageList getImagesByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getImagesByVersion(apiKey, versionKey);
  }
  
  public byte[] getLatestDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getLatestDocument(apiKey, documentKey);
  }
  
  public echosign.api.dto.DocumentUrlResult getLatestDocumentUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getLatestDocumentUrl(apiKey, documentKey);
  }
  
  public echosign.api.dto.DocumentImageList getLatestImages(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getLatestImages(apiKey, documentKey);
  }
  
  public echosign.api.dto16.GetLibraryDocumentsForUserResult getLibraryDocumentsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getLibraryDocumentsForUser(apiKey, userCredentials);
  }
  
  public echosign.api.dto16.GetMegaSignDocumentResult getMegaSignDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getMegaSignDocument(apiKey, documentKey);
  }
  
  public echosign.api.dto16.GetDocumentsForUserResult getMyDocuments(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getMyDocuments(apiKey);
  }
  
  public echosign.api.dto16.GetLibraryDocumentsForUserResult getMyLibraryDocuments(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getMyLibraryDocuments(apiKey);
  }
  
  public echosign.api.dto16.GetWidgetsForUserResult getMyWidgets(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getMyWidgets(apiKey);
  }
  
  public echosign.api.dto14.SigningUrlResult getSigningUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getSigningUrl(apiKey, documentKey);
  }
  
  public echosign.api.dto16.GetSupportingDocumentsResult getSupportingDocuments(java.lang.String apiKey, java.lang.String documentKey, java.lang.String[] supportingDocumentKeys, echosign.api.dto14.GetSupportingDocumentsOptions options) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getSupportingDocuments(apiKey, documentKey, supportingDocumentKeys, options);
  }
  
  public echosign.api.dto16.GetDocumentsForUserResult getUserDocuments(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getUserDocuments(apiKey, userCredentials);
  }
  
  public echosign.api.dto16.GetUsersInAccountResult getUsersInAccount(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getUsersInAccount(apiKey);
  }
  
  public echosign.api.dto16.GetUsersInGroupResult getUsersInGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getUsersInGroup(apiKey, groupKey);
  }
  
  public echosign.api.dto16.GetWidgetsForUserResult getWidgetsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.getWidgetsForUser(apiKey, userCredentials);
  }
  
  public echosign.api.dto9.InitiateInteractiveSendDocumentResult initiateInteractiveSendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, boolean forceSendConfirmation, boolean authoringRequested) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.initiateInteractiveSendDocument(apiKey, senderInfo, documentCreationInfo, forceSendConfirmation, authoringRequested);
  }
  
  public echosign.api.dto15.MoveUsersToGroupResult moveUsersToGroup(java.lang.String apiKey, java.lang.String groupKey, echosign.api.dto15.UsersToMoveInfo usersToMoveInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.moveUsersToGroup(apiKey, groupKey, usersToMoveInfo);
  }
  
  public echosign.api.dto16.EmbeddedWidgetCreationResult personalizeEmbeddedWidget(java.lang.String apiKey, java.lang.String widgetJavascript, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.personalizeEmbeddedWidget(apiKey, widgetJavascript, personalizationInfo);
  }
  
  public echosign.api.dto16.UrlWidgetCreationResult personalizeUrlWidget(java.lang.String apiKey, java.lang.String widgetUrl, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.personalizeUrlWidget(apiKey, widgetUrl, personalizationInfo);
  }
  
  public echosign.api.dto.RemoveDocumentResult removeDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.removeDocument(apiKey, documentKey);
  }
  
  public echosign.api.dto15.RenameGroupResult renameGroup(java.lang.String apiKey, java.lang.String groupKey, java.lang.String newGroupName) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.renameGroup(apiKey, groupKey, newGroupName);
  }
  
  public echosign.api.dto16.DocumentKey[] sendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.sendDocument(apiKey, senderInfo, documentCreationInfo);
  }
  
  public echosign.api.dto16.SendDocumentInteractiveResult sendDocumentInteractive(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, echosign.api.dto12.SendDocumentInteractiveOptions sendDocumentInteractiveOptions) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.sendDocumentInteractive(apiKey, senderInfo, documentCreationInfo, sendDocumentInteractiveOptions);
  }
  
  public echosign.api.dto16.SendDocumentMegaSignResult sendDocumentMegaSign(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.sendDocumentMegaSign(apiKey, senderInfo, documentCreationInfo);
  }
  
  public echosign.api.dto.SendReminderResult sendReminder(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.sendReminder(apiKey, documentKey, comment);
  }
  
  public byte[] testEchoFile(java.lang.String apiKey, byte[] file) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.testEchoFile(apiKey, file);
  }
  
  public echosign.api.dto.Pong testPing(java.lang.String apiKey) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.testPing(apiKey);
  }
  
  public echosign.api.dto.UserVerificationInfo verifyUser(java.lang.String apiKey, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (echoSignDocumentService16PortType == null)
      _initEchoSignDocumentService16PortTypeProxy();
    return echoSignDocumentService16PortType.verifyUser(apiKey, email, password);
  }
  
  
}