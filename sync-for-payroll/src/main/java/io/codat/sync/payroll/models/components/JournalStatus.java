/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * JournalStatus - Current journal status.
 */
public enum JournalStatus {
    UNKNOWN("Unknown"),
    ACTIVE("Active"),
    ARCHIVED("Archived");

    @JsonValue
    private final String value;

    private JournalStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
