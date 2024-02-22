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


public class ItemReceiptLineItem {

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountRef")
    private Optional<? extends AccountRef> accountRef;

    /**
     * Friendly name of the item or services received.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemRef")
    private Optional<? extends ItemRef> itemRef;

    /**
     * The item receipt line's number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lineNumber")
    private JsonNullable<? extends String> lineNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purchaseOrderLineRef")
    private Optional<? extends RecordLineReference> purchaseOrderLineRef;

    /**
     * Number of units of item or services received.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private Optional<? extends Double> quantity;

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subTotal")
    private JsonNullable<? extends Double> subTotal;

    /**
     * Total amount of the line, including tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalAmount")
    private JsonNullable<? extends Double> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking")
    private Optional<? extends ItemReceiptLineItemTracking> tracking;

    /**
     * Price of each unit of item or services.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitAmount")
    private Optional<? extends Double> unitAmount;

    /**
     * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitOfMeasurement")
    private JsonNullable<? extends String> unitOfMeasurement;

    public ItemReceiptLineItem(
            @JsonProperty("accountRef") Optional<? extends AccountRef> accountRef,
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("itemRef") Optional<? extends ItemRef> itemRef,
            @JsonProperty("lineNumber") JsonNullable<? extends String> lineNumber,
            @JsonProperty("purchaseOrderLineRef") Optional<? extends RecordLineReference> purchaseOrderLineRef,
            @JsonProperty("quantity") Optional<? extends Double> quantity,
            @JsonProperty("subTotal") JsonNullable<? extends Double> subTotal,
            @JsonProperty("totalAmount") JsonNullable<? extends Double> totalAmount,
            @JsonProperty("tracking") Optional<? extends ItemReceiptLineItemTracking> tracking,
            @JsonProperty("unitAmount") Optional<? extends Double> unitAmount,
            @JsonProperty("unitOfMeasurement") JsonNullable<? extends String> unitOfMeasurement) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(itemRef, "itemRef");
        Utils.checkNotNull(lineNumber, "lineNumber");
        Utils.checkNotNull(purchaseOrderLineRef, "purchaseOrderLineRef");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(subTotal, "subTotal");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(tracking, "tracking");
        Utils.checkNotNull(unitAmount, "unitAmount");
        Utils.checkNotNull(unitOfMeasurement, "unitOfMeasurement");
        this.accountRef = accountRef;
        this.description = description;
        this.itemRef = itemRef;
        this.lineNumber = lineNumber;
        this.purchaseOrderLineRef = purchaseOrderLineRef;
        this.quantity = quantity;
        this.subTotal = subTotal;
        this.totalAmount = totalAmount;
        this.tracking = tracking;
        this.unitAmount = unitAmount;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public Optional<? extends AccountRef> accountRef() {
        return accountRef;
    }

    /**
     * Friendly name of the item or services received.
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    public Optional<? extends ItemRef> itemRef() {
        return itemRef;
    }

    /**
     * The item receipt line's number.
     */
    public JsonNullable<? extends String> lineNumber() {
        return lineNumber;
    }

    public Optional<? extends RecordLineReference> purchaseOrderLineRef() {
        return purchaseOrderLineRef;
    }

