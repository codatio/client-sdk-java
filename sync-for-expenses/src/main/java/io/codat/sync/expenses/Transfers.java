/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.models.components.TransferTransactionResponse;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionRequestBuilder;
import io.codat.sync.expenses.models.operations.CreateTransferTransactionResponse;
import io.codat.sync.expenses.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.expenses.utils.BackoffStrategy;
import io.codat.sync.expenses.utils.HTTPClient;
import io.codat.sync.expenses.utils.HTTPRequest;
import io.codat.sync.expenses.utils.Hook.AfterErrorContextImpl;
import io.codat.sync.expenses.utils.Hook.AfterSuccessContextImpl;
import io.codat.sync.expenses.utils.Hook.BeforeRequestContextImpl;
import io.codat.sync.expenses.utils.Options;
import io.codat.sync.expenses.utils.Retries.NonRetryableException;
import io.codat.sync.expenses.utils.Retries;
import io.codat.sync.expenses.utils.RetryConfig;
import io.codat.sync.expenses.utils.SerializedBody;
import io.codat.sync.expenses.utils.Utils.JsonShape;
import io.codat.sync.expenses.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

/**
 * Create and update transactions that represent the movement of your customers' money.
 */
public class Transfers implements
            MethodCallCreateTransferTransaction {

    private final SDKConfiguration sdkConfiguration;

    Transfers(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create transfer transaction
     * Use the *Create transfer* endpoint to create or update a [transfer transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/TransferTransactionRequest) in the accounting software for a given company's connection. 
     * 
     * Transfers record the movement of money between two bank accounts, or between a bank account and a nominal account. Use them to represent actions such as topping up a debit card account or a balance transfer to another credit card.
     * 
     * The `from.amount` and `to.amount` fields are in the native currency of the account.
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Xero                  | Yes       |
     * @return The call builder
     */
    public CreateTransferTransactionRequestBuilder create() {
        return new CreateTransferTransactionRequestBuilder(this);
    }

    /**
     * Create transfer transaction
     * Use the *Create transfer* endpoint to create or update a [transfer transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/TransferTransactionRequest) in the accounting software for a given company's connection. 
     * 
     * Transfers record the movement of money between two bank accounts, or between a bank account and a nominal account. Use them to represent actions such as topping up a debit card account or a balance transfer to another credit card.
     * 
     * The `from.amount` and `to.amount` fields are in the native currency of the account.
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Xero                  | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateTransferTransactionResponse create(
            CreateTransferTransactionRequest request) throws Exception {
        return create(request, Optional.empty());
    }
    
    /**
     * Create transfer transaction
     * Use the *Create transfer* endpoint to create or update a [transfer transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/TransferTransactionRequest) in the accounting software for a given company's connection. 
     * 
     * Transfers record the movement of money between two bank accounts, or between a bank account and a nominal account. Use them to represent actions such as topping up a debit card account or a balance transfer to another credit card.
     * 
     * The `from.amount` and `to.amount` fields are in the native currency of the account.
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Xero                  | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateTransferTransactionResponse create(
            CreateTransferTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateTransferTransactionRequest.class,
                _baseUrl,
                "/companies/{companyId}/sync/expenses/transfer-transactions/{transactionId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateTransferTransactionRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "transferTransactionRequest",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("408");
        _statusCodes.add("429");
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                "create-transfer-transaction", 
                                Optional.of(List.of()), 
                                sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                "create-transfer-transaction",
                                 Optional.of(List.of()),
                                 sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         "create-transfer-transaction", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateTransferTransactionResponse.Builder _resBuilder = 
            CreateTransferTransactionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateTransferTransactionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                TransferTransactionResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<TransferTransactionResponse>() {});
                _res.withTransferTransactionResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "403", "404", "429", "500", "503")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ErrorMessage _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ErrorMessage>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
