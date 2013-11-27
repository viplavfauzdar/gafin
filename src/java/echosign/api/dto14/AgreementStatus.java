/**
 * AgreementStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class AgreementStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AgreementStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OUT_FOR_SIGNATURE = "OUT_FOR_SIGNATURE";
    public static final java.lang.String _WAITING_FOR_REVIEW = "WAITING_FOR_REVIEW";
    public static final java.lang.String _SIGNED = "SIGNED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _ABORTED = "ABORTED";
    public static final java.lang.String _DOCUMENT_LIBRARY = "DOCUMENT_LIBRARY";
    public static final java.lang.String _WIDGET = "WIDGET";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _PREFILL = "PREFILL";
    public static final java.lang.String _AUTHORING = "AUTHORING";
    public static final java.lang.String _WAITING_FOR_FAXIN = "WAITING_FOR_FAXIN";
    public static final java.lang.String _WAITING_FOR_VERIFICATION = "WAITING_FOR_VERIFICATION";
    public static final java.lang.String _WIDGET_WAITING_FOR_VERIFICATION = "WIDGET_WAITING_FOR_VERIFICATION";
    public static final java.lang.String _WAITING_FOR_PAYMENT = "WAITING_FOR_PAYMENT";
    public static final java.lang.String _OUT_FOR_APPROVAL = "OUT_FOR_APPROVAL";
    public static final java.lang.String _OTHER = "OTHER";
    public static final AgreementStatus OUT_FOR_SIGNATURE = new AgreementStatus(_OUT_FOR_SIGNATURE);
    public static final AgreementStatus WAITING_FOR_REVIEW = new AgreementStatus(_WAITING_FOR_REVIEW);
    public static final AgreementStatus SIGNED = new AgreementStatus(_SIGNED);
    public static final AgreementStatus APPROVED = new AgreementStatus(_APPROVED);
    public static final AgreementStatus ABORTED = new AgreementStatus(_ABORTED);
    public static final AgreementStatus DOCUMENT_LIBRARY = new AgreementStatus(_DOCUMENT_LIBRARY);
    public static final AgreementStatus WIDGET = new AgreementStatus(_WIDGET);
    public static final AgreementStatus EXPIRED = new AgreementStatus(_EXPIRED);
    public static final AgreementStatus ARCHIVED = new AgreementStatus(_ARCHIVED);
    public static final AgreementStatus PREFILL = new AgreementStatus(_PREFILL);
    public static final AgreementStatus AUTHORING = new AgreementStatus(_AUTHORING);
    public static final AgreementStatus WAITING_FOR_FAXIN = new AgreementStatus(_WAITING_FOR_FAXIN);
    public static final AgreementStatus WAITING_FOR_VERIFICATION = new AgreementStatus(_WAITING_FOR_VERIFICATION);
    public static final AgreementStatus WIDGET_WAITING_FOR_VERIFICATION = new AgreementStatus(_WIDGET_WAITING_FOR_VERIFICATION);
    public static final AgreementStatus WAITING_FOR_PAYMENT = new AgreementStatus(_WAITING_FOR_PAYMENT);
    public static final AgreementStatus OUT_FOR_APPROVAL = new AgreementStatus(_OUT_FOR_APPROVAL);
    public static final AgreementStatus OTHER = new AgreementStatus(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static AgreementStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AgreementStatus enumeration = (AgreementStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AgreementStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AgreementStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "AgreementStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
