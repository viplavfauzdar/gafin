/**
 * GetDocumentUrlsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class GetDocumentUrlsResult  implements java.io.Serializable {
    private echosign.api.dto14.GetDocumentUrlsErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean success;

    private echosign.api.dto14.SupportingDocumentUrl[] supportingDocumentUrls;

    private echosign.api.dto14.DocumentUrl[] urls;

    public GetDocumentUrlsResult() {
    }

    public GetDocumentUrlsResult(
           echosign.api.dto14.GetDocumentUrlsErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean success,
           echosign.api.dto14.SupportingDocumentUrl[] supportingDocumentUrls,
           echosign.api.dto14.DocumentUrl[] urls) {
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.success = success;
           this.supportingDocumentUrls = supportingDocumentUrls;
           this.urls = urls;
    }


    /**
     * Gets the errorCode value for this GetDocumentUrlsResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto14.GetDocumentUrlsErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetDocumentUrlsResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto14.GetDocumentUrlsErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this GetDocumentUrlsResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetDocumentUrlsResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the success value for this GetDocumentUrlsResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this GetDocumentUrlsResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the supportingDocumentUrls value for this GetDocumentUrlsResult.
     * 
     * @return supportingDocumentUrls
     */
    public echosign.api.dto14.SupportingDocumentUrl[] getSupportingDocumentUrls() {
        return supportingDocumentUrls;
    }


    /**
     * Sets the supportingDocumentUrls value for this GetDocumentUrlsResult.
     * 
     * @param supportingDocumentUrls
     */
    public void setSupportingDocumentUrls(echosign.api.dto14.SupportingDocumentUrl[] supportingDocumentUrls) {
        this.supportingDocumentUrls = supportingDocumentUrls;
    }


    /**
     * Gets the urls value for this GetDocumentUrlsResult.
     * 
     * @return urls
     */
    public echosign.api.dto14.DocumentUrl[] getUrls() {
        return urls;
    }


    /**
     * Sets the urls value for this GetDocumentUrlsResult.
     * 
     * @param urls
     */
    public void setUrls(echosign.api.dto14.DocumentUrl[] urls) {
        this.urls = urls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentUrlsResult)) return false;
        GetDocumentUrlsResult other = (GetDocumentUrlsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.supportingDocumentUrls==null && other.getSupportingDocumentUrls()==null) || 
             (this.supportingDocumentUrls!=null &&
              java.util.Arrays.equals(this.supportingDocumentUrls, other.getSupportingDocumentUrls()))) &&
            ((this.urls==null && other.getUrls()==null) || 
             (this.urls!=null &&
              java.util.Arrays.equals(this.urls, other.getUrls())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getSupportingDocumentUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportingDocumentUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportingDocumentUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrls(), i);
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
        new org.apache.axis.description.TypeDesc(GetDocumentUrlsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportingDocumentUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "supportingDocumentUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto14.api.echosign", "SupportingDocumentUrl"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "urls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentUrl"));
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
