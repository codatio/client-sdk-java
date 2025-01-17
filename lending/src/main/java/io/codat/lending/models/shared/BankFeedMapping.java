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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BankFeedMapping - A bank feed connection between a source account and a target account, including potential target accounts.
 */

public class BankFeedMapping {

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
    @JsonProperty("feedStartDate")
    private Optional<String> feedStartDate;

    /**
     * Unique ID for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountId")
    private Optional<String> sourceAccountId;

    /**
     * Name for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountName")
    private Optional<String> sourceAccountName;

    /**
     * Account number for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAccountNumber")
    private Optional<String> sourceAccountNumber;

    /**
     * Balance for the source account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceBalance")
    private Optional<? extends BigDecimal> sourceBalance;

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
    @JsonProperty("sourceCurrency")
    private Optional<String> sourceCurrency;

    /**
     * The status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<String> status;

    /**
     * Unique ID for the target account in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetAccountId")
    private JsonNullable<String> targetAccountId;

    /**
     * Name for the target account in the accounting software.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetAccountName")
    private Optional<String> targetAccountName;

    /**
     * An array of potential target accounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetAccountOptions")
    private JsonNullable<? extends List<TargetAccountOption>> targetAccountOptions;

    @JsonCreator
    public BankFeedMapping(
            @JsonProperty("feedStartDate") Optional<String> feedStartDate,
            @JsonProperty("sourceAccountId") Optional<String> sourceAccountId,
            @JsonProperty("sourceAccountName") Optional<String> sourceAccountName,
            @JsonProperty("sourceAccountNumber") Optional<String> sourceAccountNumber,
            @JsonProperty("sourceBalance") Optional<? extends BigDecimal> sourceBalance,
            @JsonProperty("sourceCurrency") Optional<String> sourceCurrency,
            @JsonProperty("status") Optional<String> status,
            @JsonProperty("targetAccountId") JsonNullable<String> targetAccountId,
            @JsonProperty("targetAccountName") Optional<String> targetAccountName,
            @JsonProperty("targetAccountOptions") JsonNullable<? extends List<TargetAccountOption>> targetAccountOptions) {
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        Utils.checkNotNull(sourceAccountName, "sourceAccountName");
        Utils.checkNotNull(sourceAccountNumber, "sourceAccountNumber");
        Utils.checkNotNull(sourceBalance, "sourceBalance");
        Utils.checkNotNull(sourceCurrency, "sourceCurrency");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        Utils.checkNotNull(targetAccountName, "targetAccountName");
        Utils.checkNotNull(targetAccountOptions, "targetAccountOptions");
        this.feedStartDate = feedStartDate;
        this.sourceAccountId = sourceAccountId;
        this.sourceAccountName = sourceAccountName;
        this.sourceAccountNumber = sourceAccountNumber;
        this.sourceBalance = sourceBalance;
        this.sourceCurrency = sourceCurrency;
        this.status = status;
        this.targetAccountId = targetAccountId;
        this.targetAccountName = targetAccountName;
        this.targetAccountOptions = targetAccountOptions;
    }
    
    public BankFeedMapping() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined());
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
    public Optional<String> feedStartDate() {
        return feedStartDate;
    }

    /**
     * Unique ID for the source account.
     */
    @JsonIgnore
    public Optional<String> sourceAccountId() {
        return sourceAccountId;
    }

    /**
     * Name for the source account.
     */
    @JsonIgnore
    public Optional<String> sourceAccountName() {
        return sourceAccountName;
    }

    /**
     * Account number for the source account.
     */
    @JsonIgnore
    public Optional<String> sourceAccountNumber() {
        return sourceAccountNumber;
    }

    /**
     * Balance for the source account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> sourceBalance() {
        return (Optional<BigDecimal>) sourceBalance;
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
    public Optional<String> sourceCurrency() {
        return sourceCurrency;
    }

    /**
     * The status.
     */
    @JsonIgnore
    public Optional<String> status() {
        return status;
    }

    /**
     * Unique ID for the target account in the accounting software.
     */
    @JsonIgnore
    public JsonNullable<String> targetAccountId() {
        return targetAccountId;
    }

