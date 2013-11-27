/**
 * UserAgreementStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class UserAgreementStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserAgreementStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WAITING_FOR_MY_SIGNATURE = "WAITING_FOR_MY_SIGNATURE";
    public static final java.lang.String _WAITING_FOR_MY_APPROVAL = "WAITING_FOR_MY_APPROVAL";
    public static final java.lang.String _OUT_FOR_SIGNATURE = "OUT_FOR_SIGNATURE";
    public static final java.lang.String _SIGNED = "SIGNED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _RECALLED = "RECALLED";
    public static final java.lang.String _HIDDEN = "HIDDEN";
    public static final java.lang.String _NOT_YET_VISIBLE = "NOT_YET_VISIBLE";
    public static final java.lang.String _WAITING_FOR_FAXIN = "WAITING_FOR_FAXIN";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _PARTIAL = "PARTIAL";
    public static final java.lang.String _FORM = "FORM";
    public static final java.lang.String _WAITING_FOR_AUTHORING = "WAITING_FOR_AUTHORING";
    public static final java.lang.String _OUT_FOR_APPROVAL = "OUT_FOR_APPROVAL";
    public static final java.lang.String _WIDGET = "WIDGET";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _WAITING_FOR_MY_REVIEW = "WAITING_FOR_MY_REVIEW";
    public static final java.lang.String _IN_REVIEW = "IN_REVIEW";
    public static final java.lang.String _OTHER = "OTHER";
    public static final UserAgreementStatus WAITING_FOR_MY_SIGNATURE = new UserAgreementStatus(_WAITING_FOR_MY_SIGNATURE);
    public static final UserAgreementStatus WAITING_FOR_MY_APPROVAL = new UserAgreementStatus(_WAITING_FOR_MY_APPROVAL);
    public static final UserAgreementStatus OUT_FOR_SIGNATURE = new UserAgreementStatus(_OUT_FOR_SIGNATURE);
    public static final UserAgreementStatus SIGNED = new UserAgreementStatus(_SIGNED);
    public static final UserAgreementStatus APPROVED = new UserAgreementStatus(_APPROVED);
    public static final UserAgreementStatus RECALLED = new UserAgreementStatus(_RECALLED);
    public static final UserAgreementStatus HIDDEN = new UserAgreementStatus(_HIDDEN);
    public static final UserAgreementStatus NOT_YET_VISIBLE = new UserAgreementStatus(_NOT_YET_VISIBLE);
    public static final UserAgreementStatus WAITING_FOR_FAXIN = new UserAgreementStatus(_WAITING_FOR_FAXIN);
    public static final UserAgreementStatus ARCHIVED = new UserAgreementStatus(_ARCHIVED);
    public static final UserAgreementStatus UNKNOWN = new UserAgreementStatus(_UNKNOWN);
    public static final UserAgreementStatus PARTIAL = new UserAgreementStatus(_PARTIAL);
    public static final UserAgreementStatus FORM = new UserAgreementStatus(_FORM);
    public static final UserAgreementStatus WAITING_FOR_AUTHORING = new UserAgreementStatus(_WAITING_FOR_AUTHORING);
    public static final UserAgreementStatus OUT_FOR_APPROVAL = new UserAgreementStatus(_OUT_FOR_APPROVAL);
    public static final UserAgreementStatus WIDGET = new UserAgreementStatus(_WIDGET);
    public static final UserAgreementStatus EXPIRED = new UserAgreementStatus(_EXPIRED);
    public static final UserAgreementStatus WAITING_FOR_MY_REVIEW = new UserAgreementStatus(_WAITING_FOR_MY_REVIEW);
    public static final UserAgreementStatus IN_REVIEW = new UserAgreementStatus(_IN_REVIEW);
    public static final UserAgreementStatus OTHER = new UserAgreementStatus(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static UserAgreementStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserAgreementStatus enumeration = (UserAgreementStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserAgreementStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserAgreementStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "UserAgreementStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
