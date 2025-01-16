//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for TaxRateDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRateDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeApplicable" type="{http://schema.intuit.com/finance/v3}TaxTypeApplicablityEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TaxOnTaxOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRateDetail", propOrder = {
    "taxRateRef",
    "taxTypeApplicable",
    "taxOrder",
    "taxOnTaxOrder"
})
public class TaxRateDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "TaxTypeApplicable")
    @XmlSchemaType(name = "string")
    protected TaxTypeApplicablityEnum taxTypeApplicable;
    @XmlElement(name = "TaxOrder")
    protected Integer taxOrder;
    @XmlElement(name = "TaxOnTaxOrder")
    protected Integer taxOnTaxOrder;

    /**
     * Gets the value of the taxRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxRateRef() {
        return taxRateRef;
    }

    /**
     * Sets the value of the taxRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxRateRef(ReferenceType value) {
        this.taxRateRef = value;
    }

    /**
     * Gets the value of the taxTypeApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeApplicablityEnum }
     *     
     */
    public TaxTypeApplicablityEnum getTaxTypeApplicable() {
        return taxTypeApplicable;
    }

    /**
     * Sets the value of the taxTypeApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeApplicablityEnum }
     *     
     */
    public void setTaxTypeApplicable(TaxTypeApplicablityEnum value) {
        this.taxTypeApplicable = value;
    }

    /**
     * Gets the value of the taxOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxOrder() {
        return taxOrder;
    }

    /**
     * Sets the value of the taxOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxOrder(Integer value) {
        this.taxOrder = value;
    }

    /**
     * Gets the value of the taxOnTaxOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxOnTaxOrder() {
        return taxOnTaxOrder;
    }

    /**
     * Sets the value of the taxOnTaxOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxOnTaxOrder(Integer value) {
        this.taxOnTaxOrder = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxRateDetail that = ((TaxRateDetail) object);
        {
            ReferenceType lhsTaxRateRef;
            lhsTaxRateRef = this.getTaxRateRef();
            ReferenceType rhsTaxRateRef;
            rhsTaxRateRef = that.getTaxRateRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateRef", lhsTaxRateRef), LocatorUtils.property(thatLocator, "taxRateRef", rhsTaxRateRef), lhsTaxRateRef, rhsTaxRateRef, (this.taxRateRef!= null), (that.taxRateRef!= null))) {
                return false;
            }
        }
        {
            TaxTypeApplicablityEnum lhsTaxTypeApplicable;
            lhsTaxTypeApplicable = this.getTaxTypeApplicable();
            TaxTypeApplicablityEnum rhsTaxTypeApplicable;
            rhsTaxTypeApplicable = that.getTaxTypeApplicable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTypeApplicable", lhsTaxTypeApplicable), LocatorUtils.property(thatLocator, "taxTypeApplicable", rhsTaxTypeApplicable), lhsTaxTypeApplicable, rhsTaxTypeApplicable, (this.taxTypeApplicable!= null), (that.taxTypeApplicable!= null))) {
                return false;
            }
        }
        {
            Integer lhsTaxOrder;
            lhsTaxOrder = this.getTaxOrder();
            Integer rhsTaxOrder;
            rhsTaxOrder = that.getTaxOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOrder", lhsTaxOrder), LocatorUtils.property(thatLocator, "taxOrder", rhsTaxOrder), lhsTaxOrder, rhsTaxOrder, (this.taxOrder!= null), (that.taxOrder!= null))) {
                return false;
            }
        }
        {
            Integer lhsTaxOnTaxOrder;
            lhsTaxOnTaxOrder = this.getTaxOnTaxOrder();
            Integer rhsTaxOnTaxOrder;
            rhsTaxOnTaxOrder = that.getTaxOnTaxOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOnTaxOrder", lhsTaxOnTaxOrder), LocatorUtils.property(thatLocator, "taxOnTaxOrder", rhsTaxOnTaxOrder), lhsTaxOnTaxOrder, rhsTaxOnTaxOrder, (this.taxOnTaxOrder!= null), (that.taxOnTaxOrder!= null))) {
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
            ReferenceType theTaxRateRef;
            theTaxRateRef = this.getTaxRateRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateRef", theTaxRateRef), currentHashCode, theTaxRateRef, (this.taxRateRef!= null));
        }
        {
            TaxTypeApplicablityEnum theTaxTypeApplicable;
            theTaxTypeApplicable = this.getTaxTypeApplicable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTypeApplicable", theTaxTypeApplicable), currentHashCode, theTaxTypeApplicable, (this.taxTypeApplicable!= null));
        }
        {
            Integer theTaxOrder;
            theTaxOrder = this.getTaxOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOrder", theTaxOrder), currentHashCode, theTaxOrder, (this.taxOrder!= null));
        }
        {
            Integer theTaxOnTaxOrder;
            theTaxOnTaxOrder = this.getTaxOnTaxOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOnTaxOrder", theTaxOnTaxOrder), currentHashCode, theTaxOnTaxOrder, (this.taxOnTaxOrder!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
