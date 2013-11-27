/**
 * UsersToMoveInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto15;

public class UsersToMoveInfo  implements java.io.Serializable {
    private java.lang.Boolean preserveGroupAdmins;

    private java.lang.String[] userEmails;

    public UsersToMoveInfo() {
    }

    public UsersToMoveInfo(
           java.lang.Boolean preserveGroupAdmins,
           java.lang.String[] userEmails) {
           this.preserveGroupAdmins = preserveGroupAdmins;
           this.userEmails = userEmails;
    }


    /**
     * Gets the preserveGroupAdmins value for this UsersToMoveInfo.
     * 
     * @return preserveGroupAdmins
     */
    public java.lang.Boolean getPreserveGroupAdmins() {
        return preserveGroupAdmins;
    }


    /**
     * Sets the preserveGroupAdmins value for this UsersToMoveInfo.
     * 
     * @param preserveGroupAdmins
     */
    public void setPreserveGroupAdmins(java.lang.Boolean preserveGroupAdmins) {
        this.preserveGroupAdmins = preserveGroupAdmins;
    }


    /**
     * Gets the userEmails value for this UsersToMoveInfo.
     * 
     * @return userEmails
     */
    public java.lang.String[] getUserEmails() {
        return userEmails;
    }


    /**
     * Sets the userEmails value for this UsersToMoveInfo.
     * 
     * @param userEmails
     */
    public void setUserEmails(java.lang.String[] userEmails) {
        this.userEmails = userEmails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsersToMoveInfo)) return false;
        UsersToMoveInfo other = (UsersToMoveInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preserveGroupAdmins==null && other.getPreserveGroupAdmins()==null) || 
             (this.preserveGroupAdmins!=null &&
              this.preserveGroupAdmins.equals(other.getPreserveGroupAdmins()))) &&
            ((this.userEmails==null && other.getUserEmails()==null) || 
             (this.userEmails!=null &&
              java.util.Arrays.equals(this.userEmails, other.getUserEmails())));
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
        if (getPreserveGroupAdmins() != null) {
            _hashCode += getPreserveGroupAdmins().hashCode();
        }
        if (getUserEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsersToMoveInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto15.api.echosign", "UsersToMoveInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preserveGroupAdmins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto15.api.echosign", "preserveGroupAdmins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto15.api.echosign", "userEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.echosign", "string"));
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
