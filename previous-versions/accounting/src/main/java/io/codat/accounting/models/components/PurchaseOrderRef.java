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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PurchaseOrderRef {

    /**
     * Identifier for the purchase order, unique for the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Friendly reference for the purchase order, commonly generated by the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purchaseOrderNumber")
    private JsonNullable<? extends String> purchaseOrderNumber;

    public PurchaseOrderRef(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("purchaseOrderNumber") JsonNullable<? extends String> purchaseOrderNumber) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(purchaseOrderNumber, "purchaseOrderNumber");
        this.id = id;
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    /**
     * Identifier for the purchase order, unique for the company in the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Friendly reference for the purchase order, commonly generated by the accounting platform.
     */
    public JsonNullable<? extends String> purchaseOrderNumber() {
        return purchaseOrderNumber;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Identifier for the purchase order, unique for the company in the accounting platform.
     */
    public PurchaseOrderRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Identifier for the purchase order, unique for the company in the accounting platform.
     */
    public PurchaseOrderRef withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Friendly reference for the purchase order, commonly generated by the accounting platform.
     */
    public PurchaseOrderRef withPurchaseOrderNumber(String purchaseOrderNumber) {
        Utils.checkNotNull(purchaseOrderNumber, "purchaseOrderNumber");
        this.purchaseOrderNumber = JsonNullable.of(purchaseOrderNumber);
        return this;
    }

    /**
     * Friendly reference for the purchase order, commonly generated by the accounting platform.
     */
    public PurchaseOrderRef withPurchaseOrderNumber(JsonNullable<? extends String> purchaseOrderNumber) {
        Utils.checkNotNull(purchaseOrderNumber, "purchaseOrderNumber");
        this.purchaseOrderNumber = purchaseOrderNumber;
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
        PurchaseOrderRef other = (PurchaseOrderRef) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.purchaseOrderNumber, other.purchaseOrderNumber);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            purchaseOrderNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PurchaseOrderRef.class,
                "id", id,
                "purchaseOrderNumber", purchaseOrderNumber);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private JsonNullable<? extends String> purchaseOrderNumber = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Identifier for the purchase order, unique for the company in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Identifier for the purchase order, unique for the company in the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Friendly reference for the purchase order, commonly generated by the accounting platform.
         */
        public Builder purchaseOrderNumber(String purchaseOrderNumber) {
            Utils.checkNotNull(purchaseOrderNumber, "purchaseOrderNumber");
            this.purchaseOrderNumber = JsonNullable.of(purchaseOrderNumber);
            return this;
        }

        /**
         * Friendly reference for the purchase order, commonly generated by the accounting platform.
         */
        public Builder purchaseOrderNumber(JsonNullable<? extends String> purchaseOrderNumber) {
            Utils.checkNotNull(purchaseOrderNumber, "purchaseOrderNumber");
            this.purchaseOrderNumber = purchaseOrderNumber;
            return this;
        }
        
        public PurchaseOrderRef build() {
            return new PurchaseOrderRef(
                id,
                purchaseOrderNumber);
        }
    }
}

