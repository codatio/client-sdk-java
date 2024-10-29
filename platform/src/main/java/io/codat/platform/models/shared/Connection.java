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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Connection - ﻿A connection represents a [company's](https://docs.codat.io/platform-api#/schemas/Company) connection to a data source and allows you to synchronize data (pull and/or push) with that source.
 * 
 * A company can have multiple data connections depending on the type of data source it is connecting to. For example, a single company can link to:
 * 
 * - [Accounting data](https://docs.codat.io/accounting-api/overview) - 1 active connection.
 * - [Banking data](https://docs.codat.io/banking-api/overview) - Multiple active connections.
 * - [Commerce data](https://docs.codat.io/commerce-api/overview) - Multiple active connections.
 * Any combination of accounting, banking, and commerce data connections is allowed.
 * 
 * Before you can use a data connection to pull or push data, the company must grant you access to their business data by [linking the connection](https://docs.codat.io/auth-flow/overview).
 */

public class Connection {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectionInfo")
    private JsonNullable<? extends Map<String, String>> connectionInfo;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonProperty("created")
    private String created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataConnectionErrors")
    private JsonNullable<? extends List<DataConnectionError>> dataConnectionErrors;

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonProperty("id")
    private String id;

    /**
     * A Codat ID representing the integration.
     */
    @JsonProperty("integrationId")
    private String integrationId;

    /**
     * A unique four-character ID that identifies the platform of the company's data connection. This ensures continuity if the platform changes its name in the future.
     */
    @JsonProperty("integrationKey")
    private String integrationKey;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastSync")
    private Optional<String> lastSync;

    /**
     * The link URL your customers can use to authorize access to their business application.
     */
    @JsonProperty("linkUrl")
    private String linkUrl;

    /**
     * Name of integration connected to company.
     */
    @JsonProperty("platformName")
    private String platformName;

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    @JsonProperty("sourceId")
    private String sourceId;

    /**
     * The type of platform of the connection.
     */
    @JsonProperty("sourceType")
    private SourceType sourceType;

    /**
     * The current authorization status of the data connection.
     */
    @JsonProperty("status")
    private DataConnectionStatus status;

    @JsonCreator
    public Connection(
            @JsonProperty("connectionInfo") JsonNullable<? extends Map<String, String>> connectionInfo,
            @JsonProperty("created") String created,
            @JsonProperty("dataConnectionErrors") JsonNullable<? extends List<DataConnectionError>> dataConnectionErrors,
            @JsonProperty("id") String id,
            @JsonProperty("integrationId") String integrationId,
            @JsonProperty("integrationKey") String integrationKey,
            @JsonProperty("lastSync") Optional<String> lastSync,
            @JsonProperty("linkUrl") String linkUrl,
            @JsonProperty("platformName") String platformName,
            @JsonProperty("sourceId") String sourceId,
            @JsonProperty("sourceType") SourceType sourceType,
            @JsonProperty("status") DataConnectionStatus status) {
        Utils.checkNotNull(connectionInfo, "connectionInfo");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(dataConnectionErrors, "dataConnectionErrors");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(integrationId, "integrationId");
        Utils.checkNotNull(integrationKey, "integrationKey");
        Utils.checkNotNull(lastSync, "lastSync");
        Utils.checkNotNull(linkUrl, "linkUrl");
        Utils.checkNotNull(platformName, "platformName");
        Utils.checkNotNull(sourceId, "sourceId");
        Utils.checkNotNull(sourceType, "sourceType");
        Utils.checkNotNull(status, "status");
        this.connectionInfo = connectionInfo;
        this.created = created;
        this.dataConnectionErrors = dataConnectionErrors;
        this.id = id;
        this.integrationId = integrationId;
        this.integrationKey = integrationKey;
        this.lastSync = lastSync;
        this.linkUrl = linkUrl;
        this.platformName = platformName;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
        this.status = status;
    }
    
    public Connection(
            String created,
            String id,
            String integrationId,
            String integrationKey,
            String linkUrl,
            String platformName,
            String sourceId,
            SourceType sourceType,
            DataConnectionStatus status) {
        this(JsonNullable.undefined(), created, JsonNullable.undefined(), id, integrationId, integrationKey, Optional.empty(), linkUrl, platformName, sourceId, sourceType, status);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> connectionInfo() {
        return (JsonNullable<Map<String, String>>) connectionInfo;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonIgnore
    public String created() {
        return created;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<DataConnectionError>> dataConnectionErrors() {
        return (JsonNullable<List<DataConnectionError>>) dataConnectionErrors;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * A Codat ID representing the integration.
     */
    @JsonIgnore
    public String integrationId() {
        return integrationId;
    }

    /**
     * A unique four-character ID that identifies the platform of the company's data connection. This ensures continuity if the platform changes its name in the future.
     */
    @JsonIgnore
    public String integrationKey() {
        return integrationKey;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonIgnore
    public Optional<String> lastSync() {
        return lastSync;
    }

    /**
     * The link URL your customers can use to authorize access to their business application.
     */
    @JsonIgnore
    public String linkUrl() {
        return linkUrl;
    }

    /**
     * Name of integration connected to company.
     */
    @JsonIgnore
    public String platformName() {
        return platformName;
    }

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    /**
     * The type of platform of the connection.
     */
    @JsonIgnore
    public SourceType sourceType() {
        return sourceType;
    }

    /**
     * The current authorization status of the data connection.
     */
    @JsonIgnore
    public DataConnectionStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Connection withConnectionInfo(Map<String, String> connectionInfo) {
        Utils.checkNotNull(connectionInfo, "connectionInfo");
        this.connectionInfo = JsonNullable.of(connectionInfo);
        return this;
    }

    public Connection withConnectionInfo(JsonNullable<? extends Map<String, String>> connectionInfo) {
        Utils.checkNotNull(connectionInfo, "connectionInfo");
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Connection withCreated(String created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    public Connection withDataConnectionErrors(List<DataConnectionError> dataConnectionErrors) {
        Utils.checkNotNull(dataConnectionErrors, "dataConnectionErrors");
        this.dataConnectionErrors = JsonNullable.of(dataConnectionErrors);
        return this;
    }

    public Connection withDataConnectionErrors(JsonNullable<? extends List<DataConnectionError>> dataConnectionErrors) {
        Utils.checkNotNull(dataConnectionErrors, "dataConnectionErrors");
        this.dataConnectionErrors = dataConnectionErrors;
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public Connection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * A Codat ID representing the integration.
     */
    public Connection withIntegrationId(String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
        return this;
    }

    /**
     * A unique four-character ID that identifies the platform of the company's data connection. This ensures continuity if the platform changes its name in the future.
     */
    public Connection withIntegrationKey(String integrationKey) {
        Utils.checkNotNull(integrationKey, "integrationKey");
        this.integrationKey = integrationKey;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Connection withLastSync(String lastSync) {
        Utils.checkNotNull(lastSync, "lastSync");
        this.lastSync = Optional.ofNullable(lastSync);
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Connection withLastSync(Optional<String> lastSync) {
        Utils.checkNotNull(lastSync, "lastSync");
        this.lastSync = lastSync;
        return this;
    }

    /**
     * The link URL your customers can use to authorize access to their business application.
     */
    public Connection withLinkUrl(String linkUrl) {
        Utils.checkNotNull(linkUrl, "linkUrl");
        this.linkUrl = linkUrl;
        return this;
    }

    /**
     * Name of integration connected to company.
     */
    public Connection withPlatformName(String platformName) {
        Utils.checkNotNull(platformName, "platformName");
        this.platformName = platformName;
        return this;
    }

    /**
     * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
     */
    public Connection withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
        return this;
    }

    /**
     * The type of platform of the connection.
     */
    public Connection withSourceType(SourceType sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The current authorization status of the data connection.
     */
    public Connection withStatus(DataConnectionStatus status) {
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
        Connection other = (Connection) o;
        return 
            Objects.deepEquals(this.connectionInfo, other.connectionInfo) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.dataConnectionErrors, other.dataConnectionErrors) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.integrationId, other.integrationId) &&
            Objects.deepEquals(this.integrationKey, other.integrationKey) &&
            Objects.deepEquals(this.lastSync, other.lastSync) &&
            Objects.deepEquals(this.linkUrl, other.linkUrl) &&
            Objects.deepEquals(this.platformName, other.platformName) &&
            Objects.deepEquals(this.sourceId, other.sourceId) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectionInfo,
            created,
            dataConnectionErrors,
            id,
            integrationId,
            integrationKey,
            lastSync,
            linkUrl,
            platformName,
            sourceId,
            sourceType,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Connection.class,
                "connectionInfo", connectionInfo,
                "created", created,
                "dataConnectionErrors", dataConnectionErrors,
                "id", id,
                "integrationId", integrationId,
                "integrationKey", integrationKey,
                "lastSync", lastSync,
                "linkUrl", linkUrl,
                "platformName", platformName,
                "sourceId", sourceId,
                "sourceType", sourceType,
                "status", status);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Map<String, String>> connectionInfo = JsonNullable.undefined();
 
        private String created;
 
        private JsonNullable<? extends List<DataConnectionError>> dataConnectionErrors = JsonNullable.undefined();
 
        private String id;
 
        private String integrationId;
 
        private String integrationKey;
 
        private Optional<String> lastSync = Optional.empty();
 
        private String linkUrl;
 
        private String platformName;
 
        private String sourceId;
 
        private SourceType sourceType;
 
        private DataConnectionStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectionInfo(Map<String, String> connectionInfo) {
            Utils.checkNotNull(connectionInfo, "connectionInfo");
            this.connectionInfo = JsonNullable.of(connectionInfo);
            return this;
        }

        public Builder connectionInfo(JsonNullable<? extends Map<String, String>> connectionInfo) {
            Utils.checkNotNull(connectionInfo, "connectionInfo");
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder created(String created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        public Builder dataConnectionErrors(List<DataConnectionError> dataConnectionErrors) {
            Utils.checkNotNull(dataConnectionErrors, "dataConnectionErrors");
            this.dataConnectionErrors = JsonNullable.of(dataConnectionErrors);
            return this;
        }

        public Builder dataConnectionErrors(JsonNullable<? extends List<DataConnectionError>> dataConnectionErrors) {
            Utils.checkNotNull(dataConnectionErrors, "dataConnectionErrors");
            this.dataConnectionErrors = dataConnectionErrors;
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * A Codat ID representing the integration.
         */
        public Builder integrationId(String integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = integrationId;
            return this;
        }

        /**
         * A unique four-character ID that identifies the platform of the company's data connection. This ensures continuity if the platform changes its name in the future.
         */
        public Builder integrationKey(String integrationKey) {
            Utils.checkNotNull(integrationKey, "integrationKey");
            this.integrationKey = integrationKey;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder lastSync(String lastSync) {
            Utils.checkNotNull(lastSync, "lastSync");
            this.lastSync = Optional.ofNullable(lastSync);
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder lastSync(Optional<String> lastSync) {
            Utils.checkNotNull(lastSync, "lastSync");
            this.lastSync = lastSync;
            return this;
        }

        /**
         * The link URL your customers can use to authorize access to their business application.
         */
        public Builder linkUrl(String linkUrl) {
            Utils.checkNotNull(linkUrl, "linkUrl");
            this.linkUrl = linkUrl;
            return this;
        }

        /**
         * Name of integration connected to company.
         */
        public Builder platformName(String platformName) {
            Utils.checkNotNull(platformName, "platformName");
            this.platformName = platformName;
            return this;
        }

        /**
         * A source-specific ID used to distinguish between different sources originating from the same data connection. In general, a data connection is a single data source. However, for TrueLayer, `sourceId` is associated with a specific bank and has a many-to-one relationship with the `integrationId`.
         */
        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The type of platform of the connection.
         */
        public Builder sourceType(SourceType sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The current authorization status of the data connection.
         */
        public Builder status(DataConnectionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public Connection build() {
            return new Connection(
                connectionInfo,
                created,
                dataConnectionErrors,
                id,
                integrationId,
                integrationKey,
                lastSync,
                linkUrl,
                platformName,
                sourceId,
                sourceType,
                status);
        }
    }
}

