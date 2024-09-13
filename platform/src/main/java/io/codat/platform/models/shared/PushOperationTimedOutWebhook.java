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
 * PushOperationTimedOutWebhook - Webhook request body notifying that a push push operation has timed out.
 */

public class PushOperationTimedOutWebhook {

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

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CompanyId")
    private Optional<String> companyId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Data")
    private Optional<? extends PushOperationTimedOutWebhookData> data;

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DataConnectionId")
    private Optional<String> dataConnectionId;

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
    public PushOperationTimedOutWebhook(
            @JsonProperty("AlertId") Optional<String> alertId,
            @JsonProperty("ClientId") Optional<String> clientId,
            @JsonProperty("ClientName") Optional<String> clientName,
            @JsonProperty("CompanyId") Optional<String> companyId,
            @JsonProperty("Data") Optional<? extends PushOperationTimedOutWebhookData> data,
            @JsonProperty("DataConnectionId") Optional<String> dataConnectionId,
            @JsonProperty("Message") Optional<String> message,
            @JsonProperty("RuleId") Optional<String> ruleId,
            @JsonProperty("RuleType") Optional<String> ruleType) {
        Utils.checkNotNull(alertId, "alertId");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientName, "clientName");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(dataConnectionId, "dataConnectionId");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(ruleId, "ruleId");
        Utils.checkNotNull(ruleType, "ruleType");
        this.alertId = alertId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.companyId = companyId;
        this.data = data;
        this.dataConnectionId = dataConnectionId;
        this.message = message;
        this.ruleId = ruleId;
        this.ruleType = ruleType;
    }
    
    public PushOperationTimedOutWebhook() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PushOperationTimedOutWebhookData> data() {
        return (Optional<PushOperationTimedOutWebhookData>) data;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    @JsonIgnore
    public Optional<String> dataConnectionId() {
        return dataConnectionId;
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
    public PushOperationTimedOutWebhook withAlertId(String alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = Optional.ofNullable(alertId);
        return this;
    }

    /**
     * Unique identifier of the webhook event.
     */
    public PushOperationTimedOutWebhook withAlertId(Optional<String> alertId) {
        Utils.checkNotNull(alertId, "alertId");
        this.alertId = alertId;
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public PushOperationTimedOutWebhook withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public PushOperationTimedOutWebhook withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public PushOperationTimedOutWebhook withClientName(String clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = Optional.ofNullable(clientName);
        return this;
    }

    /**
     * Name of your client in Codat.
     */
    public PushOperationTimedOutWebhook withClientName(Optional<String> clientName) {
        Utils.checkNotNull(clientName, "clientName");
        this.clientName = clientName;
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public PushOperationTimedOutWebhook withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public PushOperationTimedOutWebhook withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public PushOperationTimedOutWebhook withData(PushOperationTimedOutWebhookData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public PushOperationTimedOutWebhook withData(Optional<? extends PushOperationTimedOutWebhookData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public PushOperationTimedOutWebhook withDataConnectionId(String dataConnectionId) {
        Utils.checkNotNull(dataConnectionId, "dataConnectionId");
        this.dataConnectionId = Optional.ofNullable(dataConnectionId);
        return this;
    }

    /**
     * Unique identifier for a company's data connection.
     */
    public PushOperationTimedOutWebhook withDataConnectionId(Optional<String> dataConnectionId) {
        Utils.checkNotNull(dataConnectionId, "dataConnectionId");
        this.dataConnectionId = dataConnectionId;
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public PushOperationTimedOutWebhook withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A human-readable message about the webhook.
     */
    public PushOperationTimedOutWebhook withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public PushOperationTimedOutWebhook withRuleId(String ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = Optional.ofNullable(ruleId);
        return this;
    }

    /**
     * Unique identifier for the rule.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public PushOperationTimedOutWebhook withRuleId(Optional<String> ruleId) {
        Utils.checkNotNull(ruleId, "ruleId");
        this.ruleId = ruleId;
        return this;
    }

    /**
     * The type of rule.
     */
    public PushOperationTimedOutWebhook withRuleType(String ruleType) {
        Utils.checkNotNull(ruleType, "ruleType");
        this.ruleType = Optional.ofNullable(ruleType);
        return this;
    }

    /**
     * The type of rule.
     */
    public PushOperationTimedOutWebhook withRuleType(Optional<String> ruleType) {
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
        PushOperationTimedOutWebhook other = (PushOperationTimedOutWebhook) o;
        return 
            Objects.deepEquals(this.alertId, other.alertId) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientName, other.clientName) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.dataConnectionId, other.dataConnectionId) &&
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
            companyId,
            data,
            dataConnectionId,
            message,
            ruleId,
            ruleType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PushOperationTimedOutWebhook.class,
                "alertId", alertId,
                "clientId", clientId,
                "clientName", clientName,
                "companyId", companyId,
                "data", data,
                "dataConnectionId", dataConnectionId,
                "message", message,
                "ruleId", ruleId,
                "ruleType", ruleType);
    }
    
    public final static class Builder {
 
        private Optional<String> alertId = Optional.empty();
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientName = Optional.empty();
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<? extends PushOperationTimedOutWebhookData> data = Optional.empty();
 
        private Optional<String> dataConnectionId = Optional.empty();
 
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

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        /**
         * Unique identifier for your SMB in Codat.
         */
        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        public Builder data(PushOperationTimedOutWebhookData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends PushOperationTimedOutWebhookData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder dataConnectionId(String dataConnectionId) {
            Utils.checkNotNull(dataConnectionId, "dataConnectionId");
            this.dataConnectionId = Optional.ofNullable(dataConnectionId);
            return this;
        }

        /**
         * Unique identifier for a company's data connection.
         */
        public Builder dataConnectionId(Optional<String> dataConnectionId) {
            Utils.checkNotNull(dataConnectionId, "dataConnectionId");
            this.dataConnectionId = dataConnectionId;
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
        
        public PushOperationTimedOutWebhook build() {
            return new PushOperationTimedOutWebhook(
                alertId,
                clientId,
                clientName,
                companyId,
                data,
                dataConnectionId,
                message,
                ruleId,
                ruleType);
        }
    }
}

