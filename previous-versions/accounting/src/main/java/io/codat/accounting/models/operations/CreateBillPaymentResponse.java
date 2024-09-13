/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class CreateBillPaymentResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateBillPaymentResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createBillPaymentResponse, "createBillPaymentResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createBillPaymentResponse = createBillPaymentResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateBillPaymentResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
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
    public Optional<io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse() {
        return (Optional<io.codat.accounting.models.components.CreateBillPaymentResponse>) createBillPaymentResponse;
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
    public CreateBillPaymentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateBillPaymentResponse withCreateBillPaymentResponse(io.codat.accounting.models.components.CreateBillPaymentResponse createBillPaymentResponse) {
        Utils.checkNotNull(createBillPaymentResponse, "createBillPaymentResponse");
        this.createBillPaymentResponse = Optional.ofNullable(createBillPaymentResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateBillPaymentResponse withCreateBillPaymentResponse(Optional<? extends io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse) {
        Utils.checkNotNull(createBillPaymentResponse, "createBillPaymentResponse");
        this.createBillPaymentResponse = createBillPaymentResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateBillPaymentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateBillPaymentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateBillPaymentResponse other = (CreateBillPaymentResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.createBillPaymentResponse, other.createBillPaymentResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            createBillPaymentResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBillPaymentResponse.class,
                "contentType", contentType,
                "createBillPaymentResponse", createBillPaymentResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse = Optional.empty();
 
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
        public Builder createBillPaymentResponse(io.codat.accounting.models.components.CreateBillPaymentResponse createBillPaymentResponse) {
            Utils.checkNotNull(createBillPaymentResponse, "createBillPaymentResponse");
            this.createBillPaymentResponse = Optional.ofNullable(createBillPaymentResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder createBillPaymentResponse(Optional<? extends io.codat.accounting.models.components.CreateBillPaymentResponse> createBillPaymentResponse) {
            Utils.checkNotNull(createBillPaymentResponse, "createBillPaymentResponse");
            this.createBillPaymentResponse = createBillPaymentResponse;
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
        
        public CreateBillPaymentResponse build() {
            return new CreateBillPaymentResponse(
                contentType,
                createBillPaymentResponse,
                statusCode,
                rawResponse);
        }
    }
}

