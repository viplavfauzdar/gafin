/**
 * FormCreationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class FormCreationResult  implements java.io.Serializable {
    private echosign.api.dto16.DocumentKey documentKey;

    private java.lang.String widgetCode;

    private java.lang.String widgetUrl;

    public FormCreationResult() {
    }

    public FormCreationResult(
           echosign.api.dto16.DocumentKey documentKey,
           java.lang.String widgetCode,
           java.lang.String widgetUrl) {
           this.documentKey = documentKey;
           this.widgetCode = widgetCode;
           this.widgetUrl = widgetUrl;
    }


    /**
     * Gets the documentKey value for this FormCreationResult.
     * 
     * @return documentKey
     */
    public echosign.api.dto16.DocumentKey getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this FormCreationResult.
     * 
     * @param documentKey
     */
    public void setDocumentKey(echosign.api.dto16.DocumentKey documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the widgetCode value for this FormCreationResult.
     * 
     * @return widgetCode
     */
    public java.lang.String getWidgetCode() {
        return widgetCode;
    }


    /**
     * Sets the widgetCode value for this FormCreationResult.
     * 
     * @param widgetCode
     */
    public void setWidgetCode(java.lang.String widgetCode) {
        this.widgetCode = widgetCode;
    }


    /**
     * Gets the widgetUrl value for this FormCreationResult.
     * 
     * @return widgetUrl
     */
    public java.lang.String getWidgetUrl() {
        return widgetUrl;
    }


    /**
     * Sets the widgetUrl value for this FormCreationResult.
     * 
     * @param widgetUrl
     */
    public void setWidgetUrl(java.lang.String widgetUrl) {
        this.widgetUrl = widgetUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormCreationResult)) return false;
        FormCreationResult other = (FormCreationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentKey==null && other.getDocumentKey()==null) || 
             (this.documentKey!=null &&
              this.documentKey.equals(other.getDocumentKey()))) &&
            ((this.widgetCode==null && other.getWidgetCode()==null) || 
             (this.widgetCode!=null &&
              this.widgetCode.equals(other.getWidgetCode()))) &&
            ((this.widgetUrl==null && other.getWidgetUrl()==null) || 
             (this.widgetUrl!=null &&
              this.widgetUrl.equals(other.getWidgetUrl())));
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
        if (getDocumentKey() != null) {
            _hashCode += getDocumentKey().hashCode();
        }
        if (getWidgetCode() != null) {
            _hashCode += getWidgetCode().hashCode();
        }
        if (getWidgetUrl() != null) {
            _hashCode += getWidgetUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormCreationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "FormCreationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "widgetCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "widgetUrl"));
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
