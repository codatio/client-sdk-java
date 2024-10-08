/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BillCreditNoteStatus - Current state of the bill credit note
 */
public enum BillCreditNoteStatus {
    UNKNOWN("Unknown"),
    DRAFT("Draft"),
    SUBMITTED("Submitted"),
    PAID("Paid"),
    VOID("Void"),
    PARTIALLY_PAID("PartiallyPaid");

    @JsonValue
    private final String value;

    private BillCreditNoteStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
