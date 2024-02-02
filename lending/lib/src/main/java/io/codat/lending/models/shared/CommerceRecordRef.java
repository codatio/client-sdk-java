/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class CommerceRecordRef {

    /**
     * The unique identitifer of the record being referenced
     */
    @JsonProperty("id")
    private String id;

    /**
     * The type of record being referenced.
     */
    @JsonProperty("type")
    private String type;

    public CommerceRecordRef(
            @JsonProperty("id") String id,
            @JsonProperty("type") String type) {
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
     * The type of record being referenced.
     */
    public String type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identitifer of the record being referenced
     */
    public CommerceRecordRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The type of record being referenced.
     */
    public CommerceRecordRef withType(String type) {
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
        CommerceRecordRef other = (CommerceRecordRef) o;
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
        return Utils.toString(CommerceRecordRef.class,
                "id", id,
                "type", type);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String type;  
        
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
         * The type of record being referenced.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }        
        
        public CommerceRecordRef build() {
            return new CommerceRecordRef(
                id,
                type);
        }
    }
}

