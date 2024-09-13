/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountingCreateTransferResponseAccountingTransfer - &gt; View the coverage for transfers in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=transfers" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * A transfer records the movement of money between two bank accounts, or between a bank account and a nominal account. It is a child data type of [account transactions](https://docs.codat.io/lending-api#/schemas/AccountTransaction).
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class AccountingCreateTransferResponseAccountingTransfer {

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
    private Optional<String> date;

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("depositedRecordRefs")
    private JsonNullable<? extends List<RecordRef>> depositedRecordRefs;

    /**
     * Description of the transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

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
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
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
    private JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs;

    @JsonCreator
    public AccountingCreateTransferResponseAccountingTransfer(
            @JsonProperty("contactRef") Optional<? extends ContactRef> contactRef,
            @JsonProperty("date") Optional<String> date,
            @JsonProperty("depositedRecordRefs") JsonNullable<? extends List<RecordRef>> depositedRecordRefs,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("from") Optional<? extends TransferAccount> from,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("to") Optional<? extends TransferAccount> to,
            @JsonProperty("trackingCategoryRefs") JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs) {
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
    
    public AccountingCreateTransferResponseAccountingTransfer() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContactRef> contactRef() {
        return (Optional<ContactRef>) contactRef;
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
    public Optional<String> date() {
        return date;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<RecordRef>> depositedRecordRefs() {
        return (JsonNullable<List<RecordRef>>) depositedRecordRefs;
    }

    /**
     * Description of the transfer.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferAccount> from() {
        return (Optional<TransferAccount>) from;
    }

    /**
     * Unique identifier for the transfer.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
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

    @JsonIgnore
    public Optional<String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SupplementalData> supplementalData() {
        return (Optional<SupplementalData>) supplementalData;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferAccount> to() {
        return (Optional<TransferAccount>) to;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TrackingCategoryRef>> trackingCategoryRefs() {
        return (JsonNullable<List<TrackingCategoryRef>>) trackingCategoryRefs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountingCreateTransferResponseAccountingTransfer withContactRef(ContactRef contactRef) {
        Utils.checkNotNull(contactRef, "contactRef");
        this.contactRef = Optional.ofNullable(contactRef);
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withContactRef(Optional<? extends ContactRef> contactRef) {
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
    public AccountingCreateTransferResponseAccountingTransfer withDate(String date) {
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
    public AccountingCreateTransferResponseAccountingTransfer withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withDepositedRecordRefs(List<RecordRef> depositedRecordRefs) {
        Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
        this.depositedRecordRefs = JsonNullable.of(depositedRecordRefs);
        return this;
    }

    /**
     * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withDepositedRecordRefs(JsonNullable<? extends List<RecordRef>> depositedRecordRefs) {
        Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
        this.depositedRecordRefs = depositedRecordRefs;
        return this;
    }

    /**
     * Description of the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withFrom(TransferAccount from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withFrom(Optional<? extends TransferAccount> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * Unique identifier for the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public AccountingCreateTransferResponseAccountingTransfer withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingCreateTransferResponseAccountingTransfer withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingCreateTransferResponseAccountingTransfer withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withTo(TransferAccount to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * Account details of the account sending or receiving the transfer.
     */
    public AccountingCreateTransferResponseAccountingTransfer withTo(Optional<? extends TransferAccount> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    public AccountingCreateTransferResponseAccountingTransfer withTrackingCategoryRefs(List<TrackingCategoryRef> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
        return this;
    }

    /**
     * Reference to the tracking categories this transfer is being tracked against.
     */
    public AccountingCreateTransferResponseAccountingTransfer withTrackingCategoryRefs(JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs) {
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
        AccountingCreateTransferResponseAccountingTransfer other = (AccountingCreateTransferResponseAccountingTransfer) o;
        return 
            Objects.deepEquals(this.contactRef, other.contactRef) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.depositedRecordRefs, other.depositedRecordRefs) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.from, other.from) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            Objects.deepEquals(this.to, other.to) &&
            Objects.deepEquals(this.trackingCategoryRefs, other.trackingCategoryRefs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(AccountingCreateTransferResponseAccountingTransfer.class,
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
 
        private Optional<String> date = Optional.empty();
 
        private JsonNullable<? extends List<RecordRef>> depositedRecordRefs = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<? extends TransferAccount> from = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private Optional<? extends TransferAccount> to = Optional.empty();
 
        private JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contactRef(ContactRef contactRef) {
            Utils.checkNotNull(contactRef, "contactRef");
            this.contactRef = Optional.ofNullable(contactRef);
            return this;
        }

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
        public Builder date(Optional<String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
         */
        public Builder depositedRecordRefs(List<RecordRef> depositedRecordRefs) {
            Utils.checkNotNull(depositedRecordRefs, "depositedRecordRefs");
            this.depositedRecordRefs = JsonNullable.of(depositedRecordRefs);
            return this;
        }

        /**
         * List of selected transactions to associate with the transfer. Use this field to include transactions which are posted to the _undeposited funds_ (or other holding) account within the transfer.
         */
        public Builder depositedRecordRefs(JsonNullable<? extends List<RecordRef>> depositedRecordRefs) {
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
        public Builder description(JsonNullable<String> description) {
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
        public Builder id(Optional<String> id) {
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

        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
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
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(SupplementalData supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = Optional.ofNullable(supplementalData);
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
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
        public Builder trackingCategoryRefs(List<TrackingCategoryRef> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
            return this;
        }

        /**
         * Reference to the tracking categories this transfer is being tracked against.
         */
        public Builder trackingCategoryRefs(JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = trackingCategoryRefs;
            return this;
        }
        
        public AccountingCreateTransferResponseAccountingTransfer build() {
            return new AccountingCreateTransferResponseAccountingTransfer(
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

