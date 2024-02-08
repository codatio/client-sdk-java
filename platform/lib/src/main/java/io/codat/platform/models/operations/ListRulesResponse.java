/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListRulesResponse {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Your `query` parameter was not correctly formed
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

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks;

    public ListRulesResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(webhooks, "webhooks");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.webhooks = webhooks;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Your `query` parameter was not correctly formed
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

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks() {
        return webhooks;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListRulesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your `query` parameter was not correctly formed
     */
    public ListRulesResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }
    
    /**
     * Your `query` parameter was not correctly formed
     */
    public ListRulesResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListRulesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListRulesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public ListRulesResponse withWebhooks(io.codat.platform.models.shared.Webhooks webhooks) {
        Utils.checkNotNull(webhooks, "webhooks");
        this.webhooks = Optional.ofNullable(webhooks);
        return this;
    }
    
    /**
     * OK
     */
    public ListRulesResponse withWebhooks(Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks) {
        Utils.checkNotNull(webhooks, "webhooks");
        this.webhooks = webhooks;
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
        ListRulesResponse other = (ListRulesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.webhooks, other.webhooks);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            webhooks);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListRulesResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "webhooks", webhooks);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks = Optional.empty();  
        
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
         * Your `query` parameter was not correctly formed
         */
        public Builder errorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }
        
        /**
         * Your `query` parameter was not correctly formed
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

        /**
         * OK
         */
        public Builder webhooks(io.codat.platform.models.shared.Webhooks webhooks) {
            Utils.checkNotNull(webhooks, "webhooks");
            this.webhooks = Optional.ofNullable(webhooks);
            return this;
        }
        
        /**
         * OK
         */
        public Builder webhooks(Optional<? extends io.codat.platform.models.shared.Webhooks> webhooks) {
            Utils.checkNotNull(webhooks, "webhooks");
            this.webhooks = webhooks;
            return this;
        }        
        
        public ListRulesResponse build() {
            return new ListRulesResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                webhooks);
        }
    }
}
