/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Connections {

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
    private Optional<? extends List<Connection>> results;

    /**
     * Total number of items.
     */
    @JsonProperty("totalResults")
    private long totalResults;

    @JsonCreator
    public Connections(
            @JsonProperty("_links") Links links,
            @JsonProperty("pageNumber") long pageNumber,
            @JsonProperty("pageSize") long pageSize,
            @JsonProperty("results") Optional<? extends List<Connection>> results,
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
    
    public Connections(
            Links links,
            long pageNumber,
            long pageSize,
            long totalResults) {
        this(links, pageNumber, pageSize, Optional.empty(), totalResults);
    }

    @JsonIgnore
    public Links links() {
        return links;
    }

    /**
     * Current page number.
     */
    @JsonIgnore
    public long pageNumber() {
        return pageNumber;
    }

    /**
     * Number of items to return in results array.
     */
    @JsonIgnore
    public long pageSize() {
        return pageSize;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Connection>> results() {
        return (Optional<List<Connection>>) results;
    }

    /**
     * Total number of items.
     */
    @JsonIgnore
    public long totalResults() {
        return totalResults;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Connections withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    /**
     * Current page number.
     */
    public Connections withPageNumber(long pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Number of items to return in results array.
     */
    public Connections withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public Connections withResults(List<Connection> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public Connections withResults(Optional<? extends List<Connection>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * Total number of items.
     */
    public Connections withTotalResults(long totalResults) {
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
        Connections other = (Connections) o;
        return 
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.pageNumber, other.pageNumber) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.results, other.results) &&
            Objects.deepEquals(this.totalResults, other.totalResults);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            links,
            pageNumber,
            pageSize,
            results,
            totalResults);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Connections.class,
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
 
        private Optional<? extends List<Connection>> results = Optional.empty();
 
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

        public Builder results(List<Connection> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends List<Connection>> results) {
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
        
        public Connections build() {
            return new Connections(
                links,
                pageNumber,
                pageSize,
                results,
                totalResults);
        }
    }
}

