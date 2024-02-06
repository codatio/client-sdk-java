/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class AgedDebtor {

    /**
     * Array of aged debtors by currency.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("agedCurrencyOutstanding")
    private Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding;

    /**
     * Customer ID of the aged debtor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerId")
    private Optional<? extends String> customerId;

    /**
     * Customer name of the aged debtor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerName")
    private Optional<? extends String> customerName;

    public AgedDebtor(
            @JsonProperty("agedCurrencyOutstanding") Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding,
            @JsonProperty("customerId") Optional<? extends String> customerId,
            @JsonProperty("customerName") Optional<? extends String> customerName) {
        Utils.checkNotNull(agedCurrencyOutstanding, "agedCurrencyOutstanding");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(customerName, "customerName");
        this.agedCurrencyOutstanding = agedCurrencyOutstanding;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    /**
     * Array of aged debtors by currency.
     */
    public Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding() {
        return agedCurrencyOutstanding;
    }

    /**
     * Customer ID of the aged debtor.
     */
    public Optional<? extends String> customerId() {
        return customerId;
    }

    /**
     * Customer name of the aged debtor.
     */
    public Optional<? extends String> customerName() {
        return customerName;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of aged debtors by currency.
     */
    public AgedDebtor withAgedCurrencyOutstanding(java.util.List<AgedCurrencyOutstanding> agedCurrencyOutstanding) {
        Utils.checkNotNull(agedCurrencyOutstanding, "agedCurrencyOutstanding");
        this.agedCurrencyOutstanding = Optional.ofNullable(agedCurrencyOutstanding);
        return this;
    }
    
    /**
     * Array of aged debtors by currency.
     */
    public AgedDebtor withAgedCurrencyOutstanding(Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding) {
        Utils.checkNotNull(agedCurrencyOutstanding, "agedCurrencyOutstanding");
        this.agedCurrencyOutstanding = agedCurrencyOutstanding;
        return this;
    }

    /**
     * Customer ID of the aged debtor.
     */
    public AgedDebtor withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }
    
    /**
     * Customer ID of the aged debtor.
     */
    public AgedDebtor withCustomerId(Optional<? extends String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Customer name of the aged debtor.
     */
    public AgedDebtor withCustomerName(String customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = Optional.ofNullable(customerName);
        return this;
    }
    
    /**
     * Customer name of the aged debtor.
     */
    public AgedDebtor withCustomerName(Optional<? extends String> customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = customerName;
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
        AgedDebtor other = (AgedDebtor) o;
        return 
            java.util.Objects.deepEquals(this.agedCurrencyOutstanding, other.agedCurrencyOutstanding) &&
            java.util.Objects.deepEquals(this.customerId, other.customerId) &&
            java.util.Objects.deepEquals(this.customerName, other.customerName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            agedCurrencyOutstanding,
            customerId,
            customerName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AgedDebtor.class,
                "agedCurrencyOutstanding", agedCurrencyOutstanding,
                "customerId", customerId,
                "customerName", customerName);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding = Optional.empty();
 
        private Optional<? extends String> customerId = Optional.empty();
 
        private Optional<? extends String> customerName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of aged debtors by currency.
         */
        public Builder agedCurrencyOutstanding(java.util.List<AgedCurrencyOutstanding> agedCurrencyOutstanding) {
            Utils.checkNotNull(agedCurrencyOutstanding, "agedCurrencyOutstanding");
            this.agedCurrencyOutstanding = Optional.ofNullable(agedCurrencyOutstanding);
            return this;
        }
        
        /**
         * Array of aged debtors by currency.
         */
        public Builder agedCurrencyOutstanding(Optional<? extends java.util.List<AgedCurrencyOutstanding>> agedCurrencyOutstanding) {
            Utils.checkNotNull(agedCurrencyOutstanding, "agedCurrencyOutstanding");
            this.agedCurrencyOutstanding = agedCurrencyOutstanding;
            return this;
        }

        /**
         * Customer ID of the aged debtor.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }
        
        /**
         * Customer ID of the aged debtor.
         */
        public Builder customerId(Optional<? extends String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * Customer name of the aged debtor.
         */
        public Builder customerName(String customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = Optional.ofNullable(customerName);
            return this;
        }
        
        /**
         * Customer name of the aged debtor.
         */
        public Builder customerName(Optional<? extends String> customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = customerName;
            return this;
        }        
        
        public AgedDebtor build() {
            return new AgedDebtor(
                agedCurrencyOutstanding,
                customerId,
                customerName);
        }
    }
}
