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
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Retrieve the status of transactions within a sync.
 */
public class TransactionStatus implements
            MethodCallGetSyncTransaction,
            MethodCallListSyncTransactions {

    private final SDKConfiguration sdkConfiguration;

    TransactionStatus(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public io.codat.sync.expenses.models.operations.GetSyncTransactionRequestBuilder get() {
        return new io.codat.sync.expenses.models.operations.GetSyncTransactionRequestBuilder(this);
    }

    /**
     * Get sync transaction
     * Gets the status of a transaction for a sync
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.expenses.models.operations.GetSyncTransactionResponse get(
            io.codat.sync.expenses.models.operations.GetSyncTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.expenses.utils.Utils.generateURL(
                io.codat.sync.expenses.models.operations.GetSyncTransactionRequest.class,
                baseUrl,
                "/companies/{companyId}/sync/expenses/syncs/{syncId}/transactions/{transactionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

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
        io.codat.sync.expenses.models.operations.GetSyncTransactionResponse.Builder resBuilder = 
            io.codat.sync.expenses.models.operations.GetSyncTransactionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.expenses.models.operations.GetSyncTransactionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<io.codat.sync.expenses.models.components.Transaction> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<io.codat.sync.expenses.models.components.Transaction>>() {});
                res.withTransactionResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 402 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500 || httpRes.statusCode() == 503) {
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


    public io.codat.sync.expenses.models.operations.ListSyncTransactionsRequestBuilder list() {
        return new io.codat.sync.expenses.models.operations.ListSyncTransactionsRequestBuilder(this);
    }

    /**
     * List sync transactions
     * Gets the transactions and status for a sync
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse list(
            io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }


        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = io.codat.sync.expenses.utils.Utils.generateURL(
                io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest.class,
                baseUrl,
                "/companies/{companyId}/sync/expenses/syncs/{syncId}/transactions",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = io.codat.sync.expenses.utils.Utils.getQueryParams(
                io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

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
        io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse.Builder resBuilder = 
            io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (io.codat.sync.expenses.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.codat.sync.expenses.models.components.Transactions out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.Transactions>() {});
                res.withTransactions(java.util.Optional.ofNullable(out));
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
