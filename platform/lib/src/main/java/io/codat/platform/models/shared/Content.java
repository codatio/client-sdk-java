/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import io.codat.platform.utils.Utils;
import java.io.InputStream;


public class Content {

    public Content() {
        
        
    }
    
    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(Content.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }        
        
        public Content build() {
            return new Content(
                );
        }
    }
}

