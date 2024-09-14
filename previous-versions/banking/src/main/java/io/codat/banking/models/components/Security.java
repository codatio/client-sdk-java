/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.banking.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.banking.utils.SpeakeasyMetadata;
import io.codat.banking.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=Authorization")
    private String authHeader;

    @JsonCreator
    public Security(
            String authHeader) {
        Utils.checkNotNull(authHeader, "authHeader");
        this.authHeader = authHeader;
    }

    @JsonIgnore
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
            Objects.deepEquals(this.authHeader, other.authHeader);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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

