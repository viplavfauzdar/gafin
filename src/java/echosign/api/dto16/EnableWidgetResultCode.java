/**
 * EnableWidgetResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class EnableWidgetResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnableWidgetResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _ALREADY_ENABLED = "ALREADY_ENABLED";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final EnableWidgetResultCode OK = new EnableWidgetResultCode(_OK);
    public static final EnableWidgetResultCode INVALID_API_KEY = new EnableWidgetResultCode(_INVALID_API_KEY);
    public static final EnableWidgetResultCode INVALID_DOCUMENT_KEY = new EnableWidgetResultCode(_INVALID_DOCUMENT_KEY);
    public static final EnableWidgetResultCode ALREADY_ENABLED = new EnableWidgetResultCode(_ALREADY_ENABLED);
    public static final EnableWidgetResultCode EXCEPTION = new EnableWidgetResultCode(_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static EnableWidgetResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnableWidgetResultCode enumeration = (EnableWidgetResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnableWidgetResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EnableWidgetResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "EnableWidgetResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
