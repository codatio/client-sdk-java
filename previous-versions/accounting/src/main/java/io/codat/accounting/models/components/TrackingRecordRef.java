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
 * TrackingRecordRef - Links to the customer or tracking category.
 */

public class TrackingRecordRef {

    /**
     * Name of underlying data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends TrackingRecordRefDataType> dataType;

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    public TrackingRecordRef(
            @JsonProperty("dataType") Optional<? extends TrackingRecordRefDataType> dataType,
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }

    /**
     * Name of underlying data type.
     */
    public Optional<? extends TrackingRecordRefDataType> dataType() {
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
     * Name of underlying data type.
     */
    public TrackingRecordRef withDataType(TrackingRecordRefDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * Name of underlying data type.
     */
    public TrackingRecordRef withDataType(Optional<? extends TrackingRecordRefDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public TrackingRecordRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * 'id' of the underlying record or data type.
     */
    public TrackingRecordRef withId(Optional<? extends String> id) {
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
        TrackingRecordRef other = (TrackingRecordRef) o;
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
        return Utils.toString(TrackingRecordRef.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends TrackingRecordRefDataType> dataType = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of underlying data type.
         */
        public Builder dataType(TrackingRecordRefDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * Name of underlying data type.
         */
        public Builder dataType(Optional<? extends TrackingRecordRefDataType> dataType) {
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
        
        public TrackingRecordRef build() {
            return new TrackingRecordRef(
                dataType,
                id);
        }
    }
}
