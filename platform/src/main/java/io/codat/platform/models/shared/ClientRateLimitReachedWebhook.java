/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * ClientRateLimitReachedWebhook - Webhook request body for a client that has reached their rate limit.
 */

public class ClientRateLimitReachedWebhook {

    /**
     * Unique identifier of the webhook event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("AlertId")
    private Optional<? extends String> alertId;

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ClientId")
    private Optional<? extends String> clientId;

    /**
     * Name of your client in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ClientName")
    private Optional<? extends String> clientName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Data")
    private Optional<? extends ClientRateLimitReachedWebhookData> data;

    /**
     * A human-readable message about the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Message")
    private Optional<? extends String> message;

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleId")
    @Deprecated
    private Optional<? extends String> ruleId;

    /**
     * The type of rule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleType")
    private Optional<? extends String> ruleType;

    @JsonCreator
    public ClientRateLimitReachedWebhook(
            @JsonProperty("AlertId") Optional<? extends String> alertId,
            @JsonProperty("ClientId") Optional<? extends String> clientId,
            @JsonProperty("ClientName") Optional<? extends String> clientName,
            @JsonProperty("Data") Optional<? extends ClientRateLimitReachedWebhookData> data,
            @JsonProperty("Message") Optional<? extends String> message,
            @JsonProperty("RuleId") Optional<? extends String> ruleId,
            @JsonProperty("RuleType") Optional<? extends String> ruleType) {
        Utils.checkNotNull(alertId, "alertId");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientName, "clientName");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(ruleId, "ruleId");
        Utils.checkNotNull(ruleType, "ruleType");
        this.alertId = alertId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.data = data;
        this.message = message;
        this.ruleId = ruleId;
        this.ruleType = ruleType;
    }
    
    public ClientRateLimitReachedWebhook() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier of the webhook event.
     */
    @JsonIgnore
    public Optional<? extends String> alertId() {
        return alertId;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonIgnore
    public Optional<? extends String> clientId() {
        return clientId;
    }

    /**
     * Name of your client in Codat.
     */
    @JsonIgnore
    public Optional<? extends String> clientName() {
        return clientName;
    }

    @JsonIgnore
    public Optional<? extends ClientRateLimitReachedWebhookData> data() {
        return data;
    }

    /**
     * A human-readable message about the webhook.
     */
    @JsonIgnore
    public Optional<? extends String> message() {
        return message;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public Optional<? extends String> ruleId() {
        return ruleId;
    }

    /**
     * The type of rule.
     */
    @JsonIgnore
    public Optional<? extends String> ruleType() {
        return ruleType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the webhook event.
     */
    public ClientRateLimitReachedWebhook withAlertId(String alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = Optional.ofNullable(alertId);
        return this;
    }

    /**
     * Unique identifier of the webhook event.
     */
    public ClientRateLimitReachedWebhook withAlertId(Optional<? extends String> alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = alertId;
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public ClientRateLimitReachedWebhook withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public ClientRateLimitReachedWebhook withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public ClientRateLimitReachedWebhook withClientName(String clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = Optional.ofNullable(clientName);
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public ClientRateLimitReachedWebhook withClientName(Optional<? extends String> clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = clientName;
        return this;
    }

    public ClientRateLimitReachedWebhook withData(ClientRateLimitReachedWebhookData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ClientRateLimitReachedWebhook withData(Optional<? extends ClientRateLimitReachedWebhookData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public ClientRateLimitReachedWebhook withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public ClientRateLimitReachedWebhook withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ClientRateLimitReachedWebhook withRuleId(String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = Optional.ofNullable(ruleId);
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ClientRateLimitReachedWebhook withRuleId(Optional<? extends String> ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = ruleId;
        return this;
    }

    /**
     * The type of rule.
     */
    public ClientRateLimitReachedWebhook withRuleType(String ruleType) {
        Utils.checkNotNull(ruleType, "ruleType");
        this.ruleType = Optional.ofNullable(ruleType);
        return this;
    }

    /**
     * The type of rule.
     */
    public ClientRateLimitReachedWebhook withRuleType(Optional<? extends String> ruleType) {
        Utils.checkNotNull(ruleType, "ruleType");
        this.ruleType = ruleType;
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
        ClientRateLimitReachedWebhook other = (ClientRateLimitReachedWebhook) o;
        return 
            java.util.Objects.deepEquals(this.alertId, other.alertId) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientName, other.clientName) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.ruleId, other.ruleId) &&
            java.util.Objects.deepEquals(this.ruleType, other.ruleType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            alertId,
            clientId,
            clientName,
            data,
            message,
            ruleId,
            ruleType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ClientRateLimitReachedWebhook.class,
                "alertId", alertId,
                "clientId", clientId,
                "clientName", clientName,
                "data", data,
                "message", message,
                "ruleId", ruleId,
                "ruleType", ruleType);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> alertId = Optional.empty();
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientName = Optional.empty();
 
        private Optional<? extends ClientRateLimitReachedWebhookData> data = Optional.empty();
 
        private Optional<? extends String> message = Optional.empty();
 
        @Deprecated
        private Optional<? extends String> ruleId = Optional.empty();
 
        private Optional<? extends String> ruleType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the webhook event.
         */
        public Builder alertId(String alertId) {
            Utils.checkNotNull(alertId, "alertId");
            this.alertId = Optional.ofNullable(alertId);
            return this;
        }

        /**
         * Unique identifier of the webhook event.
         */
        public Builder alertId(Optional<? extends String> alertId) {
            Utils.checkNotNull(alertId, "alertId");
            this.alertId = alertId;
            return this;
        }

        /**
         * Unique identifier for your client in Codat.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * Unique identifier for your client in Codat.
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Name of your client in Codat.
         */
        public Builder clientName(String clientName) {
            Utils.checkNotNull(clientName, "clientName");
            this.clientName = Optional.ofNullable(clientName);
            return this;
        }

        /**
         * Name of your client in Codat.
         */
        public Builder clientName(Optional<? extends String> clientName) {
            Utils.checkNotNull(clientName, "clientName");
            this.clientName = clientName;
            return this;
        }

        public Builder data(ClientRateLimitReachedWebhookData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends ClientRateLimitReachedWebhookData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * A human-readable message about the webhook.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * A human-readable message about the webhook.
         */
        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Unique identifier for the rule.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder ruleId(String ruleId) {
            Utils.checkNotNull(ruleId, "ruleId");
            this.ruleId = Optional.ofNullable(ruleId);
            return this;
        }

        /**
         * Unique identifier for the rule.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder ruleId(Optional<? extends String> ruleId) {
            Utils.checkNotNull(ruleId, "ruleId");
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The type of rule.
         */
        public Builder ruleType(String ruleType) {
            Utils.checkNotNull(ruleType, "ruleType");
            this.ruleType = Optional.ofNullable(ruleType);
            return this;
        }

        /**
         * The type of rule.
         */
        public Builder ruleType(Optional<? extends String> ruleType) {
            Utils.checkNotNull(ruleType, "ruleType");
            this.ruleType = ruleType;
            return this;
        }
        
        public ClientRateLimitReachedWebhook build() {
            return new ClientRateLimitReachedWebhook(
                alertId,
                clientId,
                clientName,
                data,
                message,
                ruleId,
                ruleType);
        }
    }
}

