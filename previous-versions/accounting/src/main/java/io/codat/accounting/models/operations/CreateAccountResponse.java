/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateAccountResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse;

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

    public CreateAccountResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createAccountResponse, "createAccountResponse");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createAccountResponse = createAccountResponse;
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
    public Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse() {
        return createAccountResponse;
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
    public CreateAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateAccountResponse withCreateAccountResponse(io.codat.accounting.models.components.CreateAccountResponse createAccountResponse) {
        Utils.checkNotNull(createAccountResponse, "createAccountResponse");
        this.createAccountResponse = Optional.ofNullable(createAccountResponse);
        return this;
    }
    
    /**
     * Success
     */
    public CreateAccountResponse withCreateAccountResponse(Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse) {
        Utils.checkNotNull(createAccountResponse, "createAccountResponse");
        this.createAccountResponse = createAccountResponse;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateAccountResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public CreateAccountResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateAccountResponse other = (CreateAccountResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createAccountResponse, other.createAccountResponse) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createAccountResponse,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAccountResponse.class,
                "contentType", contentType,
                "createAccountResponse", createAccountResponse,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse = Optional.empty();
 
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
        public Builder createAccountResponse(io.codat.accounting.models.components.CreateAccountResponse createAccountResponse) {
            Utils.checkNotNull(createAccountResponse, "createAccountResponse");
            this.createAccountResponse = Optional.ofNullable(createAccountResponse);
            return this;
        }
        
        /**
         * Success
         */
        public Builder createAccountResponse(Optional<? extends io.codat.accounting.models.components.CreateAccountResponse> createAccountResponse) {
            Utils.checkNotNull(createAccountResponse, "createAccountResponse");
            this.createAccountResponse = createAccountResponse;
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
        
        public CreateAccountResponse build() {
            return new CreateAccountResponse(
                contentType,
                createAccountResponse,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}
