/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SalesOrderRefDataType - The underlying data type associated to the reference `id`.
 */
public enum SalesOrderRefDataType {
    SALES_ORDERS("salesOrders");

    @JsonValue
    private final String value;

    private SalesOrderRefDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
