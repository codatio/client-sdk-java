/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.sync.expenses.utils.SpeakeasyMetadata;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;


public class AttachmentUpload {

    /**
     * The file to be uploaded as an attachment.
     */
    @SpeakeasyMetadata("multipartForm:file")
    private CodatFile file;

    public AttachmentUpload(
            CodatFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
    }

    /**
     * The file to be uploaded as an attachment.
     */
    public CodatFile file() {
        return file;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The file to be uploaded as an attachment.
     */
    public AttachmentUpload withFile(CodatFile file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
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
        AttachmentUpload other = (AttachmentUpload) o;
        return 
            java.util.Objects.deepEquals(this.file, other.file);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            file);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AttachmentUpload.class,
                "file", file);
    }
    
    public final static class Builder {
 
        private CodatFile file;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The file to be uploaded as an attachment.
         */
        public Builder file(CodatFile file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }
        
        public AttachmentUpload build() {
            return new AttachmentUpload(
                file);
        }
    }
}

