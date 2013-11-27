/**
 * CallbackInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class CallbackInfo  implements java.io.Serializable {
    private java.lang.String signedDocumentUrl;

    public CallbackInfo() {
    }

    public CallbackInfo(
           java.lang.String signedDocumentUrl) {
           this.signedDocumentUrl = signedDocumentUrl;
    }


    /**
     * Gets the signedDocumentUrl value for this CallbackInfo.
     * 
     * @return signedDocumentUrl
     */
    public java.lang.String getSignedDocumentUrl() {
        return signedDocumentUrl;
    }


    /**
     * Sets the signedDocumentUrl value for this CallbackInfo.
     * 
     * @param signedDocumentUrl
     */
    public void setSignedDocumentUrl(java.lang.String signedDocumentUrl) {
        this.signedDocumentUrl = signedDocumentUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallbackInfo)) return false;
        CallbackInfo other = (CallbackInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signedDocumentUrl==null && other.getSignedDocumentUrl()==null) || 
             (this.signedDocumentUrl!=null &&
              this.signedDocumentUrl.equals(other.getSignedDocumentUrl())));
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
        if (getSignedDocumentUrl() != null) {
            _hashCode += getSignedDocumentUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallbackInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "CallbackInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signedDocumentUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "signedDocumentUrl"));
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
