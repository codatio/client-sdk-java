/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetCommerceCustomerRequestBuilder {

    private GetCommerceCustomerRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCommerceCustomer sdk;

    public GetCommerceCustomerRequestBuilder(SDKMethodInterfaces.MethodCallGetCommerceCustomer sdk) {
        this.sdk = sdk;
    }

    public GetCommerceCustomerRequestBuilder request(GetCommerceCustomerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetCommerceCustomerRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCommerceCustomerRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCommerceCustomerResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
