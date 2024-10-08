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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class OrderLineItem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discountAllocations")
    private Optional<? extends List<OrderDiscountAllocation>> discountAllocations;

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
    private Optional<? extends BigDecimal> quantity;

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxPercentage")
    private Optional<? extends BigDecimal> taxPercentage;

    /**
     * Taxes breakdown as applied to order lines.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxes")
    private Optional<? extends List<TaxComponentAllocation>> taxes;

    /**
     * Total amount of the line item, including discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private Optional<? extends BigDecimal> totalAmount;

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalTaxAmount")
    private Optional<? extends BigDecimal> totalTaxAmount;

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitPrice")
    private Optional<? extends BigDecimal> unitPrice;

    @JsonCreator
    public OrderLineItem(
            @JsonProperty("discountAllocations") Optional<? extends List<OrderDiscountAllocation>> discountAllocations,
            @JsonProperty("id") String id,
            @JsonProperty("productRef") Optional<? extends ProductRef> productRef,
            @JsonProperty("productVariantRef") Optional<? extends ProductVariantRef> productVariantRef,
            @JsonProperty("quantity") Optional<? extends BigDecimal> quantity,
            @JsonProperty("taxPercentage") Optional<? extends BigDecimal> taxPercentage,
            @JsonProperty("taxes") Optional<? extends List<TaxComponentAllocation>> taxes,
            @JsonProperty("totalAmount") Optional<? extends BigDecimal> totalAmount,
            @JsonProperty("totalTaxAmount") Optional<? extends BigDecimal> totalTaxAmount,
            @JsonProperty("unitPrice") Optional<? extends BigDecimal> unitPrice) {
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
    
    public OrderLineItem(
            String id) {
        this(Optional.empty(), id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OrderDiscountAllocation>> discountAllocations() {
        return (Optional<List<OrderDiscountAllocation>>) discountAllocations;
    }

    /**
     * A unique, persistent identifier for this record
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * Reference that links the line item to the correct product details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ProductRef> productRef() {
        return (Optional<ProductRef>) productRef;
    }

    /**
     * Reference that links the line item to the specific version of product that has been ordered.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ProductVariantRef> productVariantRef() {
        return (Optional<ProductVariantRef>) productVariantRef;
    }

    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> quantity() {
        return (Optional<BigDecimal>) quantity;
    }

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> taxPercentage() {
        return (Optional<BigDecimal>) taxPercentage;
    }

    /**
     * Taxes breakdown as applied to order lines.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TaxComponentAllocation>> taxes() {
        return (Optional<List<TaxComponentAllocation>>) taxes;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> totalAmount() {
        return (Optional<BigDecimal>) totalAmount;
    }

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> totalTaxAmount() {
        return (Optional<BigDecimal>) totalTaxAmount;
    }

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> unitPrice() {
        return (Optional<BigDecimal>) unitPrice;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrderLineItem withDiscountAllocations(List<OrderDiscountAllocation> discountAllocations) {
        Utils.checkNotNull(discountAllocations, "discountAllocations");
        this.discountAllocations = Optional.ofNullable(discountAllocations);
        return this;
    }

    public OrderLineItem withDiscountAllocations(Optional<? extends List<OrderDiscountAllocation>> discountAllocations) {
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
    public OrderLineItem withQuantity(BigDecimal quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = Optional.ofNullable(quantity);
        return this;
    }

        /**
         * Number of units of the product sold.
         * For refunds, quantity is negative.
         * 
         */
    public OrderLineItem withQuantity(double quantity) {
        this.quantity = Optional.of(BigDecimal.valueOf(quantity));
        return this;
    }

    /**
     * Number of units of the product sold.
     * For refunds, quantity is negative.
     * 
     */
    public OrderLineItem withQuantity(Optional<? extends BigDecimal> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    public OrderLineItem withTaxPercentage(BigDecimal taxPercentage) {
        Utils.checkNotNull(taxPercentage, "taxPercentage");
        this.taxPercentage = Optional.ofNullable(taxPercentage);
        return this;
    }

        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
    public OrderLineItem withTaxPercentage(double taxPercentage) {
        this.taxPercentage = Optional.of(BigDecimal.valueOf(taxPercentage));
        return this;
    }

    /**
     * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
     */
    public OrderLineItem withTaxPercentage(Optional<? extends BigDecimal> taxPercentage) {
        Utils.checkNotNull(taxPercentage, "taxPercentage");
        this.taxPercentage = taxPercentage;
        return this;
    }

    /**
     * Taxes breakdown as applied to order lines.
     */
    public OrderLineItem withTaxes(List<TaxComponentAllocation> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = Optional.ofNullable(taxes);
        return this;
    }

    /**
     * Taxes breakdown as applied to order lines.
     */
    public OrderLineItem withTaxes(Optional<? extends List<TaxComponentAllocation>> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = taxes;
        return this;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public OrderLineItem withTotalAmount(BigDecimal totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }

        /**
         * Total amount of the line item, including discounts and tax.
         */
    public OrderLineItem withTotalAmount(double totalAmount) {
        this.totalAmount = Optional.of(BigDecimal.valueOf(totalAmount));
        return this;
    }

    /**
     * Total amount of the line item, including discounts and tax.
     */
    public OrderLineItem withTotalAmount(Optional<? extends BigDecimal> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    public OrderLineItem withTotalTaxAmount(BigDecimal totalTaxAmount) {
        Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
        this.totalTaxAmount = Optional.ofNullable(totalTaxAmount);
        return this;
    }

        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
    public OrderLineItem withTotalTaxAmount(double totalTaxAmount) {
        this.totalTaxAmount = Optional.of(BigDecimal.valueOf(totalTaxAmount));
        return this;
    }

    /**
     * Total amount of tax applied to the line item, factoring in any discounts.
     */
    public OrderLineItem withTotalTaxAmount(Optional<? extends BigDecimal> totalTaxAmount) {
        Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
        this.totalTaxAmount = totalTaxAmount;
        return this;
    }

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    public OrderLineItem withUnitPrice(BigDecimal unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = Optional.ofNullable(unitPrice);
        return this;
    }

        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
    public OrderLineItem withUnitPrice(double unitPrice) {
        this.unitPrice = Optional.of(BigDecimal.valueOf(unitPrice));
        return this;
    }

    /**
     * Price per unit of goods or services, excluding discounts and tax.
     */
    public OrderLineItem withUnitPrice(Optional<? extends BigDecimal> unitPrice) {
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
            Objects.deepEquals(this.discountAllocations, other.discountAllocations) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.productRef, other.productRef) &&
            Objects.deepEquals(this.productVariantRef, other.productVariantRef) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.taxPercentage, other.taxPercentage) &&
            Objects.deepEquals(this.taxes, other.taxes) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.totalTaxAmount, other.totalTaxAmount) &&
            Objects.deepEquals(this.unitPrice, other.unitPrice);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends List<OrderDiscountAllocation>> discountAllocations = Optional.empty();
 
        private String id;
 
        private Optional<? extends ProductRef> productRef = Optional.empty();
 
        private Optional<? extends ProductVariantRef> productVariantRef = Optional.empty();
 
        private Optional<? extends BigDecimal> quantity = Optional.empty();
 
        private Optional<? extends BigDecimal> taxPercentage = Optional.empty();
 
        private Optional<? extends List<TaxComponentAllocation>> taxes = Optional.empty();
 
        private Optional<? extends BigDecimal> totalAmount = Optional.empty();
 
        private Optional<? extends BigDecimal> totalTaxAmount = Optional.empty();
 
        private Optional<? extends BigDecimal> unitPrice = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder discountAllocations(List<OrderDiscountAllocation> discountAllocations) {
            Utils.checkNotNull(discountAllocations, "discountAllocations");
            this.discountAllocations = Optional.ofNullable(discountAllocations);
            return this;
        }

        public Builder discountAllocations(Optional<? extends List<OrderDiscountAllocation>> discountAllocations) {
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
        public Builder quantity(BigDecimal quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }

        /**
         * Number of units of the product sold.
         * For refunds, quantity is negative.
         * 
         */
        public Builder quantity(double quantity) {
            this.quantity = Optional.of(BigDecimal.valueOf(quantity));
            return this;
        }

        /**
         * Number of units of the product sold.
         * For refunds, quantity is negative.
         * 
         */
        public Builder quantity(Optional<? extends BigDecimal> quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
        public Builder taxPercentage(BigDecimal taxPercentage) {
            Utils.checkNotNull(taxPercentage, "taxPercentage");
            this.taxPercentage = Optional.ofNullable(taxPercentage);
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
        public Builder taxPercentage(double taxPercentage) {
            this.taxPercentage = Optional.of(BigDecimal.valueOf(taxPercentage));
            return this;
        }

        /**
         * Percentage rate (from 0 to 100) of any sales tax applied to the unit price.
         */
        public Builder taxPercentage(Optional<? extends BigDecimal> taxPercentage) {
            Utils.checkNotNull(taxPercentage, "taxPercentage");
            this.taxPercentage = taxPercentage;
            return this;
        }

        /**
         * Taxes breakdown as applied to order lines.
         */
        public Builder taxes(List<TaxComponentAllocation> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = Optional.ofNullable(taxes);
            return this;
        }

        /**
         * Taxes breakdown as applied to order lines.
         */
        public Builder taxes(Optional<? extends List<TaxComponentAllocation>> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = taxes;
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(BigDecimal totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(double totalAmount) {
            this.totalAmount = Optional.of(BigDecimal.valueOf(totalAmount));
            return this;
        }

        /**
         * Total amount of the line item, including discounts and tax.
         */
        public Builder totalAmount(Optional<? extends BigDecimal> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
        public Builder totalTaxAmount(BigDecimal totalTaxAmount) {
            Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
            this.totalTaxAmount = Optional.ofNullable(totalTaxAmount);
            return this;
        }

        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
        public Builder totalTaxAmount(double totalTaxAmount) {
            this.totalTaxAmount = Optional.of(BigDecimal.valueOf(totalTaxAmount));
            return this;
        }

        /**
         * Total amount of tax applied to the line item, factoring in any discounts.
         */
        public Builder totalTaxAmount(Optional<? extends BigDecimal> totalTaxAmount) {
            Utils.checkNotNull(totalTaxAmount, "totalTaxAmount");
            this.totalTaxAmount = totalTaxAmount;
            return this;
        }

        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
        public Builder unitPrice(BigDecimal unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = Optional.ofNullable(unitPrice);
            return this;
        }

        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
        public Builder unitPrice(double unitPrice) {
            this.unitPrice = Optional.of(BigDecimal.valueOf(unitPrice));
            return this;
        }

        /**
         * Price per unit of goods or services, excluding discounts and tax.
         */
        public Builder unitPrice(Optional<? extends BigDecimal> unitPrice) {
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

