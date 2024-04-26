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
 * Webhook - Configuration to provide an event notification to a URL or list of email addresses based on the given type or condition.
 */

public class Webhook {

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyId")
    private Optional<? extends String> companyId;

    /**
     * Unique identifier for the configured notification.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonProperty("notifiers")
    private WebhookNotifier notifiers;

    /**
     * The type of webhook.
     */
    @JsonProperty("type")
    private String type;

    @JsonCreator
    public Webhook(
            @JsonProperty("companyId") Optional<? extends String> companyId,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("notifiers") WebhookNotifier notifiers,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(notifiers, "notifiers");
        Utils.checkNotNull(type, "type");
        this.companyId = companyId;
        this.id = id;
        this.notifiers = notifiers;
        this.type = type;
    }
    
    public Webhook(
            WebhookNotifier notifiers,
            String type) {
        this(Optional.empty(), Optional.empty(), notifiers, type);
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonIgnore
    public Optional<? extends String> companyId() {
        return companyId;
    }

    /**
     * Unique identifier for the configured notification.
     */
    @JsonIgnore
    public Optional<? extends String> id() {
        return id;
    }

    @JsonIgnore
    public WebhookNotifier notifiers() {
        return notifiers;
    }

    /**
     * The type of webhook.
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public Webhook withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public Webhook withCompanyId(Optional<? extends String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for the configured notification.
     */
    public Webhook withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for the configured notification.
     */
    public Webhook withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Webhook withNotifiers(WebhookNotifier notifiers) {
        Utils.checkNotNull(notifiers, "notifiers");
        this.notifiers = notifiers;
        return this;
    }

    /**
     * The type of webhook.
     */
    public Webhook withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        Webhook other = (Webhook) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.notifiers, other.notifiers) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            id,
            notifiers,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Webhook.class,
                "companyId", companyId,
                "id", id,
                "notifiers", notifiers,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> companyId = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private WebhookNotifier notifiers;
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder companyId(Optional<? extends String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for the configured notification.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for the configured notification.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder notifiers(WebhookNotifier notifiers) {
            Utils.checkNotNull(notifiers, "notifiers");
            this.notifiers = notifiers;
            return this;
        }

        /**
         * The type of webhook.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Webhook build() {
            return new Webhook(
                companyId,
                id,
                notifiers,
                type);
        }
    }
}

