/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.banking.models.operations;

import io.codat.banking.utils.SpeakeasyMetadata;
import io.codat.banking.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class GetTransactionCategoryRequest {

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
     * The unique identifier for a banking transaction category
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transactionCategoryId")
    private String transactionCategoryId;

    public GetTransactionCategoryRequest(
            String companyId,
            String connectionId,
            String transactionCategoryId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(transactionCategoryId, "transactionCategoryId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.transactionCategoryId = transactionCategoryId;
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
     * The unique identifier for a banking transaction category
     */
    public String transactionCategoryId() {
        return transactionCategoryId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetTransactionCategoryRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetTransactionCategoryRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The unique identifier for a banking transaction category
     */
    public GetTransactionCategoryRequest withTransactionCategoryId(String transactionCategoryId) {
        Utils.checkNotNull(transactionCategoryId, "transactionCategoryId");
        this.transactionCategoryId = transactionCategoryId;
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
        GetTransactionCategoryRequest other = (GetTransactionCategoryRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.transactionCategoryId, other.transactionCategoryId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            transactionCategoryId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTransactionCategoryRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "transactionCategoryId", transactionCategoryId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String transactionCategoryId;  
        
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
         * The unique identifier for a banking transaction category
         */
        public Builder transactionCategoryId(String transactionCategoryId) {
            Utils.checkNotNull(transactionCategoryId, "transactionCategoryId");
            this.transactionCategoryId = transactionCategoryId;
            return this;
        }
        
        public GetTransactionCategoryRequest build() {
            return new GetTransactionCategoryRequest(
                companyId,
                connectionId,
                transactionCategoryId);
        }
    }
}

