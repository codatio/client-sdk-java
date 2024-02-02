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
 * ContactReference - A customer or supplier associated with the direct cost.
 */

public class ContactReference {

    /**
     * Allowed name of the 'dataType'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private JsonNullable<? extends DirectCostPrototypeDataType> dataType;

    /**
     * Unique identifier for a customer or supplier.
     */
    @JsonProperty("id")
    private String id;

    public ContactReference(
            @JsonProperty("dataType") JsonNullable<? extends DirectCostPrototypeDataType> dataType,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public JsonNullable<? extends DirectCostPrototypeDataType> dataType() {
        return dataType;
    }

    /**
     * Unique identifier for a customer or supplier.
     */
    public String id() {
        return id;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public ContactReference withDataType(DirectCostPrototypeDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = JsonNullable.of(dataType);
        return this;
    }

    /**
     * Allowed name of the 'dataType'.
     */
    public ContactReference withDataType(JsonNullable<? extends DirectCostPrototypeDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier for a customer or supplier.
     */
    public ContactReference withId(String id) {
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
        ContactReference other = (ContactReference) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContactReference.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends DirectCostPrototypeDataType> dataType = JsonNullable.undefined();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(DirectCostPrototypeDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = JsonNullable.of(dataType);
            return this;
        }

        /**
         * Allowed name of the 'dataType'.
         */
        public Builder dataType(JsonNullable<? extends DirectCostPrototypeDataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Unique identifier for a customer or supplier.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }        
        
        public ContactReference build() {
            return new ContactReference(
                dataType,
                id);
        }
    }
}

