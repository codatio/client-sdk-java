/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ConfigAccount - G/L account object for configuration.
 */

public class ConfigAccount {

    /**
     * Object containing account options.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountOptions")
    private JsonNullable<? extends java.util.List<AccountOption>> accountOptions;

    /**
     * Descriprtive text for sales configuration section.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("descriptionText")
    private JsonNullable<? extends String> descriptionText;

    /**
     * Label text for sales configuration section.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labelText")
    private JsonNullable<? extends String> labelText;

    /**
     * Required section to be configured for sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends Boolean> required;

    /**
     * Selected account id from the list of available accounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedAccountId")
    private JsonNullable<? extends String> selectedAccountId;

    public ConfigAccount(
            @JsonProperty("accountOptions") JsonNullable<? extends java.util.List<AccountOption>> accountOptions,
            @JsonProperty("descriptionText") JsonNullable<? extends String> descriptionText,
            @JsonProperty("labelText") JsonNullable<? extends String> labelText,
            @JsonProperty("required") Optional<? extends Boolean> required,
            @JsonProperty("selectedAccountId") JsonNullable<? extends String> selectedAccountId) {
        Utils.checkNotNull(accountOptions, "accountOptions");
        Utils.checkNotNull(descriptionText, "descriptionText");
        Utils.checkNotNull(labelText, "labelText");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(selectedAccountId, "selectedAccountId");
        this.accountOptions = accountOptions;
        this.descriptionText = descriptionText;
        this.labelText = labelText;
        this.required = required;
        this.selectedAccountId = selectedAccountId;
    }

    /**
     * Object containing account options.
     */
    public JsonNullable<? extends java.util.List<AccountOption>> accountOptions() {
        return accountOptions;
    }

    /**
     * Descriprtive text for sales configuration section.
     */
    public JsonNullable<? extends String> descriptionText() {
        return descriptionText;
    }

    /**
     * Label text for sales configuration section.
     */
    public JsonNullable<? extends String> labelText() {
        return labelText;
    }

    /**
     * Required section to be configured for sync.
     */
    public Optional<? extends Boolean> required() {
        return required;
    }

    /**
     * Selected account id from the list of available accounts.
     */
    public JsonNullable<? extends String> selectedAccountId() {
        return selectedAccountId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object containing account options.
     */
    public ConfigAccount withAccountOptions(java.util.List<AccountOption> accountOptions) {
        Utils.checkNotNull(accountOptions, "accountOptions");
        this.accountOptions = JsonNullable.of(accountOptions);
        return this;
    }

    /**
     * Object containing account options.
     */
    public ConfigAccount withAccountOptions(JsonNullable<? extends java.util.List<AccountOption>> accountOptions) {
        Utils.checkNotNull(accountOptions, "accountOptions");
        this.accountOptions = accountOptions;
        return this;
    }

    /**
     * Descriprtive text for sales configuration section.
     */
    public ConfigAccount withDescriptionText(String descriptionText) {
        Utils.checkNotNull(descriptionText, "descriptionText");
        this.descriptionText = JsonNullable.of(descriptionText);
        return this;
    }

    /**
     * Descriprtive text for sales configuration section.
     */
    public ConfigAccount withDescriptionText(JsonNullable<? extends String> descriptionText) {
        Utils.checkNotNull(descriptionText, "descriptionText");
        this.descriptionText = descriptionText;
        return this;
    }

    /**
     * Label text for sales configuration section.
     */
    public ConfigAccount withLabelText(String labelText) {
        Utils.checkNotNull(labelText, "labelText");
        this.labelText = JsonNullable.of(labelText);
        return this;
    }

    /**
     * Label text for sales configuration section.
     */
    public ConfigAccount withLabelText(JsonNullable<? extends String> labelText) {
        Utils.checkNotNull(labelText, "labelText");
        this.labelText = labelText;
        return this;
    }

    /**
     * Required section to be configured for sync.
     */
    public ConfigAccount withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }
    
