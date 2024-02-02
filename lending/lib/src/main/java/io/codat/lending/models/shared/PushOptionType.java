/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;

/**
 * PushOptionType - The option type.
 */
public enum PushOptionType {
    ARRAY("Array"),
    OBJECT("Object"),
    STRING("String"),
    NUMBER("Number"),
    BOOLEAN_("Boolean"),
    DATE_TIME("DateTime"),
    FILE("File"),
    MULTI_PART("MultiPart");

    @JsonValue
    private final String value;

    private PushOptionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
