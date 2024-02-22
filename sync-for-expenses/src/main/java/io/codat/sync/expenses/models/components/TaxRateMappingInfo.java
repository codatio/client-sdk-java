/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxRateMappingInfo {

    /**
     * Code for the tax rate from the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<? extends String> code;

    /**
     * Effective tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effectiveTaxRate")
    private Optional<? extends Double> effectiveTaxRate;

    /**
     * Unique identifier of tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<? extends String> id;

    /**
     * Name of the tax rate in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalTaxRate")
    private Optional<? extends Double> totalTaxRate;

    /**
     * Supported transaction types for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validTransactionTypes")
    private JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes;

    public TaxRateMappingInfo(
            @JsonProperty("code") JsonNullable<? extends String> code,
            @JsonProperty("effectiveTaxRate") Optional<? extends Double> effectiveTaxRate,
            @JsonProperty("id") JsonNullable<? extends String> id,
            @JsonProperty("name") JsonNullable<? extends String> name,
            @JsonProperty("totalTaxRate") Optional<? extends Double> totalTaxRate,
            @JsonProperty("validTransactionTypes") JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.code = code;
        this.effectiveTaxRate = effectiveTaxRate;
        this.id = id;
        this.name = name;
        this.totalTaxRate = totalTaxRate;
        this.validTransactionTypes = validTransactionTypes;
    }

    /**
     * Code for the tax rate from the accounting platform.
     */
    public JsonNullable<? extends String> code() {
        return code;
    }

    /**
     * Effective tax rate.
     */
    public Optional<? extends Double> effectiveTaxRate() {
        return effectiveTaxRate;
    }

    /**
     * Unique identifier of tax rate.
     */
    public JsonNullable<? extends String> id() {
        return id;
    }

    /**
     * Name of the tax rate in the accounting platform.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    public Optional<? extends Double> totalTaxRate() {
        return totalTaxRate;
    }

    /**
     * Supported transaction types for the account.
     */
    public JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes() {
        return validTransactionTypes;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Code for the tax rate from the accounting platform.
     */
    public TaxRateMappingInfo withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Code for the tax rate from the accounting platform.
     */
    public TaxRateMappingInfo withCode(JsonNullable<? extends String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Effective tax rate.
     */
    public TaxRateMappingInfo withEffectiveTaxRate(double effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = Optional.ofNullable(effectiveTaxRate);
        return this;
    }
    
    /**
     * Effective tax rate.
     */
    public TaxRateMappingInfo withEffectiveTaxRate(Optional<? extends Double> effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = effectiveTaxRate;
        return this;
    }

    /**
     * Unique identifier of tax rate.
     */
    public TaxRateMappingInfo withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier of tax rate.
     */
    public TaxRateMappingInfo withId(JsonNullable<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the tax rate in the accounting platform.
     */
    public TaxRateMappingInfo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the tax rate in the accounting platform.
     */
    public TaxRateMappingInfo withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    public TaxRateMappingInfo withTotalTaxRate(double totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = Optional.ofNullable(totalTaxRate);
        return this;
    }
    
    /**
     * Total (not compounded) sum of the components of a tax rate.
     */
    public TaxRateMappingInfo withTotalTaxRate(Optional<? extends Double> totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = totalTaxRate;
        return this;
    }

    /**
     * Supported transaction types for the account.
     */
    public TaxRateMappingInfo withValidTransactionTypes(java.util.List<TaxRateMappingInfoValidTransactionTypes> validTransactionTypes) {
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.validTransactionTypes = JsonNullable.of(validTransactionTypes);
        return this;
    }

    /**
     * Supported transaction types for the account.
     */
    public TaxRateMappingInfo withValidTransactionTypes(JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes) {
        Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
        this.validTransactionTypes = validTransactionTypes;
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
        TaxRateMappingInfo other = (TaxRateMappingInfo) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.effectiveTaxRate, other.effectiveTaxRate) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.totalTaxRate, other.totalTaxRate) &&
            java.util.Objects.deepEquals(this.validTransactionTypes, other.validTransactionTypes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            effectiveTaxRate,
            id,
            name,
            totalTaxRate,
            validTransactionTypes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRateMappingInfo.class,
                "code", code,
                "effectiveTaxRate", effectiveTaxRate,
                "id", id,
                "name", name,
                "totalTaxRate", totalTaxRate,
                "validTransactionTypes", validTransactionTypes);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> code = JsonNullable.undefined();
 
        private Optional<? extends Double> effectiveTaxRate = Optional.empty();
 
        private JsonNullable<? extends String> id = JsonNullable.undefined();
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();
 
        private Optional<? extends Double> totalTaxRate = Optional.empty();
 
        private JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Code for the tax rate from the accounting platform.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Code for the tax rate from the accounting platform.
         */
        public Builder code(JsonNullable<? extends String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Effective tax rate.
         */
        public Builder effectiveTaxRate(double effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = Optional.ofNullable(effectiveTaxRate);
            return this;
        }
        
        /**
         * Effective tax rate.
         */
        public Builder effectiveTaxRate(Optional<? extends Double> effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = effectiveTaxRate;
            return this;
        }

        /**
         * Unique identifier of tax rate.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier of tax rate.
         */
        public Builder id(JsonNullable<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the tax rate in the accounting platform.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the tax rate in the accounting platform.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
        public Builder totalTaxRate(double totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = Optional.ofNullable(totalTaxRate);
            return this;
        }
        
        /**
         * Total (not compounded) sum of the components of a tax rate.
         */
        public Builder totalTaxRate(Optional<? extends Double> totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = totalTaxRate;
            return this;
        }

        /**
         * Supported transaction types for the account.
         */
        public Builder validTransactionTypes(java.util.List<TaxRateMappingInfoValidTransactionTypes> validTransactionTypes) {
            Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
            this.validTransactionTypes = JsonNullable.of(validTransactionTypes);
            return this;
        }

        /**
         * Supported transaction types for the account.
         */
        public Builder validTransactionTypes(JsonNullable<? extends java.util.List<TaxRateMappingInfoValidTransactionTypes>> validTransactionTypes) {
            Utils.checkNotNull(validTransactionTypes, "validTransactionTypes");
            this.validTransactionTypes = validTransactionTypes;
            return this;
        }
        
        public TaxRateMappingInfo build() {
            return new TaxRateMappingInfo(
                code,
                effectiveTaxRate,
                id,
                name,
                totalTaxRate,
                validTransactionTypes);
        }
    }
}

