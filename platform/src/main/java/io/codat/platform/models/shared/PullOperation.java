/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PullOperation - Information about a queued, in progress or completed pull operation.
 * *Formally called `dataset`*
 */

public class PullOperation {

    /**
     * Unique identifier of the company associated to this pull operation.
     */
    @JsonProperty("companyId")
    private String companyId;

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
    @JsonProperty("completed")
    private Optional<? extends String> completed;

    /**
     * Unique identifier of the connection associated to this pull operation.
     */
    @JsonProperty("connectionId")
    private String connectionId;

    /**
     * The data type you are requesting in a pull operation.
     */
    @JsonProperty("dataType")
    private String dataType;

    /**
     * A message about a transient or persistent error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private JsonNullable<? extends String> errorMessage;

    /**
     * Unique identifier of the pull operation.
     */
    @JsonProperty("id")
    private String id;

    /**
     * `True` if the pull operation is completed successfully. The `isCompleted` property is not queryable. To filter failed pull operations, query by `status!=Complete&amp;&amp;status!=NotSupported` instead.
     */
    @JsonProperty("isCompleted")
    private boolean isCompleted;

    /**
     * `True` if the pull operation entered an error state.
     */
    @JsonProperty("isErrored")
    private boolean isErrored;

    /**
     * An integer signifying the progress of the pull operation.
     */
    @JsonProperty("progress")
    private long progress;

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
    @JsonProperty("requested")
    private String requested;

    /**
     * The current status of the pull operation.
     */
    @JsonProperty("status")
    private Status status;

