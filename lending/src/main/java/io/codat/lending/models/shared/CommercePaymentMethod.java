/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * CommercePaymentMethod - A Payment Method represents the payment method(s) used to make payments.
 * 
 * Explore our [data coverage](https://knowledge.codat.io/supported-features/commerce?view=tab-by-data-type&amp;dataType=commerce-paymentMethods) for this data type.
 */

public class CommercePaymentMethod {

    /**
     * A unique, persistent identifier for this record
     */
    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    /**
     * The name of the PaymentMethod
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<? extends String> sourceModifiedDate;

    /**
     * Status of the Payment Method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends CommercePaymentMethodStatus> status;

    public CommercePaymentMethod(
            @JsonProperty("id") String id,
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("sourceModifiedDate") Optional<? extends String> sourceModifiedDate,
            @JsonProperty("status") Optional<? extends CommercePaymentMethodStatus> status) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(status, "status");
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.sourceModifiedDate = sourceModifiedDate;
        this.status = status;
    }

    /**
     * A unique, persistent identifier for this record
     */
    public String id() {
        return id;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * The name of the PaymentMethod
     */
    public Optional<? extends String> name() {
        return name;
    }

    public Optional<? extends String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Status of the Payment Method.
     */
    public Optional<? extends CommercePaymentMethodStatus> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique, persistent identifier for this record
     */
    public CommercePaymentMethod withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommercePaymentMethod withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }
    
    public CommercePaymentMethod withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * The name of the PaymentMethod
     */
    public CommercePaymentMethod withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }
    
    /**
     * The name of the PaymentMethod
     */
    public CommercePaymentMethod withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CommercePaymentMethod withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }
    
    public CommercePaymentMethod withSourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Status of the Payment Method.
     */
    public CommercePaymentMethod withStatus(CommercePaymentMethodStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * Status of the Payment Method.
     */
    public CommercePaymentMethod withStatus(Optional<? extends CommercePaymentMethodStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        CommercePaymentMethod other = (CommercePaymentMethod) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            modifiedDate,
            name,
            sourceModifiedDate,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommercePaymentMethod.class,
                "id", id,
                "modifiedDate", modifiedDate,
                "name", name,
                "sourceModifiedDate", sourceModifiedDate,
                "status", status);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends String> modifiedDate = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends CommercePaymentMethodStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique, persistent identifier for this record
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }
        
        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * The name of the PaymentMethod
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }
        
        /**
         * The name of the PaymentMethod
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }
        
        public Builder sourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Status of the Payment Method.
         */
        public Builder status(CommercePaymentMethodStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * Status of the Payment Method.
         */
        public Builder status(Optional<? extends CommercePaymentMethodStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public CommercePaymentMethod build() {
            return new CommercePaymentMethod(
                id,
                modifiedDate,
                name,
                sourceModifiedDate,
                status);
        }
    }
}

