/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class EnhancedReportAccountCategory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("levels")
    private Optional<? extends java.util.List<AccountCategoryLevel>> levels;

    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends String> status;

    public EnhancedReportAccountCategory(
            @JsonProperty("levels") Optional<? extends java.util.List<AccountCategoryLevel>> levels,
            @JsonProperty("status") Optional<? extends String> status) {
        Utils.checkNotNull(levels, "levels");
        Utils.checkNotNull(status, "status");
        this.levels = levels;
        this.status = status;
    }

    public Optional<? extends java.util.List<AccountCategoryLevel>> levels() {
        return levels;
    }

    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    public Optional<? extends String> status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public EnhancedReportAccountCategory withLevels(java.util.List<AccountCategoryLevel> levels) {
        Utils.checkNotNull(levels, "levels");
        this.levels = Optional.ofNullable(levels);
        return this;
    }
    
    public EnhancedReportAccountCategory withLevels(Optional<? extends java.util.List<AccountCategoryLevel>> levels) {
        Utils.checkNotNull(levels, "levels");
        this.levels = levels;
        return this;
    }

    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    public EnhancedReportAccountCategory withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }
    
    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    public EnhancedReportAccountCategory withStatus(Optional<? extends String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        EnhancedReportAccountCategory other = (EnhancedReportAccountCategory) o;
        return 
            java.util.Objects.deepEquals(this.levels, other.levels) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            levels,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnhancedReportAccountCategory.class,
                "levels", levels,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<AccountCategoryLevel>> levels = Optional.empty();
 
        private Optional<? extends String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder levels(java.util.List<AccountCategoryLevel> levels) {
            Utils.checkNotNull(levels, "levels");
            this.levels = Optional.ofNullable(levels);
            return this;
        }
        
        public Builder levels(Optional<? extends java.util.List<AccountCategoryLevel>> levels) {
            Utils.checkNotNull(levels, "levels");
            this.levels = levels;
            return this;
        }

        /**
         * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }
        
        /**
         * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
         */
        public Builder status(Optional<? extends String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }        
        
        public EnhancedReportAccountCategory build() {
            return new EnhancedReportAccountCategory(
                levels,
                status);
        }
    }
}
