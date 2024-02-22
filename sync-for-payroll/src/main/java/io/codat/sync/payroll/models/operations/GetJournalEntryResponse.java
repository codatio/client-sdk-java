/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetJournalEntryResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage;

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetJournalEntryResponse(
            String contentType,
            Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage,
            JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(journalEntry, "journalEntry");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.journalEntry = journalEntry;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Your API request was not properly authorized.
     */
    public Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry() {
        return journalEntry;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetJournalEntryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetJournalEntryResponse withErrorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetJournalEntryResponse withErrorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Success
     */
    public GetJournalEntryResponse withJournalEntry(io.codat.sync.payroll.models.components.JournalEntry journalEntry) {
        Utils.checkNotNull(journalEntry, "journalEntry");
        this.journalEntry = JsonNullable.of(journalEntry);
        return this;
    }

    /**
     * Success
     */
    public GetJournalEntryResponse withJournalEntry(JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry) {
        Utils.checkNotNull(journalEntry, "journalEntry");
        this.journalEntry = journalEntry;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetJournalEntryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetJournalEntryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        GetJournalEntryResponse other = (GetJournalEntryResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.journalEntry, other.journalEntry) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            journalEntry,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetJournalEntryResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "journalEntry", journalEntry,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry = JsonNullable.undefined();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Success
         */
        public Builder journalEntry(io.codat.sync.payroll.models.components.JournalEntry journalEntry) {
            Utils.checkNotNull(journalEntry, "journalEntry");
            this.journalEntry = JsonNullable.of(journalEntry);
            return this;
        }

        /**
         * Success
         */
        public Builder journalEntry(JsonNullable<? extends io.codat.sync.payroll.models.components.JournalEntry> journalEntry) {
            Utils.checkNotNull(journalEntry, "journalEntry");
            this.journalEntry = journalEntry;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public GetJournalEntryResponse build() {
            return new GetJournalEntryResponse(
                contentType,
                errorMessage,
                journalEntry,
                statusCode,
                rawResponse);
        }
    }
}

