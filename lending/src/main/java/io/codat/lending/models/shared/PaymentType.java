/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentType - Type of payment.
 */
public enum PaymentType {
    CASH("Cash"),
    CARD("Card"),
    INVOICE("Invoice"),
    ONLINE_CARD("OnlineCard"),
    SWISH("Swish"),
    VIPPS("Vipps"),
    MOBILE("Mobile"),
    STORE_CREDIT("StoreCredit"),
    PAYPAL("Paypal"),
    CUSTOM("Custom"),
    PREPAID("Prepaid"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private PaymentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentType> fromValue(String value) {
        for (PaymentType o: PaymentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
