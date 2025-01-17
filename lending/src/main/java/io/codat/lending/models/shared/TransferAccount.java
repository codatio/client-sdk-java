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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

/**
 * TransferAccount - Account details of the account sending or receiving the transfer.
 */

public class TransferAccount {

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountingRecordRef> accountRef;

    /**
     * The amount transferred between accounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends BigDecimal> amount;

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    @JsonCreator
    public TransferAccount(
            @JsonProperty("accountRef") Optional<? extends AccountingRecordRef> accountRef,
            @JsonProperty("amount") Optional<? extends BigDecimal> amount,
            @JsonProperty("currency") Optional<String> currency) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currency, "currency");
        this.accountRef = accountRef;
        this.amount = amount;
        this.currency = currency;
    }
    
    public TransferAccount() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingRecordRef> accountRef() {
        return (Optional<AccountingRecordRef>) accountRef;
    }

    /**
     * The amount transferred between accounts.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> amount() {
        return (Optional<BigDecimal>) amount;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    public TransferAccount withAccountRef(AccountingRecordRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }

    /**
     * Links the current record to the underlying record or data type that created it. 
     * 
     * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
     */
    public TransferAccount withAccountRef(Optional<? extends AccountingRecordRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * The amount transferred between accounts.
     */
    public TransferAccount withAmount(BigDecimal amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

        /**
         * The amount transferred between accounts.
         */
    public TransferAccount withAmount(double amount) {
        this.amount = Optional.of(BigDecimal.valueOf(amount));
        return this;
    }

    /**
     * The amount transferred between accounts.
     */
    public TransferAccount withAmount(Optional<? extends BigDecimal> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public TransferAccount withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public TransferAccount withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
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
        TransferAccount other = (TransferAccount) o;
        return 
            Objects.deepEquals(this.accountRef, other.accountRef) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currency, other.currency);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountRef,
            amount,
            currency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferAccount.class,
                "accountRef", accountRef,
                "amount", amount,
                "currency", currency);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingRecordRef> accountRef = Optional.empty();
 
        private Optional<? extends BigDecimal> amount = Optional.empty();
 
        private Optional<String> currency = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Links the current record to the underlying record or data type that created it. 
         * 
         * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
         */
        public Builder accountRef(AccountingRecordRef accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = Optional.ofNullable(accountRef);
            return this;
        }

        /**
         * Links the current record to the underlying record or data type that created it. 
         * 
         * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
         */
        public Builder accountRef(Optional<? extends AccountingRecordRef> accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = accountRef;
            return this;
        }

        /**
         * The amount transferred between accounts.
         */
        public Builder amount(BigDecimal amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * The amount transferred between accounts.
         */
        public Builder amount(double amount) {
            this.amount = Optional.of(BigDecimal.valueOf(amount));
            return this;
        }

        /**
         * The amount transferred between accounts.
         */
        public Builder amount(Optional<? extends BigDecimal> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }
        
        public TransferAccount build() {
            return new TransferAccount(
                accountRef,
                amount,
                currency);
        }
    }
}

