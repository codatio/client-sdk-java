/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class UpdateSupplierResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse;

    public UpdateSupplierResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateSupplierResponse, "updateSupplierResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateSupplierResponse = updateSupplierResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
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

    /**
     * Success
     */
    public Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse() {
        return updateSupplierResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateSupplierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public UpdateSupplierResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public UpdateSupplierResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateSupplierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateSupplierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public UpdateSupplierResponse withUpdateSupplierResponse(io.codat.accounting.models.components.UpdateSupplierResponse updateSupplierResponse) {
        Utils.checkNotNull(updateSupplierResponse, "updateSupplierResponse");
        this.updateSupplierResponse = Optional.ofNullable(updateSupplierResponse);
        return this;
    }
    
    /**
     * Success
     */
    public UpdateSupplierResponse withUpdateSupplierResponse(Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse) {
        Utils.checkNotNull(updateSupplierResponse, "updateSupplierResponse");
        this.updateSupplierResponse = updateSupplierResponse;
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
        UpdateSupplierResponse other = (UpdateSupplierResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.updateSupplierResponse, other.updateSupplierResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            updateSupplierResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSupplierResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateSupplierResponse", updateSupplierResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse = Optional.empty();  
        
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

        /**
         * Success
         */
        public Builder updateSupplierResponse(io.codat.accounting.models.components.UpdateSupplierResponse updateSupplierResponse) {
            Utils.checkNotNull(updateSupplierResponse, "updateSupplierResponse");
            this.updateSupplierResponse = Optional.ofNullable(updateSupplierResponse);
            return this;
        }
        
        /**
         * Success
         */
        public Builder updateSupplierResponse(Optional<? extends io.codat.accounting.models.components.UpdateSupplierResponse> updateSupplierResponse) {
            Utils.checkNotNull(updateSupplierResponse, "updateSupplierResponse");
            this.updateSupplierResponse = updateSupplierResponse;
            return this;
        }
        
        public UpdateSupplierResponse build() {
            return new UpdateSupplierResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                updateSupplierResponse);
        }
    }
}

