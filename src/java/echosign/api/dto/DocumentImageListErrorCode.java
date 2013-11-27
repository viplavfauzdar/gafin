/**
 * DocumentImageListErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class DocumentImageListErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentImageListErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _INVALID_VERSION_KEY = "INVALID_VERSION_KEY";
    public static final java.lang.String _DOCUMENT_HAS_BEEN_DELETED = "DOCUMENT_HAS_BEEN_DELETED";
    public static final java.lang.String _IMAGES_NOT_AVAILABLE = "IMAGES_NOT_AVAILABLE";
    public static final DocumentImageListErrorCode INVALID_API_KEY = new DocumentImageListErrorCode(_INVALID_API_KEY);
    public static final DocumentImageListErrorCode INVALID_DOCUMENT_KEY = new DocumentImageListErrorCode(_INVALID_DOCUMENT_KEY);
    public static final DocumentImageListErrorCode INVALID_VERSION_KEY = new DocumentImageListErrorCode(_INVALID_VERSION_KEY);
    public static final DocumentImageListErrorCode DOCUMENT_HAS_BEEN_DELETED = new DocumentImageListErrorCode(_DOCUMENT_HAS_BEEN_DELETED);
    public static final DocumentImageListErrorCode IMAGES_NOT_AVAILABLE = new DocumentImageListErrorCode(_IMAGES_NOT_AVAILABLE);
    public java.lang.String getValue() { return _value_;}
    public static DocumentImageListErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentImageListErrorCode enumeration = (DocumentImageListErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DocumentImageListErrorCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentImageListErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentImageListErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
