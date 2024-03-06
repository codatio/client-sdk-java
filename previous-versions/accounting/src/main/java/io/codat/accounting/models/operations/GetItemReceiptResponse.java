/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetItemReceiptResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage;

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetItemReceiptResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(itemReceipt, "itemReceipt");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.itemReceipt = itemReceipt;
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
     * Your API request was not properly authorized.
     */
    public Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt() {
        return itemReceipt;
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
    public GetItemReceiptResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetItemReceiptResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetItemReceiptResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Success
     */
    public GetItemReceiptResponse withItemReceipt(io.codat.accounting.models.components.ItemReceipt itemReceipt) {
        Utils.checkNotNull(itemReceipt, "itemReceipt");
        this.itemReceipt = JsonNullable.of(itemReceipt);
        return this;
    }

    /**
     * Success
     */
    public GetItemReceiptResponse withItemReceipt(JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt) {
        Utils.checkNotNull(itemReceipt, "itemReceipt");
        this.itemReceipt = itemReceipt;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetItemReceiptResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetItemReceiptResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetItemReceiptResponse other = (GetItemReceiptResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.itemReceipt, other.itemReceipt) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            itemReceipt,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetItemReceiptResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "itemReceipt", itemReceipt,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt = JsonNullable.undefined();
 
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
         * Success
         */
        public Builder itemReceipt(io.codat.accounting.models.components.ItemReceipt itemReceipt) {
            Utils.checkNotNull(itemReceipt, "itemReceipt");
            this.itemReceipt = JsonNullable.of(itemReceipt);
            return this;
        }

        /**
         * Success
         */
        public Builder itemReceipt(JsonNullable<? extends io.codat.accounting.models.components.ItemReceipt> itemReceipt) {
            Utils.checkNotNull(itemReceipt, "itemReceipt");
            this.itemReceipt = itemReceipt;
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
        
        public GetItemReceiptResponse build() {
            return new GetItemReceiptResponse(
                contentType,
                errorMessage,
                itemReceipt,
                statusCode,
                rawResponse);
        }
    }
}
