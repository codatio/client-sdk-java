/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SupplierPrototype {

    /**
     * An array of Addresses.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private JsonNullable<? extends java.util.List<Addresses>> addresses;

    /**
     * Name of the main contact for the supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactName")
    private JsonNullable<? extends String> contactName;

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultCurrency")
    private JsonNullable<? extends String> defaultCurrency;

    /**
     * Email address that the supplier may be contacted on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private JsonNullable<? extends String> emailAddress;

    /**
     * Phone number that the supplier may be contacted on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<? extends String> phone;

    /**
     * Status of the supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends SupplierStatus> status;

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplierName")
    private JsonNullable<? extends String> supplierName;

    public SupplierPrototype(
            @JsonProperty("addresses") JsonNullable<? extends java.util.List<Addresses>> addresses,
            @JsonProperty("contactName") JsonNullable<? extends String> contactName,
            @JsonProperty("defaultCurrency") JsonNullable<? extends String> defaultCurrency,
            @JsonProperty("emailAddress") JsonNullable<? extends String> emailAddress,
            @JsonProperty("phone") JsonNullable<? extends String> phone,
            @JsonProperty("status") Optional<? extends SupplierStatus> status,
            @JsonProperty("supplierName") JsonNullable<? extends String> supplierName) {
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(contactName, "contactName");
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(supplierName, "supplierName");
        this.addresses = addresses;
        this.contactName = contactName;
        this.defaultCurrency = defaultCurrency;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.status = status;
        this.supplierName = supplierName;
    }

    /**
     * An array of Addresses.
     */
    public JsonNullable<? extends java.util.List<Addresses>> addresses() {
        return addresses;
    }

    /**
     * Name of the main contact for the supplier.
     */
    public JsonNullable<? extends String> contactName() {
        return contactName;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    public JsonNullable<? extends String> defaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    public JsonNullable<? extends String> emailAddress() {
        return emailAddress;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    public JsonNullable<? extends String> phone() {
        return phone;
    }

    /**
     * Status of the supplier.
     */
    public Optional<? extends SupplierStatus> status() {
        return status;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    public JsonNullable<? extends String> supplierName() {
        return supplierName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of Addresses.
     */
    public SupplierPrototype withAddresses(java.util.List<Addresses> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = JsonNullable.of(addresses);
        return this;
    }

    /**
     * An array of Addresses.
     */
    public SupplierPrototype withAddresses(JsonNullable<? extends java.util.List<Addresses>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    /**
     * Name of the main contact for the supplier.
     */
    public SupplierPrototype withContactName(String contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = JsonNullable.of(contactName);
        return this;
    }

    /**
     * Name of the main contact for the supplier.
     */
    public SupplierPrototype withContactName(JsonNullable<? extends String> contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = contactName;
        return this;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    public SupplierPrototype withDefaultCurrency(String defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = JsonNullable.of(defaultCurrency);
        return this;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    public SupplierPrototype withDefaultCurrency(JsonNullable<? extends String> defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    public SupplierPrototype withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = JsonNullable.of(emailAddress);
        return this;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    public SupplierPrototype withEmailAddress(JsonNullable<? extends String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    public SupplierPrototype withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    public SupplierPrototype withPhone(JsonNullable<? extends String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * Status of the supplier.
     */
    public SupplierPrototype withStatus(SupplierStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of the supplier.
     */
    public SupplierPrototype withStatus(Optional<? extends SupplierStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    public SupplierPrototype withSupplierName(String supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = JsonNullable.of(supplierName);
        return this;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    public SupplierPrototype withSupplierName(JsonNullable<? extends String> supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = supplierName;
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
        SupplierPrototype other = (SupplierPrototype) o;
        return 
            java.util.Objects.deepEquals(this.addresses, other.addresses) &&
            java.util.Objects.deepEquals(this.contactName, other.contactName) &&
            java.util.Objects.deepEquals(this.defaultCurrency, other.defaultCurrency) &&
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            java.util.Objects.deepEquals(this.phone, other.phone) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.supplierName, other.supplierName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            addresses,
            contactName,
            defaultCurrency,
            emailAddress,
            phone,
            status,
            supplierName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SupplierPrototype.class,
                "addresses", addresses,
                "contactName", contactName,
                "defaultCurrency", defaultCurrency,
                "emailAddress", emailAddress,
                "phone", phone,
                "status", status,
                "supplierName", supplierName);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<Addresses>> addresses = JsonNullable.undefined();
 
        private JsonNullable<? extends String> contactName = JsonNullable.undefined();
 
        private JsonNullable<? extends String> defaultCurrency = JsonNullable.undefined();
 
        private JsonNullable<? extends String> emailAddress = JsonNullable.undefined();
 
        private JsonNullable<? extends String> phone = JsonNullable.undefined();
 
        private Optional<? extends SupplierStatus> status = Optional.empty();
 
        private JsonNullable<? extends String> supplierName = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(java.util.List<Addresses> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = JsonNullable.of(addresses);
            return this;
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(JsonNullable<? extends java.util.List<Addresses>> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = addresses;
            return this;
        }

        /**
         * Name of the main contact for the supplier.
         */
        public Builder contactName(String contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = JsonNullable.of(contactName);
            return this;
        }

        /**
         * Name of the main contact for the supplier.
         */
        public Builder contactName(JsonNullable<? extends String> contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = contactName;
            return this;
        }

        /**
         * Default currency the supplier's transactional data is recorded in.
         */
        public Builder defaultCurrency(String defaultCurrency) {
            Utils.checkNotNull(defaultCurrency, "defaultCurrency");
            this.defaultCurrency = JsonNullable.of(defaultCurrency);
            return this;
        }

        /**
         * Default currency the supplier's transactional data is recorded in.
         */
        public Builder defaultCurrency(JsonNullable<? extends String> defaultCurrency) {
            Utils.checkNotNull(defaultCurrency, "defaultCurrency");
            this.defaultCurrency = defaultCurrency;
            return this;
        }

        /**
         * Email address that the supplier may be contacted on.
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = JsonNullable.of(emailAddress);
            return this;
        }

        /**
         * Email address that the supplier may be contacted on.
         */
        public Builder emailAddress(JsonNullable<? extends String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Phone number that the supplier may be contacted on.
         */
        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = JsonNullable.of(phone);
            return this;
        }

        /**
         * Phone number that the supplier may be contacted on.
         */
        public Builder phone(JsonNullable<? extends String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * Status of the supplier.
         */
        public Builder status(SupplierStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the supplier.
         */
        public Builder status(Optional<? extends SupplierStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Name of the supplier as recorded in the accounting system, typically the company name.
         */
        public Builder supplierName(String supplierName) {
            Utils.checkNotNull(supplierName, "supplierName");
            this.supplierName = JsonNullable.of(supplierName);
            return this;
        }

        /**
         * Name of the supplier as recorded in the accounting system, typically the company name.
         */
        public Builder supplierName(JsonNullable<? extends String> supplierName) {
            Utils.checkNotNull(supplierName, "supplierName");
            this.supplierName = supplierName;
            return this;
        }
        
        public SupplierPrototype build() {
            return new SupplierPrototype(
                addresses,
                contactName,
                defaultCurrency,
                emailAddress,
                phone,
                status,
                supplierName);
        }
    }
}

