/**
 * AccountCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto7;

public class AccountCreationInfo  implements java.io.Serializable {
    private echosign.api.dto7.AccountType accountType;

    private java.lang.String companyName;

    private java.lang.Integer numSeats;

    public AccountCreationInfo() {
    }

    public AccountCreationInfo(
           echosign.api.dto7.AccountType accountType,
           java.lang.String companyName,
           java.lang.Integer numSeats) {
           this.accountType = accountType;
           this.companyName = companyName;
           this.numSeats = numSeats;
    }


    /**
     * Gets the accountType value for this AccountCreationInfo.
     * 
     * @return accountType
     */
    public echosign.api.dto7.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountCreationInfo.
     * 
     * @param accountType
     */
    public void setAccountType(echosign.api.dto7.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the companyName value for this AccountCreationInfo.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this AccountCreationInfo.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the numSeats value for this AccountCreationInfo.
     * 
     * @return numSeats
     */
    public java.lang.Integer getNumSeats() {
        return numSeats;
    }


    /**
     * Sets the numSeats value for this AccountCreationInfo.
     * 
     * @param numSeats
     */
    public void setNumSeats(java.lang.Integer numSeats) {
        this.numSeats = numSeats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountCreationInfo)) return false;
        AccountCreationInfo other = (AccountCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.numSeats==null && other.getNumSeats()==null) || 
             (this.numSeats!=null &&
              this.numSeats.equals(other.getNumSeats())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getNumSeats() != null) {
            _hashCode += getNumSeats().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto7.api.echosign", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto7.api.echosign", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto7.api.echosign", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto7.api.echosign", "numSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
