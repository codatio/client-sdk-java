/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * InvoiceToType - The type of contact.
 */
public enum InvoiceToType {
    CUSTOMER("customer");

    @JsonValue
    private final String value;

    private InvoiceToType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
