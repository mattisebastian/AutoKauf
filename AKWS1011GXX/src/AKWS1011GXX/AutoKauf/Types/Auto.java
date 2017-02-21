/**
 * Auto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AKWS1011GXX.AutoKauf.Types;

public class Auto  implements java.io.Serializable {
    private int anzahlSitze;  // attribute

    private long autoID;  // attribute

    private java.lang.String farbe;  // attribute

    private boolean gekauft;  // attribute

    private long userID;  // attribute

    public Auto() {
    }

    public Auto(
           int anzahlSitze,
           long autoID,
           java.lang.String farbe,
           boolean gekauft,
           long userID) {
           this.anzahlSitze = anzahlSitze;
           this.autoID = autoID;
           this.farbe = farbe;
           this.gekauft = gekauft;
           this.userID = userID;
    }


    /**
     * Gets the anzahlSitze value for this Auto.
     * 
     * @return anzahlSitze
     */
    public int getAnzahlSitze() {
        return anzahlSitze;
    }


    /**
     * Sets the anzahlSitze value for this Auto.
     * 
     * @param anzahlSitze
     */
    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }


    /**
     * Gets the autoID value for this Auto.
     * 
     * @return autoID
     */
    public long getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this Auto.
     * 
     * @param autoID
     */
    public void setAutoID(long autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the farbe value for this Auto.
     * 
     * @return farbe
     */
    public java.lang.String getFarbe() {
        return farbe;
    }


    /**
     * Sets the farbe value for this Auto.
     * 
     * @param farbe
     */
    public void setFarbe(java.lang.String farbe) {
        this.farbe = farbe;
    }


    /**
     * Gets the gekauft value for this Auto.
     * 
     * @return gekauft
     */
    public boolean isGekauft() {
        return gekauft;
    }


    /**
     * Sets the gekauft value for this Auto.
     * 
     * @param gekauft
     */
    public void setGekauft(boolean gekauft) {
        this.gekauft = gekauft;
    }


    /**
     * Gets the userID value for this Auto.
     * 
     * @return userID
     */
    public long getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this Auto.
     * 
     * @param userID
     */
    public void setUserID(long userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Auto)) return false;
        Auto other = (Auto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.anzahlSitze == other.getAnzahlSitze() &&
            this.autoID == other.getAutoID() &&
            ((this.farbe==null && other.getFarbe()==null) || 
             (this.farbe!=null &&
              this.farbe.equals(other.getFarbe()))) &&
            this.gekauft == other.isGekauft() &&
            this.userID == other.getUserID();
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
        _hashCode += getAnzahlSitze();
        _hashCode += new Long(getAutoID()).hashCode();
        if (getFarbe() != null) {
            _hashCode += getFarbe().hashCode();
        }
        _hashCode += (isGekauft() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getUserID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Auto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://AKWS1011GXX/AutoKauf/Types", "Auto"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("anzahlSitze");
        attrField.setXmlName(new javax.xml.namespace.QName("", "anzahlSitze"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("autoID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "autoID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("farbe");
        attrField.setXmlName(new javax.xml.namespace.QName("", "farbe"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("gekauft");
        attrField.setXmlName(new javax.xml.namespace.QName("", "gekauft"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("userID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "userID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
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
