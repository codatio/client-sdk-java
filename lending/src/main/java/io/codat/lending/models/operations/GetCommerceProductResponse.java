/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetCommerceProductResponse {

    /**
     * OK
     */
    private Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct;

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

    public GetCommerceProductResponse(
            Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct,
            String contentType,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(commerceProduct, "commerceProduct");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.commerceProduct = commerceProduct;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct() {
        return commerceProduct;
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
     * OK
     */
    public GetCommerceProductResponse withCommerceProduct(io.codat.lending.models.shared.CommerceProduct commerceProduct) {
        Utils.checkNotNull(commerceProduct, "commerceProduct");
        this.commerceProduct = Optional.ofNullable(commerceProduct);
        return this;
    }
    
    /**
     * OK
     */
    public GetCommerceProductResponse withCommerceProduct(Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct) {
        Utils.checkNotNull(commerceProduct, "commerceProduct");
        this.commerceProduct = commerceProduct;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCommerceProductResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public GetCommerceProductResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public GetCommerceProductResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCommerceProductResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCommerceProductResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCommerceProductResponse other = (GetCommerceProductResponse) o;
        return 
            java.util.Objects.deepEquals(this.commerceProduct, other.commerceProduct) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            commerceProduct,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommerceProductResponse.class,
                "commerceProduct", commerceProduct,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder commerceProduct(io.codat.lending.models.shared.CommerceProduct commerceProduct) {
            Utils.checkNotNull(commerceProduct, "commerceProduct");
            this.commerceProduct = Optional.ofNullable(commerceProduct);
            return this;
        }
        
        /**
         * OK
         */
        public Builder commerceProduct(Optional<? extends io.codat.lending.models.shared.CommerceProduct> commerceProduct) {
            Utils.checkNotNull(commerceProduct, "commerceProduct");
            this.commerceProduct = commerceProduct;
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
        
        public GetCommerceProductResponse build() {
            return new GetCommerceProductResponse(
                commerceProduct,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

