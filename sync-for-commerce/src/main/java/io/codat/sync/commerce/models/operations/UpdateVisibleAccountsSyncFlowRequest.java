/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.commerce.models.components.VisibleAccounts;
import io.codat.sync.commerce.utils.SpeakeasyMetadata;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class UpdateVisibleAccountsSyncFlowRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends VisibleAccounts> visibleAccounts;

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=platformKey")
    private String platformKey;

    @JsonCreator
    public UpdateVisibleAccountsSyncFlowRequest(
            Optional<? extends VisibleAccounts> visibleAccounts,
            String platformKey) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        Utils.checkNotNull(platformKey, "platformKey");
        this.visibleAccounts = visibleAccounts;
        this.platformKey = platformKey;
    }
    
    public UpdateVisibleAccountsSyncFlowRequest(
            String platformKey) {
        this(Optional.empty(), platformKey);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VisibleAccounts> visibleAccounts() {
        return (Optional<VisibleAccounts>) visibleAccounts;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    @JsonIgnore
    public String platformKey() {
        return platformKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateVisibleAccountsSyncFlowRequest withVisibleAccounts(VisibleAccounts visibleAccounts) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        this.visibleAccounts = Optional.ofNullable(visibleAccounts);
        return this;
    }

    public UpdateVisibleAccountsSyncFlowRequest withVisibleAccounts(Optional<? extends VisibleAccounts> visibleAccounts) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        this.visibleAccounts = visibleAccounts;
        return this;
    }

    /**
     * A unique 4-letter key to represent a platform in each integration.
     */
    public UpdateVisibleAccountsSyncFlowRequest withPlatformKey(String platformKey) {
        Utils.checkNotNull(platformKey, "platformKey");
        this.platformKey = platformKey;
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
        UpdateVisibleAccountsSyncFlowRequest other = (UpdateVisibleAccountsSyncFlowRequest) o;
        return 
            Objects.deepEquals(this.visibleAccounts, other.visibleAccounts) &&
            Objects.deepEquals(this.platformKey, other.platformKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            visibleAccounts,
            platformKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateVisibleAccountsSyncFlowRequest.class,
                "visibleAccounts", visibleAccounts,
                "platformKey", platformKey);
    }
    
    public final static class Builder {
 
        private Optional<? extends VisibleAccounts> visibleAccounts = Optional.empty();
 
        private String platformKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder visibleAccounts(VisibleAccounts visibleAccounts) {
            Utils.checkNotNull(visibleAccounts, "visibleAccounts");
            this.visibleAccounts = Optional.ofNullable(visibleAccounts);
            return this;
        }

        public Builder visibleAccounts(Optional<? extends VisibleAccounts> visibleAccounts) {
            Utils.checkNotNull(visibleAccounts, "visibleAccounts");
            this.visibleAccounts = visibleAccounts;
            return this;
        }

        /**
         * A unique 4-letter key to represent a platform in each integration.
         */
        public Builder platformKey(String platformKey) {
            Utils.checkNotNull(platformKey, "platformKey");
            this.platformKey = platformKey;
            return this;
        }
        
        public UpdateVisibleAccountsSyncFlowRequest build() {
            return new UpdateVisibleAccountsSyncFlowRequest(
                visibleAccounts,
                platformKey);
        }
    }
}

