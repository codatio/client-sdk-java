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


public class CreateTransferResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateTransferResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createTransferResponse, "createTransferResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createTransferResponse = createTransferResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateTransferResponse(
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
    public Optional<io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse() {
        return (Optional<io.codat.accounting.models.components.CreateTransferResponse>) createTransferResponse;
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
    public CreateTransferResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateTransferResponse withCreateTransferResponse(io.codat.accounting.models.components.CreateTransferResponse createTransferResponse) {
        Utils.checkNotNull(createTransferResponse, "createTransferResponse");
        this.createTransferResponse = Optional.ofNullable(createTransferResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateTransferResponse withCreateTransferResponse(Optional<? extends io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse) {
        Utils.checkNotNull(createTransferResponse, "createTransferResponse");
        this.createTransferResponse = createTransferResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateTransferResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateTransferResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateTransferResponse other = (CreateTransferResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.createTransferResponse, other.createTransferResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            createTransferResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferResponse.class,
                "contentType", contentType,
                "createTransferResponse", createTransferResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse = Optional.empty();
 
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
        public Builder createTransferResponse(io.codat.accounting.models.components.CreateTransferResponse createTransferResponse) {
            Utils.checkNotNull(createTransferResponse, "createTransferResponse");
            this.createTransferResponse = Optional.ofNullable(createTransferResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder createTransferResponse(Optional<? extends io.codat.accounting.models.components.CreateTransferResponse> createTransferResponse) {
            Utils.checkNotNull(createTransferResponse, "createTransferResponse");
            this.createTransferResponse = createTransferResponse;
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
        
        public CreateTransferResponse build() {
            return new CreateTransferResponse(
                contentType,
                createTransferResponse,
                statusCode,
                rawResponse);
        }
    }
}

