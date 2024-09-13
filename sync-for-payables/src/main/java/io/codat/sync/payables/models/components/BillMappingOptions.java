/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payables.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * BillMappingOptions - The bill mapping options for a company's accounting software.
 */

public class BillMappingOptions {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private Optional<? extends List<AccountMappingOption>> accounts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination")
    private Optional<? extends Pagination> pagination;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRate")
    private Optional<? extends List<TaxRateMappingOption>> taxRate;

    @JsonCreator
    public BillMappingOptions(
            @JsonProperty("accounts") Optional<? extends List<AccountMappingOption>> accounts,
            @JsonProperty("pagination") Optional<? extends Pagination> pagination,
            @JsonProperty("taxRate") Optional<? extends List<TaxRateMappingOption>> taxRate) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(pagination, "pagination");
        Utils.checkNotNull(taxRate, "taxRate");
        this.accounts = accounts;
        this.pagination = pagination;
        this.taxRate = taxRate;
    }
    
    public BillMappingOptions() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AccountMappingOption>> accounts() {
        return (Optional<List<AccountMappingOption>>) accounts;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Pagination> pagination() {
        return (Optional<Pagination>) pagination;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TaxRateMappingOption>> taxRate() {
        return (Optional<List<TaxRateMappingOption>>) taxRate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BillMappingOptions withAccounts(List<AccountMappingOption> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = Optional.ofNullable(accounts);
        return this;
    }

    public BillMappingOptions withAccounts(Optional<? extends List<AccountMappingOption>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
        return this;
    }

    public BillMappingOptions withPagination(Pagination pagination) {
        Utils.checkNotNull(pagination, "pagination");
        this.pagination = Optional.ofNullable(pagination);
        return this;
    }

    public BillMappingOptions withPagination(Optional<? extends Pagination> pagination) {
        Utils.checkNotNull(pagination, "pagination");
        this.pagination = pagination;
        return this;
    }

    public BillMappingOptions withTaxRate(List<TaxRateMappingOption> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public BillMappingOptions withTaxRate(Optional<? extends List<TaxRateMappingOption>> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
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
        BillMappingOptions other = (BillMappingOptions) o;
        return 
            Objects.deepEquals(this.accounts, other.accounts) &&
            Objects.deepEquals(this.pagination, other.pagination) &&
            Objects.deepEquals(this.taxRate, other.taxRate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accounts,
            pagination,
            taxRate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BillMappingOptions.class,
                "accounts", accounts,
                "pagination", pagination,
                "taxRate", taxRate);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AccountMappingOption>> accounts = Optional.empty();
 
        private Optional<? extends Pagination> pagination = Optional.empty();
 
        private Optional<? extends List<TaxRateMappingOption>> taxRate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accounts(List<AccountMappingOption> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = Optional.ofNullable(accounts);
            return this;
        }

        public Builder accounts(Optional<? extends List<AccountMappingOption>> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = accounts;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            Utils.checkNotNull(pagination, "pagination");
            this.pagination = Optional.ofNullable(pagination);
            return this;
        }

        public Builder pagination(Optional<? extends Pagination> pagination) {
            Utils.checkNotNull(pagination, "pagination");
            this.pagination = pagination;
            return this;
        }

        public Builder taxRate(List<TaxRateMappingOption> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = Optional.ofNullable(taxRate);
            return this;
        }

        public Builder taxRate(Optional<? extends List<TaxRateMappingOption>> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = taxRate;
            return this;
        }
        
        public BillMappingOptions build() {
            return new BillMappingOptions(
                accounts,
                pagination,
                taxRate);
        }
    }
}

