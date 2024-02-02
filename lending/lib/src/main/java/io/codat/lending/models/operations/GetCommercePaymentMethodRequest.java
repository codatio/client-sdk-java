/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class GetCommercePaymentMethodRequest {

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
     * Unique identifier for a payment method.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentMethodId")
    private String paymentMethodId;

    public GetCommercePaymentMethodRequest(
            String companyId,
            String connectionId,
            String paymentMethodId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(paymentMethodId, "paymentMethodId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * Unique identifier for a payment method.
     */
    public String paymentMethodId() {
        return paymentMethodId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCommercePaymentMethodRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCommercePaymentMethodRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a payment method.
     */
    public GetCommercePaymentMethodRequest withPaymentMethodId(String paymentMethodId) {
        Utils.checkNotNull(paymentMethodId, "paymentMethodId");
        this.paymentMethodId = paymentMethodId;
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
        GetCommercePaymentMethodRequest other = (GetCommercePaymentMethodRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.paymentMethodId, other.paymentMethodId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            paymentMethodId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommercePaymentMethodRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "paymentMethodId", paymentMethodId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String paymentMethodId;  
        
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
         * Unique identifier for a payment method.
         */
        public Builder paymentMethodId(String paymentMethodId) {
            Utils.checkNotNull(paymentMethodId, "paymentMethodId");
            this.paymentMethodId = paymentMethodId;
            return this;
        }        
        
        public GetCommercePaymentMethodRequest build() {
            return new GetCommercePaymentMethodRequest(
                companyId,
                connectionId,
                paymentMethodId);
        }
    }
}

