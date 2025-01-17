/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.Utils;
import java.util.Optional;

public class CreateCustomerRequestBuilder {

    private CreateCustomerRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateCustomer sdk;

    public CreateCustomerRequestBuilder(SDKMethodInterfaces.MethodCallCreateCustomer sdk) {
        this.sdk = sdk;
    }

    public CreateCustomerRequestBuilder request(CreateCustomerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateCustomerRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateCustomerRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateCustomerResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}
