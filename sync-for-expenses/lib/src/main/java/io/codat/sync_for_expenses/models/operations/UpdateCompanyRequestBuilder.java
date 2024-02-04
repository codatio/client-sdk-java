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

public class UpdateCompanyRequestBuilder {

    private UpdateCompanyRequest request;

    private final SDKMethodInterfaces.MethodCallUpdateCompany sdk;
    
    public UpdateCompanyRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCompany sdk) {
        this.sdk = sdk;
    }
             
    public UpdateCompanyRequestBuilder request(UpdateCompanyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCompanyResponse call() throws Exception {
        return sdk.updateCompany(
            request);
    }
}