/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class UpdateConnectionAuthorizationResponse {

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.Connection> connection;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your API request was not properly authorized.
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

    public UpdateConnectionAuthorizationResponse(
            Optional<? extends io.codat.platform.models.shared.Connection> connection,
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(connection, "connection");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.connection = connection;
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.Connection> connection() {
        return connection;
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
     * OK
     */
    public UpdateConnectionAuthorizationResponse withConnection(io.codat.platform.models.shared.Connection connection) {
        Utils.checkNotNull(connection, "connection");
        this.connection = Optional.ofNullable(connection);
        return this;
    }
    
    /**
     * OK
     */
    public UpdateConnectionAuthorizationResponse withConnection(Optional<? extends io.codat.platform.models.shared.Connection> connection) {
        Utils.checkNotNull(connection, "connection");
        this.connection = connection;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateConnectionAuthorizationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public UpdateConnectionAuthorizationResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your API request was not properly authorized.
     */
    public UpdateConnectionAuthorizationResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateConnectionAuthorizationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateConnectionAuthorizationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateConnectionAuthorizationResponse other = (UpdateConnectionAuthorizationResponse) o;
        return 
            java.util.Objects.deepEquals(this.connection, other.connection) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connection,
            contentType,
            errorMessage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateConnectionAuthorizationResponse.class,
                "connection", connection,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.codat.platform.models.shared.Connection> connection = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder connection(io.codat.platform.models.shared.Connection connection) {
            Utils.checkNotNull(connection, "connection");
            this.connection = Optional.ofNullable(connection);
            return this;
        }
        
        /**
         * OK
         */
        public Builder connection(Optional<? extends io.codat.platform.models.shared.Connection> connection) {
            Utils.checkNotNull(connection, "connection");
            this.connection = connection;
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
         * Your API request was not properly authorized.
         */
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your API request was not properly authorized.
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
        
        public UpdateConnectionAuthorizationResponse build() {
            return new UpdateConnectionAuthorizationResponse(
                connection,
                contentType,
                errorMessage,
                statusCode,
                rawResponse);
        }
    }
}

