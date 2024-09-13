/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payables.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateConnectionRequestBody {

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platformKey")
    private Optional<String> platformKey;

    @JsonCreator
    public CreateConnectionRequestBody(
            @JsonProperty("platformKey") Optional<String> platformKey) {
        Utils.checkNotNull(platformKey, "platformKey");
        this.platformKey = platformKey;
    }
    
    public CreateConnectionRequestBody() {
        this(Optional.empty());
    }

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    @JsonIgnore
    public Optional<String> platformKey() {
        return platformKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    public CreateConnectionRequestBody withPlatformKey(String platformKey) {
        Utils.checkNotNull(platformKey, "platformKey");
        this.platformKey = Optional.ofNullable(platformKey);
        return this;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    public CreateConnectionRequestBody withPlatformKey(Optional<String> platformKey) {
        Utils.checkNotNull(platformKey, "platformKey");
        this.platformKey = platformKey;
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
        CreateConnectionRequestBody other = (CreateConnectionRequestBody) o;
        return 
            Objects.deepEquals(this.platformKey, other.platformKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            platformKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateConnectionRequestBody.class,
                "platformKey", platformKey);
    }
    
    public final static class Builder {
 
        private Optional<String> platformKey = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
         */
        public Builder platformKey(String platformKey) {
            Utils.checkNotNull(platformKey, "platformKey");
            this.platformKey = Optional.ofNullable(platformKey);
            return this;
        }

        /**
         * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
         */
        public Builder platformKey(Optional<String> platformKey) {
            Utils.checkNotNull(platformKey, "platformKey");
            this.platformKey = platformKey;
            return this;
        }
        
        public CreateConnectionRequestBody build() {
            return new CreateConnectionRequestBody(
                platformKey);
        }
    }
}

