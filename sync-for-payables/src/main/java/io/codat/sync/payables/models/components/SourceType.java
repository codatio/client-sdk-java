/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

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
