/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingAccountTransaction;
import io.codat.lending.utils.Response;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetAccountingAccountTransactionResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingAccountTransaction> accountingAccountTransaction;

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
    public GetAccountingAccountTransactionResponse(
            JsonNullable<? extends AccountingAccountTransaction> accountingAccountTransaction,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingAccountTransaction, "accountingAccountTransaction");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingAccountTransaction = accountingAccountTransaction;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingAccountTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(JsonNullable.undefined(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AccountingAccountTransaction> accountingAccountTransaction() {
        return (JsonNullable<AccountingAccountTransaction>) accountingAccountTransaction;
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
    public GetAccountingAccountTransactionResponse withAccountingAccountTransaction(AccountingAccountTransaction accountingAccountTransaction) {
        Utils.checkNotNull(accountingAccountTransaction, "accountingAccountTransaction");
        this.accountingAccountTransaction = JsonNullable.of(accountingAccountTransaction);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingAccountTransactionResponse withAccountingAccountTransaction(JsonNullable<? extends AccountingAccountTransaction> accountingAccountTransaction) {
        Utils.checkNotNull(accountingAccountTransaction, "accountingAccountTransaction");
        this.accountingAccountTransaction = accountingAccountTransaction;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingAccountTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingAccountTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingAccountTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingAccountTransactionResponse other = (GetAccountingAccountTransactionResponse) o;
        return 
            Objects.deepEquals(this.accountingAccountTransaction, other.accountingAccountTransaction) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingAccountTransaction,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingAccountTransactionResponse.class,
                "accountingAccountTransaction", accountingAccountTransaction,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingAccountTransaction> accountingAccountTransaction = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingAccountTransaction(AccountingAccountTransaction accountingAccountTransaction) {
            Utils.checkNotNull(accountingAccountTransaction, "accountingAccountTransaction");
            this.accountingAccountTransaction = JsonNullable.of(accountingAccountTransaction);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingAccountTransaction(JsonNullable<? extends AccountingAccountTransaction> accountingAccountTransaction) {
            Utils.checkNotNull(accountingAccountTransaction, "accountingAccountTransaction");
            this.accountingAccountTransaction = accountingAccountTransaction;
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
        
        public GetAccountingAccountTransactionResponse build() {
            return new GetAccountingAccountTransactionResponse(
                accountingAccountTransaction,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

