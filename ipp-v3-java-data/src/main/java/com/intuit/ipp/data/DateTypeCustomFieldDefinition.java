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
 * 				Description: Provides for strong-typing of the DateType CustomField.
 * 			
 * 
 * <p>Java class for DateTypeCustomFieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTypeCustomFieldDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}CustomFieldDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MinDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTypeCustomFieldDefinition", propOrder = {
    "defaultDate",
    "minDate",
    "maxDate"
})
public class DateTypeCustomFieldDefinition
    extends CustomFieldDefinition
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date defaultDate;
    @XmlElement(name = "MinDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date minDate;
    @XmlElement(name = "MaxDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date maxDate;

    /**
     * Gets the value of the defaultDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDefaultDate() {
        return defaultDate;
    }

    /**
     * Sets the value of the defaultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDate(Date value) {
        this.defaultDate = value;
    }

    /**
     * Gets the value of the minDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMinDate() {
        return minDate;
    }

    /**
     * Sets the value of the minDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDate(Date value) {
        this.minDate = value;
    }

    /**
     * Gets the value of the maxDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMaxDate() {
        return maxDate;
    }

    /**
     * Sets the value of the maxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDate(Date value) {
        this.maxDate = value;
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
        final DateTypeCustomFieldDefinition that = ((DateTypeCustomFieldDefinition) object);
        {
            Date lhsDefaultDate;
            lhsDefaultDate = this.getDefaultDate();
            Date rhsDefaultDate;
            rhsDefaultDate = that.getDefaultDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultDate", lhsDefaultDate), LocatorUtils.property(thatLocator, "defaultDate", rhsDefaultDate), lhsDefaultDate, rhsDefaultDate, (this.defaultDate!= null), (that.defaultDate!= null))) {
                return false;
            }
        }
        {
            Date lhsMinDate;
            lhsMinDate = this.getMinDate();
            Date rhsMinDate;
            rhsMinDate = that.getMinDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDate", lhsMinDate), LocatorUtils.property(thatLocator, "minDate", rhsMinDate), lhsMinDate, rhsMinDate, (this.minDate!= null), (that.minDate!= null))) {
                return false;
            }
        }
        {
            Date lhsMaxDate;
            lhsMaxDate = this.getMaxDate();
            Date rhsMaxDate;
            rhsMaxDate = that.getMaxDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDate", lhsMaxDate), LocatorUtils.property(thatLocator, "maxDate", rhsMaxDate), lhsMaxDate, rhsMaxDate, (this.maxDate!= null), (that.maxDate!= null))) {
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
            Date theDefaultDate;
            theDefaultDate = this.getDefaultDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultDate", theDefaultDate), currentHashCode, theDefaultDate, (this.defaultDate!= null));
        }
        {
            Date theMinDate;
            theMinDate = this.getMinDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minDate", theMinDate), currentHashCode, theMinDate, (this.minDate!= null));
        }
        {
            Date theMaxDate;
            theMaxDate = this.getMaxDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxDate", theMaxDate), currentHashCode, theMaxDate, (this.maxDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
