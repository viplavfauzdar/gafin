/**
 * MergeFieldInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto9;

public class MergeFieldInfo  implements java.io.Serializable {
    private echosign.api.dto9.MergeField[] mergeFields;

    public MergeFieldInfo() {
    }

    public MergeFieldInfo(
           echosign.api.dto9.MergeField[] mergeFields) {
           this.mergeFields = mergeFields;
    }


    /**
     * Gets the mergeFields value for this MergeFieldInfo.
     * 
     * @return mergeFields
     */
    public echosign.api.dto9.MergeField[] getMergeFields() {
        return mergeFields;
    }


    /**
     * Sets the mergeFields value for this MergeFieldInfo.
     * 
     * @param mergeFields
     */
    public void setMergeFields(echosign.api.dto9.MergeField[] mergeFields) {
        this.mergeFields = mergeFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MergeFieldInfo)) return false;
        MergeFieldInfo other = (MergeFieldInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mergeFields==null && other.getMergeFields()==null) || 
             (this.mergeFields!=null &&
              java.util.Arrays.equals(this.mergeFields, other.getMergeFields())));
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
        if (getMergeFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMergeFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMergeFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MergeFieldInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeFieldInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto9.api.echosign", "mergeFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto9.api.echosign", "MergeField"));
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
