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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CustomDataTypeConfiguration - Client's configuration details for a specific custom data type and platform pair.
 */

public class CustomDataTypeConfiguration {

    /**
     * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataSource")
    private Optional<? extends String> dataSource;

    /**
     * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("keyBy")
    private Optional<? extends java.util.List<String>> keyBy;

    /**
     * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requiredData")
    private Optional<? extends java.util.Map<String, String>> requiredData;

    /**
     * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceModifiedDate")
    private JsonNullable<? extends java.util.List<String>> sourceModifiedDate;

    @JsonCreator
    public CustomDataTypeConfiguration(
            @JsonProperty("dataSource") Optional<? extends String> dataSource,
            @JsonProperty("keyBy") Optional<? extends java.util.List<String>> keyBy,
            @JsonProperty("requiredData") Optional<? extends java.util.Map<String, String>> requiredData,
            @JsonProperty("sourceModifiedDate") JsonNullable<? extends java.util.List<String>> sourceModifiedDate) {
        Utils.checkNotNull(dataSource, "dataSource");
        Utils.checkNotNull(keyBy, "keyBy");
        Utils.checkNotNull(requiredData, "requiredData");
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.dataSource = dataSource;
        this.keyBy = keyBy;
        this.requiredData = requiredData;
        this.sourceModifiedDate = sourceModifiedDate;
    }
    
    public CustomDataTypeConfiguration() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
     */
    @JsonIgnore
    public Optional<? extends String> dataSource() {
        return dataSource;
    }

    /**
     * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
     */
    @JsonIgnore
    public Optional<? extends java.util.List<String>> keyBy() {
        return keyBy;
    }

    /**
     * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
     */
    @JsonIgnore
    public Optional<? extends java.util.Map<String, String>> requiredData() {
        return requiredData;
    }

    /**
     * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
     */
    @JsonIgnore
    public JsonNullable<? extends java.util.List<String>> sourceModifiedDate() {
        return sourceModifiedDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withDataSource(String dataSource) {
        Utils.checkNotNull(dataSource, "dataSource");
        this.dataSource = Optional.ofNullable(dataSource);
        return this;
    }

    /**
     * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withDataSource(Optional<? extends String> dataSource) {
        Utils.checkNotNull(dataSource, "dataSource");
        this.dataSource = dataSource;
        return this;
    }

    /**
     * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withKeyBy(java.util.List<String> keyBy) {
        Utils.checkNotNull(keyBy, "keyBy");
        this.keyBy = Optional.ofNullable(keyBy);
        return this;
    }

    /**
     * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withKeyBy(Optional<? extends java.util.List<String>> keyBy) {
        Utils.checkNotNull(keyBy, "keyBy");
        this.keyBy = keyBy;
        return this;
    }

    /**
     * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withRequiredData(java.util.Map<String, String> requiredData) {
        Utils.checkNotNull(requiredData, "requiredData");
        this.requiredData = Optional.ofNullable(requiredData);
        return this;
    }

    /**
     * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withRequiredData(Optional<? extends java.util.Map<String, String>> requiredData) {
        Utils.checkNotNull(requiredData, "requiredData");
        this.requiredData = requiredData;
        return this;
    }

    /**
     * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withSourceModifiedDate(java.util.List<String> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = JsonNullable.of(sourceModifiedDate);
        return this;
    }

    /**
     * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
     */
    public CustomDataTypeConfiguration withSourceModifiedDate(JsonNullable<? extends java.util.List<String>> sourceModifiedDate) {
        Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
        this.sourceModifiedDate = sourceModifiedDate;
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
        CustomDataTypeConfiguration other = (CustomDataTypeConfiguration) o;
        return 
            java.util.Objects.deepEquals(this.dataSource, other.dataSource) &&
            java.util.Objects.deepEquals(this.keyBy, other.keyBy) &&
            java.util.Objects.deepEquals(this.requiredData, other.requiredData) &&
            java.util.Objects.deepEquals(this.sourceModifiedDate, other.sourceModifiedDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dataSource,
            keyBy,
            requiredData,
            sourceModifiedDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomDataTypeConfiguration.class,
                "dataSource", dataSource,
                "keyBy", keyBy,
                "requiredData", requiredData,
                "sourceModifiedDate", sourceModifiedDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> dataSource = Optional.empty();
 
        private Optional<? extends java.util.List<String>> keyBy = Optional.empty();
 
        private Optional<? extends java.util.Map<String, String>> requiredData = Optional.empty();
 
        private JsonNullable<? extends java.util.List<String>> sourceModifiedDate = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
         */
        public Builder dataSource(String dataSource) {
            Utils.checkNotNull(dataSource, "dataSource");
            this.dataSource = Optional.ofNullable(dataSource);
            return this;
        }

        /**
         * Underlying endpoint of the source platform that will serve as a data source for the custom data type. This value is not validated by Codat.
         */
        public Builder dataSource(Optional<? extends String> dataSource) {
            Utils.checkNotNull(dataSource, "dataSource");
            this.dataSource = dataSource;
            return this;
        }

        /**
         * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
         */
        public Builder keyBy(java.util.List<String> keyBy) {
            Utils.checkNotNull(keyBy, "keyBy");
            this.keyBy = Optional.ofNullable(keyBy);
            return this;
        }

        /**
         * An array of properties from the source system that can be used to uniquely identify the records returned for the custom data type. This value is not validated by Codat.
         */
        public Builder keyBy(Optional<? extends java.util.List<String>> keyBy) {
            Utils.checkNotNull(keyBy, "keyBy");
            this.keyBy = keyBy;
            return this;
        }

        /**
         * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
         */
        public Builder requiredData(java.util.Map<String, String> requiredData) {
            Utils.checkNotNull(requiredData, "requiredData");
            this.requiredData = Optional.ofNullable(requiredData);
            return this;
        }

        /**
         * Properties required to be fetched from the underlying platform for the custom data type that is being configured. This value is not validated by Codat.
         */
        public Builder requiredData(Optional<? extends java.util.Map<String, String>> requiredData) {
            Utils.checkNotNull(requiredData, "requiredData");
            this.requiredData = requiredData;
            return this;
        }

        /**
         * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
         */
        public Builder sourceModifiedDate(java.util.List<String> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = JsonNullable.of(sourceModifiedDate);
            return this;
        }

        /**
         * Property in the source platform nominated by the client that defines the date when a record was last modified there. This value is not validated by Codat.
         */
        public Builder sourceModifiedDate(JsonNullable<? extends java.util.List<String>> sourceModifiedDate) {
            Utils.checkNotNull(sourceModifiedDate, "sourceModifiedDate");
            this.sourceModifiedDate = sourceModifiedDate;
            return this;
        }
        
        public CustomDataTypeConfiguration build() {
            return new CustomDataTypeConfiguration(
                dataSource,
                keyBy,
                requiredData,
                sourceModifiedDate);
        }
    }
}

