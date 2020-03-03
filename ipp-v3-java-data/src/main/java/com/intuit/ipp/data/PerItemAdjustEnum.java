//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.23 at 07:53:50 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerItemAdjustEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerItemAdjustEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cost"/>
 *     &lt;enumeration value="CurrentCustomPrice"/>
 *     &lt;enumeration value="StandardPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerItemAdjustEnum")
@XmlEnum
public enum PerItemAdjustEnum {

    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("CurrentCustomPrice")
    CURRENT_CUSTOM_PRICE("CurrentCustomPrice"),
    @XmlEnumValue("StandardPrice")
    STANDARD_PRICE("StandardPrice");
    private final String value;

    PerItemAdjustEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerItemAdjustEnum fromValue(String v) {
        for (PerItemAdjustEnum c: PerItemAdjustEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
