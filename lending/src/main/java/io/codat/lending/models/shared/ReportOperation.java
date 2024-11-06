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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReportOperation - Information about a report generation.
 */

public class ReportOperation {

    /**
     * A short message describing any errors that occurred while generating the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private JsonNullable<String> errorMessage;

    /**
     * Unique identifier of the report
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
    @JsonProperty("requestedDate")
    private Optional<String> requestedDate;

    /**
     * The status of the report generation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ReportOperationStatus> status;

    /**
     * The name of the report generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ReportOperationType> type;

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
    @JsonProperty("updatedDate")
    private Optional<String> updatedDate;

    @JsonCreator
    public ReportOperation(
            @JsonProperty("errorMessage") JsonNullable<String> errorMessage,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("requestedDate") Optional<String> requestedDate,
            @JsonProperty("status") Optional<? extends ReportOperationStatus> status,
            @JsonProperty("type") Optional<? extends ReportOperationType> type,
            @JsonProperty("updatedDate") Optional<String> updatedDate) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(requestedDate, "requestedDate");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updatedDate, "updatedDate");
        this.errorMessage = errorMessage;
        this.id = id;
        this.requestedDate = requestedDate;
        this.status = status;
        this.type = type;
        this.updatedDate = updatedDate;
    }
    
    public ReportOperation() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A short message describing any errors that occurred while generating the report.
     */
    @JsonIgnore
    public JsonNullable<String> errorMessage() {
        return errorMessage;
    }

    /**
     * Unique identifier of the report
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
    public Optional<String> requestedDate() {
        return requestedDate;
    }

    /**
     * The status of the report generation.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReportOperationStatus> status() {
        return (Optional<ReportOperationStatus>) status;
    }

    /**
     * The name of the report generated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReportOperationType> type() {
        return (Optional<ReportOperationType>) type;
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
    public Optional<String> updatedDate() {
        return updatedDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A short message describing any errors that occurred while generating the report.
     */
    public ReportOperation withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = JsonNullable.of(errorMessage);
        return this;
    }

    /**
     * A short message describing any errors that occurred while generating the report.
     */
    public ReportOperation withErrorMessage(JsonNullable<String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Unique identifier of the report
     */
    public ReportOperation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of the report
     */
    public ReportOperation withId(Optional<String> id) {
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
    public ReportOperation withRequestedDate(String requestedDate) {
        Utils.checkNotNull(requestedDate, "requestedDate");
        this.requestedDate = Optional.ofNullable(requestedDate);
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
    public ReportOperation withRequestedDate(Optional<String> requestedDate) {
        Utils.checkNotNull(requestedDate, "requestedDate");
        this.requestedDate = requestedDate;
        return this;
    }

    /**
     * The status of the report generation.
     */
    public ReportOperation withStatus(ReportOperationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the report generation.
     */
    public ReportOperation withStatus(Optional<? extends ReportOperationStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The name of the report generated.
     */
    public ReportOperation withType(ReportOperationType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The name of the report generated.
     */
    public ReportOperation withType(Optional<? extends ReportOperationType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
    public ReportOperation withUpdatedDate(String updatedDate) {
        Utils.checkNotNull(updatedDate, "updatedDate");
        this.updatedDate = Optional.ofNullable(updatedDate);
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
    public ReportOperation withUpdatedDate(Optional<String> updatedDate) {
        Utils.checkNotNull(updatedDate, "updatedDate");
        this.updatedDate = updatedDate;
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
        ReportOperation other = (ReportOperation) o;
        return 
            Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.requestedDate, other.requestedDate) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updatedDate, other.updatedDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errorMessage,
            id,
            requestedDate,
            status,
            type,
            updatedDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportOperation.class,
                "errorMessage", errorMessage,
                "id", id,
                "requestedDate", requestedDate,
                "status", status,
                "type", type,
                "updatedDate", updatedDate);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> errorMessage = JsonNullable.undefined();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> requestedDate = Optional.empty();
 
        private Optional<? extends ReportOperationStatus> status = Optional.empty();
 
        private Optional<? extends ReportOperationType> type = Optional.empty();
 
        private Optional<String> updatedDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A short message describing any errors that occurred while generating the report.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = JsonNullable.of(errorMessage);
            return this;
        }

        /**
         * A short message describing any errors that occurred while generating the report.
         */
        public Builder errorMessage(JsonNullable<String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Unique identifier of the report
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of the report
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
        public Builder requestedDate(String requestedDate) {
            Utils.checkNotNull(requestedDate, "requestedDate");
            this.requestedDate = Optional.ofNullable(requestedDate);
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
        public Builder requestedDate(Optional<String> requestedDate) {
            Utils.checkNotNull(requestedDate, "requestedDate");
            this.requestedDate = requestedDate;
            return this;
        }

        /**
         * The status of the report generation.
         */
        public Builder status(ReportOperationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status of the report generation.
         */
        public Builder status(Optional<? extends ReportOperationStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The name of the report generated.
         */
        public Builder type(ReportOperationType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The name of the report generated.
         */
        public Builder type(Optional<? extends ReportOperationType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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
        public Builder updatedDate(String updatedDate) {
            Utils.checkNotNull(updatedDate, "updatedDate");
            this.updatedDate = Optional.ofNullable(updatedDate);
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
        public Builder updatedDate(Optional<String> updatedDate) {
            Utils.checkNotNull(updatedDate, "updatedDate");
            this.updatedDate = updatedDate;
            return this;
        }
        
        public ReportOperation build() {
            return new ReportOperation(
                errorMessage,
                id,
                requestedDate,
                status,
                type,
                updatedDate);
        }
    }
}

