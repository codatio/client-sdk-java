/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_expenses.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.utils.Utils;
import io.codat.sync_for_expenses.utils.LazySingletonValue;

public class GetMappingOptionsRequestBuilder {

    private GetMappingOptionsRequest request;

    private final SDKMethodInterfaces.MethodCallGetMappingOptions sdk;
    
    public GetMappingOptionsRequestBuilder(SDKMethodInterfaces.MethodCallGetMappingOptions sdk) {
        this.sdk = sdk;
    }
             
    public GetMappingOptionsRequestBuilder request(GetMappingOptionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMappingOptionsResponse call() throws Exception {
        return sdk.getMappingOptions(
            request);
    }
}