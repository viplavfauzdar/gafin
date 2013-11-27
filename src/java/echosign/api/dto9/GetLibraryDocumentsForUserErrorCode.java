/**
 * GetLibraryDocumentsForUserErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class GetLibraryDocumentsForUserErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetLibraryDocumentsForUserErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_USER_CREDENTIALS = "INVALID_USER_CREDENTIALS";
    public static final java.lang.String _PERMISSION_DENIED = "PERMISSION_DENIED";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final GetLibraryDocumentsForUserErrorCode OK = new GetLibraryDocumentsForUserErrorCode(_OK);
    public static final GetLibraryDocumentsForUserErrorCode INVALID_API_KEY = new GetLibraryDocumentsForUserErrorCode(_INVALID_API_KEY);
    public static final GetLibraryDocumentsForUserErrorCode INVALID_USER_CREDENTIALS = new GetLibraryDocumentsForUserErrorCode(_INVALID_USER_CREDENTIALS);
    public static final GetLibraryDocumentsForUserErrorCode PERMISSION_DENIED = new GetLibraryDocumentsForUserErrorCode(_PERMISSION_DENIED);
    public static final GetLibraryDocumentsForUserErrorCode EXCEPTION = new GetLibraryDocumentsForUserErrorCode(_EXCEPTION);
    public static final GetLibraryDocumentsForUserErrorCode MISC_ERROR = new GetLibraryDocumentsForUserErrorCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetLibraryDocumentsForUserErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetLibraryDocumentsForUserErrorCode enumeration = (GetLibraryDocumentsForUserErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetLibraryDocumentsForUserErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetLibraryDocumentsForUserErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "GetLibraryDocumentsForUserErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
