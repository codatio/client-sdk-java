/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * TransactionStatus - Status of the transaction.
 */
public enum TransactionStatus {
    UNKNOWN("Unknown"),
    PENDING("Pending"),
    VALIDATION_ERROR("ValidationError"),
    COMPLETED("Completed"),
    PUSH_ERROR("PushError");

    @JsonValue
    private final String value;

    private TransactionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
