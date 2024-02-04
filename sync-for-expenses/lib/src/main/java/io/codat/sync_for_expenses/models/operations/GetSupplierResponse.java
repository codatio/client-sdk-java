/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.operations;

import io.codat.sync_for_expenses.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetSupplierResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage;

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
    private JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier;

    public GetSupplierResponse(
            String contentType,
            Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(supplier, "supplier");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.supplier = supplier;
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
    public Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage() {
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
    public JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier() {
        return supplier;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetSupplierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetSupplierResponse withErrorMessage(io.codat.sync_for_expenses.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetSupplierResponse withErrorMessage(Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetSupplierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSupplierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetSupplierResponse withSupplier(io.codat.sync_for_expenses.models.shared.Supplier supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = JsonNullable.of(supplier);
        return this;
    }

    /**
     * Success
     */
    public GetSupplierResponse withSupplier(JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = supplier;
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
        GetSupplierResponse other = (GetSupplierResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.supplier, other.supplier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            supplier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSupplierResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "supplier", supplier);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier = JsonNullable.undefined();  
        
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
        public Builder errorMessage(io.codat.sync_for_expenses.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync_for_expenses.models.shared.ErrorMessage> errorMessage) {
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
        public Builder supplier(io.codat.sync_for_expenses.models.shared.Supplier supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = JsonNullable.of(supplier);
            return this;
        }

        /**
         * Success
         */
        public Builder supplier(JsonNullable<? extends io.codat.sync_for_expenses.models.shared.Supplier> supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = supplier;
            return this;
        }        
        
        public GetSupplierResponse build() {
            return new GetSupplierResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                supplier);
        }
    }
}

