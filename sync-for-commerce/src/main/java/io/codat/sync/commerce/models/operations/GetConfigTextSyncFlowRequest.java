/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.utils.SpeakeasyMetadata;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetConfigTextSyncFlowRequest {

    /**
     * Localization identifier for English (US) or French.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=locale")
    private Locale locale;

    @JsonCreator
    public GetConfigTextSyncFlowRequest(
            Locale locale) {
        Utils.checkNotNull(locale, "locale");
        this.locale = locale;
    }

    /**
     * Localization identifier for English (US) or French.
     */
    @JsonIgnore
    public Locale locale() {
        return locale;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Localization identifier for English (US) or French.
     */
    public GetConfigTextSyncFlowRequest withLocale(Locale locale) {
        Utils.checkNotNull(locale, "locale");
        this.locale = locale;
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
        GetConfigTextSyncFlowRequest other = (GetConfigTextSyncFlowRequest) o;
        return 
            Objects.deepEquals(this.locale, other.locale);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            locale);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConfigTextSyncFlowRequest.class,
                "locale", locale);
    }
    
    public final static class Builder {
 
        private Locale locale;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Localization identifier for English (US) or French.
         */
        public Builder locale(Locale locale) {
            Utils.checkNotNull(locale, "locale");
            this.locale = locale;
            return this;
        }
        
        public GetConfigTextSyncFlowRequest build() {
            return new GetConfigTextSyncFlowRequest(
                locale);
        }
    }
}

