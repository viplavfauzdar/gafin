/**
 * WidgetPersonalizationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class WidgetPersonalizationInfo  implements java.io.Serializable {
    private java.lang.Boolean allowManualVerification;

    private java.lang.String comment;

    private java.lang.String email;

    private java.util.Calendar expiration;

    private java.lang.Boolean reusable;

    public WidgetPersonalizationInfo() {
    }

    public WidgetPersonalizationInfo(
           java.lang.Boolean allowManualVerification,
           java.lang.String comment,
           java.lang.String email,
           java.util.Calendar expiration,
           java.lang.Boolean reusable) {
           this.allowManualVerification = allowManualVerification;
           this.comment = comment;
           this.email = email;
           this.expiration = expiration;
           this.reusable = reusable;
    }


    /**
     * Gets the allowManualVerification value for this WidgetPersonalizationInfo.
     * 
     * @return allowManualVerification
     */
    public java.lang.Boolean getAllowManualVerification() {
        return allowManualVerification;
    }


    /**
     * Sets the allowManualVerification value for this WidgetPersonalizationInfo.
     * 
     * @param allowManualVerification
     */
    public void setAllowManualVerification(java.lang.Boolean allowManualVerification) {
        this.allowManualVerification = allowManualVerification;
    }


    /**
     * Gets the comment value for this WidgetPersonalizationInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WidgetPersonalizationInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the email value for this WidgetPersonalizationInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this WidgetPersonalizationInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the expiration value for this WidgetPersonalizationInfo.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this WidgetPersonalizationInfo.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the reusable value for this WidgetPersonalizationInfo.
     * 
     * @return reusable
     */
    public java.lang.Boolean getReusable() {
        return reusable;
    }


    /**
     * Sets the reusable value for this WidgetPersonalizationInfo.
     * 
     * @param reusable
     */
    public void setReusable(java.lang.Boolean reusable) {
        this.reusable = reusable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetPersonalizationInfo)) return false;
        WidgetPersonalizationInfo other = (WidgetPersonalizationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowManualVerification==null && other.getAllowManualVerification()==null) || 
             (this.allowManualVerification!=null &&
              this.allowManualVerification.equals(other.getAllowManualVerification()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.reusable==null && other.getReusable()==null) || 
             (this.reusable!=null &&
              this.reusable.equals(other.getReusable())));
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
        if (getAllowManualVerification() != null) {
            _hashCode += getAllowManualVerification().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getReusable() != null) {
            _hashCode += getReusable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetPersonalizationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetPersonalizationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowManualVerification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "allowManualVerification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reusable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "reusable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
