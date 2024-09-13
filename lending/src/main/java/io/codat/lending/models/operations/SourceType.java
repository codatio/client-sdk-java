/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourceType - Data source type.
 */
public enum SourceType {
    BANKING("banking"),
    COMMERCE("commerce"),
    ACCOUNTING("accounting");

    @JsonValue
    private final String value;

    private SourceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
