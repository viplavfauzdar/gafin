/**
 * CreateAccountResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto7;

public class CreateAccountResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreateAccountResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _ACCOUNT_CREATION_NOT_ENABLED = "ACCOUNT_CREATION_NOT_ENABLED";
    public static final java.lang.String _INVALID_SEAT_COUNT = "INVALID_SEAT_COUNT";
    public static final java.lang.String _USER_CREATION_ERROR = "USER_CREATION_ERROR";
    public static final java.lang.String _USER_ALREADY_HAS_ACCOUNT = "USER_ALREADY_HAS_ACCOUNT";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final CreateAccountResultCode OK = new CreateAccountResultCode(_OK);
    public static final CreateAccountResultCode INVALID_API_KEY = new CreateAccountResultCode(_INVALID_API_KEY);
    public static final CreateAccountResultCode ACCOUNT_CREATION_NOT_ENABLED = new CreateAccountResultCode(_ACCOUNT_CREATION_NOT_ENABLED);
    public static final CreateAccountResultCode INVALID_SEAT_COUNT = new CreateAccountResultCode(_INVALID_SEAT_COUNT);
    public static final CreateAccountResultCode USER_CREATION_ERROR = new CreateAccountResultCode(_USER_CREATION_ERROR);
    public static final CreateAccountResultCode USER_ALREADY_HAS_ACCOUNT = new CreateAccountResultCode(_USER_ALREADY_HAS_ACCOUNT);
    public static final CreateAccountResultCode EXCEPTION = new CreateAccountResultCode(_EXCEPTION);
    public static final CreateAccountResultCode MISC_ERROR = new CreateAccountResultCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static CreateAccountResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreateAccountResultCode enumeration = (CreateAccountResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreateAccountResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreateAccountResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto7.api.echosign", "CreateAccountResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
