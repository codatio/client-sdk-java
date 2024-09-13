/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * ClientRateLimitResetWebhook - Webhook request body for a client that has had their rate limit reset.
 */

public class ClientRateLimitResetWebhook {

    /**
     * Unique identifier of the webhook event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("AlertId")
    private Optional<String> alertId;

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ClientId")
    private Optional<String> clientId;

    /**
     * Name of your client in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ClientName")
    private Optional<String> clientName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Data")
    private Optional<? extends ClientRateLimitResetWebhookData> data;

    /**
     * A human-readable message about the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Message")
    private Optional<String> message;

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleId")
    @Deprecated
    private Optional<String> ruleId;

    /**
     * The type of rule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleType")
    private Optional<String> ruleType;

    @JsonCreator
    public ClientRateLimitResetWebhook(
            @JsonProperty("AlertId") Optional<String> alertId,
            @JsonProperty("ClientId") Optional<String> clientId,
            @JsonProperty("ClientName") Optional<String> clientName,
            @JsonProperty("Data") Optional<? extends ClientRateLimitResetWebhookData> data,
            @JsonProperty("Message") Optional<String> message,
            @JsonProperty("RuleId") Optional<String> ruleId,
            @JsonProperty("RuleType") Optional<String> ruleType) {
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
    
    public ClientRateLimitResetWebhook() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier of the webhook event.
     */
    @JsonIgnore
    public Optional<String> alertId() {
        return alertId;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * Name of your client in Codat.
     */
    @JsonIgnore
    public Optional<String> clientName() {
        return clientName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ClientRateLimitResetWebhookData> data() {
        return (Optional<ClientRateLimitResetWebhookData>) data;
    }

    /**
     * A human-readable message about the webhook.
     */
    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public Optional<String> ruleId() {
        return ruleId;
    }

    /**
     * The type of rule.
     */
    @JsonIgnore
    public Optional<String> ruleType() {
        return ruleType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the webhook event.
     */
    public ClientRateLimitResetWebhook withAlertId(String alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = Optional.ofNullable(alertId);
        return this;
    }

    /**
     * Unique identifier of the webhook event.
     */
    public ClientRateLimitResetWebhook withAlertId(Optional<String> alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = alertId;
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public ClientRateLimitResetWebhook withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public ClientRateLimitResetWebhook withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public ClientRateLimitResetWebhook withClientName(String clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = Optional.ofNullable(clientName);
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public ClientRateLimitResetWebhook withClientName(Optional<String> clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = clientName;
        return this;
    }

    public ClientRateLimitResetWebhook withData(ClientRateLimitResetWebhookData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ClientRateLimitResetWebhook withData(Optional<? extends ClientRateLimitResetWebhookData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public ClientRateLimitResetWebhook withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public ClientRateLimitResetWebhook withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ClientRateLimitResetWebhook withRuleId(String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = Optional.ofNullable(ruleId);
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ClientRateLimitResetWebhook withRuleId(Optional<String> ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = ruleId;
        return this;
    }

    /**
     * The type of rule.
     */
    public ClientRateLimitResetWebhook withRuleType(String ruleType) {
        Utils.checkNotNull(ruleType, "ruleType");
        this.ruleType = Optional.ofNullable(ruleType);
        return this;
    }

    /**
     * The type of rule.
     */
    public ClientRateLimitResetWebhook withRuleType(Optional<String> ruleType) {
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
        ClientRateLimitResetWebhook other = (ClientRateLimitResetWebhook) o;
        return 
            Objects.deepEquals(this.alertId, other.alertId) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientName, other.clientName) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.ruleId, other.ruleId) &&
            Objects.deepEquals(this.ruleType, other.ruleType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(ClientRateLimitResetWebhook.class,
                "alertId", alertId,
                "clientId", clientId,
                "clientName", clientName,
                "data", data,
                "message", message,
                "ruleId", ruleId,
                "ruleType", ruleType);
    }
    
    public final static class Builder {
 
        private Optional<String> alertId = Optional.empty();
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientName = Optional.empty();
 
        private Optional<? extends ClientRateLimitResetWebhookData> data = Optional.empty();
 
        private Optional<String> message = Optional.empty();
 
        @Deprecated
        private Optional<String> ruleId = Optional.empty();
 
        private Optional<String> ruleType = Optional.empty();  
        
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
        public Builder alertId(Optional<String> alertId) {
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
        public Builder clientId(Optional<String> clientId) {
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
        public Builder clientName(Optional<String> clientName) {
            Utils.checkNotNull(clientName, "clientName");
            this.clientName = clientName;
            return this;
        }

        public Builder data(ClientRateLimitResetWebhookData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends ClientRateLimitResetWebhookData> data) {
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
        public Builder message(Optional<String> message) {
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
        public Builder ruleId(Optional<String> ruleId) {
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
        public Builder ruleType(Optional<String> ruleType) {
            Utils.checkNotNull(ruleType, "ruleType");
            this.ruleType = ruleType;
            return this;
        }
        
        public ClientRateLimitResetWebhook build() {
            return new ClientRateLimitResetWebhook(
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

