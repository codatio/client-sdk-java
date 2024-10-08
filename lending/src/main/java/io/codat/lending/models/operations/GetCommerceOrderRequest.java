/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCommerceOrderRequest {

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
     * Unique identifier for an order.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orderId")
    private String orderId;

    @JsonCreator
    public GetCommerceOrderRequest(
            String companyId,
            String connectionId,
            String orderId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(orderId, "orderId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.orderId = orderId;
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
     * Unique identifier for an order.
     */
    @JsonIgnore
    public String orderId() {
        return orderId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCommerceOrderRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCommerceOrderRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for an order.
     */
    public GetCommerceOrderRequest withOrderId(String orderId) {
        Utils.checkNotNull(orderId, "orderId");
        this.orderId = orderId;
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
        GetCommerceOrderRequest other = (GetCommerceOrderRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.orderId, other.orderId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            orderId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommerceOrderRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "orderId", orderId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String orderId;  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Unique identifier for an order.
         */
        public Builder orderId(String orderId) {
            Utils.checkNotNull(orderId, "orderId");
            this.orderId = orderId;
            return this;
        }
        
        public GetCommerceOrderRequest build() {
            return new GetCommerceOrderRequest(
                companyId,
                connectionId,
                orderId);
        }
    }
}

