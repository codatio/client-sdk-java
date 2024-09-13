/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.codat.lending.models.shared.PeriodUnit;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetCommerceOrdersReportRequest {

    /**
     * Unique identifier for a company.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=companyId")
    private String companyId;

    /**
     * Unique identifier for a connection.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectionId")
    private String connectionId;

    /**
     * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDisplayNames")
    private Optional<Boolean> includeDisplayNames;

    /**
     * The number of periods to return. There will be no pagination as a query parameter.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=numberOfPeriods")
    private long numberOfPeriods;

    /**
     * The number of months per period. E.g. 2 = 2 months per period.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=periodLength")
    private long periodLength;

    /**
     * The period unit of time returned.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=periodUnit")
    private PeriodUnit periodUnit;

    /**
     * The date in which the report is created up to. Users must specify a specific date, however the response will be provided for the full month.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reportDate")
    private String reportDate;

    @JsonCreator
    public GetCommerceOrdersReportRequest(
            String companyId,
            String connectionId,
            Optional<Boolean> includeDisplayNames,
            long numberOfPeriods,
            long periodLength,
            PeriodUnit periodUnit,
            String reportDate) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(connectionId, "connectionId");
        Utils.checkNotNull(includeDisplayNames, "includeDisplayNames");
        Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
        Utils.checkNotNull(periodLength, "periodLength");
        Utils.checkNotNull(periodUnit, "periodUnit");
        Utils.checkNotNull(reportDate, "reportDate");
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.includeDisplayNames = includeDisplayNames;
        this.numberOfPeriods = numberOfPeriods;
        this.periodLength = periodLength;
        this.periodUnit = periodUnit;
        this.reportDate = reportDate;
    }
    
    public GetCommerceOrdersReportRequest(
            String companyId,
            String connectionId,
            long numberOfPeriods,
            long periodLength,
            PeriodUnit periodUnit,
            String reportDate) {
        this(companyId, connectionId, Optional.empty(), numberOfPeriods, periodLength, periodUnit, reportDate);
    }

    /**
     * Unique identifier for a company.
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Unique identifier for a connection.
     */
    @JsonIgnore
    public String connectionId() {
        return connectionId;
    }

    /**
     * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
     */
    @JsonIgnore
    public Optional<Boolean> includeDisplayNames() {
        return includeDisplayNames;
    }

    /**
     * The number of periods to return. There will be no pagination as a query parameter.
     */
    @JsonIgnore
    public long numberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * The number of months per period. E.g. 2 = 2 months per period.
     */
    @JsonIgnore
    public long periodLength() {
        return periodLength;
    }

    /**
     * The period unit of time returned.
     */
    @JsonIgnore
    public PeriodUnit periodUnit() {
        return periodUnit;
    }

    /**
     * The date in which the report is created up to. Users must specify a specific date, however the response will be provided for the full month.
     */
    @JsonIgnore
    public String reportDate() {
        return reportDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for a company.
     */
    public GetCommerceOrdersReportRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for a connection.
     */
    public GetCommerceOrdersReportRequest withConnectionId(String connectionId) {
        Utils.checkNotNull(connectionId, "connectionId");
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
     */
    public GetCommerceOrdersReportRequest withIncludeDisplayNames(boolean includeDisplayNames) {
        Utils.checkNotNull(includeDisplayNames, "includeDisplayNames");
        this.includeDisplayNames = Optional.ofNullable(includeDisplayNames);
        return this;
    }

    /**
     * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
     */
    public GetCommerceOrdersReportRequest withIncludeDisplayNames(Optional<Boolean> includeDisplayNames) {
        Utils.checkNotNull(includeDisplayNames, "includeDisplayNames");
        this.includeDisplayNames = includeDisplayNames;
        return this;
    }

    /**
     * The number of periods to return. There will be no pagination as a query parameter.
     */
    public GetCommerceOrdersReportRequest withNumberOfPeriods(long numberOfPeriods) {
        Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
        this.numberOfPeriods = numberOfPeriods;
        return this;
    }

    /**
     * The number of months per period. E.g. 2 = 2 months per period.
     */
    public GetCommerceOrdersReportRequest withPeriodLength(long periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = periodLength;
        return this;
    }

    /**
     * The period unit of time returned.
     */
    public GetCommerceOrdersReportRequest withPeriodUnit(PeriodUnit periodUnit) {
        Utils.checkNotNull(periodUnit, "periodUnit");
        this.periodUnit = periodUnit;
        return this;
    }

    /**
     * The date in which the report is created up to. Users must specify a specific date, however the response will be provided for the full month.
     */
    public GetCommerceOrdersReportRequest withReportDate(String reportDate) {
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
        GetCommerceOrdersReportRequest other = (GetCommerceOrdersReportRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.connectionId, other.connectionId) &&
            Objects.deepEquals(this.includeDisplayNames, other.includeDisplayNames) &&
            Objects.deepEquals(this.numberOfPeriods, other.numberOfPeriods) &&
            Objects.deepEquals(this.periodLength, other.periodLength) &&
            Objects.deepEquals(this.periodUnit, other.periodUnit) &&
            Objects.deepEquals(this.reportDate, other.reportDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            connectionId,
            includeDisplayNames,
            numberOfPeriods,
            periodLength,
            periodUnit,
            reportDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCommerceOrdersReportRequest.class,
                "companyId", companyId,
                "connectionId", connectionId,
                "includeDisplayNames", includeDisplayNames,
                "numberOfPeriods", numberOfPeriods,
                "periodLength", periodLength,
                "periodUnit", periodUnit,
                "reportDate", reportDate);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String connectionId;
 
        private Optional<Boolean> includeDisplayNames = Optional.empty();
 
        private Long numberOfPeriods;
 
        private Long periodLength;
 
        private PeriodUnit periodUnit;
 
        private String reportDate;  
        
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
         * Unique identifier for a connection.
         */
        public Builder connectionId(String connectionId) {
            Utils.checkNotNull(connectionId, "connectionId");
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
         */
        public Builder includeDisplayNames(boolean includeDisplayNames) {
            Utils.checkNotNull(includeDisplayNames, "includeDisplayNames");
            this.includeDisplayNames = Optional.ofNullable(includeDisplayNames);
            return this;
        }

        /**
         * Shows the dimensionDisplayName and itemDisplayName in measures to make the report data human-readable.
         */
        public Builder includeDisplayNames(Optional<Boolean> includeDisplayNames) {
            Utils.checkNotNull(includeDisplayNames, "includeDisplayNames");
            this.includeDisplayNames = includeDisplayNames;
            return this;
        }

        /**
         * The number of periods to return. There will be no pagination as a query parameter.
         */
        public Builder numberOfPeriods(long numberOfPeriods) {
            Utils.checkNotNull(numberOfPeriods, "numberOfPeriods");
            this.numberOfPeriods = numberOfPeriods;
            return this;
        }

        /**
         * The number of months per period. E.g. 2 = 2 months per period.
         */
        public Builder periodLength(long periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = periodLength;
            return this;
        }

        /**
         * The period unit of time returned.
         */
        public Builder periodUnit(PeriodUnit periodUnit) {
            Utils.checkNotNull(periodUnit, "periodUnit");
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The date in which the report is created up to. Users must specify a specific date, however the response will be provided for the full month.
         */
        public Builder reportDate(String reportDate) {
            Utils.checkNotNull(reportDate, "reportDate");
            this.reportDate = reportDate;
            return this;
        }
        
        public GetCommerceOrdersReportRequest build() {
            return new GetCommerceOrdersReportRequest(
                companyId,
                connectionId,
                includeDisplayNames,
                numberOfPeriods,
                periodLength,
                periodUnit,
                reportDate);
        }
    }
}

