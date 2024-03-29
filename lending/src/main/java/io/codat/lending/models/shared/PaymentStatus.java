/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * PaymentStatus - Status of the payment.
 */
public enum PaymentStatus {
    PENDING("Pending"),
    AUTHORIZED("Authorized"),
    PAID("Paid"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
