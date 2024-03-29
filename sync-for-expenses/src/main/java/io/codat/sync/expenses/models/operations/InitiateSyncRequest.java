/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class InitiateSyncRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public InitiateSyncRequest(
            Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync,
            String companyId) {
        Utils.checkNotNull(initiateSync, "initiateSync");
        Utils.checkNotNull(companyId, "companyId");
        this.initiateSync = initiateSync;
        this.companyId = companyId;
    }

    public Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync() {
        return initiateSync;
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

    public InitiateSyncRequest withInitiateSync(io.codat.sync.expenses.models.components.InitiateSync initiateSync) {
        Utils.checkNotNull(initiateSync, "initiateSync");
        this.initiateSync = Optional.ofNullable(initiateSync);
        return this;
    }

    public InitiateSyncRequest withInitiateSync(Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync) {
        Utils.checkNotNull(initiateSync, "initiateSync");
        this.initiateSync = initiateSync;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public InitiateSyncRequest withCompanyId(String companyId) {
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
        InitiateSyncRequest other = (InitiateSyncRequest) o;
        return 
            java.util.Objects.deepEquals(this.initiateSync, other.initiateSync) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            initiateSync,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateSyncRequest.class,
                "initiateSync", initiateSync,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder initiateSync(io.codat.sync.expenses.models.components.InitiateSync initiateSync) {
            Utils.checkNotNull(initiateSync, "initiateSync");
            this.initiateSync = Optional.ofNullable(initiateSync);
            return this;
        }

        public Builder initiateSync(Optional<? extends io.codat.sync.expenses.models.components.InitiateSync> initiateSync) {
            Utils.checkNotNull(initiateSync, "initiateSync");
            this.initiateSync = initiateSync;
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
        
        public InitiateSyncRequest build() {
            return new InitiateSyncRequest(
                initiateSync,
                companyId);
        }
    }
}

