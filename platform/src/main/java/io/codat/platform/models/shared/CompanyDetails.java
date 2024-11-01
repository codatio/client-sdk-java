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


public class CompanyDetails {

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
     * An array of products that are currently enabled for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("products")
    private Optional<? extends List<String>> products;

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
    private Optional<? extends Map<String, String>> tags;

    @JsonCreator
    public CompanyDetails(
            @JsonProperty("created") Optional<String> created,
            @JsonProperty("createdByUserName") JsonNullable<String> createdByUserName,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("id") String id,
            @JsonProperty("lastSync") Optional<String> lastSync,
            @JsonProperty("name") String name,
            @JsonProperty("products") Optional<? extends List<String>> products,
            @JsonProperty("redirect") String redirect,
            @JsonProperty("tags") Optional<? extends Map<String, String>> tags) {
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(lastSync, "lastSync");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(products, "products");
        Utils.checkNotNull(redirect, "redirect");
        Utils.checkNotNull(tags, "tags");
        this.created = created;
        this.createdByUserName = createdByUserName;
        this.description = description;
        this.id = id;
        this.lastSync = lastSync;
        this.name = name;
        this.products = products;
        this.redirect = redirect;
        this.tags = tags;
    }
    
    public CompanyDetails(
            String id,
            String name,
            String redirect) {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), id, Optional.empty(), name, Optional.empty(), redirect, Optional.empty());
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
     * An array of products that are currently enabled for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> products() {
        return (Optional<List<String>>) products;
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
    public Optional<Map<String, String>> tags() {
        return (Optional<Map<String, String>>) tags;
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
    public CompanyDetails withCreated(String created) {
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
    public CompanyDetails withCreated(Optional<String> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public CompanyDetails withCreatedByUserName(String createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = JsonNullable.of(createdByUserName);
        return this;
    }

    /**
     * Name of user that created the company in Codat.
     */
    public CompanyDetails withCreatedByUserName(JsonNullable<String> createdByUserName) {
        Utils.checkNotNull(createdByUserName, "createdByUserName");
        this.createdByUserName = createdByUserName;
        return this;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyDetails withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Additional information about the company. This can be used to store foreign IDs, references, etc.
     */
    public CompanyDetails withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CompanyDetails withId(String id) {
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
    public CompanyDetails withLastSync(String lastSync) {
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
    public CompanyDetails withLastSync(Optional<String> lastSync) {
        Utils.checkNotNull(lastSync, "lastSync");
        this.lastSync = lastSync;
        return this;
    }

    /**
     * The name of the company
     */
    public CompanyDetails withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * An array of products that are currently enabled for the company.
     */
    public CompanyDetails withProducts(List<String> products) {
        Utils.checkNotNull(products, "products");
        this.products = Optional.ofNullable(products);
        return this;
    }

    /**
     * An array of products that are currently enabled for the company.
     */
    public CompanyDetails withProducts(Optional<? extends List<String>> products) {
        Utils.checkNotNull(products, "products");
        this.products = products;
        return this;
    }

    /**
     * The `redirect` [Link URL](https://docs.codat.io/auth-flow/authorize-hosted-link) enabling the customer to start their auth flow journey for the company.
     */
    public CompanyDetails withRedirect(String redirect) {
        Utils.checkNotNull(redirect, "redirect");
        this.redirect = redirect;
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public CompanyDetails withTags(Map<String, String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    /**
     * A collection of user-defined key-value pairs that store custom metadata against the company.
     */
    public CompanyDetails withTags(Optional<? extends Map<String, String>> tags) {
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
        CompanyDetails other = (CompanyDetails) o;
        return 
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.createdByUserName, other.createdByUserName) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.lastSync, other.lastSync) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.products, other.products) &&
            Objects.deepEquals(this.redirect, other.redirect) &&
            Objects.deepEquals(this.tags, other.tags);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            created,
            createdByUserName,
            description,
            id,
            lastSync,
            name,
            products,
            redirect,
            tags);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyDetails.class,
                "created", created,
                "createdByUserName", createdByUserName,
                "description", description,
                "id", id,
                "lastSync", lastSync,
                "name", name,
                "products", products,
                "redirect", redirect,
                "tags", tags);
    }
    
    public final static class Builder {
 
        private Optional<String> created = Optional.empty();
 
        private JsonNullable<String> createdByUserName = JsonNullable.undefined();
 
        private Optional<String> description = Optional.empty();
 
        private String id;
 
        private Optional<String> lastSync = Optional.empty();
 
        private String name;
 
        private Optional<? extends List<String>> products = Optional.empty();
 
        private String redirect;
 
        private Optional<? extends Map<String, String>> tags = Optional.empty();  
        
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
         * An array of products that are currently enabled for the company.
         */
        public Builder products(List<String> products) {
            Utils.checkNotNull(products, "products");
            this.products = Optional.ofNullable(products);
            return this;
        }

        /**
         * An array of products that are currently enabled for the company.
         */
        public Builder products(Optional<? extends List<String>> products) {
            Utils.checkNotNull(products, "products");
            this.products = products;
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
        public Builder tags(Map<String, String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        /**
         * A collection of user-defined key-value pairs that store custom metadata against the company.
         */
        public Builder tags(Optional<? extends Map<String, String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }
        
        public CompanyDetails build() {
            return new CompanyDetails(
                created,
                createdByUserName,
                description,
                id,
                lastSync,
                name,
                products,
                redirect,
                tags);
        }
    }
}

