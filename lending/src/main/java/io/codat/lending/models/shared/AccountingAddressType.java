/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AccountingAddressType - The type of the address
 */
public enum AccountingAddressType {
    UNKNOWN("Unknown"),
    BILLING("Billing"),
    DELIVERY("Delivery");

    @JsonValue
    private final String value;

    private AccountingAddressType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
