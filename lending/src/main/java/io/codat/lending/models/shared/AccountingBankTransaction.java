/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountingBankTransaction - &gt; **Accessing Bank Accounts through Banking API**
 * &gt; 
 * &gt; This datatype was originally used for accessing bank account data both in accounting integrations and open banking aggregators. 
 * &gt;
 * &gt; To view bank account data through the Banking API, please refer to the new [Banking: Transaction](https://docs.codat.io/lending-api#/operations/list-transactions) data type.
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
    private JsonNullable<String> accountId;

    /**
     * The amount transacted in the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends BigDecimal> amount;

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends BigDecimal> balance;

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
    private Optional<String> clearedOnDate;

    /**
     * Description of the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Identifier for the bank transaction, unique to the company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reconciled")
    private Optional<Boolean> reconciled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Type of transaction for the bank statement line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionType")
    private Optional<? extends BankTransactionType> transactionType;

    @JsonCreator
    public AccountingBankTransaction(
            @JsonProperty("accountId") JsonNullable<String> accountId,
            @JsonProperty("amount") Optional<? extends BigDecimal> amount,
            @JsonProperty("balance") Optional<? extends BigDecimal> balance,
            @JsonProperty("clearedOnDate") Optional<String> clearedOnDate,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("reconciled") Optional<Boolean> reconciled,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
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
    
    public AccountingBankTransaction() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier to the `accountId` the bank transactions originates from.
     */
    @JsonIgnore
    public JsonNullable<String> accountId() {
        return accountId;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> amount() {
        return (Optional<BigDecimal>) amount;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> balance() {
        return (Optional<BigDecimal>) balance;
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
    @JsonIgnore
    public Optional<String> clearedOnDate() {
        return clearedOnDate;
    }

    /**
     * Description of the bank transaction.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Identifier for the bank transaction, unique to the company in the accounting software.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    @JsonIgnore
    public Optional<Boolean> reconciled() {
        return reconciled;
    }

    @JsonIgnore
    public Optional<String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankTransactionType> transactionType() {
        return (Optional<BankTransactionType>) transactionType;
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
    public AccountingBankTransaction withAccountId(JsonNullable<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public AccountingBankTransaction withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

        /**
         * The amount transacted in the bank transaction.
         */
    public AccountingBankTransaction withAmount(double amount) {
        this.amount = Optional.of(BigDecimal.valueOf(amount));
        return this;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public AccountingBankTransaction withAmount(Optional<? extends BigDecimal> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public AccountingBankTransaction withBalance(BigDecimal balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
    public AccountingBankTransaction withBalance(double balance) {
        this.balance = Optional.of(BigDecimal.valueOf(balance));
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public AccountingBankTransaction withBalance(Optional<? extends BigDecimal> balance) {
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
    public AccountingBankTransaction withClearedOnDate(Optional<String> clearedOnDate) {
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
    public AccountingBankTransaction withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Identifier for the bank transaction, unique to the company in the accounting software.
     */
    public AccountingBankTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the bank transaction, unique to the company in the accounting software.
     */
    public AccountingBankTransaction withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingBankTransaction withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public AccountingBankTransaction withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    public AccountingBankTransaction withReconciled(boolean reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = Optional.ofNullable(reconciled);
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    public AccountingBankTransaction withReconciled(Optional<Boolean> reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = reconciled;
        return this;
    }

    public AccountingBankTransaction withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public AccountingBankTransaction withSourceModifiedDate(Optional<String> sourceModifiedDate) {
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
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.clearedOnDate, other.clearedOnDate) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.reconciled, other.reconciled) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.transactionType, other.transactionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private JsonNullable<String> accountId = JsonNullable.undefined();
 
        private Optional<? extends BigDecimal> amount = Optional.empty();
 
        private Optional<? extends BigDecimal> balance = Optional.empty();
 
        private Optional<String> clearedOnDate = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private Optional<Boolean> reconciled = Optional.empty();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
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
        public Builder accountId(JsonNullable<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The amount transacted in the bank transaction.
         */
        public Builder amount(BigDecimal amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * The amount transacted in the bank transaction.
         */
        public Builder amount(double amount) {
            this.amount = Optional.of(BigDecimal.valueOf(amount));
            return this;
        }

        /**
         * The amount transacted in the bank transaction.
         */
        public Builder amount(Optional<? extends BigDecimal> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
        public Builder balance(BigDecimal balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
        public Builder balance(double balance) {
            this.balance = Optional.of(BigDecimal.valueOf(balance));
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
        public Builder balance(Optional<? extends BigDecimal> balance) {
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
        public Builder clearedOnDate(Optional<String> clearedOnDate) {
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
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Identifier for the bank transaction, unique to the company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the bank transaction, unique to the company in the accounting software.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
         */
        public Builder reconciled(boolean reconciled) {
            Utils.checkNotNull(reconciled, "reconciled");
            this.reconciled = Optional.ofNullable(reconciled);
            return this;
        }

        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
         */
        public Builder reconciled(Optional<Boolean> reconciled) {
            Utils.checkNotNull(reconciled, "reconciled");
            this.reconciled = reconciled;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }

        public Builder sourceModifiedDate(Optional<String> sourceModifiedDate) {
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

