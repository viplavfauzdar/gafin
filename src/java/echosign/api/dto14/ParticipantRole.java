/**
 * ParticipantRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class ParticipantRole implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParticipantRole(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SENDER = "SENDER";
    public static final java.lang.String _SIGNER = "SIGNER";
    public static final java.lang.String _APPROVER = "APPROVER";
    public static final java.lang.String _CC = "CC";
    public static final java.lang.String _DELEGATE = "DELEGATE";
    public static final java.lang.String _SHARE = "SHARE";
    public static final java.lang.String _OTHER = "OTHER";
    public static final ParticipantRole SENDER = new ParticipantRole(_SENDER);
    public static final ParticipantRole SIGNER = new ParticipantRole(_SIGNER);
    public static final ParticipantRole APPROVER = new ParticipantRole(_APPROVER);
    public static final ParticipantRole CC = new ParticipantRole(_CC);
    public static final ParticipantRole DELEGATE = new ParticipantRole(_DELEGATE);
    public static final ParticipantRole SHARE = new ParticipantRole(_SHARE);
    public static final ParticipantRole OTHER = new ParticipantRole(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static ParticipantRole fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParticipantRole enumeration = (ParticipantRole)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParticipantRole fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ParticipantRole.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
