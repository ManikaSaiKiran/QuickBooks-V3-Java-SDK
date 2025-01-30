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
 * <p>Java class for TaxReportBasisTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxReportBasisTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Accrual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxReportBasisTypeEnum")
@XmlEnum
public enum TaxReportBasisTypeEnum {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Accrual")
    ACCRUAL("Accrual");
    private final String value;

    TaxReportBasisTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxReportBasisTypeEnum fromValue(String v) {
        for (TaxReportBasisTypeEnum c: TaxReportBasisTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
