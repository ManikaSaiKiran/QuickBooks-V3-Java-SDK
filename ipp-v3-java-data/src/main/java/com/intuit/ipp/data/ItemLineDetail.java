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
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * 				Product: ALL
 * 				Description: Information about the
 * 				goods sold: what is sold, how much/many and for what price.
 * 			
 * 
 * <p>Java class for ItemLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="UnitCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="RatePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="PriceLevelRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="MarkupInfo" type="{http://schema.intuit.com/finance/v3}MarkupInfo" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UOMRef" type="{http://schema.intuit.com/finance/v3}UOMRef" minOccurs="0"/&gt;
 *         &lt;element name="ItemAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="InventorySiteRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxClassificationRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemLineDetail", propOrder = {
    "itemRef",
    "classRef",
    "unitPrice",
    "unitCostPrice",
    "ratePercent",
    "priceLevelRef",
    "markupInfo",
    "qty",
    "uomRef",
    "itemAccountRef",
    "inventorySiteRef",
    "taxCodeRef",
    "taxClassificationRef"
})
@XmlSeeAlso({
    ItemBasedExpenseLineDetail.class,
    SalesItemLineDetail.class,
    ReimburseLineDetail.class
})
public abstract class ItemLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "UnitCostPrice")
    protected BigDecimal unitCostPrice;
    @XmlElement(name = "RatePercent")
    protected BigDecimal ratePercent;
    @XmlElement(name = "PriceLevelRef")
    protected ReferenceType priceLevelRef;
    @XmlElement(name = "MarkupInfo")
    protected MarkupInfo markupInfo;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UOMRef")
    protected UOMRef uomRef;
    @XmlElement(name = "ItemAccountRef")
    protected ReferenceType itemAccountRef;
    @XmlElement(name = "InventorySiteRef")
    protected ReferenceType inventorySiteRef;
    @XmlElement(name = "TaxCodeRef")
    protected ReferenceType taxCodeRef;
    @XmlElement(name = "TaxClassificationRef")
    protected ReferenceType taxClassificationRef;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * Sets the value of the unitCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCostPrice(BigDecimal value) {
        this.unitCostPrice = value;
    }

    /**
     * Gets the value of the ratePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRatePercent() {
        return ratePercent;
    }

    /**
     * Sets the value of the ratePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRatePercent(BigDecimal value) {
        this.ratePercent = value;
    }

    /**
     * Gets the value of the priceLevelRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    /**
     * Sets the value of the priceLevelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPriceLevelRef(ReferenceType value) {
        this.priceLevelRef = value;
    }

    /**
     * Gets the value of the markupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MarkupInfo }
     *     
     */
    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    /**
     * Sets the value of the markupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkupInfo }
     *     
     */
    public void setMarkupInfo(MarkupInfo value) {
        this.markupInfo = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the uomRef property.
     * 
     * @return
     *     possible object is
     *     {@link UOMRef }
     *     
     */
    public UOMRef getUOMRef() {
        return uomRef;
    }

    /**
     * Sets the value of the uomRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMRef }
     *     
     */
    public void setUOMRef(UOMRef value) {
        this.uomRef = value;
    }

    /**
     * Gets the value of the itemAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    /**
     * Sets the value of the itemAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemAccountRef(ReferenceType value) {
        this.itemAccountRef = value;
    }

    /**
     * Gets the value of the inventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    /**
     * Sets the value of the inventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setInventorySiteRef(ReferenceType value) {
        this.inventorySiteRef = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    /**
     * Sets the value of the taxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxCodeRef(ReferenceType value) {
        this.taxCodeRef = value;
    }

    /**
     * Gets the value of the taxClassificationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    /**
     * Sets the value of the taxClassificationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxClassificationRef(ReferenceType value) {
        this.taxClassificationRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemLineDetail that = ((ItemLineDetail) object);
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef, (this.itemRef!= null), (that.itemRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            BigDecimal rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUnitCostPrice;
            lhsUnitCostPrice = this.getUnitCostPrice();
            BigDecimal rhsUnitCostPrice;
            rhsUnitCostPrice = that.getUnitCostPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCostPrice", lhsUnitCostPrice), LocatorUtils.property(thatLocator, "unitCostPrice", rhsUnitCostPrice), lhsUnitCostPrice, rhsUnitCostPrice, (this.unitCostPrice!= null), (that.unitCostPrice!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRatePercent;
            lhsRatePercent = this.getRatePercent();
            BigDecimal rhsRatePercent;
            rhsRatePercent = that.getRatePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ratePercent", lhsRatePercent), LocatorUtils.property(thatLocator, "ratePercent", rhsRatePercent), lhsRatePercent, rhsRatePercent, (this.ratePercent!= null), (that.ratePercent!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsPriceLevelRef;
            lhsPriceLevelRef = this.getPriceLevelRef();
            ReferenceType rhsPriceLevelRef;
            rhsPriceLevelRef = that.getPriceLevelRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelRef", lhsPriceLevelRef), LocatorUtils.property(thatLocator, "priceLevelRef", rhsPriceLevelRef), lhsPriceLevelRef, rhsPriceLevelRef, (this.priceLevelRef!= null), (that.priceLevelRef!= null))) {
                return false;
            }
        }
        {
            MarkupInfo lhsMarkupInfo;
            lhsMarkupInfo = this.getMarkupInfo();
            MarkupInfo rhsMarkupInfo;
            rhsMarkupInfo = that.getMarkupInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markupInfo", lhsMarkupInfo), LocatorUtils.property(thatLocator, "markupInfo", rhsMarkupInfo), lhsMarkupInfo, rhsMarkupInfo, (this.markupInfo!= null), (that.markupInfo!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsQty;
            lhsQty = this.getQty();
            BigDecimal rhsQty;
            rhsQty = that.getQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qty", lhsQty), LocatorUtils.property(thatLocator, "qty", rhsQty), lhsQty, rhsQty, (this.qty!= null), (that.qty!= null))) {
                return false;
            }
        }
        {
            UOMRef lhsUOMRef;
            lhsUOMRef = this.getUOMRef();
            UOMRef rhsUOMRef;
            rhsUOMRef = that.getUOMRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomRef", lhsUOMRef), LocatorUtils.property(thatLocator, "uomRef", rhsUOMRef), lhsUOMRef, rhsUOMRef, (this.uomRef!= null), (that.uomRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsItemAccountRef;
            lhsItemAccountRef = this.getItemAccountRef();
            ReferenceType rhsItemAccountRef;
            rhsItemAccountRef = that.getItemAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemAccountRef", lhsItemAccountRef), LocatorUtils.property(thatLocator, "itemAccountRef", rhsItemAccountRef), lhsItemAccountRef, rhsItemAccountRef, (this.itemAccountRef!= null), (that.itemAccountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsInventorySiteRef;
            lhsInventorySiteRef = this.getInventorySiteRef();
            ReferenceType rhsInventorySiteRef;
            rhsInventorySiteRef = that.getInventorySiteRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventorySiteRef", lhsInventorySiteRef), LocatorUtils.property(thatLocator, "inventorySiteRef", rhsInventorySiteRef), lhsInventorySiteRef, rhsInventorySiteRef, (this.inventorySiteRef!= null), (that.inventorySiteRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxCodeRef;
            lhsTaxCodeRef = this.getTaxCodeRef();
            ReferenceType rhsTaxCodeRef;
            rhsTaxCodeRef = that.getTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeRef", lhsTaxCodeRef), LocatorUtils.property(thatLocator, "taxCodeRef", rhsTaxCodeRef), lhsTaxCodeRef, rhsTaxCodeRef, (this.taxCodeRef!= null), (that.taxCodeRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxClassificationRef;
            lhsTaxClassificationRef = this.getTaxClassificationRef();
            ReferenceType rhsTaxClassificationRef;
            rhsTaxClassificationRef = that.getTaxClassificationRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxClassificationRef", lhsTaxClassificationRef), LocatorUtils.property(thatLocator, "taxClassificationRef", rhsTaxClassificationRef), lhsTaxClassificationRef, rhsTaxClassificationRef, (this.taxClassificationRef!= null), (that.taxClassificationRef!= null))) {
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
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef, (this.itemRef!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            BigDecimal theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
        }
        {
            BigDecimal theUnitCostPrice;
            theUnitCostPrice = this.getUnitCostPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCostPrice", theUnitCostPrice), currentHashCode, theUnitCostPrice, (this.unitCostPrice!= null));
        }
        {
            BigDecimal theRatePercent;
            theRatePercent = this.getRatePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ratePercent", theRatePercent), currentHashCode, theRatePercent, (this.ratePercent!= null));
        }
        {
            ReferenceType thePriceLevelRef;
            thePriceLevelRef = this.getPriceLevelRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelRef", thePriceLevelRef), currentHashCode, thePriceLevelRef, (this.priceLevelRef!= null));
        }
        {
            MarkupInfo theMarkupInfo;
            theMarkupInfo = this.getMarkupInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markupInfo", theMarkupInfo), currentHashCode, theMarkupInfo, (this.markupInfo!= null));
        }
        {
            BigDecimal theQty;
            theQty = this.getQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qty", theQty), currentHashCode, theQty, (this.qty!= null));
        }
        {
            UOMRef theUOMRef;
            theUOMRef = this.getUOMRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomRef", theUOMRef), currentHashCode, theUOMRef, (this.uomRef!= null));
        }
        {
            ReferenceType theItemAccountRef;
            theItemAccountRef = this.getItemAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemAccountRef", theItemAccountRef), currentHashCode, theItemAccountRef, (this.itemAccountRef!= null));
        }
        {
            ReferenceType theInventorySiteRef;
            theInventorySiteRef = this.getInventorySiteRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventorySiteRef", theInventorySiteRef), currentHashCode, theInventorySiteRef, (this.inventorySiteRef!= null));
        }
        {
            ReferenceType theTaxCodeRef;
            theTaxCodeRef = this.getTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeRef", theTaxCodeRef), currentHashCode, theTaxCodeRef, (this.taxCodeRef!= null));
        }
        {
            ReferenceType theTaxClassificationRef;
            theTaxClassificationRef = this.getTaxClassificationRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxClassificationRef", theTaxClassificationRef), currentHashCode, theTaxClassificationRef, (this.taxClassificationRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
