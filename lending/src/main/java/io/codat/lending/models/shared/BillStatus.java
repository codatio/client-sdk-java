/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * BillStatus - Current state of the bill.
 */
public enum BillStatus {
    UNKNOWN("Unknown"),
    OPEN("Open"),
    PARTIALLY_PAID("PartiallyPaid"),
    PAID("Paid"),
    VOID_("Void"),
    DRAFT("Draft");

    @JsonValue
    private final String value;

    private BillStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
