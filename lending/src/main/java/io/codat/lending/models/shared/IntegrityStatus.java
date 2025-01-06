/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

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
    
    public static Optional<IntegrityStatus> fromValue(String value) {
        for (IntegrityStatus o: IntegrityStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
