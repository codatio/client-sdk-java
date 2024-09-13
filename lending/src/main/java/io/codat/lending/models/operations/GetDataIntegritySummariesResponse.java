/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.DataIntegritySummaries;
import io.codat.lending.utils.Response;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GetDataIntegritySummariesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends DataIntegritySummaries> dataIntegritySummaries;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetDataIntegritySummariesResponse(
            String contentType,
            Optional<? extends DataIntegritySummaries> dataIntegritySummaries,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(dataIntegritySummaries, "dataIntegritySummaries");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.dataIntegritySummaries = dataIntegritySummaries;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetDataIntegritySummariesResponse(
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
    public Optional<DataIntegritySummaries> dataIntegritySummaries() {
        return (Optional<DataIntegritySummaries>) dataIntegritySummaries;
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
    public GetDataIntegritySummariesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetDataIntegritySummariesResponse withDataIntegritySummaries(DataIntegritySummaries dataIntegritySummaries) {
        Utils.checkNotNull(dataIntegritySummaries, "dataIntegritySummaries");
        this.dataIntegritySummaries = Optional.ofNullable(dataIntegritySummaries);
        return this;
    }

    /**
     * OK
     */
    public GetDataIntegritySummariesResponse withDataIntegritySummaries(Optional<? extends DataIntegritySummaries> dataIntegritySummaries) {
        Utils.checkNotNull(dataIntegritySummaries, "dataIntegritySummaries");
        this.dataIntegritySummaries = dataIntegritySummaries;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetDataIntegritySummariesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetDataIntegritySummariesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetDataIntegritySummariesResponse other = (GetDataIntegritySummariesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.dataIntegritySummaries, other.dataIntegritySummaries) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            dataIntegritySummaries,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDataIntegritySummariesResponse.class,
                "contentType", contentType,
                "dataIntegritySummaries", dataIntegritySummaries,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends DataIntegritySummaries> dataIntegritySummaries = Optional.empty();
 
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
        public Builder dataIntegritySummaries(DataIntegritySummaries dataIntegritySummaries) {
            Utils.checkNotNull(dataIntegritySummaries, "dataIntegritySummaries");
            this.dataIntegritySummaries = Optional.ofNullable(dataIntegritySummaries);
            return this;
        }

        /**
         * OK
         */
        public Builder dataIntegritySummaries(Optional<? extends DataIntegritySummaries> dataIntegritySummaries) {
            Utils.checkNotNull(dataIntegritySummaries, "dataIntegritySummaries");
            this.dataIntegritySummaries = dataIntegritySummaries;
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
        
        public GetDataIntegritySummariesResponse build() {
            return new GetDataIntegritySummariesResponse(
                contentType,
                dataIntegritySummaries,
                statusCode,
                rawResponse);
        }
    }
}

