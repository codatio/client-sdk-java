/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class ListCommerceProductsRequestBuilder {

    private ListCommerceProductsRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListCommerceProducts sdk;

    public ListCommerceProductsRequestBuilder(SDKMethodInterfaces.MethodCallListCommerceProducts sdk) {
        this.sdk = sdk;
    }

    public ListCommerceProductsRequestBuilder request(io.codat.lending.models.operations.ListCommerceProductsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public ListCommerceProductsRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListCommerceProductsRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListCommerceProductsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}
