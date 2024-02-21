/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import org.openapitools.jackson.nullable.JsonNullable;


public class Attachments {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachments")
    private JsonNullable<? extends java.util.List<AccountingAttachment>> attachments;

    public Attachments(
            @JsonProperty("attachments") JsonNullable<? extends java.util.List<AccountingAttachment>> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = attachments;
    }

    public JsonNullable<? extends java.util.List<AccountingAttachment>> attachments() {
        return attachments;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public Attachments withAttachments(java.util.List<AccountingAttachment> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = JsonNullable.of(attachments);
        return this;
    }

    public Attachments withAttachments(JsonNullable<? extends java.util.List<AccountingAttachment>> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = attachments;
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
        Attachments other = (Attachments) o;
        return 
            java.util.Objects.deepEquals(this.attachments, other.attachments);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attachments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attachments.class,
                "attachments", attachments);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.List<AccountingAttachment>> attachments = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder attachments(java.util.List<AccountingAttachment> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = JsonNullable.of(attachments);
            return this;
        }

        public Builder attachments(JsonNullable<? extends java.util.List<AccountingAttachment>> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = attachments;
            return this;
        }
        
        public Attachments build() {
            return new Attachments(
                attachments);
        }
    }
}
