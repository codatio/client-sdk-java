/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.banking.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.banking.utils.SpeakeasyMetadata;
import io.codat.banking.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetTransactionRequest {

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

    @JsonCreator
    public GetTransactionRequest(
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
     * The unique identifier for a transaction
     */
    @JsonIgnore
    public String transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetTransactionRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetTransactionRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The unique identifier for a transaction
     */
    public GetTransactionRequest withTransactionId(String transactionId) {
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
        GetTransactionRequest other = (GetTransactionRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTransactionRequest.class,
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
        
        public GetTransactionRequest build() {
            return new GetTransactionRequest(
                companyId,
                connectionId,
                transactionId);
        }
    }
}

