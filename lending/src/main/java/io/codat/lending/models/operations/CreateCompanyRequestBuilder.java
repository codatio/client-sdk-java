/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class CreateCompanyRequestBuilder {

    private Optional<? extends CompanyRequestBody> request = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateCompany sdk;

    public CreateCompanyRequestBuilder(SDKMethodInterfaces.MethodCallCreateCompany sdk) {
        this.sdk = sdk;
    }
                
    public CreateCompanyRequestBuilder request(io.codat.lending.models.shared.CompanyRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateCompanyRequestBuilder request(java.util.Optional<? extends io.codat.lending.models.shared.CompanyRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CreateCompanyRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateCompanyRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateCompanyResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}
