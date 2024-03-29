/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListLoanTransactionsResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage;

    /**
     * OK
     */
    private Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListLoanTransactionsResponse(
            String contentType,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(loanTransactions, "loanTransactions");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.loanTransactions = loanTransactions;
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
     * The request made is not valid.
     */
    public Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions() {
        return loanTransactions;
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
    public ListLoanTransactionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public ListLoanTransactionsResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public ListLoanTransactionsResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * OK
     */
    public ListLoanTransactionsResponse withLoanTransactions(io.codat.lending.models.shared.LoanTransactions loanTransactions) {
        Utils.checkNotNull(loanTransactions, "loanTransactions");
        this.loanTransactions = Optional.ofNullable(loanTransactions);
        return this;
    }
    
    /**
     * OK
     */
    public ListLoanTransactionsResponse withLoanTransactions(Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions) {
        Utils.checkNotNull(loanTransactions, "loanTransactions");
        this.loanTransactions = loanTransactions;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListLoanTransactionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListLoanTransactionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListLoanTransactionsResponse other = (ListLoanTransactionsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.loanTransactions, other.loanTransactions) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            loanTransactions,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListLoanTransactionsResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "loanTransactions", loanTransactions,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions = Optional.empty();
 
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
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * OK
         */
        public Builder loanTransactions(io.codat.lending.models.shared.LoanTransactions loanTransactions) {
            Utils.checkNotNull(loanTransactions, "loanTransactions");
            this.loanTransactions = Optional.ofNullable(loanTransactions);
            return this;
        }
        
        /**
         * OK
         */
        public Builder loanTransactions(Optional<? extends io.codat.lending.models.shared.LoanTransactions> loanTransactions) {
            Utils.checkNotNull(loanTransactions, "loanTransactions");
            this.loanTransactions = loanTransactions;
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
        
        public ListLoanTransactionsResponse build() {
            return new ListLoanTransactionsResponse(
                contentType,
                errorMessage,
                loanTransactions,
                statusCode,
                rawResponse);
        }
    }
}

