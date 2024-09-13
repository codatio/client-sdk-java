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
import java.util.Objects;
import java.util.Optional;


public class Links {

    @JsonProperty("current")
    private HalRef current;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<? extends HalRef> next;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<? extends HalRef> previous;

    @JsonProperty("self")
    private HalRef self;

    @JsonCreator
    public Links(
            @JsonProperty("current") HalRef current,
            @JsonProperty("next") Optional<? extends HalRef> next,
            @JsonProperty("previous") Optional<? extends HalRef> previous,
            @JsonProperty("self") HalRef self) {
        Utils.checkNotNull(current, "current");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(previous, "previous");
        Utils.checkNotNull(self, "self");
        this.current = current;
        this.next = next;
        this.previous = previous;
        this.self = self;
    }
    
    public Links(
            HalRef current,
            HalRef self) {
        this(current, Optional.empty(), Optional.empty(), self);
    }

    @JsonIgnore
    public HalRef current() {
        return current;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HalRef> next() {
        return (Optional<HalRef>) next;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HalRef> previous() {
        return (Optional<HalRef>) previous;
    }

    @JsonIgnore
    public HalRef self() {
        return self;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Links withCurrent(HalRef current) {
        Utils.checkNotNull(current, "current");
        this.current = current;
        return this;
    }

    public Links withNext(HalRef next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public Links withNext(Optional<? extends HalRef> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public Links withPrevious(HalRef previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public Links withPrevious(Optional<? extends HalRef> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
        return this;
    }

    public Links withSelf(HalRef self) {
        Utils.checkNotNull(self, "self");
        this.self = self;
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
        Links other = (Links) o;
        return 
            Objects.deepEquals(this.current, other.current) &&
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.previous, other.previous) &&
            Objects.deepEquals(this.self, other.self);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            current,
            next,
            previous,
            self);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Links.class,
                "current", current,
                "next", next,
                "previous", previous,
                "self", self);
    }
    
    public final static class Builder {
 
        private HalRef current;
 
        private Optional<? extends HalRef> next = Optional.empty();
 
        private Optional<? extends HalRef> previous = Optional.empty();
 
        private HalRef self;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder current(HalRef current) {
            Utils.checkNotNull(current, "current");
            this.current = current;
            return this;
        }

        public Builder next(HalRef next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<? extends HalRef> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder previous(HalRef previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<? extends HalRef> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }

        public Builder self(HalRef self) {
            Utils.checkNotNull(self, "self");
            this.self = self;
            return this;
        }
        
        public Links build() {
            return new Links(
                current,
                next,
                previous,
                self);
        }
    }
}

