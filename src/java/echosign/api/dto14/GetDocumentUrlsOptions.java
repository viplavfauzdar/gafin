/**
 * GetDocumentUrlsOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto14;

public class GetDocumentUrlsOptions  implements java.io.Serializable {
    private java.lang.Boolean attachSupportingDocuments;

    private java.lang.Boolean auditReport;

    private java.lang.Boolean combine;

    private java.lang.String participantEmail;

    private java.lang.String versionKey;

    public GetDocumentUrlsOptions() {
    }

    public GetDocumentUrlsOptions(
           java.lang.Boolean attachSupportingDocuments,
           java.lang.Boolean auditReport,
           java.lang.Boolean combine,
           java.lang.String participantEmail,
           java.lang.String versionKey) {
           this.attachSupportingDocuments = attachSupportingDocuments;
           this.auditReport = auditReport;
           this.combine = combine;
           this.participantEmail = participantEmail;
           this.versionKey = versionKey;
    }


    /**
     * Gets the attachSupportingDocuments value for this GetDocumentUrlsOptions.
     * 
     * @return attachSupportingDocuments
     */
    public java.lang.Boolean getAttachSupportingDocuments() {
        return attachSupportingDocuments;
    }


    /**
     * Sets the attachSupportingDocuments value for this GetDocumentUrlsOptions.
     * 
     * @param attachSupportingDocuments
     */
    public void setAttachSupportingDocuments(java.lang.Boolean attachSupportingDocuments) {
        this.attachSupportingDocuments = attachSupportingDocuments;
    }


    /**
     * Gets the auditReport value for this GetDocumentUrlsOptions.
     * 
     * @return auditReport
     */
    public java.lang.Boolean getAuditReport() {
        return auditReport;
    }


    /**
     * Sets the auditReport value for this GetDocumentUrlsOptions.
     * 
     * @param auditReport
     */
    public void setAuditReport(java.lang.Boolean auditReport) {
        this.auditReport = auditReport;
    }


    /**
     * Gets the combine value for this GetDocumentUrlsOptions.
     * 
     * @return combine
     */
    public java.lang.Boolean getCombine() {
        return combine;
    }


    /**
     * Sets the combine value for this GetDocumentUrlsOptions.
     * 
     * @param combine
     */
    public void setCombine(java.lang.Boolean combine) {
        this.combine = combine;
    }


    /**
     * Gets the participantEmail value for this GetDocumentUrlsOptions.
     * 
     * @return participantEmail
     */
    public java.lang.String getParticipantEmail() {
        return participantEmail;
    }


    /**
     * Sets the participantEmail value for this GetDocumentUrlsOptions.
     * 
     * @param participantEmail
     */
    public void setParticipantEmail(java.lang.String participantEmail) {
        this.participantEmail = participantEmail;
    }


    /**
     * Gets the versionKey value for this GetDocumentUrlsOptions.
     * 
     * @return versionKey
     */
    public java.lang.String getVersionKey() {
        return versionKey;
    }


    /**
     * Sets the versionKey value for this GetDocumentUrlsOptions.
     * 
     * @param versionKey
     */
    public void setVersionKey(java.lang.String versionKey) {
        this.versionKey = versionKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDocumentUrlsOptions)) return false;
        GetDocumentUrlsOptions other = (GetDocumentUrlsOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachSupportingDocuments==null && other.getAttachSupportingDocuments()==null) || 
             (this.attachSupportingDocuments!=null &&
              this.attachSupportingDocuments.equals(other.getAttachSupportingDocuments()))) &&
            ((this.auditReport==null && other.getAuditReport()==null) || 
             (this.auditReport!=null &&
              this.auditReport.equals(other.getAuditReport()))) &&
            ((this.combine==null && other.getCombine()==null) || 
             (this.combine!=null &&
              this.combine.equals(other.getCombine()))) &&
            ((this.participantEmail==null && other.getParticipantEmail()==null) || 
             (this.participantEmail!=null &&
              this.participantEmail.equals(other.getParticipantEmail()))) &&
            ((this.versionKey==null && other.getVersionKey()==null) || 
             (this.versionKey!=null &&
              this.versionKey.equals(other.getVersionKey())));
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
        if (getAttachSupportingDocuments() != null) {
            _hashCode += getAttachSupportingDocuments().hashCode();
        }
        if (getAuditReport() != null) {
            _hashCode += getAuditReport().hashCode();
        }
        if (getCombine() != null) {
            _hashCode += getCombine().hashCode();
        }
        if (getParticipantEmail() != null) {
            _hashCode += getParticipantEmail().hashCode();
        }
        if (getVersionKey() != null) {
            _hashCode += getVersionKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDocumentUrlsOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "GetDocumentUrlsOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachSupportingDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "attachSupportingDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditReport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "auditReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "combine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participantEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "participantEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto14.api.echosign", "versionKey"));
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
