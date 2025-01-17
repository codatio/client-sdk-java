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
import java.util.Objects;
import java.util.Optional;


public class Schema {

    /**
     * The type of event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("eventType")
    private Optional<String> eventType;

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
    @JsonProperty("generatedDate")
    private Optional<String> generatedDate;

    /**
     * Unique identifier of the event.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payload")
    private Optional<? extends ReportGenerationPayload> payload;

    @JsonCreator
    public Schema(
            @JsonProperty("eventType") Optional<String> eventType,
            @JsonProperty("generatedDate") Optional<String> generatedDate,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("payload") Optional<? extends ReportGenerationPayload> payload) {
        Utils.checkNotNull(eventType, "eventType");
        Utils.checkNotNull(generatedDate, "generatedDate");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(payload, "payload");
        this.eventType = eventType;
        this.generatedDate = generatedDate;
        this.id = id;
        this.payload = payload;
    }
    
    public Schema() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The type of event.
     */
    @JsonIgnore
    public Optional<String> eventType() {
        return eventType;
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
    public Optional<String> generatedDate() {
        return generatedDate;
    }

    /**
     * Unique identifier of the event.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReportGenerationPayload> payload() {
        return (Optional<ReportGenerationPayload>) payload;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of event.
     */
    public Schema withEventType(String eventType) {
        Utils.checkNotNull(eventType, "eventType");
        this.eventType = Optional.ofNullable(eventType);
        return this;
    }

    /**
     * The type of event.
     */
    public Schema withEventType(Optional<String> eventType) {
        Utils.checkNotNull(eventType, "eventType");
        this.eventType = eventType;
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
    public Schema withGeneratedDate(String generatedDate) {
        Utils.checkNotNull(generatedDate, "generatedDate");
        this.generatedDate = Optional.ofNullable(generatedDate);
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
    public Schema withGeneratedDate(Optional<String> generatedDate) {
        Utils.checkNotNull(generatedDate, "generatedDate");
        this.generatedDate = generatedDate;
        return this;
    }

    /**
     * Unique identifier of the event.
     */
    public Schema withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of the event.
     */
    public Schema withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Schema withPayload(ReportGenerationPayload payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = Optional.ofNullable(payload);
        return this;
    }

    public Schema withPayload(Optional<? extends ReportGenerationPayload> payload) {
        Utils.checkNotNull(payload, "payload");
        this.payload = payload;
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
        Schema other = (Schema) o;
        return 
            Objects.deepEquals(this.eventType, other.eventType) &&
            Objects.deepEquals(this.generatedDate, other.generatedDate) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.payload, other.payload);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            eventType,
            generatedDate,
            id,
            payload);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schema.class,
                "eventType", eventType,
                "generatedDate", generatedDate,
                "id", id,
                "payload", payload);
    }
    
    public final static class Builder {
 
        private Optional<String> eventType = Optional.empty();
 
        private Optional<String> generatedDate = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends ReportGenerationPayload> payload = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of event.
         */
        public Builder eventType(String eventType) {
            Utils.checkNotNull(eventType, "eventType");
            this.eventType = Optional.ofNullable(eventType);
            return this;
        }

        /**
         * The type of event.
         */
        public Builder eventType(Optional<String> eventType) {
            Utils.checkNotNull(eventType, "eventType");
            this.eventType = eventType;
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
        public Builder generatedDate(String generatedDate) {
            Utils.checkNotNull(generatedDate, "generatedDate");
            this.generatedDate = Optional.ofNullable(generatedDate);
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
        public Builder generatedDate(Optional<String> generatedDate) {
            Utils.checkNotNull(generatedDate, "generatedDate");
            this.generatedDate = generatedDate;
            return this;
        }

        /**
         * Unique identifier of the event.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of the event.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder payload(ReportGenerationPayload payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = Optional.ofNullable(payload);
            return this;
        }

        public Builder payload(Optional<? extends ReportGenerationPayload> payload) {
            Utils.checkNotNull(payload, "payload");
            this.payload = payload;
            return this;
        }
        
        public Schema build() {
            return new Schema(
                eventType,
                generatedDate,
                id,
                payload);
        }
    }
}

