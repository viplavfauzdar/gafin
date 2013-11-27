/**
 * GetDocumentsForUserResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class GetDocumentsForUserResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetDocumentsForUserResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_USER_CREDENTIALS = "INVALID_USER_CREDENTIALS";
    public static final java.lang.String _INVALID_USER_KEY = "INVALID_USER_KEY";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final java.lang.String _PERMISSION_DENIED = "PERMISSION_DENIED";
    public static final GetDocumentsForUserResultCode OK = new GetDocumentsForUserResultCode(_OK);
    public static final GetDocumentsForUserResultCode INVALID_API_KEY = new GetDocumentsForUserResultCode(_INVALID_API_KEY);
    public static final GetDocumentsForUserResultCode INVALID_USER_CREDENTIALS = new GetDocumentsForUserResultCode(_INVALID_USER_CREDENTIALS);
    public static final GetDocumentsForUserResultCode INVALID_USER_KEY = new GetDocumentsForUserResultCode(_INVALID_USER_KEY);
    public static final GetDocumentsForUserResultCode EXCEPTION = new GetDocumentsForUserResultCode(_EXCEPTION);
    public static final GetDocumentsForUserResultCode MISC_ERROR = new GetDocumentsForUserResultCode(_MISC_ERROR);
    public static final GetDocumentsForUserResultCode PERMISSION_DENIED = new GetDocumentsForUserResultCode(_PERMISSION_DENIED);
    public java.lang.String getValue() { return _value_;}
    public static GetDocumentsForUserResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetDocumentsForUserResultCode enumeration = (GetDocumentsForUserResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetDocumentsForUserResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetDocumentsForUserResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentsForUserResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
