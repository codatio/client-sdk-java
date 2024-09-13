/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxRateAmount {

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedTaxRateId")
    private JsonNullable<String> selectedTaxRateId;

    /**
     * Array of tax rate options object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxRateOptions")
    private JsonNullable<? extends List<ConfigurationOption>> taxRateOptions;

    @JsonCreator
    public TaxRateAmount(
            @JsonProperty("selectedTaxRateId") JsonNullable<String> selectedTaxRateId,
            @JsonProperty("taxRateOptions") JsonNullable<? extends List<ConfigurationOption>> taxRateOptions) {
        Utils.checkNotNull(selectedTaxRateId, "selectedTaxRateId");
        Utils.checkNotNull(taxRateOptions, "taxRateOptions");
        this.selectedTaxRateId = selectedTaxRateId;
        this.taxRateOptions = taxRateOptions;
    }
    
    public TaxRateAmount() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> selectedTaxRateId() {
        return selectedTaxRateId;
    }

    /**
     * Array of tax rate options object.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<ConfigurationOption>> taxRateOptions() {
        return (JsonNullable<List<ConfigurationOption>>) taxRateOptions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    public TaxRateAmount withSelectedTaxRateId(String selectedTaxRateId) {
        Utils.checkNotNull(selectedTaxRateId, "selectedTaxRateId");
        this.selectedTaxRateId = JsonNullable.of(selectedTaxRateId);
        return this;
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    public TaxRateAmount withSelectedTaxRateId(JsonNullable<String> selectedTaxRateId) {
        Utils.checkNotNull(selectedTaxRateId, "selectedTaxRateId");
        this.selectedTaxRateId = selectedTaxRateId;
        return this;
    }

    /**
     * Array of tax rate options object.
     */
    public TaxRateAmount withTaxRateOptions(List<ConfigurationOption> taxRateOptions) {
        Utils.checkNotNull(taxRateOptions, "taxRateOptions");
        this.taxRateOptions = JsonNullable.of(taxRateOptions);
        return this;
    }

    /**
     * Array of tax rate options object.
     */
    public TaxRateAmount withTaxRateOptions(JsonNullable<? extends List<ConfigurationOption>> taxRateOptions) {
        Utils.checkNotNull(taxRateOptions, "taxRateOptions");
        this.taxRateOptions = taxRateOptions;
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
        TaxRateAmount other = (TaxRateAmount) o;
        return 
            Objects.deepEquals(this.selectedTaxRateId, other.selectedTaxRateId) &&
            Objects.deepEquals(this.taxRateOptions, other.taxRateOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            selectedTaxRateId,
            taxRateOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRateAmount.class,
                "selectedTaxRateId", selectedTaxRateId,
                "taxRateOptions", taxRateOptions);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> selectedTaxRateId = JsonNullable.undefined();
 
        private JsonNullable<? extends List<ConfigurationOption>> taxRateOptions = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Selected tax rate id from the list of tax rates on the accounting software.
         */
        public Builder selectedTaxRateId(String selectedTaxRateId) {
            Utils.checkNotNull(selectedTaxRateId, "selectedTaxRateId");
            this.selectedTaxRateId = JsonNullable.of(selectedTaxRateId);
            return this;
        }

        /**
         * Selected tax rate id from the list of tax rates on the accounting software.
         */
        public Builder selectedTaxRateId(JsonNullable<String> selectedTaxRateId) {
            Utils.checkNotNull(selectedTaxRateId, "selectedTaxRateId");
            this.selectedTaxRateId = selectedTaxRateId;
            return this;
        }

        /**
         * Array of tax rate options object.
         */
        public Builder taxRateOptions(List<ConfigurationOption> taxRateOptions) {
            Utils.checkNotNull(taxRateOptions, "taxRateOptions");
            this.taxRateOptions = JsonNullable.of(taxRateOptions);
            return this;
        }

        /**
         * Array of tax rate options object.
         */
        public Builder taxRateOptions(JsonNullable<? extends List<ConfigurationOption>> taxRateOptions) {
            Utils.checkNotNull(taxRateOptions, "taxRateOptions");
            this.taxRateOptions = taxRateOptions;
            return this;
        }
        
        public TaxRateAmount build() {
            return new TaxRateAmount(
                selectedTaxRateId,
                taxRateOptions);
        }
    }
}

