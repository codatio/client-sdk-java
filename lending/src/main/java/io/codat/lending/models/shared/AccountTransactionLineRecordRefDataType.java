/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

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
    
    public static Optional<AccountTransactionLineRecordRefDataType> fromValue(String value) {
        for (AccountTransactionLineRecordRefDataType o: AccountTransactionLineRecordRefDataType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
