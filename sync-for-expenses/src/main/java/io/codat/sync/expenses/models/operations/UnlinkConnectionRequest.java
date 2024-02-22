/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UnlinkConnectionRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends UnlinkConnectionUpdateConnection> requestBody;

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

    public UnlinkConnectionRequest(
            Optional<? extends UnlinkConnectionUpdateConnection> requestBody,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.requestBody = requestBody;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    public Optional<? extends UnlinkConnectionUpdateConnection> requestBody() {
        return requestBody;
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

    public UnlinkConnectionRequest withRequestBody(UnlinkConnectionUpdateConnection requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }
    
    public UnlinkConnectionRequest withRequestBody(Optional<? extends UnlinkConnectionUpdateConnection> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public UnlinkConnectionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public UnlinkConnectionRequest withConnectionId(String connectionId) {
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
        UnlinkConnectionRequest other = (UnlinkConnectionRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnlinkConnectionRequest.class,
                "requestBody", requestBody,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends UnlinkConnectionUpdateConnection> requestBody = Optional.empty();
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(UnlinkConnectionUpdateConnection requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }
        
        public Builder requestBody(Optional<? extends UnlinkConnectionUpdateConnection> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
        
        public UnlinkConnectionRequest build() {
            return new UnlinkConnectionRequest(
                requestBody,
                companyId,
                connectionId);
        }
    }
}

