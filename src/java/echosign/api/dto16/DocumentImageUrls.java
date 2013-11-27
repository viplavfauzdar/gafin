/**
 * DocumentImageUrls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class DocumentImageUrls  implements java.io.Serializable {
    private echosign.api.dto16.PageImageUrls[] pages;

    private java.lang.String name;

    public DocumentImageUrls() {
    }

    public DocumentImageUrls(
           echosign.api.dto16.PageImageUrls[] pages,
           java.lang.String name) {
           this.pages = pages;
           this.name = name;
    }


    /**
     * Gets the pages value for this DocumentImageUrls.
     * 
     * @return pages
     */
    public echosign.api.dto16.PageImageUrls[] getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this DocumentImageUrls.
     * 
     * @param pages
     */
    public void setPages(echosign.api.dto16.PageImageUrls[] pages) {
        this.pages = pages;
    }


    /**
     * Gets the name value for this DocumentImageUrls.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentImageUrls.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentImageUrls)) return false;
        DocumentImageUrls other = (DocumentImageUrls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pages==null && other.getPages()==null) || 
             (this.pages!=null &&
              java.util.Arrays.equals(this.pages, other.getPages()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getPages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentImageUrls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentImageUrls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "name"));
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
