/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetTaxRateResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Success
     */
    private JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate;

    public GetTaxRateResponse(
            String contentType,
            Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(taxRate, "taxRate");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.taxRate = taxRate;
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
    public Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage() {
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

    /**
     * Success
     */
    public JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate() {
        return taxRate;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetTaxRateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetTaxRateResponse withErrorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetTaxRateResponse withErrorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetTaxRateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetTaxRateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public GetTaxRateResponse withTaxRate(io.codat.accounting.models.components.TaxRate taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = JsonNullable.of(taxRate);
        return this;
    }

    /**
     * Success
     */
    public GetTaxRateResponse withTaxRate(JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
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
        GetTaxRateResponse other = (GetTaxRateResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.taxRate, other.taxRate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            taxRate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTaxRateResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "taxRate", taxRate);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate = JsonNullable.undefined();  
        
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
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.accounting.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.accounting.models.components.ErrorMessage> errorMessage) {
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

        /**
         * Success
         */
        public Builder taxRate(io.codat.accounting.models.components.TaxRate taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = JsonNullable.of(taxRate);
            return this;
        }

        /**
         * Success
         */
        public Builder taxRate(JsonNullable<? extends io.codat.accounting.models.components.TaxRate> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = taxRate;
            return this;
        }
        
        public GetTaxRateResponse build() {
            return new GetTaxRateResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                taxRate);
        }
    }
}

