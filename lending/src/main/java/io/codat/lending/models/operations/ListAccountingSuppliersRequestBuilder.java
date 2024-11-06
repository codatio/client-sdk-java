/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class ListAccountingSuppliersRequestBuilder {

    private ListAccountingSuppliersRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListAccountingSuppliers sdk;

    public ListAccountingSuppliersRequestBuilder(SDKMethodInterfaces.MethodCallListAccountingSuppliers sdk) {
        this.sdk = sdk;
    }

    public ListAccountingSuppliersRequestBuilder request(ListAccountingSuppliersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListAccountingSuppliersRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListAccountingSuppliersRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListAccountingSuppliersResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}
