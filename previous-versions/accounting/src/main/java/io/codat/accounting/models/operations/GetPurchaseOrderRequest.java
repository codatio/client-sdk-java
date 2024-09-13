/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetPurchaseOrderRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a purchase order.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=purchaseOrderId")
    private String purchaseOrderId;

    @JsonCreator
    public GetPurchaseOrderRequest(
            String companyId,
            String purchaseOrderId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(purchaseOrderId, "purchaseOrderId");
        this.companyId = companyId;
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a purchase order.
     */
    @JsonIgnore
    public String purchaseOrderId() {
        return purchaseOrderId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetPurchaseOrderRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a purchase order.
     */
    public GetPurchaseOrderRequest withPurchaseOrderId(String purchaseOrderId) {
        Utils.checkNotNull(purchaseOrderId, "purchaseOrderId");
        this.purchaseOrderId = purchaseOrderId;
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
        GetPurchaseOrderRequest other = (GetPurchaseOrderRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.purchaseOrderId, other.purchaseOrderId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            purchaseOrderId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPurchaseOrderRequest.class,
                "companyId", companyId,
                "purchaseOrderId", purchaseOrderId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String purchaseOrderId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for a purchase order.
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            Utils.checkNotNull(purchaseOrderId, "purchaseOrderId");
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        
        public GetPurchaseOrderRequest build() {
            return new GetPurchaseOrderRequest(
                companyId,
                purchaseOrderId);
        }
    }
}

