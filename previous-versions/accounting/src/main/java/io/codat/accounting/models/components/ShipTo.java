/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * ShipTo - Delivery details for any goods that have been ordered.
 */

public class ShipTo {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Items> address;

    /**
     * Details of the named contact at the delivery address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact")
    private Optional<? extends ShipToContact> contact;

    public ShipTo(
            @JsonProperty("address") Optional<? extends Items> address,
            @JsonProperty("contact") Optional<? extends ShipToContact> contact) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(contact, "contact");
        this.address = address;
        this.contact = contact;
    }

    public Optional<? extends Items> address() {
        return address;
    }

    /**
     * Details of the named contact at the delivery address.
     */
    public Optional<? extends ShipToContact> contact() {
        return contact;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ShipTo withAddress(Items address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }
    
    public ShipTo withAddress(Optional<? extends Items> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Details of the named contact at the delivery address.
     */
    public ShipTo withContact(ShipToContact contact) {
        Utils.checkNotNull(contact, "contact");
        this.contact = Optional.ofNullable(contact);
        return this;
    }
    
    /**
     * Details of the named contact at the delivery address.
     */
    public ShipTo withContact(Optional<? extends ShipToContact> contact) {
        Utils.checkNotNull(contact, "contact");
        this.contact = contact;
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
        ShipTo other = (ShipTo) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.contact, other.contact);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            contact);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ShipTo.class,
                "address", address,
                "contact", contact);
    }
    
    public final static class Builder {
 
        private Optional<? extends Items> address = Optional.empty();
 
        private Optional<? extends ShipToContact> contact = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(Items address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }
        
        public Builder address(Optional<? extends Items> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Details of the named contact at the delivery address.
         */
        public Builder contact(ShipToContact contact) {
            Utils.checkNotNull(contact, "contact");
            this.contact = Optional.ofNullable(contact);
            return this;
        }
        
        /**
         * Details of the named contact at the delivery address.
         */
        public Builder contact(Optional<? extends ShipToContact> contact) {
            Utils.checkNotNull(contact, "contact");
            this.contact = contact;
            return this;
        }
        
        public ShipTo build() {
            return new ShipTo(
                address,
                contact);
        }
    }
}

