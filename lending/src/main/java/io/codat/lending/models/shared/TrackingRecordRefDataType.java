/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TrackingRecordRefDataType - Name of underlying data type.
 */
public enum TrackingRecordRefDataType {
    CUSTOMERS("customers"),
    SUPPLIERS("suppliers"),
    TRACKING_CATEGORIES("trackingCategories");

    @JsonValue
    private final String value;

    private TrackingRecordRefDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TrackingRecordRefDataType> fromValue(String value) {
        for (TrackingRecordRefDataType o: TrackingRecordRefDataType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
