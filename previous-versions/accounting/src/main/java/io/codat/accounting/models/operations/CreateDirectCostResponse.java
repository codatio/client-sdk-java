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


public class CreateDirectCostResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateDirectCostResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createDirectCostResponse, "createDirectCostResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createDirectCostResponse = createDirectCostResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateDirectCostResponse(
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
    public Optional<io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse() {
        return (Optional<io.codat.accounting.models.components.CreateDirectCostResponse>) createDirectCostResponse;
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
    public CreateDirectCostResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateDirectCostResponse withCreateDirectCostResponse(io.codat.accounting.models.components.CreateDirectCostResponse createDirectCostResponse) {
        Utils.checkNotNull(createDirectCostResponse, "createDirectCostResponse");
        this.createDirectCostResponse = Optional.ofNullable(createDirectCostResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateDirectCostResponse withCreateDirectCostResponse(Optional<? extends io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse) {
        Utils.checkNotNull(createDirectCostResponse, "createDirectCostResponse");
        this.createDirectCostResponse = createDirectCostResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateDirectCostResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateDirectCostResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateDirectCostResponse other = (CreateDirectCostResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.createDirectCostResponse, other.createDirectCostResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            createDirectCostResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDirectCostResponse.class,
                "contentType", contentType,
                "createDirectCostResponse", createDirectCostResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse = Optional.empty();
 
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
        public Builder createDirectCostResponse(io.codat.accounting.models.components.CreateDirectCostResponse createDirectCostResponse) {
            Utils.checkNotNull(createDirectCostResponse, "createDirectCostResponse");
            this.createDirectCostResponse = Optional.ofNullable(createDirectCostResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder createDirectCostResponse(Optional<? extends io.codat.accounting.models.components.CreateDirectCostResponse> createDirectCostResponse) {
            Utils.checkNotNull(createDirectCostResponse, "createDirectCostResponse");
            this.createDirectCostResponse = createDirectCostResponse;
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
        
        public CreateDirectCostResponse build() {
            return new CreateDirectCostResponse(
                contentType,
                createDirectCostResponse,
                statusCode,
                rawResponse);
        }
    }
}

