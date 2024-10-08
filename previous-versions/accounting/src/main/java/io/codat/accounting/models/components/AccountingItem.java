/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountingItem - &gt; View the coverage for items in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=items" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * **Items** allow your customers to save and track details of the products and services that they buy and sell.
 * 
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class AccountingItem {

    /**
     * Item details that are only for bills.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billItem")
    private Optional<? extends BillItem> billItem;

    /**
     * Friendly reference for the item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Identifier for the item that is unique to a company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Item details that are only for bills.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoiceItem")
    private Optional<? extends InvoiceItem> invoiceItem;

    /**
     * Whether you can use this item for bills.
     */
    @JsonProperty("isBillItem")
    private boolean isBillItem;

    /**
     * Whether you can use this item for invoices.
     */
    @JsonProperty("isInvoiceItem")
    private boolean isInvoiceItem;

    /**
     * Current state of the item, either:
     * 
     * - `Active`: Available for use
     * - `Archived`: Unavailable
     * - `Unknown`
     * 
     * Due to a [limitation in Xero's API](https://docs.codat.io/integrations/accounting/xero/xero-faq#why-do-all-of-my-items-from-xero-have-their-status-as-unknown), all items from Xero are mapped as `Unknown`.
     */
    @JsonProperty("itemStatus")
    private ItemStatus itemStatus;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * Name of the item in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

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
     * Type of the item.
     */
    @JsonProperty("type")
    private ItemType type;

    @JsonCreator
    public AccountingItem(
            @JsonProperty("billItem") Optional<? extends BillItem> billItem,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("invoiceItem") Optional<? extends InvoiceItem> invoiceItem,
            @JsonProperty("isBillItem") boolean isBillItem,
            @JsonProperty("isInvoiceItem") boolean isInvoiceItem,
            @JsonProperty("itemStatus") ItemStatus itemStatus,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("type") ItemType type) {
        Utils.checkNotNull(billItem, "billItem");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(invoiceItem, "invoiceItem");
        Utils.checkNotNull(isBillItem, "isBillItem");
        Utils.checkNotNull(isInvoiceItem, "isInvoiceItem");
        Utils.checkNotNull(itemStatus, "itemStatus");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(supplementalData, "supplementalData");
        Utils.checkNotNull(type, "type");
        this.billItem = billItem;
        this.code = code;
        this.id = id;
        this.invoiceItem = invoiceItem;
        this.isBillItem = isBillItem;
        this.isInvoiceItem = isInvoiceItem;
        this.itemStatus = itemStatus;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.sourceModifiedDate = sourceModifiedDate;
        this.supplementalData = supplementalData;
        this.type = type;
    }
    
    public AccountingItem(
            boolean isBillItem,
            boolean isInvoiceItem,
            ItemStatus itemStatus,
            ItemType type) {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), isBillItem, isInvoiceItem, itemStatus, Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), type);
    }

    /**
     * Item details that are only for bills.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BillItem> billItem() {
        return (Optional<BillItem>) billItem;
    }

    /**
     * Friendly reference for the item.
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Identifier for the item that is unique to a company in the accounting software.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Item details that are only for bills.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvoiceItem> invoiceItem() {
        return (Optional<InvoiceItem>) invoiceItem;
    }

    /**
     * Whether you can use this item for bills.
     */
    @JsonIgnore
    public boolean isBillItem() {
        return isBillItem;
    }

    /**
     * Whether you can use this item for invoices.
     */
    @JsonIgnore
    public boolean isInvoiceItem() {
        return isInvoiceItem;
    }

    /**
     * Current state of the item, either:
     * 
     * - `Active`: Available for use
     * - `Archived`: Unavailable
     * - `Unknown`
     * 
     * Due to a [limitation in Xero's API](https://docs.codat.io/integrations/accounting/xero/xero-faq#why-do-all-of-my-items-from-xero-have-their-status-as-unknown), all items from Xero are mapped as `Unknown`.
     */
    @JsonIgnore
    public ItemStatus itemStatus() {
        return itemStatus;
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
     * Name of the item in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
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
     * Type of the item.
     */
    @JsonIgnore
    public ItemType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Item details that are only for bills.
     */
    public AccountingItem withBillItem(BillItem billItem) {
        Utils.checkNotNull(billItem, "billItem");
        this.billItem = Optional.ofNullable(billItem);
        return this;
    }

    /**
     * Item details that are only for bills.
     */
    public AccountingItem withBillItem(Optional<? extends BillItem> billItem) {
        Utils.checkNotNull(billItem, "billItem");
        this.billItem = billItem;
        return this;
    }

    /**
     * Friendly reference for the item.
     */
    public AccountingItem withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Friendly reference for the item.
     */
    public AccountingItem withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Identifier for the item that is unique to a company in the accounting software.
     */
    public AccountingItem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the item that is unique to a company in the accounting software.
     */
    public AccountingItem withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Item details that are only for bills.
     */
    public AccountingItem withInvoiceItem(InvoiceItem invoiceItem) {
        Utils.checkNotNull(invoiceItem, "invoiceItem");
        this.invoiceItem = Optional.ofNullable(invoiceItem);
        return this;
    }

    /**
     * Item details that are only for bills.
     */
    public AccountingItem withInvoiceItem(Optional<? extends InvoiceItem> invoiceItem) {
        Utils.checkNotNull(invoiceItem, "invoiceItem");
        this.invoiceItem = invoiceItem;
        return this;
    }

    /**
     * Whether you can use this item for bills.
     */
    public AccountingItem withIsBillItem(boolean isBillItem) {
        Utils.checkNotNull(isBillItem, "isBillItem");
        this.isBillItem = isBillItem;
        return this;
    }

    /**
     * Whether you can use this item for invoices.
     */
    public AccountingItem withIsInvoiceItem(boolean isInvoiceItem) {
        Utils.checkNotNull(isInvoiceItem, "isInvoiceItem");
        this.isInvoiceItem = isInvoiceItem;
        return this;
    }

    /**
     * Current state of the item, either:
     * 
     * - `Active`: Available for use
     * - `Archived`: Unavailable
     * - `Unknown`
     * 
     * Due to a [limitation in Xero's API](https://docs.codat.io/integrations/accounting/xero/xero-faq#why-do-all-of-my-items-from-xero-have-their-status-as-unknown), all items from Xero are mapped as `Unknown`.
     */
    public AccountingItem withItemStatus(ItemStatus itemStatus) {
        Utils.checkNotNull(itemStatus, "itemStatus");
        this.itemStatus = itemStatus;
        return this;
    }

    public AccountingItem withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AccountingItem withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountingItem withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public AccountingItem withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Name of the item in the accounting software.
     */
    public AccountingItem withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the item in the accounting software.
     */
    public AccountingItem withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public AccountingItem withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public AccountingItem withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingItem withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingItem withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Type of the item.
     */
    public AccountingItem withType(ItemType type) {
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
        AccountingItem other = (AccountingItem) o;
        return 
            Objects.deepEquals(this.billItem, other.billItem) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.invoiceItem, other.invoiceItem) &&
            Objects.deepEquals(this.isBillItem, other.isBillItem) &&
            Objects.deepEquals(this.isInvoiceItem, other.isInvoiceItem) &&
            Objects.deepEquals(this.itemStatus, other.itemStatus) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            billItem,
            code,
            id,
            invoiceItem,
            isBillItem,
            isInvoiceItem,
            itemStatus,
            metadata,
            modifiedDate,
            name,
            sourceModifiedDate,
            supplementalData,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingItem.class,
                "billItem", billItem,
                "code", code,
                "id", id,
                "invoiceItem", invoiceItem,
                "isBillItem", isBillItem,
                "isInvoiceItem", isInvoiceItem,
                "itemStatus", itemStatus,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "name", name,
                "sourceModifiedDate", sourceModifiedDate,
                "supplementalData", supplementalData,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends BillItem> billItem = Optional.empty();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends InvoiceItem> invoiceItem = Optional.empty();
 
        private Boolean isBillItem;
 
        private Boolean isInvoiceItem;
 
        private ItemStatus itemStatus;
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private ItemType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Item details that are only for bills.
         */
        public Builder billItem(BillItem billItem) {
            Utils.checkNotNull(billItem, "billItem");
            this.billItem = Optional.ofNullable(billItem);
            return this;
        }

        /**
         * Item details that are only for bills.
         */
        public Builder billItem(Optional<? extends BillItem> billItem) {
            Utils.checkNotNull(billItem, "billItem");
            this.billItem = billItem;
            return this;
        }

        /**
         * Friendly reference for the item.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Friendly reference for the item.
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Identifier for the item that is unique to a company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the item that is unique to a company in the accounting software.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Item details that are only for bills.
         */
        public Builder invoiceItem(InvoiceItem invoiceItem) {
            Utils.checkNotNull(invoiceItem, "invoiceItem");
            this.invoiceItem = Optional.ofNullable(invoiceItem);
            return this;
        }

        /**
         * Item details that are only for bills.
         */
        public Builder invoiceItem(Optional<? extends InvoiceItem> invoiceItem) {
            Utils.checkNotNull(invoiceItem, "invoiceItem");
            this.invoiceItem = invoiceItem;
            return this;
        }

        /**
         * Whether you can use this item for bills.
         */
        public Builder isBillItem(boolean isBillItem) {
            Utils.checkNotNull(isBillItem, "isBillItem");
            this.isBillItem = isBillItem;
            return this;
        }

        /**
         * Whether you can use this item for invoices.
         */
        public Builder isInvoiceItem(boolean isInvoiceItem) {
            Utils.checkNotNull(isInvoiceItem, "isInvoiceItem");
            this.isInvoiceItem = isInvoiceItem;
            return this;
        }

        /**
         * Current state of the item, either:
         * 
         * - `Active`: Available for use
         * - `Archived`: Unavailable
         * - `Unknown`
         * 
         * Due to a [limitation in Xero's API](https://docs.codat.io/integrations/accounting/xero/xero-faq#why-do-all-of-my-items-from-xero-have-their-status-as-unknown), all items from Xero are mapped as `Unknown`.
         */
        public Builder itemStatus(ItemStatus itemStatus) {
            Utils.checkNotNull(itemStatus, "itemStatus");
            this.itemStatus = itemStatus;
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
         * Name of the item in the accounting software.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the item in the accounting software.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
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
         * Type of the item.
         */
        public Builder type(ItemType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AccountingItem build() {
            return new AccountingItem(
                billItem,
                code,
                id,
                invoiceItem,
                isBillItem,
                isInvoiceItem,
                itemStatus,
                metadata,
                modifiedDate,
                name,
                sourceModifiedDate,
                supplementalData,
                type);
        }
    }
}

