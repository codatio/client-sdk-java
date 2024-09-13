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
import java.util.Objects;
import java.util.Optional;

/**
 * DataStatus - Describes the state of data in the Codat cache for a company and data type
 */

public class DataStatus {

    /**
     * The current status of the dataset.
     */
    @JsonProperty("currentStatus")
    private Status currentStatus;

    /**
     * Available data types
     */
    @JsonProperty("dataType")
    private DataTypes dataType;

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
    @JsonProperty("lastSuccessfulSync")
    private String lastSuccessfulSync;

    /**
     * Unique identifier for the most recent successful sync of data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("latestSuccessfulSyncId")
    private Optional<String> latestSuccessfulSyncId;

    /**
     * Unique identifier for most recent sync of data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("latestSyncId")
    private Optional<String> latestSyncId;

    @JsonCreator
    public DataStatus(
            @JsonProperty("currentStatus") Status currentStatus,
            @JsonProperty("dataType") DataTypes dataType,
            @JsonProperty("lastSuccessfulSync") String lastSuccessfulSync,
            @JsonProperty("latestSuccessfulSyncId") Optional<String> latestSuccessfulSyncId,
            @JsonProperty("latestSyncId") Optional<String> latestSyncId) {
        Utils.checkNotNull(currentStatus, "currentStatus");
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(lastSuccessfulSync, "lastSuccessfulSync");
        Utils.checkNotNull(latestSuccessfulSyncId, "latestSuccessfulSyncId");
        Utils.checkNotNull(latestSyncId, "latestSyncId");
        this.currentStatus = currentStatus;
        this.dataType = dataType;
        this.lastSuccessfulSync = lastSuccessfulSync;
        this.latestSuccessfulSyncId = latestSuccessfulSyncId;
        this.latestSyncId = latestSyncId;
    }
    
    public DataStatus(
            Status currentStatus,
            DataTypes dataType,
            String lastSuccessfulSync) {
        this(currentStatus, dataType, lastSuccessfulSync, Optional.empty(), Optional.empty());
    }

    /**
     * The current status of the dataset.
     */
    @JsonIgnore
    public Status currentStatus() {
        return currentStatus;
    }

    /**
     * Available data types
     */
    @JsonIgnore
    public DataTypes dataType() {
        return dataType;
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
    public String lastSuccessfulSync() {
        return lastSuccessfulSync;
    }

    /**
     * Unique identifier for the most recent successful sync of data type.
     */
    @JsonIgnore
    public Optional<String> latestSuccessfulSyncId() {
        return latestSuccessfulSyncId;
    }

    /**
     * Unique identifier for most recent sync of data type.
     */
    @JsonIgnore
    public Optional<String> latestSyncId() {
        return latestSyncId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current status of the dataset.
     */
    public DataStatus withCurrentStatus(Status currentStatus) {
        Utils.checkNotNull(currentStatus, "currentStatus");
        this.currentStatus = currentStatus;
        return this;
    }

    /**
     * Available data types
     */
    public DataStatus withDataType(DataTypes dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
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
    public DataStatus withLastSuccessfulSync(String lastSuccessfulSync) {
        Utils.checkNotNull(lastSuccessfulSync, "lastSuccessfulSync");
        this.lastSuccessfulSync = lastSuccessfulSync;
        return this;
    }

    /**
     * Unique identifier for the most recent successful sync of data type.
     */
    public DataStatus withLatestSuccessfulSyncId(String latestSuccessfulSyncId) {
        Utils.checkNotNull(latestSuccessfulSyncId, "latestSuccessfulSyncId");
        this.latestSuccessfulSyncId = Optional.ofNullable(latestSuccessfulSyncId);
        return this;
    }

    /**
     * Unique identifier for the most recent successful sync of data type.
     */
    public DataStatus withLatestSuccessfulSyncId(Optional<String> latestSuccessfulSyncId) {
        Utils.checkNotNull(latestSuccessfulSyncId, "latestSuccessfulSyncId");
        this.latestSuccessfulSyncId = latestSuccessfulSyncId;
        return this;
    }

    /**
     * Unique identifier for most recent sync of data type.
     */
    public DataStatus withLatestSyncId(String latestSyncId) {
        Utils.checkNotNull(latestSyncId, "latestSyncId");
        this.latestSyncId = Optional.ofNullable(latestSyncId);
        return this;
    }

    /**
     * Unique identifier for most recent sync of data type.
     */
    public DataStatus withLatestSyncId(Optional<String> latestSyncId) {
        Utils.checkNotNull(latestSyncId, "latestSyncId");
        this.latestSyncId = latestSyncId;
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
        DataStatus other = (DataStatus) o;
        return 
            Objects.deepEquals(this.currentStatus, other.currentStatus) &&
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.lastSuccessfulSync, other.lastSuccessfulSync) &&
            Objects.deepEquals(this.latestSuccessfulSyncId, other.latestSuccessfulSyncId) &&
            Objects.deepEquals(this.latestSyncId, other.latestSyncId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            currentStatus,
            dataType,
            lastSuccessfulSync,
            latestSuccessfulSyncId,
            latestSyncId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataStatus.class,
                "currentStatus", currentStatus,
                "dataType", dataType,
                "lastSuccessfulSync", lastSuccessfulSync,
                "latestSuccessfulSyncId", latestSuccessfulSyncId,
                "latestSyncId", latestSyncId);
    }
    
    public final static class Builder {
 
        private Status currentStatus;
 
        private DataTypes dataType;
 
        private String lastSuccessfulSync;
 
        private Optional<String> latestSuccessfulSyncId = Optional.empty();
 
        private Optional<String> latestSyncId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current status of the dataset.
         */
        public Builder currentStatus(Status currentStatus) {
            Utils.checkNotNull(currentStatus, "currentStatus");
            this.currentStatus = currentStatus;
            return this;
        }

        /**
         * Available data types
         */
        public Builder dataType(DataTypes dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
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
        public Builder lastSuccessfulSync(String lastSuccessfulSync) {
            Utils.checkNotNull(lastSuccessfulSync, "lastSuccessfulSync");
            this.lastSuccessfulSync = lastSuccessfulSync;
            return this;
        }

        /**
         * Unique identifier for the most recent successful sync of data type.
         */
        public Builder latestSuccessfulSyncId(String latestSuccessfulSyncId) {
            Utils.checkNotNull(latestSuccessfulSyncId, "latestSuccessfulSyncId");
            this.latestSuccessfulSyncId = Optional.ofNullable(latestSuccessfulSyncId);
            return this;
        }

        /**
         * Unique identifier for the most recent successful sync of data type.
         */
        public Builder latestSuccessfulSyncId(Optional<String> latestSuccessfulSyncId) {
            Utils.checkNotNull(latestSuccessfulSyncId, "latestSuccessfulSyncId");
            this.latestSuccessfulSyncId = latestSuccessfulSyncId;
            return this;
        }

        /**
         * Unique identifier for most recent sync of data type.
         */
        public Builder latestSyncId(String latestSyncId) {
            Utils.checkNotNull(latestSyncId, "latestSyncId");
            this.latestSyncId = Optional.ofNullable(latestSyncId);
            return this;
        }

        /**
         * Unique identifier for most recent sync of data type.
         */
        public Builder latestSyncId(Optional<String> latestSyncId) {
            Utils.checkNotNull(latestSyncId, "latestSyncId");
            this.latestSyncId = latestSyncId;
            return this;
        }
        
        public DataStatus build() {
            return new DataStatus(
                currentStatus,
                dataType,
                lastSuccessfulSync,
                latestSuccessfulSyncId,
                latestSyncId);
        }
    }
}

