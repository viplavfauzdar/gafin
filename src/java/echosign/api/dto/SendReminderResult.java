/**
 * SendReminderResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class SendReminderResult  implements java.io.Serializable {
    private java.lang.String recipientEmail;

    private echosign.api.dto.Result result;

    public SendReminderResult() {
    }

    public SendReminderResult(
           java.lang.String recipientEmail,
           echosign.api.dto.Result result) {
           this.recipientEmail = recipientEmail;
           this.result = result;
    }


    /**
     * Gets the recipientEmail value for this SendReminderResult.
     * 
     * @return recipientEmail
     */
    public java.lang.String getRecipientEmail() {
        return recipientEmail;
    }


    /**
     * Sets the recipientEmail value for this SendReminderResult.
     * 
     * @param recipientEmail
     */
    public void setRecipientEmail(java.lang.String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }


    /**
     * Gets the result value for this SendReminderResult.
     * 
     * @return result
     */
    public echosign.api.dto.Result getResult() {
        return result;
    }


    /**
     * Sets the result value for this SendReminderResult.
     * 
     * @param result
     */
    public void setResult(echosign.api.dto.Result result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendReminderResult)) return false;
        SendReminderResult other = (SendReminderResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientEmail==null && other.getRecipientEmail()==null) || 
             (this.recipientEmail!=null &&
              this.recipientEmail.equals(other.getRecipientEmail()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getRecipientEmail() != null) {
            _hashCode += getRecipientEmail().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendReminderResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SendReminderResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "recipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "Result"));
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
