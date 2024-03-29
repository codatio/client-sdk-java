/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class AgedOutstandingAmountDetail {

    /**
     * The amount outstanding.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends Double> amount;

    /**
     * Name of data type with outstanding amount for given period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    public AgedOutstandingAmountDetail(
            @JsonProperty("amount") Optional<? extends Double> amount,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(name, "name");
        this.amount = amount;
        this.name = name;
    }

    /**
     * The amount outstanding.
     */
    public Optional<? extends Double> amount() {
        return amount;
    }

    /**
     * Name of data type with outstanding amount for given period.
     */
    public Optional<? extends String> name() {
        return name;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The amount outstanding.
     */
    public AgedOutstandingAmountDetail withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }
    
    /**
     * The amount outstanding.
     */
    public AgedOutstandingAmountDetail withAmount(Optional<? extends Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Name of data type with outstanding amount for given period.
     */
    public AgedOutstandingAmountDetail withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }
    
    /**
     * Name of data type with outstanding amount for given period.
     */
    public AgedOutstandingAmountDetail withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        AgedOutstandingAmountDetail other = (AgedOutstandingAmountDetail) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AgedOutstandingAmountDetail.class,
                "amount", amount,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> amount = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The amount outstanding.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }
        
        /**
         * The amount outstanding.
         */
        public Builder amount(Optional<? extends Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Name of data type with outstanding amount for given period.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }
        
        /**
         * Name of data type with outstanding amount for given period.
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public AgedOutstandingAmountDetail build() {
            return new AgedOutstandingAmountDetail(
                amount,
                name);
        }
    }
}

