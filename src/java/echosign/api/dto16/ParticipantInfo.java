/**
 * ParticipantInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class ParticipantInfo  implements java.io.Serializable {
    private echosign.api.dto16.ParticipantInfo[] alternateParticipants;

    private echosign.api.dto14.ParticipantRole[] roles;

    private echosign.api.dto14.UserAgreementStatus status;

    private echosign.api.dto13.ParticipantSecurityOption[] securityOptions;

    private java.lang.String company;

    private java.lang.String email;

    private java.lang.String name;

    private java.lang.String title;

    public ParticipantInfo() {
    }

    public ParticipantInfo(
           echosign.api.dto16.ParticipantInfo[] alternateParticipants,
           echosign.api.dto14.ParticipantRole[] roles,
           echosign.api.dto14.UserAgreementStatus status,
           echosign.api.dto13.ParticipantSecurityOption[] securityOptions,
           java.lang.String company,
           java.lang.String email,
           java.lang.String name,
           java.lang.String title) {
           this.alternateParticipants = alternateParticipants;
           this.roles = roles;
           this.status = status;
           this.securityOptions = securityOptions;
           this.company = company;
           this.email = email;
           this.name = name;
           this.title = title;
    }


    /**
     * Gets the alternateParticipants value for this ParticipantInfo.
     * 
     * @return alternateParticipants
     */
    public echosign.api.dto16.ParticipantInfo[] getAlternateParticipants() {
        return alternateParticipants;
    }


    /**
     * Sets the alternateParticipants value for this ParticipantInfo.
     * 
     * @param alternateParticipants
     */
    public void setAlternateParticipants(echosign.api.dto16.ParticipantInfo[] alternateParticipants) {
        this.alternateParticipants = alternateParticipants;
    }


    /**
     * Gets the roles value for this ParticipantInfo.
     * 
     * @return roles
     */
    public echosign.api.dto14.ParticipantRole[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this ParticipantInfo.
     * 
     * @param roles
     */
    public void setRoles(echosign.api.dto14.ParticipantRole[] roles) {
        this.roles = roles;
    }


    /**
     * Gets the status value for this ParticipantInfo.
     * 
     * @return status
     */
    public echosign.api.dto14.UserAgreementStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ParticipantInfo.
     * 
     * @param status
     */
    public void setStatus(echosign.api.dto14.UserAgreementStatus status) {
        this.status = status;
    }


    /**
     * Gets the securityOptions value for this ParticipantInfo.
     * 
     * @return securityOptions
     */
    public echosign.api.dto13.ParticipantSecurityOption[] getSecurityOptions() {
        return securityOptions;
    }


    /**
     * Sets the securityOptions value for this ParticipantInfo.
     * 
     * @param securityOptions
     */
    public void setSecurityOptions(echosign.api.dto13.ParticipantSecurityOption[] securityOptions) {
        this.securityOptions = securityOptions;
    }


    /**
     * Gets the company value for this ParticipantInfo.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ParticipantInfo.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the email value for this ParticipantInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ParticipantInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the name value for this ParticipantInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ParticipantInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the title value for this ParticipantInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ParticipantInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParticipantInfo)) return false;
        ParticipantInfo other = (ParticipantInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateParticipants==null && other.getAlternateParticipants()==null) || 
             (this.alternateParticipants!=null &&
              java.util.Arrays.equals(this.alternateParticipants, other.getAlternateParticipants()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.securityOptions==null && other.getSecurityOptions()==null) || 
             (this.securityOptions!=null &&
              java.util.Arrays.equals(this.securityOptions, other.getSecurityOptions()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
        if (getAlternateParticipants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateParticipants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateParticipants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSecurityOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParticipantInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateParticipants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "alternateParticipants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto14.api.echosign", "ParticipantRole"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "UserAgreementStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "securityOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto13.api.echosign", "ParticipantSecurityOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto13.api.echosign", "ParticipantSecurityOption"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "title"));
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
