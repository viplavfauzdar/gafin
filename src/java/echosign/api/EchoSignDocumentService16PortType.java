/**
 * EchoSignDocumentService16PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api;

public interface EchoSignDocumentService16PortType extends java.rmi.Remote {
    public echosign.api.dto.CancelDocumentResult cancelDocument(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment, boolean notifySigner) throws java.rmi.RemoteException;
    public echosign.api.dto7.CreateAccountResult createAccount(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userCreationInfo, echosign.api.dto7.AccountCreationInfo accountCreationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.EmbeddedWidgetCreationResult createEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.FormCreationResult createForm(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.FormCreationInfo formInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.CreateGroupResult createGroup(java.lang.String apiKey, java.lang.String groupName) throws java.rmi.RemoteException;
    public echosign.api.dto16.LibraryDocumentCreationResult createLibraryDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto9.LibraryDocumentCreationInfo libraryDocumentCreationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.EmbeddedWidgetCreationResult createPersonalEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.UrlWidgetCreationResult createPersonalUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.UrlWidgetCreationResult createUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException;
    public java.lang.String createUser(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userInfo) throws java.rmi.RemoteException;
    public echosign.api.dto15.DeleteGroupResult deleteGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException;
    public echosign.api.dto13.DeliverDocumentResult deliverDocument(java.lang.String apiKey, echosign.api.dto.FileInfo fileInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.DisableWidgetResult disableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.DisableWidgetOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto16.EnableWidgetResult enableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.EnableWidgetOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto9.AuditTrailResult getAuditTrail(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public byte[] getDocumentByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetDocumentImageUrlsResult getDocumentImageUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentImageUrlsOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto16.DocumentInfo getDocumentInfo(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.DocumentInfoList getDocumentInfosByExternalId(java.lang.String apiKey, java.lang.String email, java.lang.String password, echosign.api.dto.ExternalId externalId) throws java.rmi.RemoteException;
    public echosign.api.dto.DocumentUrlResult getDocumentUrlByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException;
    public echosign.api.dto14.GetDocumentUrlsResult getDocumentUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentUrlsOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetDocumentsResult getDocuments(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentsOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetDocumentsForUserResult getDocumentsForUser(java.lang.String apiKey, java.lang.String userKey) throws java.rmi.RemoteException;
    public echosign.api.dto8.GetFormDataResult getFormData(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetGroupsInAccountResult getGroupsInAccount(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto.DocumentImageList getImagesByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException;
    public byte[] getLatestDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto.DocumentUrlResult getLatestDocumentUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto.DocumentImageList getLatestImages(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetLibraryDocumentsForUserResult getLibraryDocumentsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetMegaSignDocumentResult getMegaSignDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetDocumentsForUserResult getMyDocuments(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetLibraryDocumentsForUserResult getMyLibraryDocuments(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetWidgetsForUserResult getMyWidgets(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto14.SigningUrlResult getSigningUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetSupportingDocumentsResult getSupportingDocuments(java.lang.String apiKey, java.lang.String documentKey, java.lang.String[] supportingDocumentKeys, echosign.api.dto14.GetSupportingDocumentsOptions options) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetDocumentsForUserResult getUserDocuments(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetUsersInAccountResult getUsersInAccount(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetUsersInGroupResult getUsersInGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException;
    public echosign.api.dto16.GetWidgetsForUserResult getWidgetsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException;
    public echosign.api.dto9.InitiateInteractiveSendDocumentResult initiateInteractiveSendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, boolean forceSendConfirmation, boolean authoringRequested) throws java.rmi.RemoteException;
    public echosign.api.dto15.MoveUsersToGroupResult moveUsersToGroup(java.lang.String apiKey, java.lang.String groupKey, echosign.api.dto15.UsersToMoveInfo usersToMoveInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.EmbeddedWidgetCreationResult personalizeEmbeddedWidget(java.lang.String apiKey, java.lang.String widgetJavascript, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.UrlWidgetCreationResult personalizeUrlWidget(java.lang.String apiKey, java.lang.String widgetUrl, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto.RemoveDocumentResult removeDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException;
    public echosign.api.dto15.RenameGroupResult renameGroup(java.lang.String apiKey, java.lang.String groupKey, java.lang.String newGroupName) throws java.rmi.RemoteException;
    public echosign.api.dto16.DocumentKey[] sendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto16.SendDocumentInteractiveResult sendDocumentInteractive(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, echosign.api.dto12.SendDocumentInteractiveOptions sendDocumentInteractiveOptions) throws java.rmi.RemoteException;
    public echosign.api.dto16.SendDocumentMegaSignResult sendDocumentMegaSign(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException;
    public echosign.api.dto.SendReminderResult sendReminder(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment) throws java.rmi.RemoteException;
    public byte[] testEchoFile(java.lang.String apiKey, byte[] file) throws java.rmi.RemoteException;
    public echosign.api.dto.Pong testPing(java.lang.String apiKey) throws java.rmi.RemoteException;
    public echosign.api.dto.UserVerificationInfo verifyUser(java.lang.String apiKey, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
}
