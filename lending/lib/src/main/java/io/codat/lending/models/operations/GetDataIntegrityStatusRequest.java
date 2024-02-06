/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class GetDataIntegrityStatusRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * A key for a Codat data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=dataType")
    private io.codat.lending.models.shared.DataIntegrityDataType dataType;

    public GetDataIntegrityStatusRequest(
            String companyId,
            io.codat.lending.models.shared.DataIntegrityDataType dataType) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(dataType, "dataType");
        this.companyId = companyId;
        this.dataType = dataType;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * A key for a Codat data type.
     */
    public io.codat.lending.models.shared.DataIntegrityDataType dataType() {
        return dataType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetDataIntegrityStatusRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * A key for a Codat data type.
     */
    public GetDataIntegrityStatusRequest withDataType(io.codat.lending.models.shared.DataIntegrityDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
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
        GetDataIntegrityStatusRequest other = (GetDataIntegrityStatusRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.dataType, other.dataType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            dataType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDataIntegrityStatusRequest.class,
                "companyId", companyId,
                "dataType", dataType);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private io.codat.lending.models.shared.DataIntegrityDataType dataType;  
        
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
         * A key for a Codat data type.
         */
        public Builder dataType(io.codat.lending.models.shared.DataIntegrityDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }        
        
        public GetDataIntegrityStatusRequest build() {
            return new GetDataIntegrityStatusRequest(
                companyId,
                dataType);
        }
    }
}
