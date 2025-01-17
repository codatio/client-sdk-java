/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

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
    
    public static Optional<BilledToType1> fromValue(String value) {
        for (BilledToType1 o: BilledToType1.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
