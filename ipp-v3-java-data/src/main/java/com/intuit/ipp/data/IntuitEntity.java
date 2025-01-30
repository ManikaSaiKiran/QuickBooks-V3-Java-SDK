//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import com.intuit.ipp.core.IEntity;
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
 * 				Description: Base type of any top level Intuit Entity of small business type.
 * 			
 * 
 * <p>Java class for IntuitEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntuitEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/&gt;
 *         &lt;element name="SyncToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetaData" type="{http://schema.intuit.com/finance/v3}ModificationMetaData" minOccurs="0"/&gt;
 *         &lt;element name="CustomField" type="{http://schema.intuit.com/finance/v3}CustomField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachableRef" type="{http://schema.intuit.com/finance/v3}AttachableRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://schema.intuit.com/finance/v3}EntityStatusEnum" /&gt;
 *       &lt;attribute name="sparse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntuitEntity", propOrder = {
    "id",
    "syncToken",
    "metaData",
    "customField",
    "attachableRef"
})
@XmlSeeAlso({
    RecurringTransaction.class,
    CustomerType.class,
    PaymentMethod.class,
    Term.class,
    Class.class,
    TimeActivity.class,
    Item.class,
    TaxClassification.class,
    TaxCode.class,
    TaxPayment.class,
    TaxReturn.class,
    TaxRate.class,
    SalesRep.class,
    InventorySite.class,
    Task.class,
    UserAlert.class,
    VendorType.class,
    PriceLevel.class,
    Company.class,
    CompanyInfo.class,
    FixedAsset.class,
    Preferences.class,
    EmailDeliveryInfo.class,
    Department.class,
    Attachable.class,
    CustomFieldDefinition.class,
    Status.class,
    SyncActivity.class,
    Budget.class,
    TDSMetadata.class,
    CompanyCurrency.class,
    ExchangeRate.class,
    JournalCode.class,
    QbdtEntityIdMapping.class,
    Account.class,
    Tag.class,
    TaxService.class,
    NameBase.class,
    User.class,
    JobType.class,
    ConvenienceFeeDetail.class,
    Transaction.class,
    Currency.class,
    PriceLevelPerItem.class,
    CustomerMsg.class,
    ShipMethod.class,
    UOM.class,
    TemplateName.class
})
public abstract class IntuitEntity implements Serializable, IEntity, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SyncToken")
    protected String syncToken;
    @XmlElement(name = "MetaData")
    protected ModificationMetaData metaData;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "AttachableRef")
    protected List<AttachableRef> attachableRef;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "status")
    protected EntityStatusEnum status;
    @XmlAttribute(name = "sparse")
    protected Boolean sparse;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the syncToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToken() {
        return syncToken;
    }

    /**
     * Sets the value of the syncToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToken(String value) {
        this.syncToken = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationMetaData }
     *     
     */
    public ModificationMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationMetaData }
     *     
     */
    public void setMetaData(ModificationMetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the attachableRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachableRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachableRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachableRef }
     * 
     * 
     */
    public List<AttachableRef> getAttachableRef() {
        if (attachableRef == null) {
            attachableRef = new ArrayList<AttachableRef>();
        }
        return this.attachableRef;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatusEnum }
     *     
     */
    public EntityStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatusEnum }
     *     
     */
    public void setStatus(EntityStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the sparse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSparse() {
        return sparse;
    }

    /**
     * Sets the value of the sparse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSparse(Boolean value) {
        this.sparse = value;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param customField
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    /**
     * Sets the value of the attachableRef property.
     * 
     * @param attachableRef
     *     allowed object is
     *     {@link AttachableRef }
     *     
     */
    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IntuitEntity that = ((IntuitEntity) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsSyncToken;
            lhsSyncToken = this.getSyncToken();
            String rhsSyncToken;
            rhsSyncToken = that.getSyncToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncToken", lhsSyncToken), LocatorUtils.property(thatLocator, "syncToken", rhsSyncToken), lhsSyncToken, rhsSyncToken, (this.syncToken!= null), (that.syncToken!= null))) {
                return false;
            }
        }
        {
            ModificationMetaData lhsMetaData;
            lhsMetaData = this.getMetaData();
            ModificationMetaData rhsMetaData;
            rhsMetaData = that.getMetaData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metaData", lhsMetaData), LocatorUtils.property(thatLocator, "metaData", rhsMetaData), lhsMetaData, rhsMetaData, (this.metaData!= null), (that.metaData!= null))) {
                return false;
            }
        }
        {
            List<CustomField> lhsCustomField;
            lhsCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            List<CustomField> rhsCustomField;
            rhsCustomField = (((that.customField!= null)&&(!that.customField.isEmpty()))?that.getCustomField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customField", lhsCustomField), LocatorUtils.property(thatLocator, "customField", rhsCustomField), lhsCustomField, rhsCustomField, ((this.customField!= null)&&(!this.customField.isEmpty())), ((that.customField!= null)&&(!that.customField.isEmpty())))) {
                return false;
            }
        }
        {
            List<AttachableRef> lhsAttachableRef;
            lhsAttachableRef = (((this.attachableRef!= null)&&(!this.attachableRef.isEmpty()))?this.getAttachableRef():null);
            List<AttachableRef> rhsAttachableRef;
            rhsAttachableRef = (((that.attachableRef!= null)&&(!that.attachableRef.isEmpty()))?that.getAttachableRef():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachableRef", lhsAttachableRef), LocatorUtils.property(thatLocator, "attachableRef", rhsAttachableRef), lhsAttachableRef, rhsAttachableRef, ((this.attachableRef!= null)&&(!this.attachableRef.isEmpty())), ((that.attachableRef!= null)&&(!that.attachableRef.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDomain;
            lhsDomain = this.getDomain();
            String rhsDomain;
            rhsDomain = that.getDomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domain", lhsDomain), LocatorUtils.property(thatLocator, "domain", rhsDomain), lhsDomain, rhsDomain, (this.domain!= null), (that.domain!= null))) {
                return false;
            }
        }
        {
            EntityStatusEnum lhsStatus;
            lhsStatus = this.getStatus();
            EntityStatusEnum rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSparse;
            lhsSparse = this.isSparse();
            Boolean rhsSparse;
            rhsSparse = that.isSparse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparse", lhsSparse), LocatorUtils.property(thatLocator, "sparse", rhsSparse), lhsSparse, rhsSparse, (this.sparse!= null), (that.sparse!= null))) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            String theSyncToken;
            theSyncToken = this.getSyncToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncToken", theSyncToken), currentHashCode, theSyncToken, (this.syncToken!= null));
        }
        {
            ModificationMetaData theMetaData;
            theMetaData = this.getMetaData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metaData", theMetaData), currentHashCode, theMetaData, (this.metaData!= null));
        }
        {
            List<CustomField> theCustomField;
            theCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customField", theCustomField), currentHashCode, theCustomField, ((this.customField!= null)&&(!this.customField.isEmpty())));
        }
        {
            List<AttachableRef> theAttachableRef;
            theAttachableRef = (((this.attachableRef!= null)&&(!this.attachableRef.isEmpty()))?this.getAttachableRef():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachableRef", theAttachableRef), currentHashCode, theAttachableRef, ((this.attachableRef!= null)&&(!this.attachableRef.isEmpty())));
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain, (this.domain!= null));
        }
        {
            EntityStatusEnum theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            Boolean theSparse;
            theSparse = this.isSparse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparse", theSparse), currentHashCode, theSparse, (this.sparse!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
