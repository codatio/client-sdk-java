/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountingBankTransaction - &gt; **Accessing Bank Accounts through Banking API**
 * &gt; 
 * &gt; This datatype was originally used for accessing bank account data both in accounting integrations and open banking aggregators. 
 * &gt;
 * &gt; To view bank account data through the Banking API, please refer to the new datatype [here](https://docs.codat.io/lending-api#/operations/list-all-banking-transactions)
 * 
 * &gt; View the coverage for bank transactions in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=bankTransactions" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * Transactional banking data for a specific company and account.
 * 
 * Bank transactions include the:
 * * Amount of the transaction.
 * * Current account balance.
 * * Transaction type, for example, credit, debit, or transfer.
 */

public class AccountingBankTransaction {

    /**
     * Unique identifier to the `accountId` the bank transactions originates from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountId")
    private JsonNullable<? extends String> accountId;

    /**
     * The amount transacted in the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends Double> amount;

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends Double> balance;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clearedOnDate")
    private Optional<? extends String> clearedOnDate;

    /**
     * Description of the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Identifier for the bank transaction, unique to the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reconciled")
    private Optional<? extends Boolean> reconciled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<? extends String> sourceModifiedDate;

    /**
     * Type of transaction for the bank statement line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionType")
    private Optional<? extends BankTransactionType> transactionType;

    public AccountingBankTransaction(
            @JsonProperty("accountId") JsonNullable<? extends String> accountId,
            @JsonProperty("amount") Optional<? extends Double> amount,
            @JsonProperty("balance") Optional<? extends Double> balance,
            @JsonProperty("clearedOnDate") Optional<? extends String> clearedOnDate,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate,
            @JsonProperty("reconciled") Optional<? extends Boolean> reconciled,
            @JsonProperty("sourceModifiedDate") Optional<? extends String> sourceModifiedDate,
            @JsonProperty("transactionType") Optional<? extends BankTransactionType> transactionType) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(clearedOnDate, "clearedOnDate");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(reconciled, "reconciled");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(transactionType, "transactionType");
        this.accountId = accountId;
        this.amount = amount;
        this.balance = balance;
        this.clearedOnDate = clearedOnDate;
        this.description = description;
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.reconciled = reconciled;
        this.sourceModifiedDate = sourceModifiedDate;
        this.transactionType = transactionType;
    }

    /**
     * Unique identifier to the `accountId` the bank transactions originates from.
     */
    public JsonNullable<? extends String> accountId() {
        return accountId;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public Optional<? extends Double> amount() {
        return amount;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public Optional<? extends Double> balance() {
        return balance;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Optional<? extends String> clearedOnDate() {
        return clearedOnDate;
    }

    /**
     * Description of the bank transaction.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Identifier for the bank transaction, unique to the company in the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public Optional<? extends Boolean> reconciled() {
        return reconciled;
    }

    public Optional<? extends String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    public Optional<? extends BankTransactionType> transactionType() {
        return transactionType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier to the `accountId` the bank transactions originates from.
     */
    public AccountingBankTransaction withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = JsonNullable.of(accountId);
        return this;
    }

    /**
     * Unique identifier to the `accountId` the bank transactions originates from.
     */
    public AccountingBankTransaction withAccountId(JsonNullable<? extends String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public AccountingBankTransaction withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    /**
     * The amount transacted in the bank transaction.
     */
    public AccountingBankTransaction withAmount(Optional<? extends Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public AccountingBankTransaction withBalance(double balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }
    
    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public AccountingBankTransaction withBalance(Optional<? extends Double> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingBankTransaction withClearedOnDate(String clearedOnDate) {
        Utils.checkNotNull(clearedOnDate, "clearedOnDate");
        this.clearedOnDate = Optional.ofNullable(clearedOnDate);
        return this;
    }
    
    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingBankTransaction withClearedOnDate(Optional<? extends String> clearedOnDate) {
        Utils.checkNotNull(clearedOnDate, "clearedOnDate");
        this.clearedOnDate = clearedOnDate;
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public AccountingBankTransaction withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public AccountingBankTransaction withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Identifier for the bank transaction, unique to the company in the accounting platform.
     */
    public AccountingBankTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Identifier for the bank transaction, unique to the company in the accounting platform.
     */
    public AccountingBankTransaction withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingBankTransaction withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }
    
    public AccountingBankTransaction withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public AccountingBankTransaction withReconciled(boolean reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = Optional.ofNullable(reconciled);
        return this;
    }
    
    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public AccountingBankTransaction withReconciled(Optional<? extends Boolean> reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = reconciled;
        return this;
    }

    public AccountingBankTransaction withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }
    
    public AccountingBankTransaction withSourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    public AccountingBankTransaction withTransactionType(BankTransactionType transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = Optional.ofNullable(transactionType);
        return this;
    }
    
    /**
     * Type of transaction for the bank statement line.
     */
    public AccountingBankTransaction withTransactionType(Optional<? extends BankTransactionType> transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = transactionType;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountingBankTransaction other = (AccountingBankTransaction) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.clearedOnDate, other.clearedOnDate) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            java.util.Objects.deepEquals(this.reconciled, other.reconciled) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            java.util.Objects.deepEquals(this.transactionType, other.transactionType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            amount,
            balance,
            clearedOnDate,
            description,
            id,
            modifiedDate,
            reconciled,
            sourceModifiedDate,
            transactionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingBankTransaction.class,
                "accountId", accountId,
                "amount", amount,
                "balance", balance,
                "clearedOnDate", clearedOnDate,
                "description", description,
                "id", id,
                "modifiedDate", modifiedDate,
                "reconciled", reconciled,
                "sourceModifiedDate", sourceModifiedDate,
                "transactionType", transactionType);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> accountId = JsonNullable.undefined();
 
        private Optional<? extends Double> amount = Optional.empty();
 
        private Optional<? extends Double> balance = Optional.empty();
 
        private Optional<? extends String> clearedOnDate = Optional.empty();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> modifiedDate = Optional.empty();
 
        private Optional<? extends Boolean> reconciled = Optional.empty();
 
        private Optional<? extends String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends BankTransactionType> transactionType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier to the `accountId` the bank transactions originates from.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = JsonNullable.of(accountId);
            return this;
        }

        /**
         * Unique identifier to the `accountId` the bank transactions originates from.
         */
        public Builder accountId(JsonNullable<? extends String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The amount transacted in the bank transaction.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }
        
        /**
         * The amount transacted in the bank transaction.
         */
        public Builder amount(Optional<? extends Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
        public Builder balance(double balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }
        
        /**
         * The remaining balance in the account with ID `accountId`.
         */
        public Builder balance(Optional<? extends Double> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder clearedOnDate(String clearedOnDate) {
            Utils.checkNotNull(clearedOnDate, "clearedOnDate");
            this.clearedOnDate = Optional.ofNullable(clearedOnDate);
            return this;
        }
        
        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder clearedOnDate(Optional<? extends String> clearedOnDate) {
            Utils.checkNotNull(clearedOnDate, "clearedOnDate");
            this.clearedOnDate = clearedOnDate;
            return this;
        }

        /**
         * Description of the bank transaction.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the bank transaction.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Identifier for the bank transaction, unique to the company in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Identifier for the bank transaction, unique to the company in the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }
        
        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
         */
        public Builder reconciled(boolean reconciled) {
            Utils.checkNotNull(reconciled, "reconciled");
            this.reconciled = Optional.ofNullable(reconciled);
            return this;
        }
        
        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
         */
        public Builder reconciled(Optional<? extends Boolean> reconciled) {
            Utils.checkNotNull(reconciled, "reconciled");
            this.reconciled = reconciled;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }
        
        public Builder sourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Type of transaction for the bank statement line.
         */
        public Builder transactionType(BankTransactionType transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = Optional.ofNullable(transactionType);
            return this;
        }
        
        /**
         * Type of transaction for the bank statement line.
         */
        public Builder transactionType(Optional<? extends BankTransactionType> transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = transactionType;
            return this;
        }
        
        public AccountingBankTransaction build() {
            return new AccountingBankTransaction(
                accountId,
                amount,
                balance,
                clearedOnDate,
                description,
                id,
                modifiedDate,
                reconciled,
                sourceModifiedDate,
                transactionType);
        }
    }
}
