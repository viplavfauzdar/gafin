/**
 * WidgetCreationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class WidgetCreationInfo  implements java.io.Serializable {
    private echosign.api.dto.CallbackInfo callbackInfo;

    private echosign.api.dto.FileInfo[] fileInfos;

    private java.lang.String locale;

    private echosign.api.dto9.MergeFieldInfo mergeFieldInfo;

    private java.lang.String name;

    private echosign.api.dto.SecurityOptions securityOptions;

    private echosign.api.dto.SignatureFlow signatureFlow;

    private echosign.api.dto8.WidgetCompletionInfo widgetAuthFailureInfo;

    private echosign.api.dto8.WidgetCompletionInfo widgetCompletionInfo;

    public WidgetCreationInfo() {
    }

    public WidgetCreationInfo(
           echosign.api.dto.CallbackInfo callbackInfo,
           echosign.api.dto.FileInfo[] fileInfos,
           java.lang.String locale,
           echosign.api.dto9.MergeFieldInfo mergeFieldInfo,
           java.lang.String name,
           echosign.api.dto.SecurityOptions securityOptions,
           echosign.api.dto.SignatureFlow signatureFlow,
           echosign.api.dto8.WidgetCompletionInfo widgetAuthFailureInfo,
           echosign.api.dto8.WidgetCompletionInfo widgetCompletionInfo) {
           this.callbackInfo = callbackInfo;
           this.fileInfos = fileInfos;
           this.locale = locale;
           this.mergeFieldInfo = mergeFieldInfo;
           this.name = name;
           this.securityOptions = securityOptions;
           this.signatureFlow = signatureFlow;
           this.widgetAuthFailureInfo = widgetAuthFailureInfo;
           this.widgetCompletionInfo = widgetCompletionInfo;
    }


    /**
     * Gets the callbackInfo value for this WidgetCreationInfo.
     * 
     * @return callbackInfo
     */
    public echosign.api.dto.CallbackInfo getCallbackInfo() {
        return callbackInfo;
    }


    /**
     * Sets the callbackInfo value for this WidgetCreationInfo.
     * 
     * @param callbackInfo
     */
    public void setCallbackInfo(echosign.api.dto.CallbackInfo callbackInfo) {
        this.callbackInfo = callbackInfo;
    }


    /**
     * Gets the fileInfos value for this WidgetCreationInfo.
     * 
     * @return fileInfos
     */
    public echosign.api.dto.FileInfo[] getFileInfos() {
        return fileInfos;
    }


    /**
     * Sets the fileInfos value for this WidgetCreationInfo.
     * 
     * @param fileInfos
     */
    public void setFileInfos(echosign.api.dto.FileInfo[] fileInfos) {
        this.fileInfos = fileInfos;
    }


    /**
     * Gets the locale value for this WidgetCreationInfo.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this WidgetCreationInfo.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the mergeFieldInfo value for this WidgetCreationInfo.
     * 
     * @return mergeFieldInfo
     */
    public echosign.api.dto9.MergeFieldInfo getMergeFieldInfo() {
        return mergeFieldInfo;
    }


    /**
     * Sets the mergeFieldInfo value for this WidgetCreationInfo.
     * 
     * @param mergeFieldInfo
     */
    public void setMergeFieldInfo(echosign.api.dto9.MergeFieldInfo mergeFieldInfo) {
        this.mergeFieldInfo = mergeFieldInfo;
    }


    /**
     * Gets the name value for this WidgetCreationInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WidgetCreationInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the securityOptions value for this WidgetCreationInfo.
     * 
     * @return securityOptions
     */
    public echosign.api.dto.SecurityOptions getSecurityOptions() {
        return securityOptions;
    }


    /**
     * Sets the securityOptions value for this WidgetCreationInfo.
     * 
     * @param securityOptions
     */
    public void setSecurityOptions(echosign.api.dto.SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
    }


    /**
     * Gets the signatureFlow value for this WidgetCreationInfo.
     * 
     * @return signatureFlow
     */
    public echosign.api.dto.SignatureFlow getSignatureFlow() {
        return signatureFlow;
    }


    /**
     * Sets the signatureFlow value for this WidgetCreationInfo.
     * 
     * @param signatureFlow
     */
    public void setSignatureFlow(echosign.api.dto.SignatureFlow signatureFlow) {
        this.signatureFlow = signatureFlow;
    }


    /**
     * Gets the widgetAuthFailureInfo value for this WidgetCreationInfo.
     * 
     * @return widgetAuthFailureInfo
     */
    public echosign.api.dto8.WidgetCompletionInfo getWidgetAuthFailureInfo() {
        return widgetAuthFailureInfo;
    }


    /**
     * Sets the widgetAuthFailureInfo value for this WidgetCreationInfo.
     * 
     * @param widgetAuthFailureInfo
     */
    public void setWidgetAuthFailureInfo(echosign.api.dto8.WidgetCompletionInfo widgetAuthFailureInfo) {
        this.widgetAuthFailureInfo = widgetAuthFailureInfo;
    }


    /**
     * Gets the widgetCompletionInfo value for this WidgetCreationInfo.
     * 
     * @return widgetCompletionInfo
     */
    public echosign.api.dto8.WidgetCompletionInfo getWidgetCompletionInfo() {
        return widgetCompletionInfo;
    }


    /**
     * Sets the widgetCompletionInfo value for this WidgetCreationInfo.
     * 
     * @param widgetCompletionInfo
     */
    public void setWidgetCompletionInfo(echosign.api.dto8.WidgetCompletionInfo widgetCompletionInfo) {
        this.widgetCompletionInfo = widgetCompletionInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetCreationInfo)) return false;
        WidgetCreationInfo other = (WidgetCreationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callbackInfo==null && other.getCallbackInfo()==null) || 
             (this.callbackInfo!=null &&
              this.callbackInfo.equals(other.getCallbackInfo()))) &&
            ((this.fileInfos==null && other.getFileInfos()==null) || 
             (this.fileInfos!=null &&
              java.util.Arrays.equals(this.fileInfos, other.getFileInfos()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.mergeFieldInfo==null && other.getMergeFieldInfo()==null) || 
             (this.mergeFieldInfo!=null &&
              this.mergeFieldInfo.equals(other.getMergeFieldInfo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.securityOptions==null && other.getSecurityOptions()==null) || 
             (this.securityOptions!=null &&
              this.securityOptions.equals(other.getSecurityOptions()))) &&
            ((this.signatureFlow==null && other.getSignatureFlow()==null) || 
             (this.signatureFlow!=null &&
              this.signatureFlow.equals(other.getSignatureFlow()))) &&
            ((this.widgetAuthFailureInfo==null && other.getWidgetAuthFailureInfo()==null) || 
             (this.widgetAuthFailureInfo!=null &&
              this.widgetAuthFailureInfo.equals(other.getWidgetAuthFailureInfo()))) &&
            ((this.widgetCompletionInfo==null && other.getWidgetCompletionInfo()==null) || 
             (this.widgetCompletionInfo!=null &&
              this.widgetCompletionInfo.equals(other.getWidgetCompletionInfo())));
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
        if (getCallbackInfo() != null) {
            _hashCode += getCallbackInfo().hashCode();
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMergeFieldInfo() != null) {
            _hashCode += getMergeFieldInfo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSecurityOptions() != null) {
            _hashCode += getSecurityOptions().hashCode();
        }
        if (getSignatureFlow() != null) {
            _hashCode += getSignatureFlow().hashCode();
        }
        if (getWidgetAuthFailureInfo() != null) {
            _hashCode += getWidgetAuthFailureInfo().hashCode();
        }
        if (getWidgetCompletionInfo() != null) {
            _hashCode += getWidgetCompletionInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetCreationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCreationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "callbackInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "CallbackInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "fileInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto.api.echosign", "FileInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "mergeFieldInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeFieldInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "securityOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SecurityOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "signatureFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.api.echosign", "SignatureFlow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetAuthFailureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "widgetAuthFailureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCompletionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetCompletionInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "widgetCompletionInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCompletionInfo"));
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
