/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.expenses.utils.HTTPClient;
import io.codat.sync.expenses.utils.HTTPRequest;
import io.codat.sync.expenses.utils.JSON;
import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.SerializedBody;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Create reimbursable expense transactions.
 */
public class Reimbursements implements
            MethodCallCreateReimbursableExpenseTransaction,
            MethodCallUpdateReimbursableExpenseTransaction {

    private final SDKConfiguration sdkConfiguration;

    Reimbursements(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequestBuilder create() {
        return new io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequestBuilder(this);
    }

    /**
     * Create reimbursable expense transaction
     * Use the *Create reimbursable expense* endpoint to create a [reimbursement request](https://docs.codat.io/sync-for-expenses-api#/schemas/Reimburseable-Expense-Transactions) in the accounting platform for a given company's connection. 
     * 
     * Employee reimbursement requests are reflected in the accounting system in the form of Bills against an employee, who is a supplier.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse create(
            io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.expenses.utils.Utils.generateURL(
                io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest.class,
                baseUrl,
                "/companies/{companyId}/sync/expenses/reimbursable-expense-transactions",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest>() {});
        SerializedBody serializedRequestBody = io.codat.sync.expenses.utils.Utils.serializeRequestBody(
                _convertedRequest, "createReimbursableExpenseRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.sync.expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.expenses.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.expenses.utils.RetryConfig.builder()
                .backoff(io.codat.sync.expenses.utils.BackoffStrategy.builder()
                            .initialInterval(500L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(60000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }

        List<String> statusCodes = new java.util.ArrayList<String>();
        statusCodes.add("408");
        statusCodes.add("429");
        statusCodes.add("5XX");
        io.codat.sync.expenses.utils.Retries retries = io.codat.sync.expenses.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse.Builder resBuilder = 
            io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse>() {});
                res.withCreateReimbursableExpenseResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.expenses.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequestBuilder update() {
        return new io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequestBuilder(this);
    }

    /**
     * Update reimbursable expense transaction
     * The *Update reimbursable expense* endpoint updates an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/operations/create-reimbursable-expense-transaction) in the accounting platform for a given company's connection. 
     * 
     * Employee reimbursement requests are reflected in the accounting system in the form of Bills against an employee, who is a supplier.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse update(
            io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.expenses.utils.Utils.generateURL(
                io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest.class,
                baseUrl,
                "/companies/{companyId}/sync/expenses/reimbursable-expense-transactions/{transactionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest>() {});
        SerializedBody serializedRequestBody = io.codat.sync.expenses.utils.Utils.serializeRequestBody(
                _convertedRequest, "createReimbursableExpenseRequest", "json", false);
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = io.codat.sync.expenses.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        io.codat.sync.expenses.utils.RetryConfig retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            retryConfig = io.codat.sync.expenses.utils.RetryConfig.builder()
                .backoff(io.codat.sync.expenses.utils.BackoffStrategy.builder()
                            .initialInterval(500L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .maxInterval(60000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }

        List<String> statusCodes = new java.util.ArrayList<String>();
        statusCodes.add("408");
        statusCodes.add("429");
        statusCodes.add("5XX");
        io.codat.sync.expenses.utils.Retries retries = io.codat.sync.expenses.utils.Retries.builder()
            .action(() -> client.send(req))
            .retryConfig(retryConfig)
            .statusCodes(statusCodes)
            .build();

        HttpResponse<InputStream> httpRes = retries.run();

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse.Builder resBuilder = 
            io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse>() {});
                res.withCreateReimbursableExpenseResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.expenses.models.components.ErrorMessage out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.ErrorMessage>() {});
                res.withErrorMessage(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
