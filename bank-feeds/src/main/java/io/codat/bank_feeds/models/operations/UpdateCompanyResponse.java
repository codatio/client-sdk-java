/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class UpdateCompanyResponse {

    /**
     * OK
     */
    private Optional<? extends io.codat.bank_feeds.models.components.Company> company;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
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

    public UpdateCompanyResponse(
            Optional<? extends io.codat.bank_feeds.models.components.Company> company,
            String contentType,
            Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(company, "company");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.company = company;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.bank_feeds.models.components.Company> company() {
        return company;
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
    public UpdateCompanyResponse withCompany(io.codat.bank_feeds.models.components.Company company) {
        Utils.checkNotNull(company, "company");
        this.company = Optional.ofNullable(company);
        return this;
    }
    
    /**
     * OK
     */
    public UpdateCompanyResponse withCompany(Optional<? extends io.codat.bank_feeds.models.components.Company> company) {
        Utils.checkNotNull(company, "company");
        this.company = company;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateCompanyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public UpdateCompanyResponse withErrorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public UpdateCompanyResponse withErrorMessage(Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateCompanyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateCompanyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateCompanyResponse other = (UpdateCompanyResponse) o;
        return 
            java.util.Objects.deepEquals(this.company, other.company) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            company,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCompanyResponse.class,
                "company", company,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.bank_feeds.models.components.Company> company = Optional.empty();
 
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
        public Builder company(io.codat.bank_feeds.models.components.Company company) {
            Utils.checkNotNull(company, "company");
            this.company = Optional.ofNullable(company);
            return this;
        }
        
        /**
         * OK
         */
        public Builder company(Optional<? extends io.codat.bank_feeds.models.components.Company> company) {
            Utils.checkNotNull(company, "company");
            this.company = company;
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
        public Builder errorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
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
        
        public UpdateCompanyResponse build() {
            return new UpdateCompanyResponse(
                company,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}
