/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.RetryConfig;
import io.codat.sync.payroll.utils.Utils;
import java.util.Optional;

public class DeleteJournalEntryRequestBuilder {

    private DeleteJournalEntryRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteJournalEntry sdk;

    public DeleteJournalEntryRequestBuilder(SDKMethodInterfaces.MethodCallDeleteJournalEntry sdk) {
        this.sdk = sdk;
    }

    public DeleteJournalEntryRequestBuilder request(io.codat.sync.payroll.models.operations.DeleteJournalEntryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public DeleteJournalEntryRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public DeleteJournalEntryRequestBuilder retryConfig(java.util.Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public DeleteJournalEntryResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            request,
            options);
    }
}
