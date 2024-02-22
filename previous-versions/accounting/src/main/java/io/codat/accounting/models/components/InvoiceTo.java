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

/**
 * InvoiceTo - Links the current record to the underlying record or data type that created it. 
 * 
 * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
 */

public class InvoiceTo {

    /**
     * Allowed name of the 'dataType'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends String> dataType;

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    public InvoiceTo(
            @JsonProperty("dataType") Optional<? extends String> dataType,
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public Optional<? extends String> dataType() {
        return dataType;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public Optional<? extends String> id() {
        return id;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public InvoiceTo withDataType(String dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * Allowed name of the 'dataType'.
     */
    public InvoiceTo withDataType(Optional<? extends String> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public InvoiceTo withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * 'id' of the underlying record or data type.
     */
    public InvoiceTo withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceTo.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> dataType = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(String dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(Optional<? extends String> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * 'id' of the underlying record or data type.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * 'id' of the underlying record or data type.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public InvoiceTo build() {
            return new InvoiceTo(
                dataType,
                id);
        }
    }
}

