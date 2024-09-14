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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class DataConnectionError {

    /**
     * A message about a error returned by Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private Optional<String> errorMessage;

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
    @JsonProperty("erroredOnUtc")
    private Optional<String> erroredOnUtc;

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
    @JsonProperty("resolvedOnUtc")
    private Optional<String> resolvedOnUtc;

    /**
     * The current status of a transient error. Null statuses indicate that the error is not transient.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends ErrorStatus> status;

    /**
     * The HTTP status code returned by the source platform when the error occurred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusCode")
    private Optional<String> statusCode;

    /**
     * A non-numeric status code/text returned by the source platform when the error occurred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusText")
    private Optional<String> statusText;

    @JsonCreator
    public DataConnectionError(
            @JsonProperty("errorMessage") Optional<String> errorMessage,
            @JsonProperty("erroredOnUtc") Optional<String> erroredOnUtc,
            @JsonProperty("resolvedOnUtc") Optional<String> resolvedOnUtc,
            @JsonProperty("status") JsonNullable<? extends ErrorStatus> status,
            @JsonProperty("statusCode") Optional<String> statusCode,
            @JsonProperty("statusText") Optional<String> statusText) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
        Utils.checkNotNull(resolvedOnUtc, "resolvedOnUtc");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(statusText, "statusText");
        this.errorMessage = errorMessage;
        this.erroredOnUtc = erroredOnUtc;
        this.resolvedOnUtc = resolvedOnUtc;
        this.status = status;
        this.statusCode = statusCode;
        this.statusText = statusText;
    }
    
    public DataConnectionError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * A message about a error returned by Codat.
     */
    @JsonIgnore
    public Optional<String> errorMessage() {
        return errorMessage;
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
    public Optional<String> erroredOnUtc() {
        return erroredOnUtc;
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
    public Optional<String> resolvedOnUtc() {
        return resolvedOnUtc;
    }

    /**
     * The current status of a transient error. Null statuses indicate that the error is not transient.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ErrorStatus> status() {
        return (JsonNullable<ErrorStatus>) status;
    }

    /**
     * The HTTP status code returned by the source platform when the error occurred.
     */
    @JsonIgnore
    public Optional<String> statusCode() {
        return statusCode;
    }

    /**
     * A non-numeric status code/text returned by the source platform when the error occurred.
     */
    @JsonIgnore
    public Optional<String> statusText() {
        return statusText;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A message about a error returned by Codat.
     */
    public DataConnectionError withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * A message about a error returned by Codat.
     */
    public DataConnectionError withErrorMessage(Optional<String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
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
    public DataConnectionError withErroredOnUtc(String erroredOnUtc) {
        Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
        this.erroredOnUtc = Optional.ofNullable(erroredOnUtc);
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
    public DataConnectionError withErroredOnUtc(Optional<String> erroredOnUtc) {
        Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
        this.erroredOnUtc = erroredOnUtc;
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
    public DataConnectionError withResolvedOnUtc(String resolvedOnUtc) {
        Utils.checkNotNull(resolvedOnUtc, "resolvedOnUtc");
        this.resolvedOnUtc = Optional.ofNullable(resolvedOnUtc);
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
    public DataConnectionError withResolvedOnUtc(Optional<String> resolvedOnUtc) {
        Utils.checkNotNull(resolvedOnUtc, "resolvedOnUtc");
        this.resolvedOnUtc = resolvedOnUtc;
        return this;
    }

    /**
     * The current status of a transient error. Null statuses indicate that the error is not transient.
     */
    public DataConnectionError withStatus(ErrorStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The current status of a transient error. Null statuses indicate that the error is not transient.
     */
    public DataConnectionError withStatus(JsonNullable<? extends ErrorStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The HTTP status code returned by the source platform when the error occurred.
     */
    public DataConnectionError withStatusCode(String statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = Optional.ofNullable(statusCode);
        return this;
    }

    /**
     * The HTTP status code returned by the source platform when the error occurred.
     */
    public DataConnectionError withStatusCode(Optional<String> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * A non-numeric status code/text returned by the source platform when the error occurred.
     */
    public DataConnectionError withStatusText(String statusText) {
        Utils.checkNotNull(statusText, "statusText");
        this.statusText = Optional.ofNullable(statusText);
        return this;
    }

    /**
     * A non-numeric status code/text returned by the source platform when the error occurred.
     */
    public DataConnectionError withStatusText(Optional<String> statusText) {
        Utils.checkNotNull(statusText, "statusText");
        this.statusText = statusText;
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
        DataConnectionError other = (DataConnectionError) o;
        return 
            Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            Objects.deepEquals(this.erroredOnUtc, other.erroredOnUtc) &&
            Objects.deepEquals(this.resolvedOnUtc, other.resolvedOnUtc) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.statusText, other.statusText);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errorMessage,
            erroredOnUtc,
            resolvedOnUtc,
            status,
            statusCode,
            statusText);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataConnectionError.class,
                "errorMessage", errorMessage,
                "erroredOnUtc", erroredOnUtc,
                "resolvedOnUtc", resolvedOnUtc,
                "status", status,
                "statusCode", statusCode,
                "statusText", statusText);
    }
    
    public final static class Builder {
 
        private Optional<String> errorMessage = Optional.empty();
 
        private Optional<String> erroredOnUtc = Optional.empty();
 
        private Optional<String> resolvedOnUtc = Optional.empty();
 
        private JsonNullable<? extends ErrorStatus> status = JsonNullable.undefined();
 
        private Optional<String> statusCode = Optional.empty();
 
        private Optional<String> statusText = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A message about a error returned by Codat.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * A message about a error returned by Codat.
         */
        public Builder errorMessage(Optional<String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
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
        public Builder erroredOnUtc(String erroredOnUtc) {
            Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
            this.erroredOnUtc = Optional.ofNullable(erroredOnUtc);
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
        public Builder erroredOnUtc(Optional<String> erroredOnUtc) {
            Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
            this.erroredOnUtc = erroredOnUtc;
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
        public Builder resolvedOnUtc(String resolvedOnUtc) {
            Utils.checkNotNull(resolvedOnUtc, "resolvedOnUtc");
            this.resolvedOnUtc = Optional.ofNullable(resolvedOnUtc);
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
        public Builder resolvedOnUtc(Optional<String> resolvedOnUtc) {
            Utils.checkNotNull(resolvedOnUtc, "resolvedOnUtc");
            this.resolvedOnUtc = resolvedOnUtc;
            return this;
        }

        /**
         * The current status of a transient error. Null statuses indicate that the error is not transient.
         */
        public Builder status(ErrorStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * The current status of a transient error. Null statuses indicate that the error is not transient.
         */
        public Builder status(JsonNullable<? extends ErrorStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The HTTP status code returned by the source platform when the error occurred.
         */
        public Builder statusCode(String statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = Optional.ofNullable(statusCode);
            return this;
        }

        /**
         * The HTTP status code returned by the source platform when the error occurred.
         */
        public Builder statusCode(Optional<String> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * A non-numeric status code/text returned by the source platform when the error occurred.
         */
        public Builder statusText(String statusText) {
            Utils.checkNotNull(statusText, "statusText");
            this.statusText = Optional.ofNullable(statusText);
            return this;
        }

        /**
         * A non-numeric status code/text returned by the source platform when the error occurred.
         */
        public Builder statusText(Optional<String> statusText) {
            Utils.checkNotNull(statusText, "statusText");
            this.statusText = statusText;
            return this;
        }
        
        public DataConnectionError build() {
            return new DataConnectionError(
                errorMessage,
                erroredOnUtc,
                resolvedOnUtc,
                status,
                statusCode,
                statusText);
        }
    }
}

