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


public class SyncAsExpenses {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankAccountOptions")
    private Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer")
    private Optional<? extends ConfigurationCustomer> customer;

    /**
     * True if expense sync is enabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enableSync")
    private Optional<? extends Boolean> enableSync;

    /**
     * The bank account ID being synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedBankAccountId")
    private Optional<? extends String> selectedBankAccountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplier")
    private Optional<? extends ConfigurationSupplier> supplier;

    public SyncAsExpenses(
            @JsonProperty("bankAccountOptions") Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions,
            @JsonProperty("customer") Optional<? extends ConfigurationCustomer> customer,
            @JsonProperty("enableSync") Optional<? extends Boolean> enableSync,
            @JsonProperty("selectedBankAccountId") Optional<? extends String> selectedBankAccountId,
            @JsonProperty("supplier") Optional<? extends ConfigurationSupplier> supplier) {
        Utils.checkNotNull(bankAccountOptions, "bankAccountOptions");
        Utils.checkNotNull(customer, "customer");
        Utils.checkNotNull(enableSync, "enableSync");
        Utils.checkNotNull(selectedBankAccountId, "selectedBankAccountId");
        Utils.checkNotNull(supplier, "supplier");
        this.bankAccountOptions = bankAccountOptions;
        this.customer = customer;
        this.enableSync = enableSync;
        this.selectedBankAccountId = selectedBankAccountId;
        this.supplier = supplier;
    }

    public Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions() {
        return bankAccountOptions;
    }

    public Optional<? extends ConfigurationCustomer> customer() {
        return customer;
    }

    /**
     * True if expense sync is enabled.
     */
    public Optional<? extends Boolean> enableSync() {
        return enableSync;
    }

    /**
     * The bank account ID being synced.
     */
    public Optional<? extends String> selectedBankAccountId() {
        return selectedBankAccountId;
    }

