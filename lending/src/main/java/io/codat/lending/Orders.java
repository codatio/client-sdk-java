/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetCommerceOrderRequest;
import io.codat.lending.models.operations.GetCommerceOrderRequestBuilder;
import io.codat.lending.models.operations.GetCommerceOrderResponse;
import io.codat.lending.models.operations.ListCommerceOrdersRequest;
import io.codat.lending.models.operations.ListCommerceOrdersRequestBuilder;
import io.codat.lending.models.operations.ListCommerceOrdersResponse;
import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.models.shared.CommerceOrder;
import io.codat.lending.models.shared.CommerceOrders;
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
import io.codat.lending.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable; 

public class Orders implements
            MethodCallGetCommerceOrder,
            MethodCallListCommerceOrders {

    private final SDKConfiguration sdkConfiguration;

    Orders(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get order
     * The *Get order* endpoint returns a single order for a given orderId.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     * 
     * @return The call builder
     */
    public GetCommerceOrderRequestBuilder get() {
        return new GetCommerceOrderRequestBuilder(this);
    }

    /**
     * Get order
     * The *Get order* endpoint returns a single order for a given orderId.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceOrderResponse get(
            GetCommerceOrderRequest request) throws Exception {
        return get(request, Optional.empty());
    }
    
    /**
     * Get order
     * The *Get order* endpoint returns a single order for a given orderId.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceOrderResponse get(
            GetCommerceOrderRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCommerceOrderRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/data/commerce-orders/{orderId}",
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
                                "get-commerce-order", 
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
                                "get-commerce-order",
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
                         "get-commerce-order", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCommerceOrderResponse.Builder _resBuilder = 
            GetCommerceOrderResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCommerceOrderResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CommerceOrder _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CommerceOrder>() {});
                _res.withCommerceOrder(JsonNullable.of(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "402", "403", "404", "409", "429", "500", "503")) {
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
     * List orders
     * The *List orders* endpoint returns a list of [orders](https://docs.codat.io/lending-api#/schemas/Order) for a given company's connection.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     *     
     * @return The call builder
     */
    public ListCommerceOrdersRequestBuilder list() {
        return new ListCommerceOrdersRequestBuilder(this);
    }

    /**
     * List orders
     * The *List orders* endpoint returns a list of [orders](https://docs.codat.io/lending-api#/schemas/Order) for a given company's connection.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCommerceOrdersResponse list(
            ListCommerceOrdersRequest request) throws Exception {
        return list(request, Optional.empty());
    }
    
    /**
     * List orders
     * The *List orders* endpoint returns a list of [orders](https://docs.codat.io/lending-api#/schemas/Order) for a given company's connection.
     * 
     * [Orders](https://docs.codat.io/lending-api#/schemas/Order) contain the transaction details for all products sold by the company.
     * 
     * Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
     *     
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCommerceOrdersResponse list(
            ListCommerceOrdersRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListCommerceOrdersRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/data/commerce-orders",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListCommerceOrdersRequest.class,
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
                                "list-commerce-orders", 
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
                                "list-commerce-orders",
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
                         "list-commerce-orders", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListCommerceOrdersResponse.Builder _resBuilder = 
            ListCommerceOrdersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListCommerceOrdersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CommerceOrders _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CommerceOrders>() {});
                _res.withCommerceOrders(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "403", "404", "409", "429", "500", "503")) {
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
