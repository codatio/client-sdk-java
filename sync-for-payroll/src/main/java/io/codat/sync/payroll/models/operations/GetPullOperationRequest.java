/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.SpeakeasyMetadata;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetPullOperationRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=datasetId")
    private String datasetId;

    public GetPullOperationRequest(
            String companyId,
            String datasetId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(datasetId, "datasetId");
        this.companyId = companyId;
        this.datasetId = datasetId;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public String datasetId() {
        return datasetId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetPullOperationRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public GetPullOperationRequest withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
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
        GetPullOperationRequest other = (GetPullOperationRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.datasetId, other.datasetId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            datasetId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPullOperationRequest.class,
                "companyId", companyId,
                "datasetId", datasetId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String datasetId;  
        
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
         * Unique identifier for the dataset that completed its sync.
         */
        public Builder datasetId(String datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = datasetId;
            return this;
        }
        
        public GetPullOperationRequest build() {
            return new GetPullOperationRequest(
                companyId,
                datasetId);
        }
    }
}

