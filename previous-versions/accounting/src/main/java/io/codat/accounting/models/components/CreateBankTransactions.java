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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CreateBankTransactions {

    /**
     * Unique identifier for a bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountId")
    private Optional<String> accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transactions")
    private Optional<? extends List<CreateBankAccountTransaction>> transactions;

    @JsonCreator
    public CreateBankTransactions(
            @JsonProperty("accountId") Optional<String> accountId,
            @JsonProperty("transactions") Optional<? extends List<CreateBankAccountTransaction>> transactions) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(transactions, "transactions");
        this.accountId = accountId;
        this.transactions = transactions;
    }
    
    public CreateBankTransactions() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for a bank account.
     */
    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CreateBankAccountTransaction>> transactions() {
        return (Optional<List<CreateBankAccountTransaction>>) transactions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a bank account.
     */
    public CreateBankTransactions withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * Unique identifier for a bank account.
     */
    public CreateBankTransactions withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public CreateBankTransactions withTransactions(List<CreateBankAccountTransaction> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = Optional.ofNullable(transactions);
        return this;
    }

    public CreateBankTransactions withTransactions(Optional<? extends List<CreateBankAccountTransaction>> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
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
        CreateBankTransactions other = (CreateBankTransactions) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.transactions, other.transactions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            transactions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankTransactions.class,
                "accountId", accountId,
                "transactions", transactions);
    }
    
    public final static class Builder {
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<? extends List<CreateBankAccountTransaction>> transactions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a bank account.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        /**
         * Unique identifier for a bank account.
         */
        public Builder accountId(Optional<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder transactions(List<CreateBankAccountTransaction> transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = Optional.ofNullable(transactions);
            return this;
        }

        public Builder transactions(Optional<? extends List<CreateBankAccountTransaction>> transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = transactions;
            return this;
        }
        
        public CreateBankTransactions build() {
            return new CreateBankTransactions(
                accountId,
                transactions);
        }
    }
}

