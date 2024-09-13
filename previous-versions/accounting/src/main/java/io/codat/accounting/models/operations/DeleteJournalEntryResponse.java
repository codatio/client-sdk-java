/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.PushOperationSummary;
import io.codat.accounting.utils.Response;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class DeleteJournalEntryResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends PushOperationSummary> pushOperationSummary;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public DeleteJournalEntryResponse(
            String contentType,
            Optional<? extends PushOperationSummary> pushOperationSummary,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(pushOperationSummary, "pushOperationSummary");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.pushOperationSummary = pushOperationSummary;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public DeleteJournalEntryResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushOperationSummary> pushOperationSummary() {
        return (Optional<PushOperationSummary>) pushOperationSummary;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public DeleteJournalEntryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public DeleteJournalEntryResponse withPushOperationSummary(PushOperationSummary pushOperationSummary) {
        Utils.checkNotNull(pushOperationSummary, "pushOperationSummary");
        this.pushOperationSummary = Optional.ofNullable(pushOperationSummary);
        return this;
    }

    /**
     * OK
     */
    public DeleteJournalEntryResponse withPushOperationSummary(Optional<? extends PushOperationSummary> pushOperationSummary) {
        Utils.checkNotNull(pushOperationSummary, "pushOperationSummary");
        this.pushOperationSummary = pushOperationSummary;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DeleteJournalEntryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DeleteJournalEntryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        DeleteJournalEntryResponse other = (DeleteJournalEntryResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.pushOperationSummary, other.pushOperationSummary) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            pushOperationSummary,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteJournalEntryResponse.class,
                "contentType", contentType,
                "pushOperationSummary", pushOperationSummary,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PushOperationSummary> pushOperationSummary = Optional.empty();
 
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
         * OK
         */
        public Builder pushOperationSummary(PushOperationSummary pushOperationSummary) {
            Utils.checkNotNull(pushOperationSummary, "pushOperationSummary");
            this.pushOperationSummary = Optional.ofNullable(pushOperationSummary);
            return this;
        }

        /**
         * OK
         */
        public Builder pushOperationSummary(Optional<? extends PushOperationSummary> pushOperationSummary) {
            Utils.checkNotNull(pushOperationSummary, "pushOperationSummary");
            this.pushOperationSummary = pushOperationSummary;
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
        
        public DeleteJournalEntryResponse build() {
            return new DeleteJournalEntryResponse(
                contentType,
                pushOperationSummary,
                statusCode,
                rawResponse);
        }
    }
}

