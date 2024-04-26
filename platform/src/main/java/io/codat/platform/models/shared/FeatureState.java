/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

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
