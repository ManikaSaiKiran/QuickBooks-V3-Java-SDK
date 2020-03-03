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
 * <p>Java class for LineDetailTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineDetailTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PaymentLineDetail"/>
 *     &lt;enumeration value="DiscountLineDetail"/>
 *     &lt;enumeration value="TaxLineDetail"/>
 *     &lt;enumeration value="SalesItemLineDetail"/>
 *     &lt;enumeration value="ItemBasedExpenseLineDetail"/>
 *     &lt;enumeration value="AccountBasedExpenseLineDetail"/>
 *     &lt;enumeration value="DepositLineDetail"/>
 *     &lt;enumeration value="PurchaseOrderItemLineDetail"/>
 *     &lt;enumeration value="ItemReceiptLineDetail"/>
 *     &lt;enumeration value="JournalEntryLineDetail"/>
 *     &lt;enumeration value="GroupLineDetail"/>
 *     &lt;enumeration value="DescriptionOnly"/>
 *     &lt;enumeration value="SubTotalLineDetail"/>
 *     &lt;enumeration value="SalesOrderItemLineDetail"/>
 *     &lt;enumeration value="TDSLineDetail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineDetailTypeEnum")
@XmlEnum
public enum LineDetailTypeEnum {

    @XmlEnumValue("PaymentLineDetail")
    PAYMENT_LINE_DETAIL("PaymentLineDetail"),
    @XmlEnumValue("DiscountLineDetail")
    DISCOUNT_LINE_DETAIL("DiscountLineDetail"),
    @XmlEnumValue("TaxLineDetail")
    TAX_LINE_DETAIL("TaxLineDetail"),
    @XmlEnumValue("SalesItemLineDetail")
    SALES_ITEM_LINE_DETAIL("SalesItemLineDetail"),
    @XmlEnumValue("ItemBasedExpenseLineDetail")
    ITEM_BASED_EXPENSE_LINE_DETAIL("ItemBasedExpenseLineDetail"),
    @XmlEnumValue("AccountBasedExpenseLineDetail")
    ACCOUNT_BASED_EXPENSE_LINE_DETAIL("AccountBasedExpenseLineDetail"),
    @XmlEnumValue("DepositLineDetail")
    DEPOSIT_LINE_DETAIL("DepositLineDetail"),
    @XmlEnumValue("PurchaseOrderItemLineDetail")
    PURCHASE_ORDER_ITEM_LINE_DETAIL("PurchaseOrderItemLineDetail"),
    @XmlEnumValue("ItemReceiptLineDetail")
    ITEM_RECEIPT_LINE_DETAIL("ItemReceiptLineDetail"),
    @XmlEnumValue("JournalEntryLineDetail")
    JOURNAL_ENTRY_LINE_DETAIL("JournalEntryLineDetail"),
    @XmlEnumValue("GroupLineDetail")
    GROUP_LINE_DETAIL("GroupLineDetail"),
    @XmlEnumValue("DescriptionOnly")
    DESCRIPTION_ONLY("DescriptionOnly"),
    @XmlEnumValue("SubTotalLineDetail")
    SUB_TOTAL_LINE_DETAIL("SubTotalLineDetail"),
    @XmlEnumValue("SalesOrderItemLineDetail")
    SALES_ORDER_ITEM_LINE_DETAIL("SalesOrderItemLineDetail"),
    @XmlEnumValue("TDSLineDetail")
    TDS_LINE_DETAIL("TDSLineDetail");
    private final String value;

    LineDetailTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineDetailTypeEnum fromValue(String v) {
        for (LineDetailTypeEnum c: LineDetailTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
