/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class InvoiceLineItem {

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountRef> accountRef;

    /**
     * Friendly name of the goods or services provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Numerical value of any discounts applied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountAmount")
    private JsonNullable<? extends Double> discountAmount;

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountPercentage")
    private JsonNullable<? extends Double> discountPercentage;

    /**
     * The invoice is a direct income if `True`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isDirectIncome")
    private Optional<? extends Boolean> isDirectIncome;

    /**
     * Reference to the item the line is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemRef")
    private Optional<? extends PropertieItemRef> itemRef;

    /**
     * Number of units of goods or services provided.
     */
    @JsonProperty("quantity")
    private double quantity;

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subTotal")
    private JsonNullable<? extends Double> subTotal;

    /**
     * Amount of tax for the line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxAmount")
    private JsonNullable<? extends Double> taxAmount;

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
     * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private JsonNullable<? extends Double> totalAmount;

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking")
    private Optional<? extends AccountsReceivableTracking> tracking;

    /**
     * Reference to the tracking categories to which the line item is linked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trackingCategoryRefs")
    private JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs;

    /**
     * Price of each unit of goods or services.
     */
    @JsonProperty("unitAmount")
    private double unitAmount;

    public InvoiceLineItem(
            @JsonProperty("accountRef") Optional<? extends AccountRef> accountRef,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("discountAmount") JsonNullable<? extends Double> discountAmount,
            @JsonProperty("discountPercentage") JsonNullable<? extends Double> discountPercentage,
            @JsonProperty("isDirectIncome") Optional<? extends Boolean> isDirectIncome,
            @JsonProperty("itemRef") Optional<? extends PropertieItemRef> itemRef,
            @JsonProperty("quantity") double quantity,
            @JsonProperty("subTotal") JsonNullable<? extends Double> subTotal,
            @JsonProperty("taxAmount") JsonNullable<? extends Double> taxAmount,
            @JsonProperty("taxRateRef") Optional<? extends TaxRateRef> taxRateRef,
            @JsonProperty("totalAmount") JsonNullable<? extends Double> totalAmount,
            @JsonProperty("tracking") Optional<? extends AccountsReceivableTracking> tracking,
            @JsonProperty("trackingCategoryRefs") JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs,
            @JsonProperty("unitAmount") double unitAmount) {
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

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public Optional<? extends AccountRef> accountRef() {
        return accountRef;
    }

    /**
     * Friendly name of the goods or services provided.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Numerical value of any discounts applied.
     */
    public JsonNullable<? extends Double> discountAmount() {
        return discountAmount;
    }

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public JsonNullable<? extends Double> discountPercentage() {
        return discountPercentage;
    }

    /**
     * The invoice is a direct income if `True`.
     */
    public Optional<? extends Boolean> isDirectIncome() {
        return isDirectIncome;
    }

    /**
     * Reference to the item the line is linked to.
     */
    public Optional<? extends PropertieItemRef> itemRef() {
        return itemRef;
    }

    /**
     * Number of units of goods or services provided.
     */
    public double quantity() {
        return quantity;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public JsonNullable<? extends Double> subTotal() {
        return subTotal;
    }

    /**
     * Amount of tax for the line.
     */
    public JsonNullable<? extends Double> taxAmount() {
        return taxAmount;
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
    public Optional<? extends TaxRateRef> taxRateRef() {
        return taxRateRef;
    }

    /**
     * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
     */
    public JsonNullable<? extends Double> totalAmount() {
        return totalAmount;
    }

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    public Optional<? extends AccountsReceivableTracking> tracking() {
        return tracking;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     */
    public JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs() {
        return trackingCategoryRefs;
    }

    /**
     * Price of each unit of goods or services.
     */
    public double unitAmount() {
        return unitAmount;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public InvoiceLineItem withAccountRef(AccountRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }
    
    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public InvoiceLineItem withAccountRef(Optional<? extends AccountRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Friendly name of the goods or services provided.
     */
    public InvoiceLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Friendly name of the goods or services provided.
     */
    public InvoiceLineItem withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Numerical value of any discounts applied.
     */
    public InvoiceLineItem withDiscountAmount(double discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = JsonNullable.of(discountAmount);
        return this;
    }

    /**
     * Numerical value of any discounts applied.
     */
    public InvoiceLineItem withDiscountAmount(JsonNullable<? extends Double> discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public InvoiceLineItem withDiscountPercentage(double discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = JsonNullable.of(discountPercentage);
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public InvoiceLineItem withDiscountPercentage(JsonNullable<? extends Double> discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = discountPercentage;
        return this;
    }

    /**
     * The invoice is a direct income if `True`.
     */
    public InvoiceLineItem withIsDirectIncome(boolean isDirectIncome) {
        Utils.checkNotNull(isDirectIncome, "isDirectIncome");
        this.isDirectIncome = Optional.ofNullable(isDirectIncome);
        return this;
    }
    
    /**
     * The invoice is a direct income if `True`.
     */
    public InvoiceLineItem withIsDirectIncome(Optional<? extends Boolean> isDirectIncome) {
        Utils.checkNotNull(isDirectIncome, "isDirectIncome");
        this.isDirectIncome = isDirectIncome;
        return this;
    }

    /**
     * Reference to the item the line is linked to.
     */
    public InvoiceLineItem withItemRef(PropertieItemRef itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = Optional.ofNullable(itemRef);
        return this;
    }
    
    /**
     * Reference to the item the line is linked to.
     */
    public InvoiceLineItem withItemRef(Optional<? extends PropertieItemRef> itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = itemRef;
        return this;
    }

    /**
     * Number of units of goods or services provided.
     */
    public InvoiceLineItem withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public InvoiceLineItem withSubTotal(double subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = JsonNullable.of(subTotal);
        return this;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public InvoiceLineItem withSubTotal(JsonNullable<? extends Double> subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Amount of tax for the line.
     */
    public InvoiceLineItem withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = JsonNullable.of(taxAmount);
        return this;
    }

    /**
     * Amount of tax for the line.
     */
    public InvoiceLineItem withTaxAmount(JsonNullable<? extends Double> taxAmount) {
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
    public InvoiceLineItem withTaxRateRef(TaxRateRef taxRateRef) {
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
    public InvoiceLineItem withTaxRateRef(Optional<? extends TaxRateRef> taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = taxRateRef;
        return this;
    }

    /**
     * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
     */
    public InvoiceLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    /**
     * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
     */
    public InvoiceLineItem withTotalAmount(JsonNullable<? extends Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    public InvoiceLineItem withTracking(AccountsReceivableTracking tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = Optional.ofNullable(tracking);
        return this;
    }
    
    /**
     * Categories, and a project and customer, against which the item is tracked.
     */
    public InvoiceLineItem withTracking(Optional<? extends AccountsReceivableTracking> tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = tracking;
        return this;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     */
    public InvoiceLineItem withTrackingCategoryRefs(java.util.List<TrackingCategoryRef> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
        return this;
    }

    /**
     * Reference to the tracking categories to which the line item is linked.
     */
    public InvoiceLineItem withTrackingCategoryRefs(JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs) {
        Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
        this.trackingCategoryRefs = trackingCategoryRefs;
        return this;
    }

    /**
     * Price of each unit of goods or services.
     */
    public InvoiceLineItem withUnitAmount(double unitAmount) {
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
        InvoiceLineItem other = (InvoiceLineItem) o;
        return 
            java.util.Objects.deepEquals(this.accountRef, other.accountRef) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.discountAmount, other.discountAmount) &&
            java.util.Objects.deepEquals(this.discountPercentage, other.discountPercentage) &&
            java.util.Objects.deepEquals(this.isDirectIncome, other.isDirectIncome) &&
            java.util.Objects.deepEquals(this.itemRef, other.itemRef) &&
            java.util.Objects.deepEquals(this.quantity, other.quantity) &&
            java.util.Objects.deepEquals(this.subTotal, other.subTotal) &&
            java.util.Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            java.util.Objects.deepEquals(this.taxRateRef, other.taxRateRef) &&
            java.util.Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            java.util.Objects.deepEquals(this.tracking, other.tracking) &&
            java.util.Objects.deepEquals(this.trackingCategoryRefs, other.trackingCategoryRefs) &&
            java.util.Objects.deepEquals(this.unitAmount, other.unitAmount);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(InvoiceLineItem.class,
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
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends Double> discountAmount = JsonNullable.undefined();
 
        private JsonNullable<? extends Double> discountPercentage = JsonNullable.undefined();
 
        private Optional<? extends Boolean> isDirectIncome = Optional.empty();
 
        private Optional<? extends PropertieItemRef> itemRef = Optional.empty();
 
        private Double quantity;
 
        private JsonNullable<? extends Double> subTotal = JsonNullable.undefined();
 
        private JsonNullable<? extends Double> taxAmount = JsonNullable.undefined();
 
        private Optional<? extends TaxRateRef> taxRateRef = Optional.empty();
 
        private JsonNullable<? extends Double> totalAmount = JsonNullable.undefined();
 
        private Optional<? extends AccountsReceivableTracking> tracking = Optional.empty();
 
        private JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs = JsonNullable.undefined();
 
        private Double unitAmount;  
        
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
         * Friendly name of the goods or services provided.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Friendly name of the goods or services provided.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Numerical value of any discounts applied.
         */
        public Builder discountAmount(double discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = JsonNullable.of(discountAmount);
            return this;
        }

        /**
         * Numerical value of any discounts applied.
         */
        public Builder discountAmount(JsonNullable<? extends Double> discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
         */
        public Builder discountPercentage(double discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = JsonNullable.of(discountPercentage);
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
         */
        public Builder discountPercentage(JsonNullable<? extends Double> discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = discountPercentage;
            return this;
        }

        /**
         * The invoice is a direct income if `True`.
         */
        public Builder isDirectIncome(boolean isDirectIncome) {
            Utils.checkNotNull(isDirectIncome, "isDirectIncome");
            this.isDirectIncome = Optional.ofNullable(isDirectIncome);
            return this;
        }
        
        /**
         * The invoice is a direct income if `True`.
         */
        public Builder isDirectIncome(Optional<? extends Boolean> isDirectIncome) {
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
         * Number of units of goods or services provided.
         */
        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        /**
         * Amount of the line, inclusive of discounts but exclusive of tax.
         */
        public Builder subTotal(double subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = JsonNullable.of(subTotal);
            return this;
        }

        /**
         * Amount of the line, inclusive of discounts but exclusive of tax.
         */
        public Builder subTotal(JsonNullable<? extends Double> subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = subTotal;
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(double taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = JsonNullable.of(taxAmount);
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(JsonNullable<? extends Double> taxAmount) {
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
         * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * Total amount of the line, including tax. When pushing invoices to Xero, the total amount is exclusive of tax to allow automatic calculations if a tax rate or tax amount is not specified.
         */
        public Builder totalAmount(JsonNullable<? extends Double> totalAmount) {
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
         */
        public Builder trackingCategoryRefs(java.util.List<TrackingCategoryRef> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = JsonNullable.of(trackingCategoryRefs);
            return this;
        }

        /**
         * Reference to the tracking categories to which the line item is linked.
         */
        public Builder trackingCategoryRefs(JsonNullable<? extends java.util.List<TrackingCategoryRef>> trackingCategoryRefs) {
            Utils.checkNotNull(trackingCategoryRefs, "trackingCategoryRefs");
            this.trackingCategoryRefs = trackingCategoryRefs;
            return this;
        }

        /**
         * Price of each unit of goods or services.
         */
        public Builder unitAmount(double unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }        
        
        public InvoiceLineItem build() {
            return new InvoiceLineItem(
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

