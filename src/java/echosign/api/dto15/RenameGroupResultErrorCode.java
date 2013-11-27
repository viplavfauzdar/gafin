/**
 * RenameGroupResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto15;

public class RenameGroupResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RenameGroupResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_GROUP_KEY = "INVALID_GROUP_KEY";
    public static final java.lang.String _INVALID_GROUP_NAME = "INVALID_GROUP_NAME";
    public static final java.lang.String _TERMS_NOT_ACCEPTED = "TERMS_NOT_ACCEPTED";
    public static final java.lang.String _NOT_IN_ACCOUNT = "NOT_IN_ACCOUNT";
    public static final java.lang.String _NO_PERMISSION_TO_EXECUTE_METHOD = "NO_PERMISSION_TO_EXECUTE_METHOD";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final RenameGroupResultErrorCode OK = new RenameGroupResultErrorCode(_OK);
    public static final RenameGroupResultErrorCode INVALID_API_KEY = new RenameGroupResultErrorCode(_INVALID_API_KEY);
    public static final RenameGroupResultErrorCode INVALID_GROUP_KEY = new RenameGroupResultErrorCode(_INVALID_GROUP_KEY);
    public static final RenameGroupResultErrorCode INVALID_GROUP_NAME = new RenameGroupResultErrorCode(_INVALID_GROUP_NAME);
    public static final RenameGroupResultErrorCode TERMS_NOT_ACCEPTED = new RenameGroupResultErrorCode(_TERMS_NOT_ACCEPTED);
    public static final RenameGroupResultErrorCode NOT_IN_ACCOUNT = new RenameGroupResultErrorCode(_NOT_IN_ACCOUNT);
    public static final RenameGroupResultErrorCode NO_PERMISSION_TO_EXECUTE_METHOD = new RenameGroupResultErrorCode(_NO_PERMISSION_TO_EXECUTE_METHOD);
    public static final RenameGroupResultErrorCode MISC_ERROR = new RenameGroupResultErrorCode(_MISC_ERROR);
    public static final RenameGroupResultErrorCode EXCEPTION = new RenameGroupResultErrorCode(_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static RenameGroupResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RenameGroupResultErrorCode enumeration = (RenameGroupResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RenameGroupResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RenameGroupResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto15.api.echosign", "RenameGroupResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
