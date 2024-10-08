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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class LoanTransactions {

    /**
     * If there are no errors, an empty array is returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends List<Object>> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportInfo")
    private Optional<? extends LoanTransactionsReportInfo> reportInfo;

    /**
     * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reportItems")
    private Optional<? extends List<ReportItems>> reportItems;

    @JsonCreator
    public LoanTransactions(
            @JsonProperty("errors") Optional<? extends List<Object>> errors,
            @JsonProperty("reportInfo") Optional<? extends LoanTransactionsReportInfo> reportInfo,
            @JsonProperty("reportItems") Optional<? extends List<ReportItems>> reportItems) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(reportInfo, "reportInfo");
        Utils.checkNotNull(reportItems, "reportItems");
        this.errors = errors;
        this.reportInfo = reportInfo;
        this.reportItems = reportItems;
    }
    
    public LoanTransactions() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * If there are no errors, an empty array is returned.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Object>> errors() {
        return (Optional<List<Object>>) errors;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LoanTransactionsReportInfo> reportInfo() {
        return (Optional<LoanTransactionsReportInfo>) reportInfo;
    }

    /**
     * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ReportItems>> reportItems() {
        return (Optional<List<ReportItems>>) reportItems;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If there are no errors, an empty array is returned.
     */
    public LoanTransactions withErrors(List<Object> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    /**
     * If there are no errors, an empty array is returned.
     */
    public LoanTransactions withErrors(Optional<? extends List<Object>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public LoanTransactions withReportInfo(LoanTransactionsReportInfo reportInfo) {
        Utils.checkNotNull(reportInfo, "reportInfo");
        this.reportInfo = Optional.ofNullable(reportInfo);
        return this;
    }

    public LoanTransactions withReportInfo(Optional<? extends LoanTransactionsReportInfo> reportInfo) {
        Utils.checkNotNull(reportInfo, "reportInfo");
        this.reportInfo = reportInfo;
        return this;
    }

    /**
     * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
     */
    public LoanTransactions withReportItems(List<ReportItems> reportItems) {
        Utils.checkNotNull(reportItems, "reportItems");
        this.reportItems = Optional.ofNullable(reportItems);
        return this;
    }

    /**
     * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
     */
    public LoanTransactions withReportItems(Optional<? extends List<ReportItems>> reportItems) {
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
        LoanTransactions other = (LoanTransactions) o;
        return 
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.reportInfo, other.reportInfo) &&
            Objects.deepEquals(this.reportItems, other.reportItems);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errors,
            reportInfo,
            reportItems);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LoanTransactions.class,
                "errors", errors,
                "reportInfo", reportInfo,
                "reportItems", reportItems);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Object>> errors = Optional.empty();
 
        private Optional<? extends LoanTransactionsReportInfo> reportInfo = Optional.empty();
 
        private Optional<? extends List<ReportItems>> reportItems = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If there are no errors, an empty array is returned.
         */
        public Builder errors(List<Object> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        /**
         * If there are no errors, an empty array is returned.
         */
        public Builder errors(Optional<? extends List<Object>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder reportInfo(LoanTransactionsReportInfo reportInfo) {
            Utils.checkNotNull(reportInfo, "reportInfo");
            this.reportInfo = Optional.ofNullable(reportInfo);
            return this;
        }

        public Builder reportInfo(Optional<? extends LoanTransactionsReportInfo> reportInfo) {
            Utils.checkNotNull(reportInfo, "reportInfo");
            this.reportInfo = reportInfo;
            return this;
        }

        /**
         * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
         */
        public Builder reportItems(List<ReportItems> reportItems) {
            Utils.checkNotNull(reportItems, "reportItems");
            this.reportItems = Optional.ofNullable(reportItems);
            return this;
        }

        /**
         * Contains object of reporting properties. The loan ref will reference a different object depending on the integration type.
         */
        public Builder reportItems(Optional<? extends List<ReportItems>> reportItems) {
            Utils.checkNotNull(reportItems, "reportItems");
            this.reportItems = reportItems;
            return this;
        }
        
        public LoanTransactions build() {
            return new LoanTransactions(
                errors,
                reportInfo,
                reportItems);
        }
    }
}

