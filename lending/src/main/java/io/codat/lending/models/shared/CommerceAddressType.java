/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * CommerceAddressType - The type of the address
 */
public enum CommerceAddressType {
    BILLING("Billing"),
    DELIVERY("Delivery"),
    ORDER("Order"),
    INVENTORY("Inventory"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private CommerceAddressType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
