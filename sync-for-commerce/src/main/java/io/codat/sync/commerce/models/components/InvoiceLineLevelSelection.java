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


public class InvoiceLineLevelSelection {

    /**
     * Options for grouping on invoice lines.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groupByOptions")
    private JsonNullable<? extends List<String>> groupByOptions;

    /**
     * Invoice line level selection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selectedGroupByOptions")
    private JsonNullable<? extends List<String>> selectedGroupByOptions;

    @JsonCreator
    public InvoiceLineLevelSelection(
            @JsonProperty("groupByOptions") JsonNullable<? extends List<String>> groupByOptions,
            @JsonProperty("selectedGroupByOptions") JsonNullable<? extends List<String>> selectedGroupByOptions) {
        Utils.checkNotNull(groupByOptions, "groupByOptions");
        Utils.checkNotNull(selectedGroupByOptions, "selectedGroupByOptions");
        this.groupByOptions = groupByOptions;
        this.selectedGroupByOptions = selectedGroupByOptions;
    }
    
    public InvoiceLineLevelSelection() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Options for grouping on invoice lines.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> groupByOptions() {
        return (JsonNullable<List<String>>) groupByOptions;
    }

    /**
     * Invoice line level selection.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> selectedGroupByOptions() {
        return (JsonNullable<List<String>>) selectedGroupByOptions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Options for grouping on invoice lines.
     */
    public InvoiceLineLevelSelection withGroupByOptions(List<String> groupByOptions) {
        Utils.checkNotNull(groupByOptions, "groupByOptions");
        this.groupByOptions = JsonNullable.of(groupByOptions);
        return this;
    }

    /**
     * Options for grouping on invoice lines.
     */
    public InvoiceLineLevelSelection withGroupByOptions(JsonNullable<? extends List<String>> groupByOptions) {
        Utils.checkNotNull(groupByOptions, "groupByOptions");
        this.groupByOptions = groupByOptions;
        return this;
    }

    /**
     * Invoice line level selection.
     */
    public InvoiceLineLevelSelection withSelectedGroupByOptions(List<String> selectedGroupByOptions) {
        Utils.checkNotNull(selectedGroupByOptions, "selectedGroupByOptions");
        this.selectedGroupByOptions = JsonNullable.of(selectedGroupByOptions);
        return this;
    }

    /**
     * Invoice line level selection.
     */
    public InvoiceLineLevelSelection withSelectedGroupByOptions(JsonNullable<? extends List<String>> selectedGroupByOptions) {
        Utils.checkNotNull(selectedGroupByOptions, "selectedGroupByOptions");
        this.selectedGroupByOptions = selectedGroupByOptions;
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
        InvoiceLineLevelSelection other = (InvoiceLineLevelSelection) o;
        return 
            Objects.deepEquals(this.groupByOptions, other.groupByOptions) &&
            Objects.deepEquals(this.selectedGroupByOptions, other.selectedGroupByOptions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            groupByOptions,
            selectedGroupByOptions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceLineLevelSelection.class,
                "groupByOptions", groupByOptions,
                "selectedGroupByOptions", selectedGroupByOptions);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<String>> groupByOptions = JsonNullable.undefined();
 
        private JsonNullable<? extends List<String>> selectedGroupByOptions = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Options for grouping on invoice lines.
         */
        public Builder groupByOptions(List<String> groupByOptions) {
            Utils.checkNotNull(groupByOptions, "groupByOptions");
            this.groupByOptions = JsonNullable.of(groupByOptions);
            return this;
        }

        /**
         * Options for grouping on invoice lines.
         */
        public Builder groupByOptions(JsonNullable<? extends List<String>> groupByOptions) {
            Utils.checkNotNull(groupByOptions, "groupByOptions");
            this.groupByOptions = groupByOptions;
            return this;
        }

        /**
         * Invoice line level selection.
         */
        public Builder selectedGroupByOptions(List<String> selectedGroupByOptions) {
            Utils.checkNotNull(selectedGroupByOptions, "selectedGroupByOptions");
            this.selectedGroupByOptions = JsonNullable.of(selectedGroupByOptions);
            return this;
        }

        /**
         * Invoice line level selection.
         */
        public Builder selectedGroupByOptions(JsonNullable<? extends List<String>> selectedGroupByOptions) {
            Utils.checkNotNull(selectedGroupByOptions, "selectedGroupByOptions");
            this.selectedGroupByOptions = selectedGroupByOptions;
            return this;
        }
        
        public InvoiceLineLevelSelection build() {
            return new InvoiceLineLevelSelection(
                groupByOptions,
                selectedGroupByOptions);
        }
    }
}

