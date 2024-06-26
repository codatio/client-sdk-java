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


public class SupplementalDataConfiguration {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalDataConfig")
    private Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig;

    @JsonCreator
    public SupplementalDataConfiguration(
            @JsonProperty("supplementalDataConfig") Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig) {
        Utils.checkNotNull(supplementalDataConfig, "supplementalDataConfig");
        this.supplementalDataConfig = supplementalDataConfig;
    }
    
    public SupplementalDataConfiguration() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig() {
        return supplementalDataConfig;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SupplementalDataConfiguration withSupplementalDataConfig(java.util.Map<String, SupplementalDataSourceConfiguration> supplementalDataConfig) {
        Utils.checkNotNull(supplementalDataConfig, "supplementalDataConfig");
        this.supplementalDataConfig = Optional.ofNullable(supplementalDataConfig);
        return this;
    }

    public SupplementalDataConfiguration withSupplementalDataConfig(Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig) {
        Utils.checkNotNull(supplementalDataConfig, "supplementalDataConfig");
        this.supplementalDataConfig = supplementalDataConfig;
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
        SupplementalDataConfiguration other = (SupplementalDataConfiguration) o;
        return 
            java.util.Objects.deepEquals(this.supplementalDataConfig, other.supplementalDataConfig);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            supplementalDataConfig);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SupplementalDataConfiguration.class,
                "supplementalDataConfig", supplementalDataConfig);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder supplementalDataConfig(java.util.Map<String, SupplementalDataSourceConfiguration> supplementalDataConfig) {
            Utils.checkNotNull(supplementalDataConfig, "supplementalDataConfig");
            this.supplementalDataConfig = Optional.ofNullable(supplementalDataConfig);
            return this;
        }

        public Builder supplementalDataConfig(Optional<? extends java.util.Map<String, SupplementalDataSourceConfiguration>> supplementalDataConfig) {
            Utils.checkNotNull(supplementalDataConfig, "supplementalDataConfig");
            this.supplementalDataConfig = supplementalDataConfig;
            return this;
        }
        
        public SupplementalDataConfiguration build() {
            return new SupplementalDataConfiguration(
                supplementalDataConfig);
        }
    }
}

