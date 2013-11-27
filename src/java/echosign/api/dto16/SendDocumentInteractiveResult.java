/**
 * SendDocumentInteractiveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class SendDocumentInteractiveResult  implements java.io.Serializable {
    private echosign.api.dto16.DocumentKey documentKey;

    private java.lang.String embeddedCode;

    private echosign.api.dto12.SendDocumentInteractiveResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.util.Calendar expiration;

    private java.lang.Boolean success;

    private java.lang.String url;

    public SendDocumentInteractiveResult() {
    }

    public SendDocumentInteractiveResult(
           echosign.api.dto16.DocumentKey documentKey,
           java.lang.String embeddedCode,
           echosign.api.dto12.SendDocumentInteractiveResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.util.Calendar expiration,
           java.lang.Boolean success,
           java.lang.String url) {
           this.documentKey = documentKey;
           this.embeddedCode = embeddedCode;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.expiration = expiration;
           this.success = success;
           this.url = url;
    }


    /**
     * Gets the documentKey value for this SendDocumentInteractiveResult.
     * 
     * @return documentKey
     */
    public echosign.api.dto16.DocumentKey getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this SendDocumentInteractiveResult.
     * 
     * @param documentKey
     */
    public void setDocumentKey(echosign.api.dto16.DocumentKey documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the embeddedCode value for this SendDocumentInteractiveResult.
     * 
     * @return embeddedCode
     */
    public java.lang.String getEmbeddedCode() {
        return embeddedCode;
    }


    /**
     * Sets the embeddedCode value for this SendDocumentInteractiveResult.
     * 
     * @param embeddedCode
     */
    public void setEmbeddedCode(java.lang.String embeddedCode) {
        this.embeddedCode = embeddedCode;
    }


    /**
     * Gets the errorCode value for this SendDocumentInteractiveResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto12.SendDocumentInteractiveResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this SendDocumentInteractiveResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto12.SendDocumentInteractiveResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this SendDocumentInteractiveResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this SendDocumentInteractiveResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the expiration value for this SendDocumentInteractiveResult.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this SendDocumentInteractiveResult.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the success value for this SendDocumentInteractiveResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this SendDocumentInteractiveResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the url value for this SendDocumentInteractiveResult.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this SendDocumentInteractiveResult.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendDocumentInteractiveResult)) return false;
        SendDocumentInteractiveResult other = (SendDocumentInteractiveResult) obj;
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
            ((this.embeddedCode==null && other.getEmbeddedCode()==null) || 
             (this.embeddedCode!=null &&
              this.embeddedCode.equals(other.getEmbeddedCode()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getEmbeddedCode() != null) {
            _hashCode += getEmbeddedCode().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendDocumentInteractiveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentInteractiveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "embeddedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveResultErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
