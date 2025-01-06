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
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SourceAccountV2Prototype {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountInfo")
    private JsonNullable<? extends AccountInfo> accountInfo;

    /**
     * The bank account name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountName")
    private Optional<String> accountName;

    /**
     * The account number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountNumber")
    private Optional<String> accountNumber;

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountType")
    private Optional<? extends PropertieAccountType> accountType;

    /**
     * The latest balance for the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends BigDecimal> balance;

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
    @JsonProperty("currency")
    private Optional<String> currency;

    /**
     * Unique ID for the bank account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

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
     * Routing information for the bank. This does not include account number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("routingInfo")
    private Optional<? extends RoutingInfo> routingInfo;

    /**
     * The sort code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sortCode")
    private JsonNullable<String> sortCode;

    @JsonCreator
    public SourceAccountV2Prototype(
            @JsonProperty("accountInfo") JsonNullable<? extends AccountInfo> accountInfo,
            @JsonProperty("accountName") Optional<String> accountName,
            @JsonProperty("accountNumber") Optional<String> accountNumber,
            @JsonProperty("accountType") Optional<? extends PropertieAccountType> accountType,
            @JsonProperty("balance") Optional<? extends BigDecimal> balance,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("routingInfo") Optional<? extends RoutingInfo> routingInfo,
            @JsonProperty("sortCode") JsonNullable<String> sortCode) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(accountNumber, "accountNumber");
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(routingInfo, "routingInfo");
        Utils.checkNotNull(sortCode, "sortCode");
        this.accountInfo = accountInfo;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.currency = currency;
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.routingInfo = routingInfo;
        this.sortCode = sortCode;
    }
    
    public SourceAccountV2Prototype() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AccountInfo> accountInfo() {
        return (JsonNullable<AccountInfo>) accountInfo;
    }

    /**
     * The bank account name.
     */
    @JsonIgnore
    public Optional<String> accountName() {
        return accountName;
    }

    /**
     * The account number.
     */
    @JsonIgnore
    public Optional<String> accountNumber() {
        return accountNumber;
    }

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PropertieAccountType> accountType() {
        return (Optional<PropertieAccountType>) accountType;
    }

    /**
     * The latest balance for the bank account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> balance() {
        return (Optional<BigDecimal>) balance;
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
    public Optional<String> currency() {
        return currency;
    }

    /**
     * Unique ID for the bank account.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
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
     * Routing information for the bank. This does not include account number.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RoutingInfo> routingInfo() {
        return (Optional<RoutingInfo>) routingInfo;
    }

    /**
     * The sort code.
     */
    @JsonIgnore
    public JsonNullable<String> sortCode() {
        return sortCode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceAccountV2Prototype withAccountInfo(AccountInfo accountInfo) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        this.accountInfo = JsonNullable.of(accountInfo);
        return this;
    }

    public SourceAccountV2Prototype withAccountInfo(JsonNullable<? extends AccountInfo> accountInfo) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        this.accountInfo = accountInfo;
        return this;
    }

    /**
     * The bank account name.
     */
    public SourceAccountV2Prototype withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = Optional.ofNullable(accountName);
        return this;
    }

    /**
     * The bank account name.
     */
    public SourceAccountV2Prototype withAccountName(Optional<String> accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    /**
     * The account number.
     */
    public SourceAccountV2Prototype withAccountNumber(String accountNumber) {
        Utils.checkNotNull(accountNumber, "accountNumber");
        this.accountNumber = Optional.ofNullable(accountNumber);
        return this;
    }

    /**
     * The account number.
     */
    public SourceAccountV2Prototype withAccountNumber(Optional<String> accountNumber) {
        Utils.checkNotNull(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    public SourceAccountV2Prototype withAccountType(PropertieAccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    public SourceAccountV2Prototype withAccountType(Optional<? extends PropertieAccountType> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    /**
     * The latest balance for the bank account.
     */
    public SourceAccountV2Prototype withBalance(BigDecimal balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

        /**
         * The latest balance for the bank account.
         */
    public SourceAccountV2Prototype withBalance(double balance) {
        this.balance = Optional.of(BigDecimal.valueOf(balance));
        return this;
    }

    /**
     * The latest balance for the bank account.
     */
    public SourceAccountV2Prototype withBalance(Optional<? extends BigDecimal> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
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
    public SourceAccountV2Prototype withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
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
    public SourceAccountV2Prototype withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Unique ID for the bank account.
     */
    public SourceAccountV2Prototype withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique ID for the bank account.
     */
    public SourceAccountV2Prototype withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
    public SourceAccountV2Prototype withModifiedDate(String modifiedDate) {
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
    public SourceAccountV2Prototype withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Routing information for the bank. This does not include account number.
     */
    public SourceAccountV2Prototype withRoutingInfo(RoutingInfo routingInfo) {
        Utils.checkNotNull(routingInfo, "routingInfo");
        this.routingInfo = Optional.ofNullable(routingInfo);
        return this;
    }

    /**
     * Routing information for the bank. This does not include account number.
     */
    public SourceAccountV2Prototype withRoutingInfo(Optional<? extends RoutingInfo> routingInfo) {
        Utils.checkNotNull(routingInfo, "routingInfo");
        this.routingInfo = routingInfo;
        return this;
    }

    /**
     * The sort code.
     */
    public SourceAccountV2Prototype withSortCode(String sortCode) {
        Utils.checkNotNull(sortCode, "sortCode");
        this.sortCode = JsonNullable.of(sortCode);
        return this;
    }

    /**
     * The sort code.
     */
    public SourceAccountV2Prototype withSortCode(JsonNullable<String> sortCode) {
        Utils.checkNotNull(sortCode, "sortCode");
        this.sortCode = sortCode;
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
        SourceAccountV2Prototype other = (SourceAccountV2Prototype) o;
        return 
            Objects.deepEquals(this.accountInfo, other.accountInfo) &&
            Objects.deepEquals(this.accountName, other.accountName) &&
            Objects.deepEquals(this.accountNumber, other.accountNumber) &&
            Objects.deepEquals(this.accountType, other.accountType) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.routingInfo, other.routingInfo) &&
            Objects.deepEquals(this.sortCode, other.sortCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountInfo,
            accountName,
            accountNumber,
            accountType,
            balance,
            currency,
            id,
            modifiedDate,
            routingInfo,
            sortCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAccountV2Prototype.class,
                "accountInfo", accountInfo,
                "accountName", accountName,
                "accountNumber", accountNumber,
                "accountType", accountType,
                "balance", balance,
                "currency", currency,
                "id", id,
                "modifiedDate", modifiedDate,
                "routingInfo", routingInfo,
                "sortCode", sortCode);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountInfo> accountInfo = JsonNullable.undefined();
 
        private Optional<String> accountName = Optional.empty();
 
        private Optional<String> accountNumber = Optional.empty();
 
        private Optional<? extends PropertieAccountType> accountType = Optional.empty();
 
        private Optional<? extends BigDecimal> balance = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private Optional<? extends RoutingInfo> routingInfo = Optional.empty();
 
        private JsonNullable<String> sortCode = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountInfo(AccountInfo accountInfo) {
            Utils.checkNotNull(accountInfo, "accountInfo");
            this.accountInfo = JsonNullable.of(accountInfo);
            return this;
        }

        public Builder accountInfo(JsonNullable<? extends AccountInfo> accountInfo) {
            Utils.checkNotNull(accountInfo, "accountInfo");
            this.accountInfo = accountInfo;
            return this;
        }

        /**
         * The bank account name.
         */
        public Builder accountName(String accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        /**
         * The bank account name.
         */
        public Builder accountName(Optional<String> accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
            return this;
        }

        /**
         * The account number.
         */
        public Builder accountNumber(String accountNumber) {
            Utils.checkNotNull(accountNumber, "accountNumber");
            this.accountNumber = Optional.ofNullable(accountNumber);
            return this;
        }

        /**
         * The account number.
         */
        public Builder accountNumber(Optional<String> accountNumber) {
            Utils.checkNotNull(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
         */
        public Builder accountType(PropertieAccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        /**
         * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
         */
        public Builder accountType(Optional<? extends PropertieAccountType> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        /**
         * The latest balance for the bank account.
         */
        public Builder balance(BigDecimal balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * The latest balance for the bank account.
         */
        public Builder balance(double balance) {
            this.balance = Optional.of(BigDecimal.valueOf(balance));
            return this;
        }

        /**
         * The latest balance for the bank account.
         */
        public Builder balance(Optional<? extends BigDecimal> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
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
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
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
        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Unique ID for the bank account.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique ID for the bank account.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
         * Routing information for the bank. This does not include account number.
         */
        public Builder routingInfo(RoutingInfo routingInfo) {
            Utils.checkNotNull(routingInfo, "routingInfo");
            this.routingInfo = Optional.ofNullable(routingInfo);
            return this;
        }

        /**
         * Routing information for the bank. This does not include account number.
         */
        public Builder routingInfo(Optional<? extends RoutingInfo> routingInfo) {
            Utils.checkNotNull(routingInfo, "routingInfo");
            this.routingInfo = routingInfo;
            return this;
        }

        /**
         * The sort code.
         */
        public Builder sortCode(String sortCode) {
            Utils.checkNotNull(sortCode, "sortCode");
            this.sortCode = JsonNullable.of(sortCode);
            return this;
        }

        /**
         * The sort code.
         */
        public Builder sortCode(JsonNullable<String> sortCode) {
            Utils.checkNotNull(sortCode, "sortCode");
            this.sortCode = sortCode;
            return this;
        }
        
        public SourceAccountV2Prototype build() {
            return new SourceAccountV2Prototype(
                accountInfo,
                accountName,
                accountNumber,
                accountType,
                balance,
                currency,
                id,
                modifiedDate,
                routingInfo,
                sortCode);
        }
    }
}
