/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.CreateBankAccountRequest;
import io.codat.lending.models.operations.CreateBankAccountRequestBuilder;
import io.codat.lending.models.operations.CreateBankAccountResponse;
import io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelRequest;
import io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelRequestBuilder;
import io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelResponse;
import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.models.shared.AccountingCreateBankAccountResponse;
import io.codat.lending.models.shared.PushOption;
import io.codat.lending.utils.BackoffStrategy;
import io.codat.lending.utils.HTTPClient;
import io.codat.lending.utils.HTTPRequest;
import io.codat.lending.utils.Hook.AfterErrorContextImpl;
import io.codat.lending.utils.Hook.AfterSuccessContextImpl;
import io.codat.lending.utils.Hook.BeforeRequestContextImpl;
import io.codat.lending.utils.Options;
import io.codat.lending.utils.Retries.NonRetryableException;
import io.codat.lending.utils.Retries;
import io.codat.lending.utils.RetryConfig;
import io.codat.lending.utils.SerializedBody;
import io.codat.lending.utils.Utils.JsonShape;
import io.codat.lending.utils.Utils;
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

public class BankAccounts implements
            MethodCallCreateBankAccount,
            MethodCallGetCreateUpdateBankAccountsModel {

    private final SDKConfiguration sdkConfiguration;

    BankAccounts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create bank account
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/lending-api#/operations/get-create-update-bankAccounts-model).
     * @return The call builder
     */
    public CreateBankAccountRequestBuilder create() {
        return new CreateBankAccountRequestBuilder(this);
    }

    /**
     * Create bank account
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/lending-api#/operations/get-create-update-bankAccounts-model).
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
     * The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company's connection.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/lending-api#/operations/get-create-update-bankAccounts-model).
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
                "accountingBankAccount",
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
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
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
                                _hookSecuritySource),
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
                                 _hookSecuritySource), 
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
                         _hookSecuritySource),
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
                AccountingCreateBankAccountResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<AccountingCreateBankAccountResponse>() {});
                _res.withAccountingCreateBankAccountResponse(Optional.ofNullable(_out));
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
     * Get create/update bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * @return The call builder
     */
    public GetCreateUpdateBankAccountsModelRequestBuilder getCreateUpdateModel() {
        return new GetCreateUpdateBankAccountsModelRequestBuilder(this);
    }

    /**
     * Get create/update bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
     * 
     * **Integration-specific behaviour**
     * 
     * See the *response examples* for integration-specific indicative models.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCreateUpdateBankAccountsModelResponse getCreateUpdateModel(
            GetCreateUpdateBankAccountsModelRequest request) throws Exception {
        return getCreateUpdateModel(request, Optional.empty());
    }
    
    /**
     * Get create/update bank account model
     * The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company and integration.
     * 
     * [Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.
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
    public GetCreateUpdateBankAccountsModelResponse getCreateUpdateModel(
            GetCreateUpdateBankAccountsModelRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCreateUpdateBankAccountsModelRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/options/bankAccounts",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
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
                                "get-create-update-bankAccounts-model", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
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
                                "get-create-update-bankAccounts-model",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
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
                         "get-create-update-bankAccounts-model", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCreateUpdateBankAccountsModelResponse.Builder _resBuilder = 
            GetCreateUpdateBankAccountsModelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCreateUpdateBankAccountsModelResponse _res = _resBuilder.build();
        
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
