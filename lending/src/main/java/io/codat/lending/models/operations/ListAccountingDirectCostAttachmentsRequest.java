/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ListAccountingDirectCostAttachmentsRequest {

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
     * Unique identifier for a direct cost.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=directCostId")
    private String directCostId;

    @JsonCreator
    public ListAccountingDirectCostAttachmentsRequest(
            String companyId,
            String connectionId,
            String directCostId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(directCostId, "directCostId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.directCostId = directCostId;
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Unique identifier for a direct cost.
     */
    @JsonIgnore
    public String directCostId() {
        return directCostId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListAccountingDirectCostAttachmentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListAccountingDirectCostAttachmentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a direct cost.
     */
    public ListAccountingDirectCostAttachmentsRequest withDirectCostId(String directCostId) {
        Utils.checkNotNull(directCostId, "directCostId");
        this.directCostId = directCostId;
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
        ListAccountingDirectCostAttachmentsRequest other = (ListAccountingDirectCostAttachmentsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.directCostId, other.directCostId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            directCostId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingDirectCostAttachmentsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "directCostId", directCostId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String directCostId;  
        
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
         * Unique identifier for a direct cost.
         */
        public Builder directCostId(String directCostId) {
            Utils.checkNotNull(directCostId, "directCostId");
            this.directCostId = directCostId;
            return this;
        }
        
        public ListAccountingDirectCostAttachmentsRequest build() {
            return new ListAccountingDirectCostAttachmentsRequest(
                companyId,
                connectionId,
                directCostId);
        }
    }
}

