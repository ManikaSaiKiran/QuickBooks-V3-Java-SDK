//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
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
 * 				Product: ALL
 * 				Description: Tax detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for TaxLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PercentBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NetAmountTaxable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxInclusiveAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OverrideDeltaAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TaxLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxLineDetail", propOrder = {
    "taxRateRef",
    "percentBased",
    "taxPercent",
    "netAmountTaxable",
    "taxInclusiveAmount",
    "overrideDeltaAmount",
    "serviceDate",
    "taxLineDetailEx"
})
public class TaxLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "PercentBased")
    protected Boolean percentBased;
    @XmlElement(name = "TaxPercent")
    protected BigDecimal taxPercent;
    @XmlElement(name = "NetAmountTaxable")
    protected BigDecimal netAmountTaxable;
    @XmlElement(name = "TaxInclusiveAmount")
    protected BigDecimal taxInclusiveAmount;
    @XmlElement(name = "OverrideDeltaAmount")
    protected BigDecimal overrideDeltaAmount;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date serviceDate;
    @XmlElement(name = "TaxLineDetailEx")
    protected IntuitAnyType taxLineDetailEx;

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
     * Gets the value of the percentBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentBased() {
        return percentBased;
    }

    /**
     * Sets the value of the percentBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentBased(Boolean value) {
        this.percentBased = value;
    }

    /**
     * Gets the value of the taxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    /**
     * Sets the value of the taxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPercent(BigDecimal value) {
        this.taxPercent = value;
    }

    /**
     * Gets the value of the netAmountTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmountTaxable() {
        return netAmountTaxable;
    }

    /**
     * Sets the value of the netAmountTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmountTaxable(BigDecimal value) {
        this.netAmountTaxable = value;
    }

    /**
     * Gets the value of the taxInclusiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    /**
     * Sets the value of the taxInclusiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxInclusiveAmount(BigDecimal value) {
        this.taxInclusiveAmount = value;
    }

    /**
     * Gets the value of the overrideDeltaAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverrideDeltaAmount() {
        return overrideDeltaAmount;
    }

    /**
     * Sets the value of the overrideDeltaAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverrideDeltaAmount(BigDecimal value) {
        this.overrideDeltaAmount = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(Date value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the taxLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTaxLineDetailEx() {
        return taxLineDetailEx;
    }

    /**
     * Sets the value of the taxLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTaxLineDetailEx(IntuitAnyType value) {
        this.taxLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxLineDetail that = ((TaxLineDetail) object);
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
            Boolean lhsPercentBased;
            lhsPercentBased = this.isPercentBased();
            Boolean rhsPercentBased;
            rhsPercentBased = that.isPercentBased();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentBased", lhsPercentBased), LocatorUtils.property(thatLocator, "percentBased", rhsPercentBased), lhsPercentBased, rhsPercentBased, (this.percentBased!= null), (that.percentBased!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxPercent;
            lhsTaxPercent = this.getTaxPercent();
            BigDecimal rhsTaxPercent;
            rhsTaxPercent = that.getTaxPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxPercent", lhsTaxPercent), LocatorUtils.property(thatLocator, "taxPercent", rhsTaxPercent), lhsTaxPercent, rhsTaxPercent, (this.taxPercent!= null), (that.taxPercent!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNetAmountTaxable;
            lhsNetAmountTaxable = this.getNetAmountTaxable();
            BigDecimal rhsNetAmountTaxable;
            rhsNetAmountTaxable = that.getNetAmountTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netAmountTaxable", lhsNetAmountTaxable), LocatorUtils.property(thatLocator, "netAmountTaxable", rhsNetAmountTaxable), lhsNetAmountTaxable, rhsNetAmountTaxable, (this.netAmountTaxable!= null), (that.netAmountTaxable!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxInclusiveAmount;
            lhsTaxInclusiveAmount = this.getTaxInclusiveAmount();
            BigDecimal rhsTaxInclusiveAmount;
            rhsTaxInclusiveAmount = that.getTaxInclusiveAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmount", lhsTaxInclusiveAmount), LocatorUtils.property(thatLocator, "taxInclusiveAmount", rhsTaxInclusiveAmount), lhsTaxInclusiveAmount, rhsTaxInclusiveAmount, (this.taxInclusiveAmount!= null), (that.taxInclusiveAmount!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsOverrideDeltaAmount;
            lhsOverrideDeltaAmount = this.getOverrideDeltaAmount();
            BigDecimal rhsOverrideDeltaAmount;
            rhsOverrideDeltaAmount = that.getOverrideDeltaAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overrideDeltaAmount", lhsOverrideDeltaAmount), LocatorUtils.property(thatLocator, "overrideDeltaAmount", rhsOverrideDeltaAmount), lhsOverrideDeltaAmount, rhsOverrideDeltaAmount, (this.overrideDeltaAmount!= null), (that.overrideDeltaAmount!= null))) {
                return false;
            }
        }
        {
            Date lhsServiceDate;
            lhsServiceDate = this.getServiceDate();
            Date rhsServiceDate;
            rhsServiceDate = that.getServiceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDate", lhsServiceDate), LocatorUtils.property(thatLocator, "serviceDate", rhsServiceDate), lhsServiceDate, rhsServiceDate, (this.serviceDate!= null), (that.serviceDate!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTaxLineDetailEx;
            lhsTaxLineDetailEx = this.getTaxLineDetailEx();
            IntuitAnyType rhsTaxLineDetailEx;
            rhsTaxLineDetailEx = that.getTaxLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxLineDetailEx", lhsTaxLineDetailEx), LocatorUtils.property(thatLocator, "taxLineDetailEx", rhsTaxLineDetailEx), lhsTaxLineDetailEx, rhsTaxLineDetailEx, (this.taxLineDetailEx!= null), (that.taxLineDetailEx!= null))) {
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
            Boolean thePercentBased;
            thePercentBased = this.isPercentBased();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentBased", thePercentBased), currentHashCode, thePercentBased, (this.percentBased!= null));
        }
        {
            BigDecimal theTaxPercent;
            theTaxPercent = this.getTaxPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxPercent", theTaxPercent), currentHashCode, theTaxPercent, (this.taxPercent!= null));
        }
        {
            BigDecimal theNetAmountTaxable;
            theNetAmountTaxable = this.getNetAmountTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netAmountTaxable", theNetAmountTaxable), currentHashCode, theNetAmountTaxable, (this.netAmountTaxable!= null));
        }
        {
            BigDecimal theTaxInclusiveAmount;
            theTaxInclusiveAmount = this.getTaxInclusiveAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmount", theTaxInclusiveAmount), currentHashCode, theTaxInclusiveAmount, (this.taxInclusiveAmount!= null));
        }
        {
            BigDecimal theOverrideDeltaAmount;
            theOverrideDeltaAmount = this.getOverrideDeltaAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overrideDeltaAmount", theOverrideDeltaAmount), currentHashCode, theOverrideDeltaAmount, (this.overrideDeltaAmount!= null));
        }
        {
            Date theServiceDate;
            theServiceDate = this.getServiceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDate", theServiceDate), currentHashCode, theServiceDate, (this.serviceDate!= null));
        }
        {
            IntuitAnyType theTaxLineDetailEx;
            theTaxLineDetailEx = this.getTaxLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxLineDetailEx", theTaxLineDetailEx), currentHashCode, theTaxLineDetailEx, (this.taxLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
