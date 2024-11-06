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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountingSupplier - ## Overview
 * 
 * From the **Suppliers** endpoints, you can retrieve a list of [all the suppliers for a company](https://docs.codat.io/lending-api#/operations/list-suppliers). Suppliers' data links to accounts payable [bills](https://docs.codat.io/lending-api#/schemas/Bill).
 */

public class AccountingSupplier {

    /**
     * An array of Addresses.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private JsonNullable<? extends List<AccountingAddress>> addresses;

    /**
     * Name of the main contact for the supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactName")
    private JsonNullable<String> contactName;

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultCurrency")
    private JsonNullable<String> defaultCurrency;

    /**
     * Email address that the supplier may be contacted on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private JsonNullable<String> emailAddress;

    /**
     * Identifier for the supplier, unique to the company in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * Phone number that the supplier may be contacted on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<String> phone;

    /**
     * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("registrationNumber")
    private JsonNullable<String> registrationNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Status of the supplier.
     */
    @JsonProperty("status")
    private SupplierStatus status;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalData")
    private Optional<? extends SupplementalData> supplementalData;

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplierName")
    private JsonNullable<String> supplierName;

    /**
     * Supplier's company tax number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxNumber")
    private JsonNullable<String> taxNumber;

    @JsonCreator
    public AccountingSupplier(
            @JsonProperty("addresses") JsonNullable<? extends List<AccountingAddress>> addresses,
            @JsonProperty("contactName") JsonNullable<String> contactName,
            @JsonProperty("defaultCurrency") JsonNullable<String> defaultCurrency,
            @JsonProperty("emailAddress") JsonNullable<String> emailAddress,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("phone") JsonNullable<String> phone,
            @JsonProperty("registrationNumber") JsonNullable<String> registrationNumber,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("status") SupplierStatus status,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("supplierName") JsonNullable<String> supplierName,
            @JsonProperty("taxNumber") JsonNullable<String> taxNumber) {
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(contactName, "contactName");
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(supplementalData, "supplementalData");
        Utils.checkNotNull(supplierName, "supplierName");
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.addresses = addresses;
        this.contactName = contactName;
        this.defaultCurrency = defaultCurrency;
        this.emailAddress = emailAddress;
        this.id = id;
        this.metadata = metadata;
        this.modifiedDate = modifiedDate;
        this.phone = phone;
        this.registrationNumber = registrationNumber;
        this.sourceModifiedDate = sourceModifiedDate;
        this.status = status;
        this.supplementalData = supplementalData;
        this.supplierName = supplierName;
        this.taxNumber = taxNumber;
    }
    
    public AccountingSupplier(
            SupplierStatus status) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), status, Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * An array of Addresses.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<AccountingAddress>> addresses() {
        return (JsonNullable<List<AccountingAddress>>) addresses;
    }

    /**
     * Name of the main contact for the supplier.
     */
    @JsonIgnore
    public JsonNullable<String> contactName() {
        return contactName;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    @JsonIgnore
    public JsonNullable<String> defaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    @JsonIgnore
    public JsonNullable<String> emailAddress() {
        return emailAddress;
    }

    /**
     * Identifier for the supplier, unique to the company in the accounting software.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Metadata> metadata() {
        return (Optional<Metadata>) metadata;
    }

    @JsonIgnore
    public Optional<String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    @JsonIgnore
    public JsonNullable<String> phone() {
        return phone;
    }

    /**
     * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
     */
    @JsonIgnore
    public JsonNullable<String> registrationNumber() {
        return registrationNumber;
    }

    @JsonIgnore
    public Optional<String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Status of the supplier.
     */
    @JsonIgnore
    public SupplierStatus status() {
        return status;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SupplementalData> supplementalData() {
        return (Optional<SupplementalData>) supplementalData;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    @JsonIgnore
    public JsonNullable<String> supplierName() {
        return supplierName;
    }

    /**
     * Supplier's company tax number.
     */
    @JsonIgnore
    public JsonNullable<String> taxNumber() {
        return taxNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of Addresses.
     */
    public AccountingSupplier withAddresses(List<AccountingAddress> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = JsonNullable.of(addresses);
        return this;
    }

    /**
     * An array of Addresses.
     */
    public AccountingSupplier withAddresses(JsonNullable<? extends List<AccountingAddress>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    /**
     * Name of the main contact for the supplier.
     */
    public AccountingSupplier withContactName(String contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = JsonNullable.of(contactName);
        return this;
    }

    /**
     * Name of the main contact for the supplier.
     */
    public AccountingSupplier withContactName(JsonNullable<String> contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = contactName;
        return this;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    public AccountingSupplier withDefaultCurrency(String defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = JsonNullable.of(defaultCurrency);
        return this;
    }

    /**
     * Default currency the supplier's transactional data is recorded in.
     */
    public AccountingSupplier withDefaultCurrency(JsonNullable<String> defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    public AccountingSupplier withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = JsonNullable.of(emailAddress);
        return this;
    }

    /**
     * Email address that the supplier may be contacted on.
     */
    public AccountingSupplier withEmailAddress(JsonNullable<String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Identifier for the supplier, unique to the company in the accounting software.
     */
    public AccountingSupplier withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the supplier, unique to the company in the accounting software.
     */
    public AccountingSupplier withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingSupplier withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AccountingSupplier withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountingSupplier withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public AccountingSupplier withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    public AccountingSupplier withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * Phone number that the supplier may be contacted on.
     */
    public AccountingSupplier withPhone(JsonNullable<String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
     */
    public AccountingSupplier withRegistrationNumber(String registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = JsonNullable.of(registrationNumber);
        return this;
    }

    /**
     * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
     */
    public AccountingSupplier withRegistrationNumber(JsonNullable<String> registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = registrationNumber;
        return this;
    }

    public AccountingSupplier withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public AccountingSupplier withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Status of the supplier.
     */
    public AccountingSupplier withStatus(SupplierStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingSupplier withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingSupplier withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    public AccountingSupplier withSupplierName(String supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = JsonNullable.of(supplierName);
        return this;
    }

    /**
     * Name of the supplier as recorded in the accounting system, typically the company name.
     */
    public AccountingSupplier withSupplierName(JsonNullable<String> supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = supplierName;
        return this;
    }

    /**
     * Supplier's company tax number.
     */
    public AccountingSupplier withTaxNumber(String taxNumber) {
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.taxNumber = JsonNullable.of(taxNumber);
        return this;
    }

    /**
     * Supplier's company tax number.
     */
    public AccountingSupplier withTaxNumber(JsonNullable<String> taxNumber) {
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.taxNumber = taxNumber;
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
        AccountingSupplier other = (AccountingSupplier) o;
        return 
            Objects.deepEquals(this.addresses, other.addresses) &&
            Objects.deepEquals(this.contactName, other.contactName) &&
            Objects.deepEquals(this.defaultCurrency, other.defaultCurrency) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.registrationNumber, other.registrationNumber) &&
            Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            Objects.deepEquals(this.supplierName, other.supplierName) &&
            Objects.deepEquals(this.taxNumber, other.taxNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addresses,
            contactName,
            defaultCurrency,
            emailAddress,
            id,
            metadata,
            modifiedDate,
            phone,
            registrationNumber,
            sourceModifiedDate,
            status,
            supplementalData,
            supplierName,
            taxNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingSupplier.class,
                "addresses", addresses,
                "contactName", contactName,
                "defaultCurrency", defaultCurrency,
                "emailAddress", emailAddress,
                "id", id,
                "metadata", metadata,
                "modifiedDate", modifiedDate,
                "phone", phone,
                "registrationNumber", registrationNumber,
                "sourceModifiedDate", sourceModifiedDate,
                "status", status,
                "supplementalData", supplementalData,
                "supplierName", supplierName,
                "taxNumber", taxNumber);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<AccountingAddress>> addresses = JsonNullable.undefined();
 
        private JsonNullable<String> contactName = JsonNullable.undefined();
 
        private JsonNullable<String> defaultCurrency = JsonNullable.undefined();
 
        private JsonNullable<String> emailAddress = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> phone = JsonNullable.undefined();
 
        private JsonNullable<String> registrationNumber = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private SupplierStatus status;
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private JsonNullable<String> supplierName = JsonNullable.undefined();
 
        private JsonNullable<String> taxNumber = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(List<AccountingAddress> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = JsonNullable.of(addresses);
            return this;
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(JsonNullable<? extends List<AccountingAddress>> addresses) {
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
        public Builder contactName(JsonNullable<String> contactName) {
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
        public Builder defaultCurrency(JsonNullable<String> defaultCurrency) {
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
        public Builder emailAddress(JsonNullable<String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Identifier for the supplier, unique to the company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the supplier, unique to the company in the accounting software.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(Metadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends Metadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
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
        public Builder phone(JsonNullable<String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
         */
        public Builder registrationNumber(String registrationNumber) {
            Utils.checkNotNull(registrationNumber, "registrationNumber");
            this.registrationNumber = JsonNullable.of(registrationNumber);
            return this;
        }

        /**
         * Company number of the supplier. In the UK, this is typically the company registration number issued by Companies House.
         */
        public Builder registrationNumber(JsonNullable<String> registrationNumber) {
            Utils.checkNotNull(registrationNumber, "registrationNumber");
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder sourceModifiedDate(String sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
            return this;
        }

        public Builder sourceModifiedDate(Optional<String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }

        /**
         * Status of the supplier.
         */
        public Builder status(SupplierStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(SupplementalData supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = Optional.ofNullable(supplementalData);
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(Optional<? extends SupplementalData> supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = supplementalData;
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
        public Builder supplierName(JsonNullable<String> supplierName) {
            Utils.checkNotNull(supplierName, "supplierName");
            this.supplierName = supplierName;
            return this;
        }

        /**
         * Supplier's company tax number.
         */
        public Builder taxNumber(String taxNumber) {
            Utils.checkNotNull(taxNumber, "taxNumber");
            this.taxNumber = JsonNullable.of(taxNumber);
            return this;
        }

        /**
         * Supplier's company tax number.
         */
        public Builder taxNumber(JsonNullable<String> taxNumber) {
            Utils.checkNotNull(taxNumber, "taxNumber");
            this.taxNumber = taxNumber;
            return this;
        }
        
        public AccountingSupplier build() {
            return new AccountingSupplier(
                addresses,
                contactName,
                defaultCurrency,
                emailAddress,
                id,
                metadata,
                modifiedDate,
                phone,
                registrationNumber,
                sourceModifiedDate,
                status,
                supplementalData,
                supplierName,
                taxNumber);
        }
    }
}

