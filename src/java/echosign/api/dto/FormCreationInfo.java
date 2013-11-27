/**
 * FormCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class FormCreationInfo  implements java.io.Serializable {
    private echosign.api.dto.ExternalId externalId;

    private echosign.api.dto.FileInfo[] fileInfos;

    private echosign.api.dto.FormType formType;

    private java.lang.String name;

    public FormCreationInfo() {
    }

    public FormCreationInfo(
           echosign.api.dto.ExternalId externalId,
           echosign.api.dto.FileInfo[] fileInfos,
           echosign.api.dto.FormType formType,
           java.lang.String name) {
           this.externalId = externalId;
           this.fileInfos = fileInfos;
           this.formType = formType;
           this.name = name;
    }


    /**
     * Gets the externalId value for this FormCreationInfo.
     * 
     * @return externalId
     */
    public echosign.api.dto.ExternalId getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FormCreationInfo.
     * 
     * @param externalId
     */
    public void setExternalId(echosign.api.dto.ExternalId externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the fileInfos value for this FormCreationInfo.
     * 
     * @return fileInfos
     */
    public echosign.api.dto.FileInfo[] getFileInfos() {
        return fileInfos;
    }


    /**
     * Sets the fileInfos value for this FormCreationInfo.
     * 
     * @param fileInfos
     */
    public void setFileInfos(echosign.api.dto.FileInfo[] fileInfos) {
        this.fileInfos = fileInfos;
    }


    /**
     * Gets the formType value for this FormCreationInfo.
     * 
     * @return formType
     */
    public echosign.api.dto.FormType getFormType() {
        return formType;
    }


    /**
     * Sets the formType value for this FormCreationInfo.
     * 
     * @param formType
     */
    public void setFormType(echosign.api.dto.FormType formType) {
        this.formType = formType;
    }


    /**
     * Gets the name value for this FormCreationInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FormCreationInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormCreationInfo)) return false;
        FormCreationInfo other = (FormCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.fileInfos==null && other.getFileInfos()==null) || 
             (this.fileInfos!=null &&
              java.util.Arrays.equals(this.fileInfos, other.getFileInfos()))) &&
            ((this.formType==null && other.getFormType()==null) || 
             (this.formType!=null &&
              this.formType.equals(other.getFormType()))) &&
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
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFileInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormType() != null) {
            _hashCode += getFormType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FormCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "ExternalId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "fileInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "formType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FormType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "name"));
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
