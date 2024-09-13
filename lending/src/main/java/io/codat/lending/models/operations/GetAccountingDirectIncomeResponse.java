/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingDirectIncome;
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


public class GetAccountingDirectIncomeResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingDirectIncome> accountingDirectIncome;

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
    public GetAccountingDirectIncomeResponse(
            JsonNullable<? extends AccountingDirectIncome> accountingDirectIncome,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingDirectIncome, "accountingDirectIncome");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingDirectIncome = accountingDirectIncome;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingDirectIncomeResponse(
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
    public JsonNullable<AccountingDirectIncome> accountingDirectIncome() {
        return (JsonNullable<AccountingDirectIncome>) accountingDirectIncome;
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
    public GetAccountingDirectIncomeResponse withAccountingDirectIncome(AccountingDirectIncome accountingDirectIncome) {
        Utils.checkNotNull(accountingDirectIncome, "accountingDirectIncome");
        this.accountingDirectIncome = JsonNullable.of(accountingDirectIncome);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingDirectIncomeResponse withAccountingDirectIncome(JsonNullable<? extends AccountingDirectIncome> accountingDirectIncome) {
        Utils.checkNotNull(accountingDirectIncome, "accountingDirectIncome");
        this.accountingDirectIncome = accountingDirectIncome;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingDirectIncomeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingDirectIncomeResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingDirectIncomeResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingDirectIncomeResponse other = (GetAccountingDirectIncomeResponse) o;
        return 
            Objects.deepEquals(this.accountingDirectIncome, other.accountingDirectIncome) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingDirectIncome,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingDirectIncomeResponse.class,
                "accountingDirectIncome", accountingDirectIncome,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingDirectIncome> accountingDirectIncome = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingDirectIncome(AccountingDirectIncome accountingDirectIncome) {
            Utils.checkNotNull(accountingDirectIncome, "accountingDirectIncome");
            this.accountingDirectIncome = JsonNullable.of(accountingDirectIncome);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingDirectIncome(JsonNullable<? extends AccountingDirectIncome> accountingDirectIncome) {
            Utils.checkNotNull(accountingDirectIncome, "accountingDirectIncome");
            this.accountingDirectIncome = accountingDirectIncome;
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
        
        public GetAccountingDirectIncomeResponse build() {
            return new GetAccountingDirectIncomeResponse(
                accountingDirectIncome,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

