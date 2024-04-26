/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * SyncSetting - Describes how often, and how much history, should be fetched for the given data type when a pull operation is queued.
 */

public class SyncSetting {

    /**
     * Available data types
     */
    @JsonProperty("dataType")
    private DataType dataType;

    /**
     * Whether this data type should be queued after a company has authorized a connection.
     */
    @JsonProperty("fetchOnFirstLink")
    private boolean fetchOnFirstLink;

    /**
     * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isLocked")
    private Optional<? extends Boolean> isLocked;

    /**
     * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("monthsToSync")
    private Optional<? extends Long> monthsToSync;

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
    @JsonProperty("syncFromUtc")
    private Optional<? extends String> syncFromUtc;

    /**
     * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncFromWindow")
    private Optional<? extends Long> syncFromWindow;

    /**
     * The sync in which data types are queued for a sync.
     */
    @JsonProperty("syncOrder")
    private long syncOrder;

    /**
     * Number of hours after which this data type should be refreshed.
     */
    @JsonProperty("syncSchedule")
    private long syncSchedule;

    @JsonCreator
    public SyncSetting(
            @JsonProperty("dataType") DataType dataType,
            @JsonProperty("fetchOnFirstLink") boolean fetchOnFirstLink,
            @JsonProperty("isLocked") Optional<? extends Boolean> isLocked,
            @JsonProperty("monthsToSync") Optional<? extends Long> monthsToSync,
            @JsonProperty("syncFromUtc") Optional<? extends String> syncFromUtc,
            @JsonProperty("syncFromWindow") Optional<? extends Long> syncFromWindow,
            @JsonProperty("syncOrder") long syncOrder,
            @JsonProperty("syncSchedule") long syncSchedule) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(fetchOnFirstLink, "fetchOnFirstLink");
        Utils.checkNotNull(isLocked, "isLocked");
        Utils.checkNotNull(monthsToSync, "monthsToSync");
        Utils.checkNotNull(syncFromUtc, "syncFromUtc");
        Utils.checkNotNull(syncFromWindow, "syncFromWindow");
        Utils.checkNotNull(syncOrder, "syncOrder");
        Utils.checkNotNull(syncSchedule, "syncSchedule");
        this.dataType = dataType;
        this.fetchOnFirstLink = fetchOnFirstLink;
        this.isLocked = isLocked;
        this.monthsToSync = monthsToSync;
        this.syncFromUtc = syncFromUtc;
        this.syncFromWindow = syncFromWindow;
        this.syncOrder = syncOrder;
        this.syncSchedule = syncSchedule;
    }
    
    public SyncSetting(
            DataType dataType,
            boolean fetchOnFirstLink,
            long syncOrder,
            long syncSchedule) {
        this(dataType, fetchOnFirstLink, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), syncOrder, syncSchedule);
    }

    /**
     * Available data types
     */
    @JsonIgnore
    public DataType dataType() {
        return dataType;
    }

    /**
     * Whether this data type should be queued after a company has authorized a connection.
     */
    @JsonIgnore
    public boolean fetchOnFirstLink() {
        return fetchOnFirstLink;
    }

    /**
     * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
     */
    @JsonIgnore
    public Optional<? extends Boolean> isLocked() {
        return isLocked;
    }

    /**
     * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
     */
    @JsonIgnore
    public Optional<? extends Long> monthsToSync() {
        return monthsToSync;
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
    public Optional<? extends String> syncFromUtc() {
        return syncFromUtc;
    }

    /**
     * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
     */
    @JsonIgnore
    public Optional<? extends Long> syncFromWindow() {
        return syncFromWindow;
    }

    /**
     * The sync in which data types are queued for a sync.
     */
    @JsonIgnore
    public long syncOrder() {
        return syncOrder;
    }

    /**
     * Number of hours after which this data type should be refreshed.
     */
    @JsonIgnore
    public long syncSchedule() {
        return syncSchedule;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public SyncSetting withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Whether this data type should be queued after a company has authorized a connection.
     */
    public SyncSetting withFetchOnFirstLink(boolean fetchOnFirstLink) {
        Utils.checkNotNull(fetchOnFirstLink, "fetchOnFirstLink");
        this.fetchOnFirstLink = fetchOnFirstLink;
        return this;
    }

    /**
     * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
     */
    public SyncSetting withIsLocked(boolean isLocked) {
        Utils.checkNotNull(isLocked, "isLocked");
        this.isLocked = Optional.ofNullable(isLocked);
        return this;
    }

    /**
     * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
     */
    public SyncSetting withIsLocked(Optional<? extends Boolean> isLocked) {
        Utils.checkNotNull(isLocked, "isLocked");
        this.isLocked = isLocked;
        return this;
    }

    /**
     * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
     */
    public SyncSetting withMonthsToSync(long monthsToSync) {
        Utils.checkNotNull(monthsToSync, "monthsToSync");
        this.monthsToSync = Optional.ofNullable(monthsToSync);
        return this;
    }

    /**
     * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
     */
    public SyncSetting withMonthsToSync(Optional<? extends Long> monthsToSync) {
        Utils.checkNotNull(monthsToSync, "monthsToSync");
        this.monthsToSync = monthsToSync;
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
    public SyncSetting withSyncFromUtc(String syncFromUtc) {
        Utils.checkNotNull(syncFromUtc, "syncFromUtc");
        this.syncFromUtc = Optional.ofNullable(syncFromUtc);
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
    public SyncSetting withSyncFromUtc(Optional<? extends String> syncFromUtc) {
        Utils.checkNotNull(syncFromUtc, "syncFromUtc");
        this.syncFromUtc = syncFromUtc;
        return this;
    }

    /**
     * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
     */
    public SyncSetting withSyncFromWindow(long syncFromWindow) {
        Utils.checkNotNull(syncFromWindow, "syncFromWindow");
        this.syncFromWindow = Optional.ofNullable(syncFromWindow);
        return this;
    }

    /**
     * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
     */
    public SyncSetting withSyncFromWindow(Optional<? extends Long> syncFromWindow) {
        Utils.checkNotNull(syncFromWindow, "syncFromWindow");
        this.syncFromWindow = syncFromWindow;
        return this;
    }

    /**
     * The sync in which data types are queued for a sync.
     */
    public SyncSetting withSyncOrder(long syncOrder) {
        Utils.checkNotNull(syncOrder, "syncOrder");
        this.syncOrder = syncOrder;
        return this;
    }

    /**
     * Number of hours after which this data type should be refreshed.
     */
    public SyncSetting withSyncSchedule(long syncSchedule) {
        Utils.checkNotNull(syncSchedule, "syncSchedule");
        this.syncSchedule = syncSchedule;
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
        SyncSetting other = (SyncSetting) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.fetchOnFirstLink, other.fetchOnFirstLink) &&
            java.util.Objects.deepEquals(this.isLocked, other.isLocked) &&
            java.util.Objects.deepEquals(this.monthsToSync, other.monthsToSync) &&
            java.util.Objects.deepEquals(this.syncFromUtc, other.syncFromUtc) &&
            java.util.Objects.deepEquals(this.syncFromWindow, other.syncFromWindow) &&
            java.util.Objects.deepEquals(this.syncOrder, other.syncOrder) &&
            java.util.Objects.deepEquals(this.syncSchedule, other.syncSchedule);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            fetchOnFirstLink,
            isLocked,
            monthsToSync,
            syncFromUtc,
            syncFromWindow,
            syncOrder,
            syncSchedule);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncSetting.class,
                "dataType", dataType,
                "fetchOnFirstLink", fetchOnFirstLink,
                "isLocked", isLocked,
                "monthsToSync", monthsToSync,
                "syncFromUtc", syncFromUtc,
                "syncFromWindow", syncFromWindow,
                "syncOrder", syncOrder,
                "syncSchedule", syncSchedule);
    }
    
    public final static class Builder {
 
        private DataType dataType;
 
        private Boolean fetchOnFirstLink;
 
        private Optional<? extends Boolean> isLocked = Optional.empty();
 
        private Optional<? extends Long> monthsToSync = Optional.empty();
 
        private Optional<? extends String> syncFromUtc = Optional.empty();
 
        private Optional<? extends Long> syncFromWindow = Optional.empty();
 
        private Long syncOrder;
 
        private Long syncSchedule;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Whether this data type should be queued after a company has authorized a connection.
         */
        public Builder fetchOnFirstLink(boolean fetchOnFirstLink) {
            Utils.checkNotNull(fetchOnFirstLink, "fetchOnFirstLink");
            this.fetchOnFirstLink = fetchOnFirstLink;
            return this;
        }

        /**
         * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
         */
        public Builder isLocked(boolean isLocked) {
            Utils.checkNotNull(isLocked, "isLocked");
            this.isLocked = Optional.ofNullable(isLocked);
            return this;
        }

        /**
         * `True` if the [sync setting](https://docs.codat.io/knowledge-base/advanced-sync-settings) is locked.
         */
        public Builder isLocked(Optional<? extends Boolean> isLocked) {
            Utils.checkNotNull(isLocked, "isLocked");
            this.isLocked = isLocked;
            return this;
        }

        /**
         * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
         */
        public Builder monthsToSync(long monthsToSync) {
            Utils.checkNotNull(monthsToSync, "monthsToSync");
            this.monthsToSync = Optional.ofNullable(monthsToSync);
            return this;
        }

        /**
         * Months of data to fetch, for report data types (`balanceSheet` &amp; `profitAndLoss`) only.
         */
        public Builder monthsToSync(Optional<? extends Long> monthsToSync) {
            Utils.checkNotNull(monthsToSync, "monthsToSync");
            this.monthsToSync = monthsToSync;
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
        public Builder syncFromUtc(String syncFromUtc) {
            Utils.checkNotNull(syncFromUtc, "syncFromUtc");
            this.syncFromUtc = Optional.ofNullable(syncFromUtc);
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
        public Builder syncFromUtc(Optional<? extends String> syncFromUtc) {
            Utils.checkNotNull(syncFromUtc, "syncFromUtc");
            this.syncFromUtc = syncFromUtc;
            return this;
        }

        /**
         * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
         */
        public Builder syncFromWindow(long syncFromWindow) {
            Utils.checkNotNull(syncFromWindow, "syncFromWindow");
            this.syncFromWindow = Optional.ofNullable(syncFromWindow);
            return this;
        }

        /**
         * Number of months of data to be fetched. Set this *or* `syncFromUTC`.
         */
        public Builder syncFromWindow(Optional<? extends Long> syncFromWindow) {
            Utils.checkNotNull(syncFromWindow, "syncFromWindow");
            this.syncFromWindow = syncFromWindow;
            return this;
        }

        /**
         * The sync in which data types are queued for a sync.
         */
        public Builder syncOrder(long syncOrder) {
            Utils.checkNotNull(syncOrder, "syncOrder");
            this.syncOrder = syncOrder;
            return this;
        }

        /**
         * Number of hours after which this data type should be refreshed.
         */
        public Builder syncSchedule(long syncSchedule) {
            Utils.checkNotNull(syncSchedule, "syncSchedule");
            this.syncSchedule = syncSchedule;
            return this;
        }
        
        public SyncSetting build() {
            return new SyncSetting(
                dataType,
                fetchOnFirstLink,
                isLocked,
                monthsToSync,
                syncFromUtc,
                syncFromWindow,
                syncOrder,
                syncSchedule);
        }
    }
}

