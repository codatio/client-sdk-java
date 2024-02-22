/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateJournalResponse {

    /**
     * Contains a single entry that communicates which record has changed and the manner in which it changed. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("changes")
    private JsonNullable<? extends java.util.List<PushOperationChange>> changes;

    /**
     * Unique identifier for your SMB in Codat.
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
    @JsonProperty("completedOnUtc")
    private Optional<? extends String> completedOnUtc;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private JsonNullable<? extends AccountingJournal> data;

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonProperty("dataConnectionKey")
    private String dataConnectionKey;

    /**
     * Available Data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    /**
     * A message about the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private JsonNullable<? extends String> errorMessage;

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    @JsonProperty("pushOperationKey")
    private String pushOperationKey;

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
    @JsonProperty("requestedOnUtc")
    private String requestedOnUtc;

    /**
     * The current status of the push operation.
     */
    @JsonProperty("status")
    private PushOperationStatus status;

    /**
     * Push status code.
     */
    @JsonProperty("statusCode")
    private long statusCode;

    /**
     * Number of minutes the push operation must complete within before it times out.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timeoutInMinutes")
    private JsonNullable<? extends Integer> timeoutInMinutes;

    /**
     * Number of seconds the push operation must complete within before it times out.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timeoutInSeconds")
    @Deprecated
    private JsonNullable<? extends Integer> timeoutInSeconds;

    /**
     * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation")
    private Optional<? extends Validation> validation;

    public CreateJournalResponse(
            @JsonProperty("changes") JsonNullable<? extends java.util.List<PushOperationChange>> changes,
            @JsonProperty("companyId") String companyId,
            @JsonProperty("completedOnUtc") Optional<? extends String> completedOnUtc,
            @JsonProperty("data") JsonNullable<? extends AccountingJournal> data,
            @JsonProperty("dataConnectionKey") String dataConnectionKey,
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("errorMessage") JsonNullable<? extends String> errorMessage,
            @JsonProperty("pushOperationKey") String pushOperationKey,
            @JsonProperty("requestedOnUtc") String requestedOnUtc,
            @JsonProperty("status") PushOperationStatus status,
            @JsonProperty("statusCode") long statusCode,
            @JsonProperty("timeoutInMinutes") JsonNullable<? extends Integer> timeoutInMinutes,
            @JsonProperty("timeoutInSeconds") JsonNullable<? extends Integer> timeoutInSeconds,
            @JsonProperty("validation") Optional<? extends Validation> validation) {
        Utils.checkNotNull(changes, "changes");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(completedOnUtc, "completedOnUtc");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(dataConnectionKey, "dataConnectionKey");
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        Utils.checkNotNull(requestedOnUtc, "requestedOnUtc");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        Utils.checkNotNull(timeoutInSeconds, "timeoutInSeconds");
        Utils.checkNotNull(validation, "validation");
        this.changes = changes;
        this.companyId = companyId;
        this.completedOnUtc = completedOnUtc;
        this.data = data;
        this.dataConnectionKey = dataConnectionKey;
        this.dataType = dataType;
        this.errorMessage = errorMessage;
        this.pushOperationKey = pushOperationKey;
        this.requestedOnUtc = requestedOnUtc;
        this.status = status;
        this.statusCode = statusCode;
        this.timeoutInMinutes = timeoutInMinutes;
        this.timeoutInSeconds = timeoutInSeconds;
        this.validation = validation;
    }

    /**
     * Contains a single entry that communicates which record has changed and the manner in which it changed. 
     */
    public JsonNullable<? extends java.util.List<PushOperationChange>> changes() {
        return changes;
    }

    /**
     * Unique identifier for your SMB in Codat.
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
    public Optional<? extends String> completedOnUtc() {
        return completedOnUtc;
    }

    public JsonNullable<? extends AccountingJournal> data() {
        return data;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public String dataConnectionKey() {
        return dataConnectionKey;
    }

    /**
     * Available Data types
     */
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    /**
     * A message about the error.
     */
    public JsonNullable<? extends String> errorMessage() {
        return errorMessage;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public String pushOperationKey() {
        return pushOperationKey;
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
    public String requestedOnUtc() {
        return requestedOnUtc;
    }

    /**
     * The current status of the push operation.
     */
    public PushOperationStatus status() {
        return status;
    }

    /**
     * Push status code.
     */
    public long statusCode() {
        return statusCode;
    }

    /**
     * Number of minutes the push operation must complete within before it times out.
     */
    public JsonNullable<? extends Integer> timeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * Number of seconds the push operation must complete within before it times out.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public JsonNullable<? extends Integer> timeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
     */
    public Optional<? extends Validation> validation() {
        return validation;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Contains a single entry that communicates which record has changed and the manner in which it changed. 
     */
    public CreateJournalResponse withChanges(java.util.List<PushOperationChange> changes) {
        Utils.checkNotNull(changes, "changes");
        this.changes = JsonNullable.of(changes);
        return this;
    }

    /**
     * Contains a single entry that communicates which record has changed and the manner in which it changed. 
     */
    public CreateJournalResponse withChanges(JsonNullable<? extends java.util.List<PushOperationChange>> changes) {
        Utils.checkNotNull(changes, "changes");
        this.changes = changes;
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CreateJournalResponse withCompanyId(String companyId) {
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
    public CreateJournalResponse withCompletedOnUtc(String completedOnUtc) {
        Utils.checkNotNull(completedOnUtc, "completedOnUtc");
        this.completedOnUtc = Optional.ofNullable(completedOnUtc);
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
    public CreateJournalResponse withCompletedOnUtc(Optional<? extends String> completedOnUtc) {
        Utils.checkNotNull(completedOnUtc, "completedOnUtc");
        this.completedOnUtc = completedOnUtc;
        return this;
    }

    public CreateJournalResponse withData(AccountingJournal data) {
        Utils.checkNotNull(data, "data");
        this.data = JsonNullable.of(data);
        return this;
    }

    public CreateJournalResponse withData(JsonNullable<? extends AccountingJournal> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public CreateJournalResponse withDataConnectionKey(String dataConnectionKey) {
        Utils.checkNotNull(dataConnectionKey, "dataConnectionKey");
        this.dataConnectionKey = dataConnectionKey;
        return this;
    }

    /**
     * Available Data types
     */
    public CreateJournalResponse withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }
    
    /**
     * Available Data types
     */
    public CreateJournalResponse withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * A message about the error.
     */
    public CreateJournalResponse withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = JsonNullable.of(errorMessage);
        return this;
    }

    /**
     * A message about the error.
     */
    public CreateJournalResponse withErrorMessage(JsonNullable<? extends String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
     */
    public CreateJournalResponse withPushOperationKey(String pushOperationKey) {
        Utils.checkNotNull(pushOperationKey, "pushOperationKey");
        this.pushOperationKey = pushOperationKey;
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
    public CreateJournalResponse withRequestedOnUtc(String requestedOnUtc) {
        Utils.checkNotNull(requestedOnUtc, "requestedOnUtc");
        this.requestedOnUtc = requestedOnUtc;
        return this;
    }

    /**
     * The current status of the push operation.
     */
    public CreateJournalResponse withStatus(PushOperationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Push status code.
     */
    public CreateJournalResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Number of minutes the push operation must complete within before it times out.
     */
    public CreateJournalResponse withTimeoutInMinutes(int timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = JsonNullable.of(timeoutInMinutes);
        return this;
    }

    /**
     * Number of minutes the push operation must complete within before it times out.
     */
    public CreateJournalResponse withTimeoutInMinutes(JsonNullable<? extends Integer> timeoutInMinutes) {
        Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    /**
     * Number of seconds the push operation must complete within before it times out.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreateJournalResponse withTimeoutInSeconds(int timeoutInSeconds) {
        Utils.checkNotNull(timeoutInSeconds, "timeoutInSeconds");
        this.timeoutInSeconds = JsonNullable.of(timeoutInSeconds);
        return this;
    }

    /**
     * Number of seconds the push operation must complete within before it times out.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreateJournalResponse withTimeoutInSeconds(JsonNullable<? extends Integer> timeoutInSeconds) {
        Utils.checkNotNull(timeoutInSeconds, "timeoutInSeconds");
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
     */
    public CreateJournalResponse withValidation(Validation validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = Optional.ofNullable(validation);
        return this;
    }
    
    /**
     * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
     */
    public CreateJournalResponse withValidation(Optional<? extends Validation> validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = validation;
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
        CreateJournalResponse other = (CreateJournalResponse) o;
        return 
            java.util.Objects.deepEquals(this.changes, other.changes) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.completedOnUtc, other.completedOnUtc) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.dataConnectionKey, other.dataConnectionKey) &&
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.pushOperationKey, other.pushOperationKey) &&
            java.util.Objects.deepEquals(this.requestedOnUtc, other.requestedOnUtc) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.timeoutInMinutes, other.timeoutInMinutes) &&
            java.util.Objects.deepEquals(this.timeoutInSeconds, other.timeoutInSeconds) &&
            java.util.Objects.deepEquals(this.validation, other.validation);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            changes,
            companyId,
            completedOnUtc,
            data,
            dataConnectionKey,
            dataType,
            errorMessage,
            pushOperationKey,
            requestedOnUtc,
            status,
            statusCode,
            timeoutInMinutes,
            timeoutInSeconds,
            validation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateJournalResponse.class,
                "changes", changes,
                "companyId", companyId,
                "completedOnUtc", completedOnUtc,
                "data", data,
                "dataConnectionKey", dataConnectionKey,
                "dataType", dataType,
                "errorMessage", errorMessage,
                "pushOperationKey", pushOperationKey,
                "requestedOnUtc", requestedOnUtc,
                "status", status,
                "statusCode", statusCode,
                "timeoutInMinutes", timeoutInMinutes,
                "timeoutInSeconds", timeoutInSeconds,
                "validation", validation);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<PushOperationChange>> changes = JsonNullable.undefined();
 
        private String companyId;
 
        private Optional<? extends String> completedOnUtc = Optional.empty();
 
        private JsonNullable<? extends AccountingJournal> data = JsonNullable.undefined();
 
        private String dataConnectionKey;
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private JsonNullable<? extends String> errorMessage = JsonNullable.undefined();
 
        private String pushOperationKey;
 
        private String requestedOnUtc;
 
        private PushOperationStatus status;
 
        private Long statusCode;
 
        private JsonNullable<? extends Integer> timeoutInMinutes = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<? extends Integer> timeoutInSeconds = JsonNullable.undefined();
 
        private Optional<? extends Validation> validation = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Contains a single entry that communicates which record has changed and the manner in which it changed. 
         */
        public Builder changes(java.util.List<PushOperationChange> changes) {
            Utils.checkNotNull(changes, "changes");
            this.changes = JsonNullable.of(changes);
            return this;
        }

        /**
         * Contains a single entry that communicates which record has changed and the manner in which it changed. 
         */
        public Builder changes(JsonNullable<? extends java.util.List<PushOperationChange>> changes) {
            Utils.checkNotNull(changes, "changes");
            this.changes = changes;
            return this;
        }

        /**
         * Unique identifier for your SMB in Codat.
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
        public Builder completedOnUtc(String completedOnUtc) {
            Utils.checkNotNull(completedOnUtc, "completedOnUtc");
            this.completedOnUtc = Optional.ofNullable(completedOnUtc);
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
        public Builder completedOnUtc(Optional<? extends String> completedOnUtc) {
            Utils.checkNotNull(completedOnUtc, "completedOnUtc");
            this.completedOnUtc = completedOnUtc;
            return this;
        }

        public Builder data(AccountingJournal data) {
            Utils.checkNotNull(data, "data");
            this.data = JsonNullable.of(data);
            return this;
        }

        public Builder data(JsonNullable<? extends AccountingJournal> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder dataConnectionKey(String dataConnectionKey) {
            Utils.checkNotNull(dataConnectionKey, "dataConnectionKey");
            this.dataConnectionKey = dataConnectionKey;
            return this;
        }

        /**
         * Available Data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }
        
        /**
         * Available Data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * A message about the error.
         */
        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = JsonNullable.of(errorMessage);
            return this;
        }

        /**
         * A message about the error.
         */
        public Builder errorMessage(JsonNullable<? extends String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * A unique identifier generated by Codat to represent this single push operation. This identifier can be used to track the status of the push, and should be persisted.
         */
        public Builder pushOperationKey(String pushOperationKey) {
            Utils.checkNotNull(pushOperationKey, "pushOperationKey");
            this.pushOperationKey = pushOperationKey;
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
        public Builder requestedOnUtc(String requestedOnUtc) {
            Utils.checkNotNull(requestedOnUtc, "requestedOnUtc");
            this.requestedOnUtc = requestedOnUtc;
            return this;
        }

        /**
         * The current status of the push operation.
         */
        public Builder status(PushOperationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Push status code.
         */
        public Builder statusCode(long statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Number of minutes the push operation must complete within before it times out.
         */
        public Builder timeoutInMinutes(int timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = JsonNullable.of(timeoutInMinutes);
            return this;
        }

        /**
         * Number of minutes the push operation must complete within before it times out.
         */
        public Builder timeoutInMinutes(JsonNullable<? extends Integer> timeoutInMinutes) {
            Utils.checkNotNull(timeoutInMinutes, "timeoutInMinutes");
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * Number of seconds the push operation must complete within before it times out.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder timeoutInSeconds(int timeoutInSeconds) {
            Utils.checkNotNull(timeoutInSeconds, "timeoutInSeconds");
            this.timeoutInSeconds = JsonNullable.of(timeoutInSeconds);
            return this;
        }

        /**
         * Number of seconds the push operation must complete within before it times out.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder timeoutInSeconds(JsonNullable<? extends Integer> timeoutInSeconds) {
            Utils.checkNotNull(timeoutInSeconds, "timeoutInSeconds");
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
         */
        public Builder validation(Validation validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = Optional.ofNullable(validation);
            return this;
        }
        
        /**
         * A human-readable object describing validation decisions Codat has made when pushing data into the platform. If a push has failed because of validation errors, they will be detailed here.
         */
        public Builder validation(Optional<? extends Validation> validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = validation;
            return this;
        }
        
        public CreateJournalResponse build() {
            return new CreateJournalResponse(
                changes,
                companyId,
                completedOnUtc,
                data,
                dataConnectionKey,
                dataType,
                errorMessage,
                pushOperationKey,
                requestedOnUtc,
                status,
                statusCode,
                timeoutInMinutes,
                timeoutInSeconds,
                validation);
        }
    }
}

