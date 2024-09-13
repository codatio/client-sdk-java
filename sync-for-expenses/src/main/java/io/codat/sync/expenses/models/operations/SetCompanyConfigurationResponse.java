/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.expenses.models.components.CompanyConfiguration;
import io.codat.sync.expenses.utils.Response;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class SetCompanyConfigurationResponse implements Response {

    /**
     * Success
     */
    private Optional<? extends CompanyConfiguration> companyConfiguration;

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
    public SetCompanyConfigurationResponse(
            Optional<? extends CompanyConfiguration> companyConfiguration,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(companyConfiguration, "companyConfiguration");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.companyConfiguration = companyConfiguration;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public SetCompanyConfigurationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyConfiguration> companyConfiguration() {
        return (Optional<CompanyConfiguration>) companyConfiguration;
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
    public SetCompanyConfigurationResponse withCompanyConfiguration(CompanyConfiguration companyConfiguration) {
        Utils.checkNotNull(companyConfiguration, "companyConfiguration");
        this.companyConfiguration = Optional.ofNullable(companyConfiguration);
        return this;
    }

    /**
     * Success
     */
    public SetCompanyConfigurationResponse withCompanyConfiguration(Optional<? extends CompanyConfiguration> companyConfiguration) {
        Utils.checkNotNull(companyConfiguration, "companyConfiguration");
        this.companyConfiguration = companyConfiguration;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public SetCompanyConfigurationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public SetCompanyConfigurationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public SetCompanyConfigurationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        SetCompanyConfigurationResponse other = (SetCompanyConfigurationResponse) o;
        return 
            Objects.deepEquals(this.companyConfiguration, other.companyConfiguration) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyConfiguration,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SetCompanyConfigurationResponse.class,
                "companyConfiguration", companyConfiguration,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompanyConfiguration> companyConfiguration = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Success
         */
        public Builder companyConfiguration(CompanyConfiguration companyConfiguration) {
            Utils.checkNotNull(companyConfiguration, "companyConfiguration");
            this.companyConfiguration = Optional.ofNullable(companyConfiguration);
            return this;
        }

        /**
         * Success
         */
        public Builder companyConfiguration(Optional<? extends CompanyConfiguration> companyConfiguration) {
            Utils.checkNotNull(companyConfiguration, "companyConfiguration");
            this.companyConfiguration = companyConfiguration;
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
        
        public SetCompanyConfigurationResponse build() {
            return new SetCompanyConfigurationResponse(
                companyConfiguration,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

