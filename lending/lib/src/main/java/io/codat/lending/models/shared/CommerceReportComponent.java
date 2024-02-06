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


public class CommerceReportComponent {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("components")
    private Optional<? extends java.util.List<CommerceReportComponent>> components;

    /**
     * The component's dimension.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dimension")
    private Optional<? extends Long> dimension;

    /**
     * The component's display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dimensionDisplayName")
    private Optional<? extends String> dimensionDisplayName;

    /**
     * The component's item number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    private Optional<? extends Long> item;

    /**
     * The component's item display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("itemDisplayName")
    private Optional<? extends String> itemDisplayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("measures")
    private Optional<? extends java.util.List<ReportComponentMeasure>> measures;

    public CommerceReportComponent(
            @JsonProperty("components") Optional<? extends java.util.List<CommerceReportComponent>> components,
            @JsonProperty("dimension") Optional<? extends Long> dimension,
            @JsonProperty("dimensionDisplayName") Optional<? extends String> dimensionDisplayName,
            @JsonProperty("item") Optional<? extends Long> item,
            @JsonProperty("itemDisplayName") Optional<? extends String> itemDisplayName,
            @JsonProperty("measures") Optional<? extends java.util.List<ReportComponentMeasure>> measures) {
        Utils.checkNotNull(components, "components");
        Utils.checkNotNull(dimension, "dimension");
        Utils.checkNotNull(dimensionDisplayName, "dimensionDisplayName");
        Utils.checkNotNull(item, "item");
        Utils.checkNotNull(itemDisplayName, "itemDisplayName");
        Utils.checkNotNull(measures, "measures");
        this.components = components;
        this.dimension = dimension;
        this.dimensionDisplayName = dimensionDisplayName;
        this.item = item;
        this.itemDisplayName = itemDisplayName;
        this.measures = measures;
    }

    public Optional<? extends java.util.List<CommerceReportComponent>> components() {
        return components;
    }

    /**
     * The component's dimension.
     */
    public Optional<? extends Long> dimension() {
        return dimension;
    }

    /**
     * The component's display name.
     */
    public Optional<? extends String> dimensionDisplayName() {
        return dimensionDisplayName;
    }

    /**
     * The component's item number.
     */
    public Optional<? extends Long> item() {
        return item;
    }

    /**
     * The component's item display name.
     */
    public Optional<? extends String> itemDisplayName() {
        return itemDisplayName;
    }

    public Optional<? extends java.util.List<ReportComponentMeasure>> measures() {
        return measures;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CommerceReportComponent withComponents(java.util.List<CommerceReportComponent> components) {
        Utils.checkNotNull(components, "components");
        this.components = Optional.ofNullable(components);
        return this;
    }
    
    public CommerceReportComponent withComponents(Optional<? extends java.util.List<CommerceReportComponent>> components) {
        Utils.checkNotNull(components, "components");
        this.components = components;
        return this;
    }

    /**
     * The component's dimension.
     */
    public CommerceReportComponent withDimension(long dimension) {
        Utils.checkNotNull(dimension, "dimension");
        this.dimension = Optional.ofNullable(dimension);
        return this;
    }
    
    /**
     * The component's dimension.
     */
    public CommerceReportComponent withDimension(Optional<? extends Long> dimension) {
        Utils.checkNotNull(dimension, "dimension");
        this.dimension = dimension;
        return this;
    }

    /**
     * The component's display name.
     */
    public CommerceReportComponent withDimensionDisplayName(String dimensionDisplayName) {
        Utils.checkNotNull(dimensionDisplayName, "dimensionDisplayName");
        this.dimensionDisplayName = Optional.ofNullable(dimensionDisplayName);
        return this;
    }
    
    /**
     * The component's display name.
     */
    public CommerceReportComponent withDimensionDisplayName(Optional<? extends String> dimensionDisplayName) {
        Utils.checkNotNull(dimensionDisplayName, "dimensionDisplayName");
        this.dimensionDisplayName = dimensionDisplayName;
        return this;
    }

    /**
     * The component's item number.
     */
    public CommerceReportComponent withItem(long item) {
        Utils.checkNotNull(item, "item");
        this.item = Optional.ofNullable(item);
        return this;
    }
    
    /**
     * The component's item number.
     */
    public CommerceReportComponent withItem(Optional<? extends Long> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
        return this;
    }

    /**
     * The component's item display name.
     */
    public CommerceReportComponent withItemDisplayName(String itemDisplayName) {
        Utils.checkNotNull(itemDisplayName, "itemDisplayName");
        this.itemDisplayName = Optional.ofNullable(itemDisplayName);
        return this;
    }
    
    /**
     * The component's item display name.
     */
    public CommerceReportComponent withItemDisplayName(Optional<? extends String> itemDisplayName) {
        Utils.checkNotNull(itemDisplayName, "itemDisplayName");
        this.itemDisplayName = itemDisplayName;
        return this;
    }

    public CommerceReportComponent withMeasures(java.util.List<ReportComponentMeasure> measures) {
        Utils.checkNotNull(measures, "measures");
        this.measures = Optional.ofNullable(measures);
        return this;
    }
    
    public CommerceReportComponent withMeasures(Optional<? extends java.util.List<ReportComponentMeasure>> measures) {
        Utils.checkNotNull(measures, "measures");
        this.measures = measures;
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
        CommerceReportComponent other = (CommerceReportComponent) o;
        return 
            java.util.Objects.deepEquals(this.components, other.components) &&
            java.util.Objects.deepEquals(this.dimension, other.dimension) &&
            java.util.Objects.deepEquals(this.dimensionDisplayName, other.dimensionDisplayName) &&
            java.util.Objects.deepEquals(this.item, other.item) &&
            java.util.Objects.deepEquals(this.itemDisplayName, other.itemDisplayName) &&
            java.util.Objects.deepEquals(this.measures, other.measures);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            components,
            dimension,
            dimensionDisplayName,
            item,
            itemDisplayName,
            measures);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceReportComponent.class,
                "components", components,
                "dimension", dimension,
                "dimensionDisplayName", dimensionDisplayName,
                "item", item,
                "itemDisplayName", itemDisplayName,
                "measures", measures);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<CommerceReportComponent>> components = Optional.empty();
 
