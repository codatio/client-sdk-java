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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class DataSource {

    /**
     * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private Optional<? extends List<Accounts>> accounts;

    @JsonCreator
    public DataSource(
            @JsonProperty("accounts") Optional<? extends List<Accounts>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
    }
    
    public DataSource() {
        this(Optional.empty());
    }

    /**
     * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Accounts>> accounts() {
        return (Optional<List<Accounts>>) accounts;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
     */
    public DataSource withAccounts(List<Accounts> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = Optional.ofNullable(accounts);
        return this;
    }

    /**
     * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
     */
    public DataSource withAccounts(Optional<? extends List<Accounts>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
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
        DataSource other = (DataSource) o;
        return 
            Objects.deepEquals(this.accounts, other.accounts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accounts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataSource.class,
                "accounts", accounts);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Accounts>> accounts = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
         */
        public Builder accounts(List<Accounts> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = Optional.ofNullable(accounts);
            return this;
        }

        /**
         * An array containing bank account data for each connected banking data source that have the following data types enabled: `banking-accounts`, `banking-transactions`.
         */
        public Builder accounts(Optional<? extends List<Accounts>> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = accounts;
            return this;
        }
        
        public DataSource build() {
            return new DataSource(
                accounts);
        }
    }
}

