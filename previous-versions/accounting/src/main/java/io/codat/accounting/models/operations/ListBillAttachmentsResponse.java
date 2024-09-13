/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.AttachmentsDataset;
import io.codat.accounting.utils.Response;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class ListBillAttachmentsResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends AttachmentsDataset> attachmentsDataset;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListBillAttachmentsResponse(
            Optional<? extends AttachmentsDataset> attachmentsDataset,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.attachmentsDataset = attachmentsDataset;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListBillAttachmentsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttachmentsDataset> attachmentsDataset() {
        return (Optional<AttachmentsDataset>) attachmentsDataset;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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
     * Success
     */
    public ListBillAttachmentsResponse withAttachmentsDataset(AttachmentsDataset attachmentsDataset) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        this.attachmentsDataset = Optional.ofNullable(attachmentsDataset);
        return this;
    }

    /**
     * Success
     */
    public ListBillAttachmentsResponse withAttachmentsDataset(Optional<? extends AttachmentsDataset> attachmentsDataset) {
        Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
        this.attachmentsDataset = attachmentsDataset;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListBillAttachmentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListBillAttachmentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListBillAttachmentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListBillAttachmentsResponse other = (ListBillAttachmentsResponse) o;
        return 
            Objects.deepEquals(this.attachmentsDataset, other.attachmentsDataset) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attachmentsDataset,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListBillAttachmentsResponse.class,
                "attachmentsDataset", attachmentsDataset,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AttachmentsDataset> attachmentsDataset = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder attachmentsDataset(AttachmentsDataset attachmentsDataset) {
            Utils.checkNotNull(attachmentsDataset, "attachmentsDataset");
            this.attachmentsDataset = Optional.ofNullable(attachmentsDataset);
            return this;
        }

        /**
         * Success
         */
        public Builder attachmentsDataset(Optional<? extends AttachmentsDataset> attachmentsDataset) {
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
        
        public ListBillAttachmentsResponse build() {
            return new ListBillAttachmentsResponse(
                attachmentsDataset,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

