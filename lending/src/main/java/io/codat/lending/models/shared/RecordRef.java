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
import java.util.Objects;
import java.util.Optional;

/**
 * RecordRef - Links the current record to the underlying record or data type that created it. 
 * 
 * For example, if a journal entry is generated based on an invoice, this property allows you to connect the journal entry to the underlying invoice in our data model. 
 */

public class RecordRef {

    /**
     * Allowed name of the 'dataType'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<String> dataType;

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public RecordRef(
            @JsonProperty("dataType") Optional<String> dataType,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }
    
    public RecordRef() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Allowed name of the 'dataType'.
     */
    @JsonIgnore
    public Optional<String> dataType() {
        return dataType;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public RecordRef withDataType(String dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public RecordRef withDataType(Optional<String> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public RecordRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public RecordRef withId(Optional<String> id) {
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
        RecordRef other = (RecordRef) o;
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
        return Utils.toString(RecordRef.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<String> dataType = Optional.empty();
 
        private Optional<String> id = Optional.empty();  
        
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
        public Builder dataType(Optional<String> dataType) {
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
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public RecordRef build() {
            return new RecordRef(
                dataType,
                id);
        }
    }
}

