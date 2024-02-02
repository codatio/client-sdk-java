/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class GetAccountingBillPaymentRequest {

    /**
     * Unique identifier for a bill payment.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=billPaymentId")
    private String billPaymentId;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public GetAccountingBillPaymentRequest(
            String billPaymentId,
            String companyId) {
        Utils.checkNotNull(billPaymentId, "billPaymentId");
        Utils.checkNotNull(companyId, "companyId");
        this.billPaymentId = billPaymentId;
        this.companyId = companyId;
    }

    /**
     * Unique identifier for a bill payment.
     */
    public String billPaymentId() {
        return billPaymentId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a bill payment.
     */
    public GetAccountingBillPaymentRequest withBillPaymentId(String billPaymentId) {
        Utils.checkNotNull(billPaymentId, "billPaymentId");
        this.billPaymentId = billPaymentId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingBillPaymentRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
        GetAccountingBillPaymentRequest other = (GetAccountingBillPaymentRequest) o;
        return 
            java.util.Objects.deepEquals(this.billPaymentId, other.billPaymentId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            billPaymentId,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingBillPaymentRequest.class,
                "billPaymentId", billPaymentId,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private String billPaymentId;
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a bill payment.
         */
        public Builder billPaymentId(String billPaymentId) {
            Utils.checkNotNull(billPaymentId, "billPaymentId");
            this.billPaymentId = billPaymentId;
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
        
        public GetAccountingBillPaymentRequest build() {
            return new GetAccountingBillPaymentRequest(
                billPaymentId,
                companyId);
        }
    }
}

