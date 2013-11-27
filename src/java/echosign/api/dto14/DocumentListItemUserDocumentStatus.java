/**
 * DocumentListItemUserDocumentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class DocumentListItemUserDocumentStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocumentListItemUserDocumentStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WAITING_FOR_MY_SIGNATURE = "WAITING_FOR_MY_SIGNATURE";
    public static final java.lang.String _WAITING_FOR_MY_APPROVAL = "WAITING_FOR_MY_APPROVAL";
    public static final java.lang.String _OUT_FOR_SIGNATURE = "OUT_FOR_SIGNATURE";
    public static final java.lang.String _OUT_FOR_APPROVAL = "OUT_FOR_APPROVAL";
    public static final java.lang.String _SIGNED = "SIGNED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _RECALLED = "RECALLED";
    public static final java.lang.String _WAITING_FOR_FAXIN = "WAITING_FOR_FAXIN";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _FORM = "FORM";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _WIDGET = "WIDGET";
    public static final java.lang.String _WAITING_FOR_AUTHORING = "WAITING_FOR_AUTHORING";
    public static final java.lang.String _OTHER = "OTHER";
    public static final DocumentListItemUserDocumentStatus WAITING_FOR_MY_SIGNATURE = new DocumentListItemUserDocumentStatus(_WAITING_FOR_MY_SIGNATURE);
    public static final DocumentListItemUserDocumentStatus WAITING_FOR_MY_APPROVAL = new DocumentListItemUserDocumentStatus(_WAITING_FOR_MY_APPROVAL);
    public static final DocumentListItemUserDocumentStatus OUT_FOR_SIGNATURE = new DocumentListItemUserDocumentStatus(_OUT_FOR_SIGNATURE);
    public static final DocumentListItemUserDocumentStatus OUT_FOR_APPROVAL = new DocumentListItemUserDocumentStatus(_OUT_FOR_APPROVAL);
    public static final DocumentListItemUserDocumentStatus SIGNED = new DocumentListItemUserDocumentStatus(_SIGNED);
    public static final DocumentListItemUserDocumentStatus APPROVED = new DocumentListItemUserDocumentStatus(_APPROVED);
    public static final DocumentListItemUserDocumentStatus RECALLED = new DocumentListItemUserDocumentStatus(_RECALLED);
    public static final DocumentListItemUserDocumentStatus WAITING_FOR_FAXIN = new DocumentListItemUserDocumentStatus(_WAITING_FOR_FAXIN);
    public static final DocumentListItemUserDocumentStatus ARCHIVED = new DocumentListItemUserDocumentStatus(_ARCHIVED);
    public static final DocumentListItemUserDocumentStatus FORM = new DocumentListItemUserDocumentStatus(_FORM);
    public static final DocumentListItemUserDocumentStatus EXPIRED = new DocumentListItemUserDocumentStatus(_EXPIRED);
    public static final DocumentListItemUserDocumentStatus WIDGET = new DocumentListItemUserDocumentStatus(_WIDGET);
    public static final DocumentListItemUserDocumentStatus WAITING_FOR_AUTHORING = new DocumentListItemUserDocumentStatus(_WAITING_FOR_AUTHORING);
    public static final DocumentListItemUserDocumentStatus OTHER = new DocumentListItemUserDocumentStatus(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static DocumentListItemUserDocumentStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DocumentListItemUserDocumentStatus enumeration = (DocumentListItemUserDocumentStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DocumentListItemUserDocumentStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DocumentListItemUserDocumentStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentListItemUserDocumentStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
