//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 05:01:01 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesTermTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesTermTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DateDriven"/>
 *     &lt;enumeration value="Standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesTermTypeEnum")
@XmlEnum
public enum SalesTermTypeEnum {

    @XmlEnumValue("DateDriven")
    DATE_DRIVEN("DateDriven"),
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    SalesTermTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesTermTypeEnum fromValue(String v) {
        for (SalesTermTypeEnum c: SalesTermTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
