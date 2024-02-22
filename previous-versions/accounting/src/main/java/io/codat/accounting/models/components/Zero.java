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
 * Zero - Reference to the purchase order line this line was generated from.
 */

public class Zero {

    /**
     * Allowed name of the 'dataType'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends ZeroDataType> dataType;

    /**
     * 'id' of the underlying record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Line number of the underlying record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineNumber")
    private Optional<? extends String> lineNumber;

    public Zero(
            @JsonProperty("dataType") Optional<? extends ZeroDataType> dataType,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("lineNumber") Optional<? extends String> lineNumber) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.dataType = dataType;
        this.id = id;
        this.lineNumber = lineNumber;
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public Optional<? extends ZeroDataType> dataType() {
        return dataType;
    }

    /**
     * 'id' of the underlying record.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Line number of the underlying record.
     */
    public Optional<? extends String> lineNumber() {
        return lineNumber;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public Zero withDataType(ZeroDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * Allowed name of the 'dataType'.
     */
    public Zero withDataType(Optional<? extends ZeroDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * 'id' of the underlying record.
     */
    public Zero withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * 'id' of the underlying record.
     */
    public Zero withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Line number of the underlying record.
     */
    public Zero withLineNumber(String lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = Optional.ofNullable(lineNumber);
        return this;
    }
    
    /**
     * Line number of the underlying record.
     */
    public Zero withLineNumber(Optional<? extends String> lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = lineNumber;
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
        Zero other = (Zero) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.lineNumber, other.lineNumber);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            id,
            lineNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Zero.class,
                "dataType", dataType,
                "id", id,
                "lineNumber", lineNumber);
    }
    
    public final static class Builder {
 
        private Optional<? extends ZeroDataType> dataType = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> lineNumber = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(ZeroDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(Optional<? extends ZeroDataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * 'id' of the underlying record.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * 'id' of the underlying record.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Line number of the underlying record.
         */
        public Builder lineNumber(String lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = Optional.ofNullable(lineNumber);
            return this;
        }
        
        /**
         * Line number of the underlying record.
         */
        public Builder lineNumber(Optional<? extends String> lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = lineNumber;
            return this;
        }
        
        public Zero build() {
            return new Zero(
                dataType,
                id,
                lineNumber);
        }
    }
}

