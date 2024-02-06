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


public class BalanceSheet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assets")
    private Optional<? extends ReportLine> assets;

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
    @JsonProperty("date")
    private Optional<? extends String> date;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("equity")
    private Optional<? extends ReportLineInput> equity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("liabilities")
    private Optional<? extends ReportLineInput> liabilities;

    /**
     * Value of net assets for a company in their base currency.
     */
    @JsonProperty("netAssets")
    private double netAssets;

    public BalanceSheet(
            @JsonProperty("assets") Optional<? extends ReportLine> assets,
            @JsonProperty("date") Optional<? extends String> date,
            @JsonProperty("equity") Optional<? extends ReportLineInput> equity,
            @JsonProperty("liabilities") Optional<? extends ReportLineInput> liabilities,
            @JsonProperty("netAssets") double netAssets) {
        Utils.checkNotNull(assets, "assets");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(equity, "equity");
        Utils.checkNotNull(liabilities, "liabilities");
        Utils.checkNotNull(netAssets, "netAssets");
        this.assets = assets;
        this.date = date;
        this.equity = equity;
        this.liabilities = liabilities;
        this.netAssets = netAssets;
    }

    public Optional<? extends ReportLine> assets() {
        return assets;
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
    public Optional<? extends String> date() {
        return date;
    }

    public Optional<? extends ReportLineInput> equity() {
        return equity;
    }

    public Optional<? extends ReportLineInput> liabilities() {
        return liabilities;
    }

    /**
     * Value of net assets for a company in their base currency.
     */
    public double netAssets() {
        return netAssets;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public BalanceSheet withAssets(ReportLine assets) {
        Utils.checkNotNull(assets, "assets");
        this.assets = Optional.ofNullable(assets);
        return this;
    }
    
    public BalanceSheet withAssets(Optional<? extends ReportLine> assets) {
        Utils.checkNotNull(assets, "assets");
        this.assets = assets;
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
    public BalanceSheet withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
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
    public BalanceSheet withDate(Optional<? extends String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public BalanceSheet withEquity(ReportLineInput equity) {
        Utils.checkNotNull(equity, "equity");
        this.equity = Optional.ofNullable(equity);
        return this;
    }
    
    public BalanceSheet withEquity(Optional<? extends ReportLineInput> equity) {
        Utils.checkNotNull(equity, "equity");
        this.equity = equity;
        return this;
    }

    public BalanceSheet withLiabilities(ReportLineInput liabilities) {
        Utils.checkNotNull(liabilities, "liabilities");
        this.liabilities = Optional.ofNullable(liabilities);
        return this;
    }
    
    public BalanceSheet withLiabilities(Optional<? extends ReportLineInput> liabilities) {
        Utils.checkNotNull(liabilities, "liabilities");
        this.liabilities = liabilities;
        return this;
    }

    /**
     * Value of net assets for a company in their base currency.
     */
    public BalanceSheet withNetAssets(double netAssets) {
        Utils.checkNotNull(netAssets, "netAssets");
        this.netAssets = netAssets;
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
        BalanceSheet other = (BalanceSheet) o;
        return 
            java.util.Objects.deepEquals(this.assets, other.assets) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.equity, other.equity) &&
            java.util.Objects.deepEquals(this.liabilities, other.liabilities) &&
            java.util.Objects.deepEquals(this.netAssets, other.netAssets);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            assets,
            date,
            equity,
            liabilities,
            netAssets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalanceSheet.class,
                "assets", assets,
                "date", date,
                "equity", equity,
                "liabilities", liabilities,
                "netAssets", netAssets);
    }
    
    public final static class Builder {
 
        private Optional<? extends ReportLine> assets = Optional.empty();
 
        private Optional<? extends String> date = Optional.empty();
 
        private Optional<? extends ReportLineInput> equity = Optional.empty();
 
        private Optional<? extends ReportLineInput> liabilities = Optional.empty();
 
        private Double netAssets;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder assets(ReportLine assets) {
            Utils.checkNotNull(assets, "assets");
            this.assets = Optional.ofNullable(assets);
            return this;
        }
        
        public Builder assets(Optional<? extends ReportLine> assets) {
            Utils.checkNotNull(assets, "assets");
            this.assets = assets;
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
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
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
        public Builder date(Optional<? extends String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        public Builder equity(ReportLineInput equity) {
            Utils.checkNotNull(equity, "equity");
            this.equity = Optional.ofNullable(equity);
            return this;
        }
        
        public Builder equity(Optional<? extends ReportLineInput> equity) {
            Utils.checkNotNull(equity, "equity");
            this.equity = equity;
            return this;
        }

        public Builder liabilities(ReportLineInput liabilities) {
            Utils.checkNotNull(liabilities, "liabilities");
            this.liabilities = Optional.ofNullable(liabilities);
            return this;
        }
        
        public Builder liabilities(Optional<? extends ReportLineInput> liabilities) {
            Utils.checkNotNull(liabilities, "liabilities");
            this.liabilities = liabilities;
            return this;
        }

        /**
         * Value of net assets for a company in their base currency.
         */
        public Builder netAssets(double netAssets) {
            Utils.checkNotNull(netAssets, "netAssets");
            this.netAssets = netAssets;
            return this;
        }        
        
        public BalanceSheet build() {
            return new BalanceSheet(
                assets,
                date,
                equity,
                liabilities,
                netAssets);
        }
    }
}
