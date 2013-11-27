/**
 * SupportingDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class SupportingDocument  implements java.io.Serializable {
    private java.lang.String supportingDocumentKey;

    private byte[] content;

    private java.lang.String displayLabel;

    private java.lang.String fieldName;

    private java.lang.String mimeType;

    public SupportingDocument() {
    }

    public SupportingDocument(
           java.lang.String supportingDocumentKey,
           byte[] content,
           java.lang.String displayLabel,
           java.lang.String fieldName,
           java.lang.String mimeType) {
           this.supportingDocumentKey = supportingDocumentKey;
           this.content = content;
           this.displayLabel = displayLabel;
           this.fieldName = fieldName;
           this.mimeType = mimeType;
    }


    /**
     * Gets the supportingDocumentKey value for this SupportingDocument.
     * 
     * @return supportingDocumentKey
     */
    public java.lang.String getSupportingDocumentKey() {
        return supportingDocumentKey;
    }


    /**
     * Sets the supportingDocumentKey value for this SupportingDocument.
     * 
     * @param supportingDocumentKey
     */
    public void setSupportingDocumentKey(java.lang.String supportingDocumentKey) {
        this.supportingDocumentKey = supportingDocumentKey;
    }


    /**
     * Gets the content value for this SupportingDocument.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this SupportingDocument.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }


    /**
     * Gets the displayLabel value for this SupportingDocument.
     * 
     * @return displayLabel
     */
    public java.lang.String getDisplayLabel() {
        return displayLabel;
    }


    /**
     * Sets the displayLabel value for this SupportingDocument.
     * 
     * @param displayLabel
     */
    public void setDisplayLabel(java.lang.String displayLabel) {
        this.displayLabel = displayLabel;
    }


    /**
     * Gets the fieldName value for this SupportingDocument.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this SupportingDocument.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the mimeType value for this SupportingDocument.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this SupportingDocument.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportingDocument)) return false;
        SupportingDocument other = (SupportingDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supportingDocumentKey==null && other.getSupportingDocumentKey()==null) || 
             (this.supportingDocumentKey!=null &&
              this.supportingDocumentKey.equals(other.getSupportingDocumentKey()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            ((this.displayLabel==null && other.getDisplayLabel()==null) || 
             (this.displayLabel!=null &&
              this.displayLabel.equals(other.getDisplayLabel()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType())));
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
        if (getSupportingDocumentKey() != null) {
            _hashCode += getSupportingDocumentKey().hashCode();
        }
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplayLabel() != null) {
            _hashCode += getDisplayLabel().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportingDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "SupportingDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportingDocumentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "supportingDocumentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "displayLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "mimeType"));
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
