/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class IsAgedDebtorsReportAvailableRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public IsAgedDebtorsReportAvailableRequest(
            String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
     * Unique identifier for a company.
     */
    public IsAgedDebtorsReportAvailableRequest withCompanyId(String companyId) {
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
        IsAgedDebtorsReportAvailableRequest other = (IsAgedDebtorsReportAvailableRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IsAgedDebtorsReportAvailableRequest.class,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private String companyId;  
        
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
        
        public IsAgedDebtorsReportAvailableRequest build() {
            return new IsAgedDebtorsReportAvailableRequest(
                companyId);
        }
    }
}

