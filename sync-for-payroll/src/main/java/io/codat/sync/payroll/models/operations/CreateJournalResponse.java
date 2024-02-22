/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateJournalResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateJournalResponse(
            String contentType,
            Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse,
            Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createJournalResponse, "createJournalResponse");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createJournalResponse = createJournalResponse;
        this.errorMessage = errorMessage;
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
     * Success
     */
    public Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse() {
        return createJournalResponse;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage() {
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
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateJournalResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateJournalResponse withCreateJournalResponse(io.codat.sync.payroll.models.components.CreateJournalResponse createJournalResponse) {
        Utils.checkNotNull(createJournalResponse, "createJournalResponse");
        this.createJournalResponse = Optional.ofNullable(createJournalResponse);
        return this;
    }
    
    /**
     * Success
     */
    public CreateJournalResponse withCreateJournalResponse(Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse) {
        Utils.checkNotNull(createJournalResponse, "createJournalResponse");
        this.createJournalResponse = createJournalResponse;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateJournalResponse withErrorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public CreateJournalResponse withErrorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateJournalResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateJournalResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateJournalResponse other = (CreateJournalResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createJournalResponse, other.createJournalResponse) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createJournalResponse,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateJournalResponse.class,
                "contentType", contentType,
                "createJournalResponse", createJournalResponse,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse = Optional.empty();
 
        private Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage = Optional.empty();
 
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
         * Success
         */
        public Builder createJournalResponse(io.codat.sync.payroll.models.components.CreateJournalResponse createJournalResponse) {
            Utils.checkNotNull(createJournalResponse, "createJournalResponse");
            this.createJournalResponse = Optional.ofNullable(createJournalResponse);
            return this;
        }
        
        /**
         * Success
         */
        public Builder createJournalResponse(Optional<? extends io.codat.sync.payroll.models.components.CreateJournalResponse> createJournalResponse) {
            Utils.checkNotNull(createJournalResponse, "createJournalResponse");
            this.createJournalResponse = createJournalResponse;
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.sync.payroll.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.payroll.models.components.ErrorMessage> errorMessage) {
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
        
        public CreateJournalResponse build() {
            return new CreateJournalResponse(
                contentType,
                createJournalResponse,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

