/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CustomerStatus - Status of customer.
 */
public enum CustomerStatus {
    UNKNOWN("Unknown"),
    ACTIVE("Active"),
    ARCHIVED("Archived");

    @JsonValue
    private final String value;

    private CustomerStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
