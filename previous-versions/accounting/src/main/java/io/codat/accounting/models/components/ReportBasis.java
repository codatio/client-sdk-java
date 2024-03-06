/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * ReportBasis - Accounting method used when aggregating the report data. In this case, `Cash`.
 */
public enum ReportBasis {
    UNKNOWN("Unknown"),
    ACCRUAL("Accrual"),
    CASH("Cash");

    @JsonValue
    private final String value;

    private ReportBasis(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}