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

/**
 * Integration - An integration that Codat supports
 */

public class Integration {

    /**
     * The name of the data provider.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataProvidedBy")
    private Optional<? extends String> dataProvidedBy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datatypeFeatures")
    private Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures;

    /**
     * Whether this integration is enabled for your customers to use.
     */
    @JsonProperty("enabled")
    private boolean enabled;

    /**
     * A Codat ID representing the integration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("integrationId")
    private Optional<? extends String> integrationId;

    /**
     * `True` if the integration is currently in beta release.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isBeta")
    private Optional<? extends Boolean> isBeta;

    /**
     * `True` if the integration is to an application installed and run locally on an SMBs computer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isOfflineConnector")
    private Optional<? extends Boolean> isOfflineConnector;

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Static url for integration's logo.
     */
    @JsonProperty("logoUrl")
    private String logoUrl;

    /**
     * Name of integration.
     */
    @JsonProperty("name")
    private String name;

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceId")
    private Optional<? extends String> sourceId;

    /**
     * The type of platform of the connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends SourceType> sourceType;

    @JsonCreator
    public Integration(
            @JsonProperty("dataProvidedBy") Optional<? extends String> dataProvidedBy,
            @JsonProperty("datatypeFeatures") Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures,
            @JsonProperty("enabled") boolean enabled,
            @JsonProperty("integrationId") Optional<? extends String> integrationId,
            @JsonProperty("isBeta") Optional<? extends Boolean> isBeta,
            @JsonProperty("isOfflineConnector") Optional<? extends Boolean> isOfflineConnector,
            @JsonProperty("key") String key,
            @JsonProperty("logoUrl") String logoUrl,
            @JsonProperty("name") String name,
            @JsonProperty("sourceId") Optional<? extends String> sourceId,
            @JsonProperty("sourceType") Optional<? extends SourceType> sourceType) {
        Utils.checkNotNull(dataProvidedBy, "dataProvidedBy");
        Utils.checkNotNull(datatypeFeatures, "datatypeFeatures");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(integrationId, "integrationId");
        Utils.checkNotNull(isBeta, "isBeta");
        Utils.checkNotNull(isOfflineConnector, "isOfflineConnector");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(logoUrl, "logoUrl");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(sourceId, "sourceId");
        Utils.checkNotNull(sourceType, "sourceType");
        this.dataProvidedBy = dataProvidedBy;
        this.datatypeFeatures = datatypeFeatures;
        this.enabled = enabled;
        this.integrationId = integrationId;
        this.isBeta = isBeta;
        this.isOfflineConnector = isOfflineConnector;
        this.key = key;
        this.logoUrl = logoUrl;
        this.name = name;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
    }
    
    public Integration(
            boolean enabled,
            String key,
            String logoUrl,
            String name) {
        this(Optional.empty(), Optional.empty(), enabled, Optional.empty(), Optional.empty(), Optional.empty(), key, logoUrl, name, Optional.empty(), Optional.empty());
    }

    /**
     * The name of the data provider.
     */
    @JsonIgnore
    public Optional<? extends String> dataProvidedBy() {
        return dataProvidedBy;
    }

    @JsonIgnore
    public Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures() {
        return datatypeFeatures;
    }

    /**
     * Whether this integration is enabled for your customers to use.
     */
    @JsonIgnore
    public boolean enabled() {
        return enabled;
    }

    /**
     * A Codat ID representing the integration.
     */
    @JsonIgnore
    public Optional<? extends String> integrationId() {
        return integrationId;
    }

    /**
     * `True` if the integration is currently in beta release.
     */
    @JsonIgnore
    public Optional<? extends Boolean> isBeta() {
        return isBeta;
    }

