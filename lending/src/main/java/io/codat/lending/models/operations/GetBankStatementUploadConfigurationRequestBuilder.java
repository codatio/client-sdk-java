/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GetBankStatementUploadConfigurationRequestBuilder {

    private GetBankStatementUploadConfigurationRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetBankStatementUploadConfiguration sdk;

    public GetBankStatementUploadConfigurationRequestBuilder(SDKMethodInterfaces.MethodCallGetBankStatementUploadConfiguration sdk) {
        this.sdk = sdk;
    }

    public GetBankStatementUploadConfigurationRequestBuilder request(GetBankStatementUploadConfigurationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetBankStatementUploadConfigurationRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetBankStatementUploadConfigurationRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetBankStatementUploadConfigurationResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getUploadConfiguration(
            request,
            options);
    }
}
