/**
 * PageImageUrls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class PageImageUrls  implements java.io.Serializable {
    private echosign.api.dto16.PageImageUrl[] images;

    public PageImageUrls() {
    }

    public PageImageUrls(
           echosign.api.dto16.PageImageUrl[] images) {
           this.images = images;
    }


    /**
     * Gets the images value for this PageImageUrls.
     * 
     * @return images
     */
    public echosign.api.dto16.PageImageUrl[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this PageImageUrls.
     * 
     * @param images
     */
    public void setImages(echosign.api.dto16.PageImageUrl[] images) {
        this.images = images;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageImageUrls)) return false;
        PageImageUrls other = (PageImageUrls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages())));
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
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageImageUrls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrl"));
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
