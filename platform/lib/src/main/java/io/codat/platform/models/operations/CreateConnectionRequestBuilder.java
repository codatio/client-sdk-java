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

public class CreateConnectionRequestBuilder {

    private CreateConnectionRequest request;

    private final SDKMethodInterfaces.MethodCallCreateConnection sdk;
    
    public CreateConnectionRequestBuilder(SDKMethodInterfaces.MethodCallCreateConnection sdk) {
        this.sdk = sdk;
    }
             
    public CreateConnectionRequestBuilder request(CreateConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateConnectionResponse call() throws Exception {
        return sdk.create(
            request);
    }
}