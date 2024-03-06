/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * ItemReceiptLineItemDataType - Allowed name of the 'dataType'.
 */
public enum ItemReceiptLineItemDataType {
    PURCHASE_ORDERS("purchaseOrders");

    @JsonValue
    private final String value;

    private ItemReceiptLineItemDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}