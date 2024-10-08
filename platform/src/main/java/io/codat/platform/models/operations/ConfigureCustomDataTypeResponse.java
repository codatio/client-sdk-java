/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.platform.models.shared.CustomDataTypeConfiguration;
import io.codat.platform.utils.Response;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class ConfigureCustomDataTypeResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ConfigureCustomDataTypeResponse(
            String contentType,
            Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.customDataTypeConfiguration = customDataTypeConfiguration;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ConfigureCustomDataTypeResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomDataTypeConfiguration> customDataTypeConfiguration() {
        return (Optional<CustomDataTypeConfiguration>) customDataTypeConfiguration;
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
     * HTTP response content type for this operation
     */
    public ConfigureCustomDataTypeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public ConfigureCustomDataTypeResponse withCustomDataTypeConfiguration(CustomDataTypeConfiguration customDataTypeConfiguration) {
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        this.customDataTypeConfiguration = Optional.ofNullable(customDataTypeConfiguration);
        return this;
    }

    /**
     * OK
     */
    public ConfigureCustomDataTypeResponse withCustomDataTypeConfiguration(Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration) {
        Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
        this.customDataTypeConfiguration = customDataTypeConfiguration;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ConfigureCustomDataTypeResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ConfigureCustomDataTypeResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ConfigureCustomDataTypeResponse other = (ConfigureCustomDataTypeResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.customDataTypeConfiguration, other.customDataTypeConfiguration) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            customDataTypeConfiguration,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigureCustomDataTypeResponse.class,
                "contentType", contentType,
                "customDataTypeConfiguration", customDataTypeConfiguration,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
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
         * OK
         */
        public Builder customDataTypeConfiguration(CustomDataTypeConfiguration customDataTypeConfiguration) {
            Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
            this.customDataTypeConfiguration = Optional.ofNullable(customDataTypeConfiguration);
            return this;
        }

        /**
         * OK
         */
        public Builder customDataTypeConfiguration(Optional<? extends CustomDataTypeConfiguration> customDataTypeConfiguration) {
            Utils.checkNotNull(customDataTypeConfiguration, "customDataTypeConfiguration");
            this.customDataTypeConfiguration = customDataTypeConfiguration;
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
        
        public ConfigureCustomDataTypeResponse build() {
            return new ConfigureCustomDataTypeResponse(
                contentType,
                customDataTypeConfiguration,
                statusCode,
                rawResponse);
        }
    }
}

