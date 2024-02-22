/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_payables.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync_for_payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UnlinkConnectionUpdateConnection {

    /**
     * The current authorization status of the data connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status;

    public UnlinkConnectionUpdateConnection(
            @JsonProperty("status") Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * The current authorization status of the data connection.
     */
    public Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current authorization status of the data connection.
     */
    public UnlinkConnectionUpdateConnection withStatus(io.codat.sync_for_payables.models.components.DataConnectionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * The current authorization status of the data connection.
     */
    public UnlinkConnectionUpdateConnection withStatus(Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        UnlinkConnectionUpdateConnection other = (UnlinkConnectionUpdateConnection) o;
        return 
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnlinkConnectionUpdateConnection.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current authorization status of the data connection.
         */
        public Builder status(io.codat.sync_for_payables.models.components.DataConnectionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * The current authorization status of the data connection.
         */
        public Builder status(Optional<? extends io.codat.sync_for_payables.models.components.DataConnectionStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public UnlinkConnectionUpdateConnection build() {
            return new UnlinkConnectionUpdateConnection(
                status);
        }
    }
}

