/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class BankTransactions {

    /**
     * The amount transacted in the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends BigDecimal> amount;

    /**
     * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends BigDecimal> balance;

    /**
     * The giving or receiving party such as a person or organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("counterparty")
    private JsonNullable<String> counterparty;

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
    private Optional<String> date;

    /**
     * Description of the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reconciled")
    private JsonNullable<Boolean> reconciled;

    /**
     * An optional reference to the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private JsonNullable<String> reference;

    /**
     * Type of transaction for the bank statement line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactionType")
    private JsonNullable<? extends BankTransactionType> transactionType;

    @JsonCreator
    public BankTransactions(
            @JsonProperty("amount") Optional<? extends BigDecimal> amount,
            @JsonProperty("balance") Optional<? extends BigDecimal> balance,
            @JsonProperty("counterparty") JsonNullable<String> counterparty,
            @JsonProperty("date") Optional<String> date,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("reconciled") JsonNullable<Boolean> reconciled,
            @JsonProperty("reference") JsonNullable<String> reference,
            @JsonProperty("transactionType") JsonNullable<? extends BankTransactionType> transactionType) {
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
    
    public BankTransactions() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
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
     * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> balance() {
        return (Optional<BigDecimal>) balance;
    }

    /**
     * The giving or receiving party such as a person or organization.
     */
    @JsonIgnore
    public JsonNullable<String> counterparty() {
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
    @JsonIgnore
    public Optional<String> date() {
        return date;
    }

    /**
     * Description of the bank transaction.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<Boolean> reconciled() {
        return reconciled;
    }

    /**
     * An optional reference to the bank transaction.
     */
    @JsonIgnore
    public JsonNullable<String> reference() {
        return reference;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BankTransactionType> transactionType() {
        return (JsonNullable<BankTransactionType>) transactionType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public BankTransactions withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

        /**
         * The amount transacted in the bank transaction.
         */
    public BankTransactions withAmount(double amount) {
        this.amount = Optional.of(BigDecimal.valueOf(amount));
        return this;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public BankTransactions withAmount(Optional<? extends BigDecimal> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
     */
    public BankTransactions withBalance(BigDecimal balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

        /**
         * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
         */
    public BankTransactions withBalance(double balance) {
        this.balance = Optional.of(BigDecimal.valueOf(balance));
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
     */
    public BankTransactions withBalance(Optional<? extends BigDecimal> balance) {
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
    public BankTransactions withCounterparty(JsonNullable<String> counterparty) {
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
    public BankTransactions withDate(Optional<String> date) {
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
    public BankTransactions withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    public BankTransactions withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    public BankTransactions withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    public BankTransactions withReconciled(boolean reconciled) {
        Utils.checkNotNull(reconciled, "reconciled");
        this.reconciled = JsonNullable.of(reconciled);
        return this;
    }

    /**
     * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
     */
    public BankTransactions withReconciled(JsonNullable<Boolean> reconciled) {
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
    public BankTransactions withReference(JsonNullable<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    public BankTransactions withTransactionType(BankTransactionType transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = JsonNullable.of(transactionType);
        return this;
    }

    /**
     * Type of transaction for the bank statement line.
     */
    public BankTransactions withTransactionType(JsonNullable<? extends BankTransactionType> transactionType) {
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
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.counterparty, other.counterparty) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.reconciled, other.reconciled) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.transactionType, other.transactionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends BigDecimal> amount = Optional.empty();
 
        private Optional<? extends BigDecimal> balance = Optional.empty();
 
        private JsonNullable<String> counterparty = JsonNullable.undefined();
 
        private Optional<String> date = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<Boolean> reconciled = JsonNullable.undefined();
 
        private JsonNullable<String> reference = JsonNullable.undefined();
 
        private JsonNullable<? extends BankTransactionType> transactionType = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
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
         * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
         */
        public Builder balance(BigDecimal balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
         */
        public Builder balance(double balance) {
            this.balance = Optional.of(BigDecimal.valueOf(balance));
            return this;
        }

        /**
         * The remaining balance in the account with ID `accountId`. This field is optional for QuickBooks Online but is required for Xero, Sage, NetSuite, Exact, and FreeAgent.
         */
        public Builder balance(Optional<? extends BigDecimal> balance) {
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
        public Builder counterparty(JsonNullable<String> counterparty) {
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
        public Builder date(Optional<String> date) {
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
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Identifier for the bank account transaction, unique for the company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the bank account transaction, unique for the company in the accounting software.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
         */
        public Builder reconciled(boolean reconciled) {
            Utils.checkNotNull(reconciled, "reconciled");
            this.reconciled = JsonNullable.of(reconciled);
            return this;
        }

        /**
         * `True` if the bank transaction has been [reconciled](https://www.xero.com/uk/guides/what-is-bank-reconciliation/) in the accounting software.
         */
        public Builder reconciled(JsonNullable<Boolean> reconciled) {
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
        public Builder reference(JsonNullable<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        /**
         * Type of transaction for the bank statement line.
         */
        public Builder transactionType(BankTransactionType transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = JsonNullable.of(transactionType);
            return this;
        }

        /**
         * Type of transaction for the bank statement line.
         */
        public Builder transactionType(JsonNullable<? extends BankTransactionType> transactionType) {
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

