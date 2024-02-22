/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
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
    private Optional<? extends ClientRateLimitResetWebhookData> data;

    /**
     * A human readable message about the webhook.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Message")
    private Optional<? extends String> message;

    /**
     * Unique identifier for the rule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleId")
    private Optional<? extends String> ruleId;

    /**
     * The type of rule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RuleType")
    private Optional<? extends String> ruleType;

    public ClientRateLimitResetWebhook(
            @JsonProperty("AlertId") Optional<? extends String> alertId,
            @JsonProperty("ClientId") Optional<? extends String> clientId,
            @JsonProperty("ClientName") Optional<? extends String> clientName,
            @JsonProperty("Data") Optional<? extends ClientRateLimitResetWebhookData> data,
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

    /**
     * Unique identifier of the webhook event.
     */
    public Optional<? extends String> alertId() {
        return alertId;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public Optional<? extends String> clientId() {
        return clientId;
    }

    /**
     * Name of your client in Codat.
     */
    public Optional<? extends String> clientName() {
        return clientName;
    }

    public Optional<? extends ClientRateLimitResetWebhookData> data() {
        return data;
    }

    /**
     * A human readable message about the webhook.
     */
    public Optional<? extends String> message() {
        return message;
    }

    /**
     * Unique identifier for the rule.
     */
    public Optional<? extends String> ruleId() {
        return ruleId;
    }

    /**
     * The type of rule.
     */
    public Optional<? extends String> ruleType() {
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
    public ClientRateLimitResetWebhook withAlertId(Optional<? extends String> alertId) {
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
    public ClientRateLimitResetWebhook withClientId(Optional<? extends String> clientId) {
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
    public ClientRateLimitResetWebhook withClientName(Optional<? extends String> clientName) {
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
     * A human readable message about the webhook.
     */
    public ClientRateLimitResetWebhook withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }
    
    /**
     * A human readable message about the webhook.
     */
    public ClientRateLimitResetWebhook withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Unique identifier for the rule.
     */
    public ClientRateLimitResetWebhook withRuleId(String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = Optional.ofNullable(ruleId);
        return this;
    }
    
    /**
     * Unique identifier for the rule.
     */
    public ClientRateLimitResetWebhook withRuleId(Optional<? extends String> ruleId) {
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
    public ClientRateLimitResetWebhook withRuleType(Optional<? extends String> ruleType) {
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
 
        private Optional<? extends String> alertId = Optional.empty();
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientName = Optional.empty();
 
        private Optional<? extends ClientRateLimitResetWebhookData> data = Optional.empty();
 
        private Optional<? extends String> message = Optional.empty();
 
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
         * A human readable message about the webhook.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }
        
        /**
         * A human readable message about the webhook.
         */
        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Unique identifier for the rule.
         */
        public Builder ruleId(String ruleId) {
            Utils.checkNotNull(ruleId, "ruleId");
            this.ruleId = Optional.ofNullable(ruleId);
            return this;
        }
        
        /**
         * Unique identifier for the rule.
         */
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

