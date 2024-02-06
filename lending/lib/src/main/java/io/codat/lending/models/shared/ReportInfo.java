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

/**
 * ReportInfo - Report additional information, which is specific to Lending API reports.
 */

public class ReportInfo {

    /**
     * The name of the company being queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("companyName")
    private Optional<? extends String> companyName;

    /**
     * Date the report was generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("generatedDate")
    private Optional<? extends String> generatedDate;

    /**
     * The number of the page queried.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageNumber")
    private Optional<? extends Long> pageNumber;

    /**
     * The number of transactions returned per page.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Name of the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportName")
    private Optional<? extends String> reportName;

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalResults")
    private Optional<? extends Long> totalResults;

    public ReportInfo(
            @JsonProperty("companyName") Optional<? extends String> companyName,
            @JsonProperty("generatedDate") Optional<? extends String> generatedDate,
            @JsonProperty("pageNumber") Optional<? extends Long> pageNumber,
            @JsonProperty("pageSize") Optional<? extends Long> pageSize,
            @JsonProperty("reportName") Optional<? extends String> reportName,
            @JsonProperty("totalResults") Optional<? extends Long> totalResults) {
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

    /**
     * The name of the company being queried.
     */
    public Optional<? extends String> companyName() {
        return companyName;
    }

    /**
     * Date the report was generated.
     */
    public Optional<? extends String> generatedDate() {
        return generatedDate;
    }

    /**
     * The number of the page queried.
     */
    public Optional<? extends Long> pageNumber() {
        return pageNumber;
    }

    /**
     * The number of transactions returned per page.
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    /**
     * Name of the report.
     */
    public Optional<? extends String> reportName() {
        return reportName;
    }

    /**
     * The total number of transactions available for a company for the period specified in the query string.
     */
    public Optional<? extends Long> totalResults() {
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
    public ReportInfo withCompanyName(Optional<? extends String> companyName) {
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
    public ReportInfo withGeneratedDate(Optional<? extends String> generatedDate) {
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
    public ReportInfo withPageNumber(Optional<? extends Long> pageNumber) {
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
    public ReportInfo withPageSize(Optional<? extends Long> pageSize) {
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
    public ReportInfo withReportName(Optional<? extends String> reportName) {
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
    public ReportInfo withTotalResults(Optional<? extends Long> totalResults) {
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
            java.util.Objects.deepEquals(this.companyName, other.companyName) &&
            java.util.Objects.deepEquals(this.generatedDate, other.generatedDate) &&
            java.util.Objects.deepEquals(this.pageNumber, other.pageNumber) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.reportName, other.reportName) &&
            java.util.Objects.deepEquals(this.totalResults, other.totalResults);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> companyName = Optional.empty();
 
        private Optional<? extends String> generatedDate = Optional.empty();
 
        private Optional<? extends Long> pageNumber = Optional.empty();
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends String> reportName = Optional.empty();
 
        private Optional<? extends Long> totalResults = Optional.empty();  
        
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
        public Builder companyName(Optional<? extends String> companyName) {
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
        public Builder generatedDate(Optional<? extends String> generatedDate) {
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
        public Builder pageNumber(Optional<? extends Long> pageNumber) {
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
        public Builder pageSize(Optional<? extends Long> pageSize) {
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
        public Builder reportName(Optional<? extends String> reportName) {
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
        public Builder totalResults(Optional<? extends Long> totalResults) {
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

