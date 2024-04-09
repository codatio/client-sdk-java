/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.utils.LazySingletonValue;
import io.codat.sync.expenses.utils.Options.Builder;
import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateReimbursableExpenseTransactionRequestBuilder {

    private UpdateReimbursableExpenseTransactionRequest request;
    private Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateReimbursableExpenseTransaction sdk;

    public UpdateReimbursableExpenseTransactionRequestBuilder(SDKMethodInterfaces.MethodCallUpdateReimbursableExpenseTransaction sdk) {
        this.sdk = sdk;
    }

    public UpdateReimbursableExpenseTransactionRequestBuilder request(UpdateReimbursableExpenseTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public UpdateReimbursableExpenseTransactionRequestBuilder retryConfig(io.codat.sync.expenses.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UpdateReimbursableExpenseTransactionRequestBuilder retryConfig(Optional<io.codat.sync.expenses.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UpdateReimbursableExpenseTransactionResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            request,
            options);
    }
}
