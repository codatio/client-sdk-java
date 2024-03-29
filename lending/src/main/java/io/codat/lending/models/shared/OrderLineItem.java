/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class OrderLineItem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountAllocations")
    private Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations;

    /**
     * A unique, persistent identifier for this record
     */
    @JsonProperty("id")
    private String id;

    /**
     * Reference that links the line item to the correct product details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("productRef")
    private Optional<? extends ProductRef> productRef;

    /**
     * Reference that links the line item to the specific version of product that has been ordered.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("productVariantRef")
    private Optional<? extends ProductVariantRef> productVariantRef;

    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private Optional<? extends Double> quantity;

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxPercentage")
    private Optional<? extends Double> taxPercentage;

    /**
     * Taxes breakdown as applied to order lines.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxes")
    private Optional<? extends java.util.List<TaxComponentAllocation>> taxes;

    /**
     * Total amount of the line item, including discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private Optional<? extends Double> totalAmount;

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalTaxAmount")
    private Optional<? extends Double> totalTaxAmount;

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitPrice")
    private Optional<? extends Double> unitPrice;

    public OrderLineItem(
            @JsonProperty("discountAllocations") Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations,
            @JsonProperty("id") String id,
            @JsonProperty("productRef") Optional<? extends ProductRef> productRef,
            @JsonProperty("productVariantRef") Optional<? extends ProductVariantRef> productVariantRef,
            @JsonProperty("quantity") Optional<? extends Double> quantity,
            @JsonProperty("taxPercentage") Optional<? extends Double> taxPercentage,
            @JsonProperty("taxes") Optional<? extends java.util.List<TaxComponentAllocation>> taxes,
            @JsonProperty("totalAmount") Optional<? extends Double> totalAmount,
            @JsonProperty("totalTaxAmount") Optional<? extends Double> totalTaxAmount,
            @JsonProperty("unitPrice") Optional<? extends Double> unitPrice) {
        Utils.checkNotNull(discountAllocations, "discountAllocations");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(productRef, "productRef");
        Utils.checkNotNull(productVariantRef, "productVariantRef");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(taxPercentage, "taxPercentage");
        Utils.checkNotNull(taxes, "taxes");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.discountAllocations = discountAllocations;
        this.id = id;
        this.productRef = productRef;
        this.productVariantRef = productVariantRef;
        this.quantity = quantity;
        this.taxPercentage = taxPercentage;
        this.taxes = taxes;
        this.totalAmount = totalAmount;
        this.totalTaxAmount = totalTaxAmount;
        this.unitPrice = unitPrice;
    }

    public Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations() {
        return discountAllocations;
    }

    /**
     * A unique, persistent identifier for this record
     */
    public String id() {
        return id;
    }

    /**
     * Reference that links the line item to the correct product details.
     */
    public Optional<? extends ProductRef> productRef() {
        return productRef;
    }

    /**
     * Reference that links the line item to the specific version of product that has been ordered.
     */
    public Optional<? extends ProductVariantRef> productVariantRef() {
        return productVariantRef;
    }

    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    public Optional<? extends Double> quantity() {
        return quantity;
    }

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    public Optional<? extends Double> taxPercentage() {
        return taxPercentage;
    }

    /**
     * Taxes breakdown as applied to order lines.
     */
    public Optional<? extends java.util.List<TaxComponentAllocation>> taxes() {
        return taxes;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public Optional<? extends Double> totalAmount() {
        return totalAmount;
    }

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    public Optional<? extends Double> totalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    public Optional<? extends Double> unitPrice() {
        return unitPrice;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public OrderLineItem withDiscountAllocations(java.util.List<OrderDiscountAllocation> discountAllocations) {
        Utils.checkNotNull(discountAllocations, "discountAllocations");
        this.discountAllocations = Optional.ofNullable(discountAllocations);
        return this;
    }
    
    public OrderLineItem withDiscountAllocations(Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations) {
        Utils.checkNotNull(discountAllocations, "discountAllocations");
        this.discountAllocations = discountAllocations;
        return this;
    }

    /**
     * A unique, persistent identifier for this record
     */
    public OrderLineItem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Reference that links the line item to the correct product details.
     */
    public OrderLineItem withProductRef(ProductRef productRef) {
        Utils.checkNotNull(productRef, "productRef");
        this.productRef = Optional.ofNullable(productRef);
        return this;
    }
    
    /**
     * Reference that links the line item to the correct product details.
     */
    public OrderLineItem withProductRef(Optional<? extends ProductRef> productRef) {
        Utils.checkNotNull(productRef, "productRef");
        this.productRef = productRef;
        return this;
    }

    /**
     * Reference that links the line item to the specific version of product that has been ordered.
     */
    public OrderLineItem withProductVariantRef(ProductVariantRef productVariantRef) {
        Utils.checkNotNull(productVariantRef, "productVariantRef");
        this.productVariantRef = Optional.ofNullable(productVariantRef);
        return this;
    }
    
    /**
     * Reference that links the line item to the specific version of product that has been ordered.
     */
    public OrderLineItem withProductVariantRef(Optional<? extends ProductVariantRef> productVariantRef) {
        Utils.checkNotNull(productVariantRef, "productVariantRef");
        this.productVariantRef = productVariantRef;
        return this;
    }

    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    public OrderLineItem withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = Optional.ofNullable(quantity);
        return this;
    }
    
    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    public OrderLineItem withQuantity(Optional<? extends Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    public OrderLineItem withTaxPercentage(double taxPercentage) {
        Utils.checkNotNull(taxPercentage, "taxPercentage");
        this.taxPercentage = Optional.ofNullable(taxPercentage);
        return this;
    }
    
    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    public OrderLineItem withTaxPercentage(Optional<? extends Double> taxPercentage) {
        Utils.checkNotNull(taxPercentage, "taxPercentage");
        this.taxPercentage = taxPercentage;
        return this;
    }

    /**
     * Taxes breakdown as applied to order lines.
     */
    public OrderLineItem withTaxes(java.util.List<TaxComponentAllocation> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = Optional.ofNullable(taxes);
        return this;
    }
    
    /**
     * Taxes breakdown as applied to order lines.
     */
    public OrderLineItem withTaxes(Optional<? extends java.util.List<TaxComponentAllocation>> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = taxes;
        return this;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public OrderLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }
    
    /**
     * Total amount of the line item, including discounts and tax.
     */
    public OrderLineItem withTotalAmount(Optional<? extends Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    public OrderLineItem withTotalTaxAmount(double totalTaxAmount) {
        Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
        this.totalTaxAmount = Optional.ofNullable(totalTaxAmount);
        return this;
    }
    
    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    public OrderLineItem withTotalTaxAmount(Optional<? extends Double> totalTaxAmount) {
        Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
        this.totalTaxAmount = totalTaxAmount;
        return this;
    }

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    public OrderLineItem withUnitPrice(double unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = Optional.ofNullable(unitPrice);
        return this;
    }
    
    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    public OrderLineItem withUnitPrice(Optional<? extends Double> unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = unitPrice;
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
        OrderLineItem other = (OrderLineItem) o;
        return 
            java.util.Objects.deepEquals(this.discountAllocations, other.discountAllocations) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.productRef, other.productRef) &&
            java.util.Objects.deepEquals(this.productVariantRef, other.productVariantRef) &&
            java.util.Objects.deepEquals(this.quantity, other.quantity) &&
            java.util.Objects.deepEquals(this.taxPercentage, other.taxPercentage) &&
            java.util.Objects.deepEquals(this.taxes, other.taxes) &&
            java.util.Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            java.util.Objects.deepEquals(this.totalTaxAmount, other.totalTaxAmount) &&
            java.util.Objects.deepEquals(this.unitPrice, other.unitPrice);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            discountAllocations,
            id,
            productRef,
            productVariantRef,
            quantity,
            taxPercentage,
            taxes,
            totalAmount,
            totalTaxAmount,
            unitPrice);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrderLineItem.class,
                "discountAllocations", discountAllocations,
                "id", id,
                "productRef", productRef,
                "productVariantRef", productVariantRef,
                "quantity", quantity,
                "taxPercentage", taxPercentage,
                "taxes", taxes,
                "totalAmount", totalAmount,
                "totalTaxAmount", totalTaxAmount,
                "unitPrice", unitPrice);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations = Optional.empty();
 
        private String id;
 
        private Optional<? extends ProductRef> productRef = Optional.empty();
 
        private Optional<? extends ProductVariantRef> productVariantRef = Optional.empty();
 
        private Optional<? extends Double> quantity = Optional.empty();
 
        private Optional<? extends Double> taxPercentage = Optional.empty();
 
        private Optional<? extends java.util.List<TaxComponentAllocation>> taxes = Optional.empty();
 
        private Optional<? extends Double> totalAmount = Optional.empty();
 
        private Optional<? extends Double> totalTaxAmount = Optional.empty();
 
        private Optional<? extends Double> unitPrice = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder discountAllocations(java.util.List<OrderDiscountAllocation> discountAllocations) {
            Utils.checkNotNull(discountAllocations, "discountAllocations");
            this.discountAllocations = Optional.ofNullable(discountAllocations);
            return this;
        }
        
        public Builder discountAllocations(Optional<? extends java.util.List<OrderDiscountAllocation>> discountAllocations) {
            Utils.checkNotNull(discountAllocations, "discountAllocations");
            this.discountAllocations = discountAllocations;
            return this;
        }

        /**
         * A unique, persistent identifier for this record
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Reference that links the line item to the correct product details.
         */
        public Builder productRef(ProductRef productRef) {
            Utils.checkNotNull(productRef, "productRef");
            this.productRef = Optional.ofNullable(productRef);
            return this;
        }
        
        /**
         * Reference that links the line item to the correct product details.
         */
        public Builder productRef(Optional<? extends ProductRef> productRef) {
            Utils.checkNotNull(productRef, "productRef");
            this.productRef = productRef;
            return this;
        }

        /**
         * Reference that links the line item to the specific version of product that has been ordered.
         */
        public Builder productVariantRef(ProductVariantRef productVariantRef) {
            Utils.checkNotNull(productVariantRef, "productVariantRef");
            this.productVariantRef = Optional.ofNullable(productVariantRef);
            return this;
        }
        
        /**
         * Reference that links the line item to the specific version of product that has been ordered.
         */
        public Builder productVariantRef(Optional<? extends ProductVariantRef> productVariantRef) {
            Utils.checkNotNull(productVariantRef, "productVariantRef");
            this.productVariantRef = productVariantRef;
            return this;
        }

        /**
         * Number of units of the product sold.
         * For refunds, quantity is negative.
         * 
         */
        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }
        
        /**
         * Number of units of the product sold.
         * For refunds, quantity is negative.
         * 
         */
        public Builder quantity(Optional<? extends Double> quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
        public Builder taxPercentage(double taxPercentage) {
            Utils.checkNotNull(taxPercentage, "taxPercentage");
            this.taxPercentage = Optional.ofNullable(taxPercentage);
            return this;
        }
        
        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
        public Builder taxPercentage(Optional<? extends Double> taxPercentage) {
            Utils.checkNotNull(taxPercentage, "taxPercentage");
            this.taxPercentage = taxPercentage;
            return this;
        }

        /**
         * Taxes breakdown as applied to order lines.
         */
        public Builder taxes(java.util.List<TaxComponentAllocation> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = Optional.ofNullable(taxes);
            return this;
        }
        
        /**
         * Taxes breakdown as applied to order lines.
         */
        public Builder taxes(Optional<? extends java.util.List<TaxComponentAllocation>> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = taxes;
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }
        
        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(Optional<? extends Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
        public Builder totalTaxAmount(double totalTaxAmount) {
            Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
            this.totalTaxAmount = Optional.ofNullable(totalTaxAmount);
            return this;
        }
        
        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
        public Builder totalTaxAmount(Optional<? extends Double> totalTaxAmount) {
            Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
            this.totalTaxAmount = totalTaxAmount;
            return this;
        }

        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
        public Builder unitPrice(double unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = Optional.ofNullable(unitPrice);
            return this;
        }
        
        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
        public Builder unitPrice(Optional<? extends Double> unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = unitPrice;
            return this;
        }
        
        public OrderLineItem build() {
            return new OrderLineItem(
                discountAllocations,
                id,
                productRef,
                productVariantRef,
                quantity,
                taxPercentage,
                taxes,
                totalAmount,
                totalTaxAmount,
                unitPrice);
        }
    }
}

