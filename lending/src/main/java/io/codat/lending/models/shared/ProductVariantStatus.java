/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ProductVariantStatus - The status of the product variant.
 */
public enum ProductVariantStatus {
    UNKNOWN("Unknown"),
    PUBLISHED("Published"),
    UNPUBLISHED("Unpublished");

    @JsonValue
    private final String value;

    private ProductVariantStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ProductVariantStatus> fromValue(String value) {
        for (ProductVariantStatus o: ProductVariantStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
