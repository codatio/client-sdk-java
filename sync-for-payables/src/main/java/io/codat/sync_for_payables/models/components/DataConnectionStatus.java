/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_payables.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.sync_for_payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * DataConnectionStatus - The current authorization status of the data connection.
 */
public enum DataConnectionStatus {
    PENDING_AUTH("PendingAuth"),
    LINKED("Linked"),
    UNLINKED("Unlinked"),
    DEAUTHORIZED("Deauthorized");

    @JsonValue
    private final String value;

    private DataConnectionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
