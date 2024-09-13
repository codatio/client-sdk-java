/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.accounting.models.components.PushOption;
import io.codat.accounting.utils.Response;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GetCreateDirectCostsModelResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends PushOption> pushOption;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetCreateDirectCostsModelResponse(
            String contentType,
            Optional<? extends PushOption> pushOption,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(pushOption, "pushOption");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.pushOption = pushOption;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetCreateDirectCostsModelResponse(
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
    public Optional<PushOption> pushOption() {
        return (Optional<PushOption>) pushOption;
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
    public GetCreateDirectCostsModelResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetCreateDirectCostsModelResponse withPushOption(PushOption pushOption) {
        Utils.checkNotNull(pushOption, "pushOption");
        this.pushOption = Optional.ofNullable(pushOption);
        return this;
    }

    /**
     * OK
     */
    public GetCreateDirectCostsModelResponse withPushOption(Optional<? extends PushOption> pushOption) {
        Utils.checkNotNull(pushOption, "pushOption");
        this.pushOption = pushOption;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCreateDirectCostsModelResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCreateDirectCostsModelResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetCreateDirectCostsModelResponse other = (GetCreateDirectCostsModelResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.pushOption, other.pushOption) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            pushOption,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateDirectCostsModelResponse.class,
                "contentType", contentType,
                "pushOption", pushOption,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PushOption> pushOption = Optional.empty();
 
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
        public Builder pushOption(PushOption pushOption) {
            Utils.checkNotNull(pushOption, "pushOption");
            this.pushOption = Optional.ofNullable(pushOption);
            return this;
        }

        /**
         * OK
         */
        public Builder pushOption(Optional<? extends PushOption> pushOption) {
            Utils.checkNotNull(pushOption, "pushOption");
            this.pushOption = pushOption;
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
        
        public GetCreateDirectCostsModelResponse build() {
            return new GetCreateDirectCostsModelResponse(
                contentType,
                pushOption,
                statusCode,
                rawResponse);
        }
    }
}

