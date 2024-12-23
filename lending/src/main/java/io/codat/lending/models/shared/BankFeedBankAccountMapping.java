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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class BankFeedBankAccountMapping {

    /**
     * Unique ID for the source account
     */
    @JsonProperty("sourceAccountId")
    private String sourceAccountId;

    /**
     * Unique ID for the target account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("targetAccountId")
    private JsonNullable<String> targetAccountId;

    @JsonCreator
    public BankFeedBankAccountMapping(
            @JsonProperty("sourceAccountId") String sourceAccountId,
            @JsonProperty("targetAccountId") JsonNullable<String> targetAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
    }
    
    public BankFeedBankAccountMapping(
            String sourceAccountId) {
        this(sourceAccountId, JsonNullable.undefined());
    }

    /**
     * Unique ID for the source account
     */
    @JsonIgnore
    public String sourceAccountId() {
        return sourceAccountId;
    }

    /**
     * Unique ID for the target account
     */
    @JsonIgnore
    public JsonNullable<String> targetAccountId() {
        return targetAccountId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique ID for the source account
     */
    public BankFeedBankAccountMapping withSourceAccountId(String sourceAccountId) {
        Utils.checkNotNull(sourceAccountId, "sourceAccountId");
        this.sourceAccountId = sourceAccountId;
        return this;
    }

    /**
     * Unique ID for the target account
     */
    public BankFeedBankAccountMapping withTargetAccountId(String targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = JsonNullable.of(targetAccountId);
        return this;
    }

    /**
     * Unique ID for the target account
     */
    public BankFeedBankAccountMapping withTargetAccountId(JsonNullable<String> targetAccountId) {
        Utils.checkNotNull(targetAccountId, "targetAccountId");
        this.targetAccountId = targetAccountId;
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
        BankFeedBankAccountMapping other = (BankFeedBankAccountMapping) o;
        return 
            Objects.deepEquals(this.sourceAccountId, other.sourceAccountId) &&
            Objects.deepEquals(this.targetAccountId, other.targetAccountId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sourceAccountId,
            targetAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankFeedBankAccountMapping.class,
                "sourceAccountId", sourceAccountId,
                "targetAccountId", targetAccountId);
    }
    
    public final static class Builder {
 
        private String sourceAccountId;
 
        private JsonNullable<String> targetAccountId = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique ID for the source account
         */
        public Builder sourceAccountId(String sourceAccountId) {
            Utils.checkNotNull(sourceAccountId, "sourceAccountId");
            this.sourceAccountId = sourceAccountId;
            return this;
        }

        /**
         * Unique ID for the target account
         */
        public Builder targetAccountId(String targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = JsonNullable.of(targetAccountId);
            return this;
        }

        /**
         * Unique ID for the target account
         */
        public Builder targetAccountId(JsonNullable<String> targetAccountId) {
            Utils.checkNotNull(targetAccountId, "targetAccountId");
            this.targetAccountId = targetAccountId;
            return this;
        }
        
        public BankFeedBankAccountMapping build() {
            return new BankFeedBankAccountMapping(
                sourceAccountId,
                targetAccountId);
        }
    }
}

