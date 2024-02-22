/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * PurchaseOrderStatus - Current state of the purchase order
 */
public enum PurchaseOrderStatus {
    UNKNOWN("Unknown"),
    DRAFT("Draft"),
    OPEN("Open"),
    CLOSED("Closed"),
    VOID_("Void");

    @JsonValue
    private final String value;

    private PurchaseOrderStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
