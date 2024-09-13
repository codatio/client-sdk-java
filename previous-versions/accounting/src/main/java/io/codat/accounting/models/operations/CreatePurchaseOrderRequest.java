/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.PurchaseOrder;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreatePurchaseOrderRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private JsonNullable<? extends PurchaseOrder> purchaseOrder;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public CreatePurchaseOrderRequest(
            JsonNullable<? extends PurchaseOrder> purchaseOrder,
            String companyId,
            String connectionId,
            Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(purchaseOrder, "purchaseOrder");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.purchaseOrder = purchaseOrder;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    public CreatePurchaseOrderRequest(
            String companyId,
            String connectionId) {
        this(JsonNullable.undefined(), companyId, connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PurchaseOrder> purchaseOrder() {
        return (JsonNullable<PurchaseOrder>) purchaseOrder;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @JsonIgnore
    public Optional<Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreatePurchaseOrderRequest withPurchaseOrder(PurchaseOrder purchaseOrder) {
        Utils.checkNotNull(purchaseOrder, "purchaseOrder");
        this.purchaseOrder = JsonNullable.of(purchaseOrder);
        return this;
    }

    public CreatePurchaseOrderRequest withPurchaseOrder(JsonNullable<? extends PurchaseOrder> purchaseOrder) {
        Utils.checkNotNull(purchaseOrder, "purchaseOrder");
        this.purchaseOrder = purchaseOrder;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreatePurchaseOrderRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreatePurchaseOrderRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreatePurchaseOrderRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreatePurchaseOrderRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
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
        CreatePurchaseOrderRequest other = (CreatePurchaseOrderRequest) o;
        return 
            Objects.deepEquals(this.purchaseOrder, other.purchaseOrder) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            purchaseOrder,
            companyId,
            connectionId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePurchaseOrderRequest.class,
                "purchaseOrder", purchaseOrder,
                "companyId", companyId,
                "connectionId", connectionId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends PurchaseOrder> purchaseOrder = JsonNullable.undefined();
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder purchaseOrder(PurchaseOrder purchaseOrder) {
            Utils.checkNotNull(purchaseOrder, "purchaseOrder");
            this.purchaseOrder = JsonNullable.of(purchaseOrder);
            return this;
        }

        public Builder purchaseOrder(JsonNullable<? extends PurchaseOrder> purchaseOrder) {
            Utils.checkNotNull(purchaseOrder, "purchaseOrder");
            this.purchaseOrder = purchaseOrder;
            return this;
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
            return this;
        }

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(Optional<Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public CreatePurchaseOrderRequest build() {
            return new CreatePurchaseOrderRequest(
                purchaseOrder,
                companyId,
                connectionId,
                timeoutInMinutes);
        }
    }
}

