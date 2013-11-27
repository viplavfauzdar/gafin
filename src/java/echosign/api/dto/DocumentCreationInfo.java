/**
 * DocumentCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class DocumentCreationInfo  implements java.io.Serializable {
    private echosign.api.dto.CallbackInfo callbackInfo;

    private java.lang.String[] ccs;

    private java.lang.Integer daysUntilSigningDeadline;

    private echosign.api.dto.ExternalId externalId;

    private echosign.api.dto.FileInfo[] fileInfos;

    private java.lang.String locale;

    private echosign.api.dto9.MergeFieldInfo mergeFieldInfo;

    private java.lang.String message;

    private java.lang.String name;

    private echosign.api.dto14.RecipientInfo[] recipients;

    private echosign.api.dto.ReminderFrequency reminderFrequency;

    private echosign.api.dto.SecurityOptions securityOptions;

    private echosign.api.dto.SignatureFlow signatureFlow;

    private echosign.api.dto.SignatureType signatureType;

    private java.lang.String[] tos;

    public DocumentCreationInfo() {
    }

    public DocumentCreationInfo(
           echosign.api.dto.CallbackInfo callbackInfo,
           java.lang.String[] ccs,
           java.lang.Integer daysUntilSigningDeadline,
           echosign.api.dto.ExternalId externalId,
           echosign.api.dto.FileInfo[] fileInfos,
           java.lang.String locale,
           echosign.api.dto9.MergeFieldInfo mergeFieldInfo,
           java.lang.String message,
           java.lang.String name,
           echosign.api.dto14.RecipientInfo[] recipients,
           echosign.api.dto.ReminderFrequency reminderFrequency,
           echosign.api.dto.SecurityOptions securityOptions,
           echosign.api.dto.SignatureFlow signatureFlow,
           echosign.api.dto.SignatureType signatureType,
           java.lang.String[] tos) {
           this.callbackInfo = callbackInfo;
           this.ccs = ccs;
           this.daysUntilSigningDeadline = daysUntilSigningDeadline;
           this.externalId = externalId;
           this.fileInfos = fileInfos;
           this.locale = locale;
           this.mergeFieldInfo = mergeFieldInfo;
           this.message = message;
           this.name = name;
           this.recipients = recipients;
           this.reminderFrequency = reminderFrequency;
           this.securityOptions = securityOptions;
           this.signatureFlow = signatureFlow;
           this.signatureType = signatureType;
           this.tos = tos;
    }


    /**
     * Gets the callbackInfo value for this DocumentCreationInfo.
     * 
     * @return callbackInfo
     */
    public echosign.api.dto.CallbackInfo getCallbackInfo() {
        return callbackInfo;
    }


    /**
     * Sets the callbackInfo value for this DocumentCreationInfo.
     * 
     * @param callbackInfo
     */
    public void setCallbackInfo(echosign.api.dto.CallbackInfo callbackInfo) {
        this.callbackInfo = callbackInfo;
    }


    /**
     * Gets the ccs value for this DocumentCreationInfo.
     * 
     * @return ccs
     */
    public java.lang.String[] getCcs() {
        return ccs;
    }


    /**
     * Sets the ccs value for this DocumentCreationInfo.
     * 
     * @param ccs
     */
    public void setCcs(java.lang.String[] ccs) {
        this.ccs = ccs;
    }


    /**
     * Gets the daysUntilSigningDeadline value for this DocumentCreationInfo.
     * 
     * @return daysUntilSigningDeadline
     */
    public java.lang.Integer getDaysUntilSigningDeadline() {
        return daysUntilSigningDeadline;
    }


    /**
     * Sets the daysUntilSigningDeadline value for this DocumentCreationInfo.
     * 
     * @param daysUntilSigningDeadline
     */
    public void setDaysUntilSigningDeadline(java.lang.Integer daysUntilSigningDeadline) {
        this.daysUntilSigningDeadline = daysUntilSigningDeadline;
    }


    /**
     * Gets the externalId value for this DocumentCreationInfo.
     * 
     * @return externalId
     */
    public echosign.api.dto.ExternalId getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this DocumentCreationInfo.
     * 
     * @param externalId
     */
    public void setExternalId(echosign.api.dto.ExternalId externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the fileInfos value for this DocumentCreationInfo.
     * 
     * @return fileInfos
     */
    public echosign.api.dto.FileInfo[] getFileInfos() {
        return fileInfos;
    }


    /**
     * Sets the fileInfos value for this DocumentCreationInfo.
     * 
     * @param fileInfos
     */
    public void setFileInfos(echosign.api.dto.FileInfo[] fileInfos) {
        this.fileInfos = fileInfos;
    }


    /**
     * Gets the locale value for this DocumentCreationInfo.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this DocumentCreationInfo.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the mergeFieldInfo value for this DocumentCreationInfo.
     * 
     * @return mergeFieldInfo
     */
    public echosign.api.dto9.MergeFieldInfo getMergeFieldInfo() {
        return mergeFieldInfo;
    }


    /**
     * Sets the mergeFieldInfo value for this DocumentCreationInfo.
     * 
     * @param mergeFieldInfo
     */
    public void setMergeFieldInfo(echosign.api.dto9.MergeFieldInfo mergeFieldInfo) {
        this.mergeFieldInfo = mergeFieldInfo;
    }


    /**
     * Gets the message value for this DocumentCreationInfo.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DocumentCreationInfo.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the name value for this DocumentCreationInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentCreationInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the recipients value for this DocumentCreationInfo.
     * 
     * @return recipients
     */
    public echosign.api.dto14.RecipientInfo[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this DocumentCreationInfo.
     * 
     * @param recipients
     */
    public void setRecipients(echosign.api.dto14.RecipientInfo[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the reminderFrequency value for this DocumentCreationInfo.
     * 
     * @return reminderFrequency
     */
    public echosign.api.dto.ReminderFrequency getReminderFrequency() {
        return reminderFrequency;
    }


    /**
     * Sets the reminderFrequency value for this DocumentCreationInfo.
     * 
     * @param reminderFrequency
     */
    public void setReminderFrequency(echosign.api.dto.ReminderFrequency reminderFrequency) {
        this.reminderFrequency = reminderFrequency;
    }


    /**
     * Gets the securityOptions value for this DocumentCreationInfo.
     * 
     * @return securityOptions
     */
    public echosign.api.dto.SecurityOptions getSecurityOptions() {
        return securityOptions;
    }


    /**
     * Sets the securityOptions value for this DocumentCreationInfo.
     * 
     * @param securityOptions
     */
    public void setSecurityOptions(echosign.api.dto.SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
    }


    /**
     * Gets the signatureFlow value for this DocumentCreationInfo.
     * 
     * @return signatureFlow
     */
    public echosign.api.dto.SignatureFlow getSignatureFlow() {
        return signatureFlow;
    }


    /**
     * Sets the signatureFlow value for this DocumentCreationInfo.
     * 
     * @param signatureFlow
     */
    public void setSignatureFlow(echosign.api.dto.SignatureFlow signatureFlow) {
        this.signatureFlow = signatureFlow;
    }


    /**
     * Gets the signatureType value for this DocumentCreationInfo.
     * 
     * @return signatureType
     */
    public echosign.api.dto.SignatureType getSignatureType() {
        return signatureType;
    }


    /**
     * Sets the signatureType value for this DocumentCreationInfo.
     * 
     * @param signatureType
     */
    public void setSignatureType(echosign.api.dto.SignatureType signatureType) {
        this.signatureType = signatureType;
    }


    /**
     * Gets the tos value for this DocumentCreationInfo.
     * 
     * @return tos
     */
    public java.lang.String[] getTos() {
        return tos;
    }


    /**
     * Sets the tos value for this DocumentCreationInfo.
     * 
     * @param tos
     */
    public void setTos(java.lang.String[] tos) {
        this.tos = tos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentCreationInfo)) return false;
        DocumentCreationInfo other = (DocumentCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callbackInfo==null && other.getCallbackInfo()==null) || 
             (this.callbackInfo!=null &&
              this.callbackInfo.equals(other.getCallbackInfo()))) &&
            ((this.ccs==null && other.getCcs()==null) || 
             (this.ccs!=null &&
              java.util.Arrays.equals(this.ccs, other.getCcs()))) &&
            ((this.daysUntilSigningDeadline==null && other.getDaysUntilSigningDeadline()==null) || 
             (this.daysUntilSigningDeadline!=null &&
              this.daysUntilSigningDeadline.equals(other.getDaysUntilSigningDeadline()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.fileInfos==null && other.getFileInfos()==null) || 
             (this.fileInfos!=null &&
              java.util.Arrays.equals(this.fileInfos, other.getFileInfos()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.mergeFieldInfo==null && other.getMergeFieldInfo()==null) || 
             (this.mergeFieldInfo!=null &&
              this.mergeFieldInfo.equals(other.getMergeFieldInfo()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.reminderFrequency==null && other.getReminderFrequency()==null) || 
             (this.reminderFrequency!=null &&
              this.reminderFrequency.equals(other.getReminderFrequency()))) &&
            ((this.securityOptions==null && other.getSecurityOptions()==null) || 
             (this.securityOptions!=null &&
              this.securityOptions.equals(other.getSecurityOptions()))) &&
            ((this.signatureFlow==null && other.getSignatureFlow()==null) || 
             (this.signatureFlow!=null &&
              this.signatureFlow.equals(other.getSignatureFlow()))) &&
            ((this.signatureType==null && other.getSignatureType()==null) || 
             (this.signatureType!=null &&
              this.signatureType.equals(other.getSignatureType()))) &&
            ((this.tos==null && other.getTos()==null) || 
             (this.tos!=null &&
              java.util.Arrays.equals(this.tos, other.getTos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCallbackInfo() != null) {
            _hashCode += getCallbackInfo().hashCode();
        }
        if (getCcs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysUntilSigningDeadline() != null) {
            _hashCode += getDaysUntilSigningDeadline().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFileInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMergeFieldInfo() != null) {
            _hashCode += getMergeFieldInfo().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReminderFrequency() != null) {
            _hashCode += getReminderFrequency().hashCode();
        }
        if (getSecurityOptions() != null) {
            _hashCode += getSecurityOptions().hashCode();
        }
        if (getSignatureFlow() != null) {
            _hashCode += getSignatureFlow().hashCode();
        }
        if (getSignatureType() != null) {
            _hashCode += getSignatureType().hashCode();
        }
        if (getTos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "callbackInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "CallbackInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "ccs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.echosign", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilSigningDeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "daysUntilSigningDeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "ExternalId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "fileInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "mergeFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto14.api.echosign", "RecipientInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "reminderFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "ReminderFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "securityOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SecurityOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "signatureFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureFlow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "signatureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "tos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.echosign", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
