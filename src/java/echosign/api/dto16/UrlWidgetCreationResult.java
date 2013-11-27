/**
 * UrlWidgetCreationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class UrlWidgetCreationResult  implements java.io.Serializable {
    private java.lang.String documentKey;

    private echosign.api.dto8.UrlWidgetCreationResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean success;

    private java.lang.String url;

    public UrlWidgetCreationResult() {
    }

    public UrlWidgetCreationResult(
           java.lang.String documentKey,
           echosign.api.dto8.UrlWidgetCreationResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean success,
           java.lang.String url) {
           this.documentKey = documentKey;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.success = success;
           this.url = url;
    }


    /**
     * Gets the documentKey value for this UrlWidgetCreationResult.
     * 
     * @return documentKey
     */
    public java.lang.String getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this UrlWidgetCreationResult.
     * 
     * @param documentKey
     */
    public void setDocumentKey(java.lang.String documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the errorCode value for this UrlWidgetCreationResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto8.UrlWidgetCreationResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this UrlWidgetCreationResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto8.UrlWidgetCreationResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this UrlWidgetCreationResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this UrlWidgetCreationResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the success value for this UrlWidgetCreationResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this UrlWidgetCreationResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the url value for this UrlWidgetCreationResult.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this UrlWidgetCreationResult.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UrlWidgetCreationResult)) return false;
        UrlWidgetCreationResult other = (UrlWidgetCreationResult) obj;
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
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
        new org.apache.axis.description.TypeDesc(UrlWidgetCreationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "UrlWidgetCreationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "UrlWidgetCreationResultErrorCode"));
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
