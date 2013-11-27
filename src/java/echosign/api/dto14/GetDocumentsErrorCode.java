/**
 * GetDocumentsErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class GetDocumentsErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetDocumentsErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _INVALID_VERSION_KEY = "INVALID_VERSION_KEY";
    public static final java.lang.String _INVALID_PARTICIPANT = "INVALID_PARTICIPANT";
    public static final java.lang.String _DOCUMENT_NOT_AVAILABLE = "DOCUMENT_NOT_AVAILABLE";
    public static final java.lang.String _DOCUMENT_NOT_EXPOSED = "DOCUMENT_NOT_EXPOSED";
    public static final java.lang.String _DOCUMENT_REMOVED = "DOCUMENT_REMOVED";
    public static final java.lang.String _DOCUMENT_DELETED = "DOCUMENT_DELETED";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final GetDocumentsErrorCode OK = new GetDocumentsErrorCode(_OK);
    public static final GetDocumentsErrorCode INVALID_API_KEY = new GetDocumentsErrorCode(_INVALID_API_KEY);
    public static final GetDocumentsErrorCode INVALID_DOCUMENT_KEY = new GetDocumentsErrorCode(_INVALID_DOCUMENT_KEY);
    public static final GetDocumentsErrorCode INVALID_VERSION_KEY = new GetDocumentsErrorCode(_INVALID_VERSION_KEY);
    public static final GetDocumentsErrorCode INVALID_PARTICIPANT = new GetDocumentsErrorCode(_INVALID_PARTICIPANT);
    public static final GetDocumentsErrorCode DOCUMENT_NOT_AVAILABLE = new GetDocumentsErrorCode(_DOCUMENT_NOT_AVAILABLE);
    public static final GetDocumentsErrorCode DOCUMENT_NOT_EXPOSED = new GetDocumentsErrorCode(_DOCUMENT_NOT_EXPOSED);
    public static final GetDocumentsErrorCode DOCUMENT_REMOVED = new GetDocumentsErrorCode(_DOCUMENT_REMOVED);
    public static final GetDocumentsErrorCode DOCUMENT_DELETED = new GetDocumentsErrorCode(_DOCUMENT_DELETED);
    public static final GetDocumentsErrorCode INTERNAL_ERROR = new GetDocumentsErrorCode(_INTERNAL_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetDocumentsErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetDocumentsErrorCode enumeration = (GetDocumentsErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetDocumentsErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetDocumentsErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
