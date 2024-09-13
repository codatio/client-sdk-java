/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.commerce.utils.SpeakeasyMetadata;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetSyncByIdRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a sync.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=syncId")
    private String syncId;

    @JsonCreator
    public GetSyncByIdRequest(
            String companyId,
            String syncId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(syncId, "syncId");
        this.companyId = companyId;
        this.syncId = syncId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a sync.
     */
    @JsonIgnore
    public String syncId() {
        return syncId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetSyncByIdRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a sync.
     */
    public GetSyncByIdRequest withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
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
        GetSyncByIdRequest other = (GetSyncByIdRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.syncId, other.syncId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            syncId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSyncByIdRequest.class,
                "companyId", companyId,
                "syncId", syncId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String syncId;  
        
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
         * Unique identifier for a sync.
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }
        
        public GetSyncByIdRequest build() {
            return new GetSyncByIdRequest(
                companyId,
                syncId);
        }
    }
}

