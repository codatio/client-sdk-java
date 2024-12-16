/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.bank_feeds;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.bank_feeds.models.components.BankFeedAccountMappingResponse;
import io.codat.bank_feeds.models.components.BankFeedMapping;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.errors.SDKError;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingRequestBuilder;
import io.codat.bank_feeds.models.operations.CreateBankAccountMappingResponse;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingRequest;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingRequestBuilder;
import io.codat.bank_feeds.models.operations.GetBankAccountMappingResponse;
import io.codat.bank_feeds.models.operations.SDKMethodInterfaces.*;
import io.codat.bank_feeds.utils.BackoffStrategy;
import io.codat.bank_feeds.utils.HTTPClient;
import io.codat.bank_feeds.utils.HTTPRequest;
import io.codat.bank_feeds.utils.Hook.AfterErrorContextImpl;
import io.codat.bank_feeds.utils.Hook.AfterSuccessContextImpl;
import io.codat.bank_feeds.utils.Hook.BeforeRequestContextImpl;
import io.codat.bank_feeds.utils.Options;
import io.codat.bank_feeds.utils.Retries.NonRetryableException;
import io.codat.bank_feeds.utils.Retries;
import io.codat.bank_feeds.utils.RetryConfig;
import io.codat.bank_feeds.utils.SerializedBody;
import io.codat.bank_feeds.utils.Utils.JsonShape;
import io.codat.bank_feeds.utils.Utils;
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
 * Extra functionality for building an account management UI.
 */
