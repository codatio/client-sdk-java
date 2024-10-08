/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.ItemReceipt;
import io.codat.accounting.utils.Response;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetItemReceiptResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private JsonNullable<? extends ItemReceipt> itemReceipt;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetItemReceiptResponse(
            String contentType,
            JsonNullable<? extends ItemReceipt> itemReceipt,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(itemReceipt, "itemReceipt");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.itemReceipt = itemReceipt;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetItemReceiptResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, JsonNullable.undefined(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ItemReceipt> itemReceipt() {
        return (JsonNullable<ItemReceipt>) itemReceipt;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
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
     * Success
     */
    public GetItemReceiptResponse withItemReceipt(ItemReceipt itemReceipt) {
        Utils.checkNotNull(itemReceipt, "itemReceipt");
        this.itemReceipt = JsonNullable.of(itemReceipt);
        return this;
    }

    /**
     * Success
     */
    public GetItemReceiptResponse withItemReceipt(JsonNullable<? extends ItemReceipt> itemReceipt) {
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
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.itemReceipt, other.itemReceipt) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            itemReceipt,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetItemReceiptResponse.class,
                "contentType", contentType,
                "itemReceipt", itemReceipt,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private JsonNullable<? extends ItemReceipt> itemReceipt = JsonNullable.undefined();
 
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
        public Builder itemReceipt(ItemReceipt itemReceipt) {
            Utils.checkNotNull(itemReceipt, "itemReceipt");
            this.itemReceipt = JsonNullable.of(itemReceipt);
            return this;
        }

        /**
         * Success
         */
        public Builder itemReceipt(JsonNullable<? extends ItemReceipt> itemReceipt) {
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
                itemReceipt,
                statusCode,
                rawResponse);
        }
    }
}

