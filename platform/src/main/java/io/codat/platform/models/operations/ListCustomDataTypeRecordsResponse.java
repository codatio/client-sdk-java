/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListCustomDataTypeRecordsResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListCustomDataTypeRecordsResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.customDataTypeRecords = customDataTypeRecords;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords() {
        return customDataTypeRecords;
    }

    /**
     * The request made is not valid.
     */
    public Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage() {
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
     * HTTP response content type for this operation
     */
    public ListCustomDataTypeRecordsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public ListCustomDataTypeRecordsResponse withCustomDataTypeRecords(io.codat.platform.models.shared.CustomDataTypeRecords customDataTypeRecords) {
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        this.customDataTypeRecords = Optional.ofNullable(customDataTypeRecords);
        return this;
    }
    
    /**
     * OK
     */
    public ListCustomDataTypeRecordsResponse withCustomDataTypeRecords(Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords) {
        Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
        this.customDataTypeRecords = customDataTypeRecords;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public ListCustomDataTypeRecordsResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public ListCustomDataTypeRecordsResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListCustomDataTypeRecordsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListCustomDataTypeRecordsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListCustomDataTypeRecordsResponse other = (ListCustomDataTypeRecordsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.customDataTypeRecords, other.customDataTypeRecords) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            customDataTypeRecords,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCustomDataTypeRecordsResponse.class,
                "contentType", contentType,
                "customDataTypeRecords", customDataTypeRecords,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords = Optional.empty();
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
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
        public Builder customDataTypeRecords(io.codat.platform.models.shared.CustomDataTypeRecords customDataTypeRecords) {
            Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
            this.customDataTypeRecords = Optional.ofNullable(customDataTypeRecords);
            return this;
        }
        
        /**
         * OK
         */
        public Builder customDataTypeRecords(Optional<? extends io.codat.platform.models.shared.CustomDataTypeRecords> customDataTypeRecords) {
            Utils.checkNotNull(customDataTypeRecords, "customDataTypeRecords");
            this.customDataTypeRecords = customDataTypeRecords;
            return this;
        }

        /**
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
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
        
        public ListCustomDataTypeRecordsResponse build() {
            return new ListCustomDataTypeRecordsResponse(
                contentType,
                customDataTypeRecords,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}
