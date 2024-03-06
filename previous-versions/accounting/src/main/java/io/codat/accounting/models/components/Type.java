/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * Type - The type of the weblink.
 */
public enum Type {
    WEBSITE("Website"),
    SOCIAL("Social"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private Type(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}