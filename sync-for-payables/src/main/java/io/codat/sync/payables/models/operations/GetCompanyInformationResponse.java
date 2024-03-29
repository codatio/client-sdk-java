/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payables.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetCompanyInformationResponse implements io.codat.sync.payables.utils.Response {

    /**
     * Success
     */
    private Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetCompanyInformationResponse(
            Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation,
            String contentType,
            Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(companyInformation, "companyInformation");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.companyInformation = companyInformation;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation() {
        return companyInformation;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage() {
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
    public GetCompanyInformationResponse withCompanyInformation(io.codat.sync.payables.models.components.CompanyInformation companyInformation) {
        Utils.checkNotNull(companyInformation, "companyInformation");
        this.companyInformation = Optional.ofNullable(companyInformation);
        return this;
    }

    /**
     * Success
     */
    public GetCompanyInformationResponse withCompanyInformation(Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation) {
        Utils.checkNotNull(companyInformation, "companyInformation");
        this.companyInformation = companyInformation;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCompanyInformationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public GetCompanyInformationResponse withErrorMessage(io.codat.sync.payables.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * The request made is not valid.
     */
    public GetCompanyInformationResponse withErrorMessage(Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCompanyInformationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCompanyInformationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCompanyInformationResponse other = (GetCompanyInformationResponse) o;
        return 
            java.util.Objects.deepEquals(this.companyInformation, other.companyInformation) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyInformation,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompanyInformationResponse.class,
                "companyInformation", companyInformation,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder companyInformation(io.codat.sync.payables.models.components.CompanyInformation companyInformation) {
            Utils.checkNotNull(companyInformation, "companyInformation");
            this.companyInformation = Optional.ofNullable(companyInformation);
            return this;
        }

        /**
         * Success
         */
        public Builder companyInformation(Optional<? extends io.codat.sync.payables.models.components.CompanyInformation> companyInformation) {
            Utils.checkNotNull(companyInformation, "companyInformation");
            this.companyInformation = companyInformation;
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
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.sync.payables.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.payables.models.components.ErrorMessage> errorMessage) {
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
        
        public GetCompanyInformationResponse build() {
            return new GetCompanyInformationResponse(
                companyInformation,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

