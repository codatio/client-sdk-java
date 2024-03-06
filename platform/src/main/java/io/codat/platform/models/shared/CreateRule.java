/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * CreateRule - Create a message that notifies a URL of an event based on its given type or condition.
 */

public class CreateRule {

    /**
     * Unique identifier for your SMB in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyId")
    private Optional<? extends String> companyId;

    @JsonProperty("notifiers")
    private WebhookNotifier notifiers;

    /**
     * The type of webhook.
     */
    @JsonProperty("type")
    private String type;

    public CreateRule(
            @JsonProperty("companyId") Optional<? extends String> companyId,
            @JsonProperty("notifiers") WebhookNotifier notifiers,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(notifiers, "notifiers");
        Utils.checkNotNull(type, "type");
        this.companyId = companyId;
        this.notifiers = notifiers;
        this.type = type;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public Optional<? extends String> companyId() {
        return companyId;
    }

    public WebhookNotifier notifiers() {
        return notifiers;
    }

    /**
     * The type of webhook.
     */
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CreateRule withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Unique identifier for your SMB in Codat.
     */
    public CreateRule withCompanyId(Optional<? extends String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public CreateRule withNotifiers(WebhookNotifier notifiers) {
        Utils.checkNotNull(notifiers, "notifiers");
        this.notifiers = notifiers;
        return this;
    }

    /**
     * The type of webhook.
     */
    public CreateRule withType(String type) {
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
        CreateRule other = (CreateRule) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.notifiers, other.notifiers) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            notifiers,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRule.class,
                "companyId", companyId,
                "notifiers", notifiers,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> companyId = Optional.empty();
 
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
        
        public CreateRule build() {
            return new CreateRule(
                companyId,
                notifiers,
                type);
        }
    }
}

