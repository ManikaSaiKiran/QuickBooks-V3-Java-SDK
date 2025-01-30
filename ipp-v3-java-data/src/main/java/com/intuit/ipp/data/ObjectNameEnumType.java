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
 * <p>Java class for objectNameEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="objectNameEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Attachable"/&gt;
 *     &lt;enumeration value="Bill"/&gt;
 *     &lt;enumeration value="BillPayment"/&gt;
 *     &lt;enumeration value="BOMComponent"/&gt;
 *     &lt;enumeration value="ChargeCredit"/&gt;
 *     &lt;enumeration value="Class"/&gt;
 *     &lt;enumeration value="Company"/&gt;
 *     &lt;enumeration value="CompanyInfo"/&gt;
 *     &lt;enumeration value="CreditCardPaymentTxn"/&gt;
 *     &lt;enumeration value="CreditMemo"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="CustomerType"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="Department"/&gt;
 *     &lt;enumeration value="Deposit"/&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *     &lt;enumeration value="Estimate"/&gt;
 *     &lt;enumeration value="FixedAsset"/&gt;
 *     &lt;enumeration value="InventoryAdjustment"/&gt;
 *     &lt;enumeration value="InventorySite"/&gt;
 *     &lt;enumeration value="Invoice"/&gt;
 *     &lt;enumeration value="Item"/&gt;
 *     &lt;enumeration value="ItemReceipt"/&gt;
 *     &lt;enumeration value="JournalEntry"/&gt;
 *     &lt;enumeration value="ListObjectType"/&gt;
 *     &lt;enumeration value="Names"/&gt;
 *     &lt;enumeration value="OtherName"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="PaymentMethod"/&gt;
 *     &lt;enumeration value="Preferences"/&gt;
 *     &lt;enumeration value="PriceLevel"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="PurchaseOrder"/&gt;
 *     &lt;enumeration value="RecurringTransaction"/&gt;
 *     &lt;enumeration value="RefundReceipt"/&gt;
 *     &lt;enumeration value="ReimburseCharge"/&gt;
 *     &lt;enumeration value="Report"/&gt;
 *     &lt;enumeration value="SalesOrder"/&gt;
 *     &lt;enumeration value="SalesReceipt"/&gt;
 *     &lt;enumeration value="SalesRep"/&gt;
 *     &lt;enumeration value="ShipMethod"/&gt;
 *     &lt;enumeration value="StatementCharge"/&gt;
 *     &lt;enumeration value="Tag"/&gt;
 *     &lt;enumeration value="TaxCode"/&gt;
 *     &lt;enumeration value="TaxClassification"/&gt;
 *     &lt;enumeration value="TaxPayment"/&gt;
 *     &lt;enumeration value="TaxRate"/&gt;
 *     &lt;enumeration value="TaxReturn"/&gt;
 *     &lt;enumeration value="Term"/&gt;
 *     &lt;enumeration value="TimeActivity"/&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *     &lt;enumeration value="Transaction"/&gt;
 *     &lt;enumeration value="TxnLocation"/&gt;
 *     &lt;enumeration value="UOM"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *     &lt;enumeration value="VendorCredit"/&gt;
 *     &lt;enumeration value="CustomFieldDefinition"/&gt;
 *     &lt;enumeration value="ChangeOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "objectNameEnumType")
@XmlEnum
public enum ObjectNameEnumType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Attachable")
    ATTACHABLE("Attachable"),
    @XmlEnumValue("Bill")
    BILL("Bill"),
    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),
    @XmlEnumValue("BOMComponent")
    BOM_COMPONENT("BOMComponent"),
    @XmlEnumValue("ChargeCredit")
    CHARGE_CREDIT("ChargeCredit"),
    @XmlEnumValue("Class")
    CLASS("Class"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("CompanyInfo")
    COMPANY_INFO("CompanyInfo"),
    @XmlEnumValue("CreditCardPaymentTxn")
    CREDIT_CARD_PAYMENT_TXN("CreditCardPaymentTxn"),
    @XmlEnumValue("CreditMemo")
    CREDIT_MEMO("CreditMemo"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("CustomerType")
    CUSTOMER_TYPE("CustomerType"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("FixedAsset")
    FIXED_ASSET("FixedAsset"),
    @XmlEnumValue("InventoryAdjustment")
    INVENTORY_ADJUSTMENT("InventoryAdjustment"),
    @XmlEnumValue("InventorySite")
    INVENTORY_SITE("InventorySite"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("ItemReceipt")
    ITEM_RECEIPT("ItemReceipt"),
    @XmlEnumValue("JournalEntry")
    JOURNAL_ENTRY("JournalEntry"),
    @XmlEnumValue("ListObjectType")
    LIST_OBJECT_TYPE("ListObjectType"),
    @XmlEnumValue("Names")
    NAMES("Names"),
    @XmlEnumValue("OtherName")
    OTHER_NAME("OtherName"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("PaymentMethod")
    PAYMENT_METHOD("PaymentMethod"),
    @XmlEnumValue("Preferences")
    PREFERENCES("Preferences"),
    @XmlEnumValue("PriceLevel")
    PRICE_LEVEL("PriceLevel"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("RecurringTransaction")
    RECURRING_TRANSACTION("RecurringTransaction"),
    @XmlEnumValue("RefundReceipt")
    REFUND_RECEIPT("RefundReceipt"),
    @XmlEnumValue("ReimburseCharge")
    REIMBURSE_CHARGE("ReimburseCharge"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesReceipt")
    SALES_RECEIPT("SalesReceipt"),
    @XmlEnumValue("SalesRep")
    SALES_REP("SalesRep"),
    @XmlEnumValue("ShipMethod")
    SHIP_METHOD("ShipMethod"),
    @XmlEnumValue("StatementCharge")
    STATEMENT_CHARGE("StatementCharge"),
    @XmlEnumValue("Tag")
    TAG("Tag"),
    @XmlEnumValue("TaxCode")
    TAX_CODE("TaxCode"),
    @XmlEnumValue("TaxClassification")
    TAX_CLASSIFICATION("TaxClassification"),
    @XmlEnumValue("TaxPayment")
    TAX_PAYMENT("TaxPayment"),
    @XmlEnumValue("TaxRate")
    TAX_RATE("TaxRate"),
    @XmlEnumValue("TaxReturn")
    TAX_RETURN("TaxReturn"),
    @XmlEnumValue("Term")
    TERM("Term"),
    @XmlEnumValue("TimeActivity")
    TIME_ACTIVITY("TimeActivity"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Transaction")
    TRANSACTION("Transaction"),
    @XmlEnumValue("TxnLocation")
    TXN_LOCATION("TxnLocation"),
    UOM("UOM"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("VendorCredit")
    VENDOR_CREDIT("VendorCredit"),
    @XmlEnumValue("CustomFieldDefinition")
    CUSTOM_FIELD_DEFINITION("CustomFieldDefinition"),
    @XmlEnumValue("ChangeOrder")
    CHANGE_ORDER("ChangeOrder");
    private final String value;

    ObjectNameEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectNameEnumType fromValue(String v) {
        for (ObjectNameEnumType c: ObjectNameEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
