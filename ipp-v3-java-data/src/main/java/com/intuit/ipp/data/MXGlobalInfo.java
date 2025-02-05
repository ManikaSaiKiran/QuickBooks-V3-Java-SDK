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
 * 				Description: Global invoice data of a transaction which is required by CFDI4.0 in Mexico.
 * 				Visit http://omawww.sat.gob.mx/tramitesyservicios/Paginas/anexo_20_version3-3.htm and find the catalogues that contain the accepted values of Exportation, Periodicity, and Year.
 * 			
 * 
 * <p>Java class for MXGlobalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MXGlobalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Periodicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MXGlobalInfo", propOrder = {
    "periodicity",
    "month",
    "year"
})
public class MXGlobalInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Periodicity")
    protected String periodicity;
    @XmlElement(name = "Month")
    protected String month;
    @XmlElement(name = "Year")
    protected String year;

    /**
     * Gets the value of the periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicity() {
        return periodicity;
    }

    /**
     * Sets the value of the periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicity(String value) {
        this.periodicity = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MXGlobalInfo that = ((MXGlobalInfo) object);
        {
            String lhsPeriodicity;
            lhsPeriodicity = this.getPeriodicity();
            String rhsPeriodicity;
            rhsPeriodicity = that.getPeriodicity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periodicity", lhsPeriodicity), LocatorUtils.property(thatLocator, "periodicity", rhsPeriodicity), lhsPeriodicity, rhsPeriodicity, (this.periodicity!= null), (that.periodicity!= null))) {
                return false;
            }
        }
        {
            String lhsMonth;
            lhsMonth = this.getMonth();
            String rhsMonth;
            rhsMonth = that.getMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "month", lhsMonth), LocatorUtils.property(thatLocator, "month", rhsMonth), lhsMonth, rhsMonth, (this.month!= null), (that.month!= null))) {
                return false;
            }
        }
        {
            String lhsYear;
            lhsYear = this.getYear();
            String rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear, (this.year!= null), (that.year!= null))) {
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
            String thePeriodicity;
            thePeriodicity = this.getPeriodicity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periodicity", thePeriodicity), currentHashCode, thePeriodicity, (this.periodicity!= null));
        }
        {
            String theMonth;
            theMonth = this.getMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "month", theMonth), currentHashCode, theMonth, (this.month!= null));
        }
        {
            String theYear;
            theYear = this.getYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "year", theYear), currentHashCode, theYear, (this.year!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
