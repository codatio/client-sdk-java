/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import io.codat.bank_feeds.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class UpdateSourceAccountResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The request made is not valid.
     */
    private Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage;

    /**
     * Success
     */
    private Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public UpdateSourceAccountResponse(
            String contentType,
            Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage,
            Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.sourceAccount = sourceAccount;
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
     * The request made is not valid.
     */
    public Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage() {
        return errorMessage;
    }

    /**
     * Success
     */
    public Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount() {
        return sourceAccount;
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
    public UpdateSourceAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The request made is not valid.
     */
    public UpdateSourceAccountResponse withErrorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * The request made is not valid.
     */
    public UpdateSourceAccountResponse withErrorMessage(Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Success
     */
    public UpdateSourceAccountResponse withSourceAccount(io.codat.bank_feeds.models.components.SourceAccount sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = Optional.ofNullable(sourceAccount);
        return this;
    }
    
    /**
     * Success
     */
    public UpdateSourceAccountResponse withSourceAccount(Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount) {
        Utils.checkNotNull(sourceAccount, "sourceAccount");
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateSourceAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateSourceAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        UpdateSourceAccountResponse other = (UpdateSourceAccountResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.sourceAccount, other.sourceAccount) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            sourceAccount,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSourceAccountResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "sourceAccount", sourceAccount,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage = Optional.empty();
 
        private Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount = Optional.empty();
 
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
         * The request made is not valid.
         */
        public Builder errorMessage(io.codat.bank_feeds.models.components.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * The request made is not valid.
         */
        public Builder errorMessage(Optional<? extends io.codat.bank_feeds.models.components.ErrorMessage> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Success
         */
        public Builder sourceAccount(io.codat.bank_feeds.models.components.SourceAccount sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = Optional.ofNullable(sourceAccount);
            return this;
        }
        
        /**
         * Success
         */
        public Builder sourceAccount(Optional<? extends io.codat.bank_feeds.models.components.SourceAccount> sourceAccount) {
            Utils.checkNotNull(sourceAccount, "sourceAccount");
            this.sourceAccount = sourceAccount;
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
        
        public UpdateSourceAccountResponse build() {
            return new UpdateSourceAccountResponse(
                contentType,
                errorMessage,
                sourceAccount,
                statusCode,
                rawResponse);
        }
    }
}

