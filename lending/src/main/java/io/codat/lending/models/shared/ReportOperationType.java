/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ReportOperationType - The name of the report generated.
 */
public enum ReportOperationType {
    CATEGORIZED_BANK_STATEMENT("categorizedBankStatement");

    @JsonValue
    private final String value;

    private ReportOperationType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
