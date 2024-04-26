/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class DatasetStatusChangedErrorWebhookData {

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

    /**
     * The current status of the dataset's sync.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datasetStatus")
    private Optional<? extends String> datasetStatus;

    @JsonCreator
    public DatasetStatusChangedErrorWebhookData(
            @JsonProperty("dataType") Optional<? extends DataType> dataType,
            @JsonProperty("datasetId") Optional<? extends String> datasetId,
            @JsonProperty("datasetStatus") Optional<? extends String> datasetStatus) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(datasetId, "datasetId");
        Utils.checkNotNull(datasetStatus, "datasetStatus");
        this.dataType = dataType;
        this.datasetId = datasetId;
        this.datasetStatus = datasetStatus;
    }
    
    public DatasetStatusChangedErrorWebhookData() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Available data types
     */
    @JsonIgnore
    public Optional<? extends DataType> dataType() {
        return dataType;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    @JsonIgnore
    public Optional<? extends String> datasetId() {
        return datasetId;
    }

    /**
     * The current status of the dataset's sync.
     */
    @JsonIgnore
    public Optional<? extends String> datasetStatus() {
        return datasetStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Available data types
     */
    public DatasetStatusChangedErrorWebhookData withDataType(DataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Available data types
     */
    public DatasetStatusChangedErrorWebhookData withDataType(Optional<? extends DataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public DatasetStatusChangedErrorWebhookData withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = Optional.ofNullable(datasetId);
        return this;
    }

    /**
     * Unique identifier for the dataset that completed its sync.
     */
    public DatasetStatusChangedErrorWebhookData withDatasetId(Optional<? extends String> datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
        return this;
    }

    /**
     * The current status of the dataset's sync.
     */
    public DatasetStatusChangedErrorWebhookData withDatasetStatus(String datasetStatus) {
        Utils.checkNotNull(datasetStatus, "datasetStatus");
        this.datasetStatus = Optional.ofNullable(datasetStatus);
        return this;
    }

    /**
     * The current status of the dataset's sync.
     */
    public DatasetStatusChangedErrorWebhookData withDatasetStatus(Optional<? extends String> datasetStatus) {
        Utils.checkNotNull(datasetStatus, "datasetStatus");
        this.datasetStatus = datasetStatus;
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
        DatasetStatusChangedErrorWebhookData other = (DatasetStatusChangedErrorWebhookData) o;
        return 
            java.util.Objects.deepEquals(this.dataType, other.dataType) &&
            java.util.Objects.deepEquals(this.datasetId, other.datasetId) &&
            java.util.Objects.deepEquals(this.datasetStatus, other.datasetStatus);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataType,
            datasetId,
            datasetStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DatasetStatusChangedErrorWebhookData.class,
                "dataType", dataType,
                "datasetId", datasetId,
                "datasetStatus", datasetStatus);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataType> dataType = Optional.empty();
 
        private Optional<? extends String> datasetId = Optional.empty();
 
        private Optional<? extends String> datasetStatus = Optional.empty();  
        
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

        /**
         * The current status of the dataset's sync.
         */
        public Builder datasetStatus(String datasetStatus) {
            Utils.checkNotNull(datasetStatus, "datasetStatus");
            this.datasetStatus = Optional.ofNullable(datasetStatus);
            return this;
        }

        /**
         * The current status of the dataset's sync.
         */
        public Builder datasetStatus(Optional<? extends String> datasetStatus) {
            Utils.checkNotNull(datasetStatus, "datasetStatus");
            this.datasetStatus = datasetStatus;
            return this;
        }
        
        public DatasetStatusChangedErrorWebhookData build() {
            return new DatasetStatusChangedErrorWebhookData(
                dataType,
                datasetId,
                datasetStatus);
        }
    }
}

