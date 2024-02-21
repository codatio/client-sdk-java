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

public class CreateCompanyRequestBuilder {

    private Optional<? extends io.codat.platform.models.shared.CompanyRequestBody> request = Optional.empty();

    private final SDKMethodInterfaces.MethodCallCreateCompany sdk;
    
    public CreateCompanyRequestBuilder(SDKMethodInterfaces.MethodCallCreateCompany sdk) {
        this.sdk = sdk;
    }
                
    public CreateCompanyRequestBuilder request(io.codat.platform.models.shared.CompanyRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }
             
    public CreateCompanyRequestBuilder request(Optional<? extends io.codat.platform.models.shared.CompanyRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCompanyResponse call() throws Exception {
        return sdk.create(
            request);
    }
}