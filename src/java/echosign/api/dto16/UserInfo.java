/**
 * UserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class UserInfo  implements java.io.Serializable {
    private java.lang.String groupKey;

    private java.lang.String company;

    private java.lang.String email;

    private java.lang.String fullNameOrEmail;

    private java.lang.String userKey;

    public UserInfo() {
    }

    public UserInfo(
           java.lang.String groupKey,
           java.lang.String company,
           java.lang.String email,
           java.lang.String fullNameOrEmail,
           java.lang.String userKey) {
           this.groupKey = groupKey;
           this.company = company;
           this.email = email;
           this.fullNameOrEmail = fullNameOrEmail;
           this.userKey = userKey;
    }


    /**
     * Gets the groupKey value for this UserInfo.
     * 
     * @return groupKey
     */
    public java.lang.String getGroupKey() {
        return groupKey;
    }


    /**
     * Sets the groupKey value for this UserInfo.
     * 
     * @param groupKey
     */
    public void setGroupKey(java.lang.String groupKey) {
        this.groupKey = groupKey;
    }


    /**
     * Gets the company value for this UserInfo.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this UserInfo.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the email value for this UserInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fullNameOrEmail value for this UserInfo.
     * 
     * @return fullNameOrEmail
     */
    public java.lang.String getFullNameOrEmail() {
        return fullNameOrEmail;
    }


    /**
     * Sets the fullNameOrEmail value for this UserInfo.
     * 
     * @param fullNameOrEmail
     */
    public void setFullNameOrEmail(java.lang.String fullNameOrEmail) {
        this.fullNameOrEmail = fullNameOrEmail;
    }


    /**
     * Gets the userKey value for this UserInfo.
     * 
     * @return userKey
     */
    public java.lang.String getUserKey() {
        return userKey;
    }


    /**
     * Sets the userKey value for this UserInfo.
     * 
     * @param userKey
     */
    public void setUserKey(java.lang.String userKey) {
        this.userKey = userKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfo)) return false;
        UserInfo other = (UserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupKey==null && other.getGroupKey()==null) || 
             (this.groupKey!=null &&
              this.groupKey.equals(other.getGroupKey()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fullNameOrEmail==null && other.getFullNameOrEmail()==null) || 
             (this.fullNameOrEmail!=null &&
              this.fullNameOrEmail.equals(other.getFullNameOrEmail()))) &&
            ((this.userKey==null && other.getUserKey()==null) || 
             (this.userKey!=null &&
              this.userKey.equals(other.getUserKey())));
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
        if (getGroupKey() != null) {
            _hashCode += getGroupKey().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFullNameOrEmail() != null) {
            _hashCode += getFullNameOrEmail().hashCode();
        }
        if (getUserKey() != null) {
            _hashCode += getUserKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "UserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "groupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullNameOrEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "fullNameOrEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "userKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
