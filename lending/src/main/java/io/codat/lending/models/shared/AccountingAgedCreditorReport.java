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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * AccountingAgedCreditorReport - The Aged Creditors report shows the total balance owed by a business to its suppliers over time.
 * 
 * You can generate it for a company based on recently synced data from your customers' accounting software. The report is available in the **Reports** tab in the Codat portal.
 * 
 * Total assets or liabilities are grouped into 30-day periods for each supplier, up to the current date. You can adjust the report date, period length, and number of periods to show on each report. The data can be grouped by customer or currency.
 * 
 * &gt; It is not guaranteed that write-offs are included in the Aged Creditors report.
 * 
 * ## Underlying data
 * 
 * The Aged Creditors report is generated from a set of required data types: [Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier), [Bills](https://docs.codat.io/lending-api#/schemas/Bill), [Bill credit notes](https://docs.codat.io/lending-api#/schemas/BillCreditNote), and [Bill payments](https://docs.codat.io/lending-api#/schemas/BillPayment).
 * 
 * To generate the report, the underlying data types must have been synced within 24 hours of each other. Otherwise an error is displayed when you try to run the report. Sync the required data types by clicking the link in the error, and then run the report again.
 * 
 * &gt; The Aged Creditor report runs based on the **issue dates** of the underlying data types rather than the due date.
 * 
 * ## Accessing the Aged Creditors report in Portal
 * 
 * Apart from returning the report via the API as JSON and query, you can also return the Aged Creditors report in the Codat portal.
 * 
 * 1. In the navigation bar, click **Companies**.
 * 2. Click the name of the company you want to generate the report for. The company's data page is displayed.
 * 3. Click the **Accounting** tab then click **Reports**.
 * 4. Select **Aged Creditors**.
 * 5. _(Optional)_ Edit the default reporting parameters.
 *    a. You can change the report date in the **Date** box. By default, the report includes transactions that occurred up to, but not including, today's date. To include transactions for today, enter tomorrow's date. 
 *    b. In the **Period Length Days** box, select the default period length for each column (the default is 30 days).
 *    b. In the **Number of Periods** box, enter the number of periods to show as columns in the report (the default is 4 periods).
 * 6. To run the report, click **Load aged creditors**.
 * 7. The report is generated and displayed at the bottom of the page.
 * 
 * The report will be grouped per supplier and depending on the periods requested. The details indicates whether the amounts owed come from outstanding bills or bill credit notes.
 */

public class AccountingAgedCreditorReport {

    /**
     * Array of aged creditor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends List<AgedCreditor>> data;

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
    @JsonProperty("generated")
    private Optional<String> generated;

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
    @JsonProperty("reportDate")
    private Optional<String> reportDate;

    @JsonCreator
    public AccountingAgedCreditorReport(
            @JsonProperty("data") Optional<? extends List<AgedCreditor>> data,
            @JsonProperty("generated") Optional<String> generated,
            @JsonProperty("reportDate") Optional<String> reportDate) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(generated, "generated");
        Utils.checkNotNull(reportDate, "reportDate");
        this.data = data;
        this.generated = generated;
        this.reportDate = reportDate;
    }
    
    public AccountingAgedCreditorReport() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Array of aged creditor.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AgedCreditor>> data() {
        return (Optional<List<AgedCreditor>>) data;
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
    @JsonIgnore
    public Optional<String> generated() {
        return generated;
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
    @JsonIgnore
    public Optional<String> reportDate() {
        return reportDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Array of aged creditor.
     */
    public AccountingAgedCreditorReport withData(List<AgedCreditor> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    /**
     * Array of aged creditor.
     */
    public AccountingAgedCreditorReport withData(Optional<? extends List<AgedCreditor>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
    public AccountingAgedCreditorReport withGenerated(String generated) {
        Utils.checkNotNull(generated, "generated");
        this.generated = Optional.ofNullable(generated);
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
    public AccountingAgedCreditorReport withGenerated(Optional<String> generated) {
        Utils.checkNotNull(generated, "generated");
        this.generated = generated;
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
    public AccountingAgedCreditorReport withReportDate(String reportDate) {
        Utils.checkNotNull(reportDate, "reportDate");
        this.reportDate = Optional.ofNullable(reportDate);
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
    public AccountingAgedCreditorReport withReportDate(Optional<String> reportDate) {
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
        AccountingAgedCreditorReport other = (AccountingAgedCreditorReport) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.generated, other.generated) &&
            Objects.deepEquals(this.reportDate, other.reportDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            generated,
            reportDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingAgedCreditorReport.class,
                "data", data,
                "generated", generated,
                "reportDate", reportDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AgedCreditor>> data = Optional.empty();
 
        private Optional<String> generated = Optional.empty();
 
        private Optional<String> reportDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Array of aged creditor.
         */
        public Builder data(List<AgedCreditor> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        /**
         * Array of aged creditor.
         */
        public Builder data(Optional<? extends List<AgedCreditor>> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
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
        public Builder generated(String generated) {
            Utils.checkNotNull(generated, "generated");
            this.generated = Optional.ofNullable(generated);
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
        public Builder generated(Optional<String> generated) {
            Utils.checkNotNull(generated, "generated");
            this.generated = generated;
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
        public Builder reportDate(String reportDate) {
            Utils.checkNotNull(reportDate, "reportDate");
            this.reportDate = Optional.ofNullable(reportDate);
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
        public Builder reportDate(Optional<String> reportDate) {
            Utils.checkNotNull(reportDate, "reportDate");
            this.reportDate = reportDate;
            return this;
        }
        
        public AccountingAgedCreditorReport build() {
            return new AccountingAgedCreditorReport(
                data,
                generated,
                reportDate);
        }
    }
}

