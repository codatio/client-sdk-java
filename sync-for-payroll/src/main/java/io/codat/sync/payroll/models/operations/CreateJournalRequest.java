/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payroll.utils.LazySingletonValue;
import io.codat.sync.payroll.utils.SpeakeasyMetadata;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class CreateJournalRequest {

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

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype;

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeoutInMinutes")
    private Optional<? extends Integer> timeoutInMinutes;

    public CreateJournalRequest(
            Optional<? extends Boolean> allowSyncOnPushComplete,
            String companyId,
            String connectionId,
            Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype,
            Optional<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.journalPrototype = journalPrototype;
        this.timeoutInMinutes = timeoutInMinutes;
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

    public Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype() {
        return journalPrototype;
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

    /**
     * Allow a sync upon push completion.
     */
    public CreateJournalRequest withAllowSyncOnPushComplete(boolean allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = Optional.ofNullable(allowSyncOnPushComplete);
        return this;
    }
    
    /**
     * Allow a sync upon push completion.
     */
    public CreateJournalRequest withAllowSyncOnPushComplete(Optional<? extends Boolean> allowSyncOnPushComplete) {
        Utils.checkNotNull(allowSyncOnPushComplete, "allowSyncOnPushComplete");
        this.allowSyncOnPushComplete = allowSyncOnPushComplete;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public CreateJournalRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public CreateJournalRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    public CreateJournalRequest withJournalPrototype(io.codat.sync.payroll.models.components.JournalPrototype journalPrototype) {
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        this.journalPrototype = Optional.ofNullable(journalPrototype);
        return this;
    }
    
    public CreateJournalRequest withJournalPrototype(Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype) {
        Utils.checkNotNull(journalPrototype, "journalPrototype");
        this.journalPrototype = journalPrototype;
        return this;
    }

    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateJournalRequest withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = Optional.ofNullable(timeoutInMinutes);
        return this;
    }
    
    /**
     * Time limit for the push operation to complete before it is timed out.
     */
    public CreateJournalRequest withTimeoutInMinutes(Optional<? extends Integer> timeoutInMinutes) {
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
        CreateJournalRequest other = (CreateJournalRequest) o;
        return 
            java.util.Objects.deepEquals(this.allowSyncOnPushComplete, other.allowSyncOnPushComplete) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.journalPrototype, other.journalPrototype) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            allowSyncOnPushComplete,
            companyId,
            connectionId,
            journalPrototype,
            timeoutInMinutes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateJournalRequest.class,
                "allowSyncOnPushComplete", allowSyncOnPushComplete,
                "companyId", companyId,
                "connectionId", connectionId,
                "journalPrototype", journalPrototype,
                "timeoutInMinutes", timeoutInMinutes);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> allowSyncOnPushComplete;
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype = Optional.empty();
 
        private Optional<? extends Integer> timeoutInMinutes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder journalPrototype(io.codat.sync.payroll.models.components.JournalPrototype journalPrototype) {
            Utils.checkNotNull(journalPrototype, "journalPrototype");
            this.journalPrototype = Optional.ofNullable(journalPrototype);
            return this;
        }
        
        public Builder journalPrototype(Optional<? extends io.codat.sync.payroll.models.components.JournalPrototype> journalPrototype) {
            Utils.checkNotNull(journalPrototype, "journalPrototype");
            this.journalPrototype = journalPrototype;
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
        
        public CreateJournalRequest build() {
            if (allowSyncOnPushComplete == null) {
                allowSyncOnPushComplete = _SINGLETON_VALUE_AllowSyncOnPushComplete.value();
            }
            return new CreateJournalRequest(
                allowSyncOnPushComplete,
                companyId,
                connectionId,
                journalPrototype,
                timeoutInMinutes);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_AllowSyncOnPushComplete =
                new LazySingletonValue<>(
                        "allowSyncOnPushComplete",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

