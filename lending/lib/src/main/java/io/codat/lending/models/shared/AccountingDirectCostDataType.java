/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;

/**
 * AccountingDirectCostDataType - Allowed name of the 'dataType'.
 */
public enum AccountingDirectCostDataType {
    CUSTOMERS("customers"),
    SUPPLIERS("suppliers");

    @JsonValue
    private final String value;

    private AccountingDirectCostDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
