/**
 * WidgetCompletionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto8;

public class WidgetCompletionInfo  implements java.io.Serializable {
    private java.lang.Boolean deframe;

    private java.lang.Integer delay;

    private java.lang.String url;

    public WidgetCompletionInfo() {
    }

    public WidgetCompletionInfo(
           java.lang.Boolean deframe,
           java.lang.Integer delay,
           java.lang.String url) {
           this.deframe = deframe;
           this.delay = delay;
           this.url = url;
    }


    /**
     * Gets the deframe value for this WidgetCompletionInfo.
     * 
     * @return deframe
     */
    public java.lang.Boolean getDeframe() {
        return deframe;
    }


    /**
     * Sets the deframe value for this WidgetCompletionInfo.
     * 
     * @param deframe
     */
    public void setDeframe(java.lang.Boolean deframe) {
        this.deframe = deframe;
    }


    /**
     * Gets the delay value for this WidgetCompletionInfo.
     * 
     * @return delay
     */
    public java.lang.Integer getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this WidgetCompletionInfo.
     * 
     * @param delay
     */
    public void setDelay(java.lang.Integer delay) {
        this.delay = delay;
    }


    /**
     * Gets the url value for this WidgetCompletionInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this WidgetCompletionInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetCompletionInfo)) return false;
        WidgetCompletionInfo other = (WidgetCompletionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deframe==null && other.getDeframe()==null) || 
             (this.deframe!=null &&
              this.deframe.equals(other.getDeframe()))) &&
            ((this.delay==null && other.getDelay()==null) || 
             (this.delay!=null &&
              this.delay.equals(other.getDelay()))) &&
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
        if (getDeframe() != null) {
            _hashCode += getDeframe().hashCode();
        }
        if (getDelay() != null) {
            _hashCode += getDelay().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetCompletionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto8.api.echosign", "WidgetCompletionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deframe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "deframe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto8.api.echosign", "url"));
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
