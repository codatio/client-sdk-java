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

public class GetIntegrationsBrandingRequestBuilder {

    private GetIntegrationsBrandingRequest request;

    private final SDKMethodInterfaces.MethodCallGetIntegrationsBranding sdk;
    
    public GetIntegrationsBrandingRequestBuilder(SDKMethodInterfaces.MethodCallGetIntegrationsBranding sdk) {
        this.sdk = sdk;
    }
             
    public GetIntegrationsBrandingRequestBuilder request(GetIntegrationsBrandingRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetIntegrationsBrandingResponse call() throws Exception {
        return sdk.getBranding(
            request);
    }
}