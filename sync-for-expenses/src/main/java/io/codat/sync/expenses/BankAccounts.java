/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.expenses;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.sync.expenses.models.components.PushOption;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.CreateBankAccountRequest;
import io.codat.sync.expenses.models.operations.CreateBankAccountRequestBuilder;
import io.codat.sync.expenses.models.operations.CreateBankAccountResponse;
import io.codat.sync.expenses.models.operations.GetCreateBankAccountsModelRequest;
import io.codat.sync.expenses.models.operations.GetCreateBankAccountsModelRequestBuilder;
import io.codat.sync.expenses.models.operations.GetCreateBankAccountsModelResponse;
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
 * Create bank accounts and view create bank account options.
 */
public class BankAccounts implements
            MethodCallCreateBankAccount,
            MethodCallGetCreateBankAccountsModel {

    private final SDKConfiguration sdkConfiguration;

    BankAccounts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create bank account
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-bankAccounts-model).
     * @return The call builder
     */
    public CreateBankAccountRequestBuilder create() {
        return new CreateBankAccountRequestBuilder(this);
    }

    /**
     * Create bank account
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-bankAccounts-model).
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateBankAccountResponse create(
            CreateBankAccountRequest request) throws Exception {
        return create(request, Optional.empty());
    }
    
    /**
     * Create bank account
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-bankAccounts-model).
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateBankAccountResponse create(
            CreateBankAccountRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateBankAccountRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/push/bankAccounts",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateBankAccountRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "bankAccount",
                "json",
                true);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                CreateBankAccountRequest.class,
                request, 
                null));

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
                                "create-bank-account", 
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
                                "create-bank-account",
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
                         "create-bank-account", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateBankAccountResponse.Builder _resBuilder = 
            CreateBankAccountResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateBankAccountResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.codat.sync.expenses.models.components.CreateBankAccountResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.codat.sync.expenses.models.components.CreateBankAccountResponse>() {});
                _res.withCreateBankAccountResponse(Optional.ofNullable(_out));
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
     * Get create bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * @return The call builder
     */
    public GetCreateBankAccountsModelRequestBuilder getCreateModel() {
        return new GetCreateBankAccountsModelRequestBuilder(this);
    }

    /**
     * Get create bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCreateBankAccountsModelResponse getCreateModel(
            GetCreateBankAccountsModelRequest request) throws Exception {
        return getCreateModel(request, Optional.empty());
    }
    
    /**
     * Get create bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/sync-for-expenses-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCreateBankAccountsModelResponse getCreateModel(
            GetCreateBankAccountsModelRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCreateBankAccountsModelRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/options/bankAccounts",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
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
                                "get-create-bankAccounts-model", 
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
                                "get-create-bankAccounts-model",
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
                         "get-create-bankAccounts-model", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCreateBankAccountsModelResponse.Builder _resBuilder = 
            GetCreateBankAccountsModelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCreateBankAccountsModelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                PushOption _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<PushOption>() {});
                _res.withPushOption(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "402", "403", "404", "429", "500", "503")) {
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
