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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Journal - &gt; **Language tip:** For line items, or individual transactions, of a company's financial documents, refer to the [Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) data type
 * 
 * &gt; View the coverage for journals in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=journals" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * In accounting software, journals are used to record all the financial transactions of a company. Each transaction in a journal is represented by a separate [journal entry](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry). These entries are used to create the general ledger, which is then used to create the financial statements of a business.
 * 
 * When a company records all their transactions in a single journal, it can become large and difficult to maintain and track. This is why large companies often use multiple journals (also known as subjournals) to categorize and manage journal entries.
 * 
 * Such journals can be divided into two categories:
 * 
 * - Special journals: journals used to record specific types of transactions; for example, a purchases journal, a sales journal, or a cash management journal.
 * - General journals: journals used to record transactions that fall outside the scope of the special journals.
 * 
 * Multiple journals or subjournals are used in the following Codat integrations:
 * 
 * - [Sage Intacct](https://docs.codat.io/integrations/accounting/sage-intacct/accounting-sage-intacct)  (mandatory)
 * - [Exact Online](https://docs.codat.io/integrations/accounting/exact-online/accounting-exact-online)  (mandatory)
 * - [Oracle NetSuite](https://docs.codat.io/integrations/accounting/netsuite/accounting-netsuite) (optional)
 * 
 * &gt; When pushing journal entries to an accounting software that doesn’t support multiple journals (multi-book accounting), the entries will be linked to the platform-generic journal. The Journals data type will only include one object.
 * 
 */

public class Journal {

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
    @JsonProperty("createdOn")
    private Optional<String> createdOn;

    /**
     * If the journal has child journals, this value is true. If it doesn’t, it is false.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasChildren")
    private Optional<Boolean> hasChildren;

    /**
     * Journal ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Native journal number or code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("journalCode")
    private JsonNullable<String> journalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * Journal name.
     * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Parent journal ID.
     * If the journal is a parent journal, this value is not present.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentId")
    private JsonNullable<String> parentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Current journal status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends JournalStatus> status;

    /**
     * The type of the journal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<String> type;

    @JsonCreator
    public Journal(
            @JsonProperty("createdOn") Optional<String> createdOn,
            @JsonProperty("hasChildren") Optional<Boolean> hasChildren,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("journalCode") JsonNullable<String> journalCode,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("parentId") JsonNullable<String> parentId,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("status") Optional<? extends JournalStatus> status,
            @JsonProperty("type") JsonNullable<String> type) {
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(hasChildren, "hasChildren");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(journalCode, "journalCode");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.createdOn = createdOn;
        this.hasChildren = hasChildren;
        this.id = id;
        this.journalCode = journalCode;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.parentId = parentId;
        this.sourceModifiedDate = sourceModifiedDate;
        this.status = status;
        this.type = type;
    }
    
    public Journal() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
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
    public Optional<String> createdOn() {
        return createdOn;
    }

    /**
     * If the journal has child journals, this value is true. If it doesn’t, it is false.
     */
    @JsonIgnore
    public Optional<Boolean> hasChildren() {
        return hasChildren;
    }

    /**
     * Journal ID.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Native journal number or code.
     */
    @JsonIgnore
    public JsonNullable<String> journalCode() {
        return journalCode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Metadata> metadata() {
        return (Optional<Metadata>) metadata;
    }

    @JsonIgnore
    public Optional<String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Journal name.
     * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Parent journal ID.
     * If the journal is a parent journal, this value is not present.
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    @JsonIgnore
    public Optional<String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Current journal status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<JournalStatus> status() {
        return (Optional<JournalStatus>) status;
    }

    /**
     * The type of the journal.
     */
    @JsonIgnore
    public JsonNullable<String> type() {
        return type;
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
    public Journal withCreatedOn(String createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = Optional.ofNullable(createdOn);
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
    public Journal withCreatedOn(Optional<String> createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    /**
     * If the journal has child journals, this value is true. If it doesn’t, it is false.
     */
    public Journal withHasChildren(boolean hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = Optional.ofNullable(hasChildren);
        return this;
    }

    /**
     * If the journal has child journals, this value is true. If it doesn’t, it is false.
     */
    public Journal withHasChildren(Optional<Boolean> hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = hasChildren;
        return this;
    }

    /**
     * Journal ID.
     */
    public Journal withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Journal ID.
     */
    public Journal withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Native journal number or code.
     */
    public Journal withJournalCode(String journalCode) {
        Utils.checkNotNull(journalCode, "journalCode");
        this.journalCode = JsonNullable.of(journalCode);
        return this;
    }

    /**
     * Native journal number or code.
     */
    public Journal withJournalCode(JsonNullable<String> journalCode) {
        Utils.checkNotNull(journalCode, "journalCode");
        this.journalCode = journalCode;
        return this;
    }

    public Journal withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public Journal withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Journal withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public Journal withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Journal name.
     * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
     */
    public Journal withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Journal name.
     * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
     */
    public Journal withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Parent journal ID.
     * If the journal is a parent journal, this value is not present.
     */
    public Journal withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * Parent journal ID.
     * If the journal is a parent journal, this value is not present.
     */
    public Journal withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public Journal withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public Journal withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Current journal status.
     */
    public Journal withStatus(JournalStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Current journal status.
     */
    public Journal withStatus(Optional<? extends JournalStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The type of the journal.
     */
    public Journal withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of the journal.
     */
    public Journal withType(JsonNullable<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        Journal other = (Journal) o;
        return 
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.hasChildren, other.hasChildren) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.journalCode, other.journalCode) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdOn,
            hasChildren,
            id,
            journalCode,
            metadata,
            modifiedDate,
            name,
            parentId,
            sourceModifiedDate,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Journal.class,
                "createdOn", createdOn,
                "hasChildren", hasChildren,
                "id", id,
                "journalCode", journalCode,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "name", name,
                "parentId", parentId,
                "sourceModifiedDate", sourceModifiedDate,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> createdOn = Optional.empty();
 
        private Optional<Boolean> hasChildren = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> journalCode = JsonNullable.undefined();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> parentId = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends JournalStatus> status = Optional.empty();
 
        private JsonNullable<String> type = JsonNullable.undefined();  
        
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
        public Builder createdOn(String createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = Optional.ofNullable(createdOn);
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
        public Builder createdOn(Optional<String> createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        /**
         * If the journal has child journals, this value is true. If it doesn’t, it is false.
         */
        public Builder hasChildren(boolean hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = Optional.ofNullable(hasChildren);
            return this;
        }

        /**
         * If the journal has child journals, this value is true. If it doesn’t, it is false.
         */
        public Builder hasChildren(Optional<Boolean> hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = hasChildren;
            return this;
        }

        /**
         * Journal ID.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Journal ID.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Native journal number or code.
         */
        public Builder journalCode(String journalCode) {
            Utils.checkNotNull(journalCode, "journalCode");
            this.journalCode = JsonNullable.of(journalCode);
            return this;
        }

        /**
         * Native journal number or code.
         */
        public Builder journalCode(JsonNullable<String> journalCode) {
            Utils.checkNotNull(journalCode, "journalCode");
            this.journalCode = journalCode;
            return this;
        }

        public Builder metadata(Metadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends Metadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * Journal name.
         * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Journal name.
         * The maximum length for a journal name is 256 characters. All characters above that number will be truncated.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Parent journal ID.
         * If the journal is a parent journal, this value is not present.
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * Parent journal ID.
         * If the journal is a parent journal, this value is not present.
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }

        public Builder sourceModifiedDate(Optional<String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Current journal status.
         */
        public Builder status(JournalStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Current journal status.
         */
        public Builder status(Optional<? extends JournalStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The type of the journal.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of the journal.
         */
        public Builder type(JsonNullable<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Journal build() {
            return new Journal(
                createdOn,
                hasChildren,
                id,
                journalCode,
                metadata,
                modifiedDate,
                name,
                parentId,
                sourceModifiedDate,
                status,
                type);
        }
    }
}

