/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.models.shared.CustomDataTypeConfiguration;
import io.codat.platform.utils.SpeakeasyMetadata;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class ConfigureCustomDataTypeRequest {

    /**
     * Custom data type configuration for the specified platform.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration;

    /**
     * Unique identifier for a custom data type.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customDataIdentifier")
    private String customDataIdentifier;

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=platformKey")
    private String platformKey;

    @JsonCreator
    public ConfigureCustomDataTypeRequest(
            Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration,
            String customDataIdentifier,
            String platformKey) {
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        Utils.checkNotNull(platformKey, "platformKey");
        this.customDataTypeConfiguration = customDataTypeConfiguration;
        this.customDataIdentifier = customDataIdentifier;
        this.platformKey = platformKey;
    }
    
    public ConfigureCustomDataTypeRequest(
            String customDataIdentifier,
            String platformKey) {
        this(Optional.empty(), customDataIdentifier, platformKey);
    }

    /**
     * Custom data type configuration for the specified platform.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomDataTypeConfiguration> customDataTypeConfiguration() {
        return (Optional<CustomDataTypeConfiguration>) customDataTypeConfiguration;
    }

    /**
     * Unique identifier for a custom data type.
     */
    @JsonIgnore
    public String customDataIdentifier() {
        return customDataIdentifier;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @JsonIgnore
    public String platformKey() {
        return platformKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Custom data type configuration for the specified platform.
     */
    public ConfigureCustomDataTypeRequest withCustomDataTypeConfiguration(CustomDataTypeConfiguration customDataTypeConfiguration) {
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        this.customDataTypeConfiguration = Optional.ofNullable(customDataTypeConfiguration);
        return this;
    }

    /**
     * Custom data type configuration for the specified platform.
     */
    public ConfigureCustomDataTypeRequest withCustomDataTypeConfiguration(Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration) {
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        this.customDataTypeConfiguration = customDataTypeConfiguration;
        return this;
    }

    /**
     * Unique identifier for a custom data type.
     */
    public ConfigureCustomDataTypeRequest withCustomDataIdentifier(String customDataIdentifier) {
        Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
        this.customDataIdentifier = customDataIdentifier;
        return this;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    public ConfigureCustomDataTypeRequest withPlatformKey(String platformKey) {
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
        ConfigureCustomDataTypeRequest other = (ConfigureCustomDataTypeRequest) o;
        return 
            Objects.deepEquals(this.customDataTypeConfiguration, other.customDataTypeConfiguration) &&
            Objects.deepEquals(this.customDataIdentifier, other.customDataIdentifier) &&
            Objects.deepEquals(this.platformKey, other.platformKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customDataTypeConfiguration,
            customDataIdentifier,
            platformKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigureCustomDataTypeRequest.class,
                "customDataTypeConfiguration", customDataTypeConfiguration,
                "customDataIdentifier", customDataIdentifier,
                "platformKey", platformKey);
    }
    
    public final static class Builder {
 
        private Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration = Optional.empty();
 
        private String customDataIdentifier;
 
        private String platformKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Custom data type configuration for the specified platform.
         */
        public Builder customDataTypeConfiguration(CustomDataTypeConfiguration customDataTypeConfiguration) {
            Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
            this.customDataTypeConfiguration = Optional.ofNullable(customDataTypeConfiguration);
            return this;
        }

        /**
         * Custom data type configuration for the specified platform.
         */
        public Builder customDataTypeConfiguration(Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration) {
            Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
            this.customDataTypeConfiguration = customDataTypeConfiguration;
            return this;
        }

        /**
         * Unique identifier for a custom data type.
         */
        public Builder customDataIdentifier(String customDataIdentifier) {
            Utils.checkNotNull(customDataIdentifier, "customDataIdentifier");
            this.customDataIdentifier = customDataIdentifier;
            return this;
        }

        /**
         * A unique 4-letter key to represent a platform in each integration.
         */
        public Builder platformKey(String platformKey) {
            Utils.checkNotNull(platformKey, "platformKey");
            this.platformKey = platformKey;
            return this;
        }
        
        public ConfigureCustomDataTypeRequest build() {
            return new ConfigureCustomDataTypeRequest(
                customDataTypeConfiguration,
                customDataIdentifier,
                platformKey);
        }
    }
}

