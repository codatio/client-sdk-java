/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.utils.Response;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class CreateBankAccountResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateBankAccountResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createBankAccountResponse, "createBankAccountResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createBankAccountResponse = createBankAccountResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateBankAccountResponse(
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
    public Optional<io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse() {
        return (Optional<io.codat.sync.expenses.models.components.CreateBankAccountResponse>) createBankAccountResponse;
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
    public CreateBankAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Success
     */
    public CreateBankAccountResponse withCreateBankAccountResponse(io.codat.sync.expenses.models.components.CreateBankAccountResponse createBankAccountResponse) {
        Utils.checkNotNull(createBankAccountResponse, "createBankAccountResponse");
        this.createBankAccountResponse = Optional.ofNullable(createBankAccountResponse);
        return this;
    }

    /**
     * Success
     */
    public CreateBankAccountResponse withCreateBankAccountResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse) {
        Utils.checkNotNull(createBankAccountResponse, "createBankAccountResponse");
        this.createBankAccountResponse = createBankAccountResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateBankAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateBankAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateBankAccountResponse other = (CreateBankAccountResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.createBankAccountResponse, other.createBankAccountResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            createBankAccountResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountResponse.class,
                "contentType", contentType,
                "createBankAccountResponse", createBankAccountResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse = Optional.empty();
 
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
        public Builder createBankAccountResponse(io.codat.sync.expenses.models.components.CreateBankAccountResponse createBankAccountResponse) {
            Utils.checkNotNull(createBankAccountResponse, "createBankAccountResponse");
            this.createBankAccountResponse = Optional.ofNullable(createBankAccountResponse);
            return this;
        }

        /**
         * Success
         */
        public Builder createBankAccountResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateBankAccountResponse> createBankAccountResponse) {
            Utils.checkNotNull(createBankAccountResponse, "createBankAccountResponse");
            this.createBankAccountResponse = createBankAccountResponse;
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
        
        public CreateBankAccountResponse build() {
            return new CreateBankAccountResponse(
                contentType,
                createBankAccountResponse,
                statusCode,
                rawResponse);
        }
    }
}

