/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payroll.utils.LazySingletonValue;
import io.codat.sync.payroll.utils.Options.Builder;
import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ListPushOperationsRequestBuilder {

    private ListPushOperationsRequest request;
    private Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListPushOperations sdk;

    public ListPushOperationsRequestBuilder(SDKMethodInterfaces.MethodCallListPushOperations sdk) {
        this.sdk = sdk;
    }

    public ListPushOperationsRequestBuilder request(ListPushOperationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPushOperationsRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListPushOperationsRequestBuilder retryConfig(Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListPushOperationsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}