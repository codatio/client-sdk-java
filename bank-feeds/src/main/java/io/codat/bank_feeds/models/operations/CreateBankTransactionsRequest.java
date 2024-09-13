/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.bank_feeds.models.components.CreateBankTransactions;
import io.codat.bank_feeds.utils.LazySingletonValue;
import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateBankTransactionsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CreateBankTransactions> createBankTransactions;

    /**
     * Unique identifier for an account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

    /**
     * Allow a sync upon push completion.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=allowSyncOnPushComplete")
    private Optional<Boolean> allowSyncOnPushComplete;

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
    private Optional<Integer> timeoutInMinutes;

    @JsonCreator
    public CreateBankTransactionsRequest(
            Optional<? extends CreateBankTransactions> createBankTransactions,
            String accountId,
            Optional<Boolean> allowSyncOnPushComplete,
            String companyId,
            String connectionId,
            Optional<Integer> timeoutInMinutes) {
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
    
    public CreateBankTransactionsRequest(
            String accountId,
            String companyId,
            String connectionId) {
        this(Optional.empty(), accountId, Optional.empty(), companyId, connectionId, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateBankTransactions> createBankTransactions() {
        return (Optional<CreateBankTransactions>) createBankTransactions;
    }

    /**
     * Unique identifier for an account.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * Allow a sync upon push completion.
     */
    @JsonIgnore
    public Optional<Boolean> allowSyncOnPushComplete() {
        return allowSyncOnPushComplete;
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
     * Time limit for the push operation to complete before it is timed out.
     */
    @JsonIgnore
    public Optional<Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBankTransactionsRequest withCreateBankTransactions(CreateBankTransactions createBankTransactions) {
        Utils.checkNotNull(createBankTransactions, "createBankTransactions");
        this.createBankTransactions = Optional.ofNullable(createBankTransactions);
        return this;
    }

    public CreateBankTransactionsRequest withCreateBankTransactions(Optional<? extends CreateBankTransactions> createBankTransactions) {
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
    public CreateBankTransactionsRequest withAllowSyncOnPushComplete(Optional<Boolean> allowSyncOnPushComplete) {
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
    public CreateBankTransactionsRequest withTimeoutInMinutes(Optional<Integer> timeoutInMinutes) {
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
            Objects.deepEquals(this.createBankTransactions, other.createBankTransactions) &&
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.allowSyncOnPushComplete, other.allowSyncOnPushComplete) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends CreateBankTransactions> createBankTransactions = Optional.empty();
 
        private String accountId;
 
        private Optional<Boolean> allowSyncOnPushComplete;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createBankTransactions(CreateBankTransactions createBankTransactions) {
            Utils.checkNotNull(createBankTransactions, "createBankTransactions");
            this.createBankTransactions = Optional.ofNullable(createBankTransactions);
            return this;
        }

        public Builder createBankTransactions(Optional<? extends CreateBankTransactions> createBankTransactions) {
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
        public Builder allowSyncOnPushComplete(Optional<Boolean> allowSyncOnPushComplete) {
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
        public Builder timeoutInMinutes(Optional<Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        
        public CreateBankTransactionsRequest build() {
            if (allowSyncOnPushComplete == null) {
                allowSyncOnPushComplete = _SINGLETON_VALUE_AllowSyncOnPushComplete.value();
            }            return new CreateBankTransactionsRequest(
                createBankTransactions,
                accountId,
                allowSyncOnPushComplete,
                companyId,
                connectionId,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_AllowSyncOnPushComplete =
                new LazySingletonValue<>(
                        "allowSyncOnPushComplete",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

