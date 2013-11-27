/**
 * FileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto;

public class FileInfo  implements java.io.Serializable {
    private byte[] file;

    private java.lang.String fileName;

    private java.lang.String formKey;

    private java.lang.String libraryDocumentKey;

    private java.lang.String libraryDocumentName;

    private java.lang.String mimeType;

    private java.lang.String url;

    public FileInfo() {
    }

    public FileInfo(
           byte[] file,
           java.lang.String fileName,
           java.lang.String formKey,
           java.lang.String libraryDocumentKey,
           java.lang.String libraryDocumentName,
           java.lang.String mimeType,
           java.lang.String url) {
           this.file = file;
           this.fileName = fileName;
           this.formKey = formKey;
           this.libraryDocumentKey = libraryDocumentKey;
           this.libraryDocumentName = libraryDocumentName;
           this.mimeType = mimeType;
           this.url = url;
    }


    /**
     * Gets the file value for this FileInfo.
     * 
     * @return file
     */
    public byte[] getFile() {
        return file;
    }


    /**
     * Sets the file value for this FileInfo.
     * 
     * @param file
     */
    public void setFile(byte[] file) {
        this.file = file;
    }


    /**
     * Gets the fileName value for this FileInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this FileInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the formKey value for this FileInfo.
     * 
     * @return formKey
     */
    public java.lang.String getFormKey() {
        return formKey;
    }


    /**
     * Sets the formKey value for this FileInfo.
     * 
     * @param formKey
     */
    public void setFormKey(java.lang.String formKey) {
        this.formKey = formKey;
    }


    /**
     * Gets the libraryDocumentKey value for this FileInfo.
     * 
     * @return libraryDocumentKey
     */
    public java.lang.String getLibraryDocumentKey() {
        return libraryDocumentKey;
    }


    /**
     * Sets the libraryDocumentKey value for this FileInfo.
     * 
     * @param libraryDocumentKey
     */
    public void setLibraryDocumentKey(java.lang.String libraryDocumentKey) {
        this.libraryDocumentKey = libraryDocumentKey;
    }


    /**
     * Gets the libraryDocumentName value for this FileInfo.
     * 
     * @return libraryDocumentName
     */
    public java.lang.String getLibraryDocumentName() {
        return libraryDocumentName;
    }


    /**
     * Sets the libraryDocumentName value for this FileInfo.
     * 
     * @param libraryDocumentName
     */
    public void setLibraryDocumentName(java.lang.String libraryDocumentName) {
        this.libraryDocumentName = libraryDocumentName;
    }


    /**
     * Gets the mimeType value for this FileInfo.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this FileInfo.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the url value for this FileInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FileInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileInfo)) return false;
        FileInfo other = (FileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              java.util.Arrays.equals(this.file, other.getFile()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.formKey==null && other.getFormKey()==null) || 
             (this.formKey!=null &&
              this.formKey.equals(other.getFormKey()))) &&
            ((this.libraryDocumentKey==null && other.getLibraryDocumentKey()==null) || 
             (this.libraryDocumentKey!=null &&
              this.libraryDocumentKey.equals(other.getLibraryDocumentKey()))) &&
            ((this.libraryDocumentName==null && other.getLibraryDocumentName()==null) || 
             (this.libraryDocumentName!=null &&
              this.libraryDocumentName.equals(other.getLibraryDocumentName()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFormKey() != null) {
            _hashCode += getFormKey().hashCode();
        }
        if (getLibraryDocumentKey() != null) {
            _hashCode += getLibraryDocumentKey().hashCode();
        }
        if (getLibraryDocumentName() != null) {
            _hashCode += getLibraryDocumentName().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "formKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libraryDocumentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "libraryDocumentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libraryDocumentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "libraryDocumentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.api.echosign", "url"));
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
