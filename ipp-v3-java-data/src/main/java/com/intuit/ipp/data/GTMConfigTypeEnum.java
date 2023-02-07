//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GTMConfigTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GTMConfigTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SYSTEM_GENERATED"/&gt;
 *     &lt;enumeration value="USER_DEFINED"/&gt;
 *     &lt;enumeration value="SCRA_DEFINED"/&gt;
 *     &lt;enumeration value="HIDDEN_AGENCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GTMConfigTypeEnum")
@XmlEnum
public enum GTMConfigTypeEnum {

    SYSTEM_GENERATED,
    USER_DEFINED,
    SCRA_DEFINED,
    HIDDEN_AGENCY;

    public String value() {
        return name();
    }

    public static GTMConfigTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
