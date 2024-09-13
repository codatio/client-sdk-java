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


public class GetBankingTransactionCategoryRequest {

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

    @JsonCreator
    public GetBankingTransactionCategoryRequest(
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
     * The unique identifier for a banking transaction category
     */
    @JsonIgnore
    public String transactionCategoryId() {
        return transactionCategoryId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetBankingTransactionCategoryRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetBankingTransactionCategoryRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The unique identifier for a banking transaction category
     */
    public GetBankingTransactionCategoryRequest withTransactionCategoryId(String transactionCategoryId) {
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
        GetBankingTransactionCategoryRequest other = (GetBankingTransactionCategoryRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.transactionCategoryId, other.transactionCategoryId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            transactionCategoryId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankingTransactionCategoryRequest.class,
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
        
        public GetBankingTransactionCategoryRequest build() {
            return new GetBankingTransactionCategoryRequest(
                companyId,
                connectionId,
                transactionCategoryId);
        }
    }
}

