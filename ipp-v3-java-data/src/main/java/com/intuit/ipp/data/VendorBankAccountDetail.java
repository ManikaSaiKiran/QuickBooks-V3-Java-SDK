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
 * 				Description: Contains Bank Account details to process the batch payment for Vendors. Applicable for AU region only..
 * 			
 * 
 * <p>Java class for VendorBankAccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorBankAccountDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankBranchIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorBankAccountDetail", propOrder = {
    "bankBranchIdentifier",
    "bankAccountNumber",
    "bankAccountName",
    "statementText"
})
public class VendorBankAccountDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BankBranchIdentifier")
    protected String bankBranchIdentifier;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankAccountName")
    protected String bankAccountName;
    @XmlElement(name = "StatementText")
    protected String statementText;

    /**
     * Gets the value of the bankBranchIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchIdentifier() {
        return bankBranchIdentifier;
    }

    /**
     * Sets the value of the bankBranchIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchIdentifier(String value) {
        this.bankBranchIdentifier = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the statementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementText() {
        return statementText;
    }

    /**
     * Sets the value of the statementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementText(String value) {
        this.statementText = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VendorBankAccountDetail that = ((VendorBankAccountDetail) object);
        {
            String lhsBankBranchIdentifier;
            lhsBankBranchIdentifier = this.getBankBranchIdentifier();
            String rhsBankBranchIdentifier;
            rhsBankBranchIdentifier = that.getBankBranchIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankBranchIdentifier", lhsBankBranchIdentifier), LocatorUtils.property(thatLocator, "bankBranchIdentifier", rhsBankBranchIdentifier), lhsBankBranchIdentifier, rhsBankBranchIdentifier, (this.bankBranchIdentifier!= null), (that.bankBranchIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsBankAccountNumber;
            lhsBankAccountNumber = this.getBankAccountNumber();
            String rhsBankAccountNumber;
            rhsBankAccountNumber = that.getBankAccountNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankAccountNumber", lhsBankAccountNumber), LocatorUtils.property(thatLocator, "bankAccountNumber", rhsBankAccountNumber), lhsBankAccountNumber, rhsBankAccountNumber, (this.bankAccountNumber!= null), (that.bankAccountNumber!= null))) {
                return false;
            }
        }
        {
            String lhsBankAccountName;
            lhsBankAccountName = this.getBankAccountName();
            String rhsBankAccountName;
            rhsBankAccountName = that.getBankAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankAccountName", lhsBankAccountName), LocatorUtils.property(thatLocator, "bankAccountName", rhsBankAccountName), lhsBankAccountName, rhsBankAccountName, (this.bankAccountName!= null), (that.bankAccountName!= null))) {
                return false;
            }
        }
        {
            String lhsStatementText;
            lhsStatementText = this.getStatementText();
            String rhsStatementText;
            rhsStatementText = that.getStatementText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statementText", lhsStatementText), LocatorUtils.property(thatLocator, "statementText", rhsStatementText), lhsStatementText, rhsStatementText, (this.statementText!= null), (that.statementText!= null))) {
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
            String theBankBranchIdentifier;
            theBankBranchIdentifier = this.getBankBranchIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankBranchIdentifier", theBankBranchIdentifier), currentHashCode, theBankBranchIdentifier, (this.bankBranchIdentifier!= null));
        }
        {
            String theBankAccountNumber;
            theBankAccountNumber = this.getBankAccountNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankAccountNumber", theBankAccountNumber), currentHashCode, theBankAccountNumber, (this.bankAccountNumber!= null));
        }
        {
            String theBankAccountName;
            theBankAccountName = this.getBankAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankAccountName", theBankAccountName), currentHashCode, theBankAccountName, (this.bankAccountName!= null));
        }
        {
            String theStatementText;
            theStatementText = this.getStatementText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statementText", theStatementText), currentHashCode, theStatementText, (this.statementText!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
