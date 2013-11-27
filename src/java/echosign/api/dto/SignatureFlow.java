/**
 * SignatureFlow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class SignatureFlow implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SignatureFlow(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SENDER_SIGNS_LAST = "SENDER_SIGNS_LAST";
    public static final java.lang.String _SENDER_SIGNS_FIRST = "SENDER_SIGNS_FIRST";
    public static final java.lang.String _SENDER_SIGNATURE_NOT_REQUIRED = "SENDER_SIGNATURE_NOT_REQUIRED";
    public static final java.lang.String _SEQUENTIAL = "SEQUENTIAL";
    public static final SignatureFlow SENDER_SIGNS_LAST = new SignatureFlow(_SENDER_SIGNS_LAST);
    public static final SignatureFlow SENDER_SIGNS_FIRST = new SignatureFlow(_SENDER_SIGNS_FIRST);
    public static final SignatureFlow SENDER_SIGNATURE_NOT_REQUIRED = new SignatureFlow(_SENDER_SIGNATURE_NOT_REQUIRED);
    public static final SignatureFlow SEQUENTIAL = new SignatureFlow(_SEQUENTIAL);
    public java.lang.String getValue() { return _value_;}
    public static SignatureFlow fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SignatureFlow enumeration = (SignatureFlow)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SignatureFlow fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SignatureFlow.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureFlow"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
