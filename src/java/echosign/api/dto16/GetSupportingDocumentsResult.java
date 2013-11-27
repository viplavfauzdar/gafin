/**
 * GetSupportingDocumentsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class GetSupportingDocumentsResult  implements java.io.Serializable {
    private echosign.api.dto16.SupportingDocument[] supportingDocuments;

    private echosign.api.dto14.GetSupportingDocumentsResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean success;

    public GetSupportingDocumentsResult() {
    }

    public GetSupportingDocumentsResult(
           echosign.api.dto16.SupportingDocument[] supportingDocuments,
           echosign.api.dto14.GetSupportingDocumentsResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean success) {
           this.supportingDocuments = supportingDocuments;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.success = success;
    }


    /**
     * Gets the supportingDocuments value for this GetSupportingDocumentsResult.
     * 
     * @return supportingDocuments
     */
    public echosign.api.dto16.SupportingDocument[] getSupportingDocuments() {
        return supportingDocuments;
    }


    /**
     * Sets the supportingDocuments value for this GetSupportingDocumentsResult.
     * 
     * @param supportingDocuments
     */
    public void setSupportingDocuments(echosign.api.dto16.SupportingDocument[] supportingDocuments) {
        this.supportingDocuments = supportingDocuments;
    }


    /**
     * Gets the errorCode value for this GetSupportingDocumentsResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto14.GetSupportingDocumentsResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetSupportingDocumentsResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto14.GetSupportingDocumentsResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this GetSupportingDocumentsResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetSupportingDocumentsResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the success value for this GetSupportingDocumentsResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this GetSupportingDocumentsResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSupportingDocumentsResult)) return false;
        GetSupportingDocumentsResult other = (GetSupportingDocumentsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supportingDocuments==null && other.getSupportingDocuments()==null) || 
             (this.supportingDocuments!=null &&
              java.util.Arrays.equals(this.supportingDocuments, other.getSupportingDocuments()))) &&
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
        if (getSupportingDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportingDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportingDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(GetSupportingDocumentsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GetSupportingDocumentsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportingDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "supportingDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetSupportingDocumentsResultErrorCode"));
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
