//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 05:01:01 PM PST 
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
 * AttachableResponse entity describing the response of upload results
 * 
 * <p>Java class for AttachableResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachableResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Attachable" type="{http://schema.intuit.com/finance/v3}Attachable" minOccurs="0"/>
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachableResponse", propOrder = {
    "attachable",
    "fault"
})
public class AttachableResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Attachable")
    protected Attachable attachable;
    @XmlElement(name = "Fault")
    protected Fault fault;

    /**
     * Gets the value of the attachable property.
     * 
     * @return
     *     possible object is
     *     {@link Attachable }
     *     
     */
    public Attachable getAttachable() {
        return attachable;
    }

    /**
     * Sets the value of the attachable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachable }
     *     
     */
    public void setAttachable(Attachable value) {
        this.attachable = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AttachableResponse that = ((AttachableResponse) object);
        {
            Attachable lhsAttachable;
            lhsAttachable = this.getAttachable();
            Attachable rhsAttachable;
            rhsAttachable = that.getAttachable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachable", lhsAttachable), LocatorUtils.property(thatLocator, "attachable", rhsAttachable), lhsAttachable, rhsAttachable, (this.attachable!= null), (that.attachable!= null))) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, (this.fault!= null), (that.fault!= null))) {
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
        int currentHashCode = 1;
        {
            Attachable theAttachable;
            theAttachable = this.getAttachable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachable", theAttachable), currentHashCode, theAttachable, (this.attachable!= null));
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, (this.fault!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
