/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class GetCommerceDisputeRequest {

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

    /**
     * Unique identifier for a dispute.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=disputeId")
    private String disputeId;

    public GetCommerceDisputeRequest(
            String companyId,
            String connectionId,
            String disputeId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(disputeId, "disputeId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.disputeId = disputeId;
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

    /**
     * Unique identifier for a dispute.
     */
    public String disputeId() {
        return disputeId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCommerceDisputeRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCommerceDisputeRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a dispute.
     */
    public GetCommerceDisputeRequest withDisputeId(String disputeId) {
        Utils.checkNotNull(disputeId, "disputeId");
        this.disputeId = disputeId;
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
        GetCommerceDisputeRequest other = (GetCommerceDisputeRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.disputeId, other.disputeId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            disputeId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommerceDisputeRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "disputeId", disputeId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String disputeId;  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Unique identifier for a dispute.
         */
        public Builder disputeId(String disputeId) {
            Utils.checkNotNull(disputeId, "disputeId");
            this.disputeId = disputeId;
            return this;
        }        
        
        public GetCommerceDisputeRequest build() {
            return new GetCommerceDisputeRequest(
                companyId,
                connectionId,
                disputeId);
        }
    }
}
