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


public class SalesOrderLineItem {

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountRef> accountRef;

    /**
     * Description of the goods or services that have been ordered.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Value of any discounts applied.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountAmount")
    private Optional<? extends Double> discountAmount;

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountPercentage")
    private Optional<? extends Double> discountPercentage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemRef")
    private Optional<? extends ItemRef> itemRef;

    /**
     * Number of units that have been ordered.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private Optional<? extends Double> quantity;

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subTotal")
    private Optional<? extends Double> subTotal;

    /**
     * Amount of tax for the line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxAmount")
    private Optional<? extends Double> taxAmount;

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
     * Total amount of the line, inclusive of discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private Optional<? extends Double> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking")
    private Optional<? extends PropertieTracking2> tracking;

    /**
     * Price of each unit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitAmount")
    private Optional<? extends Double> unitAmount;

    public SalesOrderLineItem(
            @JsonProperty("accountRef") Optional<? extends AccountRef> accountRef,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("discountAmount") Optional<? extends Double> discountAmount,
            @JsonProperty("discountPercentage") Optional<? extends Double> discountPercentage,
            @JsonProperty("itemRef") Optional<? extends ItemRef> itemRef,
            @JsonProperty("quantity") Optional<? extends Double> quantity,
            @JsonProperty("subTotal") Optional<? extends Double> subTotal,
            @JsonProperty("taxAmount") Optional<? extends Double> taxAmount,
            @JsonProperty("taxRateRef") Optional<? extends TaxRateRef> taxRateRef,
            @JsonProperty("totalAmount") Optional<? extends Double> totalAmount,
            @JsonProperty("tracking") Optional<? extends PropertieTracking2> tracking,
            @JsonProperty("unitAmount") Optional<? extends Double> unitAmount) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(discountAmount, "discountAmount");
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        Utils.checkNotNull(itemRef, "itemRef");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(subTotal, "subTotal");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(tracking, "tracking");
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.accountRef = accountRef;
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountPercentage = discountPercentage;
        this.itemRef = itemRef;
        this.quantity = quantity;
        this.subTotal = subTotal;
        this.taxAmount = taxAmount;
        this.taxRateRef = taxRateRef;
        this.totalAmount = totalAmount;
        this.tracking = tracking;
        this.unitAmount = unitAmount;
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public Optional<? extends AccountRef> accountRef() {
        return accountRef;
    }

    /**
     * Description of the goods or services that have been ordered.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Value of any discounts applied.
     */
    public Optional<? extends Double> discountAmount() {
        return discountAmount;
    }

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public Optional<? extends Double> discountPercentage() {
        return discountPercentage;
    }

    public Optional<? extends ItemRef> itemRef() {
        return itemRef;
    }

