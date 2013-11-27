/**
 * GetSupportingDocumentsResultErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class GetSupportingDocumentsResultErrorCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetSupportingDocumentsResultErrorCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _INVALID_API_KEY = "INVALID_API_KEY";
    public static final java.lang.String _INVALID_DOCUMENT_KEY = "INVALID_DOCUMENT_KEY";
    public static final java.lang.String _DOCUMENT_HAS_BEEN_DELETED = "DOCUMENT_HAS_BEEN_DELETED";
    public static final java.lang.String _DOCUMENT_NOT_AVAILABLE = "DOCUMENT_NOT_AVAILABLE";
    public static final java.lang.String _DOCUMENT_ORIGINAL_FORMAT_NOT_ALLOWED = "DOCUMENT_ORIGINAL_FORMAT_NOT_ALLOWED";
    public static final java.lang.String _TERMS_OF_USE_NOT_ACCEPTED = "TERMS_OF_USE_NOT_ACCEPTED";
    public static final java.lang.String _NO_PERMISSION_TO_EXECUTE_METHOD = "NO_PERMISSION_TO_EXECUTE_METHOD";
    public static final java.lang.String _EXCEPTION = "EXCEPTION";
    public static final java.lang.String _MISC_ERROR = "MISC_ERROR";
    public static final GetSupportingDocumentsResultErrorCode OK = new GetSupportingDocumentsResultErrorCode(_OK);
    public static final GetSupportingDocumentsResultErrorCode INVALID_API_KEY = new GetSupportingDocumentsResultErrorCode(_INVALID_API_KEY);
    public static final GetSupportingDocumentsResultErrorCode INVALID_DOCUMENT_KEY = new GetSupportingDocumentsResultErrorCode(_INVALID_DOCUMENT_KEY);
    public static final GetSupportingDocumentsResultErrorCode DOCUMENT_HAS_BEEN_DELETED = new GetSupportingDocumentsResultErrorCode(_DOCUMENT_HAS_BEEN_DELETED);
    public static final GetSupportingDocumentsResultErrorCode DOCUMENT_NOT_AVAILABLE = new GetSupportingDocumentsResultErrorCode(_DOCUMENT_NOT_AVAILABLE);
    public static final GetSupportingDocumentsResultErrorCode DOCUMENT_ORIGINAL_FORMAT_NOT_ALLOWED = new GetSupportingDocumentsResultErrorCode(_DOCUMENT_ORIGINAL_FORMAT_NOT_ALLOWED);
    public static final GetSupportingDocumentsResultErrorCode TERMS_OF_USE_NOT_ACCEPTED = new GetSupportingDocumentsResultErrorCode(_TERMS_OF_USE_NOT_ACCEPTED);
    public static final GetSupportingDocumentsResultErrorCode NO_PERMISSION_TO_EXECUTE_METHOD = new GetSupportingDocumentsResultErrorCode(_NO_PERMISSION_TO_EXECUTE_METHOD);
    public static final GetSupportingDocumentsResultErrorCode EXCEPTION = new GetSupportingDocumentsResultErrorCode(_EXCEPTION);
    public static final GetSupportingDocumentsResultErrorCode MISC_ERROR = new GetSupportingDocumentsResultErrorCode(_MISC_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static GetSupportingDocumentsResultErrorCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetSupportingDocumentsResultErrorCode enumeration = (GetSupportingDocumentsResultErrorCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetSupportingDocumentsResultErrorCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetSupportingDocumentsResultErrorCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetSupportingDocumentsResultErrorCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
