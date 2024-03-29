/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * Status - The status of the account transaction.
 */
public enum Status {
    UNKNOWN("Unknown"),
    UNRECONCILED("Unreconciled"),
    RECONCILED("Reconciled"),
    VOID_("Void");

    @JsonValue
    private final String value;

    private Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
