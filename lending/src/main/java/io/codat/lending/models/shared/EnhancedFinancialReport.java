/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;


public class EnhancedFinancialReport {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportInfo")
    private Optional<? extends EnhancedReportInfo> reportInfo;

    /**
     * An array of report items.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportItems")
    private Optional<? extends java.util.List<ReportItem>> reportItems;

    public EnhancedFinancialReport(
            @JsonProperty("reportInfo") Optional<? extends EnhancedReportInfo> reportInfo,
            @JsonProperty("reportItems") Optional<? extends java.util.List<ReportItem>> reportItems) {
        Utils.checkNotNull(reportInfo, "reportInfo");
        Utils.checkNotNull(reportItems, "reportItems");
        this.reportInfo = reportInfo;
        this.reportItems = reportItems;
    }

    public Optional<? extends EnhancedReportInfo> reportInfo() {
        return reportInfo;
    }

    /**
     * An array of report items.
     */
    public Optional<? extends java.util.List<ReportItem>> reportItems() {
        return reportItems;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public EnhancedFinancialReport withReportInfo(EnhancedReportInfo reportInfo) {
        Utils.checkNotNull(reportInfo, "reportInfo");
        this.reportInfo = Optional.ofNullable(reportInfo);
        return this;
    }
    
    public EnhancedFinancialReport withReportInfo(Optional<? extends EnhancedReportInfo> reportInfo) {
        Utils.checkNotNull(reportInfo, "reportInfo");
        this.reportInfo = reportInfo;
        return this;
    }

    /**
     * An array of report items.
     */
    public EnhancedFinancialReport withReportItems(java.util.List<ReportItem> reportItems) {
        Utils.checkNotNull(reportItems, "reportItems");
        this.reportItems = Optional.ofNullable(reportItems);
        return this;
    }
    
    /**
     * An array of report items.
     */
    public EnhancedFinancialReport withReportItems(Optional<? extends java.util.List<ReportItem>> reportItems) {
        Utils.checkNotNull(reportItems, "reportItems");
        this.reportItems = reportItems;
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
        EnhancedFinancialReport other = (EnhancedFinancialReport) o;
        return 
            java.util.Objects.deepEquals(this.reportInfo, other.reportInfo) &&
            java.util.Objects.deepEquals(this.reportItems, other.reportItems);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            reportInfo,
            reportItems);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnhancedFinancialReport.class,
                "reportInfo", reportInfo,
                "reportItems", reportItems);
    }
    
    public final static class Builder {
 
        private Optional<? extends EnhancedReportInfo> reportInfo = Optional.empty();
 
        private Optional<? extends java.util.List<ReportItem>> reportItems = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder reportInfo(EnhancedReportInfo reportInfo) {
            Utils.checkNotNull(reportInfo, "reportInfo");
            this.reportInfo = Optional.ofNullable(reportInfo);
            return this;
        }
        
        public Builder reportInfo(Optional<? extends EnhancedReportInfo> reportInfo) {
            Utils.checkNotNull(reportInfo, "reportInfo");
            this.reportInfo = reportInfo;
            return this;
        }

        /**
         * An array of report items.
         */
        public Builder reportItems(java.util.List<ReportItem> reportItems) {
            Utils.checkNotNull(reportItems, "reportItems");
            this.reportItems = Optional.ofNullable(reportItems);
            return this;
        }
        
        /**
         * An array of report items.
         */
        public Builder reportItems(Optional<? extends java.util.List<ReportItem>> reportItems) {
            Utils.checkNotNull(reportItems, "reportItems");
            this.reportItems = reportItems;
            return this;
        }
        
        public EnhancedFinancialReport build() {
            return new EnhancedFinancialReport(
                reportInfo,
                reportItems);
        }
    }
}
