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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ClientRateLimitResetWebhookData {

    /**
     * The number of available requests per day.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DailyQuota")
    private Optional<Long> dailyQuota;

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
    @JsonProperty("ExpiresUtc")
    private Optional<String> expiresUtc;

    /**
     * Total number of requests remaining for your client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("QuotaRemaining")
    private JsonNullable<Long> quotaRemaining;

    /**
     * The reason for your rate limit quota being reset.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ResetReason")
    private Optional<String> resetReason;

    @JsonCreator
    public ClientRateLimitResetWebhookData(
            @JsonProperty("DailyQuota") Optional<Long> dailyQuota,
            @JsonProperty("ExpiresUtc") Optional<String> expiresUtc,
            @JsonProperty("QuotaRemaining") JsonNullable<Long> quotaRemaining,
            @JsonProperty("ResetReason") Optional<String> resetReason) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        Utils.checkNotNull(quotaRemaining, "quotaRemaining");
        Utils.checkNotNull(resetReason, "resetReason");
        this.dailyQuota = dailyQuota;
        this.expiresUtc = expiresUtc;
        this.quotaRemaining = quotaRemaining;
        this.resetReason = resetReason;
    }
    
    public ClientRateLimitResetWebhookData() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The number of available requests per day.
     */
    @JsonIgnore
    public Optional<Long> dailyQuota() {
        return dailyQuota;
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
    public Optional<String> expiresUtc() {
        return expiresUtc;
    }

    /**
     * Total number of requests remaining for your client.
     */
    @JsonIgnore
    public JsonNullable<Long> quotaRemaining() {
        return quotaRemaining;
    }

    /**
     * The reason for your rate limit quota being reset.
     */
    @JsonIgnore
    public Optional<String> resetReason() {
        return resetReason;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The number of available requests per day.
     */
    public ClientRateLimitResetWebhookData withDailyQuota(long dailyQuota) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        this.dailyQuota = Optional.ofNullable(dailyQuota);
        return this;
    }

    /**
     * The number of available requests per day.
     */
    public ClientRateLimitResetWebhookData withDailyQuota(Optional<Long> dailyQuota) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        this.dailyQuota = dailyQuota;
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
    public ClientRateLimitResetWebhookData withExpiresUtc(String expiresUtc) {
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        this.expiresUtc = Optional.ofNullable(expiresUtc);
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
    public ClientRateLimitResetWebhookData withExpiresUtc(Optional<String> expiresUtc) {
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        this.expiresUtc = expiresUtc;
        return this;
    }

    /**
     * Total number of requests remaining for your client.
     */
    public ClientRateLimitResetWebhookData withQuotaRemaining(long quotaRemaining) {
        Utils.checkNotNull(quotaRemaining, "quotaRemaining");
        this.quotaRemaining = JsonNullable.of(quotaRemaining);
        return this;
    }

    /**
     * Total number of requests remaining for your client.
     */
    public ClientRateLimitResetWebhookData withQuotaRemaining(JsonNullable<Long> quotaRemaining) {
        Utils.checkNotNull(quotaRemaining, "quotaRemaining");
        this.quotaRemaining = quotaRemaining;
        return this;
    }

    /**
     * The reason for your rate limit quota being reset.
     */
    public ClientRateLimitResetWebhookData withResetReason(String resetReason) {
        Utils.checkNotNull(resetReason, "resetReason");
        this.resetReason = Optional.ofNullable(resetReason);
        return this;
    }

    /**
     * The reason for your rate limit quota being reset.
     */
    public ClientRateLimitResetWebhookData withResetReason(Optional<String> resetReason) {
        Utils.checkNotNull(resetReason, "resetReason");
        this.resetReason = resetReason;
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
        ClientRateLimitResetWebhookData other = (ClientRateLimitResetWebhookData) o;
        return 
            Objects.deepEquals(this.dailyQuota, other.dailyQuota) &&
            Objects.deepEquals(this.expiresUtc, other.expiresUtc) &&
            Objects.deepEquals(this.quotaRemaining, other.quotaRemaining) &&
            Objects.deepEquals(this.resetReason, other.resetReason);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dailyQuota,
            expiresUtc,
            quotaRemaining,
            resetReason);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ClientRateLimitResetWebhookData.class,
                "dailyQuota", dailyQuota,
                "expiresUtc", expiresUtc,
                "quotaRemaining", quotaRemaining,
                "resetReason", resetReason);
    }
    
    public final static class Builder {
 
        private Optional<Long> dailyQuota = Optional.empty();
 
        private Optional<String> expiresUtc = Optional.empty();
 
        private JsonNullable<Long> quotaRemaining = JsonNullable.undefined();
 
        private Optional<String> resetReason = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The number of available requests per day.
         */
        public Builder dailyQuota(long dailyQuota) {
            Utils.checkNotNull(dailyQuota, "dailyQuota");
            this.dailyQuota = Optional.ofNullable(dailyQuota);
            return this;
        }

        /**
         * The number of available requests per day.
         */
        public Builder dailyQuota(Optional<Long> dailyQuota) {
            Utils.checkNotNull(dailyQuota, "dailyQuota");
            this.dailyQuota = dailyQuota;
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
        public Builder expiresUtc(String expiresUtc) {
            Utils.checkNotNull(expiresUtc, "expiresUtc");
            this.expiresUtc = Optional.ofNullable(expiresUtc);
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
        public Builder expiresUtc(Optional<String> expiresUtc) {
            Utils.checkNotNull(expiresUtc, "expiresUtc");
            this.expiresUtc = expiresUtc;
            return this;
        }

        /**
         * Total number of requests remaining for your client.
         */
        public Builder quotaRemaining(long quotaRemaining) {
            Utils.checkNotNull(quotaRemaining, "quotaRemaining");
            this.quotaRemaining = JsonNullable.of(quotaRemaining);
            return this;
        }

        /**
         * Total number of requests remaining for your client.
         */
        public Builder quotaRemaining(JsonNullable<Long> quotaRemaining) {
            Utils.checkNotNull(quotaRemaining, "quotaRemaining");
            this.quotaRemaining = quotaRemaining;
            return this;
        }

        /**
         * The reason for your rate limit quota being reset.
         */
        public Builder resetReason(String resetReason) {
            Utils.checkNotNull(resetReason, "resetReason");
            this.resetReason = Optional.ofNullable(resetReason);
            return this;
        }

        /**
         * The reason for your rate limit quota being reset.
         */
        public Builder resetReason(Optional<String> resetReason) {
            Utils.checkNotNull(resetReason, "resetReason");
            this.resetReason = resetReason;
            return this;
        }
        
        public ClientRateLimitResetWebhookData build() {
            return new ClientRateLimitResetWebhookData(
                dailyQuota,
                expiresUtc,
                quotaRemaining,
                resetReason);
        }
    }
}

