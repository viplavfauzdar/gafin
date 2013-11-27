/**
 * AuditTrailResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class AuditTrailResult  implements java.io.Serializable {
    private byte[] auditTrailPdf;

    private echosign.api.dto9.AuditTrailResultErrorCode errorCode;

    private java.lang.String errorMessage;

    private java.lang.Boolean success;

    public AuditTrailResult() {
    }

    public AuditTrailResult(
           byte[] auditTrailPdf,
           echosign.api.dto9.AuditTrailResultErrorCode errorCode,
           java.lang.String errorMessage,
           java.lang.Boolean success) {
           this.auditTrailPdf = auditTrailPdf;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.success = success;
    }


    /**
     * Gets the auditTrailPdf value for this AuditTrailResult.
     * 
     * @return auditTrailPdf
     */
    public byte[] getAuditTrailPdf() {
        return auditTrailPdf;
    }


    /**
     * Sets the auditTrailPdf value for this AuditTrailResult.
     * 
     * @param auditTrailPdf
     */
    public void setAuditTrailPdf(byte[] auditTrailPdf) {
        this.auditTrailPdf = auditTrailPdf;
    }


    /**
     * Gets the errorCode value for this AuditTrailResult.
     * 
     * @return errorCode
     */
    public echosign.api.dto9.AuditTrailResultErrorCode getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this AuditTrailResult.
     * 
     * @param errorCode
     */
    public void setErrorCode(echosign.api.dto9.AuditTrailResultErrorCode errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this AuditTrailResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this AuditTrailResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the success value for this AuditTrailResult.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this AuditTrailResult.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditTrailResult)) return false;
        AuditTrailResult other = (AuditTrailResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditTrailPdf==null && other.getAuditTrailPdf()==null) || 
             (this.auditTrailPdf!=null &&
              java.util.Arrays.equals(this.auditTrailPdf, other.getAuditTrailPdf()))) &&
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
        if (getAuditTrailPdf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditTrailPdf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditTrailPdf(), i);
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
        new org.apache.axis.description.TypeDesc(AuditTrailResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "AuditTrailResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditTrailPdf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "auditTrailPdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "AuditTrailResultErrorCode"));
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
