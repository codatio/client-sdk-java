/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.platform.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.platform.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ApiKeys {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends List<ApiKeyDetails>> results;

    @JsonCreator
    public ApiKeys(
            @JsonProperty("results") Optional<? extends List<ApiKeyDetails>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
    }
    
    public ApiKeys() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ApiKeyDetails>> results() {
        return (Optional<List<ApiKeyDetails>>) results;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiKeys withResults(List<ApiKeyDetails> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public ApiKeys withResults(Optional<? extends List<ApiKeyDetails>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
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
        ApiKeys other = (ApiKeys) o;
        return 
            Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiKeys.class,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<ApiKeyDetails>> results = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder results(List<ApiKeyDetails> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends List<ApiKeyDetails>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public ApiKeys build() {
            return new ApiKeys(
                results);
        }
    }
}

