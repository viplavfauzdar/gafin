/**
 * UserVerificationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class UserVerificationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserVerificationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VALID = "VALID";
    public static final java.lang.String _DOES_NOT_EXIST = "DOES_NOT_EXIST";
    public static final java.lang.String _INVALID_PASSWORD = "INVALID_PASSWORD";
    public static final java.lang.String _UNVERIFIED = "UNVERIFIED";
    public static final UserVerificationStatus VALID = new UserVerificationStatus(_VALID);
    public static final UserVerificationStatus DOES_NOT_EXIST = new UserVerificationStatus(_DOES_NOT_EXIST);
    public static final UserVerificationStatus INVALID_PASSWORD = new UserVerificationStatus(_INVALID_PASSWORD);
    public static final UserVerificationStatus UNVERIFIED = new UserVerificationStatus(_UNVERIFIED);
    public java.lang.String getValue() { return _value_;}
    public static UserVerificationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserVerificationStatus enumeration = (UserVerificationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserVerificationStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserVerificationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "UserVerificationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
