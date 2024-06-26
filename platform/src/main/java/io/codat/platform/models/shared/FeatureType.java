/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.platform.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * FeatureType - The type of feature.
 */
public enum FeatureType {
    GET("Get"),
    POST("Post"),
    CATEGORIZATION("Categorization"),
    DELETE("Delete"),
    PUT("Put"),
    GET_AS_PDF("GetAsPdf"),
    DOWNLOAD_ATTACHMENT("DownloadAttachment"),
    GET_ATTACHMENT("GetAttachment"),
    GET_ATTACHMENTS("GetAttachments"),
    UPLOAD_ATTACHMENT("UploadAttachment");

    @JsonValue
    private final String value;

    private FeatureType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
