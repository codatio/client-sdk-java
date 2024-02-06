/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class GetBankingTransactionRequest {

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
     * The unique identifier for a transaction
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transactionId")
    private String transactionId;

    public GetBankingTransactionRequest(
            String companyId,
            String connectionId,
            String transactionId) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(transactionId, "transactionId");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.transactionId = transactionId;
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
     * The unique identifier for a transaction
     */
    public String transactionId() {
        return transactionId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetBankingTransactionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetBankingTransactionRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The unique identifier for a transaction
     */
    public GetBankingTransactionRequest withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        GetBankingTransactionRequest other = (GetBankingTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            connectionId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankingTransactionRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private String transactionId;  
        
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
         * The unique identifier for a transaction
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }        
        
        public GetBankingTransactionRequest build() {
            return new GetBankingTransactionRequest(
                companyId,
                connectionId,
                transactionId);
        }
    }
}