    /**
     * Additional information about the dataset status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusDescription")
    private JsonNullable<? extends String> statusDescription;

    public PullOperation(
            @JsonProperty("companyId") String companyId,
            @JsonProperty("completed") Optional<? extends String> completed,
            @JsonProperty("connectionId") String connectionId,
            @JsonProperty("dataType") String dataType,
            @JsonProperty("errorMessage") JsonNullable<? extends String> errorMessage,
            @JsonProperty("id") String id,
            @JsonProperty("isCompleted") boolean isCompleted,
            @JsonProperty("isErrored") boolean isErrored,
            @JsonProperty("progress") long progress,
            @JsonProperty("requested") String requested,
            @JsonProperty("status") Status status,
            @JsonProperty("statusDescription") JsonNullable<? extends String> statusDescription) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(completed, "completed");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(isCompleted, "isCompleted");
        Utils.checkNotNull(isErrored, "isErrored");
        Utils.checkNotNull(progress, "progress");
        Utils.checkNotNull(requested, "requested");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusDescription, "statusDescription");
        this.companyId = companyId;
        this.completed = completed;
        this.connectionId = connectionId;
        this.dataType = dataType;
        this.errorMessage = errorMessage;
        this.id = id;
        this.isCompleted = isCompleted;
        this.isErrored = isErrored;
        this.progress = progress;
        this.requested = requested;
        this.status = status;
        this.statusDescription = statusDescription;
    }

    /**
     * Unique identifier of the company associated to this pull operation.
     */
    public String companyId() {
        return companyId;
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
    public Optional<? extends String> completed() {
        return completed;
    }

    /**
     * Unique identifier of the connection associated to this pull operation.
     */
    public String connectionId() {
        return connectionId;
    }

    /**
     * The data type you are requesting in a pull operation.
     */
    public String dataType() {
        return dataType;
    }

    /**
     * A message about a transient or persistent error.
     */
    public JsonNullable<? extends String> errorMessage() {
        return errorMessage;
    }

    /**
     * Unique identifier of the pull operation.
     */
    public String id() {
        return id;
    }

    /**
     * `True` if the pull operation is completed successfully. The `isCompleted` property is not queryable. To filter failed pull operations, query by `status!=Complete&amp;&amp;status!=NotSupported` instead.
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * `True` if the pull operation entered an error state.
     */
    public boolean isErrored() {
        return isErrored;
    }

    /**
     * An integer signifying the progress of the pull operation.
     */
    public long progress() {
        return progress;
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
    public String requested() {
        return requested;
    }

    /**
     * The current status of the pull operation.
     */
    public Status status() {
        return status;
    }

    /**
     * Additional information about the dataset status.
     */
    public JsonNullable<? extends String> statusDescription() {
        return statusDescription;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the company associated to this pull operation.
     */
    public PullOperation withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
    public PullOperation withCompleted(String completed) {
        Utils.checkNotNull(completed, "completed");
        this.completed = Optional.ofNullable(completed);
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
    public PullOperation withCompleted(Optional<? extends String> completed) {
        Utils.checkNotNull(completed, "completed");
        this.completed = completed;
        return this;
    }

    /**
     * Unique identifier of the connection associated to this pull operation.
     */
    public PullOperation withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * The data type you are requesting in a pull operation.
     */
    public PullOperation withDataType(String dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * A message about a transient or persistent error.
     */
    public PullOperation withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = JsonNullable.of(errorMessage);
        return this;
    }

    /**
     * A message about a transient or persistent error.
     */
    public PullOperation withErrorMessage(JsonNullable<? extends String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Unique identifier of the pull operation.
     */
    public PullOperation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * `True` if the pull operation is completed successfully. The `isCompleted` property is not queryable. To filter failed pull operations, query by `status!=Complete&amp;&amp;status!=NotSupported` instead.
     */
    public PullOperation withIsCompleted(boolean isCompleted) {
        Utils.checkNotNull(isCompleted, "isCompleted");
        this.isCompleted = isCompleted;
        return this;
    }

    /**
     * `True` if the pull operation entered an error state.
     */
    public PullOperation withIsErrored(boolean isErrored) {
        Utils.checkNotNull(isErrored, "isErrored");
        this.isErrored = isErrored;
        return this;
    }

    /**
     * An integer signifying the progress of the pull operation.
     */
    public PullOperation withProgress(long progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = progress;
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
    public PullOperation withRequested(String requested) {
        Utils.checkNotNull(requested, "requested");
        this.requested = requested;
        return this;
    }

    /**
     * The current status of the pull operation.
     */
    public PullOperation withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Additional information about the dataset status.
     */
    public PullOperation withStatusDescription(String statusDescription) {
        Utils.checkNotNull(statusDescription, "statusDescription");
        this.statusDescription = JsonNullable.of(statusDescription);
        return this;
    }

    /**
     * Additional information about the dataset status.
     */
    public PullOperation withStatusDescription(JsonNullable<? extends String> statusDescription) {
        Utils.checkNotNull(statusDescription, "statusDescription");
        this.statusDescription = statusDescription;
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
        PullOperation other = (PullOperation) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.completed, other.completed) &&
            java.util.Objects.deepEquals(this.connectionId, other.connectionId) &&
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.isCompleted, other.isCompleted) &&
            java.util.Objects.deepEquals(this.isErrored, other.isErrored) &&
            java.util.Objects.deepEquals(this.progress, other.progress) &&
            java.util.Objects.deepEquals(this.requested, other.requested) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusDescription, other.statusDescription);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            completed,
            connectionId,
            dataType,
            errorMessage,
            id,
            isCompleted,
            isErrored,
            progress,
            requested,
            status,
            statusDescription);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PullOperation.class,
                "companyId", companyId,
                "completed", completed,
                "connectionId", connectionId,
                "dataType", dataType,
                "errorMessage", errorMessage,
                "id", id,
                "isCompleted", isCompleted,
                "isErrored", isErrored,
                "progress", progress,
                "requested", requested,
                "status", status,
                "statusDescription", statusDescription);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<? extends String> completed = Optional.empty();
 
        private String connectionId;
 
        private String dataType;
 
        private JsonNullable<? extends String> errorMessage = JsonNullable.undefined();
 
        private String id;
 
        private Boolean isCompleted;
 
        private Boolean isErrored;
 
        private Long progress;
 
        private String requested;
 
        private Status status;
 
        private JsonNullable<? extends String> statusDescription = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the company associated to this pull operation.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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
        public Builder completed(String completed) {
            Utils.checkNotNull(completed, "completed");
            this.completed = Optional.ofNullable(completed);
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
        public Builder completed(Optional<? extends String> completed) {
            Utils.checkNotNull(completed, "completed");
            this.completed = completed;
            return this;
        }

        /**
         * Unique identifier of the connection associated to this pull operation.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * The data type you are requesting in a pull operation.
         */
        public Builder dataType(String dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * A message about a transient or persistent error.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = JsonNullable.of(errorMessage);
            return this;
        }

        /**
         * A message about a transient or persistent error.
         */
        public Builder errorMessage(JsonNullable<? extends String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Unique identifier of the pull operation.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * `True` if the pull operation is completed successfully. The `isCompleted` property is not queryable. To filter failed pull operations, query by `status!=Complete&amp;&amp;status!=NotSupported` instead.
         */
        public Builder isCompleted(boolean isCompleted) {
            Utils.checkNotNull(isCompleted, "isCompleted");
            this.isCompleted = isCompleted;
            return this;
        }

        /**
         * `True` if the pull operation entered an error state.
         */
        public Builder isErrored(boolean isErrored) {
            Utils.checkNotNull(isErrored, "isErrored");
            this.isErrored = isErrored;
            return this;
        }

        /**
         * An integer signifying the progress of the pull operation.
         */
        public Builder progress(long progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = progress;
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
        public Builder requested(String requested) {
            Utils.checkNotNull(requested, "requested");
            this.requested = requested;
            return this;
        }

        /**
         * The current status of the pull operation.
         */
        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Additional information about the dataset status.
         */
        public Builder statusDescription(String statusDescription) {
            Utils.checkNotNull(statusDescription, "statusDescription");
            this.statusDescription = JsonNullable.of(statusDescription);
            return this;
        }

        /**
         * Additional information about the dataset status.
         */
        public Builder statusDescription(JsonNullable<? extends String> statusDescription) {
            Utils.checkNotNull(statusDescription, "statusDescription");
            this.statusDescription = statusDescription;
            return this;
        }
        
        public PullOperation build() {
            return new PullOperation(
                companyId,
                completed,
                connectionId,
                dataType,
                errorMessage,
                id,
                isCompleted,
                isErrored,
                progress,
                requested,
                status,
                statusDescription);
        }
    }
}

