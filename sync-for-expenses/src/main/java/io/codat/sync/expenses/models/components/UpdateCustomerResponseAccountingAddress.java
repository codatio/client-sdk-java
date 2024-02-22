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
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateCustomerResponseAccountingAddress {

    /**
     * City of the customer address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private JsonNullable<? extends String> city;

    /**
     * Country of the customer address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<? extends String> country;

    /**
     * Line 1 of the customer address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line1")
    private JsonNullable<? extends String> line1;

    /**
     * Line 2 of the customer address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line2")
    private JsonNullable<? extends String> line2;

    /**
     * Postal code or zip code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private JsonNullable<? extends String> postalCode;

    /**
     * Region of the customer address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private JsonNullable<? extends String> region;

    /**
     * The type of the address
     */
    @JsonProperty("type")
    private AccountingAddressType type;

    public UpdateCustomerResponseAccountingAddress(
            @JsonProperty("city") JsonNullable<? extends String> city,
            @JsonProperty("country") JsonNullable<? extends String> country,
            @JsonProperty("line1") JsonNullable<? extends String> line1,
            @JsonProperty("line2") JsonNullable<? extends String> line2,
            @JsonProperty("postalCode") JsonNullable<? extends String> postalCode,
            @JsonProperty("region") JsonNullable<? extends String> region,
            @JsonProperty("type") AccountingAddressType type) {
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(line1, "line1");
        Utils.checkNotNull(line2, "line2");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(type, "type");
        this.city = city;
        this.country = country;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.region = region;
        this.type = type;
    }

    /**
     * City of the customer address.
     */
    public JsonNullable<? extends String> city() {
        return city;
    }

    /**
     * Country of the customer address.
     */
    public JsonNullable<? extends String> country() {
        return country;
    }

    /**
     * Line 1 of the customer address.
     */
    public JsonNullable<? extends String> line1() {
        return line1;
    }

    /**
     * Line 2 of the customer address.
     */
    public JsonNullable<? extends String> line2() {
        return line2;
    }

    /**
     * Postal code or zip code.
     */
    public JsonNullable<? extends String> postalCode() {
        return postalCode;
    }

    /**
     * Region of the customer address.
     */
    public JsonNullable<? extends String> region() {
        return region;
    }

    /**
     * The type of the address
     */
    public AccountingAddressType type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * City of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = JsonNullable.of(city);
        return this;
    }

    /**
     * City of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withCity(JsonNullable<? extends String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Country of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * Country of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withCountry(JsonNullable<? extends String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * Line 1 of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withLine1(String line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = JsonNullable.of(line1);
        return this;
    }

    /**
     * Line 1 of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withLine1(JsonNullable<? extends String> line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = line1;
        return this;
    }

    /**
     * Line 2 of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withLine2(String line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = JsonNullable.of(line2);
        return this;
    }

    /**
     * Line 2 of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withLine2(JsonNullable<? extends String> line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = line2;
        return this;
    }

    /**
     * Postal code or zip code.
     */
    public UpdateCustomerResponseAccountingAddress withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = JsonNullable.of(postalCode);
        return this;
    }

    /**
     * Postal code or zip code.
     */
    public UpdateCustomerResponseAccountingAddress withPostalCode(JsonNullable<? extends String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Region of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = JsonNullable.of(region);
        return this;
    }

    /**
     * Region of the customer address.
     */
    public UpdateCustomerResponseAccountingAddress withRegion(JsonNullable<? extends String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * The type of the address
     */
    public UpdateCustomerResponseAccountingAddress withType(AccountingAddressType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        UpdateCustomerResponseAccountingAddress other = (UpdateCustomerResponseAccountingAddress) o;
        return 
            java.util.Objects.deepEquals(this.city, other.city) &&
            java.util.Objects.deepEquals(this.country, other.country) &&
            java.util.Objects.deepEquals(this.line1, other.line1) &&
            java.util.Objects.deepEquals(this.line2, other.line2) &&
            java.util.Objects.deepEquals(this.postalCode, other.postalCode) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            city,
            country,
            line1,
            line2,
            postalCode,
            region,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCustomerResponseAccountingAddress.class,
                "city", city,
                "country", country,
                "line1", line1,
                "line2", line2,
                "postalCode", postalCode,
                "region", region,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> city = JsonNullable.undefined();
 
        private JsonNullable<? extends String> country = JsonNullable.undefined();
 
        private JsonNullable<? extends String> line1 = JsonNullable.undefined();
 
        private JsonNullable<? extends String> line2 = JsonNullable.undefined();
 
        private JsonNullable<? extends String> postalCode = JsonNullable.undefined();
 
        private JsonNullable<? extends String> region = JsonNullable.undefined();
 
        private AccountingAddressType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * City of the customer address.
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = JsonNullable.of(city);
            return this;
        }

        /**
         * City of the customer address.
         */
        public Builder city(JsonNullable<? extends String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Country of the customer address.
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * Country of the customer address.
         */
        public Builder country(JsonNullable<? extends String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * Line 1 of the customer address.
         */
        public Builder line1(String line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = JsonNullable.of(line1);
            return this;
        }

        /**
         * Line 1 of the customer address.
         */
        public Builder line1(JsonNullable<? extends String> line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = line1;
            return this;
        }

        /**
         * Line 2 of the customer address.
         */
        public Builder line2(String line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = JsonNullable.of(line2);
            return this;
        }

        /**
         * Line 2 of the customer address.
         */
        public Builder line2(JsonNullable<? extends String> line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = line2;
            return this;
        }

        /**
         * Postal code or zip code.
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = JsonNullable.of(postalCode);
            return this;
        }

        /**
         * Postal code or zip code.
         */
        public Builder postalCode(JsonNullable<? extends String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Region of the customer address.
         */
        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = JsonNullable.of(region);
            return this;
        }

        /**
         * Region of the customer address.
         */
        public Builder region(JsonNullable<? extends String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * The type of the address
         */
        public Builder type(AccountingAddressType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public UpdateCustomerResponseAccountingAddress build() {
            return new UpdateCustomerResponseAccountingAddress(
                city,
                country,
                line1,
                line2,
                postalCode,
                region,
                type);
        }
    }
}

