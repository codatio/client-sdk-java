/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

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