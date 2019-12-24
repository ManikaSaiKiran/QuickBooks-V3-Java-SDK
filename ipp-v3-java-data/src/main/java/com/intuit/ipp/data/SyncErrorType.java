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
 * <p>Java class for SyncErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OutOfSync"/>
 *     &lt;enumeration value="BusinessLogic"/>
 *     &lt;enumeration value="SystemError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SyncErrorType")
@XmlEnum
public enum SyncErrorType {

    @XmlEnumValue("OutOfSync")
    OUT_OF_SYNC("OutOfSync"),
    @XmlEnumValue("BusinessLogic")
    BUSINESS_LOGIC("BusinessLogic"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError");
    private final String value;

    SyncErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncErrorType fromValue(String v) {
        for (SyncErrorType c: SyncErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
