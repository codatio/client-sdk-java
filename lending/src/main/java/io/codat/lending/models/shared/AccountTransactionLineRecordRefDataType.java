/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AccountTransactionLineRecordRefDataType - Name of underlying data type.
 */
public enum AccountTransactionLineRecordRefDataType {
    BANK_TRANSACTIONS("bankTransactions"),
    BILL_CREDIT_NOTES("billCreditNotes"),
    BILL_PAYMENTS("billPayments"),
    BILLS("bills"),
    CREDIT_NOTES("creditNotes"),
    DIRECT_COSTS("directCosts"),
    DIRECT_INCOMES("directIncomes"),
    INVOICES("invoices"),
    JOURNAL_ENTRIES("journalEntries"),
    PAYMENTS("payments"),
    TRANSFERS("transfers");

    @JsonValue
    private final String value;

    private AccountTransactionLineRecordRefDataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
