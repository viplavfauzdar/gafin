/**
 * DocumentContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class DocumentContent  implements java.io.Serializable {
    private byte[] bytes;

    private java.lang.String mimetype;

    private java.lang.String name;

    public DocumentContent() {
    }

    public DocumentContent(
           byte[] bytes,
           java.lang.String mimetype,
           java.lang.String name) {
           this.bytes = bytes;
           this.mimetype = mimetype;
           this.name = name;
    }


    /**
     * Gets the bytes value for this DocumentContent.
     * 
     * @return bytes
     */
    public byte[] getBytes() {
        return bytes;
    }


    /**
     * Sets the bytes value for this DocumentContent.
     * 
     * @param bytes
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }


    /**
     * Gets the mimetype value for this DocumentContent.
     * 
     * @return mimetype
     */
    public java.lang.String getMimetype() {
        return mimetype;
    }


    /**
     * Sets the mimetype value for this DocumentContent.
     * 
     * @param mimetype
     */
    public void setMimetype(java.lang.String mimetype) {
        this.mimetype = mimetype;
    }


    /**
     * Gets the name value for this DocumentContent.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentContent.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentContent)) return false;
        DocumentContent other = (DocumentContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bytes==null && other.getBytes()==null) || 
             (this.bytes!=null &&
              java.util.Arrays.equals(this.bytes, other.getBytes()))) &&
            ((this.mimetype==null && other.getMimetype()==null) || 
             (this.mimetype!=null &&
              this.mimetype.equals(other.getMimetype()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getBytes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBytes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBytes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMimetype() != null) {
            _hashCode += getMimetype().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "bytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "mimetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "name"));
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
