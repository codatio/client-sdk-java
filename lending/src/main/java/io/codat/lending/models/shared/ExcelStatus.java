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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ExcelStatus {

    /**
     * Error details in case the report generation request was unsuccessful.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private Optional<String> errorMessage;

    /**
     * The file size in Bytes is populated upon successful generation of the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fileSize")
    private JsonNullable<Long> fileSize;

    /**
     * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inProgress")
    private Optional<Boolean> inProgress;

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
    @JsonProperty("lastGenerated")
    private Optional<String> lastGenerated;

    /**
     * A unique ID generated for this request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastInvocationId")
    private Optional<String> lastInvocationId;

    /**
     * The date and time of when a successful request was queued for the most recent report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("queued")
    private Optional<String> queued;

    /**
     * The type of the report requested in the query string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportType")
    private Optional<? extends ExcelReportTypes> reportType;

    /**
     * True if the requested report was successfully queued and false if the requested report was not able to be queued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("success")
    private Optional<Boolean> success;

    @JsonCreator
    public ExcelStatus(
            @JsonProperty("errorMessage") Optional<String> errorMessage,
            @JsonProperty("fileSize") JsonNullable<Long> fileSize,
            @JsonProperty("inProgress") Optional<Boolean> inProgress,
            @JsonProperty("lastGenerated") Optional<String> lastGenerated,
            @JsonProperty("lastInvocationId") Optional<String> lastInvocationId,
            @JsonProperty("queued") Optional<String> queued,
            @JsonProperty("reportType") Optional<? extends ExcelReportTypes> reportType,
            @JsonProperty("success") Optional<Boolean> success) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(fileSize, "fileSize");
        Utils.checkNotNull(inProgress, "inProgress");
        Utils.checkNotNull(lastGenerated, "lastGenerated");
        Utils.checkNotNull(lastInvocationId, "lastInvocationId");
        Utils.checkNotNull(queued, "queued");
        Utils.checkNotNull(reportType, "reportType");
        Utils.checkNotNull(success, "success");
        this.errorMessage = errorMessage;
        this.fileSize = fileSize;
        this.inProgress = inProgress;
        this.lastGenerated = lastGenerated;
        this.lastInvocationId = lastInvocationId;
        this.queued = queued;
        this.reportType = reportType;
        this.success = success;
    }
    
    public ExcelStatus() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Error details in case the report generation request was unsuccessful.
     */
    @JsonIgnore
    public Optional<String> errorMessage() {
        return errorMessage;
    }

    /**
     * The file size in Bytes is populated upon successful generation of the report.
     */
    @JsonIgnore
    public JsonNullable<Long> fileSize() {
        return fileSize;
    }

    /**
     * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
     */
    @JsonIgnore
    public Optional<Boolean> inProgress() {
        return inProgress;
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
    public Optional<String> lastGenerated() {
        return lastGenerated;
    }

    /**
     * A unique ID generated for this request.
     */
    @JsonIgnore
    public Optional<String> lastInvocationId() {
        return lastInvocationId;
    }

    /**
     * The date and time of when a successful request was queued for the most recent report.
     */
    @JsonIgnore
    public Optional<String> queued() {
        return queued;
    }

    /**
     * The type of the report requested in the query string.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ExcelReportTypes> reportType() {
        return (Optional<ExcelReportTypes>) reportType;
    }

    /**
     * True if the requested report was successfully queued and false if the requested report was not able to be queued.
     */
    @JsonIgnore
    public Optional<Boolean> success() {
        return success;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Error details in case the report generation request was unsuccessful.
     */
    public ExcelStatus withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Error details in case the report generation request was unsuccessful.
     */
    public ExcelStatus withErrorMessage(Optional<String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * The file size in Bytes is populated upon successful generation of the report.
     */
    public ExcelStatus withFileSize(long fileSize) {
        Utils.checkNotNull(fileSize, "fileSize");
        this.fileSize = JsonNullable.of(fileSize);
        return this;
    }

    /**
     * The file size in Bytes is populated upon successful generation of the report.
     */
    public ExcelStatus withFileSize(JsonNullable<Long> fileSize) {
        Utils.checkNotNull(fileSize, "fileSize");
        this.fileSize = fileSize;
        return this;
    }

    /**
     * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
     */
    public ExcelStatus withInProgress(boolean inProgress) {
        Utils.checkNotNull(inProgress, "inProgress");
        this.inProgress = Optional.ofNullable(inProgress);
        return this;
    }

    /**
     * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
     */
    public ExcelStatus withInProgress(Optional<Boolean> inProgress) {
        Utils.checkNotNull(inProgress, "inProgress");
        this.inProgress = inProgress;
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
    public ExcelStatus withLastGenerated(String lastGenerated) {
        Utils.checkNotNull(lastGenerated, "lastGenerated");
        this.lastGenerated = Optional.ofNullable(lastGenerated);
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
    public ExcelStatus withLastGenerated(Optional<String> lastGenerated) {
        Utils.checkNotNull(lastGenerated, "lastGenerated");
        this.lastGenerated = lastGenerated;
        return this;
    }

    /**
     * A unique ID generated for this request.
     */
    public ExcelStatus withLastInvocationId(String lastInvocationId) {
        Utils.checkNotNull(lastInvocationId, "lastInvocationId");
        this.lastInvocationId = Optional.ofNullable(lastInvocationId);
        return this;
    }

    /**
     * A unique ID generated for this request.
     */
    public ExcelStatus withLastInvocationId(Optional<String> lastInvocationId) {
        Utils.checkNotNull(lastInvocationId, "lastInvocationId");
        this.lastInvocationId = lastInvocationId;
        return this;
    }

    /**
     * The date and time of when a successful request was queued for the most recent report.
     */
    public ExcelStatus withQueued(String queued) {
        Utils.checkNotNull(queued, "queued");
        this.queued = Optional.ofNullable(queued);
        return this;
    }

    /**
     * The date and time of when a successful request was queued for the most recent report.
     */
    public ExcelStatus withQueued(Optional<String> queued) {
        Utils.checkNotNull(queued, "queued");
        this.queued = queued;
        return this;
    }

    /**
     * The type of the report requested in the query string.
     */
    public ExcelStatus withReportType(ExcelReportTypes reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = Optional.ofNullable(reportType);
        return this;
    }

    /**
     * The type of the report requested in the query string.
     */
    public ExcelStatus withReportType(Optional<? extends ExcelReportTypes> reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = reportType;
        return this;
    }

    /**
     * True if the requested report was successfully queued and false if the requested report was not able to be queued.
     */
    public ExcelStatus withSuccess(boolean success) {
        Utils.checkNotNull(success, "success");
        this.success = Optional.ofNullable(success);
        return this;
    }

    /**
     * True if the requested report was successfully queued and false if the requested report was not able to be queued.
     */
    public ExcelStatus withSuccess(Optional<Boolean> success) {
        Utils.checkNotNull(success, "success");
        this.success = success;
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
        ExcelStatus other = (ExcelStatus) o;
        return 
            Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            Objects.deepEquals(this.fileSize, other.fileSize) &&
            Objects.deepEquals(this.inProgress, other.inProgress) &&
            Objects.deepEquals(this.lastGenerated, other.lastGenerated) &&
            Objects.deepEquals(this.lastInvocationId, other.lastInvocationId) &&
            Objects.deepEquals(this.queued, other.queued) &&
            Objects.deepEquals(this.reportType, other.reportType) &&
            Objects.deepEquals(this.success, other.success);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errorMessage,
            fileSize,
            inProgress,
            lastGenerated,
            lastInvocationId,
            queued,
            reportType,
            success);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExcelStatus.class,
                "errorMessage", errorMessage,
                "fileSize", fileSize,
                "inProgress", inProgress,
                "lastGenerated", lastGenerated,
                "lastInvocationId", lastInvocationId,
                "queued", queued,
                "reportType", reportType,
                "success", success);
    }
    
    public final static class Builder {
 
        private Optional<String> errorMessage = Optional.empty();
 
        private JsonNullable<Long> fileSize = JsonNullable.undefined();
 
        private Optional<Boolean> inProgress = Optional.empty();
 
        private Optional<String> lastGenerated = Optional.empty();
 
        private Optional<String> lastInvocationId = Optional.empty();
 
        private Optional<String> queued = Optional.empty();
 
        private Optional<? extends ExcelReportTypes> reportType = Optional.empty();
 
        private Optional<Boolean> success = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Error details in case the report generation request was unsuccessful.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Error details in case the report generation request was unsuccessful.
         */
        public Builder errorMessage(Optional<String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The file size in Bytes is populated upon successful generation of the report.
         */
        public Builder fileSize(long fileSize) {
            Utils.checkNotNull(fileSize, "fileSize");
            this.fileSize = JsonNullable.of(fileSize);
            return this;
        }

        /**
         * The file size in Bytes is populated upon successful generation of the report.
         */
        public Builder fileSize(JsonNullable<Long> fileSize) {
            Utils.checkNotNull(fileSize, "fileSize");
            this.fileSize = fileSize;
            return this;
        }

        /**
         * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
         */
        public Builder inProgress(boolean inProgress) {
            Utils.checkNotNull(inProgress, "inProgress");
            this.inProgress = Optional.ofNullable(inProgress);
            return this;
        }

        /**
         * When true, the request was successful and the report is being generated. If false, the request was unsuccessful and the report is not being generated.
         */
        public Builder inProgress(Optional<Boolean> inProgress) {
            Utils.checkNotNull(inProgress, "inProgress");
            this.inProgress = inProgress;
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
        public Builder lastGenerated(String lastGenerated) {
            Utils.checkNotNull(lastGenerated, "lastGenerated");
            this.lastGenerated = Optional.ofNullable(lastGenerated);
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
        public Builder lastGenerated(Optional<String> lastGenerated) {
            Utils.checkNotNull(lastGenerated, "lastGenerated");
            this.lastGenerated = lastGenerated;
            return this;
        }

        /**
         * A unique ID generated for this request.
         */
        public Builder lastInvocationId(String lastInvocationId) {
            Utils.checkNotNull(lastInvocationId, "lastInvocationId");
            this.lastInvocationId = Optional.ofNullable(lastInvocationId);
            return this;
        }

        /**
         * A unique ID generated for this request.
         */
        public Builder lastInvocationId(Optional<String> lastInvocationId) {
            Utils.checkNotNull(lastInvocationId, "lastInvocationId");
            this.lastInvocationId = lastInvocationId;
            return this;
        }

        /**
         * The date and time of when a successful request was queued for the most recent report.
         */
        public Builder queued(String queued) {
            Utils.checkNotNull(queued, "queued");
            this.queued = Optional.ofNullable(queued);
            return this;
        }

        /**
         * The date and time of when a successful request was queued for the most recent report.
         */
        public Builder queued(Optional<String> queued) {
            Utils.checkNotNull(queued, "queued");
            this.queued = queued;
            return this;
        }

        /**
         * The type of the report requested in the query string.
         */
        public Builder reportType(ExcelReportTypes reportType) {
            Utils.checkNotNull(reportType, "reportType");
            this.reportType = Optional.ofNullable(reportType);
            return this;
        }

        /**
         * The type of the report requested in the query string.
         */
        public Builder reportType(Optional<? extends ExcelReportTypes> reportType) {
            Utils.checkNotNull(reportType, "reportType");
            this.reportType = reportType;
            return this;
        }

        /**
         * True if the requested report was successfully queued and false if the requested report was not able to be queued.
         */
        public Builder success(boolean success) {
            Utils.checkNotNull(success, "success");
            this.success = Optional.ofNullable(success);
            return this;
        }

        /**
         * True if the requested report was successfully queued and false if the requested report was not able to be queued.
         */
        public Builder success(Optional<Boolean> success) {
            Utils.checkNotNull(success, "success");
            this.success = success;
            return this;
        }
        
        public ExcelStatus build() {
            return new ExcelStatus(
                errorMessage,
                fileSize,
                inProgress,
                lastGenerated,
                lastInvocationId,
                queued,
                reportType,
                success);
        }
    }
}

