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


public class DataConnectionError {

    /**
     * A brief message about the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private Optional<? extends String> errorMessage;

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
    private Optional<? extends String> erroredOnUtc;

    /**
     * The HTTP status code returned by the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusCode")
    private Optional<? extends String> statusCode;

    /**
     * A non-numeric status code/text.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusText")
    private Optional<? extends String> statusText;

    @JsonCreator
    public DataConnectionError(
            @JsonProperty("errorMessage") Optional<? extends String> errorMessage,
            @JsonProperty("erroredOnUtc") Optional<? extends String> erroredOnUtc,
            @JsonProperty("statusCode") Optional<? extends String> statusCode,
            @JsonProperty("statusText") Optional<? extends String> statusText) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(statusText, "statusText");
        this.errorMessage = errorMessage;
        this.erroredOnUtc = erroredOnUtc;
        this.statusCode = statusCode;
        this.statusText = statusText;
    }
    
    public DataConnectionError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A brief message about the error.
     */
    @JsonIgnore
    public Optional<? extends String> errorMessage() {
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
    public Optional<? extends String> erroredOnUtc() {
        return erroredOnUtc;
    }

    /**
     * The HTTP status code returned by the error.
     */
    @JsonIgnore
    public Optional<? extends String> statusCode() {
        return statusCode;
    }

    /**
     * A non-numeric status code/text.
     */
    @JsonIgnore
    public Optional<? extends String> statusText() {
        return statusText;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A brief message about the error.
     */
    public DataConnectionError withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * A brief message about the error.
     */
    public DataConnectionError withErrorMessage(Optional<? extends String> errorMessage) {
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
    public DataConnectionError withErroredOnUtc(Optional<? extends String> erroredOnUtc) {
        Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
        this.erroredOnUtc = erroredOnUtc;
        return this;
    }

    /**
     * The HTTP status code returned by the error.
     */
    public DataConnectionError withStatusCode(String statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = Optional.ofNullable(statusCode);
        return this;
    }

    /**
     * The HTTP status code returned by the error.
     */
    public DataConnectionError withStatusCode(Optional<? extends String> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * A non-numeric status code/text.
     */
    public DataConnectionError withStatusText(String statusText) {
        Utils.checkNotNull(statusText, "statusText");
        this.statusText = Optional.ofNullable(statusText);
        return this;
    }

    /**
     * A non-numeric status code/text.
     */
    public DataConnectionError withStatusText(Optional<? extends String> statusText) {
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
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.erroredOnUtc, other.erroredOnUtc) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.statusText, other.statusText);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errorMessage,
            erroredOnUtc,
            statusCode,
            statusText);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataConnectionError.class,
                "errorMessage", errorMessage,
                "erroredOnUtc", erroredOnUtc,
                "statusCode", statusCode,
                "statusText", statusText);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> errorMessage = Optional.empty();
 
        private Optional<? extends String> erroredOnUtc = Optional.empty();
 
        private Optional<? extends String> statusCode = Optional.empty();
 
        private Optional<? extends String> statusText = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A brief message about the error.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * A brief message about the error.
         */
        public Builder errorMessage(Optional<? extends String> errorMessage) {
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
        public Builder erroredOnUtc(Optional<? extends String> erroredOnUtc) {
            Utils.checkNotNull(erroredOnUtc, "erroredOnUtc");
            this.erroredOnUtc = erroredOnUtc;
            return this;
        }

        /**
         * The HTTP status code returned by the error.
         */
        public Builder statusCode(String statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = Optional.ofNullable(statusCode);
            return this;
        }

        /**
         * The HTTP status code returned by the error.
         */
        public Builder statusCode(Optional<? extends String> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * A non-numeric status code/text.
         */
        public Builder statusText(String statusText) {
            Utils.checkNotNull(statusText, "statusText");
            this.statusText = Optional.ofNullable(statusText);
            return this;
        }

        /**
         * A non-numeric status code/text.
         */
        public Builder statusText(Optional<? extends String> statusText) {
            Utils.checkNotNull(statusText, "statusText");
            this.statusText = statusText;
            return this;
        }
        
        public DataConnectionError build() {
            return new DataConnectionError(
                errorMessage,
                erroredOnUtc,
                statusCode,
                statusText);
        }
    }
}

