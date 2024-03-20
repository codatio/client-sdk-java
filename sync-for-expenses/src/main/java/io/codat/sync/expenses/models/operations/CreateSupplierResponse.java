/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateSupplierResponse implements io.codat.sync.expenses.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateSupplierResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse,
            Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createSupplierResponse, "createSupplierResponse");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createSupplierResponse = createSupplierResponse;
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
    public Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse() {
        return createSupplierResponse;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage() {
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
    public CreateSupplierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateSupplierResponse withCreateSupplierResponse(io.codat.sync.expenses.models.components.CreateSupplierResponse createSupplierResponse) {
        Utils.checkNotNull(createSupplierResponse, "createSupplierResponse");
        this.createSupplierResponse = Optional.ofNullable(createSupplierResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateSupplierResponse withCreateSupplierResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse) {
        Utils.checkNotNull(createSupplierResponse, "createSupplierResponse");
        this.createSupplierResponse = createSupplierResponse;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateSupplierResponse withErrorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateSupplierResponse withErrorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateSupplierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateSupplierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateSupplierResponse other = (CreateSupplierResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createSupplierResponse, other.createSupplierResponse) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createSupplierResponse,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSupplierResponse.class,
                "contentType", contentType,
                "createSupplierResponse", createSupplierResponse,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse = Optional.empty();
 
        private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage = Optional.empty();
 
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
        public Builder createSupplierResponse(io.codat.sync.expenses.models.components.CreateSupplierResponse createSupplierResponse) {
            Utils.checkNotNull(createSupplierResponse, "createSupplierResponse");
            this.createSupplierResponse = Optional.ofNullable(createSupplierResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder createSupplierResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateSupplierResponse> createSupplierResponse) {
            Utils.checkNotNull(createSupplierResponse, "createSupplierResponse");
            this.createSupplierResponse = createSupplierResponse;
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
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
        
        public CreateSupplierResponse build() {
            return new CreateSupplierResponse(
                contentType,
                createSupplierResponse,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

