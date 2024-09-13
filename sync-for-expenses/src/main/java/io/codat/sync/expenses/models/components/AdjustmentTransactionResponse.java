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


public class AdjustmentTransactionResponse {

    /**
     * Unique id of sync created
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncId")
    private Optional<String> syncId;

    @JsonCreator
    public AdjustmentTransactionResponse(
            @JsonProperty("syncId") Optional<String> syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = syncId;
    }
    
    public AdjustmentTransactionResponse() {
        this(Optional.empty());
    }

    /**
     * Unique id of sync created
     */
    @JsonIgnore
    public Optional<String> syncId() {
        return syncId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique id of sync created
     */
    public AdjustmentTransactionResponse withSyncId(String syncId) {
        Utils.checkNotNull(syncId, "syncId");
        this.syncId = Optional.ofNullable(syncId);
        return this;
    }

    /**
     * Unique id of sync created
     */
    public AdjustmentTransactionResponse withSyncId(Optional<String> syncId) {
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
        AdjustmentTransactionResponse other = (AdjustmentTransactionResponse) o;
        return 
            Objects.deepEquals(this.syncId, other.syncId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            syncId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdjustmentTransactionResponse.class,
                "syncId", syncId);
    }
    
    public final static class Builder {
 
        private Optional<String> syncId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique id of sync created
         */
        public Builder syncId(String syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = Optional.ofNullable(syncId);
            return this;
        }

        /**
         * Unique id of sync created
         */
        public Builder syncId(Optional<String> syncId) {
            Utils.checkNotNull(syncId, "syncId");
            this.syncId = syncId;
            return this;
        }
        
        public AdjustmentTransactionResponse build() {
            return new AdjustmentTransactionResponse(
                syncId);
        }
    }
}
