/**
 * ExternalId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class ExternalId  implements java.io.Serializable {
    private java.lang.String group;

    private java.lang.String id;

    private java.lang.String namespace;

    public ExternalId() {
    }

    public ExternalId(
           java.lang.String group,
           java.lang.String id,
           java.lang.String namespace) {
           this.group = group;
           this.id = id;
           this.namespace = namespace;
    }


    /**
     * Gets the group value for this ExternalId.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this ExternalId.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the id value for this ExternalId.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ExternalId.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the namespace value for this ExternalId.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this ExternalId.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalId)) return false;
        ExternalId other = (ExternalId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "ExternalId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "namespace"));
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
