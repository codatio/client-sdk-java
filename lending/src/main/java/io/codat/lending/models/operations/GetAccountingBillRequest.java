/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetAccountingBillRequest {

    /**
     * Unique identifier for a bill.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=billId")
    private String billId;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public GetAccountingBillRequest(
            String billId,
            String companyId) {
        Utils.checkNotNull(billId, "billId");
        Utils.checkNotNull(companyId, "companyId");
        this.billId = billId;
        this.companyId = companyId;
    }

    /**
     * Unique identifier for a bill.
     */
    public String billId() {
        return billId;
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
     * Unique identifier for a bill.
     */
    public GetAccountingBillRequest withBillId(String billId) {
        Utils.checkNotNull(billId, "billId");
        this.billId = billId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingBillRequest withCompanyId(String companyId) {
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
        GetAccountingBillRequest other = (GetAccountingBillRequest) o;
        return 
            java.util.Objects.deepEquals(this.billId, other.billId) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            billId,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingBillRequest.class,
                "billId", billId,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private String billId;
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a bill.
         */
        public Builder billId(String billId) {
            Utils.checkNotNull(billId, "billId");
            this.billId = billId;
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
        
        public GetAccountingBillRequest build() {
            return new GetAccountingBillRequest(
                billId,
                companyId);
        }
    }
}
