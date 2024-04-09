/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ReimbursableExpenseTransactionLine {

    @JsonProperty("accountRef")
    private RecordRef accountRef;

    /**
     * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invoiceTo")
    private JsonNullable<? extends InvoiceTo> invoiceTo;

    /**
     * Amount of the line, exclusive of tax.
     */
    @JsonProperty("netAmount")
    private BigDecimal netAmount;

    /**
     * Amount of tax for the line.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxAmount")
    private Optional<? extends BigDecimal> taxAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRateRef")
    private Optional<? extends RecordRef> taxRateRef;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trackingRefs")
    private JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs;

    public ReimbursableExpenseTransactionLine(
            @JsonProperty("accountRef") RecordRef accountRef,
            @JsonProperty("invoiceTo") JsonNullable<? extends InvoiceTo> invoiceTo,
            @JsonProperty("netAmount") BigDecimal netAmount,
            @JsonProperty("taxAmount") Optional<? extends BigDecimal> taxAmount,
            @JsonProperty("taxRateRef") Optional<? extends RecordRef> taxRateRef,
            @JsonProperty("trackingRefs") JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs) {
        Utils.checkNotNull(accountRef, "accountRef");
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        Utils.checkNotNull(netAmount, "netAmount");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        Utils.checkNotNull(trackingRefs, "trackingRefs");
        this.accountRef = accountRef;
        this.invoiceTo = invoiceTo;
        this.netAmount = netAmount;
        this.taxAmount = taxAmount;
        this.taxRateRef = taxRateRef;
        this.trackingRefs = trackingRefs;
    }

    public RecordRef accountRef() {
        return accountRef;
    }

    /**
     * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
     */
    public JsonNullable<? extends InvoiceTo> invoiceTo() {
        return invoiceTo;
    }

    /**
     * Amount of the line, exclusive of tax.
     */
    public BigDecimal netAmount() {
        return netAmount;
    }

    /**
     * Amount of tax for the line.
     */
    public Optional<? extends BigDecimal> taxAmount() {
        return taxAmount;
    }

    public Optional<? extends RecordRef> taxRateRef() {
        return taxRateRef;
    }

    public JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs() {
        return trackingRefs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ReimbursableExpenseTransactionLine withAccountRef(RecordRef accountRef) {
        Utils.checkNotNull(accountRef, "accountRef");
        this.accountRef = accountRef;
        return this;
    }

    /**
     * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
     */
    public ReimbursableExpenseTransactionLine withInvoiceTo(InvoiceTo invoiceTo) {
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        this.invoiceTo = JsonNullable.of(invoiceTo);
        return this;
    }

    /**
     * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
     */
    public ReimbursableExpenseTransactionLine withInvoiceTo(JsonNullable<? extends InvoiceTo> invoiceTo) {
        Utils.checkNotNull(invoiceTo, "invoiceTo");
        this.invoiceTo = invoiceTo;
        return this;
    }

        /**
         * Amount of the line, exclusive of tax.
         */
    public ReimbursableExpenseTransactionLine withNetAmount(double netAmount) {
        this.netAmount = BigDecimal.valueOf(netAmount);
        return this;
    }

    /**
     * Amount of the line, exclusive of tax.
     */
    public ReimbursableExpenseTransactionLine withNetAmount(BigDecimal netAmount) {
        Utils.checkNotNull(netAmount, "netAmount");
        this.netAmount = netAmount;
        return this;
    }

    /**
     * Amount of tax for the line.
     */
    public ReimbursableExpenseTransactionLine withTaxAmount(BigDecimal taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = Optional.ofNullable(taxAmount);
        return this;
    }

        /**
         * Amount of tax for the line.
         */
    public ReimbursableExpenseTransactionLine withTaxAmount(double taxAmount) {
        this.taxAmount = Optional.of(BigDecimal.valueOf(taxAmount));
        return this;
    }

    /**
     * Amount of tax for the line.
     */
    public ReimbursableExpenseTransactionLine withTaxAmount(Optional<? extends BigDecimal> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    public ReimbursableExpenseTransactionLine withTaxRateRef(RecordRef taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = Optional.ofNullable(taxRateRef);
        return this;
    }

    public ReimbursableExpenseTransactionLine withTaxRateRef(Optional<? extends RecordRef> taxRateRef) {
        Utils.checkNotNull(taxRateRef, "taxRateRef");
        this.taxRateRef = taxRateRef;
        return this;
    }

    public ReimbursableExpenseTransactionLine withTrackingRefs(java.util.List<TrackingRef> trackingRefs) {
        Utils.checkNotNull(trackingRefs, "trackingRefs");
        this.trackingRefs = JsonNullable.of(trackingRefs);
        return this;
    }

    public ReimbursableExpenseTransactionLine withTrackingRefs(JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs) {
        Utils.checkNotNull(trackingRefs, "trackingRefs");
        this.trackingRefs = trackingRefs;
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
        ReimbursableExpenseTransactionLine other = (ReimbursableExpenseTransactionLine) o;
        return 
            java.util.Objects.deepEquals(this.accountRef, other.accountRef) &&
            java.util.Objects.deepEquals(this.invoiceTo, other.invoiceTo) &&
            java.util.Objects.deepEquals(this.netAmount, other.netAmount) &&
            java.util.Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            java.util.Objects.deepEquals(this.taxRateRef, other.taxRateRef) &&
            java.util.Objects.deepEquals(this.trackingRefs, other.trackingRefs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountRef,
            invoiceTo,
            netAmount,
            taxAmount,
            taxRateRef,
            trackingRefs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReimbursableExpenseTransactionLine.class,
                "accountRef", accountRef,
                "invoiceTo", invoiceTo,
                "netAmount", netAmount,
                "taxAmount", taxAmount,
                "taxRateRef", taxRateRef,
                "trackingRefs", trackingRefs);
    }
    
    public final static class Builder {
 
        private RecordRef accountRef;
 
        private JsonNullable<? extends InvoiceTo> invoiceTo = JsonNullable.undefined();
 
        private BigDecimal netAmount;
 
        private Optional<? extends BigDecimal> taxAmount = Optional.empty();
 
        private Optional<? extends RecordRef> taxRateRef = Optional.empty();
 
        private JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountRef(RecordRef accountRef) {
            Utils.checkNotNull(accountRef, "accountRef");
            this.accountRef = accountRef;
            return this;
        }

        /**
         * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
         */
        public Builder invoiceTo(InvoiceTo invoiceTo) {
            Utils.checkNotNull(invoiceTo, "invoiceTo");
            this.invoiceTo = JsonNullable.of(invoiceTo);
            return this;
        }

        /**
         * Unique identifier of the customer the expense is billable to. The invoiceTo object is currently only supported for QBO.
         */
        public Builder invoiceTo(JsonNullable<? extends InvoiceTo> invoiceTo) {
            Utils.checkNotNull(invoiceTo, "invoiceTo");
            this.invoiceTo = invoiceTo;
            return this;
        }

        /**
         * Amount of the line, exclusive of tax.
         */
        public Builder netAmount(double netAmount) {
            this.netAmount = BigDecimal.valueOf(netAmount);
            return this;
        }

        /**
         * Amount of the line, exclusive of tax.
         */
        public Builder netAmount(BigDecimal netAmount) {
            Utils.checkNotNull(netAmount, "netAmount");
            this.netAmount = netAmount;
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(BigDecimal taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = Optional.ofNullable(taxAmount);
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(double taxAmount) {
            this.taxAmount = Optional.of(BigDecimal.valueOf(taxAmount));
            return this;
        }

        /**
         * Amount of tax for the line.
         */
        public Builder taxAmount(Optional<? extends BigDecimal> taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = taxAmount;
            return this;
        }

        public Builder taxRateRef(RecordRef taxRateRef) {
            Utils.checkNotNull(taxRateRef, "taxRateRef");
            this.taxRateRef = Optional.ofNullable(taxRateRef);
            return this;
        }

        public Builder taxRateRef(Optional<? extends RecordRef> taxRateRef) {
            Utils.checkNotNull(taxRateRef, "taxRateRef");
            this.taxRateRef = taxRateRef;
            return this;
        }

        public Builder trackingRefs(java.util.List<TrackingRef> trackingRefs) {
            Utils.checkNotNull(trackingRefs, "trackingRefs");
            this.trackingRefs = JsonNullable.of(trackingRefs);
            return this;
        }

        public Builder trackingRefs(JsonNullable<? extends java.util.List<TrackingRef>> trackingRefs) {
            Utils.checkNotNull(trackingRefs, "trackingRefs");
            this.trackingRefs = trackingRefs;
            return this;
        }
        
        public ReimbursableExpenseTransactionLine build() {
            return new ReimbursableExpenseTransactionLine(
                accountRef,
                invoiceTo,
                netAmount,
                taxAmount,
                taxRateRef,
                trackingRefs);
        }
    }
}
