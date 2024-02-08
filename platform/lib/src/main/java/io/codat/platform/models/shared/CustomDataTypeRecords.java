/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.util.Optional;

/**
 * CustomDataTypeRecords - Resulting records pulled from the source platform for a specific custom data type.
 */

public class CustomDataTypeRecords {

    /**
     * Current page number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageNumber")
    private Optional<? extends Long> pageNumber;

    /**
     * Number of items to return in results array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<? extends Long> pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends java.util.List<CustomDataTypeRecord>> results;

    /**
     * Total number of items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalResults")
    private Optional<? extends Long> totalResults;

    public CustomDataTypeRecords(
            @JsonProperty("pageNumber") Optional<? extends Long> pageNumber,
            @JsonProperty("pageSize") Optional<? extends Long> pageSize,
            @JsonProperty("results") Optional<? extends java.util.List<CustomDataTypeRecord>> results,
            @JsonProperty("totalResults") Optional<? extends Long> totalResults) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(totalResults, "totalResults");
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.results = results;
        this.totalResults = totalResults;
    }

    /**
     * Current page number.
     */
    public Optional<? extends Long> pageNumber() {
        return pageNumber;
    }

    /**
     * Number of items to return in results array.
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    public Optional<? extends java.util.List<CustomDataTypeRecord>> results() {
        return results;
    }

    /**
     * Total number of items.
     */
    public Optional<? extends Long> totalResults() {
        return totalResults;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Current page number.
     */
    public CustomDataTypeRecords withPageNumber(long pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = Optional.ofNullable(pageNumber);
        return this;
    }
    
    /**
     * Current page number.
     */
    public CustomDataTypeRecords withPageNumber(Optional<? extends Long> pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Number of items to return in results array.
     */
    public CustomDataTypeRecords withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }
    
    /**
     * Number of items to return in results array.
     */
    public CustomDataTypeRecords withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public CustomDataTypeRecords withResults(java.util.List<CustomDataTypeRecord> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }
    
    public CustomDataTypeRecords withResults(Optional<? extends java.util.List<CustomDataTypeRecord>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * Total number of items.
     */
    public CustomDataTypeRecords withTotalResults(long totalResults) {
        Utils.checkNotNull(totalResults, "totalResults");
        this.totalResults = Optional.ofNullable(totalResults);
        return this;
    }
    
    /**
     * Total number of items.
     */
    public CustomDataTypeRecords withTotalResults(Optional<? extends Long> totalResults) {
        Utils.checkNotNull(totalResults, "totalResults");
        this.totalResults = totalResults;
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
        CustomDataTypeRecords other = (CustomDataTypeRecords) o;
        return 
            java.util.Objects.deepEquals(this.pageNumber, other.pageNumber) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.results, other.results) &&
            java.util.Objects.deepEquals(this.totalResults, other.totalResults);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            pageNumber,
            pageSize,
            results,
            totalResults);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomDataTypeRecords.class,
                "pageNumber", pageNumber,
                "pageSize", pageSize,
                "results", results,
                "totalResults", totalResults);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> pageNumber = Optional.empty();
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends java.util.List<CustomDataTypeRecord>> results = Optional.empty();
 
        private Optional<? extends Long> totalResults = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Current page number.
         */
        public Builder pageNumber(long pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = Optional.ofNullable(pageNumber);
            return this;
        }
        
        /**
         * Current page number.
         */
        public Builder pageNumber(Optional<? extends Long> pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Number of items to return in results array.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }
        
        /**
         * Number of items to return in results array.
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder results(java.util.List<CustomDataTypeRecord> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }
        
        public Builder results(Optional<? extends java.util.List<CustomDataTypeRecord>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }

        /**
         * Total number of items.
         */
        public Builder totalResults(long totalResults) {
            Utils.checkNotNull(totalResults, "totalResults");
            this.totalResults = Optional.ofNullable(totalResults);
            return this;
        }
        
        /**
         * Total number of items.
         */
        public Builder totalResults(Optional<? extends Long> totalResults) {
            Utils.checkNotNull(totalResults, "totalResults");
            this.totalResults = totalResults;
            return this;
        }        
        
        public CustomDataTypeRecords build() {
            return new CustomDataTypeRecords(
                pageNumber,
                pageSize,
                results,
                totalResults);
        }
    }
}
