/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.banking.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.banking.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * AccountType - The type of transactions and balances on the account.  
 * For Credit accounts, positive balances are liabilities, and positive transactions **reduce** liabilities.  
 * For Debit accounts, positive balances are assets, and positive transactions **increase** assets.
 */
public enum AccountType {
    UNKNOWN("Unknown"),
    CREDIT("Credit"),
    DEBIT("Debit");

    @JsonValue
    private final String value;

    private AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
