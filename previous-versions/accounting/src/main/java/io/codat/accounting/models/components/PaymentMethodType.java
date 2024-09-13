/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PaymentMethodType - Method of payment.
 */
public enum PaymentMethodType {
    UNKNOWN("Unknown"),
    CASH("Cash"),
    CHECK("Check"),
    CREDIT_CARD("CreditCard"),
    DEBIT_CARD("DebitCard"),
    BANK_TRANSFER("BankTransfer"),
    OTHER("Other");

    @JsonValue
    private final String value;

    private PaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