    /**
     * Name for the target account in the accounting software.
     */
    @JsonIgnore
    public Optional<String> targetAccountName() {
        return targetAccountName;
    }

    /**
     * An array of potential target accounts.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<TargetAccountOption>> targetAccountOptions() {
        return (JsonNullable<List<TargetAccountOption>>) targetAccountOptions;
    }

    public final static Builder builder() {
        return new Builder();
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
    public BankFeedMapping withFeedStartDate(String feedStartDate) {
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        this.feedStartDate = Optional.ofNullable(feedStartDate);
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
    public BankFeedMapping withFeedStartDate(Optional<String> feedStartDate) {
        Utils.checkNotNull(feedStartDate, "feedStartDate");
        this.feedStartDate = feedStartDate;
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public BankFeedMapping withSourceAccountId(String sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = Optional.ofNullable(sourceAccountId);
        return this;
    }

    /**
     * Unique ID for the source account.
     */
    public BankFeedMapping withSourceAccountId(Optional<String> sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = sourceAccountId;
        return this;
    }

    /**
     * Name for the source account.
     */
    public BankFeedMapping withSourceAccountName(String sourceAccountName) {
        Utils.checkNotNull(sourceAccountName, "sourceAccountName");
        this.sourceAccountName = Optional.ofNullable(sourceAccountName);
        return this;
    }

    /**
     * Name for the source account.
     */
    public BankFeedMapping withSourceAccountName(Optional<String> sourceAccountName) {
        Utils.checkNotNull(sourceAccountName, "sourceAccountName");
        this.sourceAccountName = sourceAccountName;
        return this;
    }

    /**
     * Account number for the source account.
     */
    public BankFeedMapping withSourceAccountNumber(String sourceAccountNumber) {
        Utils.checkNotNull(sourceAccountNumber, "sourceAccountNumber");
        this.sourceAccountNumber = Optional.ofNullable(sourceAccountNumber);
        return this;
    }

    /**
     * Account number for the source account.
     */
    public BankFeedMapping withSourceAccountNumber(Optional<String> sourceAccountNumber) {
        Utils.checkNotNull(sourceAccountNumber, "sourceAccountNumber");
        this.sourceAccountNumber = sourceAccountNumber;
        return this;
    }

    /**
     * Balance for the source account.
     */
    public BankFeedMapping withSourceBalance(BigDecimal sourceBalance) {
        Utils.checkNotNull(sourceBalance, "sourceBalance");
        this.sourceBalance = Optional.ofNullable(sourceBalance);
        return this;
    }

        /**
         * Balance for the source account.
         */
    public BankFeedMapping withSourceBalance(double sourceBalance) {
        this.sourceBalance = Optional.of(BigDecimal.valueOf(sourceBalance));
        return this;
    }

