/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.LazySingletonValue;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * UpdateProfileSyncSettingsRequestBody - Include a `syncSetting` object for each data type.
 * `syncFromWindow`, `syncFromUTC` &amp; `monthsToSync` only need to be included if you wish to set a value for them.
 */

public class UpdateProfileSyncSettingsRequestBody {

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonProperty("clientId")
    private String clientId;

    /**
     * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("overridesDefaults")
    private Optional<? extends Boolean> overridesDefaults;

    @JsonProperty("settings")
    private java.util.List<io.codat.platform.models.shared.SyncSetting> settings;

    @JsonCreator
    public UpdateProfileSyncSettingsRequestBody(
            @JsonProperty("clientId") String clientId,
            @JsonProperty("overridesDefaults") Optional<? extends Boolean> overridesDefaults,
            @JsonProperty("settings") java.util.List<io.codat.platform.models.shared.SyncSetting> settings) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        Utils.checkNotNull(settings, "settings");
        this.clientId = clientId;
        this.overridesDefaults = overridesDefaults;
        this.settings = settings;
    }
    
    public UpdateProfileSyncSettingsRequestBody(
            String clientId,
            java.util.List<io.codat.platform.models.shared.SyncSetting> settings) {
        this(clientId, Optional.empty(), settings);
    }

    /**
     * Unique identifier for your client in Codat.
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    @JsonIgnore
    public Optional<? extends Boolean> overridesDefaults() {
        return overridesDefaults;
    }

    @JsonIgnore
    public java.util.List<io.codat.platform.models.shared.SyncSetting> settings() {
        return settings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for your client in Codat.
     */
    public UpdateProfileSyncSettingsRequestBody withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    public UpdateProfileSyncSettingsRequestBody withOverridesDefaults(boolean overridesDefaults) {
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        this.overridesDefaults = Optional.ofNullable(overridesDefaults);
        return this;
    }

    /**
     * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
     */
    public UpdateProfileSyncSettingsRequestBody withOverridesDefaults(Optional<? extends Boolean> overridesDefaults) {
        Utils.checkNotNull(overridesDefaults, "overridesDefaults");
        this.overridesDefaults = overridesDefaults;
        return this;
    }

    public UpdateProfileSyncSettingsRequestBody withSettings(java.util.List<io.codat.platform.models.shared.SyncSetting> settings) {
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
        UpdateProfileSyncSettingsRequestBody other = (UpdateProfileSyncSettingsRequestBody) o;
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
        return Utils.toString(UpdateProfileSyncSettingsRequestBody.class,
                "clientId", clientId,
                "overridesDefaults", overridesDefaults,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private Optional<? extends Boolean> overridesDefaults;
 
        private java.util.List<io.codat.platform.models.shared.SyncSetting> settings;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for your client in Codat.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
         */
        public Builder overridesDefaults(boolean overridesDefaults) {
            Utils.checkNotNull(overridesDefaults, "overridesDefaults");
            this.overridesDefaults = Optional.ofNullable(overridesDefaults);
            return this;
        }

        /**
         * Set to `True` if you want to override default [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings).
         */
        public Builder overridesDefaults(Optional<? extends Boolean> overridesDefaults) {
            Utils.checkNotNull(overridesDefaults, "overridesDefaults");
            this.overridesDefaults = overridesDefaults;
            return this;
        }

        public Builder settings(java.util.List<io.codat.platform.models.shared.SyncSetting> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public UpdateProfileSyncSettingsRequestBody build() {
            if (overridesDefaults == null) {
                overridesDefaults = _SINGLETON_VALUE_OverridesDefaults.value();
            }
            return new UpdateProfileSyncSettingsRequestBody(
                clientId,
                overridesDefaults,
                settings);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_OverridesDefaults =
                new LazySingletonValue<>(
                        "overridesDefaults",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

