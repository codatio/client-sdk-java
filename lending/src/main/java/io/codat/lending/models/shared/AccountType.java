/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * AccountType - Type of account
 */
public enum AccountType {
    UNKNOWN("Unknown"),
    ASSET("Asset"),
    EXPENSE("Expense"),
    INCOME("Income"),
    LIABILITY("Liability"),
    EQUITY("Equity");

    @JsonValue
    private final String value;

    private AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
