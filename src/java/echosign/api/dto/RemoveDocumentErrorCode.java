/**
 * RemoveDocumentErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class RemoveDocumentErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RemoveDocumentErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _DOCUMENT_HAS_BEEN_REMOVED = "DOCUMENT_HAS_BEEN_REMOVED";
    public static final java.lang.String _DYNAMIC_DOCUMENT_EXPIRATION_NOT_ENABLED = "DYNAMIC_DOCUMENT_EXPIRATION_NOT_ENABLED";
    public static final java.lang.String _REMOVE_FAILED = "REMOVE_FAILED";
    public static final RemoveDocumentErrorCode INVALID_API_KEY = new RemoveDocumentErrorCode(_INVALID_API_KEY);
    public static final RemoveDocumentErrorCode INVALID_DOCUMENT_KEY = new RemoveDocumentErrorCode(_INVALID_DOCUMENT_KEY);
    public static final RemoveDocumentErrorCode DOCUMENT_HAS_BEEN_REMOVED = new RemoveDocumentErrorCode(_DOCUMENT_HAS_BEEN_REMOVED);
    public static final RemoveDocumentErrorCode DYNAMIC_DOCUMENT_EXPIRATION_NOT_ENABLED = new RemoveDocumentErrorCode(_DYNAMIC_DOCUMENT_EXPIRATION_NOT_ENABLED);
    public static final RemoveDocumentErrorCode REMOVE_FAILED = new RemoveDocumentErrorCode(_REMOVE_FAILED);
    public java.lang.String getValue() { return _value_;}
    public static RemoveDocumentErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RemoveDocumentErrorCode enumeration = (RemoveDocumentErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RemoveDocumentErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RemoveDocumentErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "RemoveDocumentErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
