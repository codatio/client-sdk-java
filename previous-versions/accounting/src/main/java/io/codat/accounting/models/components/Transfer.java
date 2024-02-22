/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Transfer - &gt; View the coverage for transfers in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=transfers" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * A transfer records the movement of money between two bank accounts, or between a bank account and a nominal account. It is a child data type of [account transactions](https://docs.codat.io/accounting-api#/schemas/AccountTransaction).
 */

public class Transfer {

    /**
     * A customer or supplier associated with the direct cost.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactRef")
    private Optional<? extends ContactRef> contactRef;

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
    @JsonProperty("date")
    private Optional<? extends String> date;

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("depositedRecordRefs")
    private JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs;

    /**
     * Description of the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Account details of the account sending or receiving the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    private Optional<? extends TransferAccount> from;

    /**
     * Unique identifier for the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<? extends String> sourceModifiedDate;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalData")
    private Optional<? extends SupplementalData> supplementalData;

    /**
     * Account details of the account sending or receiving the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    private Optional<? extends TransferAccount> to;

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trackingCategoryRefs")
    private JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs;

    public Transfer(
            @JsonProperty("contactRef") Optional<? extends ContactRef> contactRef,
            @JsonProperty("date") Optional<? extends String> date,
            @JsonProperty("depositedRecordRefs") JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("from") Optional<? extends TransferAccount> from,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate,
            @JsonProperty("sourceModifiedDate") Optional<? extends String> sourceModifiedDate,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("to") Optional<? extends TransferAccount> to,
            @JsonProperty("trackingCategoryRefs") JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs) {
        Utils.checkNotNull(contactRef, "contactRef");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(supplementalData, "supplementalData");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.contactRef = contactRef;
        this.date = date;
        this.depositedRecordRefs = depositedRecordRefs;
        this.description = description;
        this.from = from;
        this.id = id;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.sourceModifiedDate = sourceModifiedDate;
        this.supplementalData = supplementalData;
        this.to = to;
        this.trackingCategoryRefs = trackingCategoryRefs;
    }

    /**
     * A customer or supplier associated with the direct cost.
     */
    public Optional<? extends ContactRef> contactRef() {
        return contactRef;
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
    public Optional<? extends String> date() {
        return date;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    public JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs() {
        return depositedRecordRefs;
    }

    /**
     * Description of the transfer.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Optional<? extends TransferAccount> from() {
        return from;
    }

    /**
     * Unique identifier for the transfer.
     */
    public Optional<? extends String> id() {
        return id;
    }

    public Optional<? extends Metadata> metadata() {
        return metadata;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }

    public Optional<? extends String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Optional<? extends SupplementalData> supplementalData() {
        return supplementalData;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Optional<? extends TransferAccount> to() {
        return to;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    public JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs() {
        return trackingCategoryRefs;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A customer or supplier associated with the direct cost.
     */
    public Transfer withContactRef(ContactRef contactRef) {
        Utils.checkNotNull(contactRef, "contactRef");
        this.contactRef = Optional.ofNullable(contactRef);
        return this;
    }
    
    /**
     * A customer or supplier associated with the direct cost.
     */
    public Transfer withContactRef(Optional<? extends ContactRef> contactRef) {
        Utils.checkNotNull(contactRef, "contactRef");
        this.contactRef = contactRef;
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
    public Transfer withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
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
    public Transfer withDate(Optional<? extends String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    public Transfer withDepositedRecordRefs(java.util.List<InvoiceTo> depositedRecordRefs) {
        Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
        this.depositedRecordRefs = JsonNullable.of(depositedRecordRefs);
        return this;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    public Transfer withDepositedRecordRefs(JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs) {
        Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
        this.depositedRecordRefs = depositedRecordRefs;
        return this;
    }

    /**
     * Description of the transfer.
     */
    public Transfer withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the transfer.
     */
    public Transfer withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Transfer withFrom(TransferAccount from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }
    
    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Transfer withFrom(Optional<? extends TransferAccount> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * Unique identifier for the transfer.
     */
    public Transfer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }
    
    /**
     * Unique identifier for the transfer.
     */
    public Transfer withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Transfer withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }
    
    public Transfer withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Transfer withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }
    
    public Transfer withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    public Transfer withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }
    
    public Transfer withSourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Transfer withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }
    
    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Transfer withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Transfer withTo(TransferAccount to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }
    
    /**
     * Account details of the account sending or receiving the transfer.
     */
    public Transfer withTo(Optional<? extends TransferAccount> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    public Transfer withTrackingCategoryRefs(java.util.List<TrackingCategoryRef> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
        return this;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    public Transfer withTrackingCategoryRefs(JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = trackingCategoryRefs;
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
        Transfer other = (Transfer) o;
        return 
            java.util.Objects.deepEquals(this.contactRef, other.contactRef) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.depositedRecordRefs, other.depositedRecordRefs) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.from, other.from) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            java.util.Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            java.util.Objects.deepEquals(this.to, other.to) &&
            java.util.Objects.deepEquals(this.trackingCategoryRefs, other.trackingCategoryRefs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contactRef,
            date,
            depositedRecordRefs,
            description,
            from,
            id,
            metadata,
            modifiedDate,
            sourceModifiedDate,
            supplementalData,
            to,
            trackingCategoryRefs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Transfer.class,
                "contactRef", contactRef,
                "date", date,
                "depositedRecordRefs", depositedRecordRefs,
                "description", description,
                "from", from,
                "id", id,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "sourceModifiedDate", sourceModifiedDate,
                "supplementalData", supplementalData,
                "to", to,
                "trackingCategoryRefs", trackingCategoryRefs);
    }
    
    public final static class Builder {
 
        private Optional<? extends ContactRef> contactRef = Optional.empty();
 
        private Optional<? extends String> date = Optional.empty();
 
        private JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs = JsonNullable.undefined();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends TransferAccount> from = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<? extends String> modifiedDate = Optional.empty();
 
        private Optional<? extends String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private Optional<? extends TransferAccount> to = Optional.empty();
 
        private JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A customer or supplier associated with the direct cost.
         */
        public Builder contactRef(ContactRef contactRef) {
            Utils.checkNotNull(contactRef, "contactRef");
            this.contactRef = Optional.ofNullable(contactRef);
            return this;
        }
        
        /**
         * A customer or supplier associated with the direct cost.
         */
        public Builder contactRef(Optional<? extends ContactRef> contactRef) {
            Utils.checkNotNull(contactRef, "contactRef");
            this.contactRef = contactRef;
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
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
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
        public Builder date(Optional<? extends String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
         */
        public Builder depositedRecordRefs(java.util.List<InvoiceTo> depositedRecordRefs) {
            Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
            this.depositedRecordRefs = JsonNullable.of(depositedRecordRefs);
            return this;
        }

        /**
         * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
         */
        public Builder depositedRecordRefs(JsonNullable<? extends java.util.List<InvoiceTo>> depositedRecordRefs) {
            Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
            this.depositedRecordRefs = depositedRecordRefs;
            return this;
        }

        /**
         * Description of the transfer.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the transfer.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Account details of the account sending or receiving the transfer.
         */
        public Builder from(TransferAccount from) {
            Utils.checkNotNull(from, "from");
            this.from = Optional.ofNullable(from);
            return this;
        }
        
        /**
         * Account details of the account sending or receiving the transfer.
         */
        public Builder from(Optional<? extends TransferAccount> from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * Unique identifier for the transfer.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }
        
        /**
         * Unique identifier for the transfer.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
        
        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }
        
        public Builder sourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(SupplementalData supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = Optional.ofNullable(supplementalData);
            return this;
        }
        
        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(Optional<? extends SupplementalData> supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = supplementalData;
            return this;
        }

        /**
         * Account details of the account sending or receiving the transfer.
         */
        public Builder to(TransferAccount to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }
        
        /**
         * Account details of the account sending or receiving the transfer.
         */
        public Builder to(Optional<? extends TransferAccount> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }

        /**
         * Reference to the tracking categories this transfer is being tracked against.
         */
        public Builder trackingCategoryRefs(java.util.List<TrackingCategoryRef> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
            return this;
        }

        /**
         * Reference to the tracking categories this transfer is being tracked against.
         */
        public Builder trackingCategoryRefs(JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = trackingCategoryRefs;
            return this;
        }
        
        public Transfer build() {
            return new Transfer(
                contactRef,
                date,
                depositedRecordRefs,
                description,
                from,
                id,
                metadata,
                modifiedDate,
                sourceModifiedDate,
                supplementalData,
                to,
                trackingCategoryRefs);
        }
    }
}

