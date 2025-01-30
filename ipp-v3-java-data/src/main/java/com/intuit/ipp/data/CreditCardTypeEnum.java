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
 * <p>Java class for CreditCardTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CreditCardTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AmEx"/&gt;
 *     &lt;enumeration value="DebitCard"/&gt;
 *     &lt;enumeration value="Discover"/&gt;
 *     &lt;enumeration value="GiftCard"/&gt;
 *     &lt;enumeration value="MasterCard"/&gt;
 *     &lt;enumeration value="OtherCreditCard"/&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditCardTypeEnum")
@XmlEnum
public enum CreditCardTypeEnum {

    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("GiftCard")
    GIFT_CARD("GiftCard"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("OtherCreditCard")
    OTHER_CREDIT_CARD("OtherCreditCard"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    CreditCardTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardTypeEnum fromValue(String v) {
        for (CreditCardTypeEnum c: CreditCardTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
