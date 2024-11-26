/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetCreateBankTransactionsModelRequest {

    /**
     * Unique identifier for an account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

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

    @JsonCreator
    public GetCreateBankTransactionsModelRequest(
            String accountId,
            String companyId,
            String connectionId) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        this.accountId = accountId;
        this.companyId = companyId;
        this.connectionId = connectionId;
    }

    /**
     * Unique identifier for an account.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for an account.
     */
    public GetCreateBankTransactionsModelRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public GetCreateBankTransactionsModelRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCreateBankTransactionsModelRequest withConnectionId(String connectionId) {
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
        GetCreateBankTransactionsModelRequest other = (GetCreateBankTransactionsModelRequest) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            companyId,
            connectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateBankTransactionsModelRequest.class,
                "accountId", accountId,
                "companyId", companyId,
                "connectionId", connectionId);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String companyId;
 
        private String connectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for an account.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
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
        
        public GetCreateBankTransactionsModelRequest build() {
            return new GetCreateBankTransactionsModelRequest(
                accountId,
                companyId,
                connectionId);
        }
    }
}
