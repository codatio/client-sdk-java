/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class UpdateConnectionStatus {

    /**
     * The current authorization status of the data connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends DataConnectionStatus> status;

    public UpdateConnectionStatus(
            @JsonProperty("status") Optional<? extends DataConnectionStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * The current authorization status of the data connection.
     */
    public Optional<? extends DataConnectionStatus> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current authorization status of the data connection.
     */
    public UpdateConnectionStatus withStatus(DataConnectionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * The current authorization status of the data connection.
     */
    public UpdateConnectionStatus withStatus(Optional<? extends DataConnectionStatus> status) {
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
        UpdateConnectionStatus other = (UpdateConnectionStatus) o;
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
        return Utils.toString(UpdateConnectionStatus.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataConnectionStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current authorization status of the data connection.
         */
        public Builder status(DataConnectionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * The current authorization status of the data connection.
         */
        public Builder status(Optional<? extends DataConnectionStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public UpdateConnectionStatus build() {
            return new UpdateConnectionStatus(
                status);
        }
    }
}