    /**
     * Required section to be configured for sync.
     */
    public ConfigAccount withRequired(Optional<? extends Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    /**
     * Selected account id from the list of available accounts.
     */
    public ConfigAccount withSelectedAccountId(String selectedAccountId) {
        Utils.checkNotNull(selectedAccountId, "selectedAccountId");
        this.selectedAccountId = JsonNullable.of(selectedAccountId);
        return this;
    }

    /**
     * Selected account id from the list of available accounts.
     */
    public ConfigAccount withSelectedAccountId(JsonNullable<? extends String> selectedAccountId) {
        Utils.checkNotNull(selectedAccountId, "selectedAccountId");
        this.selectedAccountId = selectedAccountId;
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
        ConfigAccount other = (ConfigAccount) o;
        return 
            java.util.Objects.deepEquals(this.accountOptions, other.accountOptions) &&
            java.util.Objects.deepEquals(this.descriptionText, other.descriptionText) &&
            java.util.Objects.deepEquals(this.labelText, other.labelText) &&
            java.util.Objects.deepEquals(this.required, other.required) &&
            java.util.Objects.deepEquals(this.selectedAccountId, other.selectedAccountId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountOptions,
            descriptionText,
            labelText,
            required,
            selectedAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigAccount.class,
                "accountOptions", accountOptions,
                "descriptionText", descriptionText,
                "labelText", labelText,
                "required", required,
                "selectedAccountId", selectedAccountId);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<AccountOption>> accountOptions = JsonNullable.undefined();
 
        private JsonNullable<? extends String> descriptionText = JsonNullable.undefined();
 
        private JsonNullable<? extends String> labelText = JsonNullable.undefined();
 
        private Optional<? extends Boolean> required = Optional.empty();
 
        private JsonNullable<? extends String> selectedAccountId = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object containing account options.
         */
        public Builder accountOptions(java.util.List<AccountOption> accountOptions) {
            Utils.checkNotNull(accountOptions, "accountOptions");
            this.accountOptions = JsonNullable.of(accountOptions);
            return this;
        }

        /**
         * Object containing account options.
         */
        public Builder accountOptions(JsonNullable<? extends java.util.List<AccountOption>> accountOptions) {
            Utils.checkNotNull(accountOptions, "accountOptions");
            this.accountOptions = accountOptions;
            return this;
        }

        /**
         * Descriprtive text for sales configuration section.
         */
        public Builder descriptionText(String descriptionText) {
            Utils.checkNotNull(descriptionText, "descriptionText");
            this.descriptionText = JsonNullable.of(descriptionText);
            return this;
        }

        /**
         * Descriprtive text for sales configuration section.
         */
        public Builder descriptionText(JsonNullable<? extends String> descriptionText) {
            Utils.checkNotNull(descriptionText, "descriptionText");
            this.descriptionText = descriptionText;
            return this;
        }

        /**
         * Label text for sales configuration section.
         */
        public Builder labelText(String labelText) {
            Utils.checkNotNull(labelText, "labelText");
            this.labelText = JsonNullable.of(labelText);
            return this;
        }

        /**
         * Label text for sales configuration section.
         */
        public Builder labelText(JsonNullable<? extends String> labelText) {
            Utils.checkNotNull(labelText, "labelText");
            this.labelText = labelText;
            return this;
        }

        /**
         * Required section to be configured for sync.
         */
        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }
        
        /**
         * Required section to be configured for sync.
         */
        public Builder required(Optional<? extends Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        /**
         * Selected account id from the list of available accounts.
         */
        public Builder selectedAccountId(String selectedAccountId) {
            Utils.checkNotNull(selectedAccountId, "selectedAccountId");
            this.selectedAccountId = JsonNullable.of(selectedAccountId);
            return this;
        }

        /**
         * Selected account id from the list of available accounts.
         */
        public Builder selectedAccountId(JsonNullable<? extends String> selectedAccountId) {
            Utils.checkNotNull(selectedAccountId, "selectedAccountId");
            this.selectedAccountId = selectedAccountId;
            return this;
        }
        
        public ConfigAccount build() {
            return new ConfigAccount(
                accountOptions,
                descriptionText,
                labelText,
                required,
                selectedAccountId);
        }
    }
}

