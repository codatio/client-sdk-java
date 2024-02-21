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


public class ModifiedDate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends String> modifiedDate;

    public ModifiedDate(
            @JsonProperty("modifiedDate") Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
    }

    public Optional<? extends String> modifiedDate() {
        return modifiedDate;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ModifiedDate withModifiedDate(String modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }
    
    public ModifiedDate withModifiedDate(Optional<? extends String> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
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
        ModifiedDate other = (ModifiedDate) o;
        return 
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            modifiedDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModifiedDate.class,
                "modifiedDate", modifiedDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> modifiedDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder modifiedDate(String modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }
        
        public Builder modifiedDate(Optional<? extends String> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }
        
        public ModifiedDate build() {
            return new ModifiedDate(
                modifiedDate);
        }
    }
}
