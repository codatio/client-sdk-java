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


public class DataIntegrityStatus {

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amounts")
    private Optional<? extends DataIntegrityAmounts> amounts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectionIds")
    private Optional<? extends DataIntegrityConnectionId> connectionIds;

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dates")
    private Optional<? extends DataIntegrityDates> dates;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusInfo")
    private Optional<? extends DataIntegrityStatusInfo> statusInfo;

    /**
     * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    public DataIntegrityStatus(
            @JsonProperty("amounts") Optional<? extends DataIntegrityAmounts> amounts,
            @JsonProperty("connectionIds") Optional<? extends DataIntegrityConnectionId> connectionIds,
            @JsonProperty("dates") Optional<? extends DataIntegrityDates> dates,
            @JsonProperty("statusInfo") Optional<? extends DataIntegrityStatusInfo> statusInfo,
            @JsonProperty("type") Optional<? extends String> type) {
        Utils.checkNotNull(amounts, "amounts");
        Utils.checkNotNull(connectionIds, "connectionIds");
        Utils.checkNotNull(dates, "dates");
        Utils.checkNotNull(statusInfo, "statusInfo");
        Utils.checkNotNull(type, "type");
        this.amounts = amounts;
        this.connectionIds = connectionIds;
        this.dates = dates;
        this.statusInfo = statusInfo;
        this.type = type;
    }

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public Optional<? extends DataIntegrityAmounts> amounts() {
        return amounts;
    }

    public Optional<? extends DataIntegrityConnectionId> connectionIds() {
        return connectionIds;
    }

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public Optional<? extends DataIntegrityDates> dates() {
        return dates;
    }

    public Optional<? extends DataIntegrityStatusInfo> statusInfo() {
        return statusInfo;
    }

    /**
     * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
     */
    public Optional<? extends String> type() {
        return type;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public DataIntegrityStatus withAmounts(DataIntegrityAmounts amounts) {
        Utils.checkNotNull(amounts, "amounts");
        this.amounts = Optional.ofNullable(amounts);
        return this;
    }
    
    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public DataIntegrityStatus withAmounts(Optional<? extends DataIntegrityAmounts> amounts) {
        Utils.checkNotNull(amounts, "amounts");
        this.amounts = amounts;
        return this;
    }

    public DataIntegrityStatus withConnectionIds(DataIntegrityConnectionId connectionIds) {
        Utils.checkNotNull(connectionIds, "connectionIds");
        this.connectionIds = Optional.ofNullable(connectionIds);
        return this;
    }
    
    public DataIntegrityStatus withConnectionIds(Optional<? extends DataIntegrityConnectionId> connectionIds) {
        Utils.checkNotNull(connectionIds, "connectionIds");
        this.connectionIds = connectionIds;
        return this;
    }

    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public DataIntegrityStatus withDates(DataIntegrityDates dates) {
        Utils.checkNotNull(dates, "dates");
        this.dates = Optional.ofNullable(dates);
        return this;
    }
    
    /**
     * Only returned for transactions. For accounts, there is nothing returned.
     */
    public DataIntegrityStatus withDates(Optional<? extends DataIntegrityDates> dates) {
        Utils.checkNotNull(dates, "dates");
        this.dates = dates;
        return this;
    }

    public DataIntegrityStatus withStatusInfo(DataIntegrityStatusInfo statusInfo) {
        Utils.checkNotNull(statusInfo, "statusInfo");
        this.statusInfo = Optional.ofNullable(statusInfo);
        return this;
    }
    
    public DataIntegrityStatus withStatusInfo(Optional<? extends DataIntegrityStatusInfo> statusInfo) {
        Utils.checkNotNull(statusInfo, "statusInfo");
        this.statusInfo = statusInfo;
        return this;
    }

    /**
     * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
     */
    public DataIntegrityStatus withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }
    
    /**
     * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
     */
    public DataIntegrityStatus withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        DataIntegrityStatus other = (DataIntegrityStatus) o;
        return 
            java.util.Objects.deepEquals(this.amounts, other.amounts) &&
            java.util.Objects.deepEquals(this.connectionIds, other.connectionIds) &&
            java.util.Objects.deepEquals(this.dates, other.dates) &&
            java.util.Objects.deepEquals(this.statusInfo, other.statusInfo) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amounts,
            connectionIds,
            dates,
            statusInfo,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataIntegrityStatus.class,
                "amounts", amounts,
                "connectionIds", connectionIds,
                "dates", dates,
                "statusInfo", statusInfo,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataIntegrityAmounts> amounts = Optional.empty();
 
        private Optional<? extends DataIntegrityConnectionId> connectionIds = Optional.empty();
 
        private Optional<? extends DataIntegrityDates> dates = Optional.empty();
 
        private Optional<? extends DataIntegrityStatusInfo> statusInfo = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Only returned for transactions. For accounts, there is nothing returned.
         */
        public Builder amounts(DataIntegrityAmounts amounts) {
            Utils.checkNotNull(amounts, "amounts");
            this.amounts = Optional.ofNullable(amounts);
            return this;
        }
        
        /**
         * Only returned for transactions. For accounts, there is nothing returned.
         */
        public Builder amounts(Optional<? extends DataIntegrityAmounts> amounts) {
            Utils.checkNotNull(amounts, "amounts");
            this.amounts = amounts;
            return this;
        }

        public Builder connectionIds(DataIntegrityConnectionId connectionIds) {
            Utils.checkNotNull(connectionIds, "connectionIds");
            this.connectionIds = Optional.ofNullable(connectionIds);
            return this;
        }
        
        public Builder connectionIds(Optional<? extends DataIntegrityConnectionId> connectionIds) {
            Utils.checkNotNull(connectionIds, "connectionIds");
            this.connectionIds = connectionIds;
            return this;
        }

        /**
         * Only returned for transactions. For accounts, there is nothing returned.
         */
        public Builder dates(DataIntegrityDates dates) {
            Utils.checkNotNull(dates, "dates");
            this.dates = Optional.ofNullable(dates);
            return this;
        }
        
        /**
         * Only returned for transactions. For accounts, there is nothing returned.
         */
        public Builder dates(Optional<? extends DataIntegrityDates> dates) {
            Utils.checkNotNull(dates, "dates");
            this.dates = dates;
            return this;
        }

        public Builder statusInfo(DataIntegrityStatusInfo statusInfo) {
            Utils.checkNotNull(statusInfo, "statusInfo");
            this.statusInfo = Optional.ofNullable(statusInfo);
            return this;
        }
        
        public Builder statusInfo(Optional<? extends DataIntegrityStatusInfo> statusInfo) {
            Utils.checkNotNull(statusInfo, "statusInfo");
            this.statusInfo = statusInfo;
            return this;
        }

        /**
         * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }
        
        /**
         * The data type which the data type in the URL has been matched against. For example, if you've matched accountTransactions and banking-transactions, and you call this endpoint with accountTransactions in the URL, this property would be banking-transactions.
         */
        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }        
        
        public DataIntegrityStatus build() {
            return new DataIntegrityStatus(
                amounts,
                connectionIds,
                dates,
                statusInfo,
                type);
        }
    }
}

