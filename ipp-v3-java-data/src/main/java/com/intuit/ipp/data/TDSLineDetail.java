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
 * 				Product: QBO
 * 				Description: TDS line detail for the
 * 				transaction.
 * 			
 * 
 * <p>Java class for TDSLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDSAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TDSSectionTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TDSLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSLineDetail", propOrder = {
    "tdsAccountRef",
    "tdsSectionTypeId",
    "tdsLineDetailEx"
})
public class TDSLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TDSAccountRef")
    protected ReferenceType tdsAccountRef;
    @XmlElement(name = "TDSSectionTypeId")
    protected Integer tdsSectionTypeId;
    @XmlElement(name = "TDSLineDetailEx")
    protected IntuitAnyType tdsLineDetailEx;

    /**
     * Gets the value of the tdsAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTDSAccountRef() {
        return tdsAccountRef;
    }

    /**
     * Sets the value of the tdsAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTDSAccountRef(ReferenceType value) {
        this.tdsAccountRef = value;
    }

    /**
     * Gets the value of the tdsSectionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTDSSectionTypeId() {
        return tdsSectionTypeId;
    }

    /**
     * Sets the value of the tdsSectionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTDSSectionTypeId(Integer value) {
        this.tdsSectionTypeId = value;
    }

    /**
     * Gets the value of the tdsLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTDSLineDetailEx() {
        return tdsLineDetailEx;
    }

    /**
     * Sets the value of the tdsLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTDSLineDetailEx(IntuitAnyType value) {
        this.tdsLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TDSLineDetail that = ((TDSLineDetail) object);
        {
            ReferenceType lhsTDSAccountRef;
            lhsTDSAccountRef = this.getTDSAccountRef();
            ReferenceType rhsTDSAccountRef;
            rhsTDSAccountRef = that.getTDSAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsAccountRef", lhsTDSAccountRef), LocatorUtils.property(thatLocator, "tdsAccountRef", rhsTDSAccountRef), lhsTDSAccountRef, rhsTDSAccountRef, (this.tdsAccountRef!= null), (that.tdsAccountRef!= null))) {
                return false;
            }
        }
        {
            Integer lhsTDSSectionTypeId;
            lhsTDSSectionTypeId = this.getTDSSectionTypeId();
            Integer rhsTDSSectionTypeId;
            rhsTDSSectionTypeId = that.getTDSSectionTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsSectionTypeId", lhsTDSSectionTypeId), LocatorUtils.property(thatLocator, "tdsSectionTypeId", rhsTDSSectionTypeId), lhsTDSSectionTypeId, rhsTDSSectionTypeId, (this.tdsSectionTypeId!= null), (that.tdsSectionTypeId!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTDSLineDetailEx;
            lhsTDSLineDetailEx = this.getTDSLineDetailEx();
            IntuitAnyType rhsTDSLineDetailEx;
            rhsTDSLineDetailEx = that.getTDSLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsLineDetailEx", lhsTDSLineDetailEx), LocatorUtils.property(thatLocator, "tdsLineDetailEx", rhsTDSLineDetailEx), lhsTDSLineDetailEx, rhsTDSLineDetailEx, (this.tdsLineDetailEx!= null), (that.tdsLineDetailEx!= null))) {
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
            ReferenceType theTDSAccountRef;
            theTDSAccountRef = this.getTDSAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsAccountRef", theTDSAccountRef), currentHashCode, theTDSAccountRef, (this.tdsAccountRef!= null));
        }
        {
            Integer theTDSSectionTypeId;
            theTDSSectionTypeId = this.getTDSSectionTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsSectionTypeId", theTDSSectionTypeId), currentHashCode, theTDSSectionTypeId, (this.tdsSectionTypeId!= null));
        }
        {
            IntuitAnyType theTDSLineDetailEx;
            theTDSLineDetailEx = this.getTDSLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsLineDetailEx", theTDSLineDetailEx), currentHashCode, theTDSLineDetailEx, (this.tdsLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
