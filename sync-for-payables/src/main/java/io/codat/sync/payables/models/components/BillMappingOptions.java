/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * BillMappingOptions - The bill mapping options for a company's accounting software.
 */

public class BillMappingOptions {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private Optional<? extends java.util.List<AccountMappingOption>> accounts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination")
    private Optional<? extends Pagination> pagination;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRate")
    private Optional<? extends java.util.List<TaxRateMappingOption>> taxRate;

    public BillMappingOptions(
            @JsonProperty("accounts") Optional<? extends java.util.List<AccountMappingOption>> accounts,
            @JsonProperty("pagination") Optional<? extends Pagination> pagination,
            @JsonProperty("taxRate") Optional<? extends java.util.List<TaxRateMappingOption>> taxRate) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(pagination, "pagination");
        Utils.checkNotNull(taxRate, "taxRate");
        this.accounts = accounts;
        this.pagination = pagination;
        this.taxRate = taxRate;
    }

    public Optional<? extends java.util.List<AccountMappingOption>> accounts() {
        return accounts;
    }

    public Optional<? extends Pagination> pagination() {
        return pagination;
    }

    public Optional<? extends java.util.List<TaxRateMappingOption>> taxRate() {
        return taxRate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BillMappingOptions withAccounts(java.util.List<AccountMappingOption> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = Optional.ofNullable(accounts);
        return this;
    }

    public BillMappingOptions withAccounts(Optional<? extends java.util.List<AccountMappingOption>> accounts) {
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

    public BillMappingOptions withTaxRate(java.util.List<TaxRateMappingOption> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public BillMappingOptions withTaxRate(Optional<? extends java.util.List<TaxRateMappingOption>> taxRate) {
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
            java.util.Objects.deepEquals(this.accounts, other.accounts) &&
            java.util.Objects.deepEquals(this.pagination, other.pagination) &&
            java.util.Objects.deepEquals(this.taxRate, other.taxRate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends java.util.List<AccountMappingOption>> accounts = Optional.empty();
 
        private Optional<? extends Pagination> pagination = Optional.empty();
 
        private Optional<? extends java.util.List<TaxRateMappingOption>> taxRate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accounts(java.util.List<AccountMappingOption> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = Optional.ofNullable(accounts);
            return this;
        }

        public Builder accounts(Optional<? extends java.util.List<AccountMappingOption>> accounts) {
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

        public Builder taxRate(java.util.List<TaxRateMappingOption> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = Optional.ofNullable(taxRate);
            return this;
        }

        public Builder taxRate(Optional<? extends java.util.List<TaxRateMappingOption>> taxRate) {
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

