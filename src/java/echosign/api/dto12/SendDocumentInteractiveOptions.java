/**
 * SendDocumentInteractiveOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto12;

public class SendDocumentInteractiveOptions  implements java.io.Serializable {
    private java.lang.Boolean authoringRequested;

    private java.lang.Boolean autoLoginUser;

    private java.lang.Boolean noChrome;

    public SendDocumentInteractiveOptions() {
    }

    public SendDocumentInteractiveOptions(
           java.lang.Boolean authoringRequested,
           java.lang.Boolean autoLoginUser,
           java.lang.Boolean noChrome) {
           this.authoringRequested = authoringRequested;
           this.autoLoginUser = autoLoginUser;
           this.noChrome = noChrome;
    }


    /**
     * Gets the authoringRequested value for this SendDocumentInteractiveOptions.
     * 
     * @return authoringRequested
     */
    public java.lang.Boolean getAuthoringRequested() {
        return authoringRequested;
    }


    /**
     * Sets the authoringRequested value for this SendDocumentInteractiveOptions.
     * 
     * @param authoringRequested
     */
    public void setAuthoringRequested(java.lang.Boolean authoringRequested) {
        this.authoringRequested = authoringRequested;
    }


    /**
     * Gets the autoLoginUser value for this SendDocumentInteractiveOptions.
     * 
     * @return autoLoginUser
     */
    public java.lang.Boolean getAutoLoginUser() {
        return autoLoginUser;
    }


    /**
     * Sets the autoLoginUser value for this SendDocumentInteractiveOptions.
     * 
     * @param autoLoginUser
     */
    public void setAutoLoginUser(java.lang.Boolean autoLoginUser) {
        this.autoLoginUser = autoLoginUser;
    }


    /**
     * Gets the noChrome value for this SendDocumentInteractiveOptions.
     * 
     * @return noChrome
     */
    public java.lang.Boolean getNoChrome() {
        return noChrome;
    }


    /**
     * Sets the noChrome value for this SendDocumentInteractiveOptions.
     * 
     * @param noChrome
     */
    public void setNoChrome(java.lang.Boolean noChrome) {
        this.noChrome = noChrome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendDocumentInteractiveOptions)) return false;
        SendDocumentInteractiveOptions other = (SendDocumentInteractiveOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authoringRequested==null && other.getAuthoringRequested()==null) || 
             (this.authoringRequested!=null &&
              this.authoringRequested.equals(other.getAuthoringRequested()))) &&
            ((this.autoLoginUser==null && other.getAutoLoginUser()==null) || 
             (this.autoLoginUser!=null &&
              this.autoLoginUser.equals(other.getAutoLoginUser()))) &&
            ((this.noChrome==null && other.getNoChrome()==null) || 
             (this.noChrome!=null &&
              this.noChrome.equals(other.getNoChrome())));
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
        if (getAuthoringRequested() != null) {
            _hashCode += getAuthoringRequested().hashCode();
        }
        if (getAutoLoginUser() != null) {
            _hashCode += getAutoLoginUser().hashCode();
        }
        if (getNoChrome() != null) {
            _hashCode += getNoChrome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendDocumentInteractiveOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto12.api.echosign", "SendDocumentInteractiveOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoringRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto12.api.echosign", "authoringRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLoginUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto12.api.echosign", "autoLoginUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noChrome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto12.api.echosign", "noChrome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
