/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.commerce.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class VisibleAccounts {

    /**
     * Visible accounts on sync flow.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("visibleAccounts")
    private JsonNullable<? extends List<String>> visibleAccounts;

    @JsonCreator
    public VisibleAccounts(
            @JsonProperty("visibleAccounts") JsonNullable<? extends List<String>> visibleAccounts) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        this.visibleAccounts = visibleAccounts;
    }
    
    public VisibleAccounts() {
        this(JsonNullable.undefined());
    }

    /**
     * Visible accounts on sync flow.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> visibleAccounts() {
        return (JsonNullable<List<String>>) visibleAccounts;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Visible accounts on sync flow.
     */
    public VisibleAccounts withVisibleAccounts(List<String> visibleAccounts) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        this.visibleAccounts = JsonNullable.of(visibleAccounts);
        return this;
    }

    /**
     * Visible accounts on sync flow.
     */
    public VisibleAccounts withVisibleAccounts(JsonNullable<? extends List<String>> visibleAccounts) {
        Utils.checkNotNull(visibleAccounts, "visibleAccounts");
        this.visibleAccounts = visibleAccounts;
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
        VisibleAccounts other = (VisibleAccounts) o;
        return 
            Objects.deepEquals(this.visibleAccounts, other.visibleAccounts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            visibleAccounts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VisibleAccounts.class,
                "visibleAccounts", visibleAccounts);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<String>> visibleAccounts = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Visible accounts on sync flow.
         */
        public Builder visibleAccounts(List<String> visibleAccounts) {
            Utils.checkNotNull(visibleAccounts, "visibleAccounts");
            this.visibleAccounts = JsonNullable.of(visibleAccounts);
            return this;
        }

        /**
         * Visible accounts on sync flow.
         */
        public Builder visibleAccounts(JsonNullable<? extends List<String>> visibleAccounts) {
            Utils.checkNotNull(visibleAccounts, "visibleAccounts");
            this.visibleAccounts = visibleAccounts;
            return this;
        }
        
        public VisibleAccounts build() {
            return new VisibleAccounts(
                visibleAccounts);
        }
    }
}

