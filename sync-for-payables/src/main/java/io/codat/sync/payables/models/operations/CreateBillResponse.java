/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payables.models.components.Bill;
import io.codat.sync.payables.utils.Response;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class CreateBillResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends Bill> bill;

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
    public CreateBillResponse(
            Optional<? extends Bill> bill,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bill, "bill");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bill = bill;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateBillResponse(
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
    public Optional<Bill> bill() {
        return (Optional<Bill>) bill;
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
    public CreateBillResponse withBill(Bill bill) {
        Utils.checkNotNull(bill, "bill");
        this.bill = Optional.ofNullable(bill);
        return this;
    }

    /**
     * Success
     */
    public CreateBillResponse withBill(Optional<? extends Bill> bill) {
        Utils.checkNotNull(bill, "bill");
        this.bill = bill;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateBillResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateBillResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateBillResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateBillResponse other = (CreateBillResponse) o;
        return 
            Objects.deepEquals(this.bill, other.bill) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bill,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBillResponse.class,
                "bill", bill,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends Bill> bill = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder bill(Bill bill) {
            Utils.checkNotNull(bill, "bill");
            this.bill = Optional.ofNullable(bill);
            return this;
        }

        /**
         * Success
         */
        public Builder bill(Optional<? extends Bill> bill) {
            Utils.checkNotNull(bill, "bill");
            this.bill = bill;
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
        
        public CreateBillResponse build() {
            return new CreateBillResponse(
                bill,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

