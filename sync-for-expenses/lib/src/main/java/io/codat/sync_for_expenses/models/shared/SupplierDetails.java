/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class SupplierDetails {

    /**
     * Identifier for the supplier, unique to the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    public SupplierDetails(
            @JsonProperty("id") Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * Identifier for the supplier, unique to the company in the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Identifier for the supplier, unique to the company in the accounting platform.
     */
    public SupplierDetails withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Identifier for the supplier, unique to the company in the accounting platform.
     */
    public SupplierDetails withId(Optional<? extends String> id) {
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
        SupplierDetails other = (SupplierDetails) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SupplierDetails.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Identifier for the supplier, unique to the company in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Identifier for the supplier, unique to the company in the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }        
        
        public SupplierDetails build() {
            return new SupplierDetails(
                id);
        }
    }
}

