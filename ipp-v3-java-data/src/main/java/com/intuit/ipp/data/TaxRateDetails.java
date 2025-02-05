//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * 
 *                 Product: QBO
 *                 Description: TaxRate details                                                     
 *             
 * 
 * <p>Java class for TaxRateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRateDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxRateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxAgencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxApplicableOn" type="{http://schema.intuit.com/finance/v3}TaxRateApplicableOnEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRateDetails", propOrder = {
    "taxRateName",
    "taxRateId",
    "rateValue",
    "taxAgencyId",
    "taxApplicableOn"
})
public class TaxRateDetails implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxRateName")
    protected String taxRateName;
    @XmlElement(name = "TaxRateId")
    protected String taxRateId;
    @XmlElement(name = "RateValue")
    protected BigDecimal rateValue;
    @XmlElement(name = "TaxAgencyId")
    protected String taxAgencyId;
    @XmlElement(name = "TaxApplicableOn")
    @XmlSchemaType(name = "string")
    protected TaxRateApplicableOnEnum taxApplicableOn;

    /**
     * Gets the value of the taxRateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateName() {
        return taxRateName;
    }

    /**
     * Sets the value of the taxRateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateName(String value) {
        this.taxRateName = value;
    }

    /**
     * Gets the value of the taxRateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRateId() {
        return taxRateId;
    }

    /**
     * Sets the value of the taxRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRateId(String value) {
        this.taxRateId = value;
    }

    /**
     * Gets the value of the rateValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateValue() {
        return rateValue;
    }

    /**
     * Sets the value of the rateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateValue(BigDecimal value) {
        this.rateValue = value;
    }

    /**
     * Gets the value of the taxAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAgencyId() {
        return taxAgencyId;
    }

    /**
     * Sets the value of the taxAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAgencyId(String value) {
        this.taxAgencyId = value;
    }

    /**
     * Gets the value of the taxApplicableOn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateApplicableOnEnum }
     *     
     */
    public TaxRateApplicableOnEnum getTaxApplicableOn() {
        return taxApplicableOn;
    }

    /**
     * Sets the value of the taxApplicableOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateApplicableOnEnum }
     *     
     */
    public void setTaxApplicableOn(TaxRateApplicableOnEnum value) {
        this.taxApplicableOn = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxRateDetails that = ((TaxRateDetails) object);
        {
            String lhsTaxRateName;
            lhsTaxRateName = this.getTaxRateName();
            String rhsTaxRateName;
            rhsTaxRateName = that.getTaxRateName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateName", lhsTaxRateName), LocatorUtils.property(thatLocator, "taxRateName", rhsTaxRateName), lhsTaxRateName, rhsTaxRateName, (this.taxRateName!= null), (that.taxRateName!= null))) {
                return false;
            }
        }
        {
            String lhsTaxRateId;
            lhsTaxRateId = this.getTaxRateId();
            String rhsTaxRateId;
            rhsTaxRateId = that.getTaxRateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateId", lhsTaxRateId), LocatorUtils.property(thatLocator, "taxRateId", rhsTaxRateId), lhsTaxRateId, rhsTaxRateId, (this.taxRateId!= null), (that.taxRateId!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRateValue;
            lhsRateValue = this.getRateValue();
            BigDecimal rhsRateValue;
            rhsRateValue = that.getRateValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateValue", lhsRateValue), LocatorUtils.property(thatLocator, "rateValue", rhsRateValue), lhsRateValue, rhsRateValue, (this.rateValue!= null), (that.rateValue!= null))) {
                return false;
            }
        }
        {
            String lhsTaxAgencyId;
            lhsTaxAgencyId = this.getTaxAgencyId();
            String rhsTaxAgencyId;
            rhsTaxAgencyId = that.getTaxAgencyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAgencyId", lhsTaxAgencyId), LocatorUtils.property(thatLocator, "taxAgencyId", rhsTaxAgencyId), lhsTaxAgencyId, rhsTaxAgencyId, (this.taxAgencyId!= null), (that.taxAgencyId!= null))) {
                return false;
            }
        }
        {
            TaxRateApplicableOnEnum lhsTaxApplicableOn;
            lhsTaxApplicableOn = this.getTaxApplicableOn();
            TaxRateApplicableOnEnum rhsTaxApplicableOn;
            rhsTaxApplicableOn = that.getTaxApplicableOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxApplicableOn", lhsTaxApplicableOn), LocatorUtils.property(thatLocator, "taxApplicableOn", rhsTaxApplicableOn), lhsTaxApplicableOn, rhsTaxApplicableOn, (this.taxApplicableOn!= null), (that.taxApplicableOn!= null))) {
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
            String theTaxRateName;
            theTaxRateName = this.getTaxRateName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateName", theTaxRateName), currentHashCode, theTaxRateName, (this.taxRateName!= null));
        }
        {
            String theTaxRateId;
            theTaxRateId = this.getTaxRateId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateId", theTaxRateId), currentHashCode, theTaxRateId, (this.taxRateId!= null));
        }
        {
            BigDecimal theRateValue;
            theRateValue = this.getRateValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateValue", theRateValue), currentHashCode, theRateValue, (this.rateValue!= null));
        }
        {
            String theTaxAgencyId;
            theTaxAgencyId = this.getTaxAgencyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAgencyId", theTaxAgencyId), currentHashCode, theTaxAgencyId, (this.taxAgencyId!= null));
        }
        {
            TaxRateApplicableOnEnum theTaxApplicableOn;
            theTaxApplicableOn = this.getTaxApplicableOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxApplicableOn", theTaxApplicableOn), currentHashCode, theTaxApplicableOn, (this.taxApplicableOn!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
