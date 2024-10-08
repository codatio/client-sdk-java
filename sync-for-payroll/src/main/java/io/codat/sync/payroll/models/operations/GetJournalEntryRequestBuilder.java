/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.RetryConfig;
import io.codat.sync.payroll.utils.Utils;
import java.util.Optional;

public class GetJournalEntryRequestBuilder {

    private GetJournalEntryRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetJournalEntry sdk;

    public GetJournalEntryRequestBuilder(SDKMethodInterfaces.MethodCallGetJournalEntry sdk) {
        this.sdk = sdk;
    }

    public GetJournalEntryRequestBuilder request(io.codat.sync.payroll.models.operations.GetJournalEntryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetJournalEntryRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetJournalEntryRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetJournalEntryResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
