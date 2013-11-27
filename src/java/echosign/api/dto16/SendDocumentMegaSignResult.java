/**
 * SendDocumentMegaSignResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class SendDocumentMegaSignResult  implements java.io.Serializable {
    private echosign.api.dto16.DocumentKey documentKey;

    private echosign.api.dto16.DocumentKey[] documentKeyArray;

    private echosign.api.dto.SendDocumentMegaSignResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean success;

    public SendDocumentMegaSignResult() {
    }

    public SendDocumentMegaSignResult(
           echosign.api.dto16.DocumentKey documentKey,
           echosign.api.dto16.DocumentKey[] documentKeyArray,
           echosign.api.dto.SendDocumentMegaSignResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean success) {
           this.documentKey = documentKey;
           this.documentKeyArray = documentKeyArray;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.success = success;
    }


    /**
     * Gets the documentKey value for this SendDocumentMegaSignResult.
     * 
     * @return documentKey
     */
    public echosign.api.dto16.DocumentKey getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this SendDocumentMegaSignResult.
     * 
     * @param documentKey
     */
    public void setDocumentKey(echosign.api.dto16.DocumentKey documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the documentKeyArray value for this SendDocumentMegaSignResult.
     * 
     * @return documentKeyArray
     */
    public echosign.api.dto16.DocumentKey[] getDocumentKeyArray() {
        return documentKeyArray;
    }


    /**
     * Sets the documentKeyArray value for this SendDocumentMegaSignResult.
     * 
     * @param documentKeyArray
     */
    public void setDocumentKeyArray(echosign.api.dto16.DocumentKey[] documentKeyArray) {
        this.documentKeyArray = documentKeyArray;
    }


    /**
     * Gets the errorCode value for this SendDocumentMegaSignResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto.SendDocumentMegaSignResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this SendDocumentMegaSignResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto.SendDocumentMegaSignResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this SendDocumentMegaSignResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this SendDocumentMegaSignResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the success value for this SendDocumentMegaSignResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this SendDocumentMegaSignResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendDocumentMegaSignResult)) return false;
        SendDocumentMegaSignResult other = (SendDocumentMegaSignResult) obj;
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
            ((this.documentKeyArray==null && other.getDocumentKeyArray()==null) || 
             (this.documentKeyArray!=null &&
              java.util.Arrays.equals(this.documentKeyArray, other.getDocumentKeyArray()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
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
        if (getDocumentKeyArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentKeyArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentKeyArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendDocumentMegaSignResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SendDocumentMegaSignResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKeyArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKeyArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SendDocumentMegaSignResultErrorCode"));
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
