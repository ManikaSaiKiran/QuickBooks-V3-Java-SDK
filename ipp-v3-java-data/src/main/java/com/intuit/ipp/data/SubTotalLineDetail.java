//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 05:01:01 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * 				Description: SubTotalLine detail for a transaction line.
 * 			
 * 
 * <p>Java class for SubTotalLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubTotalLineDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubTotalLineDetail", propOrder = {
    "itemRef",
    "serviceDate"
})
public class SubTotalLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "ServiceDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date serviceDate;

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubTotalLineDetail that = ((SubTotalLineDetail) object);
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
            Date lhsServiceDate;
            lhsServiceDate = this.getServiceDate();
            Date rhsServiceDate;
            rhsServiceDate = that.getServiceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDate", lhsServiceDate), LocatorUtils.property(thatLocator, "serviceDate", rhsServiceDate), lhsServiceDate, rhsServiceDate, (this.serviceDate!= null), (that.serviceDate!= null))) {
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
            Date theServiceDate;
            theServiceDate = this.getServiceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDate", theServiceDate), currentHashCode, theServiceDate, (this.serviceDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
