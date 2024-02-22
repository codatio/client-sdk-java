/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync_for_payables.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync_for_payables.utils.LazySingletonValue;
import io.codat.sync_for_payables.utils.Options.Builder;
import io.codat.sync_for_payables.utils.Options;
import io.codat.sync_for_payables.utils.Utils;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateBillPaymentRequestBuilder {

    private CreateBillPaymentRequest request;
    private Optional<io.codat.sync_for_payables.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateBillPayment sdk;

    public CreateBillPaymentRequestBuilder(SDKMethodInterfaces.MethodCallCreateBillPayment sdk) {
        this.sdk = sdk;
    }

    public CreateBillPaymentRequestBuilder request(CreateBillPaymentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateBillPaymentRequestBuilder retryConfig(io.codat.sync_for_payables.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CreateBillPaymentRequestBuilder retryConfig(Optional<io.codat.sync_for_payables.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CreateBillPaymentResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            request,
            options);
    }
}