    /**
     * Balance for the source account.
     */
    public BankFeedMapping withSourceBalance(Optional<? extends BigDecimal> sourceBalance) {
        Utils.checkNotNull(sourceBalance, "sourceBalance");
        this.sourceBalance = sourceBalance;
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
    public BankFeedMapping withSourceCurrency(String sourceCurrency) {
        Utils.checkNotNull(sourceCurrency, "sourceCurrency");
        this.sourceCurrency = Optional.ofNullable(sourceCurrency);
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
    public BankFeedMapping withSourceCurrency(Optional<String> sourceCurrency) {
        Utils.checkNotNull(sourceCurrency, "sourceCurrency");
        this.sourceCurrency = sourceCurrency;
        return this;
    }

    /**
     * The status.
     */
    public BankFeedMapping withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status.
     */
    public BankFeedMapping withStatus(Optional<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Unique ID for the target account in the accounting software.
     */
    public BankFeedMapping withTargetAccountId(String targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = JsonNullable.of(targetAccountId);
        return this;
    }

    /**
     * Unique ID for the target account in the accounting software.
     */
    public BankFeedMapping withTargetAccountId(JsonNullable<String> targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = targetAccountId;
        return this;
    }

    /**
     * Name for the target account in the accounting software.
     */
    public BankFeedMapping withTargetAccountName(String targetAccountName) {
        Utils.checkNotNull(targetAccountName, "targetAccountName");
        this.targetAccountName = Optional.ofNullable(targetAccountName);
        return this;
    }

    /**
     * Name for the target account in the accounting software.
     */
    public BankFeedMapping withTargetAccountName(Optional<String> targetAccountName) {
        Utils.checkNotNull(targetAccountName, "targetAccountName");
        this.targetAccountName = targetAccountName;
        return this;
    }

    /**
     * An array of potential target accounts.
     */
    public BankFeedMapping withTargetAccountOptions(List<TargetAccountOption> targetAccountOptions) {
        Utils.checkNotNull(targetAccountOptions, "targetAccountOptions");
        this.targetAccountOptions = JsonNullable.of(targetAccountOptions);
        return this;
    }

    /**
     * An array of potential target accounts.
     */
    public BankFeedMapping withTargetAccountOptions(JsonNullable<? extends List<TargetAccountOption>> targetAccountOptions) {
        Utils.checkNotNull(targetAccountOptions, "targetAccountOptions");
        this.targetAccountOptions = targetAccountOptions;
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
        BankFeedMapping other = (BankFeedMapping) o;
        return 
            Objects.deepEquals(this.feedStartDate, other.feedStartDate) &&
            Objects.deepEquals(this.sourceAccountId, other.sourceAccountId) &&
            Objects.deepEquals(this.sourceAccountName, other.sourceAccountName) &&
            Objects.deepEquals(this.sourceAccountNumber, other.sourceAccountNumber) &&
            Objects.deepEquals(this.sourceBalance, other.sourceBalance) &&
            Objects.deepEquals(this.sourceCurrency, other.sourceCurrency) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.targetAccountId, other.targetAccountId) &&
            Objects.deepEquals(this.targetAccountName, other.targetAccountName) &&
            Objects.deepEquals(this.targetAccountOptions, other.targetAccountOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            feedStartDate,
            sourceAccountId,
            sourceAccountName,
            sourceAccountNumber,
            sourceBalance,
            sourceCurrency,
            status,
            targetAccountId,
            targetAccountName,
            targetAccountOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankFeedMapping.class,
                "feedStartDate", feedStartDate,
                "sourceAccountId", sourceAccountId,
                "sourceAccountName", sourceAccountName,
                "sourceAccountNumber", sourceAccountNumber,
                "sourceBalance", sourceBalance,
                "sourceCurrency", sourceCurrency,
                "status", status,
                "targetAccountId", targetAccountId,
                "targetAccountName", targetAccountName,
                "targetAccountOptions", targetAccountOptions);
    }
    
    public final static class Builder {
 
        private Optional<String> feedStartDate = Optional.empty();
 
        private Optional<String> sourceAccountId = Optional.empty();
 
        private Optional<String> sourceAccountName = Optional.empty();
 
        private Optional<String> sourceAccountNumber = Optional.empty();
 
        private Optional<? extends BigDecimal> sourceBalance = Optional.empty();
 
        private Optional<String> sourceCurrency = Optional.empty();
 
        private Optional<String> status = Optional.empty();
 
        private JsonNullable<String> targetAccountId = JsonNullable.undefined();
 
        private Optional<String> targetAccountName = Optional.empty();
 
        private JsonNullable<? extends List<TargetAccountOption>> targetAccountOptions = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder feedStartDate(String feedStartDate) {
            Utils.checkNotNull(feedStartDate, "feedStartDate");
            this.feedStartDate = Optional.ofNullable(feedStartDate);
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
        public Builder feedStartDate(Optional<String> feedStartDate) {
            Utils.checkNotNull(feedStartDate, "feedStartDate");
            this.feedStartDate = feedStartDate;
            return this;
        }

        /**
         * Unique ID for the source account.
         */
        public Builder sourceAccountId(String sourceAccountId) {
            Utils.checkNotNull(sourceAccountId, "sourceAccountId");
            this.sourceAccountId = Optional.ofNullable(sourceAccountId);
            return this;
        }

        /**
         * Unique ID for the source account.
         */
        public Builder sourceAccountId(Optional<String> sourceAccountId) {
            Utils.checkNotNull(sourceAccountId, "sourceAccountId");
            this.sourceAccountId = sourceAccountId;
            return this;
        }

        /**
         * Name for the source account.
         */
        public Builder sourceAccountName(String sourceAccountName) {
            Utils.checkNotNull(sourceAccountName, "sourceAccountName");
            this.sourceAccountName = Optional.ofNullable(sourceAccountName);
            return this;
        }

        /**
         * Name for the source account.
         */
        public Builder sourceAccountName(Optional<String> sourceAccountName) {
            Utils.checkNotNull(sourceAccountName, "sourceAccountName");
            this.sourceAccountName = sourceAccountName;
            return this;
        }

        /**
         * Account number for the source account.
         */
        public Builder sourceAccountNumber(String sourceAccountNumber) {
            Utils.checkNotNull(sourceAccountNumber, "sourceAccountNumber");
            this.sourceAccountNumber = Optional.ofNullable(sourceAccountNumber);
            return this;
        }

        /**
         * Account number for the source account.
         */
        public Builder sourceAccountNumber(Optional<String> sourceAccountNumber) {
            Utils.checkNotNull(sourceAccountNumber, "sourceAccountNumber");
            this.sourceAccountNumber = sourceAccountNumber;
            return this;
        }

        /**
         * Balance for the source account.
         */
        public Builder sourceBalance(BigDecimal sourceBalance) {
            Utils.checkNotNull(sourceBalance, "sourceBalance");
            this.sourceBalance = Optional.ofNullable(sourceBalance);
            return this;
        }

        /**
         * Balance for the source account.
         */
        public Builder sourceBalance(double sourceBalance) {
            this.sourceBalance = Optional.of(BigDecimal.valueOf(sourceBalance));
            return this;
        }

        /**
         * Balance for the source account.
         */
        public Builder sourceBalance(Optional<? extends BigDecimal> sourceBalance) {
            Utils.checkNotNull(sourceBalance, "sourceBalance");
            this.sourceBalance = sourceBalance;
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
        public Builder sourceCurrency(String sourceCurrency) {
            Utils.checkNotNull(sourceCurrency, "sourceCurrency");
            this.sourceCurrency = Optional.ofNullable(sourceCurrency);
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
        public Builder sourceCurrency(Optional<String> sourceCurrency) {
            Utils.checkNotNull(sourceCurrency, "sourceCurrency");
            this.sourceCurrency = sourceCurrency;
            return this;
        }

        /**
         * The status.
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status.
         */
        public Builder status(Optional<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Unique ID for the target account in the accounting software.
         */
        public Builder targetAccountId(String targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = JsonNullable.of(targetAccountId);
            return this;
        }

        /**
         * Unique ID for the target account in the accounting software.
         */
        public Builder targetAccountId(JsonNullable<String> targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = targetAccountId;
            return this;
        }

        /**
         * Name for the target account in the accounting software.
         */
        public Builder targetAccountName(String targetAccountName) {
            Utils.checkNotNull(targetAccountName, "targetAccountName");
            this.targetAccountName = Optional.ofNullable(targetAccountName);
            return this;
        }

        /**
         * Name for the target account in the accounting software.
         */
        public Builder targetAccountName(Optional<String> targetAccountName) {
            Utils.checkNotNull(targetAccountName, "targetAccountName");
            this.targetAccountName = targetAccountName;
            return this;
        }

        /**
         * An array of potential target accounts.
         */
        public Builder targetAccountOptions(List<TargetAccountOption> targetAccountOptions) {
            Utils.checkNotNull(targetAccountOptions, "targetAccountOptions");
            this.targetAccountOptions = JsonNullable.of(targetAccountOptions);
            return this;
        }

        /**
         * An array of potential target accounts.
         */
        public Builder targetAccountOptions(JsonNullable<? extends List<TargetAccountOption>> targetAccountOptions) {
            Utils.checkNotNull(targetAccountOptions, "targetAccountOptions");
            this.targetAccountOptions = targetAccountOptions;
            return this;
        }
        
        public BankFeedMapping build() {
            return new BankFeedMapping(
                feedStartDate,
                sourceAccountId,
                sourceAccountName,
                sourceAccountNumber,
                sourceBalance,
                sourceCurrency,
                status,
                targetAccountId,
                targetAccountName,
                targetAccountOptions);
        }
    }
}

