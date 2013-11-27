/**
 * DisplayUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class DisplayUserInfo  implements java.io.Serializable {
    private java.lang.String company;

    private java.lang.String fullNameOrEmail;

    public DisplayUserInfo() {
    }

    public DisplayUserInfo(
           java.lang.String company,
           java.lang.String fullNameOrEmail) {
           this.company = company;
           this.fullNameOrEmail = fullNameOrEmail;
    }


    /**
     * Gets the company value for this DisplayUserInfo.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this DisplayUserInfo.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the fullNameOrEmail value for this DisplayUserInfo.
     * 
     * @return fullNameOrEmail
     */
    public java.lang.String getFullNameOrEmail() {
        return fullNameOrEmail;
    }


    /**
     * Sets the fullNameOrEmail value for this DisplayUserInfo.
     * 
     * @param fullNameOrEmail
     */
    public void setFullNameOrEmail(java.lang.String fullNameOrEmail) {
        this.fullNameOrEmail = fullNameOrEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayUserInfo)) return false;
        DisplayUserInfo other = (DisplayUserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.fullNameOrEmail==null && other.getFullNameOrEmail()==null) || 
             (this.fullNameOrEmail!=null &&
              this.fullNameOrEmail.equals(other.getFullNameOrEmail())));
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getFullNameOrEmail() != null) {
            _hashCode += getFullNameOrEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayUserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DisplayUserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullNameOrEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "fullNameOrEmail"));
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
