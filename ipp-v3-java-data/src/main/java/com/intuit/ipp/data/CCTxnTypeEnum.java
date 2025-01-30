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
 * <p>Java class for CCTxnTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CCTxnTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Authorization"/&gt;
 *     &lt;enumeration value="Capture"/&gt;
 *     &lt;enumeration value="Charge"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="VoiceAuthorization"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CCTxnTypeEnum")
@XmlEnum
public enum CCTxnTypeEnum {

    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Capture")
    CAPTURE("Capture"),
    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("VoiceAuthorization")
    VOICE_AUTHORIZATION("VoiceAuthorization");
    private final String value;

    CCTxnTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCTxnTypeEnum fromValue(String v) {
        for (CCTxnTypeEnum c: CCTxnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
