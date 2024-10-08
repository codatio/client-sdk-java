/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.payables.models.components.BillMappingOptions;
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


public class GetMappingOptionsBillsResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends BillMappingOptions> billMappingOptions;

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
    public GetMappingOptionsBillsResponse(
            Optional<? extends BillMappingOptions> billMappingOptions,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(billMappingOptions, "billMappingOptions");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.billMappingOptions = billMappingOptions;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetMappingOptionsBillsResponse(
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
    public Optional<BillMappingOptions> billMappingOptions() {
        return (Optional<BillMappingOptions>) billMappingOptions;
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
    public GetMappingOptionsBillsResponse withBillMappingOptions(BillMappingOptions billMappingOptions) {
        Utils.checkNotNull(billMappingOptions, "billMappingOptions");
        this.billMappingOptions = Optional.ofNullable(billMappingOptions);
        return this;
    }

    /**
     * Success
     */
    public GetMappingOptionsBillsResponse withBillMappingOptions(Optional<? extends BillMappingOptions> billMappingOptions) {
        Utils.checkNotNull(billMappingOptions, "billMappingOptions");
        this.billMappingOptions = billMappingOptions;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetMappingOptionsBillsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetMappingOptionsBillsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetMappingOptionsBillsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetMappingOptionsBillsResponse other = (GetMappingOptionsBillsResponse) o;
        return 
            Objects.deepEquals(this.billMappingOptions, other.billMappingOptions) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            billMappingOptions,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMappingOptionsBillsResponse.class,
                "billMappingOptions", billMappingOptions,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends BillMappingOptions> billMappingOptions = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder billMappingOptions(BillMappingOptions billMappingOptions) {
            Utils.checkNotNull(billMappingOptions, "billMappingOptions");
            this.billMappingOptions = Optional.ofNullable(billMappingOptions);
            return this;
        }

        /**
         * Success
         */
        public Builder billMappingOptions(Optional<? extends BillMappingOptions> billMappingOptions) {
            Utils.checkNotNull(billMappingOptions, "billMappingOptions");
            this.billMappingOptions = billMappingOptions;
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
        
        public GetMappingOptionsBillsResponse build() {
            return new GetMappingOptionsBillsResponse(
                billMappingOptions,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

