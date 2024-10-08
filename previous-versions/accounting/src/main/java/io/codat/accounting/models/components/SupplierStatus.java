/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SupplierStatus - Status of the supplier.
 */
public enum SupplierStatus {
    UNKNOWN("Unknown"),
    ACTIVE("Active"),
    ARCHIVED("Archived");

    @JsonValue
    private final String value;

    private SupplierStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
