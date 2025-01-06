/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * WebLinkType - The type of the weblink.
 */
public enum WebLinkType {
    WEBSITE("Website"),
    SOCIAL("Social"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private WebLinkType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<WebLinkType> fromValue(String value) {
        for (WebLinkType o: WebLinkType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
