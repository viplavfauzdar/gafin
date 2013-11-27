/**
 * WidgetItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class WidgetItem  implements java.io.Serializable {
    private java.lang.String documentKey;

    private echosign.api.dto16.ReusableDocumentStatus reusableDocumentStatus;

    private java.lang.String javascript;

    private java.util.Calendar modifiedDate;

    private java.lang.String name;

    private java.lang.String url;

    public WidgetItem() {
    }

    public WidgetItem(
           java.lang.String documentKey,
           echosign.api.dto16.ReusableDocumentStatus reusableDocumentStatus,
           java.lang.String javascript,
           java.util.Calendar modifiedDate,
           java.lang.String name,
           java.lang.String url) {
           this.documentKey = documentKey;
           this.reusableDocumentStatus = reusableDocumentStatus;
           this.javascript = javascript;
           this.modifiedDate = modifiedDate;
           this.name = name;
           this.url = url;
    }


    /**
     * Gets the documentKey value for this WidgetItem.
     * 
     * @return documentKey
     */
    public java.lang.String getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this WidgetItem.
     * 
     * @param documentKey
     */
    public void setDocumentKey(java.lang.String documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the reusableDocumentStatus value for this WidgetItem.
     * 
     * @return reusableDocumentStatus
     */
    public echosign.api.dto16.ReusableDocumentStatus getReusableDocumentStatus() {
        return reusableDocumentStatus;
    }


    /**
     * Sets the reusableDocumentStatus value for this WidgetItem.
     * 
     * @param reusableDocumentStatus
     */
    public void setReusableDocumentStatus(echosign.api.dto16.ReusableDocumentStatus reusableDocumentStatus) {
        this.reusableDocumentStatus = reusableDocumentStatus;
    }


    /**
     * Gets the javascript value for this WidgetItem.
     * 
     * @return javascript
     */
    public java.lang.String getJavascript() {
        return javascript;
    }


    /**
     * Sets the javascript value for this WidgetItem.
     * 
     * @param javascript
     */
    public void setJavascript(java.lang.String javascript) {
        this.javascript = javascript;
    }


    /**
     * Gets the modifiedDate value for this WidgetItem.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this WidgetItem.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the name value for this WidgetItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WidgetItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this WidgetItem.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WidgetItem.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetItem)) return false;
        WidgetItem other = (WidgetItem) obj;
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
            ((this.reusableDocumentStatus==null && other.getReusableDocumentStatus()==null) || 
             (this.reusableDocumentStatus!=null &&
              this.reusableDocumentStatus.equals(other.getReusableDocumentStatus()))) &&
            ((this.javascript==null && other.getJavascript()==null) || 
             (this.javascript!=null &&
              this.javascript.equals(other.getJavascript()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
        if (getDocumentKey() != null) {
            _hashCode += getDocumentKey().hashCode();
        }
        if (getReusableDocumentStatus() != null) {
            _hashCode += getReusableDocumentStatus().hashCode();
        }
        if (getJavascript() != null) {
            _hashCode += getJavascript().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "WidgetItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reusableDocumentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "reusableDocumentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ReusableDocumentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("javascript");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "javascript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "url"));
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
