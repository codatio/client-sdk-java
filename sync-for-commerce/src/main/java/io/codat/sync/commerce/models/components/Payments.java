/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Payments {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts;

    /**
     * Boolean indicator for syncing sales.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncPayments")
    private Optional<? extends Boolean> syncPayments;

    public Payments(
            @JsonProperty("accounts") JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts,
            @JsonProperty("syncPayments") Optional<? extends Boolean> syncPayments) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(syncPayments, "syncPayments");
        this.accounts = accounts;
        this.syncPayments = syncPayments;
    }

    public JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts() {
        return accounts;
    }

    /**
     * Boolean indicator for syncing sales.
     */
    public Optional<? extends Boolean> syncPayments() {
        return syncPayments;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Payments withAccounts(java.util.Map<String, ConfigAccount> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = JsonNullable.of(accounts);
        return this;
    }

    public Payments withAccounts(JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
        return this;
    }

    /**
     * Boolean indicator for syncing sales.
     */
    public Payments withSyncPayments(boolean syncPayments) {
        Utils.checkNotNull(syncPayments, "syncPayments");
        this.syncPayments = Optional.ofNullable(syncPayments);
        return this;
    }
    
    /**
     * Boolean indicator for syncing sales.
     */
    public Payments withSyncPayments(Optional<? extends Boolean> syncPayments) {
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
        Payments other = (Payments) o;
        return 
            java.util.Objects.deepEquals(this.accounts, other.accounts) &&
            java.util.Objects.deepEquals(this.syncPayments, other.syncPayments);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accounts,
            syncPayments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Payments.class,
                "accounts", accounts,
                "syncPayments", syncPayments);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts = JsonNullable.undefined();
 
        private Optional<? extends Boolean> syncPayments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accounts(java.util.Map<String, ConfigAccount> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = JsonNullable.of(accounts);
            return this;
        }

        public Builder accounts(JsonNullable<? extends java.util.Map<String, ConfigAccount>> accounts) {
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
        public Builder syncPayments(Optional<? extends Boolean> syncPayments) {
            Utils.checkNotNull(syncPayments, "syncPayments");
            this.syncPayments = syncPayments;
            return this;
        }
        
        public Payments build() {
            return new Payments(
                accounts,
                syncPayments);
        }
    }
}

