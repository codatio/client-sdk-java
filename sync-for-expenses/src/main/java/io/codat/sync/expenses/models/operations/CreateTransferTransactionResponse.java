/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.TransferTransactionResponse;
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


public class CreateTransferTransactionResponse implements Response {

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
     * OK
     */
    private Optional<? extends TransferTransactionResponse> transferTransactionResponse;

    @JsonCreator
    public CreateTransferTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TransferTransactionResponse> transferTransactionResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(transferTransactionResponse, "transferTransactionResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.transferTransactionResponse = transferTransactionResponse;
    }
    
    public CreateTransferTransactionResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferTransactionResponse> transferTransactionResponse() {
        return (Optional<TransferTransactionResponse>) transferTransactionResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateTransferTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateTransferTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateTransferTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public CreateTransferTransactionResponse withTransferTransactionResponse(TransferTransactionResponse transferTransactionResponse) {
        Utils.checkNotNull(transferTransactionResponse, "transferTransactionResponse");
        this.transferTransactionResponse = Optional.ofNullable(transferTransactionResponse);
        return this;
    }

    /**
     * OK
     */
    public CreateTransferTransactionResponse withTransferTransactionResponse(Optional<? extends TransferTransactionResponse> transferTransactionResponse) {
        Utils.checkNotNull(transferTransactionResponse, "transferTransactionResponse");
        this.transferTransactionResponse = transferTransactionResponse;
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
        CreateTransferTransactionResponse other = (CreateTransferTransactionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.transferTransactionResponse, other.transferTransactionResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            transferTransactionResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferTransactionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "transferTransactionResponse", transferTransactionResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TransferTransactionResponse> transferTransactionResponse = Optional.empty();  
        
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
         * OK
         */
        public Builder transferTransactionResponse(TransferTransactionResponse transferTransactionResponse) {
            Utils.checkNotNull(transferTransactionResponse, "transferTransactionResponse");
            this.transferTransactionResponse = Optional.ofNullable(transferTransactionResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder transferTransactionResponse(Optional<? extends TransferTransactionResponse> transferTransactionResponse) {
            Utils.checkNotNull(transferTransactionResponse, "transferTransactionResponse");
            this.transferTransactionResponse = transferTransactionResponse;
            return this;
        }
        
        public CreateTransferTransactionResponse build() {
            return new CreateTransferTransactionResponse(
                contentType,
                statusCode,
                rawResponse,
                transferTransactionResponse);
        }
    }
}

