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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * TrackingCategory - Details of a category used for tracking transactions.
 * 
 * &gt; Language tip
 * &gt;
 * &gt; Parameters used to track types of spend in various parts of an organization can be called  **dimensions**, **projects**, **classes**, or **locations** in different accounting software. In Codat, we refer to these as tracking categories.
 * 
 * View the coverage for tracking categories in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=trackingCategories" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * Tracking categories are used to monitor cost centres and control budgets that sit outside the standard chart of accounts. Customers may use tracking categories to group together and track the income and costs of specific departments, projects, locations or customers.
 * 
 * From their accounting system, customers can: 
 * 
 * - Create and maintain tracking categories and tracking category types.
 * - View all tracking categories that are available for use.
 * - View the relationships between the categories.
 * - Assign invoices, bills, credit notes, or bill credit notes to one or more categories.
 * - View the categories that a transaction belongs to.
 * - View all transactions in a tracking category.
 * 
 * ### Tracking categories per platform
 * 
 * Review the platform-specific tracking categories that Codat supports, and the level they are assigned to in the source platform. 
 * 
 * &lt;table&gt;
 * &lt;thead&gt;
 *   &lt;tr&gt;
 *     &lt;th&gt;Platform&lt;/th&gt;
 *     &lt;th&gt;Tracking category&lt;/th&gt;
 *     &lt;th&gt;Tracking level&lt;/th&gt;
 *   &lt;/tr&gt;
 * &lt;/thead&gt;
 * &lt;tbody&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;&lt;b&gt;Dynamics 365&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Dimensions&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;&lt;b&gt;Freshbooks&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Expense&amp;nbsp;categories&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;&lt;b&gt;MYOB&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Categories&lt;/td&gt;
 *     &lt;td&gt;Transaction&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td rowspan=4&gt;&lt;b&gt;Netsuite&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Classes&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Locations&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Departments&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Custom&amp;nbsp;segments&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td rowspan=2&gt;&lt;b&gt;QuickBooks Desktop&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Classes&lt;/td&gt;
 *     &lt;td&gt;Line item or transaction level&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Locations&lt;/td&gt;
 *     &lt;td&gt;Transaction&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td rowspan=2&gt;&lt;b&gt;QuickBooks Online&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Classes&lt;/td&gt;
 *     &lt;td&gt;Line item or transaction level&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Locations&lt;/td&gt;
 *     &lt;td&gt;Transaction&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td rowspan=3&gt;&lt;b&gt;Sage 200&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Cost&amp;nbsp;centers&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *       &lt;td&gt;Departments&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Analysis&amp;nbsp;codes&lt;/td&gt;
 *     &lt;td&gt;Transaction&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td rowspan=3&gt;&lt;b&gt;Sage 50&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Departments&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *      &lt;td&gt;Costcodes&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;Projects&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;&lt;b&gt;Sage Intacct&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Dimensions&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 *   &lt;tr&gt;
 *     &lt;td&gt;&lt;b&gt;Xero&lt;/b&gt;&lt;/td&gt;
 *     &lt;td&gt;Tracking&amp;nbsp;categories&lt;/td&gt;
 *     &lt;td&gt;Line item&lt;/td&gt;
 *   &lt;/tr&gt;
 * &lt;/tbody&gt;
 * &lt;/table&gt;
 * 
 * &gt; **Example use case**
 * &gt;
 * &gt; Monitor the budget for your annual conference using a tracking category called 'AnnualConference2020' with the **type** set to **Costing**.
 * 
 * If a tracking category has a parent category, the ID of that parent category is displayed. There is also a `hasChildren` field that shows whether there are child subcategories nested beneath. 
 */

public class TrackingCategory {

    /**
     * Boolean value indicating whether this category has SubCategories.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasChildren")
    private Optional<Boolean> hasChildren;

    /**
     * The identifier for the item, unique per tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * The name of the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The identifier for this item's immediate parent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentId")
    private JsonNullable<String> parentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Current state of the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends Status> status;

    @JsonCreator
    public TrackingCategory(
            @JsonProperty("hasChildren") Optional<Boolean> hasChildren,
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("parentId") JsonNullable<String> parentId,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("status") Optional<? extends Status> status) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(status, "status");
        this.hasChildren = hasChildren;
        this.id = id;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.parentId = parentId;
        this.sourceModifiedDate = sourceModifiedDate;
        this.status = status;
    }
    
    public TrackingCategory() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * Boolean value indicating whether this category has SubCategories.
     */
    @JsonIgnore
    public Optional<Boolean> hasChildren() {
        return hasChildren;
    }

    /**
     * The identifier for the item, unique per tracking category.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
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

    /**
     * The name of the tracking category.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The identifier for this item's immediate parent.
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
     * Current state of the tracking category.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Status> status() {
        return (Optional<Status>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Boolean value indicating whether this category has SubCategories.
     */
    public TrackingCategory withHasChildren(boolean hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = Optional.ofNullable(hasChildren);
        return this;
    }

    /**
     * Boolean value indicating whether this category has SubCategories.
     */
    public TrackingCategory withHasChildren(Optional<Boolean> hasChildren) {
        Utils.checkNotNull(hasChildren, "hasChildren");
        this.hasChildren = hasChildren;
        return this;
    }

    /**
     * The identifier for the item, unique per tracking category.
     */
    public TrackingCategory withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The identifier for the item, unique per tracking category.
     */
    public TrackingCategory withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TrackingCategory withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public TrackingCategory withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public TrackingCategory withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public TrackingCategory withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public TrackingCategory withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public TrackingCategory withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The identifier for this item's immediate parent.
     */
    public TrackingCategory withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * The identifier for this item's immediate parent.
     */
    public TrackingCategory withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    public TrackingCategory withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public TrackingCategory withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Current state of the tracking category.
     */
    public TrackingCategory withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Current state of the tracking category.
     */
    public TrackingCategory withStatus(Optional<? extends Status> status) {
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
        TrackingCategory other = (TrackingCategory) o;
        return 
            Objects.deepEquals(this.hasChildren, other.hasChildren) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hasChildren,
            id,
            metadata,
            modifiedDate,
            name,
            parentId,
            sourceModifiedDate,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TrackingCategory.class,
                "hasChildren", hasChildren,
                "id", id,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "name", name,
                "parentId", parentId,
                "sourceModifiedDate", sourceModifiedDate,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> hasChildren = Optional.empty();
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> parentId = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private Optional<? extends Status> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Boolean value indicating whether this category has SubCategories.
         */
        public Builder hasChildren(boolean hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = Optional.ofNullable(hasChildren);
            return this;
        }

        /**
         * Boolean value indicating whether this category has SubCategories.
         */
        public Builder hasChildren(Optional<Boolean> hasChildren) {
            Utils.checkNotNull(hasChildren, "hasChildren");
            this.hasChildren = hasChildren;
            return this;
        }

        /**
         * The identifier for the item, unique per tracking category.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * The identifier for the item, unique per tracking category.
         */
        public Builder id(JsonNullable<String> id) {
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

        /**
         * The name of the tracking category.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the tracking category.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The identifier for this item's immediate parent.
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * The identifier for this item's immediate parent.
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
         * Current state of the tracking category.
         */
        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Current state of the tracking category.
         */
        public Builder status(Optional<? extends Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public TrackingCategory build() {
            return new TrackingCategory(
                hasChildren,
                id,
                metadata,
                modifiedDate,
                name,
                parentId,
                sourceModifiedDate,
                status);
        }
    }
}

