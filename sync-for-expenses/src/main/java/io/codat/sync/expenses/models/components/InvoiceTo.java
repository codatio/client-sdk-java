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
import java.util.Objects;
import java.util.Optional;

/**
 * InvoiceTo - Unique identifier for the customer billed for the transaction. The `invoiceTo` object is currently supported only for QuickBooks Online and QuickBooks Desktop.
 */

public class InvoiceTo {

    /**
     * identifier of customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The type of contact.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends InvoiceToType> type;

    @JsonCreator
    public InvoiceTo(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("type") Optional<? extends InvoiceToType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.type = type;
    }
    
    public InvoiceTo() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * identifier of customer.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The type of contact.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvoiceToType> type() {
        return (Optional<InvoiceToType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * identifier of customer.
     */
    public InvoiceTo withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * identifier of customer.
     */
    public InvoiceTo withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The type of contact.
     */
    public InvoiceTo withType(InvoiceToType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of contact.
     */
    public InvoiceTo withType(Optional<? extends InvoiceToType> type) {
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
        InvoiceTo other = (InvoiceTo) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceTo.class,
                "id", id,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends InvoiceToType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * identifier of customer.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * identifier of customer.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The type of contact.
         */
        public Builder type(InvoiceToType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of contact.
         */
        public Builder type(Optional<? extends InvoiceToType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public InvoiceTo build() {
            return new InvoiceTo(
                id,
                type);
        }
    }
}

