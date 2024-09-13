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


public class GetAccountingPaymentRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a payment.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentId")
    private String paymentId;

    @JsonCreator
    public GetAccountingPaymentRequest(
            String companyId,
            String paymentId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(paymentId, "paymentId");
        this.companyId = companyId;
        this.paymentId = paymentId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a payment.
     */
    @JsonIgnore
    public String paymentId() {
        return paymentId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingPaymentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a payment.
     */
    public GetAccountingPaymentRequest withPaymentId(String paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = paymentId;
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
        GetAccountingPaymentRequest other = (GetAccountingPaymentRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.paymentId, other.paymentId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            paymentId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingPaymentRequest.class,
                "companyId", companyId,
                "paymentId", paymentId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String paymentId;  
        
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
         * Unique identifier for a payment.
         */
        public Builder paymentId(String paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = paymentId;
            return this;
        }
        
        public GetAccountingPaymentRequest build() {
            return new GetAccountingPaymentRequest(
                companyId,
                paymentId);
        }
    }
}

