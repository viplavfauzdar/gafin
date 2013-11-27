/**
 * UserCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class UserCreationInfo  implements java.io.Serializable {
    private java.lang.String company;

    private java.lang.String customField1;

    private java.lang.String customField2;

    private java.lang.String customField3;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String groupKey;

    private java.lang.String lastName;

    private echosign.api.dto.OptIn optIn;

    private java.lang.String password;

    private java.lang.String phone;

    private java.lang.String title;

    public UserCreationInfo() {
    }

    public UserCreationInfo(
           java.lang.String company,
           java.lang.String customField1,
           java.lang.String customField2,
           java.lang.String customField3,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String groupKey,
           java.lang.String lastName,
           echosign.api.dto.OptIn optIn,
           java.lang.String password,
           java.lang.String phone,
           java.lang.String title) {
           this.company = company;
           this.customField1 = customField1;
           this.customField2 = customField2;
           this.customField3 = customField3;
           this.email = email;
           this.firstName = firstName;
           this.groupKey = groupKey;
           this.lastName = lastName;
           this.optIn = optIn;
           this.password = password;
           this.phone = phone;
           this.title = title;
    }


    /**
     * Gets the company value for this UserCreationInfo.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this UserCreationInfo.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the customField1 value for this UserCreationInfo.
     * 
     * @return customField1
     */
    public java.lang.String getCustomField1() {
        return customField1;
    }


    /**
     * Sets the customField1 value for this UserCreationInfo.
     * 
     * @param customField1
     */
    public void setCustomField1(java.lang.String customField1) {
        this.customField1 = customField1;
    }


    /**
     * Gets the customField2 value for this UserCreationInfo.
     * 
     * @return customField2
     */
    public java.lang.String getCustomField2() {
        return customField2;
    }


    /**
     * Sets the customField2 value for this UserCreationInfo.
     * 
     * @param customField2
     */
    public void setCustomField2(java.lang.String customField2) {
        this.customField2 = customField2;
    }


    /**
     * Gets the customField3 value for this UserCreationInfo.
     * 
     * @return customField3
     */
    public java.lang.String getCustomField3() {
        return customField3;
    }


    /**
     * Sets the customField3 value for this UserCreationInfo.
     * 
     * @param customField3
     */
    public void setCustomField3(java.lang.String customField3) {
        this.customField3 = customField3;
    }


    /**
     * Gets the email value for this UserCreationInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserCreationInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this UserCreationInfo.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserCreationInfo.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the groupKey value for this UserCreationInfo.
     * 
     * @return groupKey
     */
    public java.lang.String getGroupKey() {
        return groupKey;
    }


    /**
     * Sets the groupKey value for this UserCreationInfo.
     * 
     * @param groupKey
     */
    public void setGroupKey(java.lang.String groupKey) {
        this.groupKey = groupKey;
    }


    /**
     * Gets the lastName value for this UserCreationInfo.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserCreationInfo.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the optIn value for this UserCreationInfo.
     * 
     * @return optIn
     */
    public echosign.api.dto.OptIn getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this UserCreationInfo.
     * 
     * @param optIn
     */
    public void setOptIn(echosign.api.dto.OptIn optIn) {
        this.optIn = optIn;
    }


    /**
     * Gets the password value for this UserCreationInfo.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserCreationInfo.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the phone value for this UserCreationInfo.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this UserCreationInfo.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the title value for this UserCreationInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this UserCreationInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserCreationInfo)) return false;
        UserCreationInfo other = (UserCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.customField1==null && other.getCustomField1()==null) || 
             (this.customField1!=null &&
              this.customField1.equals(other.getCustomField1()))) &&
            ((this.customField2==null && other.getCustomField2()==null) || 
             (this.customField2!=null &&
              this.customField2.equals(other.getCustomField2()))) &&
            ((this.customField3==null && other.getCustomField3()==null) || 
             (this.customField3!=null &&
              this.customField3.equals(other.getCustomField3()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.groupKey==null && other.getGroupKey()==null) || 
             (this.groupKey!=null &&
              this.groupKey.equals(other.getGroupKey()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.optIn==null && other.getOptIn()==null) || 
             (this.optIn!=null &&
              this.optIn.equals(other.getOptIn()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCustomField1() != null) {
            _hashCode += getCustomField1().hashCode();
        }
        if (getCustomField2() != null) {
            _hashCode += getCustomField2().hashCode();
        }
        if (getCustomField3() != null) {
            _hashCode += getCustomField3().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGroupKey() != null) {
            _hashCode += getGroupKey().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getOptIn() != null) {
            _hashCode += getOptIn().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "UserCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "customField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "customField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "customField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "groupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "optIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "OptIn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "title"));
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
