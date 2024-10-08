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


public class GroupingPeriod {

    /**
     * Array of grouping period options.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groupingPeriodOptions")
    private JsonNullable<? extends List<String>> groupingPeriodOptions;

    /**
     * Grouping period i.e. Daily sales.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedGroupingPeriod")
    private JsonNullable<String> selectedGroupingPeriod;

    @JsonCreator
    public GroupingPeriod(
            @JsonProperty("groupingPeriodOptions") JsonNullable<? extends List<String>> groupingPeriodOptions,
            @JsonProperty("selectedGroupingPeriod") JsonNullable<String> selectedGroupingPeriod) {
        Utils.checkNotNull(groupingPeriodOptions, "groupingPeriodOptions");
        Utils.checkNotNull(selectedGroupingPeriod, "selectedGroupingPeriod");
        this.groupingPeriodOptions = groupingPeriodOptions;
        this.selectedGroupingPeriod = selectedGroupingPeriod;
    }
    
    public GroupingPeriod() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Array of grouping period options.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> groupingPeriodOptions() {
        return (JsonNullable<List<String>>) groupingPeriodOptions;
    }

    /**
     * Grouping period i.e. Daily sales.
     */
    @JsonIgnore
    public JsonNullable<String> selectedGroupingPeriod() {
        return selectedGroupingPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of grouping period options.
     */
    public GroupingPeriod withGroupingPeriodOptions(List<String> groupingPeriodOptions) {
        Utils.checkNotNull(groupingPeriodOptions, "groupingPeriodOptions");
        this.groupingPeriodOptions = JsonNullable.of(groupingPeriodOptions);
        return this;
    }

    /**
     * Array of grouping period options.
     */
    public GroupingPeriod withGroupingPeriodOptions(JsonNullable<? extends List<String>> groupingPeriodOptions) {
        Utils.checkNotNull(groupingPeriodOptions, "groupingPeriodOptions");
        this.groupingPeriodOptions = groupingPeriodOptions;
        return this;
    }

    /**
     * Grouping period i.e. Daily sales.
     */
    public GroupingPeriod withSelectedGroupingPeriod(String selectedGroupingPeriod) {
        Utils.checkNotNull(selectedGroupingPeriod, "selectedGroupingPeriod");
        this.selectedGroupingPeriod = JsonNullable.of(selectedGroupingPeriod);
        return this;
    }

    /**
     * Grouping period i.e. Daily sales.
     */
    public GroupingPeriod withSelectedGroupingPeriod(JsonNullable<String> selectedGroupingPeriod) {
        Utils.checkNotNull(selectedGroupingPeriod, "selectedGroupingPeriod");
        this.selectedGroupingPeriod = selectedGroupingPeriod;
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
        GroupingPeriod other = (GroupingPeriod) o;
        return 
            Objects.deepEquals(this.groupingPeriodOptions, other.groupingPeriodOptions) &&
            Objects.deepEquals(this.selectedGroupingPeriod, other.selectedGroupingPeriod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            groupingPeriodOptions,
            selectedGroupingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GroupingPeriod.class,
                "groupingPeriodOptions", groupingPeriodOptions,
                "selectedGroupingPeriod", selectedGroupingPeriod);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<String>> groupingPeriodOptions = JsonNullable.undefined();
 
        private JsonNullable<String> selectedGroupingPeriod = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of grouping period options.
         */
        public Builder groupingPeriodOptions(List<String> groupingPeriodOptions) {
            Utils.checkNotNull(groupingPeriodOptions, "groupingPeriodOptions");
            this.groupingPeriodOptions = JsonNullable.of(groupingPeriodOptions);
            return this;
        }

        /**
         * Array of grouping period options.
         */
        public Builder groupingPeriodOptions(JsonNullable<? extends List<String>> groupingPeriodOptions) {
            Utils.checkNotNull(groupingPeriodOptions, "groupingPeriodOptions");
            this.groupingPeriodOptions = groupingPeriodOptions;
            return this;
        }

        /**
         * Grouping period i.e. Daily sales.
         */
        public Builder selectedGroupingPeriod(String selectedGroupingPeriod) {
            Utils.checkNotNull(selectedGroupingPeriod, "selectedGroupingPeriod");
            this.selectedGroupingPeriod = JsonNullable.of(selectedGroupingPeriod);
            return this;
        }

        /**
         * Grouping period i.e. Daily sales.
         */
        public Builder selectedGroupingPeriod(JsonNullable<String> selectedGroupingPeriod) {
            Utils.checkNotNull(selectedGroupingPeriod, "selectedGroupingPeriod");
            this.selectedGroupingPeriod = selectedGroupingPeriod;
            return this;
        }
        
        public GroupingPeriod build() {
            return new GroupingPeriod(
                groupingPeriodOptions,
                selectedGroupingPeriod);
        }
    }
}

