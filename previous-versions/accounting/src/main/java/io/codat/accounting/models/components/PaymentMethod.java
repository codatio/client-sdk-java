/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaymentMethod - &gt; View the coverage for payment methods in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=paymentMethods" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * A Payment Method represents the payment method(s) used to pay a Bill. Payment Methods are referenced on [Bill Payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) and [Payments](https://docs.codat.io/accounting-api#/schemas/Payment).
 */

public class PaymentMethod {

    /**
     * Unique identifier for the payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * Name of the payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Status of the Payment Method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PaymentMethodStatus> status;

    /**
     * Method of payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PaymentMethodType> type;

    @JsonCreator
    public PaymentMethod(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("status") Optional<? extends PaymentMethodStatus> status,
            @JsonProperty("type") Optional<? extends PaymentMethodType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.sourceModifiedDate = sourceModifiedDate;
        this.status = status;
        this.type = type;
    }
    
    public PaymentMethod() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the payment method.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Metadata> metadata() {
        return (Optional<Metadata>) metadata;
    }

    @JsonIgnore
    public Optional<String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Name of the payment method.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Status of the Payment Method.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethodStatus> status() {
        return (Optional<PaymentMethodStatus>) status;
    }

    /**
     * Method of payment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethodType> type() {
        return (Optional<PaymentMethodType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the payment method.
     */
    public PaymentMethod withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for the payment method.
     */
    public PaymentMethod withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PaymentMethod withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public PaymentMethod withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public PaymentMethod withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public PaymentMethod withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Name of the payment method.
     */
    public PaymentMethod withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the payment method.
     */
    public PaymentMethod withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public PaymentMethod withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public PaymentMethod withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Status of the Payment Method.
     */
    public PaymentMethod withStatus(PaymentMethodStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of the Payment Method.
     */
    public PaymentMethod withStatus(Optional<? extends PaymentMethodStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Method of payment.
     */
    public PaymentMethod withType(PaymentMethodType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Method of payment.
     */
    public PaymentMethod withType(Optional<? extends PaymentMethodType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PaymentMethod other = (PaymentMethod) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            metadata,
            modifiedDate,
            name,
            sourceModifiedDate,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentMethod.class,
                "id", id,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "name", name,
                "sourceModifiedDate", sourceModifiedDate,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends PaymentMethodStatus> status = Optional.empty();
 
        private Optional<? extends PaymentMethodType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the payment method.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for the payment method.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(Metadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends Metadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * Name of the payment method.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the payment method.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }

        public Builder sourceModifiedDate(Optional<String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Status of the Payment Method.
         */
        public Builder status(PaymentMethodStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the Payment Method.
         */
        public Builder status(Optional<? extends PaymentMethodStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Method of payment.
         */
        public Builder type(PaymentMethodType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Method of payment.
         */
        public Builder type(Optional<? extends PaymentMethodType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PaymentMethod build() {
            return new PaymentMethod(
                id,
                metadata,
                modifiedDate,
                name,
                sourceModifiedDate,
                status,
                type);
        }
    }
}

