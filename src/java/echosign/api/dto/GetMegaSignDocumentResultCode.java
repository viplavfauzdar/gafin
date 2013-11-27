/**
 * GetMegaSignDocumentResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class GetMegaSignDocumentResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetMegaSignDocumentResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final java.lang.String _PERMISSION_DENIED = "PERMISSION_DENIED";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _NOT_MEGASIGN = "NOT_MEGASIGN";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final GetMegaSignDocumentResultCode OK = new GetMegaSignDocumentResultCode(_OK);
    public static final GetMegaSignDocumentResultCode INVALID_API_KEY = new GetMegaSignDocumentResultCode(_INVALID_API_KEY);
    public static final GetMegaSignDocumentResultCode EXCEPTION = new GetMegaSignDocumentResultCode(_EXCEPTION);
    public static final GetMegaSignDocumentResultCode MISC_ERROR = new GetMegaSignDocumentResultCode(_MISC_ERROR);
    public static final GetMegaSignDocumentResultCode PERMISSION_DENIED = new GetMegaSignDocumentResultCode(_PERMISSION_DENIED);
    public static final GetMegaSignDocumentResultCode INVALID_DOCUMENT_KEY = new GetMegaSignDocumentResultCode(_INVALID_DOCUMENT_KEY);
    public static final GetMegaSignDocumentResultCode NOT_MEGASIGN = new GetMegaSignDocumentResultCode(_NOT_MEGASIGN);
    public static final GetMegaSignDocumentResultCode EXPIRED = new GetMegaSignDocumentResultCode(_EXPIRED);
    public java.lang.String getValue() { return _value_;}
    public static GetMegaSignDocumentResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetMegaSignDocumentResultCode enumeration = (GetMegaSignDocumentResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetMegaSignDocumentResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetMegaSignDocumentResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "GetMegaSignDocumentResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