    /**
     * Number of units of item or services received.
     */
    public Optional<? extends Double> quantity() {
        return quantity;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public JsonNullable<? extends Double> subTotal() {
        return subTotal;
    }

    /**
     * Total amount of the line, including tax.
     */
    public JsonNullable<? extends Double> totalAmount() {
        return totalAmount;
    }

    public Optional<? extends ItemReceiptLineItemTracking> tracking() {
        return tracking;
    }

    /**
     * Price of each unit of item or services.
     */
    public Optional<? extends Double> unitAmount() {
        return unitAmount;
    }

    /**
     * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
     */
    public JsonNullable<? extends String> unitOfMeasurement() {
        return unitOfMeasurement;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public ItemReceiptLineItem withAccountRef(AccountRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = Optional.ofNullable(accountRef);
        return this;
    }
    
    /**
     * Data types that reference an account, for example bill and invoice line items, use an accountRef that includes the ID and name of the linked account.
     */
    public ItemReceiptLineItem withAccountRef(Optional<? extends AccountRef> accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Friendly name of the item or services received.
     */
    public ItemReceiptLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Friendly name of the item or services received.
     */
    public ItemReceiptLineItem withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ItemReceiptLineItem withItemRef(ItemRef itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = Optional.ofNullable(itemRef);
        return this;
    }
    
    public ItemReceiptLineItem withItemRef(Optional<? extends ItemRef> itemRef) {
        Utils.checkNotNull(itemRef, "itemRef");
        this.itemRef = itemRef;
        return this;
    }

    /**
     * The item receipt line's number.
     */
    public ItemReceiptLineItem withLineNumber(String lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = JsonNullable.of(lineNumber);
        return this;
    }

    /**
     * The item receipt line's number.
     */
    public ItemReceiptLineItem withLineNumber(JsonNullable<? extends String> lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = lineNumber;
        return this;
    }

    public ItemReceiptLineItem withPurchaseOrderLineRef(RecordLineReference purchaseOrderLineRef) {
        Utils.checkNotNull(purchaseOrderLineRef, "purchaseOrderLineRef");
        this.purchaseOrderLineRef = Optional.ofNullable(purchaseOrderLineRef);
        return this;
    }
    
    public ItemReceiptLineItem withPurchaseOrderLineRef(Optional<? extends RecordLineReference> purchaseOrderLineRef) {
        Utils.checkNotNull(purchaseOrderLineRef, "purchaseOrderLineRef");
        this.purchaseOrderLineRef = purchaseOrderLineRef;
        return this;
    }

    /**
     * Number of units of item or services received.
     */
    public ItemReceiptLineItem withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = Optional.ofNullable(quantity);
        return this;
    }
    
    /**
     * Number of units of item or services received.
     */
    public ItemReceiptLineItem withQuantity(Optional<? extends Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public ItemReceiptLineItem withSubTotal(double subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = JsonNullable.of(subTotal);
        return this;
    }

    /**
     * Amount of the line, inclusive of discounts but exclusive of tax.
     */
    public ItemReceiptLineItem withSubTotal(JsonNullable<? extends Double> subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Total amount of the line, including tax.
     */
    public ItemReceiptLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    /**
     * Total amount of the line, including tax.
     */
    public ItemReceiptLineItem withTotalAmount(JsonNullable<? extends Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public ItemReceiptLineItem withTracking(ItemReceiptLineItemTracking tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = Optional.ofNullable(tracking);
        return this;
    }
    
    public ItemReceiptLineItem withTracking(Optional<? extends ItemReceiptLineItemTracking> tracking) {
        Utils.checkNotNull(tracking, "tracking");
        this.tracking = tracking;
        return this;
    }

    /**
     * Price of each unit of item or services.
     */
    public ItemReceiptLineItem withUnitAmount(double unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = Optional.ofNullable(unitAmount);
        return this;
    }
    
    /**
     * Price of each unit of item or services.
     */
    public ItemReceiptLineItem withUnitAmount(Optional<? extends Double> unitAmount) {
        Utils.checkNotNull(unitAmount, "unitAmount");
        this.unitAmount = unitAmount;
        return this;
    }

    /**
     * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
     */
    public ItemReceiptLineItem withUnitOfMeasurement(String unitOfMeasurement) {
        Utils.checkNotNull(unitOfMeasurement, "unitOfMeasurement");
        this.unitOfMeasurement = JsonNullable.of(unitOfMeasurement);
        return this;
    }

    /**
     * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
     */
    public ItemReceiptLineItem withUnitOfMeasurement(JsonNullable<? extends String> unitOfMeasurement) {
        Utils.checkNotNull(unitOfMeasurement, "unitOfMeasurement");
        this.unitOfMeasurement = unitOfMeasurement;
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
        ItemReceiptLineItem other = (ItemReceiptLineItem) o;
        return 
            java.util.Objects.deepEquals(this.accountRef, other.accountRef) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.itemRef, other.itemRef) &&
            java.util.Objects.deepEquals(this.lineNumber, other.lineNumber) &&
            java.util.Objects.deepEquals(this.purchaseOrderLineRef, other.purchaseOrderLineRef) &&
            java.util.Objects.deepEquals(this.quantity, other.quantity) &&
            java.util.Objects.deepEquals(this.subTotal, other.subTotal) &&
            java.util.Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            java.util.Objects.deepEquals(this.tracking, other.tracking) &&
            java.util.Objects.deepEquals(this.unitAmount, other.unitAmount) &&
            java.util.Objects.deepEquals(this.unitOfMeasurement, other.unitOfMeasurement);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountRef,
            description,
            itemRef,
            lineNumber,
            purchaseOrderLineRef,
            quantity,
            subTotal,
            totalAmount,
            tracking,
            unitAmount,
            unitOfMeasurement);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ItemReceiptLineItem.class,
                "accountRef", accountRef,
                "description", description,
                "itemRef", itemRef,
                "lineNumber", lineNumber,
                "purchaseOrderLineRef", purchaseOrderLineRef,
                "quantity", quantity,
                "subTotal", subTotal,
                "totalAmount", totalAmount,
                "tracking", tracking,
                "unitAmount", unitAmount,
                "unitOfMeasurement", unitOfMeasurement);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountRef> accountRef = Optional.empty();
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends ItemRef> itemRef = Optional.empty();
 
        private JsonNullable<? extends String> lineNumber = JsonNullable.undefined();
 
        private Optional<? extends RecordLineReference> purchaseOrderLineRef = Optional.empty();
 
        private Optional<? extends Double> quantity = Optional.empty();
 
        private JsonNullable<? extends Double> subTotal = JsonNullable.undefined();
 
        private JsonNullable<? extends Double> totalAmount = JsonNullable.undefined();
 
        private Optional<? extends ItemReceiptLineItemTracking> tracking = Optional.empty();
 
        private Optional<? extends Double> unitAmount = Optional.empty();
 
        private JsonNullable<? extends String> unitOfMeasurement = JsonNullable.undefined();  
        
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
         * Friendly name of the item or services received.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Friendly name of the item or services received.
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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
         * The item receipt line's number.
         */
        public Builder lineNumber(String lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = JsonNullable.of(lineNumber);
            return this;
        }

        /**
         * The item receipt line's number.
         */
        public Builder lineNumber(JsonNullable<? extends String> lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = lineNumber;
            return this;
        }

        public Builder purchaseOrderLineRef(RecordLineReference purchaseOrderLineRef) {
            Utils.checkNotNull(purchaseOrderLineRef, "purchaseOrderLineRef");
            this.purchaseOrderLineRef = Optional.ofNullable(purchaseOrderLineRef);
            return this;
        }
        
        public Builder purchaseOrderLineRef(Optional<? extends RecordLineReference> purchaseOrderLineRef) {
            Utils.checkNotNull(purchaseOrderLineRef, "purchaseOrderLineRef");
            this.purchaseOrderLineRef = purchaseOrderLineRef;
            return this;
        }

        /**
         * Number of units of item or services received.
         */
        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = Optional.ofNullable(quantity);
            return this;
        }
        
        /**
         * Number of units of item or services received.
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
         * Total amount of the line, including tax.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * Total amount of the line, including tax.
         */
        public Builder totalAmount(JsonNullable<? extends Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder tracking(ItemReceiptLineItemTracking tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = Optional.ofNullable(tracking);
            return this;
        }
        
        public Builder tracking(Optional<? extends ItemReceiptLineItemTracking> tracking) {
            Utils.checkNotNull(tracking, "tracking");
            this.tracking = tracking;
            return this;
        }

        /**
         * Price of each unit of item or services.
         */
        public Builder unitAmount(double unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = Optional.ofNullable(unitAmount);
            return this;
        }
        
        /**
         * Price of each unit of item or services.
         */
        public Builder unitAmount(Optional<? extends Double> unitAmount) {
            Utils.checkNotNull(unitAmount, "unitAmount");
            this.unitAmount = unitAmount;
            return this;
        }

        /**
         * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
         */
        public Builder unitOfMeasurement(String unitOfMeasurement) {
            Utils.checkNotNull(unitOfMeasurement, "unitOfMeasurement");
            this.unitOfMeasurement = JsonNullable.of(unitOfMeasurement);
            return this;
        }

        /**
         * The measurement which defines a unit for this item (e.g. 'kilogram', 'litre').
         */
        public Builder unitOfMeasurement(JsonNullable<? extends String> unitOfMeasurement) {
            Utils.checkNotNull(unitOfMeasurement, "unitOfMeasurement");
            this.unitOfMeasurement = unitOfMeasurement;
            return this;
        }
        
        public ItemReceiptLineItem build() {
            return new ItemReceiptLineItem(
                accountRef,
                description,
                itemRef,
                lineNumber,
                purchaseOrderLineRef,
                quantity,
                subTotal,
                totalAmount,
                tracking,
                unitAmount,
                unitOfMeasurement);
        }
    }
}

