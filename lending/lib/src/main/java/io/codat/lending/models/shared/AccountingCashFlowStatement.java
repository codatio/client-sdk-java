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
 * AccountingCashFlowStatement - &gt; View the coverage for cash flow statement in the &lt;a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&amp;dataType=cashFlowStatement" target="_blank"&gt;Data coverage explorer&lt;/a&gt;.
 * 
 * &gt; **Operating activities only**  
 * &gt; 
 * &gt; Currently, the cash flow statement shows cash that flows into and out of the company from operating activities *only*. Operating activities generate cash from the sale of goods or services.
 * 
 * ## Overview
 * 
 * A cash flow statement is a financial report that records all cash that is received or spent by a company during a given period. It gives you a clearer picture of the company’s performance, and their ability to pay creditors and finance growth.
 * 
 * &gt; **Cash flow statement or balance sheet?**
 * &gt; 
 * &gt; Look at the cash flow statement to understand a company's ability to pay its bills. Although the balance sheet may show healthy earnings at a specific point in time, the cash flow statement allows you to see whether the company is meeting its financial commitments, such as paying creditors or its employees.
 */

public class AccountingCashFlowStatement {

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earliestAvailableMonth")
    private Optional<? extends String> earliestAvailableMonth;

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mostRecentAvailableMonth")
    private Optional<? extends String> mostRecentAvailableMonth;

    /**
     * Accounting method used when aggregating the report data. In this case, `Cash`.
     */
    @JsonProperty("reportBasis")
    private ReportBasis reportBasis;

    /**
     * Accounting method used to prepare the cash flow statement.
     */
    @JsonProperty("reportInput")
    private ReportInput reportInput;

    /**
     * Array of cash flow statements.
     */
    @JsonProperty("reports")
    private java.util.List<CashFlowStatement> reports;

    public AccountingCashFlowStatement(
            @JsonProperty("currency") String currency,
            @JsonProperty("earliestAvailableMonth") Optional<? extends String> earliestAvailableMonth,
            @JsonProperty("mostRecentAvailableMonth") Optional<? extends String> mostRecentAvailableMonth,
            @JsonProperty("reportBasis") ReportBasis reportBasis,
            @JsonProperty("reportInput") ReportInput reportInput,
            @JsonProperty("reports") java.util.List<CashFlowStatement> reports) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(earliestAvailableMonth, "earliestAvailableMonth");
        Utils.checkNotNull(mostRecentAvailableMonth, "mostRecentAvailableMonth");
        Utils.checkNotNull(reportBasis, "reportBasis");
        Utils.checkNotNull(reportInput, "reportInput");
        Utils.checkNotNull(reports, "reports");
        this.currency = currency;
        this.earliestAvailableMonth = earliestAvailableMonth;
        this.mostRecentAvailableMonth = mostRecentAvailableMonth;
        this.reportBasis = reportBasis;
        this.reportInput = reportInput;
        this.reports = reports;
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public String currency() {
        return currency;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Optional<? extends String> earliestAvailableMonth() {
        return earliestAvailableMonth;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public Optional<? extends String> mostRecentAvailableMonth() {
        return mostRecentAvailableMonth;
    }

    /**
     * Accounting method used when aggregating the report data. In this case, `Cash`.
     */
    public ReportBasis reportBasis() {
        return reportBasis;
    }

    /**
     * Accounting method used to prepare the cash flow statement.
     */
    public ReportInput reportInput() {
        return reportInput;
    }

    /**
     * Array of cash flow statements.
     */
    public java.util.List<CashFlowStatement> reports() {
        return reports;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
     * 
     * ## Unknown currencies
     * 
     * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
     * 
     * There are only a very small number of edge cases where this currency code is returned by the Codat system.
     */
    public AccountingCashFlowStatement withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingCashFlowStatement withEarliestAvailableMonth(String earliestAvailableMonth) {
        Utils.checkNotNull(earliestAvailableMonth, "earliestAvailableMonth");
        this.earliestAvailableMonth = Optional.ofNullable(earliestAvailableMonth);
        return this;
    }
    
    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingCashFlowStatement withEarliestAvailableMonth(Optional<? extends String> earliestAvailableMonth) {
        Utils.checkNotNull(earliestAvailableMonth, "earliestAvailableMonth");
        this.earliestAvailableMonth = earliestAvailableMonth;
        return this;
    }

    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingCashFlowStatement withMostRecentAvailableMonth(String mostRecentAvailableMonth) {
        Utils.checkNotNull(mostRecentAvailableMonth, "mostRecentAvailableMonth");
        this.mostRecentAvailableMonth = Optional.ofNullable(mostRecentAvailableMonth);
        return this;
    }
    
    /**
     * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
     * 
     * ```
     * 2020-10-08T22:40:50Z
     * 2021-01-01T00:00:00
     * ```
     * 
     * 
     * 
     * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
     * 
     * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
     * - Unqualified local time: `2021-11-15T01:00:00`
     * - UTC time offsets: `2021-11-15T01:00:00-05:00`
     * 
     * &gt; Time zones
     * &gt; 
     * &gt; Not all dates from Codat will contain information about time zones.  
     * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
     */
    public AccountingCashFlowStatement withMostRecentAvailableMonth(Optional<? extends String> mostRecentAvailableMonth) {
        Utils.checkNotNull(mostRecentAvailableMonth, "mostRecentAvailableMonth");
        this.mostRecentAvailableMonth = mostRecentAvailableMonth;
        return this;
    }

    /**
     * Accounting method used when aggregating the report data. In this case, `Cash`.
     */
    public AccountingCashFlowStatement withReportBasis(ReportBasis reportBasis) {
        Utils.checkNotNull(reportBasis, "reportBasis");
        this.reportBasis = reportBasis;
        return this;
    }

    /**
     * Accounting method used to prepare the cash flow statement.
     */
    public AccountingCashFlowStatement withReportInput(ReportInput reportInput) {
        Utils.checkNotNull(reportInput, "reportInput");
        this.reportInput = reportInput;
        return this;
    }

    /**
     * Array of cash flow statements.
     */
    public AccountingCashFlowStatement withReports(java.util.List<CashFlowStatement> reports) {
        Utils.checkNotNull(reports, "reports");
        this.reports = reports;
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
        AccountingCashFlowStatement other = (AccountingCashFlowStatement) o;
        return 
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.earliestAvailableMonth, other.earliestAvailableMonth) &&
            java.util.Objects.deepEquals(this.mostRecentAvailableMonth, other.mostRecentAvailableMonth) &&
            java.util.Objects.deepEquals(this.reportBasis, other.reportBasis) &&
            java.util.Objects.deepEquals(this.reportInput, other.reportInput) &&
            java.util.Objects.deepEquals(this.reports, other.reports);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            currency,
            earliestAvailableMonth,
            mostRecentAvailableMonth,
            reportBasis,
            reportInput,
            reports);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingCashFlowStatement.class,
                "currency", currency,
                "earliestAvailableMonth", earliestAvailableMonth,
                "mostRecentAvailableMonth", mostRecentAvailableMonth,
                "reportBasis", reportBasis,
                "reportInput", reportInput,
                "reports", reports);
    }
    
