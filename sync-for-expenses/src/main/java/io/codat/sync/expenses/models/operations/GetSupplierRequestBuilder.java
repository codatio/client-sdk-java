/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.Utils;
import java.util.Optional;

public class GetSupplierRequestBuilder {

    private GetSupplierRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetSupplier sdk;

    public GetSupplierRequestBuilder(SDKMethodInterfaces.MethodCallGetSupplier sdk) {
        this.sdk = sdk;
    }

    public GetSupplierRequestBuilder request(io.codat.sync.expenses.models.operations.GetSupplierRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetSupplierRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetSupplierRequestBuilder retryConfig(java.util.Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetSupplierResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
