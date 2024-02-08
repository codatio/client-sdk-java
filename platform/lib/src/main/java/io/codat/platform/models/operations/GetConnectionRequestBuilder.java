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

public class GetConnectionRequestBuilder {

    private GetConnectionRequest request;

    private final SDKMethodInterfaces.MethodCallGetConnection sdk;
    
    public GetConnectionRequestBuilder(SDKMethodInterfaces.MethodCallGetConnection sdk) {
        this.sdk = sdk;
    }
             
    public GetConnectionRequestBuilder request(GetConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetConnectionResponse call() throws Exception {
        return sdk.get(
            request);
    }
}