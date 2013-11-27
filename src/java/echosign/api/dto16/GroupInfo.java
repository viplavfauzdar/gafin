/**
 * GroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class GroupInfo  implements java.io.Serializable {
    private java.lang.String groupKey;

    private java.lang.String groupName;

    public GroupInfo() {
    }

    public GroupInfo(
           java.lang.String groupKey,
           java.lang.String groupName) {
           this.groupKey = groupKey;
           this.groupName = groupName;
    }


    /**
     * Gets the groupKey value for this GroupInfo.
     * 
     * @return groupKey
     */
    public java.lang.String getGroupKey() {
        return groupKey;
    }


    /**
     * Sets the groupKey value for this GroupInfo.
     * 
     * @param groupKey
     */
    public void setGroupKey(java.lang.String groupKey) {
        this.groupKey = groupKey;
    }


    /**
     * Gets the groupName value for this GroupInfo.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this GroupInfo.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupInfo)) return false;
        GroupInfo other = (GroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupKey==null && other.getGroupKey()==null) || 
             (this.groupKey!=null &&
              this.groupKey.equals(other.getGroupKey()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName())));
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
        if (getGroupKey() != null) {
            _hashCode += getGroupKey().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "GroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "groupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "groupName"));
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
