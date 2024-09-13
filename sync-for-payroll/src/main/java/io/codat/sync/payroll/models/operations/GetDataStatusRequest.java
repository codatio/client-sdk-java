/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payroll.utils.SpeakeasyMetadata;
import io.codat.sync.payroll.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetDataStatusRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    @JsonCreator
    public GetDataStatusRequest(
            String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetDataStatusRequest withCompanyId(String companyId) {
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
        GetDataStatusRequest other = (GetDataStatusRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDataStatusRequest.class,
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
        
        public GetDataStatusRequest build() {
            return new GetDataStatusRequest(
                companyId);
        }
    }
}

