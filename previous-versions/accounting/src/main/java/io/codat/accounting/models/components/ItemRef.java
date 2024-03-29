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
import org.openapitools.jackson.nullable.JsonNullable;


public class ItemRef {

    /**
     * Unique identifier for the item in the accounting platform.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Name of the item in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    public ItemRef(
            @JsonProperty("id") String id,
            @JsonProperty("name") JsonNullable<? extends String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * Unique identifier for the item in the accounting platform.
     */
    public String id() {
        return id;
    }

    /**
     * Name of the item in the accounting platform.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the item in the accounting platform.
     */
    public ItemRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the item in the accounting platform.
     */
    public ItemRef withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the item in the accounting platform.
     */
    public ItemRef withName(JsonNullable<? extends String> name) {
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
        ItemRef other = (ItemRef) o;
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
        return Utils.toString(ItemRef.class,
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
         * Unique identifier for the item in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the item in the accounting platform.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the item in the accounting platform.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public ItemRef build() {
            return new ItemRef(
                id,
                name);
        }
    }
}

