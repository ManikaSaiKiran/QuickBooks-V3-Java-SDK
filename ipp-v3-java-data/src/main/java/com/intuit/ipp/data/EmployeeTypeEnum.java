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
 * <p>Java class for EmployeeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Officer"/>
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Statutory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTypeEnum")
@XmlEnum
public enum EmployeeTypeEnum {

    @XmlEnumValue("Officer")
    OFFICER("Officer"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Statutory")
    STATUTORY("Statutory");
    private final String value;

    EmployeeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTypeEnum fromValue(String v) {
        for (EmployeeTypeEnum c: EmployeeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
