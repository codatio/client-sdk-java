/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class ClientRateLimitReachedWebhookData {

    /**
     * The number of available requests per day.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DailyQuota")
    private Optional<? extends Long> dailyQuota;

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
    private Optional<? extends String> expiresUtc;

    public ClientRateLimitReachedWebhookData(
            @JsonProperty("DailyQuota") Optional<? extends Long> dailyQuota,
            @JsonProperty("ExpiresUtc") Optional<? extends String> expiresUtc) {
        Utils.checkNotNull(dailyQuota, "dailyQuota");
        Utils.checkNotNull(expiresUtc, "expiresUtc");
        this.dailyQuota = dailyQuota;
        this.expiresUtc = expiresUtc;
    }

    /**
     * The number of available requests per day.
     */
    public Optional<? extends Long> dailyQuota() {
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
    public Optional<? extends String> expiresUtc() {
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
    public ClientRateLimitReachedWebhookData withDailyQuota(Optional<? extends Long> dailyQuota) {
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
    public ClientRateLimitReachedWebhookData withExpiresUtc(Optional<? extends String> expiresUtc) {
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
            java.util.Objects.deepEquals(this.dailyQuota, other.dailyQuota) &&
            java.util.Objects.deepEquals(this.expiresUtc, other.expiresUtc);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends Long> dailyQuota = Optional.empty();
 
        private Optional<? extends String> expiresUtc = Optional.empty();  
        
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
        public Builder dailyQuota(Optional<? extends Long> dailyQuota) {
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
        public Builder expiresUtc(Optional<? extends String> expiresUtc) {
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
