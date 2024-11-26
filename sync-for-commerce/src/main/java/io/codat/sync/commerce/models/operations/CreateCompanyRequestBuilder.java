/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.models.components.CreateCompany;
import io.codat.sync.commerce.utils.Options;
import io.codat.sync.commerce.utils.RetryConfig;
import io.codat.sync.commerce.utils.Utils;
import java.util.Optional;

public class CreateCompanyRequestBuilder {

    private Optional<? extends CreateCompany> request = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateCompany sdk;

    public CreateCompanyRequestBuilder(SDKMethodInterfaces.MethodCallCreateCompany sdk) {
        this.sdk = sdk;
    }
                
    public CreateCompanyRequestBuilder request(CreateCompany request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateCompanyRequestBuilder request(Optional<? extends CreateCompany> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateCompanyRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateCompanyRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateCompanyResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.createCompany(
            request,
            options);
    }
}
