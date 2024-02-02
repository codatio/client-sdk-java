/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * TransactionCategoryRef - An object of bank transaction category reference data.
 */

public class TransactionCategoryRef {

    /**
     * The unique category reference id for the bank transaction.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The category name reference for the bank transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    public TransactionCategoryRef(
            @JsonProperty("id") String id,
            @JsonProperty("name") JsonNullable<? extends String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * The unique category reference id for the bank transaction.
     */
    public String id() {
        return id;
    }

    /**
     * The category name reference for the bank transaction.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique category reference id for the bank transaction.
     */
    public TransactionCategoryRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The category name reference for the bank transaction.
     */
    public TransactionCategoryRef withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The category name reference for the bank transaction.
     */
    public TransactionCategoryRef withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        TransactionCategoryRef other = (TransactionCategoryRef) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransactionCategoryRef.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private String id;
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique category reference id for the bank transaction.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The category name reference for the bank transaction.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The category name reference for the bank transaction.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }        
        
        public TransactionCategoryRef build() {
            return new TransactionCategoryRef(
                id,
                name);
        }
    }
}

