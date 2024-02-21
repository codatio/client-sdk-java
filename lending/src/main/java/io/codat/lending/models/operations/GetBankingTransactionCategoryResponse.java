/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetBankingTransactionCategoryResponse {

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetBankingTransactionCategoryResponse(
            JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory,
            String contentType,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bankingTransactionCategory = bankingTransactionCategory;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory() {
        return bankingTransactionCategory;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Your API request was not properly authorized.
     */
    public Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage() {
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
     * Success
     */
    public GetBankingTransactionCategoryResponse withBankingTransactionCategory(io.codat.lending.models.shared.BankingTransactionCategory bankingTransactionCategory) {
        Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
        this.bankingTransactionCategory = JsonNullable.of(bankingTransactionCategory);
        return this;
    }

    /**
     * Success
     */
    public GetBankingTransactionCategoryResponse withBankingTransactionCategory(JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory) {
        Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
        this.bankingTransactionCategory = bankingTransactionCategory;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetBankingTransactionCategoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetBankingTransactionCategoryResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetBankingTransactionCategoryResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetBankingTransactionCategoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBankingTransactionCategoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetBankingTransactionCategoryResponse other = (GetBankingTransactionCategoryResponse) o;
        return 
            java.util.Objects.deepEquals(this.bankingTransactionCategory, other.bankingTransactionCategory) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankingTransactionCategory,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankingTransactionCategoryResponse.class,
                "bankingTransactionCategory", bankingTransactionCategory,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory = JsonNullable.undefined();
 
        private String contentType;
 
        private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder bankingTransactionCategory(io.codat.lending.models.shared.BankingTransactionCategory bankingTransactionCategory) {
            Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
            this.bankingTransactionCategory = JsonNullable.of(bankingTransactionCategory);
            return this;
        }

        /**
         * Success
         */
        public Builder bankingTransactionCategory(JsonNullable<? extends io.codat.lending.models.shared.BankingTransactionCategory> bankingTransactionCategory) {
            Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
            this.bankingTransactionCategory = bankingTransactionCategory;
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
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
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
        
        public GetBankingTransactionCategoryResponse build() {
            return new GetBankingTransactionCategoryResponse(
                bankingTransactionCategory,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}
