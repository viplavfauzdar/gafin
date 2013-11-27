/**
 * DeleteGroupResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto15;

public class DeleteGroupResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeleteGroupResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_GROUP_KEY = "INVALID_GROUP_KEY";
    public static final java.lang.String _GROUP_NOT_EMPTY = "GROUP_NOT_EMPTY";
    public static final java.lang.String _CANNOT_DELETE_DEFAULT_GROUP = "CANNOT_DELETE_DEFAULT_GROUP";
    public static final java.lang.String _TERMS_NOT_ACCEPTED = "TERMS_NOT_ACCEPTED";
    public static final java.lang.String _NOT_IN_ACCOUNT = "NOT_IN_ACCOUNT";
    public static final java.lang.String _NO_PERMISSION_TO_EXECUTE_METHOD = "NO_PERMISSION_TO_EXECUTE_METHOD";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final DeleteGroupResultErrorCode OK = new DeleteGroupResultErrorCode(_OK);
    public static final DeleteGroupResultErrorCode INVALID_API_KEY = new DeleteGroupResultErrorCode(_INVALID_API_KEY);
    public static final DeleteGroupResultErrorCode INVALID_GROUP_KEY = new DeleteGroupResultErrorCode(_INVALID_GROUP_KEY);
    public static final DeleteGroupResultErrorCode GROUP_NOT_EMPTY = new DeleteGroupResultErrorCode(_GROUP_NOT_EMPTY);
    public static final DeleteGroupResultErrorCode CANNOT_DELETE_DEFAULT_GROUP = new DeleteGroupResultErrorCode(_CANNOT_DELETE_DEFAULT_GROUP);
    public static final DeleteGroupResultErrorCode TERMS_NOT_ACCEPTED = new DeleteGroupResultErrorCode(_TERMS_NOT_ACCEPTED);
    public static final DeleteGroupResultErrorCode NOT_IN_ACCOUNT = new DeleteGroupResultErrorCode(_NOT_IN_ACCOUNT);
    public static final DeleteGroupResultErrorCode NO_PERMISSION_TO_EXECUTE_METHOD = new DeleteGroupResultErrorCode(_NO_PERMISSION_TO_EXECUTE_METHOD);
    public static final DeleteGroupResultErrorCode MISC_ERROR = new DeleteGroupResultErrorCode(_MISC_ERROR);
    public static final DeleteGroupResultErrorCode EXCEPTION = new DeleteGroupResultErrorCode(_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static DeleteGroupResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeleteGroupResultErrorCode enumeration = (DeleteGroupResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeleteGroupResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeleteGroupResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto15.api.echosign", "DeleteGroupResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
