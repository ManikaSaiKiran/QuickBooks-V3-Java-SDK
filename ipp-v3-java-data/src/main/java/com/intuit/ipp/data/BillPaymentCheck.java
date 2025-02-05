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
 * <p>Java class for BillPaymentCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPaymentCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PrintStatus" type="{http://schema.intuit.com/finance/v3}PrintStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="CheckDetail" type="{http://schema.intuit.com/finance/v3}CheckPayment" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="BillPaymentCheckEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPaymentCheck", propOrder = {
    "bankAccountRef",
    "printStatus",
    "checkDetail",
    "payeeAddr",
    "billPaymentCheckEx"
})
public class BillPaymentCheck implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BankAccountRef")
    protected ReferenceType bankAccountRef;
    @XmlElement(name = "PrintStatus")
    @XmlSchemaType(name = "string")
    protected PrintStatusEnum printStatus;
    @XmlElement(name = "CheckDetail")
    protected CheckPayment checkDetail;
    @XmlElement(name = "PayeeAddr")
    protected PhysicalAddress payeeAddr;
    @XmlElement(name = "BillPaymentCheckEx")
    protected IntuitAnyType billPaymentCheckEx;

    /**
     * Gets the value of the bankAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getBankAccountRef() {
        return bankAccountRef;
    }

    /**
     * Sets the value of the bankAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setBankAccountRef(ReferenceType value) {
        this.bankAccountRef = value;
    }

    /**
     * Gets the value of the printStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PrintStatusEnum }
     *     
     */
    public PrintStatusEnum getPrintStatus() {
        return printStatus;
    }

    /**
     * Sets the value of the printStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintStatusEnum }
     *     
     */
    public void setPrintStatus(PrintStatusEnum value) {
        this.printStatus = value;
    }

    /**
     * Gets the value of the checkDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPayment }
     *     
     */
    public CheckPayment getCheckDetail() {
        return checkDetail;
    }

    /**
     * Sets the value of the checkDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPayment }
     *     
     */
    public void setCheckDetail(CheckPayment value) {
        this.checkDetail = value;
    }

    /**
     * Gets the value of the payeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPayeeAddr() {
        return payeeAddr;
    }

    /**
     * Sets the value of the payeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPayeeAddr(PhysicalAddress value) {
        this.payeeAddr = value;
    }

    /**
     * Gets the value of the billPaymentCheckEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getBillPaymentCheckEx() {
        return billPaymentCheckEx;
    }

    /**
     * Sets the value of the billPaymentCheckEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setBillPaymentCheckEx(IntuitAnyType value) {
        this.billPaymentCheckEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BillPaymentCheck that = ((BillPaymentCheck) object);
        {
            ReferenceType lhsBankAccountRef;
            lhsBankAccountRef = this.getBankAccountRef();
            ReferenceType rhsBankAccountRef;
            rhsBankAccountRef = that.getBankAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankAccountRef", lhsBankAccountRef), LocatorUtils.property(thatLocator, "bankAccountRef", rhsBankAccountRef), lhsBankAccountRef, rhsBankAccountRef, (this.bankAccountRef!= null), (that.bankAccountRef!= null))) {
                return false;
            }
        }
        {
            PrintStatusEnum lhsPrintStatus;
            lhsPrintStatus = this.getPrintStatus();
            PrintStatusEnum rhsPrintStatus;
            rhsPrintStatus = that.getPrintStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "printStatus", lhsPrintStatus), LocatorUtils.property(thatLocator, "printStatus", rhsPrintStatus), lhsPrintStatus, rhsPrintStatus, (this.printStatus!= null), (that.printStatus!= null))) {
                return false;
            }
        }
        {
            CheckPayment lhsCheckDetail;
            lhsCheckDetail = this.getCheckDetail();
            CheckPayment rhsCheckDetail;
            rhsCheckDetail = that.getCheckDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkDetail", lhsCheckDetail), LocatorUtils.property(thatLocator, "checkDetail", rhsCheckDetail), lhsCheckDetail, rhsCheckDetail, (this.checkDetail!= null), (that.checkDetail!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPayeeAddr;
            lhsPayeeAddr = this.getPayeeAddr();
            PhysicalAddress rhsPayeeAddr;
            rhsPayeeAddr = that.getPayeeAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payeeAddr", lhsPayeeAddr), LocatorUtils.property(thatLocator, "payeeAddr", rhsPayeeAddr), lhsPayeeAddr, rhsPayeeAddr, (this.payeeAddr!= null), (that.payeeAddr!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsBillPaymentCheckEx;
            lhsBillPaymentCheckEx = this.getBillPaymentCheckEx();
            IntuitAnyType rhsBillPaymentCheckEx;
            rhsBillPaymentCheckEx = that.getBillPaymentCheckEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billPaymentCheckEx", lhsBillPaymentCheckEx), LocatorUtils.property(thatLocator, "billPaymentCheckEx", rhsBillPaymentCheckEx), lhsBillPaymentCheckEx, rhsBillPaymentCheckEx, (this.billPaymentCheckEx!= null), (that.billPaymentCheckEx!= null))) {
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
            ReferenceType theBankAccountRef;
            theBankAccountRef = this.getBankAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankAccountRef", theBankAccountRef), currentHashCode, theBankAccountRef, (this.bankAccountRef!= null));
        }
        {
            PrintStatusEnum thePrintStatus;
            thePrintStatus = this.getPrintStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "printStatus", thePrintStatus), currentHashCode, thePrintStatus, (this.printStatus!= null));
        }
        {
            CheckPayment theCheckDetail;
            theCheckDetail = this.getCheckDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkDetail", theCheckDetail), currentHashCode, theCheckDetail, (this.checkDetail!= null));
        }
        {
            PhysicalAddress thePayeeAddr;
            thePayeeAddr = this.getPayeeAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payeeAddr", thePayeeAddr), currentHashCode, thePayeeAddr, (this.payeeAddr!= null));
        }
        {
            IntuitAnyType theBillPaymentCheckEx;
            theBillPaymentCheckEx = this.getBillPaymentCheckEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billPaymentCheckEx", theBillPaymentCheckEx), currentHashCode, theBillPaymentCheckEx, (this.billPaymentCheckEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
