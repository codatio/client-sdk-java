/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class RefreshDataTypeResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
     */
    private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage;

    /**
     * OK
     */
    private Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public RefreshDataTypeResponse(
            String contentType,
            Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage,
            Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(pullOperation, "pullOperation");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.pullOperation = pullOperation;
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
     * Your API request was not properly authorized.
     */
    public Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation() {
        return pullOperation;
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
    public RefreshDataTypeResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public RefreshDataTypeResponse withErrorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public RefreshDataTypeResponse withErrorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * OK
     */
    public RefreshDataTypeResponse withPullOperation(io.codat.sync.expenses.models.components.PullOperation pullOperation) {
        Utils.checkNotNull(pullOperation, "pullOperation");
        this.pullOperation = Optional.ofNullable(pullOperation);
        return this;
    }
    
    /**
     * OK
     */
    public RefreshDataTypeResponse withPullOperation(Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation) {
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
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.pullOperation, other.pullOperation) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            pullOperation,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RefreshDataTypeResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "pullOperation", pullOperation,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation = Optional.empty();
 
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
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.sync.expenses.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(Optional<? extends io.codat.sync.expenses.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * OK
         */
        public Builder pullOperation(io.codat.sync.expenses.models.components.PullOperation pullOperation) {
            Utils.checkNotNull(pullOperation, "pullOperation");
            this.pullOperation = Optional.ofNullable(pullOperation);
            return this;
        }
        
        /**
         * OK
         */
        public Builder pullOperation(Optional<? extends io.codat.sync.expenses.models.components.PullOperation> pullOperation) {
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
                errorMessage,
                pullOperation,
                statusCode,
                rawResponse);
        }
    }
}

