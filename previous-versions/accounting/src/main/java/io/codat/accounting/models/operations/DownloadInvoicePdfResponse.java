/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class DownloadInvoicePdfResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends InputStream> data;

    /**
     * Your API request was not properly authorized.
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

    public DownloadInvoicePdfResponse(
            String contentType,
            Optional<? extends InputStream> data,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.data = data;
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
    public Optional<? extends InputStream> data() {
        return data;
    }

    /**
     * Your API request was not properly authorized.
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
    public DownloadInvoicePdfResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public DownloadInvoicePdfResponse withData(InputStream data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }
    
    /**
     * Success
     */
    public DownloadInvoicePdfResponse withData(Optional<? extends InputStream> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public DownloadInvoicePdfResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public DownloadInvoicePdfResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DownloadInvoicePdfResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DownloadInvoicePdfResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        DownloadInvoicePdfResponse other = (DownloadInvoicePdfResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            data,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DownloadInvoicePdfResponse.class,
                "contentType", contentType,
                "data", data,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends InputStream> data = Optional.empty();
 
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
        public Builder data(InputStream data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }
        
        /**
         * Success
         */
        public Builder data(Optional<? extends InputStream> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
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
        
        public DownloadInvoicePdfResponse build() {
            return new DownloadInvoicePdfResponse(
                contentType,
                data,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

