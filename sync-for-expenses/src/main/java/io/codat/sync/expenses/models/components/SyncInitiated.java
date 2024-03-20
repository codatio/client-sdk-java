/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SyncInitiated {

    /**
     * Unique identifier for the sync initiated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncId")
    private Optional<? extends String> syncId;

    public SyncInitiated(
            @JsonProperty("syncId") Optional<? extends String> syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
    }

    /**
     * Unique identifier for the sync initiated.
     */
    public Optional<? extends String> syncId() {
        return syncId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the sync initiated.
     */
    public SyncInitiated withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = Optional.ofNullable(syncId);
        return this;
    }

    /**
     * Unique identifier for the sync initiated.
     */
    public SyncInitiated withSyncId(Optional<? extends String> syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
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
        SyncInitiated other = (SyncInitiated) o;
        return 
            java.util.Objects.deepEquals(this.syncId, other.syncId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            syncId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncInitiated.class,
                "syncId", syncId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> syncId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the sync initiated.
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = Optional.ofNullable(syncId);
            return this;
        }

        /**
         * Unique identifier for the sync initiated.
         */
        public Builder syncId(Optional<? extends String> syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }
        
        public SyncInitiated build() {
            return new SyncInitiated(
                syncId);
        }
    }
}

