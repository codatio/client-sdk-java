/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SyncFailedWebhookData {

    /**
     * The stage of the job the sync failed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FailureStage")
    private Optional<String> failureStage;

    /**
     * Unique identifier for the failed sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncId")
    private Optional<String> syncId;

    /**
     * The type of sync being performed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncType")
    private Optional<String> syncType;

    @JsonCreator
    public SyncFailedWebhookData(
            @JsonProperty("FailureStage") Optional<String> failureStage,
            @JsonProperty("syncId") Optional<String> syncId,
            @JsonProperty("syncType") Optional<String> syncType) {
        Utils.checkNotNull(failureStage, "failureStage");
        Utils.checkNotNull(syncId, "syncId");
        Utils.checkNotNull(syncType, "syncType");
        this.failureStage = failureStage;
        this.syncId = syncId;
        this.syncType = syncType;
    }
    
    public SyncFailedWebhookData() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The stage of the job the sync failed.
     */
    @JsonIgnore
    public Optional<String> failureStage() {
        return failureStage;
    }

    /**
     * Unique identifier for the failed sync.
     */
    @JsonIgnore
    public Optional<String> syncId() {
        return syncId;
    }

    /**
     * The type of sync being performed.
     */
    @JsonIgnore
    public Optional<String> syncType() {
        return syncType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The stage of the job the sync failed.
     */
    public SyncFailedWebhookData withFailureStage(String failureStage) {
        Utils.checkNotNull(failureStage, "failureStage");
        this.failureStage = Optional.ofNullable(failureStage);
        return this;
    }

    /**
     * The stage of the job the sync failed.
     */
    public SyncFailedWebhookData withFailureStage(Optional<String> failureStage) {
        Utils.checkNotNull(failureStage, "failureStage");
        this.failureStage = failureStage;
        return this;
    }

    /**
     * Unique identifier for the failed sync.
     */
    public SyncFailedWebhookData withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = Optional.ofNullable(syncId);
        return this;
    }

    /**
     * Unique identifier for the failed sync.
     */
    public SyncFailedWebhookData withSyncId(Optional<String> syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
        return this;
    }

    /**
     * The type of sync being performed.
     */
    public SyncFailedWebhookData withSyncType(String syncType) {
        Utils.checkNotNull(syncType, "syncType");
        this.syncType = Optional.ofNullable(syncType);
        return this;
    }

    /**
     * The type of sync being performed.
     */
    public SyncFailedWebhookData withSyncType(Optional<String> syncType) {
        Utils.checkNotNull(syncType, "syncType");
        this.syncType = syncType;
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
        SyncFailedWebhookData other = (SyncFailedWebhookData) o;
        return 
            Objects.deepEquals(this.failureStage, other.failureStage) &&
            Objects.deepEquals(this.syncId, other.syncId) &&
            Objects.deepEquals(this.syncType, other.syncType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            failureStage,
            syncId,
            syncType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncFailedWebhookData.class,
                "failureStage", failureStage,
                "syncId", syncId,
                "syncType", syncType);
    }
    
    public final static class Builder {
 
        private Optional<String> failureStage = Optional.empty();
 
        private Optional<String> syncId = Optional.empty();
 
        private Optional<String> syncType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The stage of the job the sync failed.
         */
        public Builder failureStage(String failureStage) {
            Utils.checkNotNull(failureStage, "failureStage");
            this.failureStage = Optional.ofNullable(failureStage);
            return this;
        }

        /**
         * The stage of the job the sync failed.
         */
        public Builder failureStage(Optional<String> failureStage) {
            Utils.checkNotNull(failureStage, "failureStage");
            this.failureStage = failureStage;
            return this;
        }

        /**
         * Unique identifier for the failed sync.
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = Optional.ofNullable(syncId);
            return this;
        }

        /**
         * Unique identifier for the failed sync.
         */
        public Builder syncId(Optional<String> syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }

        /**
         * The type of sync being performed.
         */
        public Builder syncType(String syncType) {
            Utils.checkNotNull(syncType, "syncType");
            this.syncType = Optional.ofNullable(syncType);
            return this;
        }

        /**
         * The type of sync being performed.
         */
        public Builder syncType(Optional<String> syncType) {
            Utils.checkNotNull(syncType, "syncType");
            this.syncType = syncType;
            return this;
        }
        
        public SyncFailedWebhookData build() {
            return new SyncFailedWebhookData(
                failureStage,
                syncId,
                syncType);
        }
    }
}

