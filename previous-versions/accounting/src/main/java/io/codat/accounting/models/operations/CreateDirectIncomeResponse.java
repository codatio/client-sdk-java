/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateDirectIncomeResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateDirectIncomeResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createDirectIncomeResponse, "createDirectIncomeResponse");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createDirectIncomeResponse = createDirectIncomeResponse;
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
    public Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse() {
        return createDirectIncomeResponse;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage() {
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
    public CreateDirectIncomeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateDirectIncomeResponse withCreateDirectIncomeResponse(io.codat.accounting.models.components.CreateDirectIncomeResponse createDirectIncomeResponse) {
        Utils.checkNotNull(createDirectIncomeResponse, "createDirectIncomeResponse");
        this.createDirectIncomeResponse = Optional.ofNullable(createDirectIncomeResponse);
        return this;
    }
    
    /**
     * Success
     */
    public CreateDirectIncomeResponse withCreateDirectIncomeResponse(Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse) {
        Utils.checkNotNull(createDirectIncomeResponse, "createDirectIncomeResponse");
        this.createDirectIncomeResponse = createDirectIncomeResponse;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateDirectIncomeResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public CreateDirectIncomeResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateDirectIncomeResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateDirectIncomeResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateDirectIncomeResponse other = (CreateDirectIncomeResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createDirectIncomeResponse, other.createDirectIncomeResponse) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createDirectIncomeResponse,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDirectIncomeResponse.class,
                "contentType", contentType,
                "createDirectIncomeResponse", createDirectIncomeResponse,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse = Optional.empty();
 
        private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage = Optional.empty();
 
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
        public Builder createDirectIncomeResponse(io.codat.accounting.models.components.CreateDirectIncomeResponse createDirectIncomeResponse) {
            Utils.checkNotNull(createDirectIncomeResponse, "createDirectIncomeResponse");
            this.createDirectIncomeResponse = Optional.ofNullable(createDirectIncomeResponse);
            return this;
        }
        
        /**
         * Success
         */
        public Builder createDirectIncomeResponse(Optional<? extends io.codat.accounting.models.components.CreateDirectIncomeResponse> createDirectIncomeResponse) {
            Utils.checkNotNull(createDirectIncomeResponse, "createDirectIncomeResponse");
            this.createDirectIncomeResponse = createDirectIncomeResponse;
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
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
        
        public CreateDirectIncomeResponse build() {
            return new CreateDirectIncomeResponse(
                contentType,
                createDirectIncomeResponse,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

