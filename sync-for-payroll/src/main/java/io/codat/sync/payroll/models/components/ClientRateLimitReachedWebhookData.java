/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ClientRateLimitReachedWebhookData {

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

    @JsonCreator
    public ClientRateLimitReachedWebhookData(
            @JsonProperty("DailyQuota") Optional<Long> dailyQuota,
            @JsonProperty("ExpiresUtc") Optional<String> expiresUtc) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        this.dailyQuota = dailyQuota;
        this.expiresUtc = expiresUtc;
    }
    
    public ClientRateLimitReachedWebhookData() {
        this(Optional.empty(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The number of available requests per day.
     */
    public ClientRateLimitReachedWebhookData withDailyQuota(long dailyQuota) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        this.dailyQuota = Optional.ofNullable(dailyQuota);
        return this;
    }

    /**
     * The number of available requests per day.
     */
    public ClientRateLimitReachedWebhookData withDailyQuota(Optional<Long> dailyQuota) {
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
    public ClientRateLimitReachedWebhookData withExpiresUtc(String expiresUtc) {
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
    public ClientRateLimitReachedWebhookData withExpiresUtc(Optional<String> expiresUtc) {
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        this.expiresUtc = expiresUtc;
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
        ClientRateLimitReachedWebhookData other = (ClientRateLimitReachedWebhookData) o;
        return 
            Objects.deepEquals(this.dailyQuota, other.dailyQuota) &&
            Objects.deepEquals(this.expiresUtc, other.expiresUtc);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dailyQuota,
            expiresUtc);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ClientRateLimitReachedWebhookData.class,
                "dailyQuota", dailyQuota,
                "expiresUtc", expiresUtc);
    }
    
    public final static class Builder {
 
        private Optional<Long> dailyQuota = Optional.empty();
 
        private Optional<String> expiresUtc = Optional.empty();  
        
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
        
        public ClientRateLimitReachedWebhookData build() {
            return new ClientRateLimitReachedWebhookData(
                dailyQuota,
                expiresUtc);
        }
    }
}

