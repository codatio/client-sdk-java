/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class TransactionSourceRef {

    /**
     * The unique identitifer of the record being referenced
     */
    @JsonProperty("id")
    private String id;

    /**
     * The type of source the transaction arose.
     */
    @JsonProperty("type")
    private TransactionSourceType type;

    public TransactionSourceRef(
            @JsonProperty("id") String id,
            @JsonProperty("type") TransactionSourceType type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.type = type;
    }

    /**
     * The unique identitifer of the record being referenced
     */
    public String id() {
        return id;
    }

    /**
     * The type of source the transaction arose.
     */
    public TransactionSourceType type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identitifer of the record being referenced
     */
    public TransactionSourceRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The type of source the transaction arose.
     */
    public TransactionSourceRef withType(TransactionSourceType type) {
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
        TransactionSourceRef other = (TransactionSourceRef) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransactionSourceRef.class,
                "id", id,
                "type", type);
    }
    
    public final static class Builder {
 
        private String id;
 
        private TransactionSourceType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identitifer of the record being referenced
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The type of source the transaction arose.
         */
        public Builder type(TransactionSourceType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public TransactionSourceRef build() {
            return new TransactionSourceRef(
                id,
                type);
        }
    }
}
