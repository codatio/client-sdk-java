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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;


public class ReportComponentMeasure {

    /**
     * The measure's index.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<Long> index;

    /**
     * The measure's display name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("measureDisplayName")
    private Optional<String> measureDisplayName;

    /**
     * The measure's value.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends BigDecimal> value;

    @JsonCreator
    public ReportComponentMeasure(
            @JsonProperty("index") Optional<Long> index,
            @JsonProperty("measureDisplayName") Optional<String> measureDisplayName,
            @JsonProperty("value") Optional<? extends BigDecimal> value) {
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(measureDisplayName, "measureDisplayName");
        Utils.checkNotNull(value, "value");
        this.index = index;
        this.measureDisplayName = measureDisplayName;
        this.value = value;
    }
    
    public ReportComponentMeasure() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The measure's index.
     */
    @JsonIgnore
    public Optional<Long> index() {
        return index;
    }

    /**
     * The measure's display name.
     */
    @JsonIgnore
    public Optional<String> measureDisplayName() {
        return measureDisplayName;
    }

    /**
     * The measure's value.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> value() {
        return (Optional<BigDecimal>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The measure's index.
     */
    public ReportComponentMeasure withIndex(long index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    /**
     * The measure's index.
     */
    public ReportComponentMeasure withIndex(Optional<Long> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    /**
     * The measure's display name.
     */
    public ReportComponentMeasure withMeasureDisplayName(String measureDisplayName) {
        Utils.checkNotNull(measureDisplayName, "measureDisplayName");
        this.measureDisplayName = Optional.ofNullable(measureDisplayName);
        return this;
    }

    /**
     * The measure's display name.
     */
    public ReportComponentMeasure withMeasureDisplayName(Optional<String> measureDisplayName) {
        Utils.checkNotNull(measureDisplayName, "measureDisplayName");
        this.measureDisplayName = measureDisplayName;
        return this;
    }

    /**
     * The measure's value.
     */
    public ReportComponentMeasure withValue(BigDecimal value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

        /**
         * The measure's value.
         */
    public ReportComponentMeasure withValue(double value) {
        this.value = Optional.of(BigDecimal.valueOf(value));
        return this;
    }

    /**
     * The measure's value.
     */
    public ReportComponentMeasure withValue(Optional<? extends BigDecimal> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        ReportComponentMeasure other = (ReportComponentMeasure) o;
        return 
            Objects.deepEquals(this.index, other.index) &&
            Objects.deepEquals(this.measureDisplayName, other.measureDisplayName) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            index,
            measureDisplayName,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportComponentMeasure.class,
                "index", index,
                "measureDisplayName", measureDisplayName,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<Long> index = Optional.empty();
 
        private Optional<String> measureDisplayName = Optional.empty();
 
        private Optional<? extends BigDecimal> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The measure's index.
         */
        public Builder index(long index) {
            Utils.checkNotNull(index, "index");
            this.index = Optional.ofNullable(index);
            return this;
        }

        /**
         * The measure's index.
         */
        public Builder index(Optional<Long> index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        /**
         * The measure's display name.
         */
        public Builder measureDisplayName(String measureDisplayName) {
            Utils.checkNotNull(measureDisplayName, "measureDisplayName");
            this.measureDisplayName = Optional.ofNullable(measureDisplayName);
            return this;
        }

        /**
         * The measure's display name.
         */
        public Builder measureDisplayName(Optional<String> measureDisplayName) {
            Utils.checkNotNull(measureDisplayName, "measureDisplayName");
            this.measureDisplayName = measureDisplayName;
            return this;
        }

        /**
         * The measure's value.
         */
        public Builder value(BigDecimal value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * The measure's value.
         */
        public Builder value(double value) {
            this.value = Optional.of(BigDecimal.valueOf(value));
            return this;
        }

        /**
         * The measure's value.
         */
        public Builder value(Optional<? extends BigDecimal> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ReportComponentMeasure build() {
            return new ReportComponentMeasure(
                index,
                measureDisplayName,
                value);
        }
    }
}

