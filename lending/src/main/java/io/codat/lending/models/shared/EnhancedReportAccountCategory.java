/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class EnhancedReportAccountCategory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("levels")
    private Optional<? extends List<AccountCategoryLevel>> levels;

    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<String> status;

    @JsonCreator
    public EnhancedReportAccountCategory(
            @JsonProperty("levels") Optional<? extends List<AccountCategoryLevel>> levels,
            @JsonProperty("status") Optional<String> status) {
        Utils.checkNotNull(levels, "levels");
        Utils.checkNotNull(status, "status");
        this.levels = levels;
        this.status = status;
    }
    
    public EnhancedReportAccountCategory() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AccountCategoryLevel>> levels() {
        return (Optional<List<AccountCategoryLevel>>) levels;
    }

    /**
     * Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned.
     */
    @JsonIgnore
    public Optional<String> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EnhancedReportAccountCategory withLevels(List<AccountCategoryLevel> levels) {
        Utils.checkNotNull(levels, "levels");
        this.levels = Optional.ofNullable(levels);
        return this;
    }

    public EnhancedReportAccountCategory withLevels(Optional<? extends List<AccountCategoryLevel>> levels) {
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
    public EnhancedReportAccountCategory withStatus(Optional<String> status) {
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
            Objects.deepEquals(this.levels, other.levels) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends List<AccountCategoryLevel>> levels = Optional.empty();
 
        private Optional<String> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder levels(List<AccountCategoryLevel> levels) {
            Utils.checkNotNull(levels, "levels");
            this.levels = Optional.ofNullable(levels);
            return this;
        }

        public Builder levels(Optional<? extends List<AccountCategoryLevel>> levels) {
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
        public Builder status(Optional<String> status) {
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

