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


public class RefreshDataTypeResponse implements io.codat.platform.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public RefreshDataTypeResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(pullOperation, "pullOperation");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.pullOperation = pullOperation;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public RefreshDataTypeResponse(
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
    public Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation() {
        return pullOperation;
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
    public RefreshDataTypeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public RefreshDataTypeResponse withPullOperation(io.codat.platform.models.shared.PullOperation pullOperation) {
        Utils.checkNotNull(pullOperation, "pullOperation");
        this.pullOperation = Optional.ofNullable(pullOperation);
        return this;
    }

    /**
     * OK
     */
    public RefreshDataTypeResponse withPullOperation(Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation) {
        Utils.checkNotNull(pullOperation, "pullOperation");
        this.pullOperation = pullOperation;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RefreshDataTypeResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RefreshDataTypeResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        RefreshDataTypeResponse other = (RefreshDataTypeResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.pullOperation, other.pullOperation) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            pullOperation,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshDataTypeResponse.class,
                "contentType", contentType,
                "pullOperation", pullOperation,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation = Optional.empty();
 
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
        public Builder pullOperation(io.codat.platform.models.shared.PullOperation pullOperation) {
            Utils.checkNotNull(pullOperation, "pullOperation");
            this.pullOperation = Optional.ofNullable(pullOperation);
            return this;
        }

        /**
         * OK
         */
        public Builder pullOperation(Optional<? extends io.codat.platform.models.shared.PullOperation> pullOperation) {
            Utils.checkNotNull(pullOperation, "pullOperation");
            this.pullOperation = pullOperation;
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
        
        public RefreshDataTypeResponse build() {
            return new RefreshDataTypeResponse(
                contentType,
                pullOperation,
                statusCode,
                rawResponse);
        }
    }
}

