/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CompanyInformationType - The type of the weblink.
 */
public enum CompanyInformationType {
    WEBSITE("Website"),
    SOCIAL("Social"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private CompanyInformationType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
