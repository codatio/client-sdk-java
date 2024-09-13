/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.utils.Options;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.Utils;
import java.util.Optional;

public class GenerateLoanSummaryRequestBuilder {

    private GenerateLoanSummaryRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGenerateLoanSummary sdk;

    public GenerateLoanSummaryRequestBuilder(SDKMethodInterfaces.MethodCallGenerateLoanSummary sdk) {
        this.sdk = sdk;
    }

    public GenerateLoanSummaryRequestBuilder request(io.codat.lending.models.operations.GenerateLoanSummaryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GenerateLoanSummaryRequestBuilder retryConfig(io.codat.lending.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GenerateLoanSummaryRequestBuilder retryConfig(java.util.Optional<io.codat.lending.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GenerateLoanSummaryResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.generateLoanSummary(
            request,
            options);
    }
}
