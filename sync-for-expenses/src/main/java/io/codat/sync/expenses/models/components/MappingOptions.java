/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class MappingOptions {

    /**
     * Array of available accounts for mapping.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accounts")
    private JsonNullable<? extends List<AccountMappingInfo>> accounts;

    /**
     * Name of the expense integration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expenseProvider")
    private JsonNullable<String> expenseProvider;

    /**
     * Array of available tax rates for mapping.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRates")
    private JsonNullable<? extends List<TaxRateMappingInfo>> taxRates;

    /**
     * Array of available tracking categories for mapping.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trackingCategories")
    private JsonNullable<? extends List<TrackingCategoryMappingInfo>> trackingCategories;

    @JsonCreator
    public MappingOptions(
            @JsonProperty("accounts") JsonNullable<? extends List<AccountMappingInfo>> accounts,
            @JsonProperty("expenseProvider") JsonNullable<String> expenseProvider,
            @JsonProperty("taxRates") JsonNullable<? extends List<TaxRateMappingInfo>> taxRates,
            @JsonProperty("trackingCategories") JsonNullable<? extends List<TrackingCategoryMappingInfo>> trackingCategories) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(expenseProvider, "expenseProvider");
        Utils.checkNotNull(taxRates, "taxRates");
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.accounts = accounts;
        this.expenseProvider = expenseProvider;
        this.taxRates = taxRates;
        this.trackingCategories = trackingCategories;
    }
    
    public MappingOptions() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Array of available accounts for mapping.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<AccountMappingInfo>> accounts() {
        return (JsonNullable<List<AccountMappingInfo>>) accounts;
    }

    /**
     * Name of the expense integration.
     */
    @JsonIgnore
    public JsonNullable<String> expenseProvider() {
        return expenseProvider;
    }

    /**
     * Array of available tax rates for mapping.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TaxRateMappingInfo>> taxRates() {
        return (JsonNullable<List<TaxRateMappingInfo>>) taxRates;
    }

    /**
     * Array of available tracking categories for mapping.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TrackingCategoryMappingInfo>> trackingCategories() {
        return (JsonNullable<List<TrackingCategoryMappingInfo>>) trackingCategories;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of available accounts for mapping.
     */
    public MappingOptions withAccounts(List<AccountMappingInfo> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = JsonNullable.of(accounts);
        return this;
    }

    /**
     * Array of available accounts for mapping.
     */
    public MappingOptions withAccounts(JsonNullable<? extends List<AccountMappingInfo>> accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
        return this;
    }

    /**
     * Name of the expense integration.
     */
    public MappingOptions withExpenseProvider(String expenseProvider) {
        Utils.checkNotNull(expenseProvider, "expenseProvider");
        this.expenseProvider = JsonNullable.of(expenseProvider);
        return this;
    }

    /**
     * Name of the expense integration.
     */
    public MappingOptions withExpenseProvider(JsonNullable<String> expenseProvider) {
        Utils.checkNotNull(expenseProvider, "expenseProvider");
        this.expenseProvider = expenseProvider;
        return this;
    }

    /**
     * Array of available tax rates for mapping.
     */
    public MappingOptions withTaxRates(List<TaxRateMappingInfo> taxRates) {
        Utils.checkNotNull(taxRates, "taxRates");
        this.taxRates = JsonNullable.of(taxRates);
        return this;
    }

    /**
     * Array of available tax rates for mapping.
     */
    public MappingOptions withTaxRates(JsonNullable<? extends List<TaxRateMappingInfo>> taxRates) {
        Utils.checkNotNull(taxRates, "taxRates");
        this.taxRates = taxRates;
        return this;
    }

    /**
     * Array of available tracking categories for mapping.
     */
    public MappingOptions withTrackingCategories(List<TrackingCategoryMappingInfo> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = JsonNullable.of(trackingCategories);
        return this;
    }

    /**
     * Array of available tracking categories for mapping.
     */
    public MappingOptions withTrackingCategories(JsonNullable<? extends List<TrackingCategoryMappingInfo>> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = trackingCategories;
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
        MappingOptions other = (MappingOptions) o;
        return 
            Objects.deepEquals(this.accounts, other.accounts) &&
            Objects.deepEquals(this.expenseProvider, other.expenseProvider) &&
            Objects.deepEquals(this.taxRates, other.taxRates) &&
            Objects.deepEquals(this.trackingCategories, other.trackingCategories);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accounts,
            expenseProvider,
            taxRates,
            trackingCategories);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MappingOptions.class,
                "accounts", accounts,
                "expenseProvider", expenseProvider,
                "taxRates", taxRates,
                "trackingCategories", trackingCategories);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<AccountMappingInfo>> accounts = JsonNullable.undefined();
 
        private JsonNullable<String> expenseProvider = JsonNullable.undefined();
 
        private JsonNullable<? extends List<TaxRateMappingInfo>> taxRates = JsonNullable.undefined();
 
        private JsonNullable<? extends List<TrackingCategoryMappingInfo>> trackingCategories = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of available accounts for mapping.
         */
        public Builder accounts(List<AccountMappingInfo> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = JsonNullable.of(accounts);
            return this;
        }

        /**
         * Array of available accounts for mapping.
         */
        public Builder accounts(JsonNullable<? extends List<AccountMappingInfo>> accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = accounts;
            return this;
        }

        /**
         * Name of the expense integration.
         */
        public Builder expenseProvider(String expenseProvider) {
            Utils.checkNotNull(expenseProvider, "expenseProvider");
            this.expenseProvider = JsonNullable.of(expenseProvider);
            return this;
        }

        /**
         * Name of the expense integration.
         */
        public Builder expenseProvider(JsonNullable<String> expenseProvider) {
            Utils.checkNotNull(expenseProvider, "expenseProvider");
            this.expenseProvider = expenseProvider;
            return this;
        }

        /**
         * Array of available tax rates for mapping.
         */
        public Builder taxRates(List<TaxRateMappingInfo> taxRates) {
            Utils.checkNotNull(taxRates, "taxRates");
            this.taxRates = JsonNullable.of(taxRates);
            return this;
        }

        /**
         * Array of available tax rates for mapping.
         */
        public Builder taxRates(JsonNullable<? extends List<TaxRateMappingInfo>> taxRates) {
            Utils.checkNotNull(taxRates, "taxRates");
            this.taxRates = taxRates;
            return this;
        }

        /**
         * Array of available tracking categories for mapping.
         */
        public Builder trackingCategories(List<TrackingCategoryMappingInfo> trackingCategories) {
            Utils.checkNotNull(trackingCategories, "trackingCategories");
            this.trackingCategories = JsonNullable.of(trackingCategories);
            return this;
        }

        /**
         * Array of available tracking categories for mapping.
         */
        public Builder trackingCategories(JsonNullable<? extends List<TrackingCategoryMappingInfo>> trackingCategories) {
            Utils.checkNotNull(trackingCategories, "trackingCategories");
            this.trackingCategories = trackingCategories;
            return this;
        }
        
        public MappingOptions build() {
            return new MappingOptions(
                accounts,
                expenseProvider,
                taxRates,
                trackingCategories);
        }
    }
}

