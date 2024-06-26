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


public class CustomDataTypeRecord {

    /**
     * Values from the source system for the properties defined in the custom data type configuration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private Optional<? extends java.util.Map<String, Content>> content;

    /**
     * Unique identifier of the record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedDate")
    private Optional<? extends ModifiedDate> modifiedDate;

    @JsonCreator
    public CustomDataTypeRecord(
            @JsonProperty("content") Optional<? extends java.util.Map<String, Content>> content,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("modifiedDate") Optional<? extends ModifiedDate> modifiedDate) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.content = content;
        this.id = id;
        this.modifiedDate = modifiedDate;
    }
    
    public CustomDataTypeRecord() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Values from the source system for the properties defined in the custom data type configuration.
     */
    @JsonIgnore
    public Optional<? extends java.util.Map<String, Content>> content() {
        return content;
    }

    /**
     * Unique identifier of the record.
     */
    @JsonIgnore
    public Optional<? extends String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<? extends ModifiedDate> modifiedDate() {
        return modifiedDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Values from the source system for the properties defined in the custom data type configuration.
     */
    public CustomDataTypeRecord withContent(java.util.Map<String, Content> content) {
        Utils.checkNotNull(content, "content");
        this.content = Optional.ofNullable(content);
        return this;
    }

    /**
     * Values from the source system for the properties defined in the custom data type configuration.
     */
    public CustomDataTypeRecord withContent(Optional<? extends java.util.Map<String, Content>> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * Unique identifier of the record.
     */
    public CustomDataTypeRecord withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of the record.
     */
    public CustomDataTypeRecord withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CustomDataTypeRecord withModifiedDate(ModifiedDate modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = Optional.ofNullable(modifiedDate);
        return this;
    }

    public CustomDataTypeRecord withModifiedDate(Optional<? extends ModifiedDate> modifiedDate) {
        Utils.checkNotNull(modifiedDate, "modifiedDate");
        this.modifiedDate = modifiedDate;
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
        CustomDataTypeRecord other = (CustomDataTypeRecord) o;
        return 
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.modifiedDate, other.modifiedDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            content,
            id,
            modifiedDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomDataTypeRecord.class,
                "content", content,
                "id", id,
                "modifiedDate", modifiedDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, Content>> content = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends ModifiedDate> modifiedDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Values from the source system for the properties defined in the custom data type configuration.
         */
        public Builder content(java.util.Map<String, Content> content) {
            Utils.checkNotNull(content, "content");
            this.content = Optional.ofNullable(content);
            return this;
        }

        /**
         * Values from the source system for the properties defined in the custom data type configuration.
         */
        public Builder content(Optional<? extends java.util.Map<String, Content>> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * Unique identifier of the record.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of the record.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder modifiedDate(ModifiedDate modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = Optional.ofNullable(modifiedDate);
            return this;
        }

        public Builder modifiedDate(Optional<? extends ModifiedDate> modifiedDate) {
            Utils.checkNotNull(modifiedDate, "modifiedDate");
            this.modifiedDate = modifiedDate;
            return this;
        }
        
        public CustomDataTypeRecord build() {
            return new CustomDataTypeRecord(
                content,
                id,
                modifiedDate);
        }
    }
}

