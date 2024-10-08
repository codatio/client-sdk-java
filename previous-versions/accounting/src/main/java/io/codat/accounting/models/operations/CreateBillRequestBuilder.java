/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class CreateBillRequestBuilder {

    private CreateBillRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateBill sdk;

    public CreateBillRequestBuilder(SDKMethodInterfaces.MethodCallCreateBill sdk) {
        this.sdk = sdk;
    }

    public CreateBillRequestBuilder request(io.codat.accounting.models.operations.CreateBillRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateBillRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateBillRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateBillResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}
