/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentLinkType - Types of payment line links, either:  
 * `Unknown`  
 * `Unlinked` - Not used  
 * `Invoice` - ID refers to the invoice  
 * `CreditNote` - ID refers to the credit note  
 * `Refund` - ID refers to the sibling payment  
 * `Payment` - ID refers to the sibling payment  
 * `PaymentOnAccount` - ID refers to the customer  
 * `Other` - ID refers to the customer  
 * `Manual Journal`  
 * `Discount` - ID refers to the payment
 */
public enum PaymentLinkType {
    UNKNOWN("Unknown"),
    UNLINKED("Unlinked"),
    INVOICE("Invoice"),
    CREDIT_NOTE("CreditNote"),
    OTHER("Other"),
    REFUND("Refund"),
    PAYMENT("Payment"),
    PAYMENT_ON_ACCOUNT("PaymentOnAccount"),
    MANUAL_JOURNAL("ManualJournal"),
    DISCOUNT("Discount");

    @JsonValue
    private final String value;

    private PaymentLinkType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentLinkType> fromValue(String value) {
        for (PaymentLinkType o: PaymentLinkType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