    public Optional<? extends ConfigurationSupplier> supplier() {
        return supplier;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public SyncAsExpenses withBankAccountOptions(java.util.List<BankAccountOption> bankAccountOptions) {
        Utils.checkNotNull(bankAccountOptions, "bankAccountOptions");
        this.bankAccountOptions = Optional.ofNullable(bankAccountOptions);
        return this;
    }
    
    public SyncAsExpenses withBankAccountOptions(Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions) {
        Utils.checkNotNull(bankAccountOptions, "bankAccountOptions");
        this.bankAccountOptions = bankAccountOptions;
        return this;
    }

    public SyncAsExpenses withCustomer(ConfigurationCustomer customer) {
        Utils.checkNotNull(customer, "customer");
        this.customer = Optional.ofNullable(customer);
        return this;
    }
    
    public SyncAsExpenses withCustomer(Optional<? extends ConfigurationCustomer> customer) {
        Utils.checkNotNull(customer, "customer");
        this.customer = customer;
        return this;
    }

    /**
     * True if expense sync is enabled.
     */
    public SyncAsExpenses withEnableSync(boolean enableSync) {
        Utils.checkNotNull(enableSync, "enableSync");
        this.enableSync = Optional.ofNullable(enableSync);
        return this;
    }
    
    /**
     * True if expense sync is enabled.
     */
    public SyncAsExpenses withEnableSync(Optional<? extends Boolean> enableSync) {
        Utils.checkNotNull(enableSync, "enableSync");
        this.enableSync = enableSync;
        return this;
    }

    /**
     * The bank account ID being synced.
     */
    public SyncAsExpenses withSelectedBankAccountId(String selectedBankAccountId) {
        Utils.checkNotNull(selectedBankAccountId, "selectedBankAccountId");
        this.selectedBankAccountId = Optional.ofNullable(selectedBankAccountId);
        return this;
    }
    
    /**
     * The bank account ID being synced.
     */
    public SyncAsExpenses withSelectedBankAccountId(Optional<? extends String> selectedBankAccountId) {
        Utils.checkNotNull(selectedBankAccountId, "selectedBankAccountId");
        this.selectedBankAccountId = selectedBankAccountId;
        return this;
    }

    public SyncAsExpenses withSupplier(ConfigurationSupplier supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = Optional.ofNullable(supplier);
        return this;
    }
    
    public SyncAsExpenses withSupplier(Optional<? extends ConfigurationSupplier> supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = supplier;
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
        SyncAsExpenses other = (SyncAsExpenses) o;
        return 
            java.util.Objects.deepEquals(this.bankAccountOptions, other.bankAccountOptions) &&
            java.util.Objects.deepEquals(this.customer, other.customer) &&
            java.util.Objects.deepEquals(this.enableSync, other.enableSync) &&
            java.util.Objects.deepEquals(this.selectedBankAccountId, other.selectedBankAccountId) &&
            java.util.Objects.deepEquals(this.supplier, other.supplier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankAccountOptions,
            customer,
            enableSync,
            selectedBankAccountId,
            supplier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncAsExpenses.class,
                "bankAccountOptions", bankAccountOptions,
                "customer", customer,
                "enableSync", enableSync,
                "selectedBankAccountId", selectedBankAccountId,
                "supplier", supplier);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions = Optional.empty();
 
        private Optional<? extends ConfigurationCustomer> customer = Optional.empty();
 
        private Optional<? extends Boolean> enableSync = Optional.empty();
 
        private Optional<? extends String> selectedBankAccountId = Optional.empty();
 
        private Optional<? extends ConfigurationSupplier> supplier = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankAccountOptions(java.util.List<BankAccountOption> bankAccountOptions) {
            Utils.checkNotNull(bankAccountOptions, "bankAccountOptions");
            this.bankAccountOptions = Optional.ofNullable(bankAccountOptions);
            return this;
        }
        
        public Builder bankAccountOptions(Optional<? extends java.util.List<BankAccountOption>> bankAccountOptions) {
            Utils.checkNotNull(bankAccountOptions, "bankAccountOptions");
            this.bankAccountOptions = bankAccountOptions;
            return this;
        }

        public Builder customer(ConfigurationCustomer customer) {
            Utils.checkNotNull(customer, "customer");
            this.customer = Optional.ofNullable(customer);
            return this;
        }
        
        public Builder customer(Optional<? extends ConfigurationCustomer> customer) {
            Utils.checkNotNull(customer, "customer");
            this.customer = customer;
            return this;
        }

        /**
         * True if expense sync is enabled.
         */
        public Builder enableSync(boolean enableSync) {
            Utils.checkNotNull(enableSync, "enableSync");
            this.enableSync = Optional.ofNullable(enableSync);
            return this;
        }
        
        /**
         * True if expense sync is enabled.
         */
        public Builder enableSync(Optional<? extends Boolean> enableSync) {
            Utils.checkNotNull(enableSync, "enableSync");
            this.enableSync = enableSync;
            return this;
        }

        /**
         * The bank account ID being synced.
         */
        public Builder selectedBankAccountId(String selectedBankAccountId) {
            Utils.checkNotNull(selectedBankAccountId, "selectedBankAccountId");
            this.selectedBankAccountId = Optional.ofNullable(selectedBankAccountId);
            return this;
        }
        
        /**
         * The bank account ID being synced.
         */
        public Builder selectedBankAccountId(Optional<? extends String> selectedBankAccountId) {
            Utils.checkNotNull(selectedBankAccountId, "selectedBankAccountId");
            this.selectedBankAccountId = selectedBankAccountId;
            return this;
        }

        public Builder supplier(ConfigurationSupplier supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = Optional.ofNullable(supplier);
            return this;
        }
        
        public Builder supplier(Optional<? extends ConfigurationSupplier> supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = supplier;
            return this;
        }
        
        public SyncAsExpenses build() {
            return new SyncAsExpenses(
                bankAccountOptions,
                customer,
                enableSync,
                selectedBankAccountId,
                supplier);
        }
    }
}

