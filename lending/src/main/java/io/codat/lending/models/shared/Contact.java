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


public class Contact {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends AccountingAddress> address;

    /**
     * Email of a contact for a customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<String> modifiedDate;

    /**
     * Name of a contact for a customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * An array of Phone numbers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<? extends List<PhoneNumber>> phone;

    /**
     * Status of customer.
     */
    @JsonProperty("status")
    private CustomerStatus status;

    @JsonCreator
    public Contact(
            @JsonProperty("address") Optional<? extends AccountingAddress> address,
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("phone") JsonNullable<? extends List<PhoneNumber>> phone,
            @JsonProperty("status") CustomerStatus status) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(status, "status");
        this.address = address;
        this.email = email;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }
    
    public Contact(
            CustomerStatus status) {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), status);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountingAddress> address() {
        return (Optional<AccountingAddress>) address;
    }

    /**
     * Email of a contact for a customer.
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonIgnore
    public Optional<String> modifiedDate() {
        return modifiedDate;
    }

    /**
     * Name of a contact for a customer.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * An array of Phone numbers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<PhoneNumber>> phone() {
        return (JsonNullable<List<PhoneNumber>>) phone;
    }

    /**
     * Status of customer.
     */
    @JsonIgnore
    public CustomerStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Contact withAddress(AccountingAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public Contact withAddress(Optional<? extends AccountingAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Email of a contact for a customer.
     */
    public Contact withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email of a contact for a customer.
     */
    public Contact withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Contact withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Contact withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Name of a contact for a customer.
     */
    public Contact withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of a contact for a customer.
     */
    public Contact withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * An array of Phone numbers.
     */
    public Contact withPhone(List<PhoneNumber> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * An array of Phone numbers.
     */
    public Contact withPhone(JsonNullable<? extends List<PhoneNumber>> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * Status of customer.
     */
    public Contact withStatus(CustomerStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        Contact other = (Contact) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            email,
            modifiedDate,
            name,
            phone,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Contact.class,
                "address", address,
                "email", email,
                "modifiedDate", modifiedDate,
                "name", name,
                "phone", phone,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountingAddress> address = Optional.empty();
 
        private JsonNullable<String> email = JsonNullable.undefined();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends List<PhoneNumber>> phone = JsonNullable.undefined();
 
        private CustomerStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(AccountingAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends AccountingAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Email of a contact for a customer.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Email of a contact for a customer.
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder modifiedDate(Optional<String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * Name of a contact for a customer.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of a contact for a customer.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * An array of Phone numbers.
         */
        public Builder phone(List<PhoneNumber> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = JsonNullable.of(phone);
            return this;
        }

        /**
         * An array of Phone numbers.
         */
        public Builder phone(JsonNullable<? extends List<PhoneNumber>> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
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
        
        public Contact build() {
            return new Contact(
                address,
                email,
                modifiedDate,
                name,
                phone,
                status);
        }
    }
}

