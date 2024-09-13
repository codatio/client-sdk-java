/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * JournalLineDataType - Allowed name of the 'dataType'.
 */
public enum JournalLineDataType {
    CUSTOMERS("customers"),
    SUPPLIERS("suppliers");

    @JsonValue
    private final String value;

    private JournalLineDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
