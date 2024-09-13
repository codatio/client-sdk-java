/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TransactionSourceType - The type of source the transaction arose.
 */
public enum TransactionSourceType {
    FEE("Fee"),
    ORDER("Order"),
    PAYMENT("Payment"),
    SERVICE_CHARGE("ServiceCharge"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private TransactionSourceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
