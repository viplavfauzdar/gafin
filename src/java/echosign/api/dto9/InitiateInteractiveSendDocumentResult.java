/**
 * InitiateInteractiveSendDocumentResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class InitiateInteractiveSendDocumentResult  implements java.io.Serializable {
    private echosign.api.dto.DocumentKey documentKey;

    private echosign.api.dto9.InitiateInteractiveSendDocumentResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean needsInteraction;

    private java.lang.String sendDocumentURL;

    private java.lang.Boolean success;

    public InitiateInteractiveSendDocumentResult() {
    }

    public InitiateInteractiveSendDocumentResult(
           echosign.api.dto.DocumentKey documentKey,
           echosign.api.dto9.InitiateInteractiveSendDocumentResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean needsInteraction,
           java.lang.String sendDocumentURL,
           java.lang.Boolean success) {
           this.documentKey = documentKey;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.needsInteraction = needsInteraction;
           this.sendDocumentURL = sendDocumentURL;
           this.success = success;
    }


    /**
     * Gets the documentKey value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return documentKey
     */
    public echosign.api.dto.DocumentKey getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param documentKey
     */
    public void setDocumentKey(echosign.api.dto.DocumentKey documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the errorCode value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto9.InitiateInteractiveSendDocumentResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto9.InitiateInteractiveSendDocumentResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the needsInteraction value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return needsInteraction
     */
    public java.lang.Boolean getNeedsInteraction() {
        return needsInteraction;
    }


    /**
     * Sets the needsInteraction value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param needsInteraction
     */
    public void setNeedsInteraction(java.lang.Boolean needsInteraction) {
        this.needsInteraction = needsInteraction;
    }


    /**
     * Gets the sendDocumentURL value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return sendDocumentURL
     */
    public java.lang.String getSendDocumentURL() {
        return sendDocumentURL;
    }


    /**
     * Sets the sendDocumentURL value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param sendDocumentURL
     */
    public void setSendDocumentURL(java.lang.String sendDocumentURL) {
        this.sendDocumentURL = sendDocumentURL;
    }


    /**
     * Gets the success value for this InitiateInteractiveSendDocumentResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this InitiateInteractiveSendDocumentResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateInteractiveSendDocumentResult)) return false;
        InitiateInteractiveSendDocumentResult other = (InitiateInteractiveSendDocumentResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentKey==null && other.getDocumentKey()==null) || 
             (this.documentKey!=null &&
              this.documentKey.equals(other.getDocumentKey()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.needsInteraction==null && other.getNeedsInteraction()==null) || 
             (this.needsInteraction!=null &&
              this.needsInteraction.equals(other.getNeedsInteraction()))) &&
            ((this.sendDocumentURL==null && other.getSendDocumentURL()==null) || 
             (this.sendDocumentURL!=null &&
              this.sendDocumentURL.equals(other.getSendDocumentURL()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess())));
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
        if (getDocumentKey() != null) {
            _hashCode += getDocumentKey().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getNeedsInteraction() != null) {
            _hashCode += getNeedsInteraction().hashCode();
        }
        if (getSendDocumentURL() != null) {
            _hashCode += getSendDocumentURL().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateInteractiveSendDocumentResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "InitiateInteractiveSendDocumentResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "InitiateInteractiveSendDocumentResultErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needsInteraction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "needsInteraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDocumentURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "sendDocumentURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
