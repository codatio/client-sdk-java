/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BankAccountType - The type of transactions and balances on the account.  
 * For Credit accounts, positive balances are liabilities, and positive transactions **reduce** liabilities.  
 * For Debit accounts, positive balances are assets, and positive transactions **increase** assets.
 */
public enum BankAccountType {
    UNKNOWN("Unknown"),
    CREDIT("Credit"),
    DEBIT("Debit");

    @JsonValue
    private final String value;

    private BankAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
