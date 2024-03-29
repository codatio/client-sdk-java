/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateBankAccountMappingRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.bank_feeds.models.components.Zero> zero;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    public CreateBankAccountMappingRequest(
            Optional<? extends io.codat.bank_feeds.models.components.Zero> zero,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(zero, "zero");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.zero = zero;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    public Optional<? extends io.codat.bank_feeds.models.components.Zero> zero() {
        return zero;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    public String connectionId() {
        return connectionId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateBankAccountMappingRequest withZero(io.codat.bank_feeds.models.components.Zero zero) {
        Utils.checkNotNull(zero, "zero");
        this.zero = Optional.ofNullable(zero);
        return this;
    }
    
    public CreateBankAccountMappingRequest withZero(Optional<? extends io.codat.bank_feeds.models.components.Zero> zero) {
        Utils.checkNotNull(zero, "zero");
        this.zero = zero;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateBankAccountMappingRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateBankAccountMappingRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
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
        CreateBankAccountMappingRequest other = (CreateBankAccountMappingRequest) o;
        return 
            java.util.Objects.deepEquals(this.zero, other.zero) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            zero,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountMappingRequest.class,
                "zero", zero,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.bank_feeds.models.components.Zero> zero = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder zero(io.codat.bank_feeds.models.components.Zero zero) {
            Utils.checkNotNull(zero, "zero");
            this.zero = Optional.ofNullable(zero);
            return this;
        }
        
        public Builder zero(Optional<? extends io.codat.bank_feeds.models.components.Zero> zero) {
            Utils.checkNotNull(zero, "zero");
            this.zero = zero;
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

        /**
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }
        
        public CreateBankAccountMappingRequest build() {
            return new CreateBankAccountMappingRequest(
                zero,
                companyId,
                connectionId);
        }
    }
}

