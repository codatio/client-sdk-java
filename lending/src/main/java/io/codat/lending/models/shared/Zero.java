/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Zero - Links the current record line to the underlying record line that created it. 
 * 
 * For example, if a bill is generated from a purchase order, this property allows you to connect the bill line item to the purchase order line item in our data model. 
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
    private Optional<String> id;

    /**
     * Line number of the underlying record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineNumber")
    private Optional<String> lineNumber;

    @JsonCreator
    public Zero(
            @JsonProperty("dataType") Optional<? extends ZeroDataType> dataType,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("lineNumber") Optional<String> lineNumber) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.dataType = dataType;
        this.id = id;
        this.lineNumber = lineNumber;
    }
    
    public Zero() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Allowed name of the 'dataType'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ZeroDataType> dataType() {
        return (Optional<ZeroDataType>) dataType;
    }

    /**
     * 'id' of the underlying record.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Line number of the underlying record.
     */
    @JsonIgnore
    public Optional<String> lineNumber() {
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
    public Zero withId(Optional<String> id) {
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
    public Zero withLineNumber(Optional<String> lineNumber) {
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
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.lineNumber, other.lineNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> lineNumber = Optional.empty();  
        
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
        public Builder id(Optional<String> id) {
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
        public Builder lineNumber(Optional<String> lineNumber) {
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

