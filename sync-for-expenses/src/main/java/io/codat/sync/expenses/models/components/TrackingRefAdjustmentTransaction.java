/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class TrackingRefAdjustmentTransaction {

    /**
     * The type of the linked reference
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends TrackingRefAdjustmentTransactionDataType> dataType;

    /**
     * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public TrackingRefAdjustmentTransaction(
            @JsonProperty("dataType") Optional<? extends TrackingRefAdjustmentTransactionDataType> dataType,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }
    
    public TrackingRefAdjustmentTransaction() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The type of the linked reference
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingRefAdjustmentTransactionDataType> dataType() {
        return (Optional<TrackingRefAdjustmentTransactionDataType>) dataType;
    }

    /**
     * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the linked reference
     */
    public TrackingRefAdjustmentTransaction withDataType(TrackingRefAdjustmentTransactionDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * The type of the linked reference
     */
    public TrackingRefAdjustmentTransaction withDataType(Optional<? extends TrackingRefAdjustmentTransactionDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
     */
    public TrackingRefAdjustmentTransaction withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
     */
    public TrackingRefAdjustmentTransaction withId(Optional<String> id) {
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
        TrackingRefAdjustmentTransaction other = (TrackingRefAdjustmentTransaction) o;
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
        return Utils.toString(TrackingRefAdjustmentTransaction.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends TrackingRefAdjustmentTransactionDataType> dataType;
 
        private Optional<String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the linked reference
         */
        public Builder dataType(TrackingRefAdjustmentTransactionDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * The type of the linked reference
         */
        public Builder dataType(Optional<? extends TrackingRefAdjustmentTransactionDataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of the linked reference from mapping options or the unique identifier of the linked customer or supplier.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public TrackingRefAdjustmentTransaction build() {
            if (dataType == null) {
                dataType = _SINGLETON_VALUE_DataType.value();
            }            return new TrackingRefAdjustmentTransaction(
                dataType,
                id);
        }

        private static final LazySingletonValue<Optional<? extends TrackingRefAdjustmentTransactionDataType>> _SINGLETON_VALUE_DataType =
                new LazySingletonValue<>(
                        "dataType",
                        "\"trackingCategories\"",
                        new TypeReference<Optional<? extends TrackingRefAdjustmentTransactionDataType>>() {});
    }
}

