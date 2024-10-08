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
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class TransactionCategory {

    /**
     * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confidence")
    private Optional<? extends BigDecimal> confidence;

    /**
     * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confidences")
    private Optional<? extends List<BigDecimal>> confidences;

    /**
     * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("levels")
    private Optional<? extends List<String>> levels;

    @JsonCreator
    public TransactionCategory(
            @JsonProperty("confidence") Optional<? extends BigDecimal> confidence,
            @JsonProperty("confidences") Optional<? extends List<BigDecimal>> confidences,
            @JsonProperty("levels") Optional<? extends List<String>> levels) {
        Utils.checkNotNull(confidence, "confidence");
        Utils.checkNotNull(confidences, "confidences");
        Utils.checkNotNull(levels, "levels");
        this.confidence = confidence;
        this.confidences = confidences;
        this.levels = levels;
    }
    
    public TransactionCategory() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigDecimal> confidence() {
        return (Optional<BigDecimal>) confidence;
    }

    /**
     * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<BigDecimal>> confidences() {
        return (Optional<List<BigDecimal>>) confidences;
    }

    /**
     * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> levels() {
        return (Optional<List<String>>) levels;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
     */
    public TransactionCategory withConfidence(BigDecimal confidence) {
        Utils.checkNotNull(confidence, "confidence");
        this.confidence = Optional.ofNullable(confidence);
        return this;
    }

        /**
         * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
         */
    public TransactionCategory withConfidence(double confidence) {
        this.confidence = Optional.of(BigDecimal.valueOf(confidence));
        return this;
    }

    /**
     * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
     */
    public TransactionCategory withConfidence(Optional<? extends BigDecimal> confidence) {
        Utils.checkNotNull(confidence, "confidence");
        this.confidence = confidence;
        return this;
    }

    /**
     * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
     */
    public TransactionCategory withConfidences(List<BigDecimal> confidences) {
        Utils.checkNotNull(confidences, "confidences");
        this.confidences = Optional.ofNullable(confidences);
        return this;
    }

    /**
     * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
     */
    public TransactionCategory withConfidences(Optional<? extends List<BigDecimal>> confidences) {
        Utils.checkNotNull(confidences, "confidences");
        this.confidences = confidences;
        return this;
    }

    /**
     * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
     */
    public TransactionCategory withLevels(List<String> levels) {
        Utils.checkNotNull(levels, "levels");
        this.levels = Optional.ofNullable(levels);
        return this;
    }

    /**
     * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
     */
    public TransactionCategory withLevels(Optional<? extends List<String>> levels) {
        Utils.checkNotNull(levels, "levels");
        this.levels = levels;
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
        TransactionCategory other = (TransactionCategory) o;
        return 
            Objects.deepEquals(this.confidence, other.confidence) &&
            Objects.deepEquals(this.confidences, other.confidences) &&
            Objects.deepEquals(this.levels, other.levels);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            confidence,
            confidences,
            levels);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransactionCategory.class,
                "confidence", confidence,
                "confidences", confidences,
                "levels", levels);
    }
    
    public final static class Builder {
 
        private Optional<? extends BigDecimal> confidence = Optional.empty();
 
        private Optional<? extends List<BigDecimal>> confidences = Optional.empty();
 
        private Optional<? extends List<String>> levels = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
         */
        public Builder confidence(BigDecimal confidence) {
            Utils.checkNotNull(confidence, "confidence");
            this.confidence = Optional.ofNullable(confidence);
            return this;
        }

        /**
         * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
         */
        public Builder confidence(double confidence) {
            this.confidence = Optional.of(BigDecimal.valueOf(confidence));
            return this;
        }

        /**
         * Returns the aggregate confidence of the suggested category for the transaction. The value is between 0 and 100.
         */
        public Builder confidence(Optional<? extends BigDecimal> confidence) {
            Utils.checkNotNull(confidence, "confidence");
            this.confidence = confidence;
            return this;
        }

        /**
         * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
         */
        public Builder confidences(List<BigDecimal> confidences) {
            Utils.checkNotNull(confidences, "confidences");
            this.confidences = Optional.ofNullable(confidences);
            return this;
        }

        /**
         * An ordered array of category level confidences where each element is the confidence of the corresponding item in the `levels` array.
         */
        public Builder confidences(Optional<? extends List<BigDecimal>> confidences) {
            Utils.checkNotNull(confidences, "confidences");
            this.confidences = confidences;
            return this;
        }

        /**
         * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
         */
        public Builder levels(List<String> levels) {
            Utils.checkNotNull(levels, "levels");
            this.levels = Optional.ofNullable(levels);
            return this;
        }

        /**
         * The suggested category is an ordered array of category levels where each element (or level) is a subcategory of the previous element (or level).
         */
        public Builder levels(Optional<? extends List<String>> levels) {
            Utils.checkNotNull(levels, "levels");
            this.levels = levels;
            return this;
        }
        
        public TransactionCategory build() {
            return new TransactionCategory(
                confidence,
                confidences,
                levels);
        }
    }
}

