/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AccountType - The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
 */
public enum AccountType {
    CHECKING("checking"),
    SAVINGS("savings"),
    LOAN("loan"),
    CREDIT_CARD("creditCard"),
    PREPAID_CARD("prepaidCard");

    @JsonValue
    private final String value;

    private AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}