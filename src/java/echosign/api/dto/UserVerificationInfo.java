/**
 * UserVerificationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class UserVerificationInfo  implements java.io.Serializable {
    private echosign.api.dto.UserVerificationStatus userVerificationStatus;

    public UserVerificationInfo() {
    }

    public UserVerificationInfo(
           echosign.api.dto.UserVerificationStatus userVerificationStatus) {
           this.userVerificationStatus = userVerificationStatus;
    }


    /**
     * Gets the userVerificationStatus value for this UserVerificationInfo.
     * 
     * @return userVerificationStatus
     */
    public echosign.api.dto.UserVerificationStatus getUserVerificationStatus() {
        return userVerificationStatus;
    }


    /**
     * Sets the userVerificationStatus value for this UserVerificationInfo.
     * 
     * @param userVerificationStatus
     */
    public void setUserVerificationStatus(echosign.api.dto.UserVerificationStatus userVerificationStatus) {
        this.userVerificationStatus = userVerificationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserVerificationInfo)) return false;
        UserVerificationInfo other = (UserVerificationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userVerificationStatus==null && other.getUserVerificationStatus()==null) || 
             (this.userVerificationStatus!=null &&
              this.userVerificationStatus.equals(other.getUserVerificationStatus())));
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
        if (getUserVerificationStatus() != null) {
            _hashCode += getUserVerificationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserVerificationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userVerificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "userVerificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationStatus"));
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
