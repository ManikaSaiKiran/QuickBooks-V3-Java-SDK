//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CISRateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CISRateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CIS gross rate (0%)"/&gt;
 *     &lt;enumeration value="CIS standard rate (20%)"/&gt;
 *     &lt;enumeration value="CIS higher rate (30%)"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CISRateEnum")
@XmlEnum
public enum CISRateEnum {

    @XmlEnumValue("CIS gross rate (0%)")
    CIS_GROSS_RATE_0("CIS gross rate (0%)"),
    @XmlEnumValue("CIS standard rate (20%)")
    CIS_STANDARD_RATE_20("CIS standard rate (20%)"),
    @XmlEnumValue("CIS higher rate (30%)")
    CIS_HIGHER_RATE_30("CIS higher rate (30%)");
    private final String value;

    CISRateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CISRateEnum fromValue(String v) {
        for (CISRateEnum c: CISRateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
