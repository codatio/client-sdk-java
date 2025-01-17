/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TransactionCategoryStatus - The status of the transaction category.
 */
public enum TransactionCategoryStatus {
    UNKNOWN("Unknown"),
    ACTIVE("Active"),
    ARCHIVED("Archived");

    @JsonValue
    private final String value;

    private TransactionCategoryStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TransactionCategoryStatus> fromValue(String value) {
        for (TransactionCategoryStatus o: TransactionCategoryStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
