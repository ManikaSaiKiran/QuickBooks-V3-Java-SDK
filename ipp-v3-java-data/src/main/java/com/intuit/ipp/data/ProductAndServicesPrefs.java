//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
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
 * Defines Product and Services Prefs details
 * 			
 * 
 * <p>Java class for ProductAndServicesPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAndServicesPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InventoryAndPurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityWithPriceAndRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOnHand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UOM" type="{http://schema.intuit.com/finance/v3}UOMFeatureTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="RevenueRecognition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RevenueRecognitionFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAndServicesPrefs", propOrder = {
    "forSales",
    "forPurchase",
    "inventoryAndPurchaseOrder",
    "quantityWithPriceAndRate",
    "quantityOnHand",
    "uom",
    "revenueRecognition",
    "revenueRecognitionFrequency"
})
public class ProductAndServicesPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ForSales")
    protected Boolean forSales;
    @XmlElement(name = "ForPurchase")
    protected Boolean forPurchase;
    @XmlElement(name = "InventoryAndPurchaseOrder")
    protected Boolean inventoryAndPurchaseOrder;
    @XmlElement(name = "QuantityWithPriceAndRate")
    protected Boolean quantityWithPriceAndRate;
    @XmlElement(name = "QuantityOnHand")
    protected Boolean quantityOnHand;
    @XmlElement(name = "UOM")
    @XmlSchemaType(name = "string")
    protected UOMFeatureTypeEnum uom;
    @XmlElement(name = "RevenueRecognition")
    protected Boolean revenueRecognition;
    @XmlElement(name = "RevenueRecognitionFrequency")
    protected String revenueRecognitionFrequency;

    /**
     * Gets the value of the forSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForSales() {
        return forSales;
    }

    /**
     * Sets the value of the forSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForSales(Boolean value) {
        this.forSales = value;
    }

    /**
     * Gets the value of the forPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForPurchase() {
        return forPurchase;
    }

    /**
     * Sets the value of the forPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForPurchase(Boolean value) {
        this.forPurchase = value;
    }

    /**
     * Gets the value of the inventoryAndPurchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryAndPurchaseOrder() {
        return inventoryAndPurchaseOrder;
    }

    /**
     * Sets the value of the inventoryAndPurchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryAndPurchaseOrder(Boolean value) {
        this.inventoryAndPurchaseOrder = value;
    }

    /**
     * Gets the value of the quantityWithPriceAndRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityWithPriceAndRate() {
        return quantityWithPriceAndRate;
    }

    /**
     * Sets the value of the quantityWithPriceAndRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityWithPriceAndRate(Boolean value) {
        this.quantityWithPriceAndRate = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityOnHand(Boolean value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UOMFeatureTypeEnum }
     *     
     */
    public UOMFeatureTypeEnum getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMFeatureTypeEnum }
     *     
     */
    public void setUOM(UOMFeatureTypeEnum value) {
        this.uom = value;
    }

    /**
     * Gets the value of the revenueRecognition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevenueRecognition() {
        return revenueRecognition;
    }

    /**
     * Sets the value of the revenueRecognition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevenueRecognition(Boolean value) {
        this.revenueRecognition = value;
    }

    /**
     * Gets the value of the revenueRecognitionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueRecognitionFrequency() {
        return revenueRecognitionFrequency;
    }

    /**
     * Sets the value of the revenueRecognitionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueRecognitionFrequency(String value) {
        this.revenueRecognitionFrequency = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductAndServicesPrefs that = ((ProductAndServicesPrefs) object);
        {
            Boolean lhsForSales;
            lhsForSales = this.isForSales();
            Boolean rhsForSales;
            rhsForSales = that.isForSales();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forSales", lhsForSales), LocatorUtils.property(thatLocator, "forSales", rhsForSales), lhsForSales, rhsForSales, (this.forSales!= null), (that.forSales!= null))) {
                return false;
            }
        }
        {
            Boolean lhsForPurchase;
            lhsForPurchase = this.isForPurchase();
            Boolean rhsForPurchase;
            rhsForPurchase = that.isForPurchase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forPurchase", lhsForPurchase), LocatorUtils.property(thatLocator, "forPurchase", rhsForPurchase), lhsForPurchase, rhsForPurchase, (this.forPurchase!= null), (that.forPurchase!= null))) {
                return false;
            }
        }
        {
            Boolean lhsInventoryAndPurchaseOrder;
            lhsInventoryAndPurchaseOrder = this.isInventoryAndPurchaseOrder();
            Boolean rhsInventoryAndPurchaseOrder;
            rhsInventoryAndPurchaseOrder = that.isInventoryAndPurchaseOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryAndPurchaseOrder", lhsInventoryAndPurchaseOrder), LocatorUtils.property(thatLocator, "inventoryAndPurchaseOrder", rhsInventoryAndPurchaseOrder), lhsInventoryAndPurchaseOrder, rhsInventoryAndPurchaseOrder, (this.inventoryAndPurchaseOrder!= null), (that.inventoryAndPurchaseOrder!= null))) {
                return false;
            }
        }
        {
            Boolean lhsQuantityWithPriceAndRate;
            lhsQuantityWithPriceAndRate = this.isQuantityWithPriceAndRate();
            Boolean rhsQuantityWithPriceAndRate;
            rhsQuantityWithPriceAndRate = that.isQuantityWithPriceAndRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityWithPriceAndRate", lhsQuantityWithPriceAndRate), LocatorUtils.property(thatLocator, "quantityWithPriceAndRate", rhsQuantityWithPriceAndRate), lhsQuantityWithPriceAndRate, rhsQuantityWithPriceAndRate, (this.quantityWithPriceAndRate!= null), (that.quantityWithPriceAndRate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsQuantityOnHand;
            lhsQuantityOnHand = this.isQuantityOnHand();
            Boolean rhsQuantityOnHand;
            rhsQuantityOnHand = that.isQuantityOnHand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityOnHand", lhsQuantityOnHand), LocatorUtils.property(thatLocator, "quantityOnHand", rhsQuantityOnHand), lhsQuantityOnHand, rhsQuantityOnHand, (this.quantityOnHand!= null), (that.quantityOnHand!= null))) {
                return false;
            }
        }
        {
            UOMFeatureTypeEnum lhsUOM;
            lhsUOM = this.getUOM();
            UOMFeatureTypeEnum rhsUOM;
            rhsUOM = that.getUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uom", lhsUOM), LocatorUtils.property(thatLocator, "uom", rhsUOM), lhsUOM, rhsUOM, (this.uom!= null), (that.uom!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRevenueRecognition;
            lhsRevenueRecognition = this.isRevenueRecognition();
            Boolean rhsRevenueRecognition;
            rhsRevenueRecognition = that.isRevenueRecognition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revenueRecognition", lhsRevenueRecognition), LocatorUtils.property(thatLocator, "revenueRecognition", rhsRevenueRecognition), lhsRevenueRecognition, rhsRevenueRecognition, (this.revenueRecognition!= null), (that.revenueRecognition!= null))) {
                return false;
            }
        }
        {
            String lhsRevenueRecognitionFrequency;
            lhsRevenueRecognitionFrequency = this.getRevenueRecognitionFrequency();
            String rhsRevenueRecognitionFrequency;
            rhsRevenueRecognitionFrequency = that.getRevenueRecognitionFrequency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revenueRecognitionFrequency", lhsRevenueRecognitionFrequency), LocatorUtils.property(thatLocator, "revenueRecognitionFrequency", rhsRevenueRecognitionFrequency), lhsRevenueRecognitionFrequency, rhsRevenueRecognitionFrequency, (this.revenueRecognitionFrequency!= null), (that.revenueRecognitionFrequency!= null))) {
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
            Boolean theForSales;
            theForSales = this.isForSales();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forSales", theForSales), currentHashCode, theForSales, (this.forSales!= null));
        }
        {
            Boolean theForPurchase;
            theForPurchase = this.isForPurchase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forPurchase", theForPurchase), currentHashCode, theForPurchase, (this.forPurchase!= null));
        }
        {
            Boolean theInventoryAndPurchaseOrder;
            theInventoryAndPurchaseOrder = this.isInventoryAndPurchaseOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryAndPurchaseOrder", theInventoryAndPurchaseOrder), currentHashCode, theInventoryAndPurchaseOrder, (this.inventoryAndPurchaseOrder!= null));
        }
        {
            Boolean theQuantityWithPriceAndRate;
            theQuantityWithPriceAndRate = this.isQuantityWithPriceAndRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityWithPriceAndRate", theQuantityWithPriceAndRate), currentHashCode, theQuantityWithPriceAndRate, (this.quantityWithPriceAndRate!= null));
        }
        {
            Boolean theQuantityOnHand;
            theQuantityOnHand = this.isQuantityOnHand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityOnHand", theQuantityOnHand), currentHashCode, theQuantityOnHand, (this.quantityOnHand!= null));
        }
        {
            UOMFeatureTypeEnum theUOM;
            theUOM = this.getUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uom", theUOM), currentHashCode, theUOM, (this.uom!= null));
        }
        {
            Boolean theRevenueRecognition;
            theRevenueRecognition = this.isRevenueRecognition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revenueRecognition", theRevenueRecognition), currentHashCode, theRevenueRecognition, (this.revenueRecognition!= null));
        }
        {
            String theRevenueRecognitionFrequency;
            theRevenueRecognitionFrequency = this.getRevenueRecognitionFrequency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revenueRecognitionFrequency", theRevenueRecognitionFrequency), currentHashCode, theRevenueRecognitionFrequency, (this.revenueRecognitionFrequency!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
