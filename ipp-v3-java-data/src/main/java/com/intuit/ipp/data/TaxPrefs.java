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
 * <p>Java class for TaxPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsingSalesTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerTaxEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideTaxManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TaxGroupCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *           &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PaySalesTax" type="{http://schema.intuit.com/finance/v3}PaySalesTaxEnum" minOccurs="0"/&gt;
 *         &lt;element name="NonTaxableSalesTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxableSalesTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPrefs", propOrder = {
    "usingSalesTax",
    "partnerTaxEnabled",
    "hideTaxManagement",
    "taxGroupCodeRef",
    "taxRateRef",
    "paySalesTax",
    "nonTaxableSalesTaxCodeRef",
    "taxableSalesTaxCodeRef"
})
public class TaxPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UsingSalesTax")
    protected Boolean usingSalesTax;
    @XmlElement(name = "PartnerTaxEnabled")
    protected Boolean partnerTaxEnabled;
    @XmlElement(name = "HideTaxManagement")
    protected Boolean hideTaxManagement;
    @XmlElement(name = "TaxGroupCodeRef")
    protected ReferenceType taxGroupCodeRef;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "PaySalesTax")
    @XmlSchemaType(name = "string")
    protected PaySalesTaxEnum paySalesTax;
    @XmlElement(name = "NonTaxableSalesTaxCodeRef")
    protected ReferenceType nonTaxableSalesTaxCodeRef;
    @XmlElement(name = "TaxableSalesTaxCodeRef")
    protected ReferenceType taxableSalesTaxCodeRef;

    /**
     * Gets the value of the usingSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsingSalesTax() {
        return usingSalesTax;
    }

    /**
     * Sets the value of the usingSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsingSalesTax(Boolean value) {
        this.usingSalesTax = value;
    }

    /**
     * Gets the value of the partnerTaxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerTaxEnabled() {
        return partnerTaxEnabled;
    }

    /**
     * Sets the value of the partnerTaxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerTaxEnabled(Boolean value) {
        this.partnerTaxEnabled = value;
    }

    /**
     * Gets the value of the hideTaxManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideTaxManagement() {
        return hideTaxManagement;
    }

    /**
     * Sets the value of the hideTaxManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideTaxManagement(Boolean value) {
        this.hideTaxManagement = value;
    }

    /**
     * Gets the value of the taxGroupCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxGroupCodeRef() {
        return taxGroupCodeRef;
    }

    /**
     * Sets the value of the taxGroupCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxGroupCodeRef(ReferenceType value) {
        this.taxGroupCodeRef = value;
    }

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
     * Gets the value of the paySalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public PaySalesTaxEnum getPaySalesTax() {
        return paySalesTax;
    }

    /**
     * Sets the value of the paySalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public void setPaySalesTax(PaySalesTaxEnum value) {
        this.paySalesTax = value;
    }

    /**
     * Gets the value of the nonTaxableSalesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getNonTaxableSalesTaxCodeRef() {
        return nonTaxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of the nonTaxableSalesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setNonTaxableSalesTaxCodeRef(ReferenceType value) {
        this.nonTaxableSalesTaxCodeRef = value;
    }

    /**
     * Gets the value of the taxableSalesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxableSalesTaxCodeRef() {
        return taxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of the taxableSalesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxableSalesTaxCodeRef(ReferenceType value) {
        this.taxableSalesTaxCodeRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxPrefs that = ((TaxPrefs) object);
        {
            Boolean lhsUsingSalesTax;
            lhsUsingSalesTax = this.isUsingSalesTax();
            Boolean rhsUsingSalesTax;
            rhsUsingSalesTax = that.isUsingSalesTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usingSalesTax", lhsUsingSalesTax), LocatorUtils.property(thatLocator, "usingSalesTax", rhsUsingSalesTax), lhsUsingSalesTax, rhsUsingSalesTax, (this.usingSalesTax!= null), (that.usingSalesTax!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPartnerTaxEnabled;
            lhsPartnerTaxEnabled = this.isPartnerTaxEnabled();
            Boolean rhsPartnerTaxEnabled;
            rhsPartnerTaxEnabled = that.isPartnerTaxEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerTaxEnabled", lhsPartnerTaxEnabled), LocatorUtils.property(thatLocator, "partnerTaxEnabled", rhsPartnerTaxEnabled), lhsPartnerTaxEnabled, rhsPartnerTaxEnabled, (this.partnerTaxEnabled!= null), (that.partnerTaxEnabled!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHideTaxManagement;
            lhsHideTaxManagement = this.isHideTaxManagement();
            Boolean rhsHideTaxManagement;
            rhsHideTaxManagement = that.isHideTaxManagement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hideTaxManagement", lhsHideTaxManagement), LocatorUtils.property(thatLocator, "hideTaxManagement", rhsHideTaxManagement), lhsHideTaxManagement, rhsHideTaxManagement, (this.hideTaxManagement!= null), (that.hideTaxManagement!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxGroupCodeRef;
            lhsTaxGroupCodeRef = this.getTaxGroupCodeRef();
            ReferenceType rhsTaxGroupCodeRef;
            rhsTaxGroupCodeRef = that.getTaxGroupCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxGroupCodeRef", lhsTaxGroupCodeRef), LocatorUtils.property(thatLocator, "taxGroupCodeRef", rhsTaxGroupCodeRef), lhsTaxGroupCodeRef, rhsTaxGroupCodeRef, (this.taxGroupCodeRef!= null), (that.taxGroupCodeRef!= null))) {
                return false;
            }
        }
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
            PaySalesTaxEnum lhsPaySalesTax;
            lhsPaySalesTax = this.getPaySalesTax();
            PaySalesTaxEnum rhsPaySalesTax;
            rhsPaySalesTax = that.getPaySalesTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paySalesTax", lhsPaySalesTax), LocatorUtils.property(thatLocator, "paySalesTax", rhsPaySalesTax), lhsPaySalesTax, rhsPaySalesTax, (this.paySalesTax!= null), (that.paySalesTax!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsNonTaxableSalesTaxCodeRef;
            lhsNonTaxableSalesTaxCodeRef = this.getNonTaxableSalesTaxCodeRef();
            ReferenceType rhsNonTaxableSalesTaxCodeRef;
            rhsNonTaxableSalesTaxCodeRef = that.getNonTaxableSalesTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonTaxableSalesTaxCodeRef", lhsNonTaxableSalesTaxCodeRef), LocatorUtils.property(thatLocator, "nonTaxableSalesTaxCodeRef", rhsNonTaxableSalesTaxCodeRef), lhsNonTaxableSalesTaxCodeRef, rhsNonTaxableSalesTaxCodeRef, (this.nonTaxableSalesTaxCodeRef!= null), (that.nonTaxableSalesTaxCodeRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxableSalesTaxCodeRef;
            lhsTaxableSalesTaxCodeRef = this.getTaxableSalesTaxCodeRef();
            ReferenceType rhsTaxableSalesTaxCodeRef;
            rhsTaxableSalesTaxCodeRef = that.getTaxableSalesTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxableSalesTaxCodeRef", lhsTaxableSalesTaxCodeRef), LocatorUtils.property(thatLocator, "taxableSalesTaxCodeRef", rhsTaxableSalesTaxCodeRef), lhsTaxableSalesTaxCodeRef, rhsTaxableSalesTaxCodeRef, (this.taxableSalesTaxCodeRef!= null), (that.taxableSalesTaxCodeRef!= null))) {
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
            Boolean theUsingSalesTax;
            theUsingSalesTax = this.isUsingSalesTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usingSalesTax", theUsingSalesTax), currentHashCode, theUsingSalesTax, (this.usingSalesTax!= null));
        }
        {
            Boolean thePartnerTaxEnabled;
            thePartnerTaxEnabled = this.isPartnerTaxEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerTaxEnabled", thePartnerTaxEnabled), currentHashCode, thePartnerTaxEnabled, (this.partnerTaxEnabled!= null));
        }
        {
            Boolean theHideTaxManagement;
            theHideTaxManagement = this.isHideTaxManagement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hideTaxManagement", theHideTaxManagement), currentHashCode, theHideTaxManagement, (this.hideTaxManagement!= null));
        }
        {
            ReferenceType theTaxGroupCodeRef;
            theTaxGroupCodeRef = this.getTaxGroupCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxGroupCodeRef", theTaxGroupCodeRef), currentHashCode, theTaxGroupCodeRef, (this.taxGroupCodeRef!= null));
        }
        {
            ReferenceType theTaxRateRef;
            theTaxRateRef = this.getTaxRateRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateRef", theTaxRateRef), currentHashCode, theTaxRateRef, (this.taxRateRef!= null));
        }
        {
            PaySalesTaxEnum thePaySalesTax;
            thePaySalesTax = this.getPaySalesTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paySalesTax", thePaySalesTax), currentHashCode, thePaySalesTax, (this.paySalesTax!= null));
        }
        {
            ReferenceType theNonTaxableSalesTaxCodeRef;
            theNonTaxableSalesTaxCodeRef = this.getNonTaxableSalesTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nonTaxableSalesTaxCodeRef", theNonTaxableSalesTaxCodeRef), currentHashCode, theNonTaxableSalesTaxCodeRef, (this.nonTaxableSalesTaxCodeRef!= null));
        }
        {
            ReferenceType theTaxableSalesTaxCodeRef;
            theTaxableSalesTaxCodeRef = this.getTaxableSalesTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxableSalesTaxCodeRef", theTaxableSalesTaxCodeRef), currentHashCode, theTaxableSalesTaxCodeRef, (this.taxableSalesTaxCodeRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
