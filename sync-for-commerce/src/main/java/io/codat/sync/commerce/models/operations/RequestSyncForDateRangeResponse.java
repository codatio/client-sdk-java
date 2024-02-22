/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class RequestSyncForDateRangeResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary;

    public RequestSyncForDateRangeResponse(
            String contentType,
            Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(syncSummary, "syncSummary");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.syncSummary = syncSummary;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
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

    /**
     * Success
     */
    public Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary() {
        return syncSummary;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public RequestSyncForDateRangeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public RequestSyncForDateRangeResponse withErrorMessage(io.codat.sync.commerce.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public RequestSyncForDateRangeResponse withErrorMessage(Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RequestSyncForDateRangeResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RequestSyncForDateRangeResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public RequestSyncForDateRangeResponse withSyncSummary(io.codat.sync.commerce.models.components.SyncSummary syncSummary) {
        Utils.checkNotNull(syncSummary, "syncSummary");
        this.syncSummary = Optional.ofNullable(syncSummary);
        return this;
    }
    
    /**
     * Success
     */
    public RequestSyncForDateRangeResponse withSyncSummary(Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary) {
        Utils.checkNotNull(syncSummary, "syncSummary");
        this.syncSummary = syncSummary;
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
        RequestSyncForDateRangeResponse other = (RequestSyncForDateRangeResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.syncSummary, other.syncSummary);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            syncSummary);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestSyncForDateRangeResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "syncSummary", syncSummary);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary = Optional.empty();  
        
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
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.sync.commerce.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.commerce.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
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

        /**
         * Success
         */
        public Builder syncSummary(io.codat.sync.commerce.models.components.SyncSummary syncSummary) {
            Utils.checkNotNull(syncSummary, "syncSummary");
            this.syncSummary = Optional.ofNullable(syncSummary);
            return this;
        }
        
        /**
         * Success
         */
        public Builder syncSummary(Optional<? extends io.codat.sync.commerce.models.components.SyncSummary> syncSummary) {
            Utils.checkNotNull(syncSummary, "syncSummary");
            this.syncSummary = syncSummary;
            return this;
        }
        
        public RequestSyncForDateRangeResponse build() {
            return new RequestSyncForDateRangeResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                syncSummary);
        }
    }
}
