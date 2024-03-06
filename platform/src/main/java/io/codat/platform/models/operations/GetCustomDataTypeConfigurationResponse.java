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


public class GetCustomDataTypeConfigurationResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords;

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

    public GetCustomDataTypeConfigurationResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.customDataTypeRecords = customDataTypeRecords;
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
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords() {
        return customDataTypeRecords;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCustomDataTypeConfigurationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetCustomDataTypeConfigurationResponse withCustomDataTypeRecords(io.codat.platform.models.shared.CustomDataTypeRecords customDataTypeRecords) {
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        this.customDataTypeRecords = Optional.ofNullable(customDataTypeRecords);
        return this;
    }

    /**
     * OK
     */
    public GetCustomDataTypeConfigurationResponse withCustomDataTypeRecords(Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords) {
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        this.customDataTypeRecords = customDataTypeRecords;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetCustomDataTypeConfigurationResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetCustomDataTypeConfigurationResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCustomDataTypeConfigurationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCustomDataTypeConfigurationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCustomDataTypeConfigurationResponse other = (GetCustomDataTypeConfigurationResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.customDataTypeRecords, other.customDataTypeRecords) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            customDataTypeRecords,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCustomDataTypeConfigurationResponse.class,
                "contentType", contentType,
                "customDataTypeRecords", customDataTypeRecords,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords = Optional.empty();
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
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
        public Builder customDataTypeRecords(io.codat.platform.models.shared.CustomDataTypeRecords customDataTypeRecords) {
            Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
            this.customDataTypeRecords = Optional.ofNullable(customDataTypeRecords);
            return this;
        }

        /**
         * OK
         */
        public Builder customDataTypeRecords(Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords) {
            Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
            this.customDataTypeRecords = customDataTypeRecords;
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
        
        public GetCustomDataTypeConfigurationResponse build() {
            return new GetCustomDataTypeConfigurationResponse(
                contentType,
                customDataTypeRecords,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

