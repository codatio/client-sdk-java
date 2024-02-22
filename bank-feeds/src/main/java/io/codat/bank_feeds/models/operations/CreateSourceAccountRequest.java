/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateSourceAccountRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount;

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

    public CreateSourceAccountRequest(
            Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.sourceAccount = sourceAccount;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    public Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount() {
        return sourceAccount;
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

    public CreateSourceAccountRequest withSourceAccount(io.codat.bank_feeds.models.components.SourceAccount sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = Optional.ofNullable(sourceAccount);
        return this;
    }
    
    public CreateSourceAccountRequest withSourceAccount(Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateSourceAccountRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateSourceAccountRequest withConnectionId(String connectionId) {
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
        CreateSourceAccountRequest other = (CreateSourceAccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.sourceAccount, other.sourceAccount) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceAccount,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSourceAccountRequest.class,
                "sourceAccount", sourceAccount,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder sourceAccount(io.codat.bank_feeds.models.components.SourceAccount sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = Optional.ofNullable(sourceAccount);
            return this;
        }
        
        public Builder sourceAccount(Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = sourceAccount;
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
        
        public CreateSourceAccountRequest build() {
            return new CreateSourceAccountRequest(
                sourceAccount,
                companyId,
                connectionId);
        }
    }
}

