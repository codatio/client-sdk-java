/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class Data {

    /**
     * Unique identifier for the failed sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncId")
    private Optional<? extends String> syncId;

    /**
     * The type of sync being performed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncType")
    private Optional<? extends String> syncType;

    public Data(
            @JsonProperty("syncId") Optional<? extends String> syncId,
            @JsonProperty("syncType") Optional<? extends String> syncType) {
        Utils.checkNotNull(syncId, "syncId");
        Utils.checkNotNull(syncType, "syncType");
        this.syncId = syncId;
        this.syncType = syncType;
    }

    /**
     * Unique identifier for the failed sync.
     */
    public Optional<? extends String> syncId() {
        return syncId;
    }

    /**
     * The type of sync being performed.
     */
    public Optional<? extends String> syncType() {
        return syncType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the failed sync.
     */
    public Data withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = Optional.ofNullable(syncId);
        return this;
    }
    
    /**
     * Unique identifier for the failed sync.
     */
    public Data withSyncId(Optional<? extends String> syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
        return this;
    }

    /**
     * The type of sync being performed.
     */
    public Data withSyncType(String syncType) {
        Utils.checkNotNull(syncType, "syncType");
        this.syncType = Optional.ofNullable(syncType);
        return this;
    }
    
    /**
     * The type of sync being performed.
     */
    public Data withSyncType(Optional<? extends String> syncType) {
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
        Data other = (Data) o;
        return 
            java.util.Objects.deepEquals(this.syncId, other.syncId) &&
            java.util.Objects.deepEquals(this.syncType, other.syncType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            syncId,
            syncType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Data.class,
                "syncId", syncId,
                "syncType", syncType);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> syncId = Optional.empty();
 
        private Optional<? extends String> syncType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder syncId(Optional<? extends String> syncId) {
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
        public Builder syncType(Optional<? extends String> syncType) {
            Utils.checkNotNull(syncType, "syncType");
            this.syncType = syncType;
            return this;
        }        
        
        public Data build() {
            return new Data(
                syncId,
                syncType);
        }
    }
}

