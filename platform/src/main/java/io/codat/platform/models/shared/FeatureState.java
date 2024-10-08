/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * FeatureState - The current release state of the feature.
 */
public enum FeatureState {
    RELEASE("Release"),
    ALPHA("Alpha"),
    BETA("Beta"),
    DEPRECATED("Deprecated"),
    NOT_SUPPORTED("NotSupported"),
    NOT_IMPLEMENTED("NotImplemented");

    @JsonValue
    private final String value;

    private FeatureState(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
