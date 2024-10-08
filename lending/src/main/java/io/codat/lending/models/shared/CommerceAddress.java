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
import java.util.Objects;
import java.util.Optional;


public class CommerceAddress {

    /**
     * The third line of the address, or city
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    /**
     * The country for the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    /**
     * The first line of the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line1")
    private Optional<String> line1;

    /**
     * The second line of the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line2")
    private Optional<String> line2;

    /**
     * The postal (or zip) code for the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    /**
     * The fourth line of the address, or region
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<String> region;

    /**
     * The type of the address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CommerceAddressType> type;

    @JsonCreator
    public CommerceAddress(
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("line1") Optional<String> line1,
            @JsonProperty("line2") Optional<String> line2,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("region") Optional<String> region,
            @JsonProperty("type") Optional<? extends CommerceAddressType> type) {
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
    
    public CommerceAddress() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The third line of the address, or city
     */
    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    /**
     * The country for the address
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    /**
     * The first line of the address
     */
    @JsonIgnore
    public Optional<String> line1() {
        return line1;
    }

    /**
     * The second line of the address
     */
    @JsonIgnore
    public Optional<String> line2() {
        return line2;
    }

    /**
     * The postal (or zip) code for the address
     */
    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    /**
     * The fourth line of the address, or region
     */
    @JsonIgnore
    public Optional<String> region() {
        return region;
    }

    /**
     * The type of the address
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CommerceAddressType> type() {
        return (Optional<CommerceAddressType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The third line of the address, or city
     */
    public CommerceAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    /**
     * The third line of the address, or city
     */
    public CommerceAddress withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * The country for the address
     */
    public CommerceAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * The country for the address
     */
    public CommerceAddress withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * The first line of the address
     */
    public CommerceAddress withLine1(String line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = Optional.ofNullable(line1);
        return this;
    }

    /**
     * The first line of the address
     */
    public CommerceAddress withLine1(Optional<String> line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = line1;
        return this;
    }

    /**
     * The second line of the address
     */
    public CommerceAddress withLine2(String line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = Optional.ofNullable(line2);
        return this;
    }

    /**
     * The second line of the address
     */
    public CommerceAddress withLine2(Optional<String> line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = line2;
        return this;
    }

    /**
     * The postal (or zip) code for the address
     */
    public CommerceAddress withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    /**
     * The postal (or zip) code for the address
     */
    public CommerceAddress withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The fourth line of the address, or region
     */
    public CommerceAddress withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * The fourth line of the address, or region
     */
    public CommerceAddress withRegion(Optional<String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * The type of the address
     */
    public CommerceAddress withType(CommerceAddressType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the address
     */
    public CommerceAddress withType(Optional<? extends CommerceAddressType> type) {
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
        CommerceAddress other = (CommerceAddress) o;
        return 
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.line1, other.line1) &&
            Objects.deepEquals(this.line2, other.line2) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(CommerceAddress.class,
                "city", city,
                "country", country,
                "line1", line1,
                "line2", line2,
                "postalCode", postalCode,
                "region", region,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> line1 = Optional.empty();
 
        private Optional<String> line2 = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> region = Optional.empty();
 
        private Optional<? extends CommerceAddressType> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The third line of the address, or city
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        /**
         * The third line of the address, or city
         */
        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * The country for the address
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * The country for the address
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * The first line of the address
         */
        public Builder line1(String line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = Optional.ofNullable(line1);
            return this;
        }

        /**
         * The first line of the address
         */
        public Builder line1(Optional<String> line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = line1;
            return this;
        }

        /**
         * The second line of the address
         */
        public Builder line2(String line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = Optional.ofNullable(line2);
            return this;
        }

        /**
         * The second line of the address
         */
        public Builder line2(Optional<String> line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = line2;
            return this;
        }

        /**
         * The postal (or zip) code for the address
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        /**
         * The postal (or zip) code for the address
         */
        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * The fourth line of the address, or region
         */
        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * The fourth line of the address, or region
         */
        public Builder region(Optional<String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * The type of the address
         */
        public Builder type(CommerceAddressType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the address
         */
        public Builder type(Optional<? extends CommerceAddressType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public CommerceAddress build() {
            return new CommerceAddress(
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

