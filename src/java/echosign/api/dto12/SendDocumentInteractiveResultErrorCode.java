/**
 * SendDocumentInteractiveResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto12;

public class SendDocumentInteractiveResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SendDocumentInteractiveResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_ARGUMENTS = "INVALID_ARGUMENTS";
    public static final java.lang.String _AUTOLOGIN_DENIED = "AUTOLOGIN_DENIED";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final SendDocumentInteractiveResultErrorCode OK = new SendDocumentInteractiveResultErrorCode(_OK);
    public static final SendDocumentInteractiveResultErrorCode INVALID_API_KEY = new SendDocumentInteractiveResultErrorCode(_INVALID_API_KEY);
    public static final SendDocumentInteractiveResultErrorCode INVALID_ARGUMENTS = new SendDocumentInteractiveResultErrorCode(_INVALID_ARGUMENTS);
    public static final SendDocumentInteractiveResultErrorCode AUTOLOGIN_DENIED = new SendDocumentInteractiveResultErrorCode(_AUTOLOGIN_DENIED);
    public static final SendDocumentInteractiveResultErrorCode MISC_ERROR = new SendDocumentInteractiveResultErrorCode(_MISC_ERROR);
    public static final SendDocumentInteractiveResultErrorCode EXCEPTION = new SendDocumentInteractiveResultErrorCode(_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static SendDocumentInteractiveResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SendDocumentInteractiveResultErrorCode enumeration = (SendDocumentInteractiveResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SendDocumentInteractiveResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SendDocumentInteractiveResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
