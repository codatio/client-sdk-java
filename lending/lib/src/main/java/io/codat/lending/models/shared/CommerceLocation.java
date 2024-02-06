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

/**
 * CommerceLocation - The Location datatype holds information on the geographic location at which stocks of products may be held, as referenced in the Products data type.
 * 
 * A Location also holds information on geographic locations where orders were placed, as referenced in the Orders data type.
 * 
 * Explore our [data coverage](https://knowledge.codat.io/supported-features/commerce?view=tab-by-data-type&amp;dataType=commerce-locations) for this data type.
 */

public class CommerceLocation {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends CommerceAddress> address;

    /**
     * A unique, persistent identifier for this record
     */
    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    /**
     * Name of this location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<? extends String> sourceModifiedDate;

    public CommerceLocation(
            @JsonProperty("address") Optional<? extends CommerceAddress> address,
            @JsonProperty("id") String id,
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("sourceModifiedDate") Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.address = address;
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.sourceModifiedDate = sourceModifiedDate;
    }

    public Optional<? extends CommerceAddress> address() {
        return address;
    }

    /**
     * A unique, persistent identifier for this record
     */
    public String id() {
        return id;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Name of this location
     */
    public Optional<? extends String> name() {
        return name;
    }

    public Optional<? extends String> sourceModifiedDate() {
        return sourceModifiedDate;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CommerceLocation withAddress(CommerceAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }
    
    public CommerceLocation withAddress(Optional<? extends CommerceAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * A unique, persistent identifier for this record
     */
    public CommerceLocation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CommerceLocation withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }
    
    public CommerceLocation withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Name of this location
     */
    public CommerceLocation withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }
    
    /**
     * Name of this location
     */
    public CommerceLocation withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CommerceLocation withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }
    
    public CommerceLocation withSourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
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
        CommerceLocation other = (CommerceLocation) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            id,
            modifiedDate,
            name,
            sourceModifiedDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceLocation.class,
                "address", address,
                "id", id,
                "modifiedDate", modifiedDate,
                "name", name,
                "sourceModifiedDate", sourceModifiedDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends CommerceAddress> address = Optional.empty();
 
        private String id;
 
        private Optional<? extends String> modifiedDate = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> sourceModifiedDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(CommerceAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }
        
        public Builder address(Optional<? extends CommerceAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * A unique, persistent identifier for this record
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }
        
        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * Name of this location
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }
        
        /**
         * Name of this location
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }
        
        public Builder sourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }        
        
        public CommerceLocation build() {
            return new CommerceLocation(
                address,
                id,
                modifiedDate,
                name,
                sourceModifiedDate);
        }
    }
}

