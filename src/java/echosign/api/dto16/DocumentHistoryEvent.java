/**
 * DocumentHistoryEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class DocumentHistoryEvent  implements java.io.Serializable {
    private echosign.api.dto16.DeviceLocation deviceLocation;

    private java.lang.String documentVersionKey;

    private java.lang.String synchronizationKey;

    private echosign.api.dto16.AgreementEventType type;

    private java.lang.String actingUserIpAddress;

    private java.lang.String actingUserEmail;

    private java.lang.String comment;

    private java.lang.String participantEmail;

    private java.util.Calendar date;

    private java.lang.String description;

    public DocumentHistoryEvent() {
    }

    public DocumentHistoryEvent(
           echosign.api.dto16.DeviceLocation deviceLocation,
           java.lang.String documentVersionKey,
           java.lang.String synchronizationKey,
           echosign.api.dto16.AgreementEventType type,
           java.lang.String actingUserIpAddress,
           java.lang.String actingUserEmail,
           java.lang.String comment,
           java.lang.String participantEmail,
           java.util.Calendar date,
           java.lang.String description) {
           this.deviceLocation = deviceLocation;
           this.documentVersionKey = documentVersionKey;
           this.synchronizationKey = synchronizationKey;
           this.type = type;
           this.actingUserIpAddress = actingUserIpAddress;
           this.actingUserEmail = actingUserEmail;
           this.comment = comment;
           this.participantEmail = participantEmail;
           this.date = date;
           this.description = description;
    }


    /**
     * Gets the deviceLocation value for this DocumentHistoryEvent.
     * 
     * @return deviceLocation
     */
    public echosign.api.dto16.DeviceLocation getDeviceLocation() {
        return deviceLocation;
    }


    /**
     * Sets the deviceLocation value for this DocumentHistoryEvent.
     * 
     * @param deviceLocation
     */
    public void setDeviceLocation(echosign.api.dto16.DeviceLocation deviceLocation) {
        this.deviceLocation = deviceLocation;
    }


    /**
     * Gets the documentVersionKey value for this DocumentHistoryEvent.
     * 
     * @return documentVersionKey
     */
    public java.lang.String getDocumentVersionKey() {
        return documentVersionKey;
    }


    /**
     * Sets the documentVersionKey value for this DocumentHistoryEvent.
     * 
     * @param documentVersionKey
     */
    public void setDocumentVersionKey(java.lang.String documentVersionKey) {
        this.documentVersionKey = documentVersionKey;
    }


    /**
     * Gets the synchronizationKey value for this DocumentHistoryEvent.
     * 
     * @return synchronizationKey
     */
    public java.lang.String getSynchronizationKey() {
        return synchronizationKey;
    }


    /**
     * Sets the synchronizationKey value for this DocumentHistoryEvent.
     * 
     * @param synchronizationKey
     */
    public void setSynchronizationKey(java.lang.String synchronizationKey) {
        this.synchronizationKey = synchronizationKey;
    }


    /**
     * Gets the type value for this DocumentHistoryEvent.
     * 
     * @return type
     */
    public echosign.api.dto16.AgreementEventType getType() {
        return type;
    }


    /**
     * Sets the type value for this DocumentHistoryEvent.
     * 
     * @param type
     */
    public void setType(echosign.api.dto16.AgreementEventType type) {
        this.type = type;
    }


    /**
     * Gets the actingUserIpAddress value for this DocumentHistoryEvent.
     * 
     * @return actingUserIpAddress
     */
    public java.lang.String getActingUserIpAddress() {
        return actingUserIpAddress;
    }


    /**
     * Sets the actingUserIpAddress value for this DocumentHistoryEvent.
     * 
     * @param actingUserIpAddress
     */
    public void setActingUserIpAddress(java.lang.String actingUserIpAddress) {
        this.actingUserIpAddress = actingUserIpAddress;
    }


    /**
     * Gets the actingUserEmail value for this DocumentHistoryEvent.
     * 
     * @return actingUserEmail
     */
    public java.lang.String getActingUserEmail() {
        return actingUserEmail;
    }


    /**
     * Sets the actingUserEmail value for this DocumentHistoryEvent.
     * 
     * @param actingUserEmail
     */
    public void setActingUserEmail(java.lang.String actingUserEmail) {
        this.actingUserEmail = actingUserEmail;
    }


    /**
     * Gets the comment value for this DocumentHistoryEvent.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this DocumentHistoryEvent.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the participantEmail value for this DocumentHistoryEvent.
     * 
     * @return participantEmail
     */
    public java.lang.String getParticipantEmail() {
        return participantEmail;
    }


    /**
     * Sets the participantEmail value for this DocumentHistoryEvent.
     * 
     * @param participantEmail
     */
    public void setParticipantEmail(java.lang.String participantEmail) {
        this.participantEmail = participantEmail;
    }


    /**
     * Gets the date value for this DocumentHistoryEvent.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this DocumentHistoryEvent.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the description value for this DocumentHistoryEvent.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DocumentHistoryEvent.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentHistoryEvent)) return false;
        DocumentHistoryEvent other = (DocumentHistoryEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceLocation==null && other.getDeviceLocation()==null) || 
             (this.deviceLocation!=null &&
              this.deviceLocation.equals(other.getDeviceLocation()))) &&
            ((this.documentVersionKey==null && other.getDocumentVersionKey()==null) || 
             (this.documentVersionKey!=null &&
              this.documentVersionKey.equals(other.getDocumentVersionKey()))) &&
            ((this.synchronizationKey==null && other.getSynchronizationKey()==null) || 
             (this.synchronizationKey!=null &&
              this.synchronizationKey.equals(other.getSynchronizationKey()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.actingUserIpAddress==null && other.getActingUserIpAddress()==null) || 
             (this.actingUserIpAddress!=null &&
              this.actingUserIpAddress.equals(other.getActingUserIpAddress()))) &&
            ((this.actingUserEmail==null && other.getActingUserEmail()==null) || 
             (this.actingUserEmail!=null &&
              this.actingUserEmail.equals(other.getActingUserEmail()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.participantEmail==null && other.getParticipantEmail()==null) || 
             (this.participantEmail!=null &&
              this.participantEmail.equals(other.getParticipantEmail()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getDeviceLocation() != null) {
            _hashCode += getDeviceLocation().hashCode();
        }
        if (getDocumentVersionKey() != null) {
            _hashCode += getDocumentVersionKey().hashCode();
        }
        if (getSynchronizationKey() != null) {
            _hashCode += getSynchronizationKey().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getActingUserIpAddress() != null) {
            _hashCode += getActingUserIpAddress().hashCode();
        }
        if (getActingUserEmail() != null) {
            _hashCode += getActingUserEmail().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getParticipantEmail() != null) {
            _hashCode += getParticipantEmail().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentHistoryEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "deviceLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DeviceLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentVersionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentVersionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "synchronizationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "AgreementEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actingUserIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "actingUserIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actingUserEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "actingUserEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participantEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "participantEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "description"));
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
