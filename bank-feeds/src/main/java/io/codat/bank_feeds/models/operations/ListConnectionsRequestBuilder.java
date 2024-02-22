/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.bank_feeds.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.bank_feeds.utils.LazySingletonValue;
import io.codat.bank_feeds.utils.Options.Builder;
import io.codat.bank_feeds.utils.Options;
import io.codat.bank_feeds.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ListConnectionsRequestBuilder {

    private ListConnectionsRequest request;
    private Optional<io.codat.bank_feeds.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListConnections sdk;

    public ListConnectionsRequestBuilder(SDKMethodInterfaces.MethodCallListConnections sdk) {
        this.sdk = sdk;
    }

    public ListConnectionsRequestBuilder request(ListConnectionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListConnectionsRequestBuilder retryConfig(io.codat.bank_feeds.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListConnectionsRequestBuilder retryConfig(Optional<io.codat.bank_feeds.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListConnectionsResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}