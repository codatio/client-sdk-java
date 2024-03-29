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


public class GetSupplementalDataConfigurationResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
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

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration;

    public GetSupplementalDataConfigurationResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(supplementalDataConfiguration, "supplementalDataConfiguration");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.supplementalDataConfiguration = supplementalDataConfiguration;
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

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration() {
        return supplementalDataConfiguration;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetSupplementalDataConfigurationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetSupplementalDataConfigurationResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetSupplementalDataConfigurationResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetSupplementalDataConfigurationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSupplementalDataConfigurationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public GetSupplementalDataConfigurationResponse withSupplementalDataConfiguration(io.codat.platform.models.shared.SupplementalDataConfiguration supplementalDataConfiguration) {
        Utils.checkNotNull(supplementalDataConfiguration, "supplementalDataConfiguration");
        this.supplementalDataConfiguration = Optional.ofNullable(supplementalDataConfiguration);
        return this;
    }

    /**
     * OK
     */
    public GetSupplementalDataConfigurationResponse withSupplementalDataConfiguration(Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration) {
        Utils.checkNotNull(supplementalDataConfiguration, "supplementalDataConfiguration");
        this.supplementalDataConfiguration = supplementalDataConfiguration;
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
        GetSupplementalDataConfigurationResponse other = (GetSupplementalDataConfigurationResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.supplementalDataConfiguration, other.supplementalDataConfiguration);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            supplementalDataConfiguration);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSupplementalDataConfigurationResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "supplementalDataConfiguration", supplementalDataConfiguration);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration = Optional.empty();  
        
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
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Your API request was not properly authorized.
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

        /**
         * OK
         */
        public Builder supplementalDataConfiguration(io.codat.platform.models.shared.SupplementalDataConfiguration supplementalDataConfiguration) {
            Utils.checkNotNull(supplementalDataConfiguration, "supplementalDataConfiguration");
            this.supplementalDataConfiguration = Optional.ofNullable(supplementalDataConfiguration);
            return this;
        }

        /**
         * OK
         */
        public Builder supplementalDataConfiguration(Optional<? extends io.codat.platform.models.shared.SupplementalDataConfiguration> supplementalDataConfiguration) {
            Utils.checkNotNull(supplementalDataConfiguration, "supplementalDataConfiguration");
            this.supplementalDataConfiguration = supplementalDataConfiguration;
            return this;
        }
        
        public GetSupplementalDataConfigurationResponse build() {
            return new GetSupplementalDataConfigurationResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                supplementalDataConfiguration);
        }
    }
}

