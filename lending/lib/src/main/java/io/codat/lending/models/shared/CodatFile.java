/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.codat.lending.utils.SpeakeasyMetadata;
import io.codat.lending.utils.Utils;
import java.io.InputStream;


public class CodatFile {

    @SpeakeasyMetadata("multipartForm:content")
    private byte[] content;

    @SpeakeasyMetadata("multipartForm:name=fileName")
    private String fileName;

    public CodatFile(
            byte[] content,
            String fileName) {
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(fileName, "fileName");
        this.content = content;
        this.fileName = fileName;
    }

    public byte[] content() {
        return content;
    }

    public String fileName() {
        return fileName;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CodatFile withContent(byte[] content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public CodatFile withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
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
        CodatFile other = (CodatFile) o;
        return 
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.fileName, other.fileName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            content,
            fileName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CodatFile.class,
                "content", content,
                "fileName", fileName);
    }
    
    public final static class Builder {
 
        private byte[] content;
 
        private String fileName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder content(byte[] content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }        
        
        public CodatFile build() {
            return new CodatFile(
                content,
                fileName);
        }
    }
}

