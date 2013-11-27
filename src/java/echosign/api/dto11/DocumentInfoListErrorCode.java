/**
 * DocumentInfoListErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto11;

public class DocumentInfoListErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentInfoListErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _NO_ACCESS_WITHOUT_CREDENTIAL = "NO_ACCESS_WITHOUT_CREDENTIAL";
    public static final java.lang.String _INVALID_CREDENTIAL = "INVALID_CREDENTIAL";
    public static final java.lang.String _INVALID_EXTERNAL_ID = "INVALID_EXTERNAL_ID";
    public static final DocumentInfoListErrorCode INVALID_API_KEY = new DocumentInfoListErrorCode(_INVALID_API_KEY);
    public static final DocumentInfoListErrorCode NO_ACCESS_WITHOUT_CREDENTIAL = new DocumentInfoListErrorCode(_NO_ACCESS_WITHOUT_CREDENTIAL);
    public static final DocumentInfoListErrorCode INVALID_CREDENTIAL = new DocumentInfoListErrorCode(_INVALID_CREDENTIAL);
    public static final DocumentInfoListErrorCode INVALID_EXTERNAL_ID = new DocumentInfoListErrorCode(_INVALID_EXTERNAL_ID);
    public java.lang.String getValue() { return _value_;}
    public static DocumentInfoListErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentInfoListErrorCode enumeration = (DocumentInfoListErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DocumentInfoListErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentInfoListErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto11.api.echosign", "DocumentInfoListErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
