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


public class GetCompanyPushHistoryResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
     */
    private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage;

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetCompanyPushHistoryResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(pushOperations, "pushOperations");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.pushOperations = pushOperations;
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
    public Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations() {
        return pushOperations;
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
    public GetCompanyPushHistoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public GetCompanyPushHistoryResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public GetCompanyPushHistoryResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * OK
     */
    public GetCompanyPushHistoryResponse withPushOperations(io.codat.platform.models.shared.PushOperations pushOperations) {
        Utils.checkNotNull(pushOperations, "pushOperations");
        this.pushOperations = Optional.ofNullable(pushOperations);
        return this;
    }

    /**
     * OK
     */
    public GetCompanyPushHistoryResponse withPushOperations(Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations) {
        Utils.checkNotNull(pushOperations, "pushOperations");
        this.pushOperations = pushOperations;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCompanyPushHistoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCompanyPushHistoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCompanyPushHistoryResponse other = (GetCompanyPushHistoryResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.pushOperations, other.pushOperations) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            pushOperations,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompanyPushHistoryResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "pushOperations", pushOperations,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations = Optional.empty();
 
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
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * OK
         */
        public Builder pushOperations(io.codat.platform.models.shared.PushOperations pushOperations) {
            Utils.checkNotNull(pushOperations, "pushOperations");
            this.pushOperations = Optional.ofNullable(pushOperations);
            return this;
        }

        /**
         * OK
         */
        public Builder pushOperations(Optional<? extends io.codat.platform.models.shared.PushOperations> pushOperations) {
            Utils.checkNotNull(pushOperations, "pushOperations");
            this.pushOperations = pushOperations;
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
        
        public GetCompanyPushHistoryResponse build() {
            return new GetCompanyPushHistoryResponse(
                contentType,
                errorMessage,
                pushOperations,
                statusCode,
                rawResponse);
        }
    }
}

