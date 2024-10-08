/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyConfiguration {

    @JsonProperty("bankAccount")
    private BankAccountDetails bankAccount;

    @JsonProperty("customer")
    private CustomerDetails customer;

    @JsonProperty("supplier")
    private SupplierDetails supplier;

    @JsonCreator
    public CompanyConfiguration(
            @JsonProperty("bankAccount") BankAccountDetails bankAccount,
            @JsonProperty("customer") CustomerDetails customer,
            @JsonProperty("supplier") SupplierDetails supplier) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        Utils.checkNotNull(customer, "customer");
        Utils.checkNotNull(supplier, "supplier");
        this.bankAccount = bankAccount;
        this.customer = customer;
        this.supplier = supplier;
    }

    @JsonIgnore
    public BankAccountDetails bankAccount() {
        return bankAccount;
    }

    @JsonIgnore
    public CustomerDetails customer() {
        return customer;
    }

    @JsonIgnore
    public SupplierDetails supplier() {
        return supplier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CompanyConfiguration withBankAccount(BankAccountDetails bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
        return this;
    }

    public CompanyConfiguration withCustomer(CustomerDetails customer) {
        Utils.checkNotNull(customer, "customer");
        this.customer = customer;
        return this;
    }

    public CompanyConfiguration withSupplier(SupplierDetails supplier) {
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
        CompanyConfiguration other = (CompanyConfiguration) o;
        return 
            Objects.deepEquals(this.bankAccount, other.bankAccount) &&
            Objects.deepEquals(this.customer, other.customer) &&
            Objects.deepEquals(this.supplier, other.supplier);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankAccount,
            customer,
            supplier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyConfiguration.class,
                "bankAccount", bankAccount,
                "customer", customer,
                "supplier", supplier);
    }
    
    public final static class Builder {
 
        private BankAccountDetails bankAccount;
 
        private CustomerDetails customer;
 
        private SupplierDetails supplier;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankAccount(BankAccountDetails bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = bankAccount;
            return this;
        }

        public Builder customer(CustomerDetails customer) {
            Utils.checkNotNull(customer, "customer");
            this.customer = customer;
            return this;
        }

        public Builder supplier(SupplierDetails supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = supplier;
            return this;
        }
        
        public CompanyConfiguration build() {
            return new CompanyConfiguration(
                bankAccount,
                customer,
                supplier);
        }
    }
}

