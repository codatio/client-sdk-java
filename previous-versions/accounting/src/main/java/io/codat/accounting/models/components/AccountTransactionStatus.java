/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * AccountTransactionStatus - The status of the account transaction.
 */
public enum AccountTransactionStatus {
    UNKNOWN("Unknown"),
    UNRECONCILED("Unreconciled"),
    RECONCILED("Reconciled"),
    VOID_("Void");

    @JsonValue
    private final String value;

    private AccountTransactionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
