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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CompanyInformation - Gets the latest basic info for a company.
 */

public class CompanyInformation {

    /**
     * Currency set in the accounting software of the linked company. Used by the currency rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("baseCurrency")
    private JsonNullable<String> baseCurrency;

    /**
     * Name of the linked company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyName")
    private JsonNullable<String> companyName;

    @JsonCreator
    public CompanyInformation(
            @JsonProperty("baseCurrency") JsonNullable<String> baseCurrency,
            @JsonProperty("companyName") JsonNullable<String> companyName) {
        Utils.checkNotNull(baseCurrency, "baseCurrency");
        Utils.checkNotNull(companyName, "companyName");
        this.baseCurrency = baseCurrency;
        this.companyName = companyName;
    }
    
    public CompanyInformation() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Currency set in the accounting software of the linked company. Used by the currency rate.
     */
    @JsonIgnore
    public JsonNullable<String> baseCurrency() {
        return baseCurrency;
    }

    /**
     * Name of the linked company.
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Currency set in the accounting software of the linked company. Used by the currency rate.
     */
    public CompanyInformation withBaseCurrency(String baseCurrency) {
        Utils.checkNotNull(baseCurrency, "baseCurrency");
        this.baseCurrency = JsonNullable.of(baseCurrency);
        return this;
    }

    /**
     * Currency set in the accounting software of the linked company. Used by the currency rate.
     */
    public CompanyInformation withBaseCurrency(JsonNullable<String> baseCurrency) {
        Utils.checkNotNull(baseCurrency, "baseCurrency");
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Name of the linked company.
     */
    public CompanyInformation withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * Name of the linked company.
     */
    public CompanyInformation withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
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
        CompanyInformation other = (CompanyInformation) o;
        return 
            Objects.deepEquals(this.baseCurrency, other.baseCurrency) &&
            Objects.deepEquals(this.companyName, other.companyName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            baseCurrency,
            companyName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyInformation.class,
                "baseCurrency", baseCurrency,
                "companyName", companyName);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> baseCurrency = JsonNullable.undefined();
 
        private JsonNullable<String> companyName = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Currency set in the accounting software of the linked company. Used by the currency rate.
         */
        public Builder baseCurrency(String baseCurrency) {
            Utils.checkNotNull(baseCurrency, "baseCurrency");
            this.baseCurrency = JsonNullable.of(baseCurrency);
            return this;
        }

        /**
         * Currency set in the accounting software of the linked company. Used by the currency rate.
         */
        public Builder baseCurrency(JsonNullable<String> baseCurrency) {
            Utils.checkNotNull(baseCurrency, "baseCurrency");
            this.baseCurrency = baseCurrency;
            return this;
        }

        /**
         * Name of the linked company.
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * Name of the linked company.
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }
        
        public CompanyInformation build() {
            return new CompanyInformation(
                baseCurrency,
                companyName);
        }
    }
}

