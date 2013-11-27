/**
 * AccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto7;

public class AccountType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FREE = "FREE";
    public static final java.lang.String _PRO = "PRO";
    public static final java.lang.String _TEAM = "TEAM";
    public static final java.lang.String _TEAM_TRIAL = "TEAM_TRIAL";
    public static final java.lang.String _ENTERPRISE = "ENTERPRISE";
    public static final java.lang.String _ENTERPRISE_TRIAL = "ENTERPRISE_TRIAL";
    public static final java.lang.String _GLOBAL = "GLOBAL";
    public static final java.lang.String _GLOBAL_TRIAL = "GLOBAL_TRIAL";
    public static final AccountType FREE = new AccountType(_FREE);
    public static final AccountType PRO = new AccountType(_PRO);
    public static final AccountType TEAM = new AccountType(_TEAM);
    public static final AccountType TEAM_TRIAL = new AccountType(_TEAM_TRIAL);
    public static final AccountType ENTERPRISE = new AccountType(_ENTERPRISE);
    public static final AccountType ENTERPRISE_TRIAL = new AccountType(_ENTERPRISE_TRIAL);
    public static final AccountType GLOBAL = new AccountType(_GLOBAL);
    public static final AccountType GLOBAL_TRIAL = new AccountType(_GLOBAL_TRIAL);
    public java.lang.String getValue() { return _value_;}
    public static AccountType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountType enumeration = (AccountType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
