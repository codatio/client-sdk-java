/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.Options.Builder;
import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateSupplierRequestBuilder {

    private CreateSupplierRequest request;
    private Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateSupplier sdk;

    public CreateSupplierRequestBuilder(SDKMethodInterfaces.MethodCallCreateSupplier sdk) {
        this.sdk = sdk;
    }

    public CreateSupplierRequestBuilder request(CreateSupplierRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateSupplierRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateSupplierRequestBuilder retryConfig(Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateSupplierResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}