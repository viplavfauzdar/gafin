/**
 * EchoSignDocumentService16HttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api;

public class EchoSignDocumentService16HttpBindingStub extends org.apache.axis.client.Stub implements echosign.api.EchoSignDocumentService16PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[53];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "notifySigner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "CancelDocumentResult"));
        oper.setReturnClass(echosign.api.dto.CancelDocumentResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "cancelDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "UserCreationInfo"), echosign.api.dto.UserCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "accountCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountCreationInfo"), echosign.api.dto7.AccountCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto7.api.echosign", "CreateAccountResult"));
        oper.setReturnClass(echosign.api.dto7.CreateAccountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "createAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEmbeddedWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo"), echosign.api.dto8.WidgetCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "EmbeddedWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.EmbeddedWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "embeddedWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "formInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "FormCreationInfo"), echosign.api.dto.FormCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "FormCreationResult"));
        oper.setReturnClass(echosign.api.dto16.FormCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "formCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "CreateGroupResult"));
        oper.setReturnClass(echosign.api.dto16.CreateGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "createGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createLibraryDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "libraryDocumentCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto9.api.echosign", "LibraryDocumentCreationInfo"), echosign.api.dto9.LibraryDocumentCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "LibraryDocumentCreationResult"));
        oper.setReturnClass(echosign.api.dto16.LibraryDocumentCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "libraryDocumentCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPersonalEmbeddedWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo"), echosign.api.dto8.WidgetCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "personalizationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo"), echosign.api.dto8.WidgetPersonalizationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "EmbeddedWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.EmbeddedWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "embeddedWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPersonalUrlWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo"), echosign.api.dto8.WidgetCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "personalizationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo"), echosign.api.dto8.WidgetPersonalizationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "UrlWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.UrlWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "urlWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUrlWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo"), echosign.api.dto8.WidgetCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "UrlWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.UrlWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "urlWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "UserCreationInfo"), echosign.api.dto.UserCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "userKey"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "groupKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto15.api.echosign", "DeleteGroupResult"));
        oper.setReturnClass(echosign.api.dto15.DeleteGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "deleteGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deliverDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "fileInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"), echosign.api.dto.FileInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto13.api.echosign", "DeliverDocumentResult"));
        oper.setReturnClass(echosign.api.dto13.DeliverDocumentResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "DeliverDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disableWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetOptions"), echosign.api.dto16.DisableWidgetOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetResult"));
        oper.setReturnClass(echosign.api.dto16.DisableWidgetResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enableWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetOptions"), echosign.api.dto16.EnableWidgetOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetResult"));
        oper.setReturnClass(echosign.api.dto16.EnableWidgetResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAuditTrail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto9.api.echosign", "AuditTrailResult"));
        oper.setReturnClass(echosign.api.dto9.AuditTrailResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getAuditTrailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentByVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "versionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "pdf"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentImageUrls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentImageUrlsOptions"), echosign.api.dto14.GetDocumentImageUrlsOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentImageUrlsResult"));
        oper.setReturnClass(echosign.api.dto16.GetDocumentImageUrlsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentImageUrlsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfo"));
        oper.setReturnClass(echosign.api.dto16.DocumentInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentInfosByExternalId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "externalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "ExternalId"), echosign.api.dto.ExternalId.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfoList"));
        oper.setReturnClass(echosign.api.dto16.DocumentInfoList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentInfoList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentUrlByVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "versionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentUrlResult"));
        oper.setReturnClass(echosign.api.dto.DocumentUrlResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentUrls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsOptions"), echosign.api.dto14.GetDocumentUrlsOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsResult"));
        oper.setReturnClass(echosign.api.dto14.GetDocumentUrlsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentUrlsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsOptions"), echosign.api.dto14.GetDocumentsOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsResult"));
        oper.setReturnClass(echosign.api.dto16.GetDocumentsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetDocumentsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentsForUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResult"));
        oper.setReturnClass(echosign.api.dto8.GetFormDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getFormDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGroupsInAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetGroupsInAccountResult"));
        oper.setReturnClass(echosign.api.dto16.GetGroupsInAccountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getGroupsInAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImagesByVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "versionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentImageList"));
        oper.setReturnClass(echosign.api.dto.DocumentImageList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentImageList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLatestDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "pdf"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLatestDocumentUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentUrlResult"));
        oper.setReturnClass(echosign.api.dto.DocumentUrlResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLatestImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentImageList"));
        oper.setReturnClass(echosign.api.dto.DocumentImageList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentImageList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLibraryDocumentsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userCredentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto9.api.echosign", "UserCredentials"), echosign.api.dto9.UserCredentials.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetLibraryDocumentsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetLibraryDocumentsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getLibraryDocumentsForUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMegaSignDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetMegaSignDocumentResult"));
        oper.setReturnClass(echosign.api.dto16.GetMegaSignDocumentResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getMegaSignDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetDocumentsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getMyDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyLibraryDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetLibraryDocumentsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetLibraryDocumentsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getMyLibraryDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyWidgets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetWidgetsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetWidgetsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getMyWidgetsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSigningUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto14.api.echosign", "SigningUrlResult"));
        oper.setReturnClass(echosign.api.dto14.SigningUrlResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getSigningUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSupportingDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "supportingDocumentKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.echosign", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://api.echosign", "string"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto14.api.echosign", "GetSupportingDocumentsOptions"), echosign.api.dto14.GetSupportingDocumentsOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetSupportingDocumentsResult"));
        oper.setReturnClass(echosign.api.dto16.GetSupportingDocumentsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getSupportingDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userCredentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto9.api.echosign", "UserCredentials"), echosign.api.dto9.UserCredentials.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetDocumentsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentsForUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersInAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetUsersInAccountResult"));
        oper.setReturnClass(echosign.api.dto16.GetUsersInAccountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getUsersInAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersInGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "groupKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetUsersInGroupResult"));
        oper.setReturnClass(echosign.api.dto16.GetUsersInGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getUsersInGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWidgetsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "userCredentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto9.api.echosign", "UserCredentials"), echosign.api.dto9.UserCredentials.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetWidgetsForUserResult"));
        oper.setReturnClass(echosign.api.dto16.GetWidgetsForUserResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "getWidgetsForUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initiateInteractiveSendDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo"), echosign.api.dto.DocumentCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "forceSendConfirmation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "authoringRequested"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto9.api.echosign", "InitiateInteractiveSendDocumentResult"));
        oper.setReturnClass(echosign.api.dto9.InitiateInteractiveSendDocumentResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "initiateInteractiveSendDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveUsersToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "groupKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "usersToMoveInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto15.api.echosign", "UsersToMoveInfo"), echosign.api.dto15.UsersToMoveInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto15.api.echosign", "MoveUsersToGroupResult"));
        oper.setReturnClass(echosign.api.dto15.MoveUsersToGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "moveUsersToGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("personalizeEmbeddedWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetJavascript"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "personalizationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo"), echosign.api.dto8.WidgetPersonalizationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "EmbeddedWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.EmbeddedWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "embeddedWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("personalizeUrlWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "widgetUrl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "personalizationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo"), echosign.api.dto8.WidgetPersonalizationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "UrlWidgetCreationResult"));
        oper.setReturnClass(echosign.api.dto16.UrlWidgetCreationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "urlWidgetCreationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "RemoveDocumentResult"));
        oper.setReturnClass(echosign.api.dto.RemoveDocumentResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "removeDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renameGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "groupKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "newGroupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto15.api.echosign", "RenameGroupResult"));
        oper.setReturnClass(echosign.api.dto15.RenameGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "renameGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo"), echosign.api.dto.DocumentCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentKey"));
        oper.setReturnClass(echosign.api.dto16.DocumentKey[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "documentKeys"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendDocumentInteractive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo"), echosign.api.dto.DocumentCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "sendDocumentInteractiveOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveOptions"), echosign.api.dto12.SendDocumentInteractiveOptions.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentInteractiveResult"));
        oper.setReturnClass(echosign.api.dto16.SendDocumentInteractiveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "sendDocumentInteractiveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendDocumentMegaSign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "senderInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo"), echosign.api.dto.SenderInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentCreationInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo"), echosign.api.dto.DocumentCreationInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentMegaSignResult"));
        oper.setReturnClass(echosign.api.dto16.SendDocumentMegaSignResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "sendMegaSignDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendReminder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "documentKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "SendReminderResult"));
        oper.setReturnClass(echosign.api.dto.SendReminderResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "sendreminderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testEchoFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "outFile"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testPing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "Pong"));
        oper.setReturnClass(echosign.api.dto.Pong.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "pong"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verifyUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "apiKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.echosign", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationInfo"));
        oper.setReturnClass(echosign.api.dto.UserVerificationInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.echosign", "userVerificationInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

    }

    public EchoSignDocumentService16HttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EchoSignDocumentService16HttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EchoSignDocumentService16HttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.echosign", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://api.echosign", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "AppliesTo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.AppliesTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "ArrayOfDocumentPageImages");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentPageImages[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentPageImages");
            qName2 = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentPageImages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "ArrayOfFileInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.FileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo");
            qName2 = new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "CallbackInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.CallbackInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "CancelDocumentResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.CancelDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DisplayUserInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DisplayUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentImageList");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentImageListErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentImageListErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentKey");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentPageImages");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentPageImages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentUrlErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentUrlErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentUrlResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.DocumentUrlResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "ExternalId");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.ExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.FileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "FormCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.FormCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "FormType");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.FormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "GetMegaSignDocumentResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.GetMegaSignDocumentResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "GetUsersInAccountResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.GetUsersInAccountResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "OptIn");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.OptIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "Pong");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.Pong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "ReminderFrequency");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.ReminderFrequency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "RemoveDocumentErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.RemoveDocumentErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "RemoveDocumentResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.RemoveDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "Result");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SecurityOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SecurityOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SendDocumentMegaSignResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SendDocumentMegaSignResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SenderInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SenderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SendReminderResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SendReminderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureFlow");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SignatureFlow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureType");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.SignatureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "UserCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.UserCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.UserVerificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationStatus");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto.UserVerificationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto10.api.echosign", "GetWidgetsForUserErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto10.GetWidgetsForUserErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto11.api.echosign", "DocumentInfoListErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto11.DocumentInfoListErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto12.SendDocumentInteractiveOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto12.SendDocumentInteractiveResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "ArrayOfParticipantSecurityOption");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.ParticipantSecurityOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "ParticipantSecurityOption");
            qName2 = new javax.xml.namespace.QName("http://dto13.api.echosign", "ParticipantSecurityOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "ArrayOfSecurityOption");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.SecurityOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "SecurityOption");
            qName2 = new javax.xml.namespace.QName("http://dto13.api.echosign", "SecurityOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "DeliverDocumentResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.DeliverDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "DeliverDocumentResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.DeliverDocumentResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "ParticipantSecurityOption");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.ParticipantSecurityOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto13.api.echosign", "SecurityOption");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto13.SecurityOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "AgreementStatus");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.AgreementStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ArrayOfDocumentContent");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.DocumentContent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentContent");
            qName2 = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentContent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ArrayOfDocumentUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.DocumentUrl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentUrl");
            qName2 = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentUrl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ArrayOfParticipantRole");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.ParticipantRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole");
            qName2 = new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ArrayOfRecipientInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.RecipientInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientInfo");
            qName2 = new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ArrayOfSupportingDocumentUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.SupportingDocumentUrl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentUrl");
            qName2 = new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentUrl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentContent");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.DocumentContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentListItemUserDocumentStatus");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.DocumentListItemUserDocumentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.DocumentUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentImageUrlsErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentImageUrlsErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentImageUrlsOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentImageUrlsOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentsErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsForUserResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentsForUserResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentsOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentUrlsErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentUrlsOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetDocumentUrlsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetSupportingDocumentsOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetSupportingDocumentsOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "GetSupportingDocumentsResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.GetSupportingDocumentsResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "IncludeScalingTypes");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.IncludeScalingTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.ParticipantRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.RecipientInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientRole");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.RecipientRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "SigningUrlResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.SigningUrlResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "SigningUrlResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.SigningUrlResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentContentFormat");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.SupportingDocumentContentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.SupportingDocumentUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto14.api.echosign", "UserAgreementStatus");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto14.UserAgreementStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "CreateGroupResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.CreateGroupResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "DeleteGroupResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.DeleteGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "DeleteGroupResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.DeleteGroupResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "GetGroupsInAccountResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.GetGroupsInAccountResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "GetUsersInGroupResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.GetUsersInGroupResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "MoveUsersToGroupResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.MoveUsersToGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "MoveUsersToGroupResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.MoveUsersToGroupResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "RenameGroupResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.RenameGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "RenameGroupResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.RenameGroupResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto15.api.echosign", "UsersToMoveInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto15.UsersToMoveInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "AgreementEventType");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.AgreementEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentHistoryEvent");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentHistoryEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentImageUrls[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentImageUrls");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentImageUrls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfo");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentKey");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentLibraryItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentLibraryItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentLibraryItem");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentLibraryItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfDocumentListItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentListItem");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfGroupInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GroupInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GroupInfo");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "GroupInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfPageImageUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.PageImageUrl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfPageImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.PageImageUrls[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfParticipantInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.ParticipantInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfSupportingDocument");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SupportingDocument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfSupportingDocumentImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SupportingDocumentImageUrls[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocumentImageUrls");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocumentImageUrls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfUserInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.UserInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "UserInfo");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "UserInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ArrayOfWidgetItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.WidgetItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "WidgetItem");
            qName2 = new javax.xml.namespace.QName("http://dto16.api.echosign", "WidgetItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "CreateGroupResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.CreateGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DeviceLocation");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DeviceLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DisableWidgetOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DisableWidgetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DisableWidgetResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentHistoryEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentImageUrls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfoList");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentInfoList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentLibraryItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentLibraryItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentListItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.DocumentListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "EmbeddedWidgetCreationResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.EmbeddedWidgetCreationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetOptions");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.EnableWidgetOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.EnableWidgetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.EnableWidgetResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "FormCreationResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.FormCreationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentImageUrlsResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetDocumentImageUrlsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsForUserResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetDocumentsForUserResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetDocumentsResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetDocumentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetGroupsInAccountResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetGroupsInAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetLibraryDocumentsForUserResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetLibraryDocumentsForUserResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetMegaSignDocumentResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetMegaSignDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetSupportingDocumentsResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetSupportingDocumentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetUsersInAccountResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetUsersInAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetUsersInGroupResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetUsersInGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GetWidgetsForUserResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GetWidgetsForUserResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "GroupInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.GroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "LibraryDocumentCreationResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.LibraryDocumentCreationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.PageImageUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.PageImageUrls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.ParticipantInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ReusableDocumentStatus");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.ReusableDocumentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "ScalingType");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.ScalingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentInteractiveResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SendDocumentInteractiveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentMegaSignResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SendDocumentMegaSignResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SupportingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocumentImageUrls");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.SupportingDocumentImageUrls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "UrlWidgetCreationResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.UrlWidgetCreationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "UserInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto16.api.echosign", "WidgetItem");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto16.WidgetItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto7.AccountCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountType");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto7.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto7.api.echosign", "CreateAccountResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto7.CreateAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto7.api.echosign", "CreateAccountResultCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto7.CreateAccountResultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "EmbeddedWidgetCreationResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.EmbeddedWidgetCreationResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.GetFormDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.GetFormDataResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "UrlWidgetCreationResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.UrlWidgetCreationResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCompletionInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.WidgetCompletionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.WidgetCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto8.WidgetPersonalizationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "ArrayOfMergeField");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.MergeField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeField");
            qName2 = new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeField");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "ArrayOfNextParticipantInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.NextParticipantInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "NextParticipantInfo");
            qName2 = new javax.xml.namespace.QName("http://dto9.api.echosign", "NextParticipantInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "ArrayOfSigningUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.SigningUrl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "SigningUrl");
            qName2 = new javax.xml.namespace.QName("http://dto9.api.echosign", "SigningUrl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "AuditTrailResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.AuditTrailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "AuditTrailResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.AuditTrailResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "DocumentLibraryItemScope");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.DocumentLibraryItemScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "GetLibraryDocumentsForUserErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.GetLibraryDocumentsForUserErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "InitiateInteractiveSendDocumentResult");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.InitiateInteractiveSendDocumentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "InitiateInteractiveSendDocumentResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.InitiateInteractiveSendDocumentResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "LibraryDocumentCreationInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.LibraryDocumentCreationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "LibraryDocumentCreationResultErrorCode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.LibraryDocumentCreationResultErrorCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "LibrarySharingMode");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.LibrarySharingMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeField");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.MergeField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeFieldInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.MergeFieldInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "NextParticipantInfo");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.NextParticipantInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "SigningUrl");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.SigningUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto9.api.echosign", "UserCredentials");
            cachedSerQNames.add(qName);
            cls = echosign.api.dto9.UserCredentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public echosign.api.dto.CancelDocumentResult cancelDocument(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment, boolean notifySigner) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "cancelDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, comment, new java.lang.Boolean(notifySigner)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.CancelDocumentResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.CancelDocumentResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.CancelDocumentResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto7.CreateAccountResult createAccount(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userCreationInfo, echosign.api.dto7.AccountCreationInfo accountCreationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userCreationInfo, accountCreationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto7.CreateAccountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto7.CreateAccountResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto7.CreateAccountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.EmbeddedWidgetCreationResult createEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createEmbeddedWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, widgetInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.EmbeddedWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.FormCreationResult createForm(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.FormCreationInfo formInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, formInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.FormCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.FormCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.FormCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.CreateGroupResult createGroup(java.lang.String apiKey, java.lang.String groupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, groupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.CreateGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.CreateGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.CreateGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.LibraryDocumentCreationResult createLibraryDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto9.LibraryDocumentCreationInfo libraryDocumentCreationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createLibraryDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, libraryDocumentCreationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.LibraryDocumentCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.LibraryDocumentCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.LibraryDocumentCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.EmbeddedWidgetCreationResult createPersonalEmbeddedWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createPersonalEmbeddedWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, widgetInfo, personalizationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.EmbeddedWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.UrlWidgetCreationResult createPersonalUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createPersonalUrlWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, widgetInfo, personalizationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.UrlWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.UrlWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.UrlWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.UrlWidgetCreationResult createUrlWidget(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto8.WidgetCreationInfo widgetInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createUrlWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, widgetInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.UrlWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.UrlWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.UrlWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String createUser(java.lang.String apiKey, echosign.api.dto.UserCreationInfo userInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto15.DeleteGroupResult deleteGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "deleteGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, groupKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto15.DeleteGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto15.DeleteGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto15.DeleteGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto13.DeliverDocumentResult deliverDocument(java.lang.String apiKey, echosign.api.dto.FileInfo fileInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "deliverDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, fileInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto13.DeliverDocumentResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto13.DeliverDocumentResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto13.DeliverDocumentResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.DisableWidgetResult disableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.DisableWidgetOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "disableWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.DisableWidgetResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.DisableWidgetResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.DisableWidgetResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.EnableWidgetResult enableWidget(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto16.EnableWidgetOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "enableWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.EnableWidgetResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.EnableWidgetResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.EnableWidgetResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto9.AuditTrailResult getAuditTrail(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getAuditTrail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto9.AuditTrailResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto9.AuditTrailResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto9.AuditTrailResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getDocumentByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentByVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, versionKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetDocumentImageUrlsResult getDocumentImageUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentImageUrlsOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentImageUrls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetDocumentImageUrlsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetDocumentImageUrlsResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetDocumentImageUrlsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.DocumentInfo getDocumentInfo(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.DocumentInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.DocumentInfo) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.DocumentInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.DocumentInfoList getDocumentInfosByExternalId(java.lang.String apiKey, java.lang.String email, java.lang.String password, echosign.api.dto.ExternalId externalId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentInfosByExternalId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, email, password, externalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.DocumentInfoList) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.DocumentInfoList) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.DocumentInfoList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.DocumentUrlResult getDocumentUrlByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentUrlByVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, versionKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.DocumentUrlResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.DocumentUrlResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.DocumentUrlResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto14.GetDocumentUrlsResult getDocumentUrls(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentUrlsOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentUrls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto14.GetDocumentUrlsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto14.GetDocumentUrlsResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto14.GetDocumentUrlsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetDocumentsResult getDocuments(java.lang.String apiKey, java.lang.String documentKey, echosign.api.dto14.GetDocumentsOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetDocumentsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetDocumentsResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetDocumentsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetDocumentsForUserResult getDocumentsForUser(java.lang.String apiKey, java.lang.String userKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getDocumentsForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetDocumentsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetDocumentsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetDocumentsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto8.GetFormDataResult getFormData(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getFormData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto8.GetFormDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto8.GetFormDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto8.GetFormDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetGroupsInAccountResult getGroupsInAccount(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getGroupsInAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetGroupsInAccountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetGroupsInAccountResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetGroupsInAccountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.DocumentImageList getImagesByVersion(java.lang.String apiKey, java.lang.String versionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getImagesByVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, versionKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.DocumentImageList) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.DocumentImageList) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.DocumentImageList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getLatestDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getLatestDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.DocumentUrlResult getLatestDocumentUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getLatestDocumentUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.DocumentUrlResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.DocumentUrlResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.DocumentUrlResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.DocumentImageList getLatestImages(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getLatestImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.DocumentImageList) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.DocumentImageList) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.DocumentImageList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetLibraryDocumentsForUserResult getLibraryDocumentsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getLibraryDocumentsForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userCredentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetLibraryDocumentsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetLibraryDocumentsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetLibraryDocumentsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetMegaSignDocumentResult getMegaSignDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getMegaSignDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetMegaSignDocumentResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetMegaSignDocumentResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetMegaSignDocumentResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetDocumentsForUserResult getMyDocuments(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getMyDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetDocumentsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetDocumentsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetDocumentsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetLibraryDocumentsForUserResult getMyLibraryDocuments(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getMyLibraryDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetLibraryDocumentsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetLibraryDocumentsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetLibraryDocumentsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetWidgetsForUserResult getMyWidgets(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getMyWidgets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetWidgetsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetWidgetsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetWidgetsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto14.SigningUrlResult getSigningUrl(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getSigningUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto14.SigningUrlResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto14.SigningUrlResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto14.SigningUrlResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetSupportingDocumentsResult getSupportingDocuments(java.lang.String apiKey, java.lang.String documentKey, java.lang.String[] supportingDocumentKeys, echosign.api.dto14.GetSupportingDocumentsOptions options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getSupportingDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, supportingDocumentKeys, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetSupportingDocumentsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetSupportingDocumentsResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetSupportingDocumentsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetDocumentsForUserResult getUserDocuments(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getUserDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userCredentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetDocumentsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetDocumentsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetDocumentsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetUsersInAccountResult getUsersInAccount(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getUsersInAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetUsersInAccountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetUsersInAccountResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetUsersInAccountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetUsersInGroupResult getUsersInGroup(java.lang.String apiKey, java.lang.String groupKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getUsersInGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, groupKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetUsersInGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetUsersInGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetUsersInGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.GetWidgetsForUserResult getWidgetsForUser(java.lang.String apiKey, echosign.api.dto9.UserCredentials userCredentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "getWidgetsForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, userCredentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.GetWidgetsForUserResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.GetWidgetsForUserResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.GetWidgetsForUserResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto9.InitiateInteractiveSendDocumentResult initiateInteractiveSendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, boolean forceSendConfirmation, boolean authoringRequested) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "initiateInteractiveSendDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, documentCreationInfo, new java.lang.Boolean(forceSendConfirmation), new java.lang.Boolean(authoringRequested)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto9.InitiateInteractiveSendDocumentResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto9.InitiateInteractiveSendDocumentResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto9.InitiateInteractiveSendDocumentResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto15.MoveUsersToGroupResult moveUsersToGroup(java.lang.String apiKey, java.lang.String groupKey, echosign.api.dto15.UsersToMoveInfo usersToMoveInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "moveUsersToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, groupKey, usersToMoveInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto15.MoveUsersToGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto15.MoveUsersToGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto15.MoveUsersToGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.EmbeddedWidgetCreationResult personalizeEmbeddedWidget(java.lang.String apiKey, java.lang.String widgetJavascript, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "personalizeEmbeddedWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, widgetJavascript, personalizationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.EmbeddedWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.EmbeddedWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.UrlWidgetCreationResult personalizeUrlWidget(java.lang.String apiKey, java.lang.String widgetUrl, echosign.api.dto8.WidgetPersonalizationInfo personalizationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "personalizeUrlWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, widgetUrl, personalizationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.UrlWidgetCreationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.UrlWidgetCreationResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.UrlWidgetCreationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.RemoveDocumentResult removeDocument(java.lang.String apiKey, java.lang.String documentKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "removeDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.RemoveDocumentResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.RemoveDocumentResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.RemoveDocumentResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto15.RenameGroupResult renameGroup(java.lang.String apiKey, java.lang.String groupKey, java.lang.String newGroupName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "renameGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, groupKey, newGroupName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto15.RenameGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto15.RenameGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto15.RenameGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.DocumentKey[] sendDocument(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "sendDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, documentCreationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.DocumentKey[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.DocumentKey[]) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.DocumentKey[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.SendDocumentInteractiveResult sendDocumentInteractive(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo, echosign.api.dto12.SendDocumentInteractiveOptions sendDocumentInteractiveOptions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "sendDocumentInteractive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, documentCreationInfo, sendDocumentInteractiveOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.SendDocumentInteractiveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.SendDocumentInteractiveResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.SendDocumentInteractiveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto16.SendDocumentMegaSignResult sendDocumentMegaSign(java.lang.String apiKey, echosign.api.dto.SenderInfo senderInfo, echosign.api.dto.DocumentCreationInfo documentCreationInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "sendDocumentMegaSign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, senderInfo, documentCreationInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto16.SendDocumentMegaSignResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto16.SendDocumentMegaSignResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto16.SendDocumentMegaSignResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.SendReminderResult sendReminder(java.lang.String apiKey, java.lang.String documentKey, java.lang.String comment) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "sendReminder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, documentKey, comment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.SendReminderResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.SendReminderResult) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.SendReminderResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] testEchoFile(java.lang.String apiKey, byte[] file) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "testEchoFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, file});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.Pong testPing(java.lang.String apiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "testPing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.Pong) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.Pong) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.Pong.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public echosign.api.dto.UserVerificationInfo verifyUser(java.lang.String apiKey, java.lang.String email, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.echosign", "verifyUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {apiKey, email, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (echosign.api.dto.UserVerificationInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (echosign.api.dto.UserVerificationInfo) org.apache.axis.utils.JavaUtils.convert(_resp, echosign.api.dto.UserVerificationInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
