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
 * <p>Java class for TxnSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TxnSourceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QBMobile"/&gt;
 *     &lt;enumeration value="GoPayment"/&gt;
 *     &lt;enumeration value="EInvoice"/&gt;
 *     &lt;enumeration value="Square"/&gt;
 *     &lt;enumeration value="QBCommerce"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TxnSourceEnum")
@XmlEnum
public enum TxnSourceEnum {

    @XmlEnumValue("QBMobile")
    QB_MOBILE("QBMobile"),
    @XmlEnumValue("GoPayment")
    GO_PAYMENT("GoPayment"),
    @XmlEnumValue("EInvoice")
    E_INVOICE("EInvoice"),
    @XmlEnumValue("Square")
    SQUARE("Square"),
    @XmlEnumValue("QBCommerce")
    QB_COMMERCE("QBCommerce");
    private final String value;

    TxnSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TxnSourceEnum fromValue(String v) {
        for (TxnSourceEnum c: TxnSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
