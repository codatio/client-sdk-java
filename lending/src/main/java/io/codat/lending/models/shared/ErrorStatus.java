/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ErrorStatus - The current status of a transient error. Null statuses indicate that the error is not transient.
 */
public enum ErrorStatus {
    ACTIVE("Active"),
    RESOLVED("Resolved");

    @JsonValue
    private final String value;

    private ErrorStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
