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
import java.util.Objects;
import java.util.Optional;

/**
 * ReportInfo - Report additional information, which is specific to Lending API reports.
 */

public class ReportInfo {

    /**
     * The name of the company being queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyName")
    private Optional<String> companyName;

    /**
     * Date the report was generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("generatedDate")
    private Optional<String> generatedDate;

    /**
     * The number of the page queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageNumber")
    private Optional<Long> pageNumber;

    /**
     * The number of transactions returned per page.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<Long> pageSize;

    /**
     * Name of the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportName")
    private Optional<String> reportName;

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalResults")
    private Optional<Long> totalResults;

    @JsonCreator
    public ReportInfo(
            @JsonProperty("companyName") Optional<String> companyName,
            @JsonProperty("generatedDate") Optional<String> generatedDate,
            @JsonProperty("pageNumber") Optional<Long> pageNumber,
            @JsonProperty("pageSize") Optional<Long> pageSize,
            @JsonProperty("reportName") Optional<String> reportName,
            @JsonProperty("totalResults") Optional<Long> totalResults) {
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(generatedDate, "generatedDate");
        Utils.checkNotNull(pageNumber, "pageNumber");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(reportName, "reportName");
        Utils.checkNotNull(totalResults, "totalResults");
        this.companyName = companyName;
        this.generatedDate = generatedDate;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.reportName = reportName;
        this.totalResults = totalResults;
    }
    
    public ReportInfo() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The name of the company being queried.
     */
    @JsonIgnore
    public Optional<String> companyName() {
        return companyName;
    }

    /**
     * Date the report was generated.
     */
    @JsonIgnore
    public Optional<String> generatedDate() {
        return generatedDate;
    }

    /**
     * The number of the page queried.
     */
    @JsonIgnore
    public Optional<Long> pageNumber() {
        return pageNumber;
    }

    /**
     * The number of transactions returned per page.
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    /**
     * Name of the report.
     */
    @JsonIgnore
    public Optional<String> reportName() {
        return reportName;
    }

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    @JsonIgnore
    public Optional<Long> totalResults() {
        return totalResults;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the company being queried.
     */
    public ReportInfo withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = Optional.ofNullable(companyName);
        return this;
    }

    /**
     * The name of the company being queried.
     */
    public ReportInfo withCompanyName(Optional<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * Date the report was generated.
     */
    public ReportInfo withGeneratedDate(String generatedDate) {
        Utils.checkNotNull(generatedDate, "generatedDate");
        this.generatedDate = Optional.ofNullable(generatedDate);
        return this;
    }

    /**
     * Date the report was generated.
     */
    public ReportInfo withGeneratedDate(Optional<String> generatedDate) {
        Utils.checkNotNull(generatedDate, "generatedDate");
        this.generatedDate = generatedDate;
        return this;
    }

    /**
     * The number of the page queried.
     */
    public ReportInfo withPageNumber(long pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = Optional.ofNullable(pageNumber);
        return this;
    }

    /**
     * The number of the page queried.
     */
    public ReportInfo withPageNumber(Optional<Long> pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * The number of transactions returned per page.
     */
    public ReportInfo withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The number of transactions returned per page.
     */
    public ReportInfo withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Name of the report.
     */
    public ReportInfo withReportName(String reportName) {
        Utils.checkNotNull(reportName, "reportName");
        this.reportName = Optional.ofNullable(reportName);
        return this;
    }

    /**
     * Name of the report.
     */
    public ReportInfo withReportName(Optional<String> reportName) {
        Utils.checkNotNull(reportName, "reportName");
        this.reportName = reportName;
        return this;
    }

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    public ReportInfo withTotalResults(long totalResults) {
        Utils.checkNotNull(totalResults, "totalResults");
        this.totalResults = Optional.ofNullable(totalResults);
        return this;
    }

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    public ReportInfo withTotalResults(Optional<Long> totalResults) {
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
        ReportInfo other = (ReportInfo) o;
        return 
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.generatedDate, other.generatedDate) &&
            Objects.deepEquals(this.pageNumber, other.pageNumber) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.reportName, other.reportName) &&
            Objects.deepEquals(this.totalResults, other.totalResults);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyName,
            generatedDate,
            pageNumber,
            pageSize,
            reportName,
            totalResults);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportInfo.class,
                "companyName", companyName,
                "generatedDate", generatedDate,
                "pageNumber", pageNumber,
                "pageSize", pageSize,
                "reportName", reportName,
                "totalResults", totalResults);
    }
    
    public final static class Builder {
 
        private Optional<String> companyName = Optional.empty();
 
        private Optional<String> generatedDate = Optional.empty();
 
        private Optional<Long> pageNumber = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<String> reportName = Optional.empty();
 
        private Optional<Long> totalResults = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the company being queried.
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = Optional.ofNullable(companyName);
            return this;
        }

        /**
         * The name of the company being queried.
         */
        public Builder companyName(Optional<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }

        /**
         * Date the report was generated.
         */
        public Builder generatedDate(String generatedDate) {
            Utils.checkNotNull(generatedDate, "generatedDate");
            this.generatedDate = Optional.ofNullable(generatedDate);
            return this;
        }

        /**
         * Date the report was generated.
         */
        public Builder generatedDate(Optional<String> generatedDate) {
            Utils.checkNotNull(generatedDate, "generatedDate");
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * The number of the page queried.
         */
        public Builder pageNumber(long pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = Optional.ofNullable(pageNumber);
            return this;
        }

        /**
         * The number of the page queried.
         */
        public Builder pageNumber(Optional<Long> pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of transactions returned per page.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The number of transactions returned per page.
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Name of the report.
         */
        public Builder reportName(String reportName) {
            Utils.checkNotNull(reportName, "reportName");
            this.reportName = Optional.ofNullable(reportName);
            return this;
        }

        /**
         * Name of the report.
         */
        public Builder reportName(Optional<String> reportName) {
            Utils.checkNotNull(reportName, "reportName");
            this.reportName = reportName;
            return this;
        }

        /**
         * The total number of transactions available for a company for the period specified in the query string.
         */
        public Builder totalResults(long totalResults) {
            Utils.checkNotNull(totalResults, "totalResults");
            this.totalResults = Optional.ofNullable(totalResults);
            return this;
        }

        /**
         * The total number of transactions available for a company for the period specified in the query string.
         */
        public Builder totalResults(Optional<Long> totalResults) {
            Utils.checkNotNull(totalResults, "totalResults");
            this.totalResults = totalResults;
            return this;
        }
        
        public ReportInfo build() {
            return new ReportInfo(
                companyName,
                generatedDate,
                pageNumber,
                pageSize,
                reportName,
                totalResults);
        }
    }
}

