//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvenienceFeeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConvenienceFeeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="PAID"/&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConvenienceFeeTypeEnum")
@XmlEnum
public enum ConvenienceFeeTypeEnum {

    MANUAL,
    AUTO,
    PAID,
    DISABLED;

    public String value() {
        return name();
    }

    public static ConvenienceFeeTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
