/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;

/**
 * BilledToType1 - Defines if the bill or bill credit note is billed/rebilled to a project.
 */
public enum BilledToType1 {
    UNKNOWN("Unknown"),
    NOT_APPLICABLE("NotApplicable"),
    PROJECT("Project");

    @JsonValue
    private final String value;

    private BilledToType1(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
