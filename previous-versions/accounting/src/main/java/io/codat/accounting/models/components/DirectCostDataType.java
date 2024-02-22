/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * DirectCostDataType - Allowed name of the 'dataType'.
 */
public enum DirectCostDataType {
    CUSTOMERS("customers"),
    SUPPLIERS("suppliers");

    @JsonValue
    private final String value;

    private DirectCostDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
