/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class BankTransactions {

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
     * The giving or receiving party such as a person or organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("counterparty")
    private JsonNullable<? extends String> counterparty;

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
    @JsonProperty("date")
    private Optional<? extends String> date;

    /**
     * Description of the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reconciled")
    private Optional<? extends Boolean> reconciled;

    /**
     * An optional reference to the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private JsonNullable<? extends String> reference;

    /**
     * Type of transaction for the bank statement line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionType")
    private Optional<? extends BankTransactionType> transactionType;

    public BankTransactions(
            @JsonProperty("amount") Optional<? extends Double> amount,
            @JsonProperty("balance") Optional<? extends Double> balance,
            @JsonProperty("counterparty") JsonNullable<? extends String> counterparty,
            @JsonProperty("date") Optional<? extends String> date,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("reconciled") Optional<? extends Boolean> reconciled,
            @JsonProperty("reference") JsonNullable<? extends String> reference,
            @JsonProperty("transactionType") Optional<? extends BankTransactionType> transactionType) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(counterparty, "counterparty");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(reconciled, "reconciled");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(transactionType, "transactionType");
        this.amount = amount;
        this.balance = balance;
        this.counterparty = counterparty;
        this.date = date;
        this.description = description;
        this.id = id;
        this.reconciled = reconciled;
        this.reference = reference;
        this.transactionType = transactionType;
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
     * The giving or receiving party such as a person or organization.
     */
    public JsonNullable<? extends String> counterparty() {
        return counterparty;
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
    public Optional<? extends String> date() {
        return date;
    }

    /**
     * Description of the bank transaction.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public Optional<? extends Boolean> reconciled() {
        return reconciled;
    }

    /**
     * An optional reference to the bank transaction.
     */
    public JsonNullable<? extends String> reference() {
        return reference;
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
     * The amount transacted in the bank transaction.
     */
    public BankTransactions withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    /**
     * The amount transacted in the bank transaction.
     */
    public BankTransactions withAmount(Optional<? extends Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public BankTransactions withBalance(double balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }
    
    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public BankTransactions withBalance(Optional<? extends Double> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * The giving or receiving party such as a person or organization.
     */
    public BankTransactions withCounterparty(String counterparty) {
        Utils.checkNotNull(counterparty, "counterparty");
        this.counterparty = JsonNullable.of(counterparty);
        return this;
    }

    /**
     * The giving or receiving party such as a person or organization.
     */
    public BankTransactions withCounterparty(JsonNullable<? extends String> counterparty) {
        Utils.checkNotNull(counterparty, "counterparty");
        this.counterparty = counterparty;
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
    public BankTransactions withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
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
    public BankTransactions withDate(Optional<? extends String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public BankTransactions withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public BankTransactions withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting platform.
     */
    public BankTransactions withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Identifier for the bank account transaction, unique for the company in the accounting platform.
     */
    public BankTransactions withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public BankTransactions withReconciled(boolean reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = Optional.ofNullable(reconciled);
        return this;
    }
    
    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting platform.
     */
    public BankTransactions withReconciled(Optional<? extends Boolean> reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = reconciled;
        return this;
    }

    /**
     * An optional reference to the bank transaction.
     */
    public BankTransactions withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = JsonNullable.of(reference);
        return this;
    }

    /**
     * An optional reference to the bank transaction.
     */
    public BankTransactions withReference(JsonNullable<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    public BankTransactions withTransactionType(BankTransactionType transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = Optional.ofNullable(transactionType);
        return this;
    }
    
    /**
     * Type of transaction for the bank statement line.
     */
    public BankTransactions withTransactionType(Optional<? extends BankTransactionType> transactionType) {
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
        BankTransactions other = (BankTransactions) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.counterparty, other.counterparty) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.reconciled, other.reconciled) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.transactionType, other.transactionType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            balance,
            counterparty,
            date,
            description,
            id,
            reconciled,
            reference,
            transactionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankTransactions.class,
                "amount", amount,
                "balance", balance,
                "counterparty", counterparty,
                "date", date,
                "description", description,
                "id", id,
                "reconciled", reconciled,
                "reference", reference,
                "transactionType", transactionType);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> amount = Optional.empty();
 
        private Optional<? extends Double> balance = Optional.empty();
 
        private JsonNullable<? extends String> counterparty = JsonNullable.undefined();
 
        private Optional<? extends String> date = Optional.empty();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends Boolean> reconciled = Optional.empty();
 
        private JsonNullable<? extends String> reference = JsonNullable.undefined();
 
        private Optional<? extends BankTransactionType> transactionType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
         * The giving or receiving party such as a person or organization.
         */
        public Builder counterparty(String counterparty) {
            Utils.checkNotNull(counterparty, "counterparty");
            this.counterparty = JsonNullable.of(counterparty);
            return this;
        }

        /**
         * The giving or receiving party such as a person or organization.
         */
        public Builder counterparty(JsonNullable<? extends String> counterparty) {
            Utils.checkNotNull(counterparty, "counterparty");
            this.counterparty = counterparty;
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
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
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
        public Builder date(Optional<? extends String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
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
         * Identifier for the bank account transaction, unique for the company in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Identifier for the bank account transaction, unique for the company in the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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

        /**
         * An optional reference to the bank transaction.
         */
        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = JsonNullable.of(reference);
            return this;
        }

        /**
         * An optional reference to the bank transaction.
         */
        public Builder reference(JsonNullable<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
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
        
        public BankTransactions build() {
            return new BankTransactions(
                amount,
                balance,
                counterparty,
                date,
                description,
                id,
                reconciled,
                reference,
                transactionType);
        }
    }
}
