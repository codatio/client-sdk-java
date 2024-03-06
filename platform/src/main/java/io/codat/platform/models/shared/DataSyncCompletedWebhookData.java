/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class DataSyncCompletedWebhookData {

    /**
     * Available data types
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends DataType> dataType;

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetId")
    private Optional<? extends String> datasetId;

    public DataSyncCompletedWebhookData(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("datasetId") Optional<? extends String> datasetId) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(datasetId, "datasetId");
        this.dataType = dataType;
        this.datasetId = datasetId;
    }

    /**
     * Available data types
     */
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public Optional<? extends String> datasetId() {
        return datasetId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public DataSyncCompletedWebhookData withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Available data types
     */
    public DataSyncCompletedWebhookData withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public DataSyncCompletedWebhookData withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = Optional.ofNullable(datasetId);
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public DataSyncCompletedWebhookData withDatasetId(Optional<? extends String> datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
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
        DataSyncCompletedWebhookData other = (DataSyncCompletedWebhookData) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.datasetId, other.datasetId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            datasetId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataSyncCompletedWebhookData.class,
                "dataType", dataType,
                "datasetId", datasetId);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private Optional<? extends String> datasetId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Available data types
         */
        public Builder dataType(DataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * Available data types
         */
        public Builder dataType(Optional<? extends DataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * Unique identifier for the dataset that completed its sync.
         */
        public Builder datasetId(String datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = Optional.ofNullable(datasetId);
            return this;
        }

        /**
         * Unique identifier for the dataset that completed its sync.
         */
        public Builder datasetId(Optional<? extends String> datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = datasetId;
            return this;
        }
        
        public DataSyncCompletedWebhookData build() {
            return new DataSyncCompletedWebhookData(
                dataType,
                datasetId);
        }
    }
}

