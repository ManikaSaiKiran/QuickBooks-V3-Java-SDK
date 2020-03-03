//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.23 at 07:53:50 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Provides the mapping between ListId and TxnId in
 * 				Desktop to the same Entity Id in QBO. These mappings are available
 * 				for only companies that have migrated from Desktop to QBO
 * 			
 * 
 * <p>Java class for QbdtEntityIdMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QbdtEntityIdMapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="QboEntityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QbdtExportableId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QboEntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QbdtEntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QbdtEntityIdMapping", propOrder = {
    "qboEntityId",
    "qbdtExportableId",
    "qboEntityType",
    "qbdtEntityType"
})
public class QbdtEntityIdMapping
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QboEntityId", required = true)
    protected String qboEntityId;
    @XmlElement(name = "QbdtExportableId", required = true)
    protected String qbdtExportableId;
    @XmlElement(name = "QboEntityType", required = true)
    protected String qboEntityType;
    @XmlElement(name = "QbdtEntityType", required = true)
    protected String qbdtEntityType;

    /**
     * Gets the value of the qboEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQboEntityId() {
        return qboEntityId;
    }

    /**
     * Sets the value of the qboEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQboEntityId(String value) {
        this.qboEntityId = value;
    }

    /**
     * Gets the value of the qbdtExportableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQbdtExportableId() {
        return qbdtExportableId;
    }

    /**
     * Sets the value of the qbdtExportableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQbdtExportableId(String value) {
        this.qbdtExportableId = value;
    }

    /**
     * Gets the value of the qboEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQboEntityType() {
        return qboEntityType;
    }

    /**
     * Sets the value of the qboEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQboEntityType(String value) {
        this.qboEntityType = value;
    }

    /**
     * Gets the value of the qbdtEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQbdtEntityType() {
        return qbdtEntityType;
    }

    /**
     * Sets the value of the qbdtEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQbdtEntityType(String value) {
        this.qbdtEntityType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final QbdtEntityIdMapping that = ((QbdtEntityIdMapping) object);
        {
            String lhsQboEntityId;
            lhsQboEntityId = this.getQboEntityId();
            String rhsQboEntityId;
            rhsQboEntityId = that.getQboEntityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qboEntityId", lhsQboEntityId), LocatorUtils.property(thatLocator, "qboEntityId", rhsQboEntityId), lhsQboEntityId, rhsQboEntityId, (this.qboEntityId!= null), (that.qboEntityId!= null))) {
                return false;
            }
        }
        {
            String lhsQbdtExportableId;
            lhsQbdtExportableId = this.getQbdtExportableId();
            String rhsQbdtExportableId;
            rhsQbdtExportableId = that.getQbdtExportableId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qbdtExportableId", lhsQbdtExportableId), LocatorUtils.property(thatLocator, "qbdtExportableId", rhsQbdtExportableId), lhsQbdtExportableId, rhsQbdtExportableId, (this.qbdtExportableId!= null), (that.qbdtExportableId!= null))) {
                return false;
            }
        }
        {
            String lhsQboEntityType;
            lhsQboEntityType = this.getQboEntityType();
            String rhsQboEntityType;
            rhsQboEntityType = that.getQboEntityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qboEntityType", lhsQboEntityType), LocatorUtils.property(thatLocator, "qboEntityType", rhsQboEntityType), lhsQboEntityType, rhsQboEntityType, (this.qboEntityType!= null), (that.qboEntityType!= null))) {
                return false;
            }
        }
        {
            String lhsQbdtEntityType;
            lhsQbdtEntityType = this.getQbdtEntityType();
            String rhsQbdtEntityType;
            rhsQbdtEntityType = that.getQbdtEntityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qbdtEntityType", lhsQbdtEntityType), LocatorUtils.property(thatLocator, "qbdtEntityType", rhsQbdtEntityType), lhsQbdtEntityType, rhsQbdtEntityType, (this.qbdtEntityType!= null), (that.qbdtEntityType!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theQboEntityId;
            theQboEntityId = this.getQboEntityId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qboEntityId", theQboEntityId), currentHashCode, theQboEntityId, (this.qboEntityId!= null));
        }
        {
            String theQbdtExportableId;
            theQbdtExportableId = this.getQbdtExportableId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qbdtExportableId", theQbdtExportableId), currentHashCode, theQbdtExportableId, (this.qbdtExportableId!= null));
        }
        {
            String theQboEntityType;
            theQboEntityType = this.getQboEntityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qboEntityType", theQboEntityType), currentHashCode, theQboEntityType, (this.qboEntityType!= null));
        }
        {
            String theQbdtEntityType;
            theQbdtEntityType = this.getQbdtEntityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qbdtEntityType", theQbdtEntityType), currentHashCode, theQbdtEntityType, (this.qbdtEntityType!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
