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


public class SalesOrderRef {

    /**
     * The underlying data type associated to the reference `id`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends SalesOrderRefDataType> dataType;

    /**
     * Unique identifier to a record in `dataType`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    public SalesOrderRef(
            @JsonProperty("dataType") Optional<? extends SalesOrderRefDataType> dataType,
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }

    /**
     * The underlying data type associated to the reference `id`.
     */
    public Optional<? extends SalesOrderRefDataType> dataType() {
        return dataType;
    }

    /**
     * Unique identifier to a record in `dataType`.
     */
    public Optional<? extends String> id() {
        return id;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The underlying data type associated to the reference `id`.
     */
    public SalesOrderRef withDataType(SalesOrderRefDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * The underlying data type associated to the reference `id`.
     */
    public SalesOrderRef withDataType(Optional<? extends SalesOrderRefDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier to a record in `dataType`.
     */
    public SalesOrderRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Unique identifier to a record in `dataType`.
     */
    public SalesOrderRef withId(Optional<? extends String> id) {
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
        SalesOrderRef other = (SalesOrderRef) o;
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
        return Utils.toString(SalesOrderRef.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends SalesOrderRefDataType> dataType = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The underlying data type associated to the reference `id`.
         */
        public Builder dataType(SalesOrderRefDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * The underlying data type associated to the reference `id`.
         */
        public Builder dataType(Optional<? extends SalesOrderRefDataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Unique identifier to a record in `dataType`.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Unique identifier to a record in `dataType`.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public SalesOrderRef build() {
            return new SalesOrderRef(
                dataType,
                id);
        }
    }
}
