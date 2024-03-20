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


public class ListSuppliersResponse implements io.codat.sync.expenses.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
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

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers;

    public ListSuppliersResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(suppliers, "suppliers");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.suppliers = suppliers;
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

    /**
     * Success
     */
    public Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers() {
        return suppliers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListSuppliersResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListSuppliersResponse withErrorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListSuppliersResponse withErrorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListSuppliersResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListSuppliersResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public ListSuppliersResponse withSuppliers(io.codat.sync.expenses.models.components.Suppliers suppliers) {
        Utils.checkNotNull(suppliers, "suppliers");
        this.suppliers = Optional.ofNullable(suppliers);
        return this;
    }

    /**
     * Success
     */
    public ListSuppliersResponse withSuppliers(Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers) {
        Utils.checkNotNull(suppliers, "suppliers");
        this.suppliers = suppliers;
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
        ListSuppliersResponse other = (ListSuppliersResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.suppliers, other.suppliers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            suppliers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSuppliersResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "suppliers", suppliers);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers = Optional.empty();  
        
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
        public Builder errorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * Your `query` parameter was not correctly formed
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

        /**
         * Success
         */
        public Builder suppliers(io.codat.sync.expenses.models.components.Suppliers suppliers) {
            Utils.checkNotNull(suppliers, "suppliers");
            this.suppliers = Optional.ofNullable(suppliers);
            return this;
        }

        /**
         * Success
         */
        public Builder suppliers(Optional<? extends io.codat.sync.expenses.models.components.Suppliers> suppliers) {
            Utils.checkNotNull(suppliers, "suppliers");
            this.suppliers = suppliers;
            return this;
        }
        
        public ListSuppliersResponse build() {
            return new ListSuppliersResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                suppliers);
        }
    }
}

