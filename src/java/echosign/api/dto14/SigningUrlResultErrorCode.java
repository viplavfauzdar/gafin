/**
 * SigningUrlResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class SigningUrlResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SigningUrlResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _DOCUMENT_HAS_BEEN_DELETED = "DOCUMENT_HAS_BEEN_DELETED";
    public static final java.lang.String _DOCUMENT_NOT_SIGNABLE = "DOCUMENT_NOT_SIGNABLE";
    public static final java.lang.String _DOCUMENT_NOT_VISIBLE = "DOCUMENT_NOT_VISIBLE";
    public static final java.lang.String _DOCUMENT_NOT_EXPOSED = "DOCUMENT_NOT_EXPOSED";
    public static final java.lang.String _DOCUMENT_ALREADY_SIGNED = "DOCUMENT_ALREADY_SIGNED";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final SigningUrlResultErrorCode OK = new SigningUrlResultErrorCode(_OK);
    public static final SigningUrlResultErrorCode INVALID_API_KEY = new SigningUrlResultErrorCode(_INVALID_API_KEY);
    public static final SigningUrlResultErrorCode INVALID_DOCUMENT_KEY = new SigningUrlResultErrorCode(_INVALID_DOCUMENT_KEY);
    public static final SigningUrlResultErrorCode DOCUMENT_HAS_BEEN_DELETED = new SigningUrlResultErrorCode(_DOCUMENT_HAS_BEEN_DELETED);
    public static final SigningUrlResultErrorCode DOCUMENT_NOT_SIGNABLE = new SigningUrlResultErrorCode(_DOCUMENT_NOT_SIGNABLE);
    public static final SigningUrlResultErrorCode DOCUMENT_NOT_VISIBLE = new SigningUrlResultErrorCode(_DOCUMENT_NOT_VISIBLE);
    public static final SigningUrlResultErrorCode DOCUMENT_NOT_EXPOSED = new SigningUrlResultErrorCode(_DOCUMENT_NOT_EXPOSED);
    public static final SigningUrlResultErrorCode DOCUMENT_ALREADY_SIGNED = new SigningUrlResultErrorCode(_DOCUMENT_ALREADY_SIGNED);
    public static final SigningUrlResultErrorCode EXCEPTION = new SigningUrlResultErrorCode(_EXCEPTION);
    public static final SigningUrlResultErrorCode MISC_ERROR = new SigningUrlResultErrorCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static SigningUrlResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SigningUrlResultErrorCode enumeration = (SigningUrlResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SigningUrlResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SigningUrlResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "SigningUrlResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