    /**
     * `True` if the integration is to an application installed and run locally on an SMBs computer.
     */
    @JsonIgnore
    public Optional<? extends Boolean> isOfflineConnector() {
        return isOfflineConnector;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    @JsonIgnore
    public String key() {
        return key;
    }

    /**
     * Static url for integration's logo.
     */
    @JsonIgnore
    public String logoUrl() {
        return logoUrl;
    }

    /**
     * Name of integration.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    @JsonIgnore
    public Optional<? extends String> sourceId() {
        return sourceId;
    }

    /**
     * The type of platform of the connection.
     */
    @JsonIgnore
    public Optional<? extends SourceType> sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the data provider.
     */
    public Integration withDataProvidedBy(String dataProvidedBy) {
        Utils.checkNotNull(dataProvidedBy, "dataProvidedBy");
        this.dataProvidedBy = Optional.ofNullable(dataProvidedBy);
        return this;
    }

    /**
     * The name of the data provider.
     */
    public Integration withDataProvidedBy(Optional<? extends String> dataProvidedBy) {
        Utils.checkNotNull(dataProvidedBy, "dataProvidedBy");
        this.dataProvidedBy = dataProvidedBy;
        return this;
    }

    public Integration withDatatypeFeatures(java.util.List<DataTypeFeature> datatypeFeatures) {
        Utils.checkNotNull(datatypeFeatures, "datatypeFeatures");
        this.datatypeFeatures = Optional.ofNullable(datatypeFeatures);
        return this;
    }

    public Integration withDatatypeFeatures(Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures) {
        Utils.checkNotNull(datatypeFeatures, "datatypeFeatures");
        this.datatypeFeatures = datatypeFeatures;
        return this;
    }

    /**
     * Whether this integration is enabled for your customers to use.
     */
    public Integration withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    /**
     * A Codat ID representing the integration.
     */
    public Integration withIntegrationId(String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = Optional.ofNullable(integrationId);
        return this;
    }

    /**
     * A Codat ID representing the integration.
     */
    public Integration withIntegrationId(Optional<? extends String> integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
        return this;
    }

    /**
     * `True` if the integration is currently in beta release.
     */
    public Integration withIsBeta(boolean isBeta) {
        Utils.checkNotNull(isBeta, "isBeta");
        this.isBeta = Optional.ofNullable(isBeta);
        return this;
    }

    /**
     * `True` if the integration is currently in beta release.
     */
    public Integration withIsBeta(Optional<? extends Boolean> isBeta) {
        Utils.checkNotNull(isBeta, "isBeta");
        this.isBeta = isBeta;
        return this;
    }

    /**
     * `True` if the integration is to an application installed and run locally on an SMBs computer.
     */
    public Integration withIsOfflineConnector(boolean isOfflineConnector) {
        Utils.checkNotNull(isOfflineConnector, "isOfflineConnector");
        this.isOfflineConnector = Optional.ofNullable(isOfflineConnector);
        return this;
    }

    /**
     * `True` if the integration is to an application installed and run locally on an SMBs computer.
     */
    public Integration withIsOfflineConnector(Optional<? extends Boolean> isOfflineConnector) {
        Utils.checkNotNull(isOfflineConnector, "isOfflineConnector");
        this.isOfflineConnector = isOfflineConnector;
        return this;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
     */
    public Integration withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * Static url for integration's logo.
     */
    public Integration withLogoUrl(String logoUrl) {
        Utils.checkNotNull(logoUrl, "logoUrl");
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * Name of integration.
     */
    public Integration withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    public Integration withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = Optional.ofNullable(sourceId);
        return this;
    }

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    public Integration withSourceId(Optional<? extends String> sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
        return this;
    }

    /**
     * The type of platform of the connection.
     */
    public Integration withSourceType(SourceType sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = Optional.ofNullable(sourceType);
        return this;
    }

    /**
     * The type of platform of the connection.
     */
    public Integration withSourceType(Optional<? extends SourceType> sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
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
        Integration other = (Integration) o;
        return 
            java.util.Objects.deepEquals(this.dataProvidedBy, other.dataProvidedBy) &&
            java.util.Objects.deepEquals(this.datatypeFeatures, other.datatypeFeatures) &&
            java.util.Objects.deepEquals(this.enabled, other.enabled) &&
            java.util.Objects.deepEquals(this.integrationId, other.integrationId) &&
            java.util.Objects.deepEquals(this.isBeta, other.isBeta) &&
            java.util.Objects.deepEquals(this.isOfflineConnector, other.isOfflineConnector) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.logoUrl, other.logoUrl) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.sourceId, other.sourceId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataProvidedBy,
            datatypeFeatures,
            enabled,
            integrationId,
            isBeta,
            isOfflineConnector,
            key,
            logoUrl,
            name,
            sourceId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Integration.class,
                "dataProvidedBy", dataProvidedBy,
                "datatypeFeatures", datatypeFeatures,
                "enabled", enabled,
                "integrationId", integrationId,
                "isBeta", isBeta,
                "isOfflineConnector", isOfflineConnector,
                "key", key,
                "logoUrl", logoUrl,
                "name", name,
                "sourceId", sourceId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> dataProvidedBy = Optional.empty();
 
        private Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures = Optional.empty();
 
        private Boolean enabled;
 
        private Optional<? extends String> integrationId = Optional.empty();
 
        private Optional<? extends Boolean> isBeta = Optional.empty();
 
        private Optional<? extends Boolean> isOfflineConnector = Optional.empty();
 
        private String key;
 
        private String logoUrl;
 
        private String name;
 
        private Optional<? extends String> sourceId = Optional.empty();
 
        private Optional<? extends SourceType> sourceType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the data provider.
         */
        public Builder dataProvidedBy(String dataProvidedBy) {
            Utils.checkNotNull(dataProvidedBy, "dataProvidedBy");
            this.dataProvidedBy = Optional.ofNullable(dataProvidedBy);
            return this;
        }

        /**
         * The name of the data provider.
         */
        public Builder dataProvidedBy(Optional<? extends String> dataProvidedBy) {
            Utils.checkNotNull(dataProvidedBy, "dataProvidedBy");
            this.dataProvidedBy = dataProvidedBy;
            return this;
        }

        public Builder datatypeFeatures(java.util.List<DataTypeFeature> datatypeFeatures) {
            Utils.checkNotNull(datatypeFeatures, "datatypeFeatures");
            this.datatypeFeatures = Optional.ofNullable(datatypeFeatures);
            return this;
        }

        public Builder datatypeFeatures(Optional<? extends java.util.List<DataTypeFeature>> datatypeFeatures) {
            Utils.checkNotNull(datatypeFeatures, "datatypeFeatures");
            this.datatypeFeatures = datatypeFeatures;
            return this;
        }

        /**
         * Whether this integration is enabled for your customers to use.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        /**
         * A Codat ID representing the integration.
         */
        public Builder integrationId(String integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = Optional.ofNullable(integrationId);
            return this;
        }

        /**
         * A Codat ID representing the integration.
         */
        public Builder integrationId(Optional<? extends String> integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = integrationId;
            return this;
        }

        /**
         * `True` if the integration is currently in beta release.
         */
        public Builder isBeta(boolean isBeta) {
            Utils.checkNotNull(isBeta, "isBeta");
            this.isBeta = Optional.ofNullable(isBeta);
            return this;
        }

        /**
         * `True` if the integration is currently in beta release.
         */
        public Builder isBeta(Optional<? extends Boolean> isBeta) {
            Utils.checkNotNull(isBeta, "isBeta");
            this.isBeta = isBeta;
            return this;
        }

        /**
         * `True` if the integration is to an application installed and run locally on an SMBs computer.
         */
        public Builder isOfflineConnector(boolean isOfflineConnector) {
            Utils.checkNotNull(isOfflineConnector, "isOfflineConnector");
            this.isOfflineConnector = Optional.ofNullable(isOfflineConnector);
            return this;
        }

        /**
         * `True` if the integration is to an application installed and run locally on an SMBs computer.
         */
        public Builder isOfflineConnector(Optional<? extends Boolean> isOfflineConnector) {
            Utils.checkNotNull(isOfflineConnector, "isOfflineConnector");
            this.isOfflineConnector = isOfflineConnector;
            return this;
        }

        /**
         * A unique 4-letter key to represent a platform in each integration. View [accounting](https://docs.codat.io/integrations/accounting/overview#platform-keys), [banking](https://docs.codat.io/integrations/banking/overview#platform-keys), and [commerce](https://docs.codat.io/integrations/commerce/overview#platform-keys) platform keys.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * Static url for integration's logo.
         */
        public Builder logoUrl(String logoUrl) {
            Utils.checkNotNull(logoUrl, "logoUrl");
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * Name of integration.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
         */
        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = Optional.ofNullable(sourceId);
            return this;
        }

        /**
         * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
         */
        public Builder sourceId(Optional<? extends String> sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The type of platform of the connection.
         */
        public Builder sourceType(SourceType sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = Optional.ofNullable(sourceType);
            return this;
        }

        /**
         * The type of platform of the connection.
         */
        public Builder sourceType(Optional<? extends SourceType> sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }
        
        public Integration build() {
            return new Integration(
                dataProvidedBy,
                datatypeFeatures,
                enabled,
                integrationId,
                isBeta,
                isOfflineConnector,
                key,
                logoUrl,
                name,
                sourceId,
                sourceType);
        }
    }
}

