/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.accounting.models.components;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.accounting.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class Payments {

    @JsonProperty("_links")
    private Links links;

    /**
     * Current page number.
     */
    @JsonProperty("pageNumber")
    private long pageNumber;

    /**
     * Number of items to return in results array.
     */
    @JsonProperty("pageSize")
    private long pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends java.util.List<Payment>> results;

    /**
     * Total number of items.
     */
    @JsonProperty("totalResults")
    private long totalResults;

    public Payments(
            @JsonProperty("_links") Links links,
            @JsonProperty("pageNumber") long pageNumber,
            @JsonProperty("pageSize") long pageSize,
            @JsonProperty("results") Optional<? extends java.util.List<Payment>> results,
            @JsonProperty("totalResults") long totalResults) {
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(pageNumber, "pageNumber");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(totalResults, "totalResults");
        this.links = links;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.results = results;
        this.totalResults = totalResults;
    }

    public Links links() {
        return links;
    }

    /**
     * Current page number.
     */
    public long pageNumber() {
        return pageNumber;
    }

    /**
     * Number of items to return in results array.
     */
    public long pageSize() {
        return pageSize;
    }

    public Optional<? extends java.util.List<Payment>> results() {
        return results;
    }

    /**
     * Total number of items.
     */
    public long totalResults() {
        return totalResults;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Payments withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    /**
     * Current page number.
     */
    public Payments withPageNumber(long pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Number of items to return in results array.
     */
    public Payments withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public Payments withResults(java.util.List<Payment> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }
    
    public Payments withResults(Optional<? extends java.util.List<Payment>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * Total number of items.
     */
    public Payments withTotalResults(long totalResults) {
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
        Payments other = (Payments) o;
        return 
            java.util.Objects.deepEquals(this.links, other.links) &&
            java.util.Objects.deepEquals(this.pageNumber, other.pageNumber) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.results, other.results) &&
            java.util.Objects.deepEquals(this.totalResults, other.totalResults);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            links,
            pageNumber,
            pageSize,
            results,
            totalResults);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Payments.class,
                "links", links,
                "pageNumber", pageNumber,
                "pageSize", pageSize,
                "results", results,
                "totalResults", totalResults);
    }
    
    public final static class Builder {
 
        private Links links;
 
        private Long pageNumber;
 
        private Long pageSize;
 
        private Optional<? extends java.util.List<Payment>> results = Optional.empty();
 
        private Long totalResults;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder links(Links links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        /**
         * Current page number.
         */
        public Builder pageNumber(long pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Number of items to return in results array.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder results(java.util.List<Payment> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }
        
        public Builder results(Optional<? extends java.util.List<Payment>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }

        /**
         * Total number of items.
         */
        public Builder totalResults(long totalResults) {
            Utils.checkNotNull(totalResults, "totalResults");
            this.totalResults = totalResults;
            return this;
        }
        
        public Payments build() {
            return new Payments(
                links,
                pageNumber,
                pageSize,
                results,
                totalResults);
        }
    }
}

