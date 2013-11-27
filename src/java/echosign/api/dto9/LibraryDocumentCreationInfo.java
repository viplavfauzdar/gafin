/**
 * LibraryDocumentCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class LibraryDocumentCreationInfo  implements java.io.Serializable {
    private echosign.api.dto.FileInfo[] fileInfos;

    private echosign.api.dto9.LibrarySharingMode librarySharingMode;

    private java.lang.String name;

    private echosign.api.dto.SignatureFlow signatureFlow;

    private echosign.api.dto.SignatureType signatureType;

    public LibraryDocumentCreationInfo() {
    }

    public LibraryDocumentCreationInfo(
           echosign.api.dto.FileInfo[] fileInfos,
           echosign.api.dto9.LibrarySharingMode librarySharingMode,
           java.lang.String name,
           echosign.api.dto.SignatureFlow signatureFlow,
           echosign.api.dto.SignatureType signatureType) {
           this.fileInfos = fileInfos;
           this.librarySharingMode = librarySharingMode;
           this.name = name;
           this.signatureFlow = signatureFlow;
           this.signatureType = signatureType;
    }


    /**
     * Gets the fileInfos value for this LibraryDocumentCreationInfo.
     * 
     * @return fileInfos
     */
    public echosign.api.dto.FileInfo[] getFileInfos() {
        return fileInfos;
    }


    /**
     * Sets the fileInfos value for this LibraryDocumentCreationInfo.
     * 
     * @param fileInfos
     */
    public void setFileInfos(echosign.api.dto.FileInfo[] fileInfos) {
        this.fileInfos = fileInfos;
    }


    /**
     * Gets the librarySharingMode value for this LibraryDocumentCreationInfo.
     * 
     * @return librarySharingMode
     */
    public echosign.api.dto9.LibrarySharingMode getLibrarySharingMode() {
        return librarySharingMode;
    }


    /**
     * Sets the librarySharingMode value for this LibraryDocumentCreationInfo.
     * 
     * @param librarySharingMode
     */
    public void setLibrarySharingMode(echosign.api.dto9.LibrarySharingMode librarySharingMode) {
        this.librarySharingMode = librarySharingMode;
    }


    /**
     * Gets the name value for this LibraryDocumentCreationInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LibraryDocumentCreationInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the signatureFlow value for this LibraryDocumentCreationInfo.
     * 
     * @return signatureFlow
     */
    public echosign.api.dto.SignatureFlow getSignatureFlow() {
        return signatureFlow;
    }


    /**
     * Sets the signatureFlow value for this LibraryDocumentCreationInfo.
     * 
     * @param signatureFlow
     */
    public void setSignatureFlow(echosign.api.dto.SignatureFlow signatureFlow) {
        this.signatureFlow = signatureFlow;
    }


    /**
     * Gets the signatureType value for this LibraryDocumentCreationInfo.
     * 
     * @return signatureType
     */
    public echosign.api.dto.SignatureType getSignatureType() {
        return signatureType;
    }


    /**
     * Sets the signatureType value for this LibraryDocumentCreationInfo.
     * 
     * @param signatureType
     */
    public void setSignatureType(echosign.api.dto.SignatureType signatureType) {
        this.signatureType = signatureType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LibraryDocumentCreationInfo)) return false;
        LibraryDocumentCreationInfo other = (LibraryDocumentCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileInfos==null && other.getFileInfos()==null) || 
             (this.fileInfos!=null &&
              java.util.Arrays.equals(this.fileInfos, other.getFileInfos()))) &&
            ((this.librarySharingMode==null && other.getLibrarySharingMode()==null) || 
             (this.librarySharingMode!=null &&
              this.librarySharingMode.equals(other.getLibrarySharingMode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.signatureFlow==null && other.getSignatureFlow()==null) || 
             (this.signatureFlow!=null &&
              this.signatureFlow.equals(other.getSignatureFlow()))) &&
            ((this.signatureType==null && other.getSignatureType()==null) || 
             (this.signatureType!=null &&
              this.signatureType.equals(other.getSignatureType())));
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
        if (getLibrarySharingMode() != null) {
            _hashCode += getLibrarySharingMode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSignatureFlow() != null) {
            _hashCode += getSignatureFlow().hashCode();
        }
        if (getSignatureType() != null) {
            _hashCode += getSignatureType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LibraryDocumentCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "LibraryDocumentCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "fileInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("librarySharingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "librarySharingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "LibrarySharingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "signatureFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureFlow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "signatureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureType"));
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
