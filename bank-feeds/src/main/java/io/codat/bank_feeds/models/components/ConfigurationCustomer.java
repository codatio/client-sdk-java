/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ConfigurationCustomer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerOptions")
    private Optional<? extends List<ConfigurationContactRef>> customerOptions;

    /**
     * Unique identifier for the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedCustomerId")
    private Optional<String> selectedCustomerId;

    @JsonCreator
    public ConfigurationCustomer(
            @JsonProperty("customerOptions") Optional<? extends List<ConfigurationContactRef>> customerOptions,
            @JsonProperty("selectedCustomerId") Optional<String> selectedCustomerId) {
        Utils.checkNotNull(customerOptions, "customerOptions");
        Utils.checkNotNull(selectedCustomerId, "selectedCustomerId");
        this.customerOptions = customerOptions;
        this.selectedCustomerId = selectedCustomerId;
    }
    
    public ConfigurationCustomer() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ConfigurationContactRef>> customerOptions() {
        return (Optional<List<ConfigurationContactRef>>) customerOptions;
    }

    /**
     * Unique identifier for the customer.
     */
    @JsonIgnore
    public Optional<String> selectedCustomerId() {
        return selectedCustomerId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfigurationCustomer withCustomerOptions(List<ConfigurationContactRef> customerOptions) {
        Utils.checkNotNull(customerOptions, "customerOptions");
        this.customerOptions = Optional.ofNullable(customerOptions);
        return this;
    }

    public ConfigurationCustomer withCustomerOptions(Optional<? extends List<ConfigurationContactRef>> customerOptions) {
        Utils.checkNotNull(customerOptions, "customerOptions");
        this.customerOptions = customerOptions;
        return this;
    }

    /**
     * Unique identifier for the customer.
     */
    public ConfigurationCustomer withSelectedCustomerId(String selectedCustomerId) {
        Utils.checkNotNull(selectedCustomerId, "selectedCustomerId");
        this.selectedCustomerId = Optional.ofNullable(selectedCustomerId);
        return this;
    }

    /**
     * Unique identifier for the customer.
     */
    public ConfigurationCustomer withSelectedCustomerId(Optional<String> selectedCustomerId) {
        Utils.checkNotNull(selectedCustomerId, "selectedCustomerId");
        this.selectedCustomerId = selectedCustomerId;
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
        ConfigurationCustomer other = (ConfigurationCustomer) o;
        return 
            Objects.deepEquals(this.customerOptions, other.customerOptions) &&
            Objects.deepEquals(this.selectedCustomerId, other.selectedCustomerId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerOptions,
            selectedCustomerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigurationCustomer.class,
                "customerOptions", customerOptions,
                "selectedCustomerId", selectedCustomerId);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<ConfigurationContactRef>> customerOptions = Optional.empty();
 
        private Optional<String> selectedCustomerId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder customerOptions(List<ConfigurationContactRef> customerOptions) {
            Utils.checkNotNull(customerOptions, "customerOptions");
            this.customerOptions = Optional.ofNullable(customerOptions);
            return this;
        }

        public Builder customerOptions(Optional<? extends List<ConfigurationContactRef>> customerOptions) {
            Utils.checkNotNull(customerOptions, "customerOptions");
            this.customerOptions = customerOptions;
            return this;
        }

        /**
         * Unique identifier for the customer.
         */
        public Builder selectedCustomerId(String selectedCustomerId) {
            Utils.checkNotNull(selectedCustomerId, "selectedCustomerId");
            this.selectedCustomerId = Optional.ofNullable(selectedCustomerId);
            return this;
        }

        /**
         * Unique identifier for the customer.
         */
        public Builder selectedCustomerId(Optional<String> selectedCustomerId) {
            Utils.checkNotNull(selectedCustomerId, "selectedCustomerId");
            this.selectedCustomerId = selectedCustomerId;
            return this;
        }
        
        public ConfigurationCustomer build() {
            return new ConfigurationCustomer(
                customerOptions,
                selectedCustomerId);
        }
    }
}

