/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.bank_feeds.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SourceAccountV2 - The target bank account in a supported accounting software for ingestion into a bank feed.
 */

public class SourceAccountV2 {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountInfo")
    private JsonNullable<? extends AccountInfo> accountInfo;

    /**
     * The bank account name.
     */
    @JsonProperty("accountName")
    private String accountName;

    /**
     * The account number.
     */
    @JsonProperty("accountNumber")
    private String accountNumber;

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    @JsonProperty("accountType")
    private AccountType accountType;

    /**
     * The latest balance for the bank account.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
     * ```
     * 2020-10-08
     * ```
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feedStartDate")
    private JsonNullable<String> feedStartDate;

    /**
     * Unique ID for the bank account.
     */
    @JsonProperty("id")
    private String id;

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
     * Status of the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends SourceAccountV2Status> status;

    @JsonCreator
    public SourceAccountV2(
            @JsonProperty("accountInfo") JsonNullable<? extends AccountInfo> accountInfo,
            @JsonProperty("accountName") String accountName,
            @JsonProperty("accountNumber") String accountNumber,
            @JsonProperty("accountType") AccountType accountType,
            @JsonProperty("balance") BigDecimal balance,
            @JsonProperty("currency") String currency,
            @JsonProperty("feedStartDate") JsonNullable<String> feedStartDate,
            @JsonProperty("id") String id,
            @JsonProperty("modifiedDate") Optional<String> modifiedDate,
            @JsonProperty("routingInfo") Optional<? extends RoutingInfo> routingInfo,
            @JsonProperty("status") JsonNullable<? extends SourceAccountV2Status> status) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(accountNumber, "accountNumber");
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        Utils.checkNotNull(routingInfo, "routingInfo");
        Utils.checkNotNull(status, "status");
        this.accountInfo = accountInfo;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.currency = currency;
        this.feedStartDate = feedStartDate;
        this.id = id;
        this.modifiedDate = modifiedDate;
        this.routingInfo = routingInfo;
        this.status = status;
    }
    
    public SourceAccountV2(
            String accountName,
            String accountNumber,
            AccountType accountType,
            BigDecimal balance,
            String currency,
            String id) {
        this(JsonNullable.undefined(), accountName, accountNumber, accountType, balance, currency, JsonNullable.undefined(), id, Optional.empty(), Optional.empty(), JsonNullable.undefined());
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
    public String accountName() {
        return accountName;
    }

    /**
     * The account number.
     */
    @JsonIgnore
    public String accountNumber() {
        return accountNumber;
    }

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    @JsonIgnore
    public AccountType accountType() {
        return accountType;
    }

    /**
     * The latest balance for the bank account.
     */
    @JsonIgnore
    public BigDecimal balance() {
        return balance;
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
    public String currency() {
        return currency;
    }

    /**
     * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
     * ```
     * 2020-10-08
     * ```
     */
    @JsonIgnore
    public JsonNullable<String> feedStartDate() {
        return feedStartDate;
    }

    /**
     * Unique ID for the bank account.
     */
    @JsonIgnore
    public String id() {
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
     * Status of the source account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<SourceAccountV2Status> status() {
        return (JsonNullable<SourceAccountV2Status>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceAccountV2 withAccountInfo(AccountInfo accountInfo) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        this.accountInfo = JsonNullable.of(accountInfo);
        return this;
    }

    public SourceAccountV2 withAccountInfo(JsonNullable<? extends AccountInfo> accountInfo) {
        Utils.checkNotNull(accountInfo, "accountInfo");
        this.accountInfo = accountInfo;
        return this;
    }

    /**
     * The bank account name.
     */
    public SourceAccountV2 withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    /**
     * The account number.
     */
    public SourceAccountV2 withAccountNumber(String accountNumber) {
        Utils.checkNotNull(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
     */
    public SourceAccountV2 withAccountType(AccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

        /**
         * The latest balance for the bank account.
         */
    public SourceAccountV2 withBalance(double balance) {
        this.balance = BigDecimal.valueOf(balance);
        return this;
    }

    /**
     * The latest balance for the bank account.
     */
    public SourceAccountV2 withBalance(BigDecimal balance) {
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
    public SourceAccountV2 withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
     * ```
     * 2020-10-08
     * ```
     */
    public SourceAccountV2 withFeedStartDate(String feedStartDate) {
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        this.feedStartDate = JsonNullable.of(feedStartDate);
        return this;
    }

    /**
     * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
     * ```
     * 2020-10-08
     * ```
     */
    public SourceAccountV2 withFeedStartDate(JsonNullable<String> feedStartDate) {
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        this.feedStartDate = feedStartDate;
        return this;
    }

    /**
     * Unique ID for the bank account.
     */
    public SourceAccountV2 withId(String id) {
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
    public SourceAccountV2 withModifiedDate(String modifiedDate) {
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
    public SourceAccountV2 withModifiedDate(Optional<String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Routing information for the bank. This does not include account number.
     */
    public SourceAccountV2 withRoutingInfo(RoutingInfo routingInfo) {
        Utils.checkNotNull(routingInfo, "routingInfo");
        this.routingInfo = Optional.ofNullable(routingInfo);
        return this;
    }

    /**
     * Routing information for the bank. This does not include account number.
     */
    public SourceAccountV2 withRoutingInfo(Optional<? extends RoutingInfo> routingInfo) {
        Utils.checkNotNull(routingInfo, "routingInfo");
        this.routingInfo = routingInfo;
        return this;
    }

    /**
     * Status of the source account.
     */
    public SourceAccountV2 withStatus(SourceAccountV2Status status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Status of the source account.
     */
    public SourceAccountV2 withStatus(JsonNullable<? extends SourceAccountV2Status> status) {
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
        SourceAccountV2 other = (SourceAccountV2) o;
        return 
            Objects.deepEquals(this.accountInfo, other.accountInfo) &&
            Objects.deepEquals(this.accountName, other.accountName) &&
            Objects.deepEquals(this.accountNumber, other.accountNumber) &&
            Objects.deepEquals(this.accountType, other.accountType) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.feedStartDate, other.feedStartDate) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.modifiedDate, other.modifiedDate) &&
            Objects.deepEquals(this.routingInfo, other.routingInfo) &&
            Objects.deepEquals(this.status, other.status);
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
            feedStartDate,
            id,
            modifiedDate,
            routingInfo,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAccountV2.class,
                "accountInfo", accountInfo,
                "accountName", accountName,
                "accountNumber", accountNumber,
                "accountType", accountType,
                "balance", balance,
                "currency", currency,
                "feedStartDate", feedStartDate,
                "id", id,
                "modifiedDate", modifiedDate,
                "routingInfo", routingInfo,
                "status", status);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountInfo> accountInfo = JsonNullable.undefined();
 
        private String accountName;
 
        private String accountNumber;
 
        private AccountType accountType;
 
        private BigDecimal balance;
 
        private String currency;
 
        private JsonNullable<String> feedStartDate = JsonNullable.undefined();
 
        private String id;
 
        private Optional<String> modifiedDate = Optional.empty();
 
        private Optional<? extends RoutingInfo> routingInfo = Optional.empty();
 
        private JsonNullable<? extends SourceAccountV2Status> status = JsonNullable.undefined();  
        
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
            this.accountName = accountName;
            return this;
        }

        /**
         * The account number.
         */
        public Builder accountNumber(String accountNumber) {
            Utils.checkNotNull(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * The type of bank account e.g. checking, savings, loan, creditCard, prepaidCard.
         */
        public Builder accountType(AccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        /**
         * The latest balance for the bank account.
         */
        public Builder balance(double balance) {
            this.balance = BigDecimal.valueOf(balance);
            return this;
        }

        /**
         * The latest balance for the bank account.
         */
        public Builder balance(BigDecimal balance) {
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
            this.currency = currency;
            return this;
        }

        /**
         * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
         * ```
         * 2020-10-08
         * ```
         */
        public Builder feedStartDate(String feedStartDate) {
            Utils.checkNotNull(feedStartDate, "feedStartDate");
            this.feedStartDate = JsonNullable.of(feedStartDate);
            return this;
        }

        /**
         * In Codat's data model, dates are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date fields are formatted as strings; for example:
         * ```
         * 2020-10-08
         * ```
         */
        public Builder feedStartDate(JsonNullable<String> feedStartDate) {
            Utils.checkNotNull(feedStartDate, "feedStartDate");
            this.feedStartDate = feedStartDate;
            return this;
        }

        /**
         * Unique ID for the bank account.
         */
        public Builder id(String id) {
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
         * Status of the source account.
         */
        public Builder status(SourceAccountV2Status status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Status of the source account.
         */
        public Builder status(JsonNullable<? extends SourceAccountV2Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public SourceAccountV2 build() {
            return new SourceAccountV2(
                accountInfo,
                accountName,
                accountNumber,
                accountType,
                balance,
                currency,
                feedStartDate,
                id,
                modifiedDate,
                routingInfo,
                status);
        }
    }
}

