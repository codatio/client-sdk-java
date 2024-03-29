/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.components;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * PhoneNumberType - The type of phone number
 */
public enum PhoneNumberType {
    PRIMARY("Primary"),
    LANDLINE("Landline"),
    MOBILE("Mobile"),
    FAX("Fax"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private PhoneNumberType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
