/**
 * ReminderFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class ReminderFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReminderFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DAILY_UNTIL_SIGNED = "DAILY_UNTIL_SIGNED";
    public static final java.lang.String _WEEKLY_UNTIL_SIGNED = "WEEKLY_UNTIL_SIGNED";
    public static final java.lang.String _NEVER = "NEVER";
    public static final ReminderFrequency DAILY_UNTIL_SIGNED = new ReminderFrequency(_DAILY_UNTIL_SIGNED);
    public static final ReminderFrequency WEEKLY_UNTIL_SIGNED = new ReminderFrequency(_WEEKLY_UNTIL_SIGNED);
    public static final ReminderFrequency NEVER = new ReminderFrequency(_NEVER);
    public java.lang.String getValue() { return _value_;}
    public static ReminderFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReminderFrequency enumeration = (ReminderFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReminderFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReminderFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "ReminderFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
