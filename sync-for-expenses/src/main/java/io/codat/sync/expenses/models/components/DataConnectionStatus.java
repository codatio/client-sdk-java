/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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
