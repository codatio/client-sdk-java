/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.BankingTransactionCategory;
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


public class GetBankingTransactionCategoryResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends BankingTransactionCategory> bankingTransactionCategory;

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
    public GetBankingTransactionCategoryResponse(
            JsonNullable<? extends BankingTransactionCategory> bankingTransactionCategory,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bankingTransactionCategory = bankingTransactionCategory;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetBankingTransactionCategoryResponse(
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
    public JsonNullable<BankingTransactionCategory> bankingTransactionCategory() {
        return (JsonNullable<BankingTransactionCategory>) bankingTransactionCategory;
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
    public GetBankingTransactionCategoryResponse withBankingTransactionCategory(BankingTransactionCategory bankingTransactionCategory) {
        Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
        this.bankingTransactionCategory = JsonNullable.of(bankingTransactionCategory);
        return this;
    }

    /**
     * Success
     */
    public GetBankingTransactionCategoryResponse withBankingTransactionCategory(JsonNullable<? extends BankingTransactionCategory> bankingTransactionCategory) {
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
            Objects.deepEquals(this.bankingTransactionCategory, other.bankingTransactionCategory) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankingTransactionCategory,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankingTransactionCategoryResponse.class,
                "bankingTransactionCategory", bankingTransactionCategory,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends BankingTransactionCategory> bankingTransactionCategory = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder bankingTransactionCategory(BankingTransactionCategory bankingTransactionCategory) {
            Utils.checkNotNull(bankingTransactionCategory, "bankingTransactionCategory");
            this.bankingTransactionCategory = JsonNullable.of(bankingTransactionCategory);
            return this;
        }

        /**
         * Success
         */
        public Builder bankingTransactionCategory(JsonNullable<? extends BankingTransactionCategory> bankingTransactionCategory) {
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
                statusCode,
                rawResponse);
        }
    }
}

