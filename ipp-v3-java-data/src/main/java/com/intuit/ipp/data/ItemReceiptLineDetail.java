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
 * 
 * 				Product: ALL
 * 				Description: ItemReceipt detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for ItemReceiptLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReceiptLineDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemReceiptLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReceiptLineDetail", propOrder = {
    "itemReceiptLineDetailEx"
})
public class ItemReceiptLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemReceiptLineDetailEx")
    protected IntuitAnyType itemReceiptLineDetailEx;

    /**
     * Gets the value of the itemReceiptLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getItemReceiptLineDetailEx() {
        return itemReceiptLineDetailEx;
    }

    /**
     * Sets the value of the itemReceiptLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setItemReceiptLineDetailEx(IntuitAnyType value) {
        this.itemReceiptLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemReceiptLineDetail that = ((ItemReceiptLineDetail) object);
        {
            IntuitAnyType lhsItemReceiptLineDetailEx;
            lhsItemReceiptLineDetailEx = this.getItemReceiptLineDetailEx();
            IntuitAnyType rhsItemReceiptLineDetailEx;
            rhsItemReceiptLineDetailEx = that.getItemReceiptLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemReceiptLineDetailEx", lhsItemReceiptLineDetailEx), LocatorUtils.property(thatLocator, "itemReceiptLineDetailEx", rhsItemReceiptLineDetailEx), lhsItemReceiptLineDetailEx, rhsItemReceiptLineDetailEx, (this.itemReceiptLineDetailEx!= null), (that.itemReceiptLineDetailEx!= null))) {
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
            IntuitAnyType theItemReceiptLineDetailEx;
            theItemReceiptLineDetailEx = this.getItemReceiptLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemReceiptLineDetailEx", theItemReceiptLineDetailEx), currentHashCode, theItemReceiptLineDetailEx, (this.itemReceiptLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
