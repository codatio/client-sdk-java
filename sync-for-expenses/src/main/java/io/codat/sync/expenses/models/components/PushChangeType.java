/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * PushChangeType - Type of change being applied to record in third party platform.
 */
public enum PushChangeType {
    UNKNOWN("Unknown"),
    CREATED("Created"),
    MODIFIED("Modified"),
    DELETED("Deleted"),
    ATTACHMENT_UPLOADED("AttachmentUploaded");

    @JsonValue
    private final String value;

    private PushChangeType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
