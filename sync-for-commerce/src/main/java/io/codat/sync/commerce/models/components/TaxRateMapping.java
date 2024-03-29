/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxRateMapping {

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedAccountingTaxRateId")
    private JsonNullable<? extends String> selectedAccountingTaxRateId;

    /**
     * Selected tax component id from the list of tax components on the commerce software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedCommerceTaxRateIds")
    private JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds;

    public TaxRateMapping(
            @JsonProperty("selectedAccountingTaxRateId") JsonNullable<? extends String> selectedAccountingTaxRateId,
            @JsonProperty("selectedCommerceTaxRateIds") JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds) {
        Utils.checkNotNull(selectedAccountingTaxRateId, "selectedAccountingTaxRateId");
        Utils.checkNotNull(selectedCommerceTaxRateIds, "selectedCommerceTaxRateIds");
        this.selectedAccountingTaxRateId = selectedAccountingTaxRateId;
        this.selectedCommerceTaxRateIds = selectedCommerceTaxRateIds;
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    public JsonNullable<? extends String> selectedAccountingTaxRateId() {
        return selectedAccountingTaxRateId;
    }

    /**
     * Selected tax component id from the list of tax components on the commerce software.
     */
    public JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds() {
        return selectedCommerceTaxRateIds;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    public TaxRateMapping withSelectedAccountingTaxRateId(String selectedAccountingTaxRateId) {
        Utils.checkNotNull(selectedAccountingTaxRateId, "selectedAccountingTaxRateId");
        this.selectedAccountingTaxRateId = JsonNullable.of(selectedAccountingTaxRateId);
        return this;
    }

    /**
     * Selected tax rate id from the list of tax rates on the accounting software.
     */
    public TaxRateMapping withSelectedAccountingTaxRateId(JsonNullable<? extends String> selectedAccountingTaxRateId) {
        Utils.checkNotNull(selectedAccountingTaxRateId, "selectedAccountingTaxRateId");
        this.selectedAccountingTaxRateId = selectedAccountingTaxRateId;
        return this;
    }

    /**
     * Selected tax component id from the list of tax components on the commerce software.
     */
    public TaxRateMapping withSelectedCommerceTaxRateIds(java.util.List<String> selectedCommerceTaxRateIds) {
        Utils.checkNotNull(selectedCommerceTaxRateIds, "selectedCommerceTaxRateIds");
        this.selectedCommerceTaxRateIds = JsonNullable.of(selectedCommerceTaxRateIds);
        return this;
    }

    /**
     * Selected tax component id from the list of tax components on the commerce software.
     */
    public TaxRateMapping withSelectedCommerceTaxRateIds(JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds) {
        Utils.checkNotNull(selectedCommerceTaxRateIds, "selectedCommerceTaxRateIds");
        this.selectedCommerceTaxRateIds = selectedCommerceTaxRateIds;
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
        TaxRateMapping other = (TaxRateMapping) o;
        return 
            java.util.Objects.deepEquals(this.selectedAccountingTaxRateId, other.selectedAccountingTaxRateId) &&
            java.util.Objects.deepEquals(this.selectedCommerceTaxRateIds, other.selectedCommerceTaxRateIds);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            selectedAccountingTaxRateId,
            selectedCommerceTaxRateIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRateMapping.class,
                "selectedAccountingTaxRateId", selectedAccountingTaxRateId,
                "selectedCommerceTaxRateIds", selectedCommerceTaxRateIds);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> selectedAccountingTaxRateId = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Selected tax rate id from the list of tax rates on the accounting software.
         */
        public Builder selectedAccountingTaxRateId(String selectedAccountingTaxRateId) {
            Utils.checkNotNull(selectedAccountingTaxRateId, "selectedAccountingTaxRateId");
            this.selectedAccountingTaxRateId = JsonNullable.of(selectedAccountingTaxRateId);
            return this;
        }

        /**
         * Selected tax rate id from the list of tax rates on the accounting software.
         */
        public Builder selectedAccountingTaxRateId(JsonNullable<? extends String> selectedAccountingTaxRateId) {
            Utils.checkNotNull(selectedAccountingTaxRateId, "selectedAccountingTaxRateId");
            this.selectedAccountingTaxRateId = selectedAccountingTaxRateId;
            return this;
        }

        /**
         * Selected tax component id from the list of tax components on the commerce software.
         */
        public Builder selectedCommerceTaxRateIds(java.util.List<String> selectedCommerceTaxRateIds) {
            Utils.checkNotNull(selectedCommerceTaxRateIds, "selectedCommerceTaxRateIds");
            this.selectedCommerceTaxRateIds = JsonNullable.of(selectedCommerceTaxRateIds);
            return this;
        }

        /**
         * Selected tax component id from the list of tax components on the commerce software.
         */
        public Builder selectedCommerceTaxRateIds(JsonNullable<? extends java.util.List<String>> selectedCommerceTaxRateIds) {
            Utils.checkNotNull(selectedCommerceTaxRateIds, "selectedCommerceTaxRateIds");
            this.selectedCommerceTaxRateIds = selectedCommerceTaxRateIds;
            return this;
        }
        
        public TaxRateMapping build() {
            return new TaxRateMapping(
                selectedAccountingTaxRateId,
                selectedCommerceTaxRateIds);
        }
    }
}

