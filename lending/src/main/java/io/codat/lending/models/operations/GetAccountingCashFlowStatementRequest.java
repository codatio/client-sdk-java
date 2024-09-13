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
import java.util.Objects;
import java.util.Optional;


public class GetAccountingCashFlowStatementRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Number of months defining the period of interest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=periodLength")
    private int periodLength;

    /**
     * Number of periods with `periodLength` to compare.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=periodsToCompare")
    private int periodsToCompare;

    /**
     * The month the report starts from.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startMonth")
    private Optional<String> startMonth;

    @JsonCreator
    public GetAccountingCashFlowStatementRequest(
            String companyId,
            int periodLength,
            int periodsToCompare,
            Optional<String> startMonth) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(periodLength, "periodLength");
        Utils.checkNotNull(periodsToCompare, "periodsToCompare");
        Utils.checkNotNull(startMonth, "startMonth");
        this.companyId = companyId;
        this.periodLength = periodLength;
        this.periodsToCompare = periodsToCompare;
        this.startMonth = startMonth;
    }
    
    public GetAccountingCashFlowStatementRequest(
            String companyId,
            int periodLength,
            int periodsToCompare) {
        this(companyId, periodLength, periodsToCompare, Optional.empty());
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Number of months defining the period of interest.
     */
    @JsonIgnore
    public int periodLength() {
        return periodLength;
    }

    /**
     * Number of periods with `periodLength` to compare.
     */
    @JsonIgnore
    public int periodsToCompare() {
        return periodsToCompare;
    }

    /**
     * The month the report starts from.
     */
    @JsonIgnore
    public Optional<String> startMonth() {
        return startMonth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingCashFlowStatementRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Number of months defining the period of interest.
     */
    public GetAccountingCashFlowStatementRequest withPeriodLength(int periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = periodLength;
        return this;
    }

    /**
     * Number of periods with `periodLength` to compare.
     */
    public GetAccountingCashFlowStatementRequest withPeriodsToCompare(int periodsToCompare) {
        Utils.checkNotNull(periodsToCompare, "periodsToCompare");
        this.periodsToCompare = periodsToCompare;
        return this;
    }

    /**
     * The month the report starts from.
     */
    public GetAccountingCashFlowStatementRequest withStartMonth(String startMonth) {
        Utils.checkNotNull(startMonth, "startMonth");
        this.startMonth = Optional.ofNullable(startMonth);
        return this;
    }

    /**
     * The month the report starts from.
     */
    public GetAccountingCashFlowStatementRequest withStartMonth(Optional<String> startMonth) {
        Utils.checkNotNull(startMonth, "startMonth");
        this.startMonth = startMonth;
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
        GetAccountingCashFlowStatementRequest other = (GetAccountingCashFlowStatementRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.periodLength, other.periodLength) &&
            Objects.deepEquals(this.periodsToCompare, other.periodsToCompare) &&
            Objects.deepEquals(this.startMonth, other.startMonth);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            periodLength,
            periodsToCompare,
            startMonth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingCashFlowStatementRequest.class,
                "companyId", companyId,
                "periodLength", periodLength,
                "periodsToCompare", periodsToCompare,
                "startMonth", startMonth);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Integer periodLength;
 
        private Integer periodsToCompare;
 
        private Optional<String> startMonth = Optional.empty();  
        
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
         * Number of months defining the period of interest.
         */
        public Builder periodLength(int periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = periodLength;
            return this;
        }

        /**
         * Number of periods with `periodLength` to compare.
         */
        public Builder periodsToCompare(int periodsToCompare) {
            Utils.checkNotNull(periodsToCompare, "periodsToCompare");
            this.periodsToCompare = periodsToCompare;
            return this;
        }

        /**
         * The month the report starts from.
         */
        public Builder startMonth(String startMonth) {
            Utils.checkNotNull(startMonth, "startMonth");
            this.startMonth = Optional.ofNullable(startMonth);
            return this;
        }

        /**
         * The month the report starts from.
         */
        public Builder startMonth(Optional<String> startMonth) {
            Utils.checkNotNull(startMonth, "startMonth");
            this.startMonth = startMonth;
            return this;
        }
        
        public GetAccountingCashFlowStatementRequest build() {
            return new GetAccountingCashFlowStatementRequest(
                companyId,
                periodLength,
                periodsToCompare,
                startMonth);
        }
    }
}

