//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.23 at 07:53:50 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
 * Describes Budget specifications
 * 
 * <p>Java class for Budget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Budget">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BudgetType" type="{http://schema.intuit.com/finance/v3}BudgetTypeEnum" minOccurs="0"/>
 *         &lt;element name="BudgetEntryType" type="{http://schema.intuit.com/finance/v3}BudgetEntryTypeEnum" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BudgetDetail" type="{http://schema.intuit.com/finance/v3}BudgetDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Budget", propOrder = {
    "name",
    "startDate",
    "endDate",
    "budgetType",
    "budgetEntryType",
    "active",
    "budgetDetail"
})
public class Budget
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date startDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date endDate;
    @XmlElement(name = "BudgetType")
    protected BudgetTypeEnum budgetType;
    @XmlElement(name = "BudgetEntryType")
    protected BudgetEntryTypeEnum budgetEntryType;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "BudgetDetail")
    protected List<BudgetDetail> budgetDetail;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the budgetType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetTypeEnum }
     *     
     */
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetTypeEnum }
     *     
     */
    public void setBudgetType(BudgetTypeEnum value) {
        this.budgetType = value;
    }

    /**
     * Gets the value of the budgetEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetEntryTypeEnum }
     *     
     */
    public BudgetEntryTypeEnum getBudgetEntryType() {
        return budgetEntryType;
    }

    /**
     * Sets the value of the budgetEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetEntryTypeEnum }
     *     
     */
    public void setBudgetEntryType(BudgetEntryTypeEnum value) {
        this.budgetEntryType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the budgetDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetDetail }
     * 
     * 
     */
    public List<BudgetDetail> getBudgetDetail() {
        if (budgetDetail == null) {
            budgetDetail = new ArrayList<BudgetDetail>();
        }
        return this.budgetDetail;
    }

    /**
     * Sets the value of the budgetDetail property.
     * 
     * @param budgetDetail
     *     allowed object is
     *     {@link BudgetDetail }
     *     
     */
    public void setBudgetDetail(List<BudgetDetail> budgetDetail) {
        this.budgetDetail = budgetDetail;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Budget that = ((Budget) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            Date lhsStartDate;
            lhsStartDate = this.getStartDate();
            Date rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            BudgetTypeEnum lhsBudgetType;
            lhsBudgetType = this.getBudgetType();
            BudgetTypeEnum rhsBudgetType;
            rhsBudgetType = that.getBudgetType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetType", lhsBudgetType), LocatorUtils.property(thatLocator, "budgetType", rhsBudgetType), lhsBudgetType, rhsBudgetType, (this.budgetType!= null), (that.budgetType!= null))) {
                return false;
            }
        }
        {
            BudgetEntryTypeEnum lhsBudgetEntryType;
            lhsBudgetEntryType = this.getBudgetEntryType();
            BudgetEntryTypeEnum rhsBudgetEntryType;
            rhsBudgetEntryType = that.getBudgetEntryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetEntryType", lhsBudgetEntryType), LocatorUtils.property(thatLocator, "budgetEntryType", rhsBudgetEntryType), lhsBudgetEntryType, rhsBudgetEntryType, (this.budgetEntryType!= null), (that.budgetEntryType!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            List<BudgetDetail> lhsBudgetDetail;
            lhsBudgetDetail = (((this.budgetDetail!= null)&&(!this.budgetDetail.isEmpty()))?this.getBudgetDetail():null);
            List<BudgetDetail> rhsBudgetDetail;
            rhsBudgetDetail = (((that.budgetDetail!= null)&&(!that.budgetDetail.isEmpty()))?that.getBudgetDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetDetail", lhsBudgetDetail), LocatorUtils.property(thatLocator, "budgetDetail", rhsBudgetDetail), lhsBudgetDetail, rhsBudgetDetail, ((this.budgetDetail!= null)&&(!this.budgetDetail.isEmpty())), ((that.budgetDetail!= null)&&(!that.budgetDetail.isEmpty())))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            Date theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            BudgetTypeEnum theBudgetType;
            theBudgetType = this.getBudgetType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetType", theBudgetType), currentHashCode, theBudgetType, (this.budgetType!= null));
        }
        {
            BudgetEntryTypeEnum theBudgetEntryType;
            theBudgetEntryType = this.getBudgetEntryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetEntryType", theBudgetEntryType), currentHashCode, theBudgetEntryType, (this.budgetEntryType!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            List<BudgetDetail> theBudgetDetail;
            theBudgetDetail = (((this.budgetDetail!= null)&&(!this.budgetDetail.isEmpty()))?this.getBudgetDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetDetail", theBudgetDetail), currentHashCode, theBudgetDetail, ((this.budgetDetail!= null)&&(!this.budgetDetail.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
