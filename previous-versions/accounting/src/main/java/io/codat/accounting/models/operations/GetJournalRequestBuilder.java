/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.accounting.models.operations;

import io.codat.accounting.utils.Options;
import io.codat.accounting.utils.RetryConfig;
import io.codat.accounting.utils.Utils;
import java.util.Optional;

public class GetJournalRequestBuilder {

    private GetJournalRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetJournal sdk;

    public GetJournalRequestBuilder(SDKMethodInterfaces.MethodCallGetJournal sdk) {
        this.sdk = sdk;
    }

    public GetJournalRequestBuilder request(io.codat.accounting.models.operations.GetJournalRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetJournalRequestBuilder retryConfig(io.codat.accounting.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetJournalRequestBuilder retryConfig(java.util.Optional<io.codat.accounting.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetJournalResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
