/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * IntegrityStatus - The current status of the most recently run matching algorithm.
 */
public enum IntegrityStatus {
    UNKNOWN("Unknown"),
    DOES_NOT_EXIST("DoesNotExist"),
    ERROR("Error"),
    COMPLETE("Complete");

    @JsonValue
    private final String value;

    private IntegrityStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
