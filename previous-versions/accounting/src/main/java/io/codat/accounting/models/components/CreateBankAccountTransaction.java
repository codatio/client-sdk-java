/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateBankAccountTransaction {

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

    @JsonCreator
    public CreateBankAccountTransaction(
            @JsonProperty("amount") Optional<? extends BigDecimal> amount,
            @JsonProperty("balance") Optional<? extends BigDecimal> balance,
            @JsonProperty("date") Optional<String> date,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.description = description;
        this.id = id;
    }
    
    public CreateBankAccountTransaction() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public CreateBankAccountTransaction withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

        /**
         * The amount transacted in the bank transaction.
         */
    public CreateBankAccountTransaction withAmount(double amount) {
        this.amount = Optional.of(BigDecimal.valueOf(amount));
        return this;
    }

    /**
     * The amount transacted in the bank transaction.
     */
    public CreateBankAccountTransaction withAmount(Optional<? extends BigDecimal> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public CreateBankAccountTransaction withBalance(BigDecimal balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

        /**
         * The remaining balance in the account with ID `accountId`.
         */
    public CreateBankAccountTransaction withBalance(double balance) {
        this.balance = Optional.of(BigDecimal.valueOf(balance));
        return this;
    }

    /**
     * The remaining balance in the account with ID `accountId`.
     */
    public CreateBankAccountTransaction withBalance(Optional<? extends BigDecimal> balance) {
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
    public CreateBankAccountTransaction withDate(String date) {
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
    public CreateBankAccountTransaction withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public CreateBankAccountTransaction withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the bank transaction.
     */
    public CreateBankAccountTransaction withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    public CreateBankAccountTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the bank account transaction, unique for the company in the accounting software.
     */
    public CreateBankAccountTransaction withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        CreateBankAccountTransaction other = (CreateBankAccountTransaction) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            balance,
            date,
            description,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountTransaction.class,
                "amount", amount,
                "balance", balance,
                "date", date,
                "description", description,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends BigDecimal> amount = Optional.empty();
 
        private Optional<? extends BigDecimal> balance = Optional.empty();
 
        private Optional<String> date = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();  
        
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
        
        public CreateBankAccountTransaction build() {
            return new CreateBankAccountTransaction(
                amount,
                balance,
                date,
                description,
                id);
        }
    }
}

