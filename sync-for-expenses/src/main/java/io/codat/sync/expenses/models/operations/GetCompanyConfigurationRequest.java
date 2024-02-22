/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetCompanyConfigurationRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public GetCompanyConfigurationRequest(
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
    public GetCompanyConfigurationRequest withCompanyId(String companyId) {
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
        GetCompanyConfigurationRequest other = (GetCompanyConfigurationRequest) o;
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
        return Utils.toString(GetCompanyConfigurationRequest.class,
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
        
        public GetCompanyConfigurationRequest build() {
            return new GetCompanyConfigurationRequest(
                companyId);
        }
    }
}

