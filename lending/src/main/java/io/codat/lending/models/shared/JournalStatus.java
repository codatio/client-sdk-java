/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

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
    
    public static Optional<JournalStatus> fromValue(String value) {
        for (JournalStatus o: JournalStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
