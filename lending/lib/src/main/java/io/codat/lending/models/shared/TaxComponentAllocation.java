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


public class TaxComponentAllocation {

    /**
     * Tax amount on order line sale as available from source commerce platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private JsonNullable<? extends Double> rate;

    /**
     * Taxes rates reference object depending on the rates being available on source commerce package.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxComponentRef")
    private Optional<? extends TaxComponentRef> taxComponentRef;

    public TaxComponentAllocation(
            @JsonProperty("rate") JsonNullable<? extends Double> rate,
            @JsonProperty("taxComponentRef") Optional<? extends TaxComponentRef> taxComponentRef) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(taxComponentRef, "taxComponentRef");
        this.rate = rate;
        this.taxComponentRef = taxComponentRef;
    }

    /**
     * Tax amount on order line sale as available from source commerce platform.
     */
    public JsonNullable<? extends Double> rate() {
        return rate;
    }

    /**
     * Taxes rates reference object depending on the rates being available on source commerce package.
     */
    public Optional<? extends TaxComponentRef> taxComponentRef() {
        return taxComponentRef;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Tax amount on order line sale as available from source commerce platform.
     */
    public TaxComponentAllocation withRate(double rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = JsonNullable.of(rate);
        return this;
    }

    /**
     * Tax amount on order line sale as available from source commerce platform.
     */
    public TaxComponentAllocation withRate(JsonNullable<? extends Double> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * Taxes rates reference object depending on the rates being available on source commerce package.
     */
    public TaxComponentAllocation withTaxComponentRef(TaxComponentRef taxComponentRef) {
        Utils.checkNotNull(taxComponentRef, "taxComponentRef");
        this.taxComponentRef = Optional.ofNullable(taxComponentRef);
        return this;
    }
    
    /**
     * Taxes rates reference object depending on the rates being available on source commerce package.
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
            java.util.Objects.deepEquals(this.rate, other.rate) &&
            java.util.Objects.deepEquals(this.taxComponentRef, other.taxComponentRef);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private JsonNullable<? extends Double> rate = JsonNullable.undefined();
 
        private Optional<? extends TaxComponentRef> taxComponentRef = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Tax amount on order line sale as available from source commerce platform.
         */
        public Builder rate(double rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = JsonNullable.of(rate);
            return this;
        }

        /**
         * Tax amount on order line sale as available from source commerce platform.
         */
        public Builder rate(JsonNullable<? extends Double> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * Taxes rates reference object depending on the rates being available on source commerce package.
         */
        public Builder taxComponentRef(TaxComponentRef taxComponentRef) {
            Utils.checkNotNull(taxComponentRef, "taxComponentRef");
            this.taxComponentRef = Optional.ofNullable(taxComponentRef);
            return this;
        }
        
        /**
         * Taxes rates reference object depending on the rates being available on source commerce package.
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

