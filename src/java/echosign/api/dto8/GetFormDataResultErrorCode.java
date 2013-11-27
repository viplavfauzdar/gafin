/**
 * GetFormDataResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class GetFormDataResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetFormDataResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _DOCUMENT_HAS_BEEN_DELETED = "DOCUMENT_HAS_BEEN_DELETED";
    public static final java.lang.String _NO_FORM_DATA = "NO_FORM_DATA";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final GetFormDataResultErrorCode OK = new GetFormDataResultErrorCode(_OK);
    public static final GetFormDataResultErrorCode INVALID_API_KEY = new GetFormDataResultErrorCode(_INVALID_API_KEY);
    public static final GetFormDataResultErrorCode INVALID_DOCUMENT_KEY = new GetFormDataResultErrorCode(_INVALID_DOCUMENT_KEY);
    public static final GetFormDataResultErrorCode DOCUMENT_HAS_BEEN_DELETED = new GetFormDataResultErrorCode(_DOCUMENT_HAS_BEEN_DELETED);
    public static final GetFormDataResultErrorCode NO_FORM_DATA = new GetFormDataResultErrorCode(_NO_FORM_DATA);
    public static final GetFormDataResultErrorCode EXCEPTION = new GetFormDataResultErrorCode(_EXCEPTION);
    public static final GetFormDataResultErrorCode MISC_ERROR = new GetFormDataResultErrorCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetFormDataResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetFormDataResultErrorCode enumeration = (GetFormDataResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetFormDataResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetFormDataResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "GetFormDataResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
