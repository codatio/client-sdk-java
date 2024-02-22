/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * Company - ﻿In Codat, a company represents a business sharing access to their data. Each company can have multiple [connections](https://docs.codat.io/sync-for-payables-api#/schemas/Connection) to different data sources such as one connection to [Xero](https://docs.codat.io/integrations/accounting/xero/accounting-xero) for accounting data, two connections to [Plaid](https://docs.codat.io/integrations/banking/plaid/banking-plaid) for two bank accounts and a connection to [Zettle](https://docs.codat.io/integrations/commerce/zettle/commerce-zettle) for POS data.
 * 
 * Typically each company is one of your customers.
 * 
 * When you create a company, you can specify a `name` and we will automatically generate a unique `id` for the company. You can also add a `description` to store any additional information about the company.
 */

public class Company {

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
    @JsonProperty("created")
    private Optional<? extends String> created;

    /**
     * Name of user that created the company in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdByUserName")
    private Optional<? extends String> createdByUserName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataConnections")
    private Optional<? extends java.util.List<Connection>> dataConnections;

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    /**
     * An array of groups the company has been assigned to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groups")
    private Optional<? extends java.util.List<GroupReference>> groups;

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonProperty("id")
    private String id;

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
    private Optional<? extends String> lastSync;

    /**
     * The name of the company
     */
    @JsonProperty("name")
    private String name;

    /**
     * `platformKeys` name used when creating the company.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("platform")
    @Deprecated
    private Optional<? extends String> platform;

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    @JsonProperty("redirect")
    private String redirect;

    public Company(
            @JsonProperty("created") Optional<? extends String> created,
            @JsonProperty("createdByUserName") Optional<? extends String> createdByUserName,
            @JsonProperty("dataConnections") Optional<? extends java.util.List<Connection>> dataConnections,
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("groups") Optional<? extends java.util.List<GroupReference>> groups,
            @JsonProperty("id") String id,
            @JsonProperty("lastSync") Optional<? extends String> lastSync,
            @JsonProperty("name") String name,
            @JsonProperty("platform") Optional<? extends String> platform,
            @JsonProperty("redirect") String redirect) {
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        Utils.checkNotNull(dataConnections, "dataConnections");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(groups, "groups");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lastSync, "lastSync");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(platform, "platform");
        Utils.checkNotNull(redirect, "redirect");
        this.created = created;
        this.createdByUserName = createdByUserName;
        this.dataConnections = dataConnections;
        this.description = description;
        this.groups = groups;
        this.id = id;
        this.lastSync = lastSync;
        this.name = name;
        this.platform = platform;
        this.redirect = redirect;
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
    public Optional<? extends String> created() {
        return created;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public Optional<? extends String> createdByUserName() {
        return createdByUserName;
    }

    public Optional<? extends java.util.List<Connection>> dataConnections() {
        return dataConnections;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public Optional<? extends String> description() {
        return description;
    }

    /**
     * An array of groups the company has been assigned to.
     */
    public Optional<? extends java.util.List<GroupReference>> groups() {
        return groups;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public String id() {
        return id;
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
    public Optional<? extends String> lastSync() {
        return lastSync;
    }

    /**
     * The name of the company
     */
    public String name() {
        return name;
    }

    /**
     * `platformKeys` name used when creating the company.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Optional<? extends String> platform() {
        return platform;
    }

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    public String redirect() {
        return redirect;
    }
    
    public final static Builder builder() {
        return new Builder();
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
    public Company withCreated(String created) {
        Utils.checkNotNull(created, "created");
        this.created = Optional.ofNullable(created);
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
    public Company withCreated(Optional<? extends String> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public Company withCreatedByUserName(String createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = Optional.ofNullable(createdByUserName);
        return this;
    }
    
    /**
     * Name of user that created the company in Codat.
     */
    public Company withCreatedByUserName(Optional<? extends String> createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = createdByUserName;
        return this;
    }

    public Company withDataConnections(java.util.List<Connection> dataConnections) {
        Utils.checkNotNull(dataConnections, "dataConnections");
        this.dataConnections = Optional.ofNullable(dataConnections);
        return this;
    }
    
    public Company withDataConnections(Optional<? extends java.util.List<Connection>> dataConnections) {
        Utils.checkNotNull(dataConnections, "dataConnections");
        this.dataConnections = dataConnections;
        return this;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public Company withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }
    
    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public Company withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * An array of groups the company has been assigned to.
     */
    public Company withGroups(java.util.List<GroupReference> groups) {
        Utils.checkNotNull(groups, "groups");
        this.groups = Optional.ofNullable(groups);
        return this;
    }
    
    /**
     * An array of groups the company has been assigned to.
     */
    public Company withGroups(Optional<? extends java.util.List<GroupReference>> groups) {
        Utils.checkNotNull(groups, "groups");
        this.groups = groups;
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public Company withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
    public Company withLastSync(String lastSync) {
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
    public Company withLastSync(Optional<? extends String> lastSync) {
        Utils.checkNotNull(lastSync, "lastSync");
        this.lastSync = lastSync;
        return this;
    }

    /**
     * The name of the company
     */
    public Company withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * `platformKeys` name used when creating the company.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Company withPlatform(String platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = Optional.ofNullable(platform);
        return this;
    }
    
    /**
     * `platformKeys` name used when creating the company.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Company withPlatform(Optional<? extends String> platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
        return this;
    }

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    public Company withRedirect(String redirect) {
        Utils.checkNotNull(redirect, "redirect");
        this.redirect = redirect;
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
        Company other = (Company) o;
        return 
            java.util.Objects.deepEquals(this.created, other.created) &&
            java.util.Objects.deepEquals(this.createdByUserName, other.createdByUserName) &&
            java.util.Objects.deepEquals(this.dataConnections, other.dataConnections) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.groups, other.groups) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.lastSync, other.lastSync) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.platform, other.platform) &&
            java.util.Objects.deepEquals(this.redirect, other.redirect);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            created,
            createdByUserName,
            dataConnections,
            description,
            groups,
            id,
            lastSync,
            name,
            platform,
            redirect);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Company.class,
                "created", created,
                "createdByUserName", createdByUserName,
                "dataConnections", dataConnections,
                "description", description,
                "groups", groups,
                "id", id,
                "lastSync", lastSync,
                "name", name,
                "platform", platform,
                "redirect", redirect);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> created = Optional.empty();
 
        private Optional<? extends String> createdByUserName = Optional.empty();
 
        private Optional<? extends java.util.List<Connection>> dataConnections = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends java.util.List<GroupReference>> groups = Optional.empty();
 
        private String id;
 
        private Optional<? extends String> lastSync = Optional.empty();
 
        private String name;
 
        @Deprecated
        private Optional<? extends String> platform = Optional.empty();
 
        private String redirect;  
        
        private Builder() {
          // force use of static builder() method
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
            this.created = Optional.ofNullable(created);
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
        public Builder created(Optional<? extends String> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * Name of user that created the company in Codat.
         */
        public Builder createdByUserName(String createdByUserName) {
            Utils.checkNotNull(createdByUserName, "createdByUserName");
            this.createdByUserName = Optional.ofNullable(createdByUserName);
            return this;
        }
        
        /**
         * Name of user that created the company in Codat.
         */
        public Builder createdByUserName(Optional<? extends String> createdByUserName) {
            Utils.checkNotNull(createdByUserName, "createdByUserName");
            this.createdByUserName = createdByUserName;
            return this;
        }

        public Builder dataConnections(java.util.List<Connection> dataConnections) {
            Utils.checkNotNull(dataConnections, "dataConnections");
            this.dataConnections = Optional.ofNullable(dataConnections);
            return this;
        }
        
        public Builder dataConnections(Optional<? extends java.util.List<Connection>> dataConnections) {
            Utils.checkNotNull(dataConnections, "dataConnections");
            this.dataConnections = dataConnections;
            return this;
        }

        /**
         * Additional information about the company. This can be used to store foreign IDs, references, etc.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }
        
        /**
         * Additional information about the company. This can be used to store foreign IDs, references, etc.
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * An array of groups the company has been assigned to.
         */
        public Builder groups(java.util.List<GroupReference> groups) {
            Utils.checkNotNull(groups, "groups");
            this.groups = Optional.ofNullable(groups);
            return this;
        }
        
        /**
         * An array of groups the company has been assigned to.
         */
        public Builder groups(Optional<? extends java.util.List<GroupReference>> groups) {
            Utils.checkNotNull(groups, "groups");
            this.groups = groups;
            return this;
        }

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
        public Builder lastSync(Optional<? extends String> lastSync) {
            Utils.checkNotNull(lastSync, "lastSync");
            this.lastSync = lastSync;
            return this;
        }

        /**
         * The name of the company
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * `platformKeys` name used when creating the company.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder platform(String platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = Optional.ofNullable(platform);
            return this;
        }
        
        /**
         * `platformKeys` name used when creating the company.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder platform(Optional<? extends String> platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }

        /**
         * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
         */
        public Builder redirect(String redirect) {
            Utils.checkNotNull(redirect, "redirect");
            this.redirect = redirect;
            return this;
        }
        
        public Company build() {
            return new Company(
                created,
                createdByUserName,
                dataConnections,
                description,
                groups,
                id,
                lastSync,
                name,
                platform,
                redirect);
        }
    }
}

