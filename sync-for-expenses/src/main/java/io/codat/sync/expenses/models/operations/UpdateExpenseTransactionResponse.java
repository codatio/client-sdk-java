/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.UpdateExpenseResponse;
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


public class UpdateExpenseTransactionResponse implements Response {

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

    /**
     * Accepted
     */
    private Optional<? extends UpdateExpenseResponse> updateExpenseResponse;

    @JsonCreator
    public UpdateExpenseTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdateExpenseResponse> updateExpenseResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateExpenseResponse, "updateExpenseResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateExpenseResponse = updateExpenseResponse;
    }
    
    public UpdateExpenseTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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

    /**
     * Accepted
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateExpenseResponse> updateExpenseResponse() {
        return (Optional<UpdateExpenseResponse>) updateExpenseResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateExpenseTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateExpenseTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateExpenseTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Accepted
     */
    public UpdateExpenseTransactionResponse withUpdateExpenseResponse(UpdateExpenseResponse updateExpenseResponse) {
        Utils.checkNotNull(updateExpenseResponse, "updateExpenseResponse");
        this.updateExpenseResponse = Optional.ofNullable(updateExpenseResponse);
        return this;
    }

    /**
     * Accepted
     */
    public UpdateExpenseTransactionResponse withUpdateExpenseResponse(Optional<? extends UpdateExpenseResponse> updateExpenseResponse) {
        Utils.checkNotNull(updateExpenseResponse, "updateExpenseResponse");
        this.updateExpenseResponse = updateExpenseResponse;
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
        UpdateExpenseTransactionResponse other = (UpdateExpenseTransactionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updateExpenseResponse, other.updateExpenseResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateExpenseResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateExpenseTransactionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateExpenseResponse", updateExpenseResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UpdateExpenseResponse> updateExpenseResponse = Optional.empty();  
        
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

        /**
         * Accepted
         */
        public Builder updateExpenseResponse(UpdateExpenseResponse updateExpenseResponse) {
            Utils.checkNotNull(updateExpenseResponse, "updateExpenseResponse");
            this.updateExpenseResponse = Optional.ofNullable(updateExpenseResponse);
            return this;
        }

        /**
         * Accepted
         */
        public Builder updateExpenseResponse(Optional<? extends UpdateExpenseResponse> updateExpenseResponse) {
            Utils.checkNotNull(updateExpenseResponse, "updateExpenseResponse");
            this.updateExpenseResponse = updateExpenseResponse;
            return this;
        }
        
        public UpdateExpenseTransactionResponse build() {
            return new UpdateExpenseTransactionResponse(
                contentType,
                statusCode,
                rawResponse,
                updateExpenseResponse);
        }
    }
}