    public final static class Builder {
 
        private String currency;
 
        private Optional<? extends String> earliestAvailableMonth = Optional.empty();
 
        private Optional<? extends String> mostRecentAvailableMonth = Optional.empty();
 
        private ReportBasis reportBasis;
 
        private ReportInput reportInput;
 
        private java.util.List<CashFlowStatement> reports;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.
         * 
         * ## Unknown currencies
         * 
         * In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. 
         * 
         * There are only a very small number of edge cases where this currency code is returned by the Codat system.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder earliestAvailableMonth(String earliestAvailableMonth) {
            Utils.checkNotNull(earliestAvailableMonth, "earliestAvailableMonth");
            this.earliestAvailableMonth = Optional.ofNullable(earliestAvailableMonth);
            return this;
        }
        
        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder earliestAvailableMonth(Optional<? extends String> earliestAvailableMonth) {
            Utils.checkNotNull(earliestAvailableMonth, "earliestAvailableMonth");
            this.earliestAvailableMonth = earliestAvailableMonth;
            return this;
        }

        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder mostRecentAvailableMonth(String mostRecentAvailableMonth) {
            Utils.checkNotNull(mostRecentAvailableMonth, "mostRecentAvailableMonth");
            this.mostRecentAvailableMonth = Optional.ofNullable(mostRecentAvailableMonth);
            return this;
        }
        
        /**
         * In Codat's data model, dates and times are represented using the &lt;a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank"&gt;ISO 8601 standard&lt;/a&gt;. Date and time fields are formatted as strings; for example:
         * 
         * ```
         * 2020-10-08T22:40:50Z
         * 2021-01-01T00:00:00
         * ```
         * 
         * 
         * 
         * When syncing data that contains `DateTime` fields from Codat, make sure you support the following cases when reading time information:
         * 
         * - Coordinated Universal Time (UTC): `2021-11-15T06:00:00Z`
         * - Unqualified local time: `2021-11-15T01:00:00`
         * - UTC time offsets: `2021-11-15T01:00:00-05:00`
         * 
         * &gt; Time zones
         * &gt; 
         * &gt; Not all dates from Codat will contain information about time zones.  
         * &gt; Where it is not available from the underlying platform, Codat will return these as times local to the business whose data has been synced.
         */
        public Builder mostRecentAvailableMonth(Optional<? extends String> mostRecentAvailableMonth) {
            Utils.checkNotNull(mostRecentAvailableMonth, "mostRecentAvailableMonth");
            this.mostRecentAvailableMonth = mostRecentAvailableMonth;
            return this;
        }

        /**
         * Accounting method used when aggregating the report data. In this case, `Cash`.
         */
        public Builder reportBasis(ReportBasis reportBasis) {
            Utils.checkNotNull(reportBasis, "reportBasis");
            this.reportBasis = reportBasis;
            return this;
        }

        /**
         * Accounting method used to prepare the cash flow statement.
         */
        public Builder reportInput(ReportInput reportInput) {
            Utils.checkNotNull(reportInput, "reportInput");
            this.reportInput = reportInput;
            return this;
        }

        /**
         * Array of cash flow statements.
         */
        public Builder reports(java.util.List<CashFlowStatement> reports) {
            Utils.checkNotNull(reports, "reports");
            this.reports = reports;
            return this;
        }        
        
        public AccountingCashFlowStatement build() {
            return new AccountingCashFlowStatement(
                currency,
                earliestAvailableMonth,
                mostRecentAvailableMonth,
                reportBasis,
                reportInput,
                reports);
        }
    }
}
