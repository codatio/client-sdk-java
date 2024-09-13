/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SourceType - The type of platform of the connection.
 */
public enum SourceType {
    ACCOUNTING("Accounting"),
    BANKING("Banking"),
    BANK_FEED("BankFeed"),
    COMMERCE("Commerce"),
    EXPENSE("Expense"),
    OTHER("Other"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private SourceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
