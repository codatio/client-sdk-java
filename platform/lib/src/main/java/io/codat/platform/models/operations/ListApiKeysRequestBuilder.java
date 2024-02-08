/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.codat.platform.CodatPlatform;
import io.codat.platform.utils.Utils;
import io.codat.platform.utils.LazySingletonValue;

public class ListApiKeysRequestBuilder {


    private final SDKMethodInterfaces.MethodCallListApiKeys sdk;
    
    public ListApiKeysRequestBuilder(SDKMethodInterfaces.MethodCallListApiKeys sdk) {
        this.sdk = sdk;
    }

    public ListApiKeysResponse call() throws Exception {
        return sdk.listApiKeysDirect();
    }
}