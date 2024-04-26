/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ConnectionManagementAllowedOrigins {

    /**
     * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowedOrigins")
    private Optional<? extends java.util.List<String>> allowedOrigins;

    @JsonCreator
    public ConnectionManagementAllowedOrigins(
            @JsonProperty("allowedOrigins") Optional<? extends java.util.List<String>> allowedOrigins) {
        Utils.checkNotNull(allowedOrigins, "allowedOrigins");
        this.allowedOrigins = allowedOrigins;
    }
    
    public ConnectionManagementAllowedOrigins() {
        this(Optional.empty());
    }

    /**
     * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
     */
    @JsonIgnore
    public Optional<? extends java.util.List<String>> allowedOrigins() {
        return allowedOrigins;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
     */
    public ConnectionManagementAllowedOrigins withAllowedOrigins(java.util.List<String> allowedOrigins) {
        Utils.checkNotNull(allowedOrigins, "allowedOrigins");
        this.allowedOrigins = Optional.ofNullable(allowedOrigins);
        return this;
    }

    /**
     * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
     */
    public ConnectionManagementAllowedOrigins withAllowedOrigins(Optional<? extends java.util.List<String>> allowedOrigins) {
        Utils.checkNotNull(allowedOrigins, "allowedOrigins");
        this.allowedOrigins = allowedOrigins;
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
        ConnectionManagementAllowedOrigins other = (ConnectionManagementAllowedOrigins) o;
        return 
            java.util.Objects.deepEquals(this.allowedOrigins, other.allowedOrigins);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            allowedOrigins);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionManagementAllowedOrigins.class,
                "allowedOrigins", allowedOrigins);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> allowedOrigins = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
         */
        public Builder allowedOrigins(java.util.List<String> allowedOrigins) {
            Utils.checkNotNull(allowedOrigins, "allowedOrigins");
            this.allowedOrigins = Optional.ofNullable(allowedOrigins);
            return this;
        }

        /**
         * An array of allowed origins (i.e. your domains) to permit cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).n resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
         */
        public Builder allowedOrigins(Optional<? extends java.util.List<String>> allowedOrigins) {
            Utils.checkNotNull(allowedOrigins, "allowedOrigins");
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        
        public ConnectionManagementAllowedOrigins build() {
            return new ConnectionManagementAllowedOrigins(
                allowedOrigins);
        }
    }
}

