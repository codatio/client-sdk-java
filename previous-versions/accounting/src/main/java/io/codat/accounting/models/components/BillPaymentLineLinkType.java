/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BillPaymentLineLinkType - Types of links to bill payment lines.
 */
public enum BillPaymentLineLinkType {
    UNKNOWN("Unknown"),
    UNLINKED("Unlinked"),
    BILL("Bill"),
    OTHER("Other"),
    CREDIT_NOTE("CreditNote"),
    BILL_PAYMENT("BillPayment"),
    PAYMENT_ON_ACCOUNT("PaymentOnAccount"),
    REFUND("Refund"),
    MANUAL_JOURNAL("ManualJournal"),
    DISCOUNT("Discount");

    @JsonValue
    private final String value;

    private BillPaymentLineLinkType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
