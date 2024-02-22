/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListCompaniesResponse {

    /**
     * OK
     */
    private Optional<? extends io.codat.bank_feeds.models.components.Companies> companies;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
     */
    private Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListCompaniesResponse(
            Optional<? extends io.codat.bank_feeds.models.components.Companies> companies,
            String contentType,
            Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(companies, "companies");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.companies = companies;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.bank_feeds.models.components.Companies> companies() {
        return companies;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage() {
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
    public ListCompaniesResponse withCompanies(io.codat.bank_feeds.models.components.Companies companies) {
        Utils.checkNotNull(companies, "companies");
        this.companies = Optional.ofNullable(companies);
        return this;
    }
    
    /**
     * OK
     */
    public ListCompaniesResponse withCompanies(Optional<? extends io.codat.bank_feeds.models.components.Companies> companies) {
        Utils.checkNotNull(companies, "companies");
        this.companies = companies;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListCompaniesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListCompaniesResponse withErrorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your `query` parameter was not correctly formed
     */
    public ListCompaniesResponse withErrorMessage(Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListCompaniesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListCompaniesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListCompaniesResponse other = (ListCompaniesResponse) o;
        return 
            java.util.Objects.deepEquals(this.companies, other.companies) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companies,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCompaniesResponse.class,
                "companies", companies,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.bank_feeds.models.components.Companies> companies = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder companies(io.codat.bank_feeds.models.components.Companies companies) {
            Utils.checkNotNull(companies, "companies");
            this.companies = Optional.ofNullable(companies);
            return this;
        }
        
        /**
         * OK
         */
        public Builder companies(Optional<? extends io.codat.bank_feeds.models.components.Companies> companies) {
            Utils.checkNotNull(companies, "companies");
            this.companies = companies;
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
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage) {
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
        
        public ListCompaniesResponse build() {
            return new ListCompaniesResponse(
                companies,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

