/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.SpeakeasyMetadata;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=Authorization")
    private String authHeader;

    public Security(
            String authHeader) {
        Utils.checkNotNull(authHeader, "authHeader");
        this.authHeader = authHeader;
    }

    public String authHeader() {
        return authHeader;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Security withAuthHeader(String authHeader) {
        Utils.checkNotNull(authHeader, "authHeader");
        this.authHeader = authHeader;
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
        Security other = (Security) o;
        return 
            java.util.Objects.deepEquals(this.authHeader, other.authHeader);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authHeader);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "authHeader", authHeader);
    }
    
    public final static class Builder {
 
        private String authHeader;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder authHeader(String authHeader) {
            Utils.checkNotNull(authHeader, "authHeader");
            this.authHeader = authHeader;
            return this;
        }
        
        public Security build() {
            return new Security(
                authHeader);
        }
    }
}

