/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.SpeakeasyMetadata;
import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class SetConfigurationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration;

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    public SetConfigurationRequest(
            Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration,
            String companyId) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(companyId, "companyId");
        this.configuration = configuration;
        this.companyId = companyId;
    }

    public Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration() {
        return configuration;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public SetConfigurationRequest withConfiguration(io.codat.bank_feeds.models.components.Configuration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = Optional.ofNullable(configuration);
        return this;
    }
    
    public SetConfigurationRequest withConfiguration(Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    /**
     * Unique identifier for a company.
     */
    public SetConfigurationRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
        SetConfigurationRequest other = (SetConfigurationRequest) o;
        return 
            java.util.Objects.deepEquals(this.configuration, other.configuration) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configuration,
            companyId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SetConfigurationRequest.class,
                "configuration", configuration,
                "companyId", companyId);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration = Optional.empty();
 
        private String companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder configuration(io.codat.bank_feeds.models.components.Configuration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = Optional.ofNullable(configuration);
            return this;
        }
        
        public Builder configuration(Optional<? extends io.codat.bank_feeds.models.components.Configuration> configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }
        
        public SetConfigurationRequest build() {
            return new SetConfigurationRequest(
                configuration,
                companyId);
        }
    }
}

