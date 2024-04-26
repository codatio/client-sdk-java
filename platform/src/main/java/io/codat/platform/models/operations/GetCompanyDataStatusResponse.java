/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetCompanyDataStatusResponse implements io.codat.platform.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetCompanyDataStatusResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(dataStatuses, "dataStatuses");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.dataStatuses = dataStatuses;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetCompanyDataStatusResponse(
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
    @JsonIgnore
    public Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses() {
        return dataStatuses;
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
    public GetCompanyDataStatusResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetCompanyDataStatusResponse withDataStatuses(io.codat.platform.models.shared.DataStatuses dataStatuses) {
        Utils.checkNotNull(dataStatuses, "dataStatuses");
        this.dataStatuses = Optional.ofNullable(dataStatuses);
        return this;
    }

    /**
     * OK
     */
    public GetCompanyDataStatusResponse withDataStatuses(Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses) {
        Utils.checkNotNull(dataStatuses, "dataStatuses");
        this.dataStatuses = dataStatuses;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCompanyDataStatusResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCompanyDataStatusResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCompanyDataStatusResponse other = (GetCompanyDataStatusResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.dataStatuses, other.dataStatuses) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            dataStatuses,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompanyDataStatusResponse.class,
                "contentType", contentType,
                "dataStatuses", dataStatuses,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses = Optional.empty();
 
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
        public Builder dataStatuses(io.codat.platform.models.shared.DataStatuses dataStatuses) {
            Utils.checkNotNull(dataStatuses, "dataStatuses");
            this.dataStatuses = Optional.ofNullable(dataStatuses);
            return this;
        }

        /**
         * OK
         */
        public Builder dataStatuses(Optional<? extends io.codat.platform.models.shared.DataStatuses> dataStatuses) {
            Utils.checkNotNull(dataStatuses, "dataStatuses");
            this.dataStatuses = dataStatuses;
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
        
        public GetCompanyDataStatusResponse build() {
            return new GetCompanyDataStatusResponse(
                contentType,
                dataStatuses,
                statusCode,
                rawResponse);
        }
    }
}

