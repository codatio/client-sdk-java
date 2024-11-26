/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.models.components.CreateReimbursableExpenseResponse;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequestBuilder;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse;
import io.codat.sync.expenses.models.operations.SDKMethodInterfaces.*;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequestBuilder;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse;
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
 * Create and update transactions that represent your customers' repayable spend.
 */
public class Reimbursements implements
            MethodCallCreateReimbursableExpenseTransaction,
            MethodCallUpdateReimbursableExpenseTransaction {

    private final SDKConfiguration sdkConfiguration;

    Reimbursements(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create reimbursable expense transaction
     * Use the *Create reimbursable expense* endpoint to submit an employee expense claim in the accounting platform for a given company's connection.
     * 
     * [Reimbursable expense requests](https://docs.codat.io/sync-for-expenses-api#/schemas/ReimbursableExpenseTransactionRequest) are reflected in the accounting software in the form of **Bills** against an employee (who exists as a supplier in the accounting platform).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @return The call builder
     */
    public CreateReimbursableExpenseTransactionRequestBuilder create() {
        return new CreateReimbursableExpenseTransactionRequestBuilder(this);
    }

    /**
     * Create reimbursable expense transaction
     * Use the *Create reimbursable expense* endpoint to submit an employee expense claim in the accounting platform for a given company's connection.
     * 
     * [Reimbursable expense requests](https://docs.codat.io/sync-for-expenses-api#/schemas/ReimbursableExpenseTransactionRequest) are reflected in the accounting software in the form of **Bills** against an employee (who exists as a supplier in the accounting platform).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateReimbursableExpenseTransactionResponse create(
            CreateReimbursableExpenseTransactionRequest request) throws Exception {
        return create(request, Optional.empty());
    }
    
    /**
     * Create reimbursable expense transaction
     * Use the *Create reimbursable expense* endpoint to submit an employee expense claim in the accounting platform for a given company's connection.
     * 
     * [Reimbursable expense requests](https://docs.codat.io/sync-for-expenses-api#/schemas/ReimbursableExpenseTransactionRequest) are reflected in the accounting software in the form of **Bills** against an employee (who exists as a supplier in the accounting platform).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Desktop    | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateReimbursableExpenseTransactionResponse create(
            CreateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateReimbursableExpenseTransactionRequest.class,
                _baseUrl,
                "/companies/{companyId}/sync/expenses/reimbursable-expense-transactions",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateReimbursableExpenseTransactionRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
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
                                "create-reimbursable-expense-transaction", 
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
                                "create-reimbursable-expense-transaction",
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
                         "create-reimbursable-expense-transaction", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateReimbursableExpenseTransactionResponse.Builder _resBuilder = 
            CreateReimbursableExpenseTransactionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateReimbursableExpenseTransactionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CreateReimbursableExpenseResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CreateReimbursableExpenseResponse>() {});
                _res.withCreateReimbursableExpenseResponse(Optional.ofNullable(_out));
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



    /**
     * Update reimbursable expense transaction
     * The *Update reimbursable expense* endpoint updates an existing employee expense claim in the accounting platform for a given company's connection. 
     * 
     * Updating an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateReimbursableExpenseTransactionRequest) will update the existing **bill** against an employee (who exists as a supplier in the accounting software).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @return The call builder
     */
    public UpdateReimbursableExpenseTransactionRequestBuilder update() {
        return new UpdateReimbursableExpenseTransactionRequestBuilder(this);
    }

    /**
     * Update reimbursable expense transaction
     * The *Update reimbursable expense* endpoint updates an existing employee expense claim in the accounting platform for a given company's connection. 
     * 
     * Updating an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateReimbursableExpenseTransactionRequest) will update the existing **bill** against an employee (who exists as a supplier in the accounting software).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateReimbursableExpenseTransactionResponse update(
            UpdateReimbursableExpenseTransactionRequest request) throws Exception {
        return update(request, Optional.empty());
    }
    
    /**
     * Update reimbursable expense transaction
     * The *Update reimbursable expense* endpoint updates an existing employee expense claim in the accounting platform for a given company's connection. 
     * 
     * Updating an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateReimbursableExpenseTransactionRequest) will update the existing **bill** against an employee (who exists as a supplier in the accounting software).
     * 
     * ### Supported Integrations
     * | Integration           | Supported |
     * |-----------------------|-----------|
     * | FreeAgent             | Yes       |
     * | QuickBooks Online     | Yes       |
     * | Oracle NetSuite       | Yes       |
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateReimbursableExpenseTransactionResponse update(
            UpdateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateReimbursableExpenseTransactionRequest.class,
                _baseUrl,
                "/companies/{companyId}/sync/expenses/reimbursable-expense-transactions/{transactionId}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateReimbursableExpenseTransactionRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "updateReimbursableExpenseTransactionRequest",
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
                                "update-reimbursable-expense-transaction", 
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
                                "update-reimbursable-expense-transaction",
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
                         "update-reimbursable-expense-transaction", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateReimbursableExpenseTransactionResponse.Builder _resBuilder = 
            UpdateReimbursableExpenseTransactionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateReimbursableExpenseTransactionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CreateReimbursableExpenseResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CreateReimbursableExpenseResponse>() {});
                _res.withCreateReimbursableExpenseResponse(Optional.ofNullable(_out));
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
