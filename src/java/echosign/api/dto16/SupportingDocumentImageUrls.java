/**
 * SupportingDocumentImageUrls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class SupportingDocumentImageUrls  implements java.io.Serializable {
    private echosign.api.dto16.PageImageUrls[] pages;

    private java.lang.String fieldName;

    public SupportingDocumentImageUrls() {
    }

    public SupportingDocumentImageUrls(
           echosign.api.dto16.PageImageUrls[] pages,
           java.lang.String fieldName) {
           this.pages = pages;
           this.fieldName = fieldName;
    }


    /**
     * Gets the pages value for this SupportingDocumentImageUrls.
     * 
     * @return pages
     */
    public echosign.api.dto16.PageImageUrls[] getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this SupportingDocumentImageUrls.
     * 
     * @param pages
     */
    public void setPages(echosign.api.dto16.PageImageUrls[] pages) {
        this.pages = pages;
    }


    /**
     * Gets the fieldName value for this SupportingDocumentImageUrls.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this SupportingDocumentImageUrls.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportingDocumentImageUrls)) return false;
        SupportingDocumentImageUrls other = (SupportingDocumentImageUrls) obj;
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
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportingDocumentImageUrls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocumentImageUrls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "PageImageUrls"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "fieldName"));
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
