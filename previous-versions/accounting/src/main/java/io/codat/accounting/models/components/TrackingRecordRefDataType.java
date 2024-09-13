/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TrackingRecordRefDataType - Name of underlying data type.
 */
public enum TrackingRecordRefDataType {
    CUSTOMERS("customers"),
    SUPPLIERS("suppliers"),
    TRACKING_CATEGORIES("trackingCategories");

    @JsonValue
    private final String value;

    private TrackingRecordRefDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
