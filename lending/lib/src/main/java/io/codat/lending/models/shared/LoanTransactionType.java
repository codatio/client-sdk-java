/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;

/**
 * LoanTransactionType - The type of loan transaction.
 */
public enum LoanTransactionType {
    INVESTMENT("Investment"),
    REPAYMENT("Repayment"),
    INTEREST("Interest"),
    ACCURED_INTEREST("AccuredInterest");

    @JsonValue
    private final String value;

    private LoanTransactionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}