/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ConnectionManagementAccessToken {

    /**
     * Access token that allows SMBs to manage connections that have access to their data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accessToken")
    private Optional<String> accessToken;

    @JsonCreator
    public ConnectionManagementAccessToken(
            @JsonProperty("accessToken") Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
    }
    
    public ConnectionManagementAccessToken() {
        this(Optional.empty());
    }

    /**
     * Access token that allows SMBs to manage connections that have access to their data.
     */
    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Access token that allows SMBs to manage connections that have access to their data.
     */
    public ConnectionManagementAccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    /**
     * Access token that allows SMBs to manage connections that have access to their data.
     */
    public ConnectionManagementAccessToken withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
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
        ConnectionManagementAccessToken other = (ConnectionManagementAccessToken) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionManagementAccessToken.class,
                "accessToken", accessToken);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access token that allows SMBs to manage connections that have access to their data.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        /**
         * Access token that allows SMBs to manage connections that have access to their data.
         */
        public Builder accessToken(Optional<String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public ConnectionManagementAccessToken build() {
            return new ConnectionManagementAccessToken(
                accessToken);
        }
    }
}

