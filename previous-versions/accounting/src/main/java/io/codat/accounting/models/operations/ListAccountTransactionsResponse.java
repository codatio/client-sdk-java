/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.AccountTransactions;
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


public class ListAccountTransactionsResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends AccountTransactions> accountTransactions;

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

    @JsonCreator
    public ListAccountTransactionsResponse(
            Optional<? extends AccountTransactions> accountTransactions,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountTransactions, "accountTransactions");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountTransactions = accountTransactions;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListAccountTransactionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountTransactions> accountTransactions() {
        return (Optional<AccountTransactions>) accountTransactions;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Success
     */
    public ListAccountTransactionsResponse withAccountTransactions(AccountTransactions accountTransactions) {
        Utils.checkNotNull(accountTransactions, "accountTransactions");
        this.accountTransactions = Optional.ofNullable(accountTransactions);
        return this;
    }

    /**
     * Success
     */
    public ListAccountTransactionsResponse withAccountTransactions(Optional<? extends AccountTransactions> accountTransactions) {
        Utils.checkNotNull(accountTransactions, "accountTransactions");
        this.accountTransactions = accountTransactions;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAccountTransactionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAccountTransactionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAccountTransactionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListAccountTransactionsResponse other = (ListAccountTransactionsResponse) o;
        return 
            Objects.deepEquals(this.accountTransactions, other.accountTransactions) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountTransactions,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountTransactionsResponse.class,
                "accountTransactions", accountTransactions,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends AccountTransactions> accountTransactions = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountTransactions(AccountTransactions accountTransactions) {
            Utils.checkNotNull(accountTransactions, "accountTransactions");
            this.accountTransactions = Optional.ofNullable(accountTransactions);
            return this;
        }

        /**
         * Success
         */
        public Builder accountTransactions(Optional<? extends AccountTransactions> accountTransactions) {
            Utils.checkNotNull(accountTransactions, "accountTransactions");
            this.accountTransactions = accountTransactions;
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
        
        public ListAccountTransactionsResponse build() {
            return new ListAccountTransactionsResponse(
                accountTransactions,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

