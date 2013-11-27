/**
 * DocumentListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class DocumentListItem  implements java.io.Serializable {
    private java.lang.String documentKey;

    private java.lang.String latestDocumentKey;

    private echosign.api.dto14.DocumentListItemUserDocumentStatus userDocumentStatus;

    private java.util.Calendar displayDate;

    private echosign.api.dto.DisplayUserInfo displayUserInfo;

    private java.lang.Boolean esign;

    private java.lang.Boolean megaSign;

    private java.lang.String name;

    public DocumentListItem() {
    }

    public DocumentListItem(
           java.lang.String documentKey,
           java.lang.String latestDocumentKey,
           echosign.api.dto14.DocumentListItemUserDocumentStatus userDocumentStatus,
           java.util.Calendar displayDate,
           echosign.api.dto.DisplayUserInfo displayUserInfo,
           java.lang.Boolean esign,
           java.lang.Boolean megaSign,
           java.lang.String name) {
           this.documentKey = documentKey;
           this.latestDocumentKey = latestDocumentKey;
           this.userDocumentStatus = userDocumentStatus;
           this.displayDate = displayDate;
           this.displayUserInfo = displayUserInfo;
           this.esign = esign;
           this.megaSign = megaSign;
           this.name = name;
    }


    /**
     * Gets the documentKey value for this DocumentListItem.
     * 
     * @return documentKey
     */
    public java.lang.String getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this DocumentListItem.
     * 
     * @param documentKey
     */
    public void setDocumentKey(java.lang.String documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the latestDocumentKey value for this DocumentListItem.
     * 
     * @return latestDocumentKey
     */
    public java.lang.String getLatestDocumentKey() {
        return latestDocumentKey;
    }


    /**
     * Sets the latestDocumentKey value for this DocumentListItem.
     * 
     * @param latestDocumentKey
     */
    public void setLatestDocumentKey(java.lang.String latestDocumentKey) {
        this.latestDocumentKey = latestDocumentKey;
    }


    /**
     * Gets the userDocumentStatus value for this DocumentListItem.
     * 
     * @return userDocumentStatus
     */
    public echosign.api.dto14.DocumentListItemUserDocumentStatus getUserDocumentStatus() {
        return userDocumentStatus;
    }


    /**
     * Sets the userDocumentStatus value for this DocumentListItem.
     * 
     * @param userDocumentStatus
     */
    public void setUserDocumentStatus(echosign.api.dto14.DocumentListItemUserDocumentStatus userDocumentStatus) {
        this.userDocumentStatus = userDocumentStatus;
    }


    /**
     * Gets the displayDate value for this DocumentListItem.
     * 
     * @return displayDate
     */
    public java.util.Calendar getDisplayDate() {
        return displayDate;
    }


    /**
     * Sets the displayDate value for this DocumentListItem.
     * 
     * @param displayDate
     */
    public void setDisplayDate(java.util.Calendar displayDate) {
        this.displayDate = displayDate;
    }


    /**
     * Gets the displayUserInfo value for this DocumentListItem.
     * 
     * @return displayUserInfo
     */
    public echosign.api.dto.DisplayUserInfo getDisplayUserInfo() {
        return displayUserInfo;
    }


    /**
     * Sets the displayUserInfo value for this DocumentListItem.
     * 
     * @param displayUserInfo
     */
    public void setDisplayUserInfo(echosign.api.dto.DisplayUserInfo displayUserInfo) {
        this.displayUserInfo = displayUserInfo;
    }


    /**
     * Gets the esign value for this DocumentListItem.
     * 
     * @return esign
     */
    public java.lang.Boolean getEsign() {
        return esign;
    }


    /**
     * Sets the esign value for this DocumentListItem.
     * 
     * @param esign
     */
    public void setEsign(java.lang.Boolean esign) {
        this.esign = esign;
    }


    /**
     * Gets the megaSign value for this DocumentListItem.
     * 
     * @return megaSign
     */
    public java.lang.Boolean getMegaSign() {
        return megaSign;
    }


    /**
     * Sets the megaSign value for this DocumentListItem.
     * 
     * @param megaSign
     */
    public void setMegaSign(java.lang.Boolean megaSign) {
        this.megaSign = megaSign;
    }


    /**
     * Gets the name value for this DocumentListItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentListItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentListItem)) return false;
        DocumentListItem other = (DocumentListItem) obj;
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
            ((this.latestDocumentKey==null && other.getLatestDocumentKey()==null) || 
             (this.latestDocumentKey!=null &&
              this.latestDocumentKey.equals(other.getLatestDocumentKey()))) &&
            ((this.userDocumentStatus==null && other.getUserDocumentStatus()==null) || 
             (this.userDocumentStatus!=null &&
              this.userDocumentStatus.equals(other.getUserDocumentStatus()))) &&
            ((this.displayDate==null && other.getDisplayDate()==null) || 
             (this.displayDate!=null &&
              this.displayDate.equals(other.getDisplayDate()))) &&
            ((this.displayUserInfo==null && other.getDisplayUserInfo()==null) || 
             (this.displayUserInfo!=null &&
              this.displayUserInfo.equals(other.getDisplayUserInfo()))) &&
            ((this.esign==null && other.getEsign()==null) || 
             (this.esign!=null &&
              this.esign.equals(other.getEsign()))) &&
            ((this.megaSign==null && other.getMegaSign()==null) || 
             (this.megaSign!=null &&
              this.megaSign.equals(other.getMegaSign()))) &&
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
        if (getDocumentKey() != null) {
            _hashCode += getDocumentKey().hashCode();
        }
        if (getLatestDocumentKey() != null) {
            _hashCode += getLatestDocumentKey().hashCode();
        }
        if (getUserDocumentStatus() != null) {
            _hashCode += getUserDocumentStatus().hashCode();
        }
        if (getDisplayDate() != null) {
            _hashCode += getDisplayDate().hashCode();
        }
        if (getDisplayUserInfo() != null) {
            _hashCode += getDisplayUserInfo().hashCode();
        }
        if (getEsign() != null) {
            _hashCode += getEsign().hashCode();
        }
        if (getMegaSign() != null) {
            _hashCode += getMegaSign().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestDocumentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "latestDocumentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDocumentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "userDocumentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "DocumentListItemUserDocumentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "displayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayUserInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "displayUserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "DisplayUserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "esign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("megaSign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "megaSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
