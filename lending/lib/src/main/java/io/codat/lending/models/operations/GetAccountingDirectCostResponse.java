/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetAccountingDirectCostResponse {

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost;

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

    public GetAccountingDirectCostResponse(
            JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost,
            String contentType,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountingDirectCost, "accountingDirectCost");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountingDirectCost = accountingDirectCost;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost() {
        return accountingDirectCost;
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
    public GetAccountingDirectCostResponse withAccountingDirectCost(io.codat.lending.models.shared.AccountingDirectCost accountingDirectCost) {
        Utils.checkNotNull(accountingDirectCost, "accountingDirectCost");
        this.accountingDirectCost = JsonNullable.of(accountingDirectCost);
        return this;
    }

    /**
     * Success
     */
    public GetAccountingDirectCostResponse withAccountingDirectCost(JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost) {
        Utils.checkNotNull(accountingDirectCost, "accountingDirectCost");
        this.accountingDirectCost = accountingDirectCost;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAccountingDirectCostResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetAccountingDirectCostResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetAccountingDirectCostResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAccountingDirectCostResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAccountingDirectCostResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAccountingDirectCostResponse other = (GetAccountingDirectCostResponse) o;
        return 
            java.util.Objects.deepEquals(this.accountingDirectCost, other.accountingDirectCost) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountingDirectCost,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingDirectCostResponse.class,
                "accountingDirectCost", accountingDirectCost,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost = JsonNullable.undefined();
 
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
        public Builder accountingDirectCost(io.codat.lending.models.shared.AccountingDirectCost accountingDirectCost) {
            Utils.checkNotNull(accountingDirectCost, "accountingDirectCost");
            this.accountingDirectCost = JsonNullable.of(accountingDirectCost);
            return this;
        }

        /**
         * Success
         */
        public Builder accountingDirectCost(JsonNullable<? extends io.codat.lending.models.shared.AccountingDirectCost> accountingDirectCost) {
            Utils.checkNotNull(accountingDirectCost, "accountingDirectCost");
            this.accountingDirectCost = accountingDirectCost;
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
        
        public GetAccountingDirectCostResponse build() {
            return new GetAccountingDirectCostResponse(
                accountingDirectCost,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

