/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListDataIntegrityDetailsResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails;

    /**
     * Your `query` parameter was not correctly formed
     */
    private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListDataIntegrityDetailsResponse(
            String contentType,
            Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails,
            Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(dataIntegrityDetails, "dataIntegrityDetails");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.dataIntegrityDetails = dataIntegrityDetails;
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
    public Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails() {
        return dataIntegrityDetails;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage() {
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
    public ListDataIntegrityDetailsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public ListDataIntegrityDetailsResponse withDataIntegrityDetails(io.codat.lending.models.shared.DataIntegrityDetails dataIntegrityDetails) {
        Utils.checkNotNull(dataIntegrityDetails, "dataIntegrityDetails");
        this.dataIntegrityDetails = Optional.ofNullable(dataIntegrityDetails);
        return this;
    }
    
    /**
     * OK
     */
    public ListDataIntegrityDetailsResponse withDataIntegrityDetails(Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails) {
        Utils.checkNotNull(dataIntegrityDetails, "dataIntegrityDetails");
        this.dataIntegrityDetails = dataIntegrityDetails;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListDataIntegrityDetailsResponse withErrorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your `query` parameter was not correctly formed
     */
    public ListDataIntegrityDetailsResponse withErrorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListDataIntegrityDetailsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListDataIntegrityDetailsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListDataIntegrityDetailsResponse other = (ListDataIntegrityDetailsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.dataIntegrityDetails, other.dataIntegrityDetails) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            dataIntegrityDetails,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDataIntegrityDetailsResponse.class,
                "contentType", contentType,
                "dataIntegrityDetails", dataIntegrityDetails,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails = Optional.empty();
 
        private Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
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
        public Builder dataIntegrityDetails(io.codat.lending.models.shared.DataIntegrityDetails dataIntegrityDetails) {
            Utils.checkNotNull(dataIntegrityDetails, "dataIntegrityDetails");
            this.dataIntegrityDetails = Optional.ofNullable(dataIntegrityDetails);
            return this;
        }
        
        /**
         * OK
         */
        public Builder dataIntegrityDetails(Optional<? extends io.codat.lending.models.shared.DataIntegrityDetails> dataIntegrityDetails) {
            Utils.checkNotNull(dataIntegrityDetails, "dataIntegrityDetails");
            this.dataIntegrityDetails = dataIntegrityDetails;
            return this;
        }

        /**
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(io.codat.lending.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(Optional<? extends io.codat.lending.models.shared.ErrorMessage> errorMessage) {
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
        
        public ListDataIntegrityDetailsResponse build() {
            return new ListDataIntegrityDetailsResponse(
                contentType,
                dataIntegrityDetails,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