public class AccountMapping implements
            MethodCallCreateBankAccountMapping,
            MethodCallGetBankAccountMapping {

    private final SDKConfiguration sdkConfiguration;

    AccountMapping(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create bank feed account mapping
     * ﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting software (target account).
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * To find valid target account options, first call the [List bank feed account mappings](https://docs.codat.io//bank-feeds-api#/operations/get-bank-account-mapping) endpoint.
     * 
     * &gt; **For custom builds only**
     * &gt;
     * &gt; Only use this endpoint if you are building your own account management UI.
     * 
     * #### Account mapping variability
     * 
     * The method of mapping the source account to the target account varies depending on the accounting software your company uses.
     * 
     * #### Mapping options:
     * 
     * 1. **API Mapping**: Integrate the mapping journey directly into your application for a seamless user experience.
     * 2. **Codat UI Mapping**: If you prefer a quicker setup, you can utilize Codat's provided user interface for mapping.
     * 3. **Accounting Platform Mapping**: For some accounting software, the mapping process must be conducted within the software itself.
     * 
     * ### Integration-specific behaviour
     * 
     * | Bank Feed Integration | API Mapping | Codat UI Mapping | Accounting Platform Mapping |
     * | --------------------- | ----------- | ---------------- | --------------------------- |
     * | Xero                  | ✅          | ✅               |                             |
     * | FreeAgent             | ✅          | ✅               |                             |
     * | Oracle NetSuite       | ✅          | ✅               |                             |
     * | Exact Online (NL)     | ✅          | ✅               |                             |
     * | QuickBooks Online     |             |                  | ✅                          |
     * | Sage                  |             |                  | ✅                          |
     * @return The call builder
     */
    public CreateBankAccountMappingRequestBuilder create() {
        return new CreateBankAccountMappingRequestBuilder(this);
    }

    /**
     * Create bank feed account mapping
     * ﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting software (target account).
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * To find valid target account options, first call the [List bank feed account mappings](https://docs.codat.io//bank-feeds-api#/operations/get-bank-account-mapping) endpoint.
     * 
     * &gt; **For custom builds only**
     * &gt;
     * &gt; Only use this endpoint if you are building your own account management UI.
     * 
     * #### Account mapping variability
     * 
     * The method of mapping the source account to the target account varies depending on the accounting software your company uses.
     * 
     * #### Mapping options:
     * 
     * 1. **API Mapping**: Integrate the mapping journey directly into your application for a seamless user experience.
     * 2. **Codat UI Mapping**: If you prefer a quicker setup, you can utilize Codat's provided user interface for mapping.
     * 3. **Accounting Platform Mapping**: For some accounting software, the mapping process must be conducted within the software itself.
     * 
     * ### Integration-specific behaviour
     * 
     * | Bank Feed Integration | API Mapping | Codat UI Mapping | Accounting Platform Mapping |
     * | --------------------- | ----------- | ---------------- | --------------------------- |
     * | Xero                  | ✅          | ✅               |                             |
     * | FreeAgent             | ✅          | ✅               |                             |
     * | Oracle NetSuite       | ✅          | ✅               |                             |
     * | Exact Online (NL)     | ✅          | ✅               |                             |
     * | QuickBooks Online     |             |                  | ✅                          |
     * | Sage                  |             |                  | ✅                          |
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateBankAccountMappingResponse create(
            CreateBankAccountMappingRequest request) throws Exception {
        return create(request, Optional.empty());
    }
    
    /**
     * Create bank feed account mapping
     * ﻿The *Create bank account mapping* endpoint creates a new mapping between a source bank account and a potential account in the accounting software (target account).
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * To find valid target account options, first call the [List bank feed account mappings](https://docs.codat.io//bank-feeds-api#/operations/get-bank-account-mapping) endpoint.
     * 
     * &gt; **For custom builds only**
     * &gt;
     * &gt; Only use this endpoint if you are building your own account management UI.
     * 
     * #### Account mapping variability
     * 
     * The method of mapping the source account to the target account varies depending on the accounting software your company uses.
     * 
     * #### Mapping options:
     * 
     * 1. **API Mapping**: Integrate the mapping journey directly into your application for a seamless user experience.
     * 2. **Codat UI Mapping**: If you prefer a quicker setup, you can utilize Codat's provided user interface for mapping.
     * 3. **Accounting Platform Mapping**: For some accounting software, the mapping process must be conducted within the software itself.
     * 
     * ### Integration-specific behaviour
     * 
     * | Bank Feed Integration | API Mapping | Codat UI Mapping | Accounting Platform Mapping |
     * | --------------------- | ----------- | ---------------- | --------------------------- |
     * | Xero                  | ✅          | ✅               |                             |
     * | FreeAgent             | ✅          | ✅               |                             |
     * | Oracle NetSuite       | ✅          | ✅               |                             |
     * | Exact Online (NL)     | ✅          | ✅               |                             |
     * | QuickBooks Online     |             |                  | ✅                          |
     * | Sage                  |             |                  | ✅                          |
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateBankAccountMappingResponse create(
            CreateBankAccountMappingRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateBankAccountMappingRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/bankFeedAccounts/mapping",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateBankAccountMappingRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "bankFeedAccountMapping",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
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
                                "create-bank-account-mapping", 
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
                                "create-bank-account-mapping",
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
                         "create-bank-account-mapping", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateBankAccountMappingResponse.Builder _resBuilder = 
            CreateBankAccountMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateBankAccountMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                BankFeedAccountMappingResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<BankFeedAccountMappingResponse>() {});
                _res.withBankFeedAccountMappingResponse(Optional.ofNullable(_out));
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
     * List bank feed accounts
     * ﻿The *List bank accounts* endpoint returns information about a source bank account and any current or potential target mapping accounts.
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * &gt; **For custom builds only**
     * &gt; 
     * &gt; Only use this endpoint if you are building your own account management UI.
     * @return The call builder
     */
    public GetBankAccountMappingRequestBuilder get() {
        return new GetBankAccountMappingRequestBuilder(this);
    }

    /**
     * List bank feed accounts
     * ﻿The *List bank accounts* endpoint returns information about a source bank account and any current or potential target mapping accounts.
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * &gt; **For custom builds only**
     * &gt; 
     * &gt; Only use this endpoint if you are building your own account management UI.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBankAccountMappingResponse get(
            GetBankAccountMappingRequest request) throws Exception {
        return get(request, Optional.empty());
    }
    
    /**
     * List bank feed accounts
     * ﻿The *List bank accounts* endpoint returns information about a source bank account and any current or potential target mapping accounts.
     * 
     * A bank feed account mapping is a specified link between the source account (provided by the Codat user) and the target account (the end user's account in the underlying software).
     * 
     * &gt; **For custom builds only**
     * &gt; 
     * &gt; Only use this endpoint if you are building your own account management UI.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBankAccountMappingResponse get(
            GetBankAccountMappingRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetBankAccountMappingRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/bankFeedAccounts/mapping",
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
                                "get-bank-account-mapping", 
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
                                "get-bank-account-mapping",
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
                         "get-bank-account-mapping", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetBankAccountMappingResponse.Builder _resBuilder = 
            GetBankAccountMappingResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetBankAccountMappingResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<BankFeedMapping> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<BankFeedMapping>>() {});
                _res.withBankFeedMappings(Optional.ofNullable(_out));
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
