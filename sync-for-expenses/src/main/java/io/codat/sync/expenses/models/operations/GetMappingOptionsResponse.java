/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetMappingOptionsResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetMappingOptionsResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage,
            Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(mappingOptions, "mappingOptions");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.mappingOptions = mappingOptions;
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
    public Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions() {
        return mappingOptions;
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
    public GetMappingOptionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetMappingOptionsResponse withErrorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetMappingOptionsResponse withErrorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Success
     */
    public GetMappingOptionsResponse withMappingOptions(io.codat.sync.expenses.models.components.MappingOptions mappingOptions) {
        Utils.checkNotNull(mappingOptions, "mappingOptions");
        this.mappingOptions = Optional.ofNullable(mappingOptions);
        return this;
    }
    
    /**
     * Success
     */
    public GetMappingOptionsResponse withMappingOptions(Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions) {
        Utils.checkNotNull(mappingOptions, "mappingOptions");
        this.mappingOptions = mappingOptions;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetMappingOptionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetMappingOptionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetMappingOptionsResponse other = (GetMappingOptionsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.mappingOptions, other.mappingOptions) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            mappingOptions,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMappingOptionsResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "mappingOptions", mappingOptions,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions = Optional.empty();
 
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
        public Builder errorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Success
         */
        public Builder mappingOptions(io.codat.sync.expenses.models.components.MappingOptions mappingOptions) {
            Utils.checkNotNull(mappingOptions, "mappingOptions");
            this.mappingOptions = Optional.ofNullable(mappingOptions);
            return this;
        }
        
        /**
         * Success
         */
        public Builder mappingOptions(Optional<? extends io.codat.sync.expenses.models.components.MappingOptions> mappingOptions) {
            Utils.checkNotNull(mappingOptions, "mappingOptions");
            this.mappingOptions = mappingOptions;
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
        
        public GetMappingOptionsResponse build() {
            return new GetMappingOptionsResponse(
                contentType,
                errorMessage,
                mappingOptions,
                statusCode,
                rawResponse);
        }
    }
}

