/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;


public class GetAccountingAgedCreditorsReportRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Number of periods to include in the report.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=numberOfPeriods")
    private Optional<Integer> numberOfPeriods;

    /**
     * The length of period in days.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=periodLengthDays")
    private Optional<Integer> periodLengthDays;

    /**
     * Date the report is generated up to.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reportDate")
    private Optional<LocalDate> reportDate;

    @JsonCreator
    public GetAccountingAgedCreditorsReportRequest(
            String companyId,
            Optional<Integer> numberOfPeriods,
            Optional<Integer> periodLengthDays,
            Optional<LocalDate> reportDate) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
        Utils.checkNotNull(periodLengthDays, "periodLengthDays");
        Utils.checkNotNull(reportDate, "reportDate");
        this.companyId = companyId;
        this.numberOfPeriods = numberOfPeriods;
        this.periodLengthDays = periodLengthDays;
        this.reportDate = reportDate;
    }
    
    public GetAccountingAgedCreditorsReportRequest(
            String companyId) {
        this(companyId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Number of periods to include in the report.
     */
    @JsonIgnore
    public Optional<Integer> numberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * The length of period in days.
     */
    @JsonIgnore
    public Optional<Integer> periodLengthDays() {
        return periodLengthDays;
    }

    /**
     * Date the report is generated up to.
     */
    @JsonIgnore
    public Optional<LocalDate> reportDate() {
        return reportDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingAgedCreditorsReportRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Number of periods to include in the report.
     */
    public GetAccountingAgedCreditorsReportRequest withNumberOfPeriods(int numberOfPeriods) {
        Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
        this.numberOfPeriods = Optional.ofNullable(numberOfPeriods);
        return this;
    }

    /**
     * Number of periods to include in the report.
     */
    public GetAccountingAgedCreditorsReportRequest withNumberOfPeriods(Optional<Integer> numberOfPeriods) {
        Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
        this.numberOfPeriods = numberOfPeriods;
        return this;
    }

    /**
     * The length of period in days.
     */
    public GetAccountingAgedCreditorsReportRequest withPeriodLengthDays(int periodLengthDays) {
        Utils.checkNotNull(periodLengthDays, "periodLengthDays");
        this.periodLengthDays = Optional.ofNullable(periodLengthDays);
        return this;
    }

    /**
     * The length of period in days.
     */
    public GetAccountingAgedCreditorsReportRequest withPeriodLengthDays(Optional<Integer> periodLengthDays) {
        Utils.checkNotNull(periodLengthDays, "periodLengthDays");
        this.periodLengthDays = periodLengthDays;
        return this;
    }

    /**
     * Date the report is generated up to.
     */
    public GetAccountingAgedCreditorsReportRequest withReportDate(LocalDate reportDate) {
        Utils.checkNotNull(reportDate, "reportDate");
        this.reportDate = Optional.ofNullable(reportDate);
        return this;
    }

    /**
     * Date the report is generated up to.
     */
    public GetAccountingAgedCreditorsReportRequest withReportDate(Optional<LocalDate> reportDate) {
        Utils.checkNotNull(reportDate, "reportDate");
        this.reportDate = reportDate;
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
        GetAccountingAgedCreditorsReportRequest other = (GetAccountingAgedCreditorsReportRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.numberOfPeriods, other.numberOfPeriods) &&
            Objects.deepEquals(this.periodLengthDays, other.periodLengthDays) &&
            Objects.deepEquals(this.reportDate, other.reportDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            numberOfPeriods,
            periodLengthDays,
            reportDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingAgedCreditorsReportRequest.class,
                "companyId", companyId,
                "numberOfPeriods", numberOfPeriods,
                "periodLengthDays", periodLengthDays,
                "reportDate", reportDate);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<Integer> numberOfPeriods = Optional.empty();
 
        private Optional<Integer> periodLengthDays = Optional.empty();
 
        private Optional<LocalDate> reportDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for a company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Number of periods to include in the report.
         */
        public Builder numberOfPeriods(int numberOfPeriods) {
            Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
            this.numberOfPeriods = Optional.ofNullable(numberOfPeriods);
            return this;
        }

        /**
         * Number of periods to include in the report.
         */
        public Builder numberOfPeriods(Optional<Integer> numberOfPeriods) {
            Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
            this.numberOfPeriods = numberOfPeriods;
            return this;
        }

        /**
         * The length of period in days.
         */
        public Builder periodLengthDays(int periodLengthDays) {
            Utils.checkNotNull(periodLengthDays, "periodLengthDays");
            this.periodLengthDays = Optional.ofNullable(periodLengthDays);
            return this;
        }

        /**
         * The length of period in days.
         */
        public Builder periodLengthDays(Optional<Integer> periodLengthDays) {
            Utils.checkNotNull(periodLengthDays, "periodLengthDays");
            this.periodLengthDays = periodLengthDays;
            return this;
        }

        /**
         * Date the report is generated up to.
         */
        public Builder reportDate(LocalDate reportDate) {
            Utils.checkNotNull(reportDate, "reportDate");
            this.reportDate = Optional.ofNullable(reportDate);
            return this;
        }

        /**
         * Date the report is generated up to.
         */
        public Builder reportDate(Optional<LocalDate> reportDate) {
            Utils.checkNotNull(reportDate, "reportDate");
            this.reportDate = reportDate;
            return this;
        }
        
        public GetAccountingAgedCreditorsReportRequest build() {
            return new GetAccountingAgedCreditorsReportRequest(
                companyId,
                numberOfPeriods,
                periodLengthDays,
                reportDate);
        }
    }
}

