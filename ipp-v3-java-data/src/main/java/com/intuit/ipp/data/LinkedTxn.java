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
 * That minimal subset of transaction information
 * 				which is included on another transaction, so that a client viewing
 * 				the second transaction entity need not make an additional request to
 * 				the service in order to render it in human readable form. (e.g a
 * 				payment needs to refer to an invoice by number)
 * 
 * <p>Java class for LinkedTxn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedTxn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxnId" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/>
 *         &lt;element name="TxnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnLineId" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedTxn", propOrder = {
    "txnId",
    "txnType",
    "txnLineId"
})
public class LinkedTxn implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TxnId")
    protected String txnId;
    @XmlElement(name = "TxnType")
    protected String txnType;
    @XmlElement(name = "TxnLineId")
    protected String txnLineId;

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnId(String value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the txnLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineId() {
        return txnLineId;
    }

    /**
     * Sets the value of the txnLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineId(String value) {
        this.txnLineId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LinkedTxn that = ((LinkedTxn) object);
        {
            String lhsTxnId;
            lhsTxnId = this.getTxnId();
            String rhsTxnId;
            rhsTxnId = that.getTxnId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnId", lhsTxnId), LocatorUtils.property(thatLocator, "txnId", rhsTxnId), lhsTxnId, rhsTxnId, (this.txnId!= null), (that.txnId!= null))) {
                return false;
            }
        }
        {
            String lhsTxnType;
            lhsTxnType = this.getTxnType();
            String rhsTxnType;
            rhsTxnType = that.getTxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnType", lhsTxnType), LocatorUtils.property(thatLocator, "txnType", rhsTxnType), lhsTxnType, rhsTxnType, (this.txnType!= null), (that.txnType!= null))) {
                return false;
            }
        }
        {
            String lhsTxnLineId;
            lhsTxnLineId = this.getTxnLineId();
            String rhsTxnLineId;
            rhsTxnLineId = that.getTxnLineId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnLineId", lhsTxnLineId), LocatorUtils.property(thatLocator, "txnLineId", rhsTxnLineId), lhsTxnLineId, rhsTxnLineId, (this.txnLineId!= null), (that.txnLineId!= null))) {
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
            String theTxnId;
            theTxnId = this.getTxnId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnId", theTxnId), currentHashCode, theTxnId, (this.txnId!= null));
        }
        {
            String theTxnType;
            theTxnType = this.getTxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnType", theTxnType), currentHashCode, theTxnType, (this.txnType!= null));
        }
        {
            String theTxnLineId;
            theTxnLineId = this.getTxnLineId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnLineId", theTxnLineId), currentHashCode, theTxnLineId, (this.txnLineId!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
