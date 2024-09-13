/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.payroll.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * JournalEntryRecordRef - Links a journal entry to the underlying record that created it.
 */

public class JournalEntryRecordRef {

    /**
     * Name of underlying data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dataType")
    private Optional<? extends JournalEntryRecordRefDataType> dataType;

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public JournalEntryRecordRef(
            @JsonProperty("dataType") Optional<? extends JournalEntryRecordRefDataType> dataType,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(dataType, "dataType");
        Utils.checkNotNull(id, "id");
        this.dataType = dataType;
        this.id = id;
    }
    
    public JournalEntryRecordRef() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Name of underlying data type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<JournalEntryRecordRefDataType> dataType() {
        return (Optional<JournalEntryRecordRefDataType>) dataType;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of underlying data type.
     */
    public JournalEntryRecordRef withDataType(JournalEntryRecordRefDataType dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = Optional.ofNullable(dataType);
        return this;
    }

    /**
     * Name of underlying data type.
     */
    public JournalEntryRecordRef withDataType(Optional<? extends JournalEntryRecordRefDataType> dataType) {
        Utils.checkNotNull(dataType, "dataType");
        this.dataType = dataType;
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public JournalEntryRecordRef withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * 'id' of the underlying record or data type.
     */
    public JournalEntryRecordRef withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        JournalEntryRecordRef other = (JournalEntryRecordRef) o;
        return 
            Objects.deepEquals(this.dataType, other.dataType) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dataType,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JournalEntryRecordRef.class,
                "dataType", dataType,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends JournalEntryRecordRefDataType> dataType = Optional.empty();
 
        private Optional<String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of underlying data type.
         */
        public Builder dataType(JournalEntryRecordRefDataType dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = Optional.ofNullable(dataType);
            return this;
        }

        /**
         * Name of underlying data type.
         */
        public Builder dataType(Optional<? extends JournalEntryRecordRefDataType> dataType) {
            Utils.checkNotNull(dataType, "dataType");
            this.dataType = dataType;
            return this;
        }

        /**
         * 'id' of the underlying record or data type.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * 'id' of the underlying record or data type.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public JournalEntryRecordRef build() {
            return new JournalEntryRecordRef(
                dataType,
                id);
        }
    }
}

