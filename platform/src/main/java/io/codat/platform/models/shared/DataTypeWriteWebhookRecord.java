/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class DataTypeWriteWebhookRecord {

    /**
     * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public DataTypeWriteWebhookRecord(
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }
    
    public DataTypeWriteWebhookRecord() {
        this(Optional.empty());
    }

    /**
     * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
     */
    public DataTypeWriteWebhookRecord withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
     */
    public DataTypeWriteWebhookRecord withId(Optional<String> id) {
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
        DataTypeWriteWebhookRecord other = (DataTypeWriteWebhookRecord) o;
        return 
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataTypeWriteWebhookRecord.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The unique identifier of the data type created, updated, deleted, or had an attachment uploaded in the accounting platform.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public DataTypeWriteWebhookRecord build() {
            return new DataTypeWriteWebhookRecord(
                id);
        }
    }
}
