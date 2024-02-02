/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class GetAccountingBalanceSheetRequest {

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
    private Optional<? extends String> startMonth;

    public GetAccountingBalanceSheetRequest(
            String companyId,
            int periodLength,
            int periodsToCompare,
            Optional<? extends String> startMonth) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(periodLength, "periodLength");
        Utils.checkNotNull(periodsToCompare, "periodsToCompare");
        Utils.checkNotNull(startMonth, "startMonth");
        this.companyId = companyId;
        this.periodLength = periodLength;
        this.periodsToCompare = periodsToCompare;
        this.startMonth = startMonth;
    }

    /**
     * Unique identifier for a company.
     */
    public String companyId() {
        return companyId;
    }

    /**
     * Number of months defining the period of interest.
     */
    public int periodLength() {
        return periodLength;
    }

    /**
     * Number of periods with `periodLength` to compare.
     */
    public int periodsToCompare() {
        return periodsToCompare;
    }

    /**
     * The month the report starts from.
     */
    public Optional<? extends String> startMonth() {
        return startMonth;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetAccountingBalanceSheetRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Number of months defining the period of interest.
     */
    public GetAccountingBalanceSheetRequest withPeriodLength(int periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = periodLength;
        return this;
    }

    /**
     * Number of periods with `periodLength` to compare.
     */
    public GetAccountingBalanceSheetRequest withPeriodsToCompare(int periodsToCompare) {
        Utils.checkNotNull(periodsToCompare, "periodsToCompare");
        this.periodsToCompare = periodsToCompare;
        return this;
    }

    /**
     * The month the report starts from.
     */
    public GetAccountingBalanceSheetRequest withStartMonth(String startMonth) {
        Utils.checkNotNull(startMonth, "startMonth");
        this.startMonth = Optional.ofNullable(startMonth);
        return this;
    }
    
    /**
     * The month the report starts from.
     */
    public GetAccountingBalanceSheetRequest withStartMonth(Optional<? extends String> startMonth) {
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
        GetAccountingBalanceSheetRequest other = (GetAccountingBalanceSheetRequest) o;
        return 
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.periodLength, other.periodLength) &&
            java.util.Objects.deepEquals(this.periodsToCompare, other.periodsToCompare) &&
            java.util.Objects.deepEquals(this.startMonth, other.startMonth);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            companyId,
            periodLength,
            periodsToCompare,
            startMonth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccountingBalanceSheetRequest.class,
                "companyId", companyId,
                "periodLength", periodLength,
                "periodsToCompare", periodsToCompare,
                "startMonth", startMonth);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Integer periodLength;
 
        private Integer periodsToCompare;
 
        private Optional<? extends String> startMonth = Optional.empty();  
        
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
        public Builder startMonth(Optional<? extends String> startMonth) {
            Utils.checkNotNull(startMonth, "startMonth");
            this.startMonth = startMonth;
            return this;
        }        
        
        public GetAccountingBalanceSheetRequest build() {
            return new GetAccountingBalanceSheetRequest(
                companyId,
                periodLength,
                periodsToCompare,
                startMonth);
        }
    }
}