        private Optional<? extends Long> dimension = Optional.empty();
 
        private Optional<? extends String> dimensionDisplayName = Optional.empty();
 
        private Optional<? extends Long> item = Optional.empty();
 
        private Optional<? extends String> itemDisplayName = Optional.empty();
 
        private Optional<? extends java.util.List<ReportComponentMeasure>> measures = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder components(java.util.List<CommerceReportComponent> components) {
            Utils.checkNotNull(components, "components");
            this.components = Optional.ofNullable(components);
            return this;
        }
        
        public Builder components(Optional<? extends java.util.List<CommerceReportComponent>> components) {
            Utils.checkNotNull(components, "components");
            this.components = components;
            return this;
        }

        /**
         * The component's dimension.
         */
        public Builder dimension(long dimension) {
            Utils.checkNotNull(dimension, "dimension");
            this.dimension = Optional.ofNullable(dimension);
            return this;
        }
        
        /**
         * The component's dimension.
         */
        public Builder dimension(Optional<? extends Long> dimension) {
            Utils.checkNotNull(dimension, "dimension");
            this.dimension = dimension;
            return this;
        }

        /**
         * The component's display name.
         */
        public Builder dimensionDisplayName(String dimensionDisplayName) {
            Utils.checkNotNull(dimensionDisplayName, "dimensionDisplayName");
            this.dimensionDisplayName = Optional.ofNullable(dimensionDisplayName);
            return this;
        }
        
        /**
         * The component's display name.
         */
        public Builder dimensionDisplayName(Optional<? extends String> dimensionDisplayName) {
            Utils.checkNotNull(dimensionDisplayName, "dimensionDisplayName");
            this.dimensionDisplayName = dimensionDisplayName;
            return this;
        }

        /**
         * The component's item number.
         */
        public Builder item(long item) {
            Utils.checkNotNull(item, "item");
            this.item = Optional.ofNullable(item);
            return this;
        }
        
        /**
         * The component's item number.
         */
        public Builder item(Optional<? extends Long> item) {
            Utils.checkNotNull(item, "item");
            this.item = item;
            return this;
        }

        /**
         * The component's item display name.
         */
        public Builder itemDisplayName(String itemDisplayName) {
            Utils.checkNotNull(itemDisplayName, "itemDisplayName");
            this.itemDisplayName = Optional.ofNullable(itemDisplayName);
            return this;
        }
        
        /**
         * The component's item display name.
         */
        public Builder itemDisplayName(Optional<? extends String> itemDisplayName) {
            Utils.checkNotNull(itemDisplayName, "itemDisplayName");
            this.itemDisplayName = itemDisplayName;
            return this;
        }

        public Builder measures(java.util.List<ReportComponentMeasure> measures) {
            Utils.checkNotNull(measures, "measures");
            this.measures = Optional.ofNullable(measures);
            return this;
        }
        
        public Builder measures(Optional<? extends java.util.List<ReportComponentMeasure>> measures) {
            Utils.checkNotNull(measures, "measures");
            this.measures = measures;
            return this;
        }        
        
        public CommerceReportComponent build() {
            return new CommerceReportComponent(
                components,
                dimension,
                dimensionDisplayName,
                item,
                itemDisplayName,
                measures);
        }
    }
}

