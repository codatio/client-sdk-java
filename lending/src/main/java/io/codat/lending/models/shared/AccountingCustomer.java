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
 * AccountingCustomer - ## Overview
 * 
 * A customer is a person or organisation that buys goods or services. From the Customers endpoints, you can retrieve a [list of all the customers of a company](https://api.codat.io/swagger/index.html#/Customers/get_companies__companyId__data_customers).
 * 
 * Customers' data links to accounts receivable [invoices](https://docs.codat.io/lending-api#/schemas/Invoice).
 * 
 */

public class AccountingCustomer {

    /**
     * An array of Addresses.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private JsonNullable<? extends List<AccountingAddress>> addresses;

    /**
     * Name of the main contact for the identified customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactName")
    private JsonNullable<String> contactName;

    /**
     * An array of Contacts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contacts")
    private JsonNullable<? extends List<Contact>> contacts;

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerName")
    private JsonNullable<String> customerName;

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultCurrency")
    private Optional<String> defaultCurrency;

    /**
     * Email address the customer can be contacted by.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private JsonNullable<String> emailAddress;

    /**
     * Identifier for the customer, unique to the company in the accounting software.
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
     * Phone number the customer can be contacted by.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<String> phone;

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("registrationNumber")
    private JsonNullable<String> registrationNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<String> sourceModifiedDate;

    /**
     * Status of customer.
     */
    @JsonProperty("status")
    private CustomerStatus status;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalData")
    private Optional<? extends SupplementalData> supplementalData;

    /**
     * Company tax number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxNumber")
    private JsonNullable<String> taxNumber;

    @JsonCreator
    public AccountingCustomer(
            @JsonProperty("addresses") JsonNullable<? extends List<AccountingAddress>> addresses,
            @JsonProperty("contactName") JsonNullable<String> contactName,
            @JsonProperty("contacts") JsonNullable<? extends List<Contact>> contacts,
            @JsonProperty("customerName") JsonNullable<String> customerName,
            @JsonProperty("defaultCurrency") Optional<String> defaultCurrency,
            @JsonProperty("emailAddress") JsonNullable<String> emailAddress,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("phone") JsonNullable<String> phone,
            @JsonProperty("registrationNumber") JsonNullable<String> registrationNumber,
            @JsonProperty("sourceModifiedDate") Optional<String> sourceModifiedDate,
            @JsonProperty("status") CustomerStatus status,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("taxNumber") JsonNullable<String> taxNumber) {
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(contactName, "contactName");
        Utils.checkNotNull(contacts, "contacts");
        Utils.checkNotNull(customerName, "customerName");
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
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.addresses = addresses;
        this.contactName = contactName;
        this.contacts = contacts;
        this.customerName = customerName;
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
        this.taxNumber = taxNumber;
    }
    
    public AccountingCustomer(
            CustomerStatus status) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), status, Optional.empty(), JsonNullable.undefined());
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
     * Name of the main contact for the identified customer.
     */
    @JsonIgnore
    public JsonNullable<String> contactName() {
        return contactName;
    }

    /**
     * An array of Contacts.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Contact>> contacts() {
        return (JsonNullable<List<Contact>>) contacts;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    @JsonIgnore
    public JsonNullable<String> customerName() {
        return customerName;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonIgnore
    public Optional<String> defaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Email address the customer can be contacted by.
     */
    @JsonIgnore
    public JsonNullable<String> emailAddress() {
        return emailAddress;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting software.
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
     * Phone number the customer can be contacted by.
     */
    @JsonIgnore
    public JsonNullable<String> phone() {
        return phone;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
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
     * Status of customer.
     */
    @JsonIgnore
    public CustomerStatus status() {
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
     * Company tax number.
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
    public AccountingCustomer withAddresses(List<AccountingAddress> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = JsonNullable.of(addresses);
        return this;
    }

    /**
     * An array of Addresses.
     */
    public AccountingCustomer withAddresses(JsonNullable<? extends List<AccountingAddress>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    /**
     * Name of the main contact for the identified customer.
     */
    public AccountingCustomer withContactName(String contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = JsonNullable.of(contactName);
        return this;
    }

    /**
     * Name of the main contact for the identified customer.
     */
    public AccountingCustomer withContactName(JsonNullable<String> contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = contactName;
        return this;
    }

    /**
     * An array of Contacts.
     */
    public AccountingCustomer withContacts(List<Contact> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = JsonNullable.of(contacts);
        return this;
    }

    /**
     * An array of Contacts.
     */
    public AccountingCustomer withContacts(JsonNullable<? extends List<Contact>> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = contacts;
        return this;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    public AccountingCustomer withCustomerName(String customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = JsonNullable.of(customerName);
        return this;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    public AccountingCustomer withCustomerName(JsonNullable<String> customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = customerName;
        return this;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public AccountingCustomer withDefaultCurrency(String defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = Optional.ofNullable(defaultCurrency);
        return this;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public AccountingCustomer withDefaultCurrency(Optional<String> defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Email address the customer can be contacted by.
     */
    public AccountingCustomer withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = JsonNullable.of(emailAddress);
        return this;
    }

    /**
     * Email address the customer can be contacted by.
     */
    public AccountingCustomer withEmailAddress(JsonNullable<String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting software.
     */
    public AccountingCustomer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting software.
     */
    public AccountingCustomer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AccountingCustomer withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AccountingCustomer withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountingCustomer withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public AccountingCustomer withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Phone number the customer can be contacted by.
     */
    public AccountingCustomer withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * Phone number the customer can be contacted by.
     */
    public AccountingCustomer withPhone(JsonNullable<String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    public AccountingCustomer withRegistrationNumber(String registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = JsonNullable.of(registrationNumber);
        return this;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    public AccountingCustomer withRegistrationNumber(JsonNullable<String> registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = registrationNumber;
        return this;
    }

    public AccountingCustomer withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public AccountingCustomer withSourceModifiedDate(Optional<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Status of customer.
     */
    public AccountingCustomer withStatus(CustomerStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingCustomer withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting software. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public AccountingCustomer withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Company tax number.
     */
    public AccountingCustomer withTaxNumber(String taxNumber) {
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.taxNumber = JsonNullable.of(taxNumber);
        return this;
    }

    /**
     * Company tax number.
     */
    public AccountingCustomer withTaxNumber(JsonNullable<String> taxNumber) {
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
        AccountingCustomer other = (AccountingCustomer) o;
        return 
            Objects.deepEquals(this.addresses, other.addresses) &&
            Objects.deepEquals(this.contactName, other.contactName) &&
            Objects.deepEquals(this.contacts, other.contacts) &&
            Objects.deepEquals(this.customerName, other.customerName) &&
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
            Objects.deepEquals(this.taxNumber, other.taxNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addresses,
            contactName,
            contacts,
            customerName,
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
            taxNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingCustomer.class,
                "addresses", addresses,
                "contactName", contactName,
                "contacts", contacts,
                "customerName", customerName,
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
                "taxNumber", taxNumber);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<AccountingAddress>> addresses = JsonNullable.undefined();
 
        private JsonNullable<String> contactName = JsonNullable.undefined();
 
        private JsonNullable<? extends List<Contact>> contacts = JsonNullable.undefined();
 
        private JsonNullable<String> customerName = JsonNullable.undefined();
 
        private Optional<String> defaultCurrency = Optional.empty();
 
        private JsonNullable<String> emailAddress = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> phone = JsonNullable.undefined();
 
        private JsonNullable<String> registrationNumber = JsonNullable.undefined();
 
        private Optional<String> sourceModifiedDate = Optional.empty();
 
        private CustomerStatus status;
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
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
         * Name of the main contact for the identified customer.
         */
        public Builder contactName(String contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = JsonNullable.of(contactName);
            return this;
        }

        /**
         * Name of the main contact for the identified customer.
         */
        public Builder contactName(JsonNullable<String> contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = contactName;
            return this;
        }

        /**
         * An array of Contacts.
         */
        public Builder contacts(List<Contact> contacts) {
            Utils.checkNotNull(contacts, "contacts");
            this.contacts = JsonNullable.of(contacts);
            return this;
        }

        /**
         * An array of Contacts.
         */
        public Builder contacts(JsonNullable<? extends List<Contact>> contacts) {
            Utils.checkNotNull(contacts, "contacts");
            this.contacts = contacts;
            return this;
        }

        /**
         * Name of the customer as recorded in the accounting system, typically the company name.
         */
        public Builder customerName(String customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = JsonNullable.of(customerName);
            return this;
        }

        /**
         * Name of the customer as recorded in the accounting system, typically the company name.
         */
        public Builder customerName(JsonNullable<String> customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = customerName;
            return this;
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder defaultCurrency(String defaultCurrency) {
            Utils.checkNotNull(defaultCurrency, "defaultCurrency");
            this.defaultCurrency = Optional.ofNullable(defaultCurrency);
            return this;
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder defaultCurrency(Optional<String> defaultCurrency) {
            Utils.checkNotNull(defaultCurrency, "defaultCurrency");
            this.defaultCurrency = defaultCurrency;
            return this;
        }

        /**
         * Email address the customer can be contacted by.
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = JsonNullable.of(emailAddress);
            return this;
        }

        /**
         * Email address the customer can be contacted by.
         */
        public Builder emailAddress(JsonNullable<String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Identifier for the customer, unique to the company in the accounting software.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the customer, unique to the company in the accounting software.
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
         * Phone number the customer can be contacted by.
         */
        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = JsonNullable.of(phone);
            return this;
        }

        /**
         * Phone number the customer can be contacted by.
         */
        public Builder phone(JsonNullable<String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * Company number. In the UK, this is typically the Companies House company registration number.
         */
        public Builder registrationNumber(String registrationNumber) {
            Utils.checkNotNull(registrationNumber, "registrationNumber");
            this.registrationNumber = JsonNullable.of(registrationNumber);
            return this;
        }

        /**
         * Company number. In the UK, this is typically the Companies House company registration number.
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
         * Status of customer.
         */
        public Builder status(CustomerStatus status) {
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
         * Company tax number.
         */
        public Builder taxNumber(String taxNumber) {
            Utils.checkNotNull(taxNumber, "taxNumber");
            this.taxNumber = JsonNullable.of(taxNumber);
            return this;
        }

        /**
         * Company tax number.
         */
        public Builder taxNumber(JsonNullable<String> taxNumber) {
            Utils.checkNotNull(taxNumber, "taxNumber");
            this.taxNumber = taxNumber;
            return this;
        }
        
        public AccountingCustomer build() {
            return new AccountingCustomer(
                addresses,
                contactName,
                contacts,
                customerName,
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
                taxNumber);
        }
    }
}

