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


public class PushOperationRef {

    /**
     * Available data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    /**
     * Unique identifier for a push operation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public PushOperationRef(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }
    
    public PushOperationRef() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Available data types
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DataType> dataType() {
        return (Optional<DataType>) dataType;
    }

    /**
     * Unique identifier for a push operation.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public PushOperationRef withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Available data types
     */
    public PushOperationRef withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier for a push operation.
     */
    public PushOperationRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for a push operation.
     */
    public PushOperationRef withId(Optional<String> id) {
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
        PushOperationRef other = (PushOperationRef) o;
        return 
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dataType,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOperationRef.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private Optional<String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * Available data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Unique identifier for a push operation.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for a push operation.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public PushOperationRef build() {
            return new PushOperationRef(
                dataType,
                id);
        }
    }
}

