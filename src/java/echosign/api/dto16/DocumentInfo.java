/**
 * DocumentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package echosign.api.dto16;

public class DocumentInfo  implements java.io.Serializable {
    private java.lang.String documentKey;

    private echosign.api.dto16.DocumentHistoryEvent[] events;

    private java.lang.String latestDocumentKey;

    private echosign.api.dto16.ParticipantInfo[] participants;

    private java.util.Calendar expiration;

    private java.lang.String locale;

    private java.lang.String message;

    private java.lang.String name;

    private echosign.api.dto9.NextParticipantInfo[] nextParticipantInfos;

    private echosign.api.dto13.SecurityOption[] securityOptions;

    private echosign.api.dto14.AgreementStatus status;

    public DocumentInfo() {
    }

    public DocumentInfo(
           java.lang.String documentKey,
           echosign.api.dto16.DocumentHistoryEvent[] events,
           java.lang.String latestDocumentKey,
           echosign.api.dto16.ParticipantInfo[] participants,
           java.util.Calendar expiration,
           java.lang.String locale,
           java.lang.String message,
           java.lang.String name,
           echosign.api.dto9.NextParticipantInfo[] nextParticipantInfos,
           echosign.api.dto13.SecurityOption[] securityOptions,
           echosign.api.dto14.AgreementStatus status) {
           this.documentKey = documentKey;
           this.events = events;
           this.latestDocumentKey = latestDocumentKey;
           this.participants = participants;
           this.expiration = expiration;
           this.locale = locale;
           this.message = message;
           this.name = name;
           this.nextParticipantInfos = nextParticipantInfos;
           this.securityOptions = securityOptions;
           this.status = status;
    }


    /**
     * Gets the documentKey value for this DocumentInfo.
     * 
     * @return documentKey
     */
    public java.lang.String getDocumentKey() {
        return documentKey;
    }


    /**
     * Sets the documentKey value for this DocumentInfo.
     * 
     * @param documentKey
     */
    public void setDocumentKey(java.lang.String documentKey) {
        this.documentKey = documentKey;
    }


    /**
     * Gets the events value for this DocumentInfo.
     * 
     * @return events
     */
    public echosign.api.dto16.DocumentHistoryEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this DocumentInfo.
     * 
     * @param events
     */
    public void setEvents(echosign.api.dto16.DocumentHistoryEvent[] events) {
        this.events = events;
    }


    /**
     * Gets the latestDocumentKey value for this DocumentInfo.
     * 
     * @return latestDocumentKey
     */
    public java.lang.String getLatestDocumentKey() {
        return latestDocumentKey;
    }


    /**
     * Sets the latestDocumentKey value for this DocumentInfo.
     * 
     * @param latestDocumentKey
     */
    public void setLatestDocumentKey(java.lang.String latestDocumentKey) {
        this.latestDocumentKey = latestDocumentKey;
    }


    /**
     * Gets the participants value for this DocumentInfo.
     * 
     * @return participants
     */
    public echosign.api.dto16.ParticipantInfo[] getParticipants() {
        return participants;
    }


    /**
     * Sets the participants value for this DocumentInfo.
     * 
     * @param participants
     */
    public void setParticipants(echosign.api.dto16.ParticipantInfo[] participants) {
        this.participants = participants;
    }


    /**
     * Gets the expiration value for this DocumentInfo.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this DocumentInfo.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the locale value for this DocumentInfo.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this DocumentInfo.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the message value for this DocumentInfo.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DocumentInfo.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the name value for this DocumentInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DocumentInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nextParticipantInfos value for this DocumentInfo.
     * 
     * @return nextParticipantInfos
     */
    public echosign.api.dto9.NextParticipantInfo[] getNextParticipantInfos() {
        return nextParticipantInfos;
    }


    /**
     * Sets the nextParticipantInfos value for this DocumentInfo.
     * 
     * @param nextParticipantInfos
     */
    public void setNextParticipantInfos(echosign.api.dto9.NextParticipantInfo[] nextParticipantInfos) {
        this.nextParticipantInfos = nextParticipantInfos;
    }


    /**
     * Gets the securityOptions value for this DocumentInfo.
     * 
     * @return securityOptions
     */
    public echosign.api.dto13.SecurityOption[] getSecurityOptions() {
        return securityOptions;
    }


    /**
     * Sets the securityOptions value for this DocumentInfo.
     * 
     * @param securityOptions
     */
    public void setSecurityOptions(echosign.api.dto13.SecurityOption[] securityOptions) {
        this.securityOptions = securityOptions;
    }


    /**
     * Gets the status value for this DocumentInfo.
     * 
     * @return status
     */
    public echosign.api.dto14.AgreementStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DocumentInfo.
     * 
     * @param status
     */
    public void setStatus(echosign.api.dto14.AgreementStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentInfo)) return false;
        DocumentInfo other = (DocumentInfo) obj;
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
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.latestDocumentKey==null && other.getLatestDocumentKey()==null) || 
             (this.latestDocumentKey!=null &&
              this.latestDocumentKey.equals(other.getLatestDocumentKey()))) &&
            ((this.participants==null && other.getParticipants()==null) || 
             (this.participants!=null &&
              java.util.Arrays.equals(this.participants, other.getParticipants()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nextParticipantInfos==null && other.getNextParticipantInfos()==null) || 
             (this.nextParticipantInfos!=null &&
              java.util.Arrays.equals(this.nextParticipantInfos, other.getNextParticipantInfos()))) &&
            ((this.securityOptions==null && other.getSecurityOptions()==null) || 
             (this.securityOptions!=null &&
              java.util.Arrays.equals(this.securityOptions, other.getSecurityOptions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestDocumentKey() != null) {
            _hashCode += getLatestDocumentKey().hashCode();
        }
        if (getParticipants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParticipants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParticipants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNextParticipantInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextParticipantInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextParticipantInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecurityOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "documentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "DocumentHistoryEvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestDocumentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "latestDocumentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "participants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto16.api.echosign", "ParticipantInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextParticipantInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "nextParticipantInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto9.api.echosign", "NextParticipantInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto9.api.echosign", "NextParticipantInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "securityOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto13.api.echosign", "SecurityOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://dto13.api.echosign", "SecurityOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto16.api.echosign", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto14.api.echosign", "AgreementStatus"));
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
