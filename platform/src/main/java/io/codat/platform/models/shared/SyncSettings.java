/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class SyncSettings {

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientId")
    private Optional<? extends String> clientId;

    /**
     * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("overridesDefaults")
    private Optional<? extends Boolean> overridesDefaults;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends java.util.List<SyncSetting>> settings;

    public SyncSettings(
            @JsonProperty("clientId") Optional<? extends String> clientId,
            @JsonProperty("overridesDefaults") Optional<? extends Boolean> overridesDefaults,
            @JsonProperty("settings") Optional<? extends java.util.List<SyncSetting>> settings) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        Utils.checkNotNull(settings, "settings");
        this.clientId = clientId;
        this.overridesDefaults = overridesDefaults;
        this.settings = settings;
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public Optional<? extends String> clientId() {
        return clientId;
    }

    /**
     * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    public Optional<? extends Boolean> overridesDefaults() {
        return overridesDefaults;
    }

    public Optional<? extends java.util.List<SyncSetting>> settings() {
        return settings;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public SyncSettings withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }
    
    /**
     * Unique identifier for your client in Codat.
     */
    public SyncSettings withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    public SyncSettings withOverridesDefaults(boolean overridesDefaults) {
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        this.overridesDefaults = Optional.ofNullable(overridesDefaults);
        return this;
    }
    
    /**
     * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    public SyncSettings withOverridesDefaults(Optional<? extends Boolean> overridesDefaults) {
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        this.overridesDefaults = overridesDefaults;
        return this;
    }

    public SyncSettings withSettings(java.util.List<SyncSetting> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }
    
    public SyncSettings withSettings(Optional<? extends java.util.List<SyncSetting>> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
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
        SyncSettings other = (SyncSettings) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.overridesDefaults, other.overridesDefaults) &&
            java.util.Objects.deepEquals(this.settings, other.settings);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            overridesDefaults,
            settings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SyncSettings.class,
                "clientId", clientId,
                "overridesDefaults", overridesDefaults,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends Boolean> overridesDefaults = Optional.empty();
 
        private Optional<? extends java.util.List<SyncSetting>> settings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
         * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
         */
        public Builder overridesDefaults(boolean overridesDefaults) {
            Utils.checkNotNull(overridesDefaults, "overridesDefaults");
            this.overridesDefaults = Optional.ofNullable(overridesDefaults);
            return this;
        }
        
        /**
         * Set to `True` if you want to override the default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
         */
        public Builder overridesDefaults(Optional<? extends Boolean> overridesDefaults) {
            Utils.checkNotNull(overridesDefaults, "overridesDefaults");
            this.overridesDefaults = overridesDefaults;
            return this;
        }

        public Builder settings(java.util.List<SyncSetting> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }
        
        public Builder settings(Optional<? extends java.util.List<SyncSetting>> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public SyncSettings build() {
            return new SyncSettings(
                clientId,
                overridesDefaults,
                settings);
        }
    }
}
