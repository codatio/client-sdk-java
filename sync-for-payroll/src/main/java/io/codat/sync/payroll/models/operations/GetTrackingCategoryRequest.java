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


public class GetTrackingCategoryRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a tracking category.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=trackingCategoryId")
    private String trackingCategoryId;

    @JsonCreator
    public GetTrackingCategoryRequest(
            String companyId,
            String trackingCategoryId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(trackingCategoryId, "trackingCategoryId");
        this.companyId = companyId;
        this.trackingCategoryId = trackingCategoryId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a tracking category.
     */
    @JsonIgnore
    public String trackingCategoryId() {
        return trackingCategoryId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetTrackingCategoryRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a tracking category.
     */
    public GetTrackingCategoryRequest withTrackingCategoryId(String trackingCategoryId) {
        Utils.checkNotNull(trackingCategoryId, "trackingCategoryId");
        this.trackingCategoryId = trackingCategoryId;
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
        GetTrackingCategoryRequest other = (GetTrackingCategoryRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.trackingCategoryId, other.trackingCategoryId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            trackingCategoryId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTrackingCategoryRequest.class,
                "companyId", companyId,
                "trackingCategoryId", trackingCategoryId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String trackingCategoryId;  
        
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
         * Unique identifier for a tracking category.
         */
        public Builder trackingCategoryId(String trackingCategoryId) {
            Utils.checkNotNull(trackingCategoryId, "trackingCategoryId");
            this.trackingCategoryId = trackingCategoryId;
            return this;
        }
        
        public GetTrackingCategoryRequest build() {
            return new GetTrackingCategoryRequest(
                companyId,
                trackingCategoryId);
        }
    }
}

