/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListInvoiceAttachmentsResponse {

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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

    public ListInvoiceAttachmentsResponse(
            Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset,
            String contentType,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.attachmentsDataset = attachmentsDataset;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset() {
        return attachmentsDataset;
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
     * Success
     */
    public ListInvoiceAttachmentsResponse withAttachmentsDataset(io.codat.accounting.models.components.AttachmentsDataset attachmentsDataset) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        this.attachmentsDataset = Optional.ofNullable(attachmentsDataset);
        return this;
    }
    
    /**
     * Success
     */
    public ListInvoiceAttachmentsResponse withAttachmentsDataset(Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        this.attachmentsDataset = attachmentsDataset;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListInvoiceAttachmentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public ListInvoiceAttachmentsResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public ListInvoiceAttachmentsResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListInvoiceAttachmentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListInvoiceAttachmentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListInvoiceAttachmentsResponse other = (ListInvoiceAttachmentsResponse) o;
        return 
            java.util.Objects.deepEquals(this.attachmentsDataset, other.attachmentsDataset) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachmentsDataset,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListInvoiceAttachmentsResponse.class,
                "attachmentsDataset", attachmentsDataset,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder attachmentsDataset(io.codat.accounting.models.components.AttachmentsDataset attachmentsDataset) {
            Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
            this.attachmentsDataset = Optional.ofNullable(attachmentsDataset);
            return this;
        }
        
        /**
         * Success
         */
        public Builder attachmentsDataset(Optional<? extends io.codat.accounting.models.components.AttachmentsDataset> attachmentsDataset) {
            Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
            this.attachmentsDataset = attachmentsDataset;
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
        
        public ListInvoiceAttachmentsResponse build() {
            return new ListInvoiceAttachmentsResponse(
                attachmentsDataset,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

