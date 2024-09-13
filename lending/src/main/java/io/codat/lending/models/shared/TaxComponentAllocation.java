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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxComponentAllocation {

    /**
     * Tax amount on order line sale as available from source commerce software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private JsonNullable<? extends BigDecimal> rate;

    /**
     * Taxes rates reference object depending on the rates being available on source commerce software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxComponentRef")
    private Optional<? extends TaxComponentRef> taxComponentRef;

    @JsonCreator
    public TaxComponentAllocation(
            @JsonProperty("rate") JsonNullable<? extends BigDecimal> rate,
            @JsonProperty("taxComponentRef") Optional<? extends TaxComponentRef> taxComponentRef) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(taxComponentRef, "taxComponentRef");
        this.rate = rate;
        this.taxComponentRef = taxComponentRef;
    }
    
    public TaxComponentAllocation() {
        this(JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Tax amount on order line sale as available from source commerce software.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> rate() {
        return (JsonNullable<BigDecimal>) rate;
    }

    /**
     * Taxes rates reference object depending on the rates being available on source commerce software.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxComponentRef> taxComponentRef() {
        return (Optional<TaxComponentRef>) taxComponentRef;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Tax amount on order line sale as available from source commerce software.
     */
    public TaxComponentAllocation withRate(BigDecimal rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = JsonNullable.of(rate);
        return this;
    }

        /**
         * Tax amount on order line sale as available from source commerce software.
         */
    public TaxComponentAllocation withRate(double rate) {
        this.rate = JsonNullable.of(BigDecimal.valueOf(rate));
        return this;
    }

    /**
     * Tax amount on order line sale as available from source commerce software.
     */
    public TaxComponentAllocation withRate(JsonNullable<? extends BigDecimal> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * Taxes rates reference object depending on the rates being available on source commerce software.
     */
    public TaxComponentAllocation withTaxComponentRef(TaxComponentRef taxComponentRef) {
        Utils.checkNotNull(taxComponentRef, "taxComponentRef");
        this.taxComponentRef = Optional.ofNullable(taxComponentRef);
        return this;
    }

    /**
     * Taxes rates reference object depending on the rates being available on source commerce software.
     */
    public TaxComponentAllocation withTaxComponentRef(Optional<? extends TaxComponentRef> taxComponentRef) {
        Utils.checkNotNull(taxComponentRef, "taxComponentRef");
        this.taxComponentRef = taxComponentRef;
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
        TaxComponentAllocation other = (TaxComponentAllocation) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.taxComponentRef, other.taxComponentRef);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            taxComponentRef);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxComponentAllocation.class,
                "rate", rate,
                "taxComponentRef", taxComponentRef);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends BigDecimal> rate = JsonNullable.undefined();
 
        private Optional<? extends TaxComponentRef> taxComponentRef = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Tax amount on order line sale as available from source commerce software.
         */
        public Builder rate(BigDecimal rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = JsonNullable.of(rate);
            return this;
        }

        /**
         * Tax amount on order line sale as available from source commerce software.
         */
        public Builder rate(double rate) {
            this.rate = JsonNullable.of(BigDecimal.valueOf(rate));
            return this;
        }

        /**
         * Tax amount on order line sale as available from source commerce software.
         */
        public Builder rate(JsonNullable<? extends BigDecimal> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * Taxes rates reference object depending on the rates being available on source commerce software.
         */
        public Builder taxComponentRef(TaxComponentRef taxComponentRef) {
            Utils.checkNotNull(taxComponentRef, "taxComponentRef");
            this.taxComponentRef = Optional.ofNullable(taxComponentRef);
            return this;
        }

        /**
         * Taxes rates reference object depending on the rates being available on source commerce software.
         */
        public Builder taxComponentRef(Optional<? extends TaxComponentRef> taxComponentRef) {
            Utils.checkNotNull(taxComponentRef, "taxComponentRef");
            this.taxComponentRef = taxComponentRef;
            return this;
        }
        
        public TaxComponentAllocation build() {
            return new TaxComponentAllocation(
                rate,
                taxComponentRef);
        }
    }
}

