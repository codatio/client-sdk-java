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
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreditNoteLineItem {

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountRef> accountRef;

    /**
     * Friendly name of each line item. For example, the goods or service for which credit has been issued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Value of any discounts applied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountAmount")
    private JsonNullable<? extends BigDecimal> discountAmount;

    /**
     * Percentage rate of any discount applied to the line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountPercentage")
    private JsonNullable<? extends BigDecimal> discountPercentage;

    /**
     * The credit note is a direct income if `True`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isDirectIncome")
    private Optional<Boolean> isDirectIncome;

    /**
     * Reference to the item the line is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemRef")
    private Optional<? extends PropertieItemRef> itemRef;

    /**
     * Number of units of the goods or service for which credit has been issued.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Amount of credit associated with the line item, including discounts but excluding tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subTotal")
    private JsonNullable<? extends BigDecimal> subTotal;

    /**
     * Amount of tax associated with the line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxAmount")
    private JsonNullable<? extends BigDecimal> taxAmount;

    /**
     * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
     * 
     * Found on:
     * 
     * - Bill line items
     * - Bill Credit Note line items
     * - Credit Note line items
     * - Direct incomes line items
     * - Invoice line items
     * - Items
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRateRef")
    private Optional<? extends TaxRateRef> taxRateRef;

    /**
     * Total amount of the line item, including discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private JsonNullable<? extends BigDecimal> totalAmount;

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking")
    private Optional<? extends AccountsReceivableTracking> tracking;

    /**
     * Reference to the tracking categories to which the line item is linked.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trackingCategoryRefs")
    @Deprecated
    private JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs;

    /**
     * Unit price of the goods or service.
     */
    @JsonProperty("unitAmount")
    private BigDecimal unitAmount;

    @JsonCreator
    public CreditNoteLineItem(
            @JsonProperty("accountRef") Optional<? extends AccountRef> accountRef,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("discountAmount") JsonNullable<? extends BigDecimal> discountAmount,
            @JsonProperty("discountPercentage") JsonNullable<? extends BigDecimal> discountPercentage,
            @JsonProperty("isDirectIncome") Optional<Boolean> isDirectIncome,
            @JsonProperty("itemRef") Optional<? extends PropertieItemRef> itemRef,
            @JsonProperty("quantity") BigDecimal quantity,
            @JsonProperty("subTotal") JsonNullable<? extends BigDecimal> subTotal,
            @JsonProperty("taxAmount") JsonNullable<? extends BigDecimal> taxAmount,
            @JsonProperty("taxRateRef") Optional<? extends TaxRateRef> taxRateRef,
            @JsonProperty("totalAmount") JsonNullable<? extends BigDecimal> totalAmount,
            @JsonProperty("tracking") Optional<? extends AccountsReceivableTracking> tracking,
            @JsonProperty("trackingCategoryRefs") JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs,
            @JsonProperty("unitAmount") BigDecimal unitAmount) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(discountAmount, "discountAmount");
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        Utils.checkNotNull(isDirectIncome, "isDirectIncome");
        Utils.checkNotNull(itemRef, "itemRef");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(subTotal, "subTotal");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(tracking, "tracking");
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.accountRef = accountRef;
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountPercentage = discountPercentage;
        this.isDirectIncome = isDirectIncome;
        this.itemRef = itemRef;
        this.quantity = quantity;
        this.subTotal = subTotal;
        this.taxAmount = taxAmount;
        this.taxRateRef = taxRateRef;
        this.totalAmount = totalAmount;
        this.tracking = tracking;
        this.trackingCategoryRefs = trackingCategoryRefs;
        this.unitAmount = unitAmount;
    }
    
    public CreditNoteLineItem(
            BigDecimal quantity,
            BigDecimal unitAmount) {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), quantity, JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), unitAmount);
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountRef> accountRef() {
        return (Optional<AccountRef>) accountRef;
    }

    /**
     * Friendly name of each line item. For example, the goods or service for which credit has been issued.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Value of any discounts applied.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> discountAmount() {
        return (JsonNullable<BigDecimal>) discountAmount;
    }

    /**
     * Percentage rate of any discount applied to the line item.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> discountPercentage() {
        return (JsonNullable<BigDecimal>) discountPercentage;
    }

    /**
     * The credit note is a direct income if `True`.
     */
    @JsonIgnore
    public Optional<Boolean> isDirectIncome() {
        return isDirectIncome;
    }

    /**
     * Reference to the item the line is linked to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertieItemRef> itemRef() {
        return (Optional<PropertieItemRef>) itemRef;
    }

    /**
     * Number of units of the goods or service for which credit has been issued.
     */
    @JsonIgnore
    public BigDecimal quantity() {
        return quantity;
    }

    /**
     * Amount of credit associated with the line item, including discounts but excluding tax.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> subTotal() {
        return (JsonNullable<BigDecimal>) subTotal;
    }

    /**
     * Amount of tax associated with the line item.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> taxAmount() {
        return (JsonNullable<BigDecimal>) taxAmount;
    }

    /**
     * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
     * 
     * Found on:
     * 
     * - Bill line items
     * - Bill Credit Note line items
     * - Credit Note line items
     * - Direct incomes line items
     * - Invoice line items
     * - Items
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxRateRef> taxRateRef() {
        return (Optional<TaxRateRef>) taxRateRef;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> totalAmount() {
        return (JsonNullable<BigDecimal>) totalAmount;
    }

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountsReceivableTracking> tracking() {
        return (Optional<AccountsReceivableTracking>) tracking;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TrackingCategoryRef>> trackingCategoryRefs() {
        return (JsonNullable<List<TrackingCategoryRef>>) trackingCategoryRefs;
    }

    /**
     * Unit price of the goods or service.
     */
    @JsonIgnore
    public BigDecimal unitAmount() {
        return unitAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public CreditNoteLineItem withAccountRef(AccountRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public CreditNoteLineItem withAccountRef(Optional<? extends AccountRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Friendly name of each line item. For example, the goods or service for which credit has been issued.
     */
    public CreditNoteLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Friendly name of each line item. For example, the goods or service for which credit has been issued.
     */
    public CreditNoteLineItem withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Value of any discounts applied.
     */
    public CreditNoteLineItem withDiscountAmount(BigDecimal discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = JsonNullable.of(discountAmount);
        return this;
    }

        /**
         * Value of any discounts applied.
         */
    public CreditNoteLineItem withDiscountAmount(double discountAmount) {
        this.discountAmount = JsonNullable.of(BigDecimal.valueOf(discountAmount));
        return this;
    }

    /**
     * Value of any discounts applied.
     */
    public CreditNoteLineItem withDiscountAmount(JsonNullable<? extends BigDecimal> discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Percentage rate of any discount applied to the line item.
     */
    public CreditNoteLineItem withDiscountPercentage(BigDecimal discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = JsonNullable.of(discountPercentage);
        return this;
    }

        /**
         * Percentage rate of any discount applied to the line item.
         */
    public CreditNoteLineItem withDiscountPercentage(double discountPercentage) {
        this.discountPercentage = JsonNullable.of(BigDecimal.valueOf(discountPercentage));
        return this;
    }

    /**
     * Percentage rate of any discount applied to the line item.
     */
    public CreditNoteLineItem withDiscountPercentage(JsonNullable<? extends BigDecimal> discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = discountPercentage;
        return this;
    }

    /**
     * The credit note is a direct income if `True`.
     */
    public CreditNoteLineItem withIsDirectIncome(boolean isDirectIncome) {
        Utils.checkNotNull(isDirectIncome, "isDirectIncome");
        this.isDirectIncome = Optional.ofNullable(isDirectIncome);
        return this;
    }

    /**
     * The credit note is a direct income if `True`.
     */
    public CreditNoteLineItem withIsDirectIncome(Optional<Boolean> isDirectIncome) {
        Utils.checkNotNull(isDirectIncome, "isDirectIncome");
        this.isDirectIncome = isDirectIncome;
        return this;
    }

    /**
     * Reference to the item the line is linked to.
     */
    public CreditNoteLineItem withItemRef(PropertieItemRef itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = Optional.ofNullable(itemRef);
        return this;
    }

    /**
     * Reference to the item the line is linked to.
     */
    public CreditNoteLineItem withItemRef(Optional<? extends PropertieItemRef> itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = itemRef;
        return this;
    }

        /**
         * Number of units of the goods or service for which credit has been issued.
         */
    public CreditNoteLineItem withQuantity(double quantity) {
        this.quantity = BigDecimal.valueOf(quantity);
        return this;
    }

    /**
     * Number of units of the goods or service for which credit has been issued.
     */
    public CreditNoteLineItem withQuantity(BigDecimal quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Amount of credit associated with the line item, including discounts but excluding tax.
     */
    public CreditNoteLineItem withSubTotal(BigDecimal subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = JsonNullable.of(subTotal);
        return this;
    }

        /**
         * Amount of credit associated with the line item, including discounts but excluding tax.
         */
    public CreditNoteLineItem withSubTotal(double subTotal) {
        this.subTotal = JsonNullable.of(BigDecimal.valueOf(subTotal));
        return this;
    }

    /**
     * Amount of credit associated with the line item, including discounts but excluding tax.
     */
    public CreditNoteLineItem withSubTotal(JsonNullable<? extends BigDecimal> subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Amount of tax associated with the line item.
     */
    public CreditNoteLineItem withTaxAmount(BigDecimal taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = JsonNullable.of(taxAmount);
        return this;
    }

        /**
         * Amount of tax associated with the line item.
         */
    public CreditNoteLineItem withTaxAmount(double taxAmount) {
        this.taxAmount = JsonNullable.of(BigDecimal.valueOf(taxAmount));
        return this;
    }

    /**
     * Amount of tax associated with the line item.
     */
    public CreditNoteLineItem withTaxAmount(JsonNullable<? extends BigDecimal> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
     * 
     * Found on:
     * 
     * - Bill line items
     * - Bill Credit Note line items
     * - Credit Note line items
     * - Direct incomes line items
     * - Invoice line items
     * - Items
     */
    public CreditNoteLineItem withTaxRateRef(TaxRateRef taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = Optional.ofNullable(taxRateRef);
        return this;
    }

    /**
     * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
     * 
     * Found on:
     * 
     * - Bill line items
     * - Bill Credit Note line items
     * - Credit Note line items
     * - Direct incomes line items
     * - Invoice line items
     * - Items
     */
    public CreditNoteLineItem withTaxRateRef(Optional<? extends TaxRateRef> taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = taxRateRef;
        return this;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public CreditNoteLineItem withTotalAmount(BigDecimal totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

        /**
         * Total amount of the line item, including discounts and tax.
         */
    public CreditNoteLineItem withTotalAmount(double totalAmount) {
        this.totalAmount = JsonNullable.of(BigDecimal.valueOf(totalAmount));
        return this;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public CreditNoteLineItem withTotalAmount(JsonNullable<? extends BigDecimal> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    public CreditNoteLineItem withTracking(AccountsReceivableTracking tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = Optional.ofNullable(tracking);
        return this;
    }

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    public CreditNoteLineItem withTracking(Optional<? extends AccountsReceivableTracking> tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = tracking;
        return this;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreditNoteLineItem withTrackingCategoryRefs(List<TrackingCategoryRef> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
        return this;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreditNoteLineItem withTrackingCategoryRefs(JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = trackingCategoryRefs;
        return this;
    }

        /**
         * Unit price of the goods or service.
         */
    public CreditNoteLineItem withUnitAmount(double unitAmount) {
        this.unitAmount = BigDecimal.valueOf(unitAmount);
        return this;
    }

    /**
     * Unit price of the goods or service.
     */
    public CreditNoteLineItem withUnitAmount(BigDecimal unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = unitAmount;
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
        CreditNoteLineItem other = (CreditNoteLineItem) o;
        return 
            Objects.deepEquals(this.accountRef, other.accountRef) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.discountAmount, other.discountAmount) &&
            Objects.deepEquals(this.discountPercentage, other.discountPercentage) &&
            Objects.deepEquals(this.isDirectIncome, other.isDirectIncome) &&
            Objects.deepEquals(this.itemRef, other.itemRef) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.subTotal, other.subTotal) &&
            Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            Objects.deepEquals(this.taxRateRef, other.taxRateRef) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.tracking, other.tracking) &&
            Objects.deepEquals(this.trackingCategoryRefs, other.trackingCategoryRefs) &&
            Objects.deepEquals(this.unitAmount, other.unitAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountRef,
            description,
            discountAmount,
            discountPercentage,
            isDirectIncome,
            itemRef,
            quantity,
            subTotal,
            taxAmount,
            taxRateRef,
            totalAmount,
            tracking,
            trackingCategoryRefs,
            unitAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreditNoteLineItem.class,
                "accountRef", accountRef,
                "description", description,
                "discountAmount", discountAmount,
                "discountPercentage", discountPercentage,
                "isDirectIncome", isDirectIncome,
                "itemRef", itemRef,
                "quantity", quantity,
                "subTotal", subTotal,
                "taxAmount", taxAmount,
                "taxRateRef", taxRateRef,
                "totalAmount", totalAmount,
                "tracking", tracking,
                "trackingCategoryRefs", trackingCategoryRefs,
                "unitAmount", unitAmount);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountRef> accountRef = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends BigDecimal> discountAmount = JsonNullable.undefined();
 
        private JsonNullable<? extends BigDecimal> discountPercentage = JsonNullable.undefined();
 
        private Optional<Boolean> isDirectIncome = Optional.empty();
 
        private Optional<? extends PropertieItemRef> itemRef = Optional.empty();
 
        private BigDecimal quantity;
 
        private JsonNullable<? extends BigDecimal> subTotal = JsonNullable.undefined();
 
        private JsonNullable<? extends BigDecimal> taxAmount = JsonNullable.undefined();
 
        private Optional<? extends TaxRateRef> taxRateRef = Optional.empty();
 
        private JsonNullable<? extends BigDecimal> totalAmount = JsonNullable.undefined();
 
        private Optional<? extends AccountsReceivableTracking> tracking = Optional.empty();
 
        @Deprecated
        private JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs = JsonNullable.undefined();
 
        private BigDecimal unitAmount;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
         */
        public Builder accountRef(AccountRef accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = Optional.ofNullable(accountRef);
            return this;
        }

        /**
         * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
         */
        public Builder accountRef(Optional<? extends AccountRef> accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = accountRef;
            return this;
        }

        /**
         * Friendly name of each line item. For example, the goods or service for which credit has been issued.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Friendly name of each line item. For example, the goods or service for which credit has been issued.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Value of any discounts applied.
         */
        public Builder discountAmount(BigDecimal discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = JsonNullable.of(discountAmount);
            return this;
        }

        /**
         * Value of any discounts applied.
         */
        public Builder discountAmount(double discountAmount) {
            this.discountAmount = JsonNullable.of(BigDecimal.valueOf(discountAmount));
            return this;
        }

        /**
         * Value of any discounts applied.
         */
        public Builder discountAmount(JsonNullable<? extends BigDecimal> discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Percentage rate of any discount applied to the line item.
         */
        public Builder discountPercentage(BigDecimal discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = JsonNullable.of(discountPercentage);
            return this;
        }

        /**
         * Percentage rate of any discount applied to the line item.
         */
        public Builder discountPercentage(double discountPercentage) {
            this.discountPercentage = JsonNullable.of(BigDecimal.valueOf(discountPercentage));
            return this;
        }

        /**
         * Percentage rate of any discount applied to the line item.
         */
        public Builder discountPercentage(JsonNullable<? extends BigDecimal> discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = discountPercentage;
            return this;
        }

        /**
         * The credit note is a direct income if `True`.
         */
        public Builder isDirectIncome(boolean isDirectIncome) {
            Utils.checkNotNull(isDirectIncome, "isDirectIncome");
            this.isDirectIncome = Optional.ofNullable(isDirectIncome);
            return this;
        }

        /**
         * The credit note is a direct income if `True`.
         */
        public Builder isDirectIncome(Optional<Boolean> isDirectIncome) {
            Utils.checkNotNull(isDirectIncome, "isDirectIncome");
            this.isDirectIncome = isDirectIncome;
            return this;
        }

        /**
         * Reference to the item the line is linked to.
         */
        public Builder itemRef(PropertieItemRef itemRef) {
            Utils.checkNotNull(itemRef, "itemRef");
            this.itemRef = Optional.ofNullable(itemRef);
            return this;
        }

        /**
         * Reference to the item the line is linked to.
         */
        public Builder itemRef(Optional<? extends PropertieItemRef> itemRef) {
            Utils.checkNotNull(itemRef, "itemRef");
            this.itemRef = itemRef;
            return this;
        }

        /**
         * Number of units of the goods or service for which credit has been issued.
         */
        public Builder quantity(double quantity) {
            this.quantity = BigDecimal.valueOf(quantity);
            return this;
        }

        /**
         * Number of units of the goods or service for which credit has been issued.
         */
        public Builder quantity(BigDecimal quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        /**
         * Amount of credit associated with the line item, including discounts but excluding tax.
         */
        public Builder subTotal(BigDecimal subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = JsonNullable.of(subTotal);
            return this;
        }

        /**
         * Amount of credit associated with the line item, including discounts but excluding tax.
         */
        public Builder subTotal(double subTotal) {
            this.subTotal = JsonNullable.of(BigDecimal.valueOf(subTotal));
            return this;
        }

        /**
         * Amount of credit associated with the line item, including discounts but excluding tax.
         */
        public Builder subTotal(JsonNullable<? extends BigDecimal> subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = subTotal;
            return this;
        }

        /**
         * Amount of tax associated with the line item.
         */
        public Builder taxAmount(BigDecimal taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = JsonNullable.of(taxAmount);
            return this;
        }

        /**
         * Amount of tax associated with the line item.
         */
        public Builder taxAmount(double taxAmount) {
            this.taxAmount = JsonNullable.of(BigDecimal.valueOf(taxAmount));
            return this;
        }

        /**
         * Amount of tax associated with the line item.
         */
        public Builder taxAmount(JsonNullable<? extends BigDecimal> taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
         * 
         * Found on:
         * 
         * - Bill line items
         * - Bill Credit Note line items
         * - Credit Note line items
         * - Direct incomes line items
         * - Invoice line items
         * - Items
         */
        public Builder taxRateRef(TaxRateRef taxRateRef) {
            Utils.checkNotNull(taxRateRef, "taxRateRef");
            this.taxRateRef = Optional.ofNullable(taxRateRef);
            return this;
        }

        /**
         * Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.
         * 
         * Found on:
         * 
         * - Bill line items
         * - Bill Credit Note line items
         * - Credit Note line items
         * - Direct incomes line items
         * - Invoice line items
         * - Items
         */
        public Builder taxRateRef(Optional<? extends TaxRateRef> taxRateRef) {
            Utils.checkNotNull(taxRateRef, "taxRateRef");
            this.taxRateRef = taxRateRef;
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(BigDecimal totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(double totalAmount) {
            this.totalAmount = JsonNullable.of(BigDecimal.valueOf(totalAmount));
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(JsonNullable<? extends BigDecimal> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Categories, and a project and customer, against which the item is tracked.
         */
        public Builder tracking(AccountsReceivableTracking tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = Optional.ofNullable(tracking);
            return this;
        }

        /**
         * Categories, and a project and customer, against which the item is tracked.
         */
        public Builder tracking(Optional<? extends AccountsReceivableTracking> tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = tracking;
            return this;
        }

        /**
         * Reference to the tracking categories to which the line item is linked.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder trackingCategoryRefs(List<TrackingCategoryRef> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
            return this;
        }

        /**
         * Reference to the tracking categories to which the line item is linked.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder trackingCategoryRefs(JsonNullable<? extends List<TrackingCategoryRef>> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = trackingCategoryRefs;
            return this;
        }

        /**
         * Unit price of the goods or service.
         */
        public Builder unitAmount(double unitAmount) {
            this.unitAmount = BigDecimal.valueOf(unitAmount);
            return this;
        }

        /**
         * Unit price of the goods or service.
         */
        public Builder unitAmount(BigDecimal unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }
        
        public CreditNoteLineItem build() {
            return new CreditNoteLineItem(
                accountRef,
                description,
                discountAmount,
                discountPercentage,
                isDirectIncome,
                itemRef,
                quantity,
                subTotal,
                taxAmount,
                taxRateRef,
                totalAmount,
                tracking,
                trackingCategoryRefs,
                unitAmount);
        }
    }
}

