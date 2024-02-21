/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import io.codat.lending.CodatLending;
import io.codat.lending.utils.Utils;
import io.codat.lending.utils.LazySingletonValue;

public class SetBankStatementUploadConfigurationRequestBuilder {

    private SetBankStatementUploadConfigurationRequest request;

    private final SDKMethodInterfaces.MethodCallSetBankStatementUploadConfiguration sdk;
    
    public SetBankStatementUploadConfigurationRequestBuilder(SDKMethodInterfaces.MethodCallSetBankStatementUploadConfiguration sdk) {
        this.sdk = sdk;
    }
             
    public SetBankStatementUploadConfigurationRequestBuilder request(SetBankStatementUploadConfigurationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SetBankStatementUploadConfigurationResponse call() throws Exception {
        return sdk.setUploadConfiguration(
            request);
    }
}