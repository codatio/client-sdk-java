/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class ListAccountingDirectIncomeAttachmentsRequest {

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
     * Unique identifier for a direct income.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=directIncomeId")
    private String directIncomeId;

    public ListAccountingDirectIncomeAttachmentsRequest(
            String companyId,
            String connectionId,
            String directIncomeId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.directIncomeId = directIncomeId;
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
     * Unique identifier for a direct income.
     */
    public String directIncomeId() {
        return directIncomeId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public ListAccountingDirectIncomeAttachmentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public ListAccountingDirectIncomeAttachmentsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Unique identifier for a direct income.
     */
    public ListAccountingDirectIncomeAttachmentsRequest withDirectIncomeId(String directIncomeId) {
        Utils.checkNotNull(directIncomeId, "directIncomeId");
        this.directIncomeId = directIncomeId;
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
        ListAccountingDirectIncomeAttachmentsRequest other = (ListAccountingDirectIncomeAttachmentsRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.directIncomeId, other.directIncomeId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            directIncomeId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountingDirectIncomeAttachmentsRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "directIncomeId", directIncomeId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String directIncomeId;  
        
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
         * Unique identifier for a direct income.
         */
        public Builder directIncomeId(String directIncomeId) {
            Utils.checkNotNull(directIncomeId, "directIncomeId");
            this.directIncomeId = directIncomeId;
            return this;
        }
        
        public ListAccountingDirectIncomeAttachmentsRequest build() {
            return new ListAccountingDirectIncomeAttachmentsRequest(
                companyId,
                connectionId,
                directIncomeId);
        }
    }
}

