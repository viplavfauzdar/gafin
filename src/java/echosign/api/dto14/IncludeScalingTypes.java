/**
 * IncludeScalingTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class IncludeScalingTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IncludeScalingTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _FIXED_WIDTH = "FIXED_WIDTH";
    public static final java.lang.String _PERCENT_ZOOM = "PERCENT_ZOOM";
    public static final IncludeScalingTypes ALL = new IncludeScalingTypes(_ALL);
    public static final IncludeScalingTypes FIXED_WIDTH = new IncludeScalingTypes(_FIXED_WIDTH);
    public static final IncludeScalingTypes PERCENT_ZOOM = new IncludeScalingTypes(_PERCENT_ZOOM);
    public java.lang.String getValue() { return _value_;}
    public static IncludeScalingTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IncludeScalingTypes enumeration = (IncludeScalingTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IncludeScalingTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IncludeScalingTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "IncludeScalingTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
