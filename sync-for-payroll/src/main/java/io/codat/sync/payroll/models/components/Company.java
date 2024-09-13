/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Company - ﻿In Codat, a company represents a business sharing access to their data. Each company can have multiple [connections](https://docs.codat.io/sync-for-payroll-api#/schemas/Connection) to different data sources such as one connection to [Xero](https://docs.codat.io/integrations/accounting/xero/accounting-xero) for accounting data, two connections to [Plaid](https://docs.codat.io/integrations/banking/plaid/banking-plaid) for two bank accounts and a connection to [Zettle](https://docs.codat.io/integrations/commerce/zettle/commerce-zettle) for POS data.
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
    private Optional<String> created;

    /**
     * Name of user that created the company in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdByUserName")
    private JsonNullable<String> createdByUserName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataConnections")
    private Optional<? extends List<Connection>> dataConnections;

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

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
    private Optional<String> lastSync;

    /**
     * The name of the company
     */
    @JsonProperty("name")
    private String name;

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    @JsonProperty("redirect")
    private String redirect;

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends Tags> tags;

    @JsonCreator
    public Company(
            @JsonProperty("created") Optional<String> created,
            @JsonProperty("createdByUserName") JsonNullable<String> createdByUserName,
            @JsonProperty("dataConnections") Optional<? extends List<Connection>> dataConnections,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") String id,
            @JsonProperty("lastSync") Optional<String> lastSync,
            @JsonProperty("name") String name,
            @JsonProperty("redirect") String redirect,
            @JsonProperty("tags") Optional<? extends Tags> tags) {
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        Utils.checkNotNull(dataConnections, "dataConnections");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lastSync, "lastSync");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(redirect, "redirect");
        Utils.checkNotNull(tags, "tags");
        this.created = created;
        this.createdByUserName = createdByUserName;
        this.dataConnections = dataConnections;
        this.description = description;
        this.id = id;
        this.lastSync = lastSync;
        this.name = name;
        this.redirect = redirect;
        this.tags = tags;
    }
    
    public Company(
            String id,
            String name,
            String redirect) {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), id, Optional.empty(), name, redirect, Optional.empty());
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
    public Optional<String> created() {
        return created;
    }

    /**
     * Name of user that created the company in Codat.
     */
    @JsonIgnore
    public JsonNullable<String> createdByUserName() {
        return createdByUserName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Connection>> dataConnections() {
        return (Optional<List<Connection>>) dataConnections;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonIgnore
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
    @JsonIgnore
    public Optional<String> lastSync() {
        return lastSync;
    }

    /**
     * The name of the company
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    @JsonIgnore
    public String redirect() {
        return redirect;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Tags> tags() {
        return (Optional<Tags>) tags;
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
    public Company withCreated(Optional<String> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public Company withCreatedByUserName(String createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = JsonNullable.of(createdByUserName);
        return this;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public Company withCreatedByUserName(JsonNullable<String> createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = createdByUserName;
        return this;
    }

    public Company withDataConnections(List<Connection> dataConnections) {
        Utils.checkNotNull(dataConnections, "dataConnections");
        this.dataConnections = Optional.ofNullable(dataConnections);
        return this;
    }

    public Company withDataConnections(Optional<? extends List<Connection>> dataConnections) {
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
    public Company withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
    public Company withLastSync(Optional<String> lastSync) {
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
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    public Company withRedirect(String redirect) {
        Utils.checkNotNull(redirect, "redirect");
        this.redirect = redirect;
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public Company withTags(Tags tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public Company withTags(Optional<? extends Tags> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
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
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.createdByUserName, other.createdByUserName) &&
            Objects.deepEquals(this.dataConnections, other.dataConnections) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.lastSync, other.lastSync) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.redirect, other.redirect) &&
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            created,
            createdByUserName,
            dataConnections,
            description,
            id,
            lastSync,
            name,
            redirect,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Company.class,
                "created", created,
                "createdByUserName", createdByUserName,
                "dataConnections", dataConnections,
                "description", description,
                "id", id,
                "lastSync", lastSync,
                "name", name,
                "redirect", redirect,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<String> created = Optional.empty();
 
        private JsonNullable<String> createdByUserName = JsonNullable.undefined();
 
        private Optional<? extends List<Connection>> dataConnections = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private String id;
 
        private Optional<String> lastSync = Optional.empty();
 
        private String name;
 
        private String redirect;
 
        private Optional<? extends Tags> tags = Optional.empty();  
        
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
        public Builder created(Optional<String> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        /**
         * Name of user that created the company in Codat.
         */
        public Builder createdByUserName(String createdByUserName) {
            Utils.checkNotNull(createdByUserName, "createdByUserName");
            this.createdByUserName = JsonNullable.of(createdByUserName);
            return this;
        }

        /**
         * Name of user that created the company in Codat.
         */
        public Builder createdByUserName(JsonNullable<String> createdByUserName) {
            Utils.checkNotNull(createdByUserName, "createdByUserName");
            this.createdByUserName = createdByUserName;
            return this;
        }

        public Builder dataConnections(List<Connection> dataConnections) {
            Utils.checkNotNull(dataConnections, "dataConnections");
            this.dataConnections = Optional.ofNullable(dataConnections);
            return this;
        }

        public Builder dataConnections(Optional<? extends List<Connection>> dataConnections) {
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
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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
        public Builder lastSync(Optional<String> lastSync) {
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
         * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
         */
        public Builder redirect(String redirect) {
            Utils.checkNotNull(redirect, "redirect");
            this.redirect = redirect;
            return this;
        }

        /**
         * A collection of user-defined key-value pairs that store custom metadata against the company.
         */
        public Builder tags(Tags tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        /**
         * A collection of user-defined key-value pairs that store custom metadata against the company.
         */
        public Builder tags(Optional<? extends Tags> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public Company build() {
            return new Company(
                created,
                createdByUserName,
                dataConnections,
                description,
                id,
                lastSync,
                name,
                redirect,
                tags);
        }
    }
}

