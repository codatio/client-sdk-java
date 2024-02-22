/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListJournalEntriesResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
     */
    private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListJournalEntriesResponse(
            String contentType,
            Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage,
            Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(journalEntries, "journalEntries");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.journalEntries = journalEntries;
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
     * Your `query` parameter was not correctly formed
     */
    public Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries() {
        return journalEntries;
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
    public ListJournalEntriesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListJournalEntriesResponse withErrorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your `query` parameter was not correctly formed
     */
    public ListJournalEntriesResponse withErrorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Success
     */
    public ListJournalEntriesResponse withJournalEntries(io.codat.sync.payroll.models.components.JournalEntries journalEntries) {
        Utils.checkNotNull(journalEntries, "journalEntries");
        this.journalEntries = Optional.ofNullable(journalEntries);
        return this;
    }
    
    /**
     * Success
     */
    public ListJournalEntriesResponse withJournalEntries(Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries) {
        Utils.checkNotNull(journalEntries, "journalEntries");
        this.journalEntries = journalEntries;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListJournalEntriesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListJournalEntriesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListJournalEntriesResponse other = (ListJournalEntriesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.journalEntries, other.journalEntries) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            journalEntries,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListJournalEntriesResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "journalEntries", journalEntries,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries = Optional.empty();
 
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
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Success
         */
        public Builder journalEntries(io.codat.sync.payroll.models.components.JournalEntries journalEntries) {
            Utils.checkNotNull(journalEntries, "journalEntries");
            this.journalEntries = Optional.ofNullable(journalEntries);
            return this;
        }
        
        /**
         * Success
         */
        public Builder journalEntries(Optional<? extends io.codat.sync.payroll.models.components.JournalEntries> journalEntries) {
            Utils.checkNotNull(journalEntries, "journalEntries");
            this.journalEntries = journalEntries;
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
        
        public ListJournalEntriesResponse build() {
            return new ListJournalEntriesResponse(
                contentType,
                errorMessage,
                journalEntries,
                statusCode,
                rawResponse);
        }
    }
}
