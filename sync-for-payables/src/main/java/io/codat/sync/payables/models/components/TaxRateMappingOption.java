/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payables.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxRateMappingOption {

    /**
     * Code for the tax rate from the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * See Effective tax rates description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effectiveTaxRate")
    private JsonNullable<? extends BigDecimal> effectiveTaxRate;

    /**
     * Identifier for the tax rate, unique for the company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Codat-augmented name of the tax rate in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Status of the tax rate in the accounting software.  
     * - `Active` - An active tax rate in use by a company.  
     * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends TaxRateStatus> status;

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalTaxRate")
    private JsonNullable<? extends BigDecimal> totalTaxRate;

    @JsonCreator
    public TaxRateMappingOption(
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("effectiveTaxRate") JsonNullable<? extends BigDecimal> effectiveTaxRate,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("status") Optional<? extends TaxRateStatus> status,
            @JsonProperty("totalTaxRate") JsonNullable<? extends BigDecimal> totalTaxRate) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.code = code;
        this.effectiveTaxRate = effectiveTaxRate;
        this.id = id;
        this.name = name;
        this.status = status;
        this.totalTaxRate = totalTaxRate;
    }
    
    public TaxRateMappingOption() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * Code for the tax rate from the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * See Effective tax rates description.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> effectiveTaxRate() {
        return (JsonNullable<BigDecimal>) effectiveTaxRate;
    }

    /**
     * Identifier for the tax rate, unique for the company in the accounting software.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Codat-augmented name of the tax rate in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Status of the tax rate in the accounting software.  
     * - `Active` - An active tax rate in use by a company.  
     * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxRateStatus> status() {
        return (Optional<TaxRateStatus>) status;
    }

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BigDecimal> totalTaxRate() {
        return (JsonNullable<BigDecimal>) totalTaxRate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Code for the tax rate from the accounting software.
     */
    public TaxRateMappingOption withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Code for the tax rate from the accounting software.
     */
    public TaxRateMappingOption withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * See Effective tax rates description.
     */
    public TaxRateMappingOption withEffectiveTaxRate(BigDecimal effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = JsonNullable.of(effectiveTaxRate);
        return this;
    }

        /**
         * See Effective tax rates description.
         */
    public TaxRateMappingOption withEffectiveTaxRate(double effectiveTaxRate) {
        this.effectiveTaxRate = JsonNullable.of(BigDecimal.valueOf(effectiveTaxRate));
        return this;
    }

    /**
     * See Effective tax rates description.
     */
    public TaxRateMappingOption withEffectiveTaxRate(JsonNullable<? extends BigDecimal> effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = effectiveTaxRate;
        return this;
    }

    /**
     * Identifier for the tax rate, unique for the company in the accounting software.
     */
    public TaxRateMappingOption withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the tax rate, unique for the company in the accounting software.
     */
    public TaxRateMappingOption withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Codat-augmented name of the tax rate in the accounting software.
     */
    public TaxRateMappingOption withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Codat-augmented name of the tax rate in the accounting software.
     */
    public TaxRateMappingOption withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Status of the tax rate in the accounting software.  
     * - `Active` - An active tax rate in use by a company.  
     * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
     */
    public TaxRateMappingOption withStatus(TaxRateStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of the tax rate in the accounting software.  
     * - `Active` - An active tax rate in use by a company.  
     * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
     */
    public TaxRateMappingOption withStatus(Optional<? extends TaxRateStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    public TaxRateMappingOption withTotalTaxRate(BigDecimal totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = JsonNullable.of(totalTaxRate);
        return this;
    }

        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
    public TaxRateMappingOption withTotalTaxRate(double totalTaxRate) {
        this.totalTaxRate = JsonNullable.of(BigDecimal.valueOf(totalTaxRate));
        return this;
    }

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    public TaxRateMappingOption withTotalTaxRate(JsonNullable<? extends BigDecimal> totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = totalTaxRate;
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
        TaxRateMappingOption other = (TaxRateMappingOption) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.effectiveTaxRate, other.effectiveTaxRate) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.totalTaxRate, other.totalTaxRate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            effectiveTaxRate,
            id,
            name,
            status,
            totalTaxRate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRateMappingOption.class,
                "code", code,
                "effectiveTaxRate", effectiveTaxRate,
                "id", id,
                "name", name,
                "status", status,
                "totalTaxRate", totalTaxRate);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private JsonNullable<? extends BigDecimal> effectiveTaxRate = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<? extends TaxRateStatus> status = Optional.empty();
 
        private JsonNullable<? extends BigDecimal> totalTaxRate = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Code for the tax rate from the accounting software.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Code for the tax rate from the accounting software.
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * See Effective tax rates description.
         */
        public Builder effectiveTaxRate(BigDecimal effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = JsonNullable.of(effectiveTaxRate);
            return this;
        }

        /**
         * See Effective tax rates description.
         */
        public Builder effectiveTaxRate(double effectiveTaxRate) {
            this.effectiveTaxRate = JsonNullable.of(BigDecimal.valueOf(effectiveTaxRate));
            return this;
        }

        /**
         * See Effective tax rates description.
         */
        public Builder effectiveTaxRate(JsonNullable<? extends BigDecimal> effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = effectiveTaxRate;
            return this;
        }

        /**
         * Identifier for the tax rate, unique for the company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the tax rate, unique for the company in the accounting software.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Codat-augmented name of the tax rate in the accounting software.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Codat-augmented name of the tax rate in the accounting software.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Status of the tax rate in the accounting software.  
         * - `Active` - An active tax rate in use by a company.  
         * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
         */
        public Builder status(TaxRateStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the tax rate in the accounting software.  
         * - `Active` - An active tax rate in use by a company.  
         * - `Archived` - A tax rate that has been archived or is inactive in the accounting software.  
         */
        public Builder status(Optional<? extends TaxRateStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
        public Builder totalTaxRate(BigDecimal totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = JsonNullable.of(totalTaxRate);
            return this;
        }

        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
        public Builder totalTaxRate(double totalTaxRate) {
            this.totalTaxRate = JsonNullable.of(BigDecimal.valueOf(totalTaxRate));
            return this;
        }

        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
        public Builder totalTaxRate(JsonNullable<? extends BigDecimal> totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = totalTaxRate;
            return this;
        }
        
        public TaxRateMappingOption build() {
            return new TaxRateMappingOption(
                code,
                effectiveTaxRate,
                id,
                name,
                status,
                totalTaxRate);
        }
    }
}

