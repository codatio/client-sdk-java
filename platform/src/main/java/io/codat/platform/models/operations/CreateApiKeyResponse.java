/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateApiKeyResponse {

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Bad Request
     */
    private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateApiKeyResponse(
            JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails,
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiKeyDetails = apiKeyDetails;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails() {
        return apiKeyDetails;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Bad Request
     */
    public Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage() {
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
     * Success
     */
    public CreateApiKeyResponse withApiKeyDetails(io.codat.platform.models.shared.ApiKeyDetails apiKeyDetails) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        this.apiKeyDetails = JsonNullable.of(apiKeyDetails);
        return this;
    }

    /**
     * Success
     */
    public CreateApiKeyResponse withApiKeyDetails(JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        this.apiKeyDetails = apiKeyDetails;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateApiKeyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Bad Request
     */
    public CreateApiKeyResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Bad Request
     */
    public CreateApiKeyResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateApiKeyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateApiKeyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateApiKeyResponse other = (CreateApiKeyResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiKeyDetails, other.apiKeyDetails) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeyDetails,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateApiKeyResponse.class,
                "apiKeyDetails", apiKeyDetails,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails = JsonNullable.undefined();
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder apiKeyDetails(io.codat.platform.models.shared.ApiKeyDetails apiKeyDetails) {
            Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
            this.apiKeyDetails = JsonNullable.of(apiKeyDetails);
            return this;
        }

        /**
         * Success
         */
        public Builder apiKeyDetails(JsonNullable<? extends io.codat.platform.models.shared.ApiKeyDetails> apiKeyDetails) {
            Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
            this.apiKeyDetails = apiKeyDetails;
            return this;
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
         * Bad Request
         */
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Bad Request
         */
        public Builder errorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
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
        
        public CreateApiKeyResponse build() {
            return new CreateApiKeyResponse(
                apiKeyDetails,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

