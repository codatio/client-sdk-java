/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PaymentsConfiguration {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private JsonNullable<? extends Map<String, AccountConfiguration>> accounts;

    /**
     * Boolean indicator for syncing sales.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncPayments")
    private Optional<Boolean> syncPayments;

    @JsonCreator
    public PaymentsConfiguration(
            @JsonProperty("accounts") JsonNullable<? extends Map<String, AccountConfiguration>> accounts,
            @JsonProperty("syncPayments") Optional<Boolean> syncPayments) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(syncPayments, "syncPayments");
        this.accounts = accounts;
        this.syncPayments = syncPayments;
    }
    
    public PaymentsConfiguration() {
        this(JsonNullable.undefined(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, AccountConfiguration>> accounts() {
        return (JsonNullable<Map<String, AccountConfiguration>>) accounts;
    }

    /**
     * Boolean indicator for syncing sales.
     */
    @JsonIgnore
    public Optional<Boolean> syncPayments() {
        return syncPayments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentsConfiguration withAccounts(Map<String, AccountConfiguration> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = JsonNullable.of(accounts);
        return this;
    }

    public PaymentsConfiguration withAccounts(JsonNullable<? extends Map<String, AccountConfiguration>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
        return this;
    }

    /**
     * Boolean indicator for syncing sales.
     */
    public PaymentsConfiguration withSyncPayments(boolean syncPayments) {
        Utils.checkNotNull(syncPayments, "syncPayments");
        this.syncPayments = Optional.ofNullable(syncPayments);
        return this;
    }

    /**
     * Boolean indicator for syncing sales.
     */
    public PaymentsConfiguration withSyncPayments(Optional<Boolean> syncPayments) {
        Utils.checkNotNull(syncPayments, "syncPayments");
        this.syncPayments = syncPayments;
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
        PaymentsConfiguration other = (PaymentsConfiguration) o;
        return 
            Objects.deepEquals(this.accounts, other.accounts) &&
            Objects.deepEquals(this.syncPayments, other.syncPayments);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accounts,
            syncPayments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsConfiguration.class,
                "accounts", accounts,
                "syncPayments", syncPayments);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Map<String, AccountConfiguration>> accounts = JsonNullable.undefined();
 
        private Optional<Boolean> syncPayments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accounts(Map<String, AccountConfiguration> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = JsonNullable.of(accounts);
            return this;
        }

        public Builder accounts(JsonNullable<? extends Map<String, AccountConfiguration>> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = accounts;
            return this;
        }

        /**
         * Boolean indicator for syncing sales.
         */
        public Builder syncPayments(boolean syncPayments) {
            Utils.checkNotNull(syncPayments, "syncPayments");
            this.syncPayments = Optional.ofNullable(syncPayments);
            return this;
        }

        /**
         * Boolean indicator for syncing sales.
         */
        public Builder syncPayments(Optional<Boolean> syncPayments) {
            Utils.checkNotNull(syncPayments, "syncPayments");
            this.syncPayments = syncPayments;
            return this;
        }
        
        public PaymentsConfiguration build() {
            return new PaymentsConfiguration(
                accounts,
                syncPayments);
        }
    }
}

