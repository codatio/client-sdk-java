/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingInvoice;
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


public class GetAccountingInvoiceResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingInvoice> accountingInvoice;

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
    public GetAccountingInvoiceResponse(
            JsonNullable<? extends AccountingInvoice> accountingInvoice,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingInvoice, "accountingInvoice");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingInvoice = accountingInvoice;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingInvoiceResponse(
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
    public JsonNullable<AccountingInvoice> accountingInvoice() {
        return (JsonNullable<AccountingInvoice>) accountingInvoice;
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
    public GetAccountingInvoiceResponse withAccountingInvoice(AccountingInvoice accountingInvoice) {
        Utils.checkNotNull(accountingInvoice, "accountingInvoice");
        this.accountingInvoice = JsonNullable.of(accountingInvoice);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingInvoiceResponse withAccountingInvoice(JsonNullable<? extends AccountingInvoice> accountingInvoice) {
        Utils.checkNotNull(accountingInvoice, "accountingInvoice");
        this.accountingInvoice = accountingInvoice;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingInvoiceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingInvoiceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingInvoiceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingInvoiceResponse other = (GetAccountingInvoiceResponse) o;
        return 
            Objects.deepEquals(this.accountingInvoice, other.accountingInvoice) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingInvoice,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingInvoiceResponse.class,
                "accountingInvoice", accountingInvoice,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingInvoice> accountingInvoice = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingInvoice(AccountingInvoice accountingInvoice) {
            Utils.checkNotNull(accountingInvoice, "accountingInvoice");
            this.accountingInvoice = JsonNullable.of(accountingInvoice);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingInvoice(JsonNullable<? extends AccountingInvoice> accountingInvoice) {
            Utils.checkNotNull(accountingInvoice, "accountingInvoice");
            this.accountingInvoice = accountingInvoice;
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
        
        public GetAccountingInvoiceResponse build() {
            return new GetAccountingInvoiceResponse(
                accountingInvoice,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

