/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Customer - &gt; View the coverage for customers in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=customers" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * ## Overview
 * 
 * A customer is a person or organisation that buys goods or services. From the Customers endpoints, you can retrieve a [list of all the customers of a company](https://api.codat.io/swagger/index.html#/Customers/get_companies__companyId__data_customers).
 * 
 * Customers' data links to accounts receivable [invoices](https://docs.codat.io/sync-for-expenses-api#/schemas/Invoice).
 * 
 */

public class Customer {

    /**
     * An array of Addresses.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private JsonNullable<? extends java.util.List<AccountingAddress>> addresses;

    /**
     * Name of the main contact for the identified customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contactName")
    private JsonNullable<? extends String> contactName;

    /**
     * An array of Contacts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contacts")
    private JsonNullable<? extends java.util.List<Contact>> contacts;

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerName")
    private JsonNullable<? extends String> customerName;

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
    private Optional<? extends String> defaultCurrency;

    /**
     * Email address the customer can be contacted by.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private JsonNullable<? extends String> emailAddress;

    /**
     * Identifier for the customer, unique to the company in the accounting platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    /**
     * Phone number the customer can be contacted by.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<? extends String> phone;

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("registrationNumber")
    private JsonNullable<? extends String> registrationNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private Optional<? extends String> sourceModifiedDate;

    /**
     * Status of customer.
     */
    @JsonProperty("status")
    private CustomerStatus status;

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplementalData")
    private Optional<? extends SupplementalData> supplementalData;

    /**
     * Company tax number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxNumber")
    private JsonNullable<? extends String> taxNumber;

    public Customer(
            @JsonProperty("addresses") JsonNullable<? extends java.util.List<AccountingAddress>> addresses,
            @JsonProperty("contactName") JsonNullable<? extends String> contactName,
            @JsonProperty("contacts") JsonNullable<? extends java.util.List<Contact>> contacts,
            @JsonProperty("customerName") JsonNullable<? extends String> customerName,
            @JsonProperty("defaultCurrency") Optional<? extends String> defaultCurrency,
            @JsonProperty("emailAddress") JsonNullable<? extends String> emailAddress,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate,
            @JsonProperty("phone") JsonNullable<? extends String> phone,
            @JsonProperty("registrationNumber") JsonNullable<? extends String> registrationNumber,
            @JsonProperty("sourceModifiedDate") Optional<? extends String> sourceModifiedDate,
            @JsonProperty("status") CustomerStatus status,
            @JsonProperty("supplementalData") Optional<? extends SupplementalData> supplementalData,
            @JsonProperty("taxNumber") JsonNullable<? extends String> taxNumber) {
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

    /**
     * An array of Addresses.
     */
    public JsonNullable<? extends java.util.List<AccountingAddress>> addresses() {
        return addresses;
    }

    /**
     * Name of the main contact for the identified customer.
     */
    public JsonNullable<? extends String> contactName() {
        return contactName;
    }

    /**
     * An array of Contacts.
     */
    public JsonNullable<? extends java.util.List<Contact>> contacts() {
        return contacts;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    public JsonNullable<? extends String> customerName() {
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
    public Optional<? extends String> defaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Email address the customer can be contacted by.
     */
    public JsonNullable<? extends String> emailAddress() {
        return emailAddress;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting platform.
     */
    public Optional<? extends String> id() {
        return id;
    }

    public Optional<? extends Metadata> metadata() {
        return metadata;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Phone number the customer can be contacted by.
     */
    public JsonNullable<? extends String> phone() {
        return phone;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    public JsonNullable<? extends String> registrationNumber() {
        return registrationNumber;
    }

    public Optional<? extends String> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    /**
     * Status of customer.
     */
    public CustomerStatus status() {
        return status;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Optional<? extends SupplementalData> supplementalData() {
        return supplementalData;
    }

    /**
     * Company tax number.
     */
    public JsonNullable<? extends String> taxNumber() {
        return taxNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of Addresses.
     */
    public Customer withAddresses(java.util.List<AccountingAddress> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = JsonNullable.of(addresses);
        return this;
    }

    /**
     * An array of Addresses.
     */
    public Customer withAddresses(JsonNullable<? extends java.util.List<AccountingAddress>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    /**
     * Name of the main contact for the identified customer.
     */
    public Customer withContactName(String contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = JsonNullable.of(contactName);
        return this;
    }

    /**
     * Name of the main contact for the identified customer.
     */
    public Customer withContactName(JsonNullable<? extends String> contactName) {
        Utils.checkNotNull(contactName, "contactName");
        this.contactName = contactName;
        return this;
    }

    /**
     * An array of Contacts.
     */
    public Customer withContacts(java.util.List<Contact> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = JsonNullable.of(contacts);
        return this;
    }

    /**
     * An array of Contacts.
     */
    public Customer withContacts(JsonNullable<? extends java.util.List<Contact>> contacts) {
        Utils.checkNotNull(contacts, "contacts");
        this.contacts = contacts;
        return this;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    public Customer withCustomerName(String customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = JsonNullable.of(customerName);
        return this;
    }

    /**
     * Name of the customer as recorded in the accounting system, typically the company name.
     */
    public Customer withCustomerName(JsonNullable<? extends String> customerName) {
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
    public Customer withDefaultCurrency(String defaultCurrency) {
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
    public Customer withDefaultCurrency(Optional<? extends String> defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Email address the customer can be contacted by.
     */
    public Customer withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = JsonNullable.of(emailAddress);
        return this;
    }

    /**
     * Email address the customer can be contacted by.
     */
    public Customer withEmailAddress(JsonNullable<? extends String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting platform.
     */
    public Customer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Identifier for the customer, unique to the company in the accounting platform.
     */
    public Customer withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Customer withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public Customer withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Customer withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public Customer withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Phone number the customer can be contacted by.
     */
    public Customer withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * Phone number the customer can be contacted by.
     */
    public Customer withPhone(JsonNullable<? extends String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    public Customer withRegistrationNumber(String registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = JsonNullable.of(registrationNumber);
        return this;
    }

    /**
     * Company number. In the UK, this is typically the Companies House company registration number.
     */
    public Customer withRegistrationNumber(JsonNullable<? extends String> registrationNumber) {
        Utils.checkNotNull(registrationNumber, "registrationNumber");
        this.registrationNumber = registrationNumber;
        return this;
    }

    public Customer withSourceModifiedDate(String sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = Optional.ofNullable(sourceModifiedDate);
        return this;
    }

    public Customer withSourceModifiedDate(Optional<? extends String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
        return this;
    }

    /**
     * Status of customer.
     */
    public Customer withStatus(CustomerStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Customer withSupplementalData(SupplementalData supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = Optional.ofNullable(supplementalData);
        return this;
    }

    /**
     * Supplemental data is additional data you can include in our standard data types. 
     * 
     * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
     */
    public Customer withSupplementalData(Optional<? extends SupplementalData> supplementalData) {
        Utils.checkNotNull(supplementalData, "supplementalData");
        this.supplementalData = supplementalData;
        return this;
    }

    /**
     * Company tax number.
     */
    public Customer withTaxNumber(String taxNumber) {
        Utils.checkNotNull(taxNumber, "taxNumber");
        this.taxNumber = JsonNullable.of(taxNumber);
        return this;
    }

    /**
     * Company tax number.
     */
    public Customer withTaxNumber(JsonNullable<? extends String> taxNumber) {
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
        Customer other = (Customer) o;
        return 
            java.util.Objects.deepEquals(this.addresses, other.addresses) &&
            java.util.Objects.deepEquals(this.contactName, other.contactName) &&
            java.util.Objects.deepEquals(this.contacts, other.contacts) &&
            java.util.Objects.deepEquals(this.customerName, other.customerName) &&
            java.util.Objects.deepEquals(this.defaultCurrency, other.defaultCurrency) &&
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            java.util.Objects.deepEquals(this.phone, other.phone) &&
            java.util.Objects.deepEquals(this.registrationNumber, other.registrationNumber) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.supplementalData, other.supplementalData) &&
            java.util.Objects.deepEquals(this.taxNumber, other.taxNumber);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(Customer.class,
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
 
        private JsonNullable<? extends java.util.List<AccountingAddress>> addresses = JsonNullable.undefined();
 
        private JsonNullable<? extends String> contactName = JsonNullable.undefined();
 
        private JsonNullable<? extends java.util.List<Contact>> contacts = JsonNullable.undefined();
 
        private JsonNullable<? extends String> customerName = JsonNullable.undefined();
 
        private Optional<? extends String> defaultCurrency = Optional.empty();
 
        private JsonNullable<? extends String> emailAddress = JsonNullable.undefined();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<? extends String> modifiedDate = Optional.empty();
 
        private JsonNullable<? extends String> phone = JsonNullable.undefined();
 
        private JsonNullable<? extends String> registrationNumber = JsonNullable.undefined();
 
        private Optional<? extends String> sourceModifiedDate = Optional.empty();
 
        private CustomerStatus status;
 
        private Optional<? extends SupplementalData> supplementalData = Optional.empty();
 
        private JsonNullable<? extends String> taxNumber = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(java.util.List<AccountingAddress> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = JsonNullable.of(addresses);
            return this;
        }

        /**
         * An array of Addresses.
         */
        public Builder addresses(JsonNullable<? extends java.util.List<AccountingAddress>> addresses) {
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
        public Builder contactName(JsonNullable<? extends String> contactName) {
            Utils.checkNotNull(contactName, "contactName");
            this.contactName = contactName;
            return this;
        }

        /**
         * An array of Contacts.
         */
        public Builder contacts(java.util.List<Contact> contacts) {
            Utils.checkNotNull(contacts, "contacts");
            this.contacts = JsonNullable.of(contacts);
            return this;
        }

        /**
         * An array of Contacts.
         */
        public Builder contacts(JsonNullable<? extends java.util.List<Contact>> contacts) {
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
        public Builder customerName(JsonNullable<? extends String> customerName) {
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
        public Builder defaultCurrency(Optional<? extends String> defaultCurrency) {
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
        public Builder emailAddress(JsonNullable<? extends String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Identifier for the customer, unique to the company in the accounting platform.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Identifier for the customer, unique to the company in the accounting platform.
         */
        public Builder id(Optional<? extends String> id) {
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

        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
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
        public Builder phone(JsonNullable<? extends String> phone) {
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
        public Builder registrationNumber(JsonNullable<? extends String> registrationNumber) {
            Utils.checkNotNull(registrationNumber, "registrationNumber");
            this.registrationNumber = registrationNumber;
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
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
         */
        public Builder supplementalData(SupplementalData supplementalData) {
            Utils.checkNotNull(supplementalData, "supplementalData");
            this.supplementalData = Optional.ofNullable(supplementalData);
            return this;
        }

        /**
         * Supplemental data is additional data you can include in our standard data types. 
         * 
         * It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.
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
        public Builder taxNumber(JsonNullable<? extends String> taxNumber) {
            Utils.checkNotNull(taxNumber, "taxNumber");
            this.taxNumber = taxNumber;
            return this;
        }
        
        public Customer build() {
            return new Customer(
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

