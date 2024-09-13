/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.Utils;
import java.util.Optional;

public class ListPushOperationsRequestBuilder {

    private ListPushOperationsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListPushOperations sdk;

    public ListPushOperationsRequestBuilder(SDKMethodInterfaces.MethodCallListPushOperations sdk) {
        this.sdk = sdk;
    }

    public ListPushOperationsRequestBuilder request(io.codat.sync.expenses.models.operations.ListPushOperationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListPushOperationsRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListPushOperationsRequestBuilder retryConfig(java.util.Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
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
