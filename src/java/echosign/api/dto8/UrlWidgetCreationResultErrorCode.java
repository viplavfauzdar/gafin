/**
 * UrlWidgetCreationResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class UrlWidgetCreationResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UrlWidgetCreationResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_URL = "INVALID_URL";
    public static final java.lang.String _INVALID_SIGNATURE_FLOW = "INVALID_SIGNATURE_FLOW";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final UrlWidgetCreationResultErrorCode OK = new UrlWidgetCreationResultErrorCode(_OK);
    public static final UrlWidgetCreationResultErrorCode INVALID_API_KEY = new UrlWidgetCreationResultErrorCode(_INVALID_API_KEY);
    public static final UrlWidgetCreationResultErrorCode INVALID_URL = new UrlWidgetCreationResultErrorCode(_INVALID_URL);
    public static final UrlWidgetCreationResultErrorCode INVALID_SIGNATURE_FLOW = new UrlWidgetCreationResultErrorCode(_INVALID_SIGNATURE_FLOW);
    public static final UrlWidgetCreationResultErrorCode EXCEPTION = new UrlWidgetCreationResultErrorCode(_EXCEPTION);
    public static final UrlWidgetCreationResultErrorCode MISC_ERROR = new UrlWidgetCreationResultErrorCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static UrlWidgetCreationResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UrlWidgetCreationResultErrorCode enumeration = (UrlWidgetCreationResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UrlWidgetCreationResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UrlWidgetCreationResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "UrlWidgetCreationResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
