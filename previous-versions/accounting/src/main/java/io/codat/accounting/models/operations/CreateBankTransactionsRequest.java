/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.accounting.utils.LazySingletonValue;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateBankTransactionsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions;

    /**
     * Unique identifier for an account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

    /**
     * Allow a sync upon push completion.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=allowSyncOnPushComplete")
    private Optional<? extends Boolean> allowSyncOnPushComplete;

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
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<? extends Integer> timeoutInMinutes;

    public CreateBankTransactionsRequest(
            Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions,
            String accountId,
            Optional<? extends Boolean> allowSyncOnPushComplete,
            String companyId,
            String connectionId,
            Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(createBankTransactions, "createBankTransactions");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.createBankTransactions = createBankTransactions;
        this.accountId = accountId;
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions() {
        return createBankTransactions;
    }

    /**
     * Unique identifier for an account.
     */
    public String accountId() {
        return accountId;
    }

    /**
     * Allow a sync upon push completion.
     */
    public Optional<? extends Boolean> allowSyncOnPushComplete() {
        return allowSyncOnPushComplete;
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
     * Time limit for the push operation to complete before it is timed out.
     */
    public Optional<? extends Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateBankTransactionsRequest withCreateBankTransactions(io.codat.accounting.models.components.CreateBankTransactions createBankTransactions) {
        Utils.checkNotNull(createBankTransactions, "createBankTransactions");
        this.createBankTransactions = Optional.ofNullable(createBankTransactions);
        return this;
    }
    
    public CreateBankTransactionsRequest withCreateBankTransactions(Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions) {
        Utils.checkNotNull(createBankTransactions, "createBankTransactions");
        this.createBankTransactions = createBankTransactions;
        return this;
    }

    /**
     * Unique identifier for an account.
     */
    public CreateBankTransactionsRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Allow a sync upon push completion.
     */
    public CreateBankTransactionsRequest withAllowSyncOnPushComplete(boolean allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = Optional.ofNullable(allowSyncOnPushComplete);
        return this;
    }
    
    /**
     * Allow a sync upon push completion.
     */
    public CreateBankTransactionsRequest withAllowSyncOnPushComplete(Optional<? extends Boolean> allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateBankTransactionsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateBankTransactionsRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateBankTransactionsRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }
    
    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateBankTransactionsRequest withTimeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
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
        CreateBankTransactionsRequest other = (CreateBankTransactionsRequest) o;
        return 
            java.util.Objects.deepEquals(this.createBankTransactions, other.createBankTransactions) &&
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.allowSyncOnPushComplete, other.allowSyncOnPushComplete) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createBankTransactions,
            accountId,
            allowSyncOnPushComplete,
            companyId,
            connectionId,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankTransactionsRequest.class,
                "createBankTransactions", createBankTransactions,
                "accountId", accountId,
                "allowSyncOnPushComplete", allowSyncOnPushComplete,
                "companyId", companyId,
                "connectionId", connectionId,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions = Optional.empty();
 
        private String accountId;
 
        private Optional<? extends Boolean> allowSyncOnPushComplete;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createBankTransactions(io.codat.accounting.models.components.CreateBankTransactions createBankTransactions) {
            Utils.checkNotNull(createBankTransactions, "createBankTransactions");
            this.createBankTransactions = Optional.ofNullable(createBankTransactions);
            return this;
        }
        
        public Builder createBankTransactions(Optional<? extends io.codat.accounting.models.components.CreateBankTransactions> createBankTransactions) {
            Utils.checkNotNull(createBankTransactions, "createBankTransactions");
            this.createBankTransactions = createBankTransactions;
            return this;
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
         * Allow a sync upon push completion.
         */
        public Builder allowSyncOnPushComplete(boolean allowSyncOnPushComplete) {
            Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
            this.allowSyncOnPushComplete = Optional.ofNullable(allowSyncOnPushComplete);
            return this;
        }
        
        /**
         * Allow a sync upon push completion.
         */
        public Builder allowSyncOnPushComplete(Optional<? extends Boolean> allowSyncOnPushComplete) {
            Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
            this.allowSyncOnPushComplete = allowSyncOnPushComplete;
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

        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
            return this;
        }
        
        /**
         * Time limit for the push operation to complete before it is timed out.
         */
        public Builder timeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public CreateBankTransactionsRequest build() {
            if (allowSyncOnPushComplete == null) {
                allowSyncOnPushComplete = _SINGLETON_VALUE_AllowSyncOnPushComplete.value();
            }
            return new CreateBankTransactionsRequest(
                createBankTransactions,
                accountId,
                allowSyncOnPushComplete,
                companyId,
                connectionId,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_AllowSyncOnPushComplete =
                new LazySingletonValue<>(
                        "allowSyncOnPushComplete",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}
