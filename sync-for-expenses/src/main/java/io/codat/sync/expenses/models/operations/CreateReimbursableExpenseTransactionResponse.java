/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateReimbursableExpenseTransactionResponse implements io.codat.sync.expenses.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateReimbursableExpenseTransactionResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse,
            Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createReimbursableExpenseResponse, "createReimbursableExpenseResponse");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createReimbursableExpenseResponse = createReimbursableExpenseResponse;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse() {
        return createReimbursableExpenseResponse;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateReimbursableExpenseTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public CreateReimbursableExpenseTransactionResponse withCreateReimbursableExpenseResponse(io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse createReimbursableExpenseResponse) {
        Utils.checkNotNull(createReimbursableExpenseResponse, "createReimbursableExpenseResponse");
        this.createReimbursableExpenseResponse = Optional.ofNullable(createReimbursableExpenseResponse);
        return this;
    }

    /**
     * OK
     */
    public CreateReimbursableExpenseTransactionResponse withCreateReimbursableExpenseResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse) {
        Utils.checkNotNull(createReimbursableExpenseResponse, "createReimbursableExpenseResponse");
        this.createReimbursableExpenseResponse = createReimbursableExpenseResponse;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateReimbursableExpenseTransactionResponse withErrorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * The request made is not valid.
     */
    public CreateReimbursableExpenseTransactionResponse withErrorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateReimbursableExpenseTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateReimbursableExpenseTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateReimbursableExpenseTransactionResponse other = (CreateReimbursableExpenseTransactionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createReimbursableExpenseResponse, other.createReimbursableExpenseResponse) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createReimbursableExpenseResponse,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateReimbursableExpenseTransactionResponse.class,
                "contentType", contentType,
                "createReimbursableExpenseResponse", createReimbursableExpenseResponse,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse = Optional.empty();
 
        private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage = Optional.empty();
 
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
         * OK
         */
        public Builder createReimbursableExpenseResponse(io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse createReimbursableExpenseResponse) {
            Utils.checkNotNull(createReimbursableExpenseResponse, "createReimbursableExpenseResponse");
            this.createReimbursableExpenseResponse = Optional.ofNullable(createReimbursableExpenseResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder createReimbursableExpenseResponse(Optional<? extends io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse> createReimbursableExpenseResponse) {
            Utils.checkNotNull(createReimbursableExpenseResponse, "createReimbursableExpenseResponse");
            this.createReimbursableExpenseResponse = createReimbursableExpenseResponse;
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
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
        
        public CreateReimbursableExpenseTransactionResponse build() {
            return new CreateReimbursableExpenseTransactionResponse(
                contentType,
                createReimbursableExpenseResponse,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

