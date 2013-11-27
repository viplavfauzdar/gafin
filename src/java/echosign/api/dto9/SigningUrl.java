/**
 * SigningUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class SigningUrl  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String esignUrl;

    private java.lang.String simpleEsignUrl;

    public SigningUrl() {
    }

    public SigningUrl(
           java.lang.String email,
           java.lang.String esignUrl,
           java.lang.String simpleEsignUrl) {
           this.email = email;
           this.esignUrl = esignUrl;
           this.simpleEsignUrl = simpleEsignUrl;
    }


    /**
     * Gets the email value for this SigningUrl.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SigningUrl.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the esignUrl value for this SigningUrl.
     * 
     * @return esignUrl
     */
    public java.lang.String getEsignUrl() {
        return esignUrl;
    }


    /**
     * Sets the esignUrl value for this SigningUrl.
     * 
     * @param esignUrl
     */
    public void setEsignUrl(java.lang.String esignUrl) {
        this.esignUrl = esignUrl;
    }


    /**
     * Gets the simpleEsignUrl value for this SigningUrl.
     * 
     * @return simpleEsignUrl
     */
    public java.lang.String getSimpleEsignUrl() {
        return simpleEsignUrl;
    }


    /**
     * Sets the simpleEsignUrl value for this SigningUrl.
     * 
     * @param simpleEsignUrl
     */
    public void setSimpleEsignUrl(java.lang.String simpleEsignUrl) {
        this.simpleEsignUrl = simpleEsignUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SigningUrl)) return false;
        SigningUrl other = (SigningUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.esignUrl==null && other.getEsignUrl()==null) || 
             (this.esignUrl!=null &&
              this.esignUrl.equals(other.getEsignUrl()))) &&
            ((this.simpleEsignUrl==null && other.getSimpleEsignUrl()==null) || 
             (this.simpleEsignUrl!=null &&
              this.simpleEsignUrl.equals(other.getSimpleEsignUrl())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEsignUrl() != null) {
            _hashCode += getEsignUrl().hashCode();
        }
        if (getSimpleEsignUrl() != null) {
            _hashCode += getSimpleEsignUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SigningUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "SigningUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esignUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "esignUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleEsignUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "simpleEsignUrl"));
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
