/**
 * AgreementEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class AgreementEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AgreementEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATED = "CREATED";
    public static final java.lang.String _UPLOADED_BY_SENDER = "UPLOADED_BY_SENDER";
    public static final java.lang.String _FAXED_BY_SENDER = "FAXED_BY_SENDER";
    public static final java.lang.String _SIGNED = "SIGNED";
    public static final java.lang.String _ESIGNED = "ESIGNED";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _OFFLINE_SYNC = "OFFLINE_SYNC";
    public static final java.lang.String _FAXIN_RECEIVED = "FAXIN_RECEIVED";
    public static final java.lang.String _SIGNATURE_REQUESTED = "SIGNATURE_REQUESTED";
    public static final java.lang.String _APPROVAL_REQUESTED = "APPROVAL_REQUESTED";
    public static final java.lang.String _RECALLED = "RECALLED";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _EXPIRED_AUTOMATICALLY = "EXPIRED_AUTOMATICALLY";
    public static final java.lang.String _SHARED = "SHARED";
    public static final java.lang.String _EMAIL_VIEWED = "EMAIL_VIEWED";
    public static final java.lang.String _AUTO_CANCELLED_CONVERSION_PROBLEM = "AUTO_CANCELLED_CONVERSION_PROBLEM";
    public static final java.lang.String _SIGNER_SUGGESTED_CHANGES = "SIGNER_SUGGESTED_CHANGES";
    public static final java.lang.String _SENDER_CREATED_NEW_REVISION = "SENDER_CREATED_NEW_REVISION";
    public static final java.lang.String _PASSWORD_AUTHENTICATION_FAILED = "PASSWORD_AUTHENTICATION_FAILED";
    public static final java.lang.String _KBA_AUTHENTICATION_FAILED = "KBA_AUTHENTICATION_FAILED";
    public static final java.lang.String _KBA_AUTHENTICATED = "KBA_AUTHENTICATED";
    public static final java.lang.String _WEB_IDENTITY_AUTHENTICATED = "WEB_IDENTITY_AUTHENTICATED";
    public static final java.lang.String _WEB_IDENTITY_SPECIFIED = "WEB_IDENTITY_SPECIFIED";
    public static final java.lang.String _EMAIL_BOUNCED = "EMAIL_BOUNCED";
    public static final java.lang.String _WIDGET_ENABLED = "WIDGET_ENABLED";
    public static final java.lang.String _WIDGET_DISABLED = "WIDGET_DISABLED";
    public static final java.lang.String _DELEGATED = "DELEGATED";
    public static final java.lang.String _REPLACED_SIGNER = "REPLACED_SIGNER";
    public static final java.lang.String _OTHER = "OTHER";
    public static final AgreementEventType CREATED = new AgreementEventType(_CREATED);
    public static final AgreementEventType UPLOADED_BY_SENDER = new AgreementEventType(_UPLOADED_BY_SENDER);
    public static final AgreementEventType FAXED_BY_SENDER = new AgreementEventType(_FAXED_BY_SENDER);
    public static final AgreementEventType SIGNED = new AgreementEventType(_SIGNED);
    public static final AgreementEventType ESIGNED = new AgreementEventType(_ESIGNED);
    public static final AgreementEventType APPROVED = new AgreementEventType(_APPROVED);
    public static final AgreementEventType OFFLINE_SYNC = new AgreementEventType(_OFFLINE_SYNC);
    public static final AgreementEventType FAXIN_RECEIVED = new AgreementEventType(_FAXIN_RECEIVED);
    public static final AgreementEventType SIGNATURE_REQUESTED = new AgreementEventType(_SIGNATURE_REQUESTED);
    public static final AgreementEventType APPROVAL_REQUESTED = new AgreementEventType(_APPROVAL_REQUESTED);
    public static final AgreementEventType RECALLED = new AgreementEventType(_RECALLED);
    public static final AgreementEventType REJECTED = new AgreementEventType(_REJECTED);
    public static final AgreementEventType EXPIRED = new AgreementEventType(_EXPIRED);
    public static final AgreementEventType EXPIRED_AUTOMATICALLY = new AgreementEventType(_EXPIRED_AUTOMATICALLY);
    public static final AgreementEventType SHARED = new AgreementEventType(_SHARED);
    public static final AgreementEventType EMAIL_VIEWED = new AgreementEventType(_EMAIL_VIEWED);
    public static final AgreementEventType AUTO_CANCELLED_CONVERSION_PROBLEM = new AgreementEventType(_AUTO_CANCELLED_CONVERSION_PROBLEM);
    public static final AgreementEventType SIGNER_SUGGESTED_CHANGES = new AgreementEventType(_SIGNER_SUGGESTED_CHANGES);
    public static final AgreementEventType SENDER_CREATED_NEW_REVISION = new AgreementEventType(_SENDER_CREATED_NEW_REVISION);
    public static final AgreementEventType PASSWORD_AUTHENTICATION_FAILED = new AgreementEventType(_PASSWORD_AUTHENTICATION_FAILED);
    public static final AgreementEventType KBA_AUTHENTICATION_FAILED = new AgreementEventType(_KBA_AUTHENTICATION_FAILED);
    public static final AgreementEventType KBA_AUTHENTICATED = new AgreementEventType(_KBA_AUTHENTICATED);
    public static final AgreementEventType WEB_IDENTITY_AUTHENTICATED = new AgreementEventType(_WEB_IDENTITY_AUTHENTICATED);
    public static final AgreementEventType WEB_IDENTITY_SPECIFIED = new AgreementEventType(_WEB_IDENTITY_SPECIFIED);
    public static final AgreementEventType EMAIL_BOUNCED = new AgreementEventType(_EMAIL_BOUNCED);
    public static final AgreementEventType WIDGET_ENABLED = new AgreementEventType(_WIDGET_ENABLED);
    public static final AgreementEventType WIDGET_DISABLED = new AgreementEventType(_WIDGET_DISABLED);
    public static final AgreementEventType DELEGATED = new AgreementEventType(_DELEGATED);
    public static final AgreementEventType REPLACED_SIGNER = new AgreementEventType(_REPLACED_SIGNER);
    public static final AgreementEventType OTHER = new AgreementEventType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static AgreementEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AgreementEventType enumeration = (AgreementEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AgreementEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AgreementEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "AgreementEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
