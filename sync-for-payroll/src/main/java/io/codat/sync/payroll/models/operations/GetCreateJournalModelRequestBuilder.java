/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payroll.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.payroll.utils.LazySingletonValue;
import io.codat.sync.payroll.utils.Options.Builder;
import io.codat.sync.payroll.utils.Options;
import io.codat.sync.payroll.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetCreateJournalModelRequestBuilder {

    private GetCreateJournalModelRequest request;
    private Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCreateJournalModel sdk;

    public GetCreateJournalModelRequestBuilder(SDKMethodInterfaces.MethodCallGetCreateJournalModel sdk) {
        this.sdk = sdk;
    }

    public GetCreateJournalModelRequestBuilder request(GetCreateJournalModelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCreateJournalModelRequestBuilder retryConfig(io.codat.sync.payroll.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetCreateJournalModelRequestBuilder retryConfig(Optional<io.codat.sync.payroll.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetCreateJournalModelResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getCreateModel(
            request,
            options);
    }
}