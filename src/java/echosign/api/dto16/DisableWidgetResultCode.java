/**
 * DisableWidgetResultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class DisableWidgetResultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DisableWidgetResultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _ALREADY_DISABLED = "ALREADY_DISABLED";
    public static final java.lang.String _TOO_MANY_ACTIONS_SPECIFIED = "TOO_MANY_ACTIONS_SPECIFIED";
    public static final java.lang.String _NO_ACTION_SPECIFIED = "NO_ACTION_SPECIFIED";
    public static final java.lang.String _INVALID_URL = "INVALID_URL";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final DisableWidgetResultCode OK = new DisableWidgetResultCode(_OK);
    public static final DisableWidgetResultCode INVALID_API_KEY = new DisableWidgetResultCode(_INVALID_API_KEY);
    public static final DisableWidgetResultCode INVALID_DOCUMENT_KEY = new DisableWidgetResultCode(_INVALID_DOCUMENT_KEY);
    public static final DisableWidgetResultCode ALREADY_DISABLED = new DisableWidgetResultCode(_ALREADY_DISABLED);
    public static final DisableWidgetResultCode TOO_MANY_ACTIONS_SPECIFIED = new DisableWidgetResultCode(_TOO_MANY_ACTIONS_SPECIFIED);
    public static final DisableWidgetResultCode NO_ACTION_SPECIFIED = new DisableWidgetResultCode(_NO_ACTION_SPECIFIED);
    public static final DisableWidgetResultCode INVALID_URL = new DisableWidgetResultCode(_INVALID_URL);
    public static final DisableWidgetResultCode EXCEPTION = new DisableWidgetResultCode(_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static DisableWidgetResultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DisableWidgetResultCode enumeration = (DisableWidgetResultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DisableWidgetResultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DisableWidgetResultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DisableWidgetResultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
