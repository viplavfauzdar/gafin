/**
 * PageImageUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class PageImageUrl  implements java.io.Serializable {
    private echosign.api.dto16.ScalingType scalingType;

    private java.lang.Integer zoom;

    private java.lang.String url;

    private java.lang.Integer width;

    public PageImageUrl() {
    }

    public PageImageUrl(
           echosign.api.dto16.ScalingType scalingType,
           java.lang.Integer zoom,
           java.lang.String url,
           java.lang.Integer width) {
           this.scalingType = scalingType;
           this.zoom = zoom;
           this.url = url;
           this.width = width;
    }


    /**
     * Gets the scalingType value for this PageImageUrl.
     * 
     * @return scalingType
     */
    public echosign.api.dto16.ScalingType getScalingType() {
        return scalingType;
    }


    /**
     * Sets the scalingType value for this PageImageUrl.
     * 
     * @param scalingType
     */
    public void setScalingType(echosign.api.dto16.ScalingType scalingType) {
        this.scalingType = scalingType;
    }


    /**
     * Gets the zoom value for this PageImageUrl.
     * 
     * @return zoom
     */
    public java.lang.Integer getZoom() {
        return zoom;
    }


    /**
     * Sets the zoom value for this PageImageUrl.
     * 
     * @param zoom
     */
    public void setZoom(java.lang.Integer zoom) {
        this.zoom = zoom;
    }


    /**
     * Gets the url value for this PageImageUrl.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this PageImageUrl.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this PageImageUrl.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this PageImageUrl.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageImageUrl)) return false;
        PageImageUrl other = (PageImageUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scalingType==null && other.getScalingType()==null) || 
             (this.scalingType!=null &&
              this.scalingType.equals(other.getScalingType()))) &&
            ((this.zoom==null && other.getZoom()==null) || 
             (this.zoom!=null &&
              this.zoom.equals(other.getZoom()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getScalingType() != null) {
            _hashCode += getScalingType().hashCode();
        }
        if (getZoom() != null) {
            _hashCode += getZoom().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageImageUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "scalingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ScalingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "zoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "width"));
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
