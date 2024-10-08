/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.AccountingSupplier;
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


public class GetAccountingSupplierResponse implements Response {

    /**
     * Success
     */
    private JsonNullable<? extends AccountingSupplier> accountingSupplier;

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
    public GetAccountingSupplierResponse(
            JsonNullable<? extends AccountingSupplier> accountingSupplier,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingSupplier, "accountingSupplier");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingSupplier = accountingSupplier;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAccountingSupplierResponse(
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
    public JsonNullable<AccountingSupplier> accountingSupplier() {
        return (JsonNullable<AccountingSupplier>) accountingSupplier;
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
    public GetAccountingSupplierResponse withAccountingSupplier(AccountingSupplier accountingSupplier) {
        Utils.checkNotNull(accountingSupplier, "accountingSupplier");
        this.accountingSupplier = JsonNullable.of(accountingSupplier);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingSupplierResponse withAccountingSupplier(JsonNullable<? extends AccountingSupplier> accountingSupplier) {
        Utils.checkNotNull(accountingSupplier, "accountingSupplier");
        this.accountingSupplier = accountingSupplier;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingSupplierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingSupplierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingSupplierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingSupplierResponse other = (GetAccountingSupplierResponse) o;
        return 
            Objects.deepEquals(this.accountingSupplier, other.accountingSupplier) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountingSupplier,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingSupplierResponse.class,
                "accountingSupplier", accountingSupplier,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends AccountingSupplier> accountingSupplier = JsonNullable.undefined();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder accountingSupplier(AccountingSupplier accountingSupplier) {
            Utils.checkNotNull(accountingSupplier, "accountingSupplier");
            this.accountingSupplier = JsonNullable.of(accountingSupplier);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingSupplier(JsonNullable<? extends AccountingSupplier> accountingSupplier) {
            Utils.checkNotNull(accountingSupplier, "accountingSupplier");
            this.accountingSupplier = accountingSupplier;
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
        
        public GetAccountingSupplierResponse build() {
            return new GetAccountingSupplierResponse(
                accountingSupplier,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

