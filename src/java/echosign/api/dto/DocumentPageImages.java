/**
 * DocumentPageImages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class DocumentPageImages  implements java.io.Serializable {
    private java.lang.String largeImageUrl;

    private java.lang.String mediumImageUrl;

    private java.lang.String smallImageUrl;

    public DocumentPageImages() {
    }

    public DocumentPageImages(
           java.lang.String largeImageUrl,
           java.lang.String mediumImageUrl,
           java.lang.String smallImageUrl) {
           this.largeImageUrl = largeImageUrl;
           this.mediumImageUrl = mediumImageUrl;
           this.smallImageUrl = smallImageUrl;
    }


    /**
     * Gets the largeImageUrl value for this DocumentPageImages.
     * 
     * @return largeImageUrl
     */
    public java.lang.String getLargeImageUrl() {
        return largeImageUrl;
    }


    /**
     * Sets the largeImageUrl value for this DocumentPageImages.
     * 
     * @param largeImageUrl
     */
    public void setLargeImageUrl(java.lang.String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }


    /**
     * Gets the mediumImageUrl value for this DocumentPageImages.
     * 
     * @return mediumImageUrl
     */
    public java.lang.String getMediumImageUrl() {
        return mediumImageUrl;
    }


    /**
     * Sets the mediumImageUrl value for this DocumentPageImages.
     * 
     * @param mediumImageUrl
     */
    public void setMediumImageUrl(java.lang.String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }


    /**
     * Gets the smallImageUrl value for this DocumentPageImages.
     * 
     * @return smallImageUrl
     */
    public java.lang.String getSmallImageUrl() {
        return smallImageUrl;
    }


    /**
     * Sets the smallImageUrl value for this DocumentPageImages.
     * 
     * @param smallImageUrl
     */
    public void setSmallImageUrl(java.lang.String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentPageImages)) return false;
        DocumentPageImages other = (DocumentPageImages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.largeImageUrl==null && other.getLargeImageUrl()==null) || 
             (this.largeImageUrl!=null &&
              this.largeImageUrl.equals(other.getLargeImageUrl()))) &&
            ((this.mediumImageUrl==null && other.getMediumImageUrl()==null) || 
             (this.mediumImageUrl!=null &&
              this.mediumImageUrl.equals(other.getMediumImageUrl()))) &&
            ((this.smallImageUrl==null && other.getSmallImageUrl()==null) || 
             (this.smallImageUrl!=null &&
              this.smallImageUrl.equals(other.getSmallImageUrl())));
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
        if (getLargeImageUrl() != null) {
            _hashCode += getLargeImageUrl().hashCode();
        }
        if (getMediumImageUrl() != null) {
            _hashCode += getMediumImageUrl().hashCode();
        }
        if (getSmallImageUrl() != null) {
            _hashCode += getSmallImageUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentPageImages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DocumentPageImages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "largeImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "mediumImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "smallImageUrl"));
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
