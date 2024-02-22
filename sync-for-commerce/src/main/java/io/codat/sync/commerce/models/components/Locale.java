/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import io.codat.sync.commerce.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

public enum Locale {
    EN_US("en-us"),
    FR_FR("fr-fr");

    @JsonValue
    private final String value;

    private Locale(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}