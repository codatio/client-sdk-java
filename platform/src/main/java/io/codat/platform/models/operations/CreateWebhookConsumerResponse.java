/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateWebhookConsumerResponse {

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

    /**
     * OK
     */
    private Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer;

    public CreateWebhookConsumerResponse(
            String contentType,
            Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(webhookConsumer, "webhookConsumer");
        this.contentType = contentType;
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.webhookConsumer = webhookConsumer;
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

    /**
     * OK
     */
    public Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer() {
        return webhookConsumer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateWebhookConsumerResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public CreateWebhookConsumerResponse withErrorMessage(io.codat.platform.models.shared.ErrorMessage errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    /**
     * Your API request was not properly authorized.
     */
    public CreateWebhookConsumerResponse withErrorMessage(Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateWebhookConsumerResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateWebhookConsumerResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public CreateWebhookConsumerResponse withWebhookConsumer(io.codat.platform.models.shared.WebhookConsumer webhookConsumer) {
        Utils.checkNotNull(webhookConsumer, "webhookConsumer");
        this.webhookConsumer = Optional.ofNullable(webhookConsumer);
        return this;
    }

    /**
     * OK
     */
    public CreateWebhookConsumerResponse withWebhookConsumer(Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer) {
        Utils.checkNotNull(webhookConsumer, "webhookConsumer");
        this.webhookConsumer = webhookConsumer;
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
        CreateWebhookConsumerResponse other = (CreateWebhookConsumerResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.webhookConsumer, other.webhookConsumer);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorMessage,
            statusCode,
            rawResponse,
            webhookConsumer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWebhookConsumerResponse.class,
                "contentType", contentType,
                "errorMessage", errorMessage,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "webhookConsumer", webhookConsumer);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.codat.platform.models.shared.ErrorMessage> errorMessage = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer = Optional.empty();  
        
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

        /**
         * OK
         */
        public Builder webhookConsumer(io.codat.platform.models.shared.WebhookConsumer webhookConsumer) {
            Utils.checkNotNull(webhookConsumer, "webhookConsumer");
            this.webhookConsumer = Optional.ofNullable(webhookConsumer);
            return this;
        }

        /**
         * OK
         */
        public Builder webhookConsumer(Optional<? extends io.codat.platform.models.shared.WebhookConsumer> webhookConsumer) {
            Utils.checkNotNull(webhookConsumer, "webhookConsumer");
            this.webhookConsumer = webhookConsumer;
            return this;
        }
        
        public CreateWebhookConsumerResponse build() {
            return new CreateWebhookConsumerResponse(
                contentType,
                errorMessage,
                statusCode,
                rawResponse,
                webhookConsumer);
        }
    }
}

