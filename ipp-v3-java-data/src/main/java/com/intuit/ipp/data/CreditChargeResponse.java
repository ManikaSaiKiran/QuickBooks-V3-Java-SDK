//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
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
 * 				Description: Holds credit-card transaction response information from a merchant account service, but not any credit card or payment request information - see CreditChargeInfo.
 * 			
 * 
 * <p>Java class for CreditChargeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditChargeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CCProcessor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CCTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schema.intuit.com/finance/v3}CCPaymentStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantAcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardSecurityCodeMatch" type="{http://schema.intuit.com/finance/v3}CCSecurityCodeMatchEnum" minOccurs="0"/&gt;
 *         &lt;element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvsStreet" type="{http://schema.intuit.com/finance/v3}CCAVSMatchEnum" minOccurs="0"/&gt;
 *         &lt;element name="AvsZip" type="{http://schema.intuit.com/finance/v3}CCAVSMatchEnum" minOccurs="0"/&gt;
 *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReconBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentGroupingCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxnAuthorizationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TxnAuthorizationStamp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClientTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditChargeResponseEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditChargeResponse", propOrder = {
    "ccProcessor",
    "ccTransId",
    "status",
    "resultCode",
    "resultMsg",
    "merchantAcctNum",
    "cardSecurityCodeMatch",
    "authCode",
    "avsStreet",
    "avsZip",
    "securityCode",
    "reconBatchId",
    "paymentGroupingCode",
    "txnAuthorizationTime",
    "txnAuthorizationStamp",
    "clientTransID",
    "creditChargeResponseEx"
})
public class CreditChargeResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CCProcessor")
    protected String ccProcessor;
    @XmlElement(name = "CCTransId")
    protected String ccTransId;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected CCPaymentStatusEnum status;
    @XmlElement(name = "ResultCode")
    protected Integer resultCode;
    @XmlElement(name = "ResultMsg")
    protected String resultMsg;
    @XmlElement(name = "MerchantAcctNum")
    protected String merchantAcctNum;
    @XmlElement(name = "CardSecurityCodeMatch")
    @XmlSchemaType(name = "string")
    protected CCSecurityCodeMatchEnum cardSecurityCodeMatch;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "AvsStreet")
    @XmlSchemaType(name = "string")
    protected CCAVSMatchEnum avsStreet;
    @XmlElement(name = "AvsZip")
    @XmlSchemaType(name = "string")
    protected CCAVSMatchEnum avsZip;
    @XmlElement(name = "SecurityCode")
    protected String securityCode;
    @XmlElement(name = "ReconBatchId")
    protected String reconBatchId;
    @XmlElement(name = "PaymentGroupingCode")
    protected Integer paymentGroupingCode;
    @XmlElement(name = "TxnAuthorizationTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date txnAuthorizationTime;
    @XmlElement(name = "TxnAuthorizationStamp")
    protected Integer txnAuthorizationStamp;
    @XmlElement(name = "ClientTransID")
    protected String clientTransID;
    @XmlElement(name = "CreditChargeResponseEx")
    protected IntuitAnyType creditChargeResponseEx;

    /**
     * Gets the value of the ccProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCProcessor() {
        return ccProcessor;
    }

    /**
     * Sets the value of the ccProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCProcessor(String value) {
        this.ccProcessor = value;
    }

    /**
     * Gets the value of the ccTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTransId() {
        return ccTransId;
    }

    /**
     * Sets the value of the ccTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTransId(String value) {
        this.ccTransId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CCPaymentStatusEnum }
     *     
     */
    public CCPaymentStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPaymentStatusEnum }
     *     
     */
    public void setStatus(CCPaymentStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode(Integer value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsg(String value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the merchantAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAcctNum() {
        return merchantAcctNum;
    }

    /**
     * Sets the value of the merchantAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAcctNum(String value) {
        this.merchantAcctNum = value;
    }

    /**
     * Gets the value of the cardSecurityCodeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link CCSecurityCodeMatchEnum }
     *     
     */
    public CCSecurityCodeMatchEnum getCardSecurityCodeMatch() {
        return cardSecurityCodeMatch;
    }

    /**
     * Sets the value of the cardSecurityCodeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSecurityCodeMatchEnum }
     *     
     */
    public void setCardSecurityCodeMatch(CCSecurityCodeMatchEnum value) {
        this.cardSecurityCodeMatch = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the avsStreet property.
     * 
     * @return
     *     possible object is
     *     {@link CCAVSMatchEnum }
     *     
     */
    public CCAVSMatchEnum getAvsStreet() {
        return avsStreet;
    }

    /**
     * Sets the value of the avsStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAVSMatchEnum }
     *     
     */
    public void setAvsStreet(CCAVSMatchEnum value) {
        this.avsStreet = value;
    }

    /**
     * Gets the value of the avsZip property.
     * 
     * @return
     *     possible object is
     *     {@link CCAVSMatchEnum }
     *     
     */
    public CCAVSMatchEnum getAvsZip() {
        return avsZip;
    }

    /**
     * Sets the value of the avsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAVSMatchEnum }
     *     
     */
    public void setAvsZip(CCAVSMatchEnum value) {
        this.avsZip = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the reconBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconBatchId() {
        return reconBatchId;
    }

    /**
     * Sets the value of the reconBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconBatchId(String value) {
        this.reconBatchId = value;
    }

    /**
     * Gets the value of the paymentGroupingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentGroupingCode() {
        return paymentGroupingCode;
    }

    /**
     * Sets the value of the paymentGroupingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentGroupingCode(Integer value) {
        this.paymentGroupingCode = value;
    }

    /**
     * Gets the value of the txnAuthorizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxnAuthorizationTime() {
        return txnAuthorizationTime;
    }

    /**
     * Sets the value of the txnAuthorizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnAuthorizationTime(Date value) {
        this.txnAuthorizationTime = value;
    }

    /**
     * Gets the value of the txnAuthorizationStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxnAuthorizationStamp() {
        return txnAuthorizationStamp;
    }

    /**
     * Sets the value of the txnAuthorizationStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxnAuthorizationStamp(Integer value) {
        this.txnAuthorizationStamp = value;
    }

    /**
     * Gets the value of the clientTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransID() {
        return clientTransID;
    }

    /**
     * Sets the value of the clientTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransID(String value) {
        this.clientTransID = value;
    }

    /**
     * Gets the value of the creditChargeResponseEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getCreditChargeResponseEx() {
        return creditChargeResponseEx;
    }

    /**
     * Sets the value of the creditChargeResponseEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setCreditChargeResponseEx(IntuitAnyType value) {
        this.creditChargeResponseEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditChargeResponse that = ((CreditChargeResponse) object);
        {
            String lhsCCProcessor;
            lhsCCProcessor = this.getCCProcessor();
            String rhsCCProcessor;
            rhsCCProcessor = that.getCCProcessor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccProcessor", lhsCCProcessor), LocatorUtils.property(thatLocator, "ccProcessor", rhsCCProcessor), lhsCCProcessor, rhsCCProcessor, (this.ccProcessor!= null), (that.ccProcessor!= null))) {
                return false;
            }
        }
        {
            String lhsCCTransId;
            lhsCCTransId = this.getCCTransId();
            String rhsCCTransId;
            rhsCCTransId = that.getCCTransId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccTransId", lhsCCTransId), LocatorUtils.property(thatLocator, "ccTransId", rhsCCTransId), lhsCCTransId, rhsCCTransId, (this.ccTransId!= null), (that.ccTransId!= null))) {
                return false;
            }
        }
        {
            CCPaymentStatusEnum lhsStatus;
            lhsStatus = this.getStatus();
            CCPaymentStatusEnum rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Integer lhsResultCode;
            lhsResultCode = this.getResultCode();
            Integer rhsResultCode;
            rhsResultCode = that.getResultCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultCode", lhsResultCode), LocatorUtils.property(thatLocator, "resultCode", rhsResultCode), lhsResultCode, rhsResultCode, (this.resultCode!= null), (that.resultCode!= null))) {
                return false;
            }
        }
        {
            String lhsResultMsg;
            lhsResultMsg = this.getResultMsg();
            String rhsResultMsg;
            rhsResultMsg = that.getResultMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultMsg", lhsResultMsg), LocatorUtils.property(thatLocator, "resultMsg", rhsResultMsg), lhsResultMsg, rhsResultMsg, (this.resultMsg!= null), (that.resultMsg!= null))) {
                return false;
            }
        }
        {
            String lhsMerchantAcctNum;
            lhsMerchantAcctNum = this.getMerchantAcctNum();
            String rhsMerchantAcctNum;
            rhsMerchantAcctNum = that.getMerchantAcctNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "merchantAcctNum", lhsMerchantAcctNum), LocatorUtils.property(thatLocator, "merchantAcctNum", rhsMerchantAcctNum), lhsMerchantAcctNum, rhsMerchantAcctNum, (this.merchantAcctNum!= null), (that.merchantAcctNum!= null))) {
                return false;
            }
        }
        {
            CCSecurityCodeMatchEnum lhsCardSecurityCodeMatch;
            lhsCardSecurityCodeMatch = this.getCardSecurityCodeMatch();
            CCSecurityCodeMatchEnum rhsCardSecurityCodeMatch;
            rhsCardSecurityCodeMatch = that.getCardSecurityCodeMatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardSecurityCodeMatch", lhsCardSecurityCodeMatch), LocatorUtils.property(thatLocator, "cardSecurityCodeMatch", rhsCardSecurityCodeMatch), lhsCardSecurityCodeMatch, rhsCardSecurityCodeMatch, (this.cardSecurityCodeMatch!= null), (that.cardSecurityCodeMatch!= null))) {
                return false;
            }
        }
        {
            String lhsAuthCode;
            lhsAuthCode = this.getAuthCode();
            String rhsAuthCode;
            rhsAuthCode = that.getAuthCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authCode", lhsAuthCode), LocatorUtils.property(thatLocator, "authCode", rhsAuthCode), lhsAuthCode, rhsAuthCode, (this.authCode!= null), (that.authCode!= null))) {
                return false;
            }
        }
        {
            CCAVSMatchEnum lhsAvsStreet;
            lhsAvsStreet = this.getAvsStreet();
            CCAVSMatchEnum rhsAvsStreet;
            rhsAvsStreet = that.getAvsStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avsStreet", lhsAvsStreet), LocatorUtils.property(thatLocator, "avsStreet", rhsAvsStreet), lhsAvsStreet, rhsAvsStreet, (this.avsStreet!= null), (that.avsStreet!= null))) {
                return false;
            }
        }
        {
            CCAVSMatchEnum lhsAvsZip;
            lhsAvsZip = this.getAvsZip();
            CCAVSMatchEnum rhsAvsZip;
            rhsAvsZip = that.getAvsZip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avsZip", lhsAvsZip), LocatorUtils.property(thatLocator, "avsZip", rhsAvsZip), lhsAvsZip, rhsAvsZip, (this.avsZip!= null), (that.avsZip!= null))) {
                return false;
            }
        }
        {
            String lhsSecurityCode;
            lhsSecurityCode = this.getSecurityCode();
            String rhsSecurityCode;
            rhsSecurityCode = that.getSecurityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityCode", lhsSecurityCode), LocatorUtils.property(thatLocator, "securityCode", rhsSecurityCode), lhsSecurityCode, rhsSecurityCode, (this.securityCode!= null), (that.securityCode!= null))) {
                return false;
            }
        }
        {
            String lhsReconBatchId;
            lhsReconBatchId = this.getReconBatchId();
            String rhsReconBatchId;
            rhsReconBatchId = that.getReconBatchId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reconBatchId", lhsReconBatchId), LocatorUtils.property(thatLocator, "reconBatchId", rhsReconBatchId), lhsReconBatchId, rhsReconBatchId, (this.reconBatchId!= null), (that.reconBatchId!= null))) {
                return false;
            }
        }
        {
            Integer lhsPaymentGroupingCode;
            lhsPaymentGroupingCode = this.getPaymentGroupingCode();
            Integer rhsPaymentGroupingCode;
            rhsPaymentGroupingCode = that.getPaymentGroupingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentGroupingCode", lhsPaymentGroupingCode), LocatorUtils.property(thatLocator, "paymentGroupingCode", rhsPaymentGroupingCode), lhsPaymentGroupingCode, rhsPaymentGroupingCode, (this.paymentGroupingCode!= null), (that.paymentGroupingCode!= null))) {
                return false;
            }
        }
        {
            Date lhsTxnAuthorizationTime;
            lhsTxnAuthorizationTime = this.getTxnAuthorizationTime();
            Date rhsTxnAuthorizationTime;
            rhsTxnAuthorizationTime = that.getTxnAuthorizationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnAuthorizationTime", lhsTxnAuthorizationTime), LocatorUtils.property(thatLocator, "txnAuthorizationTime", rhsTxnAuthorizationTime), lhsTxnAuthorizationTime, rhsTxnAuthorizationTime, (this.txnAuthorizationTime!= null), (that.txnAuthorizationTime!= null))) {
                return false;
            }
        }
        {
            Integer lhsTxnAuthorizationStamp;
            lhsTxnAuthorizationStamp = this.getTxnAuthorizationStamp();
            Integer rhsTxnAuthorizationStamp;
            rhsTxnAuthorizationStamp = that.getTxnAuthorizationStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnAuthorizationStamp", lhsTxnAuthorizationStamp), LocatorUtils.property(thatLocator, "txnAuthorizationStamp", rhsTxnAuthorizationStamp), lhsTxnAuthorizationStamp, rhsTxnAuthorizationStamp, (this.txnAuthorizationStamp!= null), (that.txnAuthorizationStamp!= null))) {
                return false;
            }
        }
        {
            String lhsClientTransID;
            lhsClientTransID = this.getClientTransID();
            String rhsClientTransID;
            rhsClientTransID = that.getClientTransID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientTransID", lhsClientTransID), LocatorUtils.property(thatLocator, "clientTransID", rhsClientTransID), lhsClientTransID, rhsClientTransID, (this.clientTransID!= null), (that.clientTransID!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsCreditChargeResponseEx;
            lhsCreditChargeResponseEx = this.getCreditChargeResponseEx();
            IntuitAnyType rhsCreditChargeResponseEx;
            rhsCreditChargeResponseEx = that.getCreditChargeResponseEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditChargeResponseEx", lhsCreditChargeResponseEx), LocatorUtils.property(thatLocator, "creditChargeResponseEx", rhsCreditChargeResponseEx), lhsCreditChargeResponseEx, rhsCreditChargeResponseEx, (this.creditChargeResponseEx!= null), (that.creditChargeResponseEx!= null))) {
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
            String theCCProcessor;
            theCCProcessor = this.getCCProcessor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccProcessor", theCCProcessor), currentHashCode, theCCProcessor, (this.ccProcessor!= null));
        }
        {
            String theCCTransId;
            theCCTransId = this.getCCTransId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccTransId", theCCTransId), currentHashCode, theCCTransId, (this.ccTransId!= null));
        }
        {
            CCPaymentStatusEnum theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            Integer theResultCode;
            theResultCode = this.getResultCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultCode", theResultCode), currentHashCode, theResultCode, (this.resultCode!= null));
        }
        {
            String theResultMsg;
            theResultMsg = this.getResultMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultMsg", theResultMsg), currentHashCode, theResultMsg, (this.resultMsg!= null));
        }
        {
            String theMerchantAcctNum;
            theMerchantAcctNum = this.getMerchantAcctNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "merchantAcctNum", theMerchantAcctNum), currentHashCode, theMerchantAcctNum, (this.merchantAcctNum!= null));
        }
        {
            CCSecurityCodeMatchEnum theCardSecurityCodeMatch;
            theCardSecurityCodeMatch = this.getCardSecurityCodeMatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardSecurityCodeMatch", theCardSecurityCodeMatch), currentHashCode, theCardSecurityCodeMatch, (this.cardSecurityCodeMatch!= null));
        }
        {
            String theAuthCode;
            theAuthCode = this.getAuthCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authCode", theAuthCode), currentHashCode, theAuthCode, (this.authCode!= null));
        }
        {
            CCAVSMatchEnum theAvsStreet;
            theAvsStreet = this.getAvsStreet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avsStreet", theAvsStreet), currentHashCode, theAvsStreet, (this.avsStreet!= null));
        }
        {
            CCAVSMatchEnum theAvsZip;
            theAvsZip = this.getAvsZip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avsZip", theAvsZip), currentHashCode, theAvsZip, (this.avsZip!= null));
        }
        {
            String theSecurityCode;
            theSecurityCode = this.getSecurityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityCode", theSecurityCode), currentHashCode, theSecurityCode, (this.securityCode!= null));
        }
        {
            String theReconBatchId;
            theReconBatchId = this.getReconBatchId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reconBatchId", theReconBatchId), currentHashCode, theReconBatchId, (this.reconBatchId!= null));
        }
        {
            Integer thePaymentGroupingCode;
            thePaymentGroupingCode = this.getPaymentGroupingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentGroupingCode", thePaymentGroupingCode), currentHashCode, thePaymentGroupingCode, (this.paymentGroupingCode!= null));
        }
        {
            Date theTxnAuthorizationTime;
            theTxnAuthorizationTime = this.getTxnAuthorizationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnAuthorizationTime", theTxnAuthorizationTime), currentHashCode, theTxnAuthorizationTime, (this.txnAuthorizationTime!= null));
        }
        {
            Integer theTxnAuthorizationStamp;
            theTxnAuthorizationStamp = this.getTxnAuthorizationStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnAuthorizationStamp", theTxnAuthorizationStamp), currentHashCode, theTxnAuthorizationStamp, (this.txnAuthorizationStamp!= null));
        }
        {
            String theClientTransID;
            theClientTransID = this.getClientTransID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientTransID", theClientTransID), currentHashCode, theClientTransID, (this.clientTransID!= null));
        }
        {
            IntuitAnyType theCreditChargeResponseEx;
            theCreditChargeResponseEx = this.getCreditChargeResponseEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditChargeResponseEx", theCreditChargeResponseEx), currentHashCode, theCreditChargeResponseEx, (this.creditChargeResponseEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
