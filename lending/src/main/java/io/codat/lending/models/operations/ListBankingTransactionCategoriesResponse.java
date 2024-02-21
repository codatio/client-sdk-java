/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListBankingTransactionCategoriesResponse {

    /**
     * Success
     */
    private Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
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

    public ListBankingTransactionCategoriesResponse(
            Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories,
            String contentType,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bankingTransactionCategories, "bankingTransactionCategories");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bankingTransactionCategories = bankingTransactionCategories;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories() {
        return bankingTransactionCategories;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Your `query` parameter was not correctly formed
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
    public ListBankingTransactionCategoriesResponse withBankingTransactionCategories(io.codat.lending.models.shared.BankingTransactionCategories bankingTransactionCategories) {
        Utils.checkNotNull(bankingTransactionCategories, "bankingTransactionCategories");
        this.bankingTransactionCategories = Optional.ofNullable(bankingTransactionCategories);
        return this;
    }
    
    /**
     * Success
     */
    public ListBankingTransactionCategoriesResponse withBankingTransactionCategories(Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories) {
        Utils.checkNotNull(bankingTransactionCategories, "bankingTransactionCategories");
        this.bankingTransactionCategories = bankingTransactionCategories;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListBankingTransactionCategoriesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListBankingTransactionCategoriesResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your `query` parameter was not correctly formed
     */
    public ListBankingTransactionCategoriesResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListBankingTransactionCategoriesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListBankingTransactionCategoriesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListBankingTransactionCategoriesResponse other = (ListBankingTransactionCategoriesResponse) o;
        return 
            java.util.Objects.deepEquals(this.bankingTransactionCategories, other.bankingTransactionCategories) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankingTransactionCategories,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListBankingTransactionCategoriesResponse.class,
                "bankingTransactionCategories", bankingTransactionCategories,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories = Optional.empty();
 
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
        public Builder bankingTransactionCategories(io.codat.lending.models.shared.BankingTransactionCategories bankingTransactionCategories) {
            Utils.checkNotNull(bankingTransactionCategories, "bankingTransactionCategories");
            this.bankingTransactionCategories = Optional.ofNullable(bankingTransactionCategories);
            return this;
        }
        
        /**
         * Success
         */
        public Builder bankingTransactionCategories(Optional<? extends io.codat.lending.models.shared.BankingTransactionCategories> bankingTransactionCategories) {
            Utils.checkNotNull(bankingTransactionCategories, "bankingTransactionCategories");
            this.bankingTransactionCategories = bankingTransactionCategories;
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
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your `query` parameter was not correctly formed
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
        
        public ListBankingTransactionCategoriesResponse build() {
            return new ListBankingTransactionCategoriesResponse(
                bankingTransactionCategories,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}
