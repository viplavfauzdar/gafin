/**
 * GetFormDataResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class GetFormDataResult  implements java.io.Serializable {
    private echosign.api.dto8.GetFormDataResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.String formDataCsv;

    private java.lang.Boolean success;

    public GetFormDataResult() {
    }

    public GetFormDataResult(
           echosign.api.dto8.GetFormDataResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.String formDataCsv,
           java.lang.Boolean success) {
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.formDataCsv = formDataCsv;
           this.success = success;
    }


    /**
     * Gets the errorCode value for this GetFormDataResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto8.GetFormDataResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetFormDataResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto8.GetFormDataResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this GetFormDataResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetFormDataResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the formDataCsv value for this GetFormDataResult.
     * 
     * @return formDataCsv
     */
    public java.lang.String getFormDataCsv() {
        return formDataCsv;
    }


    /**
     * Sets the formDataCsv value for this GetFormDataResult.
     * 
     * @param formDataCsv
     */
    public void setFormDataCsv(java.lang.String formDataCsv) {
        this.formDataCsv = formDataCsv;
    }


    /**
     * Gets the success value for this GetFormDataResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this GetFormDataResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFormDataResult)) return false;
        GetFormDataResult other = (GetFormDataResult) obj;
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
            ((this.formDataCsv==null && other.getFormDataCsv()==null) || 
             (this.formDataCsv!=null &&
              this.formDataCsv.equals(other.getFormDataCsv()))) &&
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFormDataCsv() != null) {
            _hashCode += getFormDataCsv().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFormDataResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResultErrorCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formDataCsv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "formDataCsv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "success"));
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
