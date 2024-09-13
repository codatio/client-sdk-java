/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class Metadata {

    /**
     * Indicates whether the record has been deleted in the third-party system this record originated from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isDeleted")
    private JsonNullable<Boolean> isDeleted;

    @JsonCreator
    public Metadata(
            @JsonProperty("isDeleted") JsonNullable<Boolean> isDeleted) {
        Utils.checkNotNull(isDeleted, "isDeleted");
        this.isDeleted = isDeleted;
    }
    
    public Metadata() {
        this(JsonNullable.undefined());
    }

    /**
     * Indicates whether the record has been deleted in the third-party system this record originated from.
     */
    @JsonIgnore
    public JsonNullable<Boolean> isDeleted() {
        return isDeleted;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates whether the record has been deleted in the third-party system this record originated from.
     */
    public Metadata withIsDeleted(boolean isDeleted) {
        Utils.checkNotNull(isDeleted, "isDeleted");
        this.isDeleted = JsonNullable.of(isDeleted);
        return this;
    }

    /**
     * Indicates whether the record has been deleted in the third-party system this record originated from.
     */
    public Metadata withIsDeleted(JsonNullable<Boolean> isDeleted) {
        Utils.checkNotNull(isDeleted, "isDeleted");
        this.isDeleted = isDeleted;
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
        Metadata other = (Metadata) o;
        return 
            Objects.deepEquals(this.isDeleted, other.isDeleted);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            isDeleted);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Metadata.class,
                "isDeleted", isDeleted);
    }
    
    public final static class Builder {
 
        private JsonNullable<Boolean> isDeleted = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicates whether the record has been deleted in the third-party system this record originated from.
         */
        public Builder isDeleted(boolean isDeleted) {
            Utils.checkNotNull(isDeleted, "isDeleted");
            this.isDeleted = JsonNullable.of(isDeleted);
            return this;
        }

        /**
         * Indicates whether the record has been deleted in the third-party system this record originated from.
         */
        public Builder isDeleted(JsonNullable<Boolean> isDeleted) {
            Utils.checkNotNull(isDeleted, "isDeleted");
            this.isDeleted = isDeleted;
            return this;
        }
        
        public Metadata build() {
            return new Metadata(
                isDeleted);
        }
    }
}