    /**
     * Number of units that have been ordered.
     */
    public Optional<? extends Double> quantity() {
        return quantity;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public Optional<? extends Double> subTotal() {
        return subTotal;
    }

    /**
     * Amount of tax for the line.
     */
    public Optional<? extends Double> taxAmount() {
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
     * Total amount of the line, inclusive of discounts and tax.
     */
    public Optional<? extends Double> totalAmount() {
        return totalAmount;
    }

    public Optional<? extends PropertieTracking2> tracking() {
        return tracking;
    }

    /**
     * Price of each unit.
     */
    public Optional<? extends Double> unitAmount() {
        return unitAmount;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public SalesOrderLineItem withAccountRef(AccountRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }
    
    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public SalesOrderLineItem withAccountRef(Optional<? extends AccountRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Description of the goods or services that have been ordered.
     */
    public SalesOrderLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the goods or services that have been ordered.
     */
    public SalesOrderLineItem withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Value of any discounts applied.
     */
    public SalesOrderLineItem withDiscountAmount(double discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = Optional.ofNullable(discountAmount);
        return this;
    }
    
    /**
     * Value of any discounts applied.
     */
    public SalesOrderLineItem withDiscountAmount(Optional<? extends Double> discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public SalesOrderLineItem withDiscountPercentage(double discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = Optional.ofNullable(discountPercentage);
        return this;
    }
    
    /**
     * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
     */
    public SalesOrderLineItem withDiscountPercentage(Optional<? extends Double> discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = discountPercentage;
        return this;
    }

    public SalesOrderLineItem withItemRef(ItemRef itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = Optional.ofNullable(itemRef);
        return this;
    }
    
    public SalesOrderLineItem withItemRef(Optional<? extends ItemRef> itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = itemRef;
        return this;
    }

    /**
     * Number of units that have been ordered.
     */
    public SalesOrderLineItem withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = Optional.ofNullable(quantity);
        return this;
    }
    
    /**
     * Number of units that have been ordered.
     */
    public SalesOrderLineItem withQuantity(Optional<? extends Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public SalesOrderLineItem withSubTotal(double subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = Optional.ofNullable(subTotal);
        return this;
    }
    
    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public SalesOrderLineItem withSubTotal(Optional<? extends Double> subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Amount of tax for the line.
     */
    public SalesOrderLineItem withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = Optional.ofNullable(taxAmount);
        return this;
    }
    
    /**
     * Amount of tax for the line.
     */
    public SalesOrderLineItem withTaxAmount(Optional<? extends Double> taxAmount) {
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
    public SalesOrderLineItem withTaxRateRef(TaxRateRef taxRateRef) {
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
    public SalesOrderLineItem withTaxRateRef(Optional<? extends TaxRateRef> taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = taxRateRef;
        return this;
    }

    /**
     * Total amount of the line, inclusive of discounts and tax.
     */
    public SalesOrderLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }
    
    /**
     * Total amount of the line, inclusive of discounts and tax.
     */
    public SalesOrderLineItem withTotalAmount(Optional<? extends Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public SalesOrderLineItem withTracking(PropertieTracking2 tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = Optional.ofNullable(tracking);
        return this;
    }
    
    public SalesOrderLineItem withTracking(Optional<? extends PropertieTracking2> tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = tracking;
        return this;
    }

    /**
     * Price of each unit.
     */
    public SalesOrderLineItem withUnitAmount(double unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = Optional.ofNullable(unitAmount);
        return this;
    }
    
    /**
     * Price of each unit.
     */
    public SalesOrderLineItem withUnitAmount(Optional<? extends Double> unitAmount) {
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
        SalesOrderLineItem other = (SalesOrderLineItem) o;
        return 
            java.util.Objects.deepEquals(this.accountRef, other.accountRef) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.discountAmount, other.discountAmount) &&
            java.util.Objects.deepEquals(this.discountPercentage, other.discountPercentage) &&
            java.util.Objects.deepEquals(this.itemRef, other.itemRef) &&
            java.util.Objects.deepEquals(this.quantity, other.quantity) &&
            java.util.Objects.deepEquals(this.subTotal, other.subTotal) &&
            java.util.Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            java.util.Objects.deepEquals(this.taxRateRef, other.taxRateRef) &&
            java.util.Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            java.util.Objects.deepEquals(this.tracking, other.tracking) &&
            java.util.Objects.deepEquals(this.unitAmount, other.unitAmount);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountRef,
            description,
            discountAmount,
            discountPercentage,
            itemRef,
            quantity,
            subTotal,
            taxAmount,
            taxRateRef,
            totalAmount,
            tracking,
            unitAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SalesOrderLineItem.class,
                "accountRef", accountRef,
                "description", description,
                "discountAmount", discountAmount,
                "discountPercentage", discountPercentage,
                "itemRef", itemRef,
                "quantity", quantity,
                "subTotal", subTotal,
                "taxAmount", taxAmount,
                "taxRateRef", taxRateRef,
                "totalAmount", totalAmount,
                "tracking", tracking,
                "unitAmount", unitAmount);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountRef> accountRef = Optional.empty();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends Double> discountAmount = Optional.empty();
 
        private Optional<? extends Double> discountPercentage = Optional.empty();
 
        private Optional<? extends ItemRef> itemRef = Optional.empty();
 
        private Optional<? extends Double> quantity = Optional.empty();
 
        private Optional<? extends Double> subTotal = Optional.empty();
 
        private Optional<? extends Double> taxAmount = Optional.empty();
 
        private Optional<? extends TaxRateRef> taxRateRef = Optional.empty();
 
        private Optional<? extends Double> totalAmount = Optional.empty();
 
        private Optional<? extends PropertieTracking2> tracking = Optional.empty();
 
        private Optional<? extends Double> unitAmount = Optional.empty();  
        
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
         * Description of the goods or services that have been ordered.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the goods or services that have been ordered.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Value of any discounts applied.
         */
        public Builder discountAmount(double discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = Optional.ofNullable(discountAmount);
            return this;
        }
        
        /**
         * Value of any discounts applied.
         */
        public Builder discountAmount(Optional<? extends Double> discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
         */
        public Builder discountPercentage(double discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = Optional.ofNullable(discountPercentage);
            return this;
        }
        
        /**
         * Percentage rate (from 0 to 100) of any discounts applied to the unit amount.
         */
        public Builder discountPercentage(Optional<? extends Double> discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = discountPercentage;
            return this;
        }

        public Builder itemRef(ItemRef itemRef) {
            Utils.checkNotNull(itemRef, "itemRef");
            this.itemRef = Optional.ofNullable(itemRef);
            return this;
        }
        
        public Builder itemRef(Optional<? extends ItemRef> itemRef) {
            Utils.checkNotNull(itemRef, "itemRef");
            this.itemRef = itemRef;
            return this;
        }

        /**
         * Number of units that have been ordered.
         */
        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }
        
        /**
         * Number of units that have been ordered.
         */
        public Builder quantity(Optional<? extends Double> quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        /**
         * Amount of the line, inclusive of discounts but exclusive of tax.
         */
        public Builder subTotal(double subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = Optional.ofNullable(subTotal);
            return this;
        }
        
        /**
         * Amount of the line, inclusive of discounts but exclusive of tax.
         */
        public Builder subTotal(Optional<? extends Double> subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = subTotal;
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(double taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = Optional.ofNullable(taxAmount);
            return this;
        }
        
        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(Optional<? extends Double> taxAmount) {
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
         * Total amount of the line, inclusive of discounts and tax.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }
        
        /**
         * Total amount of the line, inclusive of discounts and tax.
         */
        public Builder totalAmount(Optional<? extends Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder tracking(PropertieTracking2 tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = Optional.ofNullable(tracking);
            return this;
        }
        
        public Builder tracking(Optional<? extends PropertieTracking2> tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = tracking;
            return this;
        }

        /**
         * Price of each unit.
         */
        public Builder unitAmount(double unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = Optional.ofNullable(unitAmount);
            return this;
        }
        
        /**
         * Price of each unit.
         */
        public Builder unitAmount(Optional<? extends Double> unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }
        
        public SalesOrderLineItem build() {
            return new SalesOrderLineItem(
                accountRef,
                description,
                discountAmount,
                discountPercentage,
                itemRef,
                quantity,
                subTotal,
                taxAmount,
                taxRateRef,
                totalAmount,
                tracking,
                unitAmount);
        }
    }
}

