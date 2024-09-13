/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.RetryConfig;
import io.codat.sync.payroll.utils.Utils;
import java.util.Optional;

public class CreateAccountRequestBuilder {

    private CreateAccountRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateAccount sdk;

    public CreateAccountRequestBuilder(SDKMethodInterfaces.MethodCallCreateAccount sdk) {
        this.sdk = sdk;
    }

    public CreateAccountRequestBuilder request(io.codat.sync.payroll.models.operations.CreateAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateAccountRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateAccountRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateAccountResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}
