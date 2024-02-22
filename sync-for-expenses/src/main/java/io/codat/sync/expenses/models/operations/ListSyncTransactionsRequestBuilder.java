/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.Options.Builder;
import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ListSyncTransactionsRequestBuilder {

    private ListSyncTransactionsRequest request;
    private Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListSyncTransactions sdk;

    public ListSyncTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallListSyncTransactions sdk) {
        this.sdk = sdk;
    }

    public ListSyncTransactionsRequestBuilder request(ListSyncTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListSyncTransactionsRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListSyncTransactionsRequestBuilder retryConfig(Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListSyncTransactionsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}