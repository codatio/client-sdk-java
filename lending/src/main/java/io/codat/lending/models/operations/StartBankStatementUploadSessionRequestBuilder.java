/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class StartBankStatementUploadSessionRequestBuilder {

    private StartBankStatementUploadSessionRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallStartBankStatementUploadSession sdk;

    public StartBankStatementUploadSessionRequestBuilder(SDKMethodInterfaces.MethodCallStartBankStatementUploadSession sdk) {
        this.sdk = sdk;
    }

    public StartBankStatementUploadSessionRequestBuilder request(io.codat.lending.models.operations.StartBankStatementUploadSessionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public StartBankStatementUploadSessionRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public StartBankStatementUploadSessionRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public StartBankStatementUploadSessionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.startUploadSession(
            request,
            options);
    }
}
