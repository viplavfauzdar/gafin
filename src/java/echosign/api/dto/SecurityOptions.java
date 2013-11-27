/**
 * SecurityOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class SecurityOptions  implements java.io.Serializable {
    private echosign.api.dto.AppliesTo kbaProtection;

    private java.lang.String password;

    private echosign.api.dto.AppliesTo passwordProtection;

    private java.lang.Boolean protectOpen;

    private echosign.api.dto.AppliesTo webIdentityProtection;

    public SecurityOptions() {
    }

    public SecurityOptions(
           echosign.api.dto.AppliesTo kbaProtection,
           java.lang.String password,
           echosign.api.dto.AppliesTo passwordProtection,
           java.lang.Boolean protectOpen,
           echosign.api.dto.AppliesTo webIdentityProtection) {
           this.kbaProtection = kbaProtection;
           this.password = password;
           this.passwordProtection = passwordProtection;
           this.protectOpen = protectOpen;
           this.webIdentityProtection = webIdentityProtection;
    }


    /**
     * Gets the kbaProtection value for this SecurityOptions.
     * 
     * @return kbaProtection
     */
    public echosign.api.dto.AppliesTo getKbaProtection() {
        return kbaProtection;
    }


    /**
     * Sets the kbaProtection value for this SecurityOptions.
     * 
     * @param kbaProtection
     */
    public void setKbaProtection(echosign.api.dto.AppliesTo kbaProtection) {
        this.kbaProtection = kbaProtection;
    }


    /**
     * Gets the password value for this SecurityOptions.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SecurityOptions.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the passwordProtection value for this SecurityOptions.
     * 
     * @return passwordProtection
     */
    public echosign.api.dto.AppliesTo getPasswordProtection() {
        return passwordProtection;
    }


    /**
     * Sets the passwordProtection value for this SecurityOptions.
     * 
     * @param passwordProtection
     */
    public void setPasswordProtection(echosign.api.dto.AppliesTo passwordProtection) {
        this.passwordProtection = passwordProtection;
    }


    /**
     * Gets the protectOpen value for this SecurityOptions.
     * 
     * @return protectOpen
     */
    public java.lang.Boolean getProtectOpen() {
        return protectOpen;
    }


    /**
     * Sets the protectOpen value for this SecurityOptions.
     * 
     * @param protectOpen
     */
    public void setProtectOpen(java.lang.Boolean protectOpen) {
        this.protectOpen = protectOpen;
    }


    /**
     * Gets the webIdentityProtection value for this SecurityOptions.
     * 
     * @return webIdentityProtection
     */
    public echosign.api.dto.AppliesTo getWebIdentityProtection() {
        return webIdentityProtection;
    }


    /**
     * Sets the webIdentityProtection value for this SecurityOptions.
     * 
     * @param webIdentityProtection
     */
    public void setWebIdentityProtection(echosign.api.dto.AppliesTo webIdentityProtection) {
        this.webIdentityProtection = webIdentityProtection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityOptions)) return false;
        SecurityOptions other = (SecurityOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kbaProtection==null && other.getKbaProtection()==null) || 
             (this.kbaProtection!=null &&
              this.kbaProtection.equals(other.getKbaProtection()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.passwordProtection==null && other.getPasswordProtection()==null) || 
             (this.passwordProtection!=null &&
              this.passwordProtection.equals(other.getPasswordProtection()))) &&
            ((this.protectOpen==null && other.getProtectOpen()==null) || 
             (this.protectOpen!=null &&
              this.protectOpen.equals(other.getProtectOpen()))) &&
            ((this.webIdentityProtection==null && other.getWebIdentityProtection()==null) || 
             (this.webIdentityProtection!=null &&
              this.webIdentityProtection.equals(other.getWebIdentityProtection())));
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
        if (getKbaProtection() != null) {
            _hashCode += getKbaProtection().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPasswordProtection() != null) {
            _hashCode += getPasswordProtection().hashCode();
        }
        if (getProtectOpen() != null) {
            _hashCode += getProtectOpen().hashCode();
        }
        if (getWebIdentityProtection() != null) {
            _hashCode += getWebIdentityProtection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SecurityOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kbaProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "kbaProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "AppliesTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "passwordProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "AppliesTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "protectOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webIdentityProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "webIdentityProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "AppliesTo"));
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
