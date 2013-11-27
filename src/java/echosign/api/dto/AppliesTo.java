/**
 * AppliesTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class AppliesTo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppliesTo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _EXTERNAL_USERS = "EXTERNAL_USERS";
    public static final java.lang.String _INTERNAL_USERS = "INTERNAL_USERS";
    public static final java.lang.String _ALL_USERS = "ALL_USERS";
    public static final AppliesTo NONE = new AppliesTo(_NONE);
    public static final AppliesTo EXTERNAL_USERS = new AppliesTo(_EXTERNAL_USERS);
    public static final AppliesTo INTERNAL_USERS = new AppliesTo(_INTERNAL_USERS);
    public static final AppliesTo ALL_USERS = new AppliesTo(_ALL_USERS);
    public java.lang.String getValue() { return _value_;}
    public static AppliesTo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppliesTo enumeration = (AppliesTo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppliesTo fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AppliesTo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "AppliesTo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
