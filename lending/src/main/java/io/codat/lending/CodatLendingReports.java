/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetCommerceOrdersReportRequest;
import io.codat.lending.models.operations.GetCommerceOrdersReportRequestBuilder;
import io.codat.lending.models.operations.GetCommerceOrdersReportResponse;
import io.codat.lending.models.operations.GetCommerceRefundsReportRequest;
import io.codat.lending.models.operations.GetCommerceRefundsReportRequestBuilder;
import io.codat.lending.models.operations.GetCommerceRefundsReportResponse;
import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.models.shared.CommerceReport;
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

public class CodatLendingReports implements
            MethodCallGetCommerceOrdersReport,
            MethodCallGetCommerceRefundsReport {

    private final SDKConfiguration sdkConfiguration;

    CodatLendingReports(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get orders report
     * The *Get orders report* endpoint returns the number of orders, total value, and average order value for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the order metrics.
     * 
     * #### Response structure
     * 
     * The Orders report's dimensions and measures are:
     * 
     * | Index         | Dimensions     |
     * |---------------|----------------|
     * |   `index` = 0 | Period         |
     * |   `index` = 1 | Order metrics  |
     * 
     * | Index         | Measures   |
     * |---------------|------------|
     * | `index` = 0   | Count      |
     * | `index` = 1   | Value      |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @return The call builder
     */
    public GetCommerceOrdersReportRequestBuilder getOrders() {
        return new GetCommerceOrdersReportRequestBuilder(this);
    }

    /**
     * Get orders report
     * The *Get orders report* endpoint returns the number of orders, total value, and average order value for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the order metrics.
     * 
     * #### Response structure
     * 
     * The Orders report's dimensions and measures are:
     * 
     * | Index         | Dimensions     |
     * |---------------|----------------|
     * |   `index` = 0 | Period         |
     * |   `index` = 1 | Order metrics  |
     * 
     * | Index         | Measures   |
     * |---------------|------------|
     * | `index` = 0   | Count      |
     * | `index` = 1   | Value      |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceOrdersReportResponse getOrders(
            GetCommerceOrdersReportRequest request) throws Exception {
        return getOrders(request, Optional.empty());
    }
    
    /**
     * Get orders report
     * The *Get orders report* endpoint returns the number of orders, total value, and average order value for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the order metrics.
     * 
     * #### Response structure
     * 
     * The Orders report's dimensions and measures are:
     * 
     * | Index         | Dimensions     |
     * |---------------|----------------|
     * |   `index` = 0 | Period         |
     * |   `index` = 1 | Order metrics  |
     * 
     * | Index         | Measures   |
     * |---------------|------------|
     * | `index` = 0   | Count      |
     * | `index` = 1   | Value      |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceOrdersReportResponse getOrders(
            GetCommerceOrdersReportRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCommerceOrdersReportRequest.class,
                _baseUrl,
                "/data/companies/{companyId}/connections/{connectionId}/assess/commerceMetrics/orders",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetCommerceOrdersReportRequest.class,
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
                                "get-commerce-orders-report", 
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
                                "get-commerce-orders-report",
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
                         "get-commerce-orders-report", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCommerceOrdersReportResponse.Builder _resBuilder = 
            GetCommerceOrdersReportResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCommerceOrdersReportResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CommerceReport _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CommerceReport>() {});
                _res.withCommerceReport(Optional.ofNullable(_out));
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
     * Get refunds report
     * The *Get refunds report* endpoint returns the number and total value of refunds and the refund rate for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the refunds metrics.
     * 
     * #### Response structure
     * 
     * The Refunds report's dimensions and measures are:
     * 
     * | Index          | Dimensions     |
     * |----------------|----------------|
     * | `index` = 0    | Period         |
     * | `index` = 1    | Refund metrics |
     * 
     * | Index          | Measures    |
     * |----------------|------------|
     * | `index` = 0    | Count      |
     * | `index` = 1    | Value      |
     * | `index` = 2    | Percentage |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @return The call builder
     */
    public GetCommerceRefundsReportRequestBuilder getRefunds() {
        return new GetCommerceRefundsReportRequestBuilder(this);
    }

    /**
     * Get refunds report
     * The *Get refunds report* endpoint returns the number and total value of refunds and the refund rate for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the refunds metrics.
     * 
     * #### Response structure
     * 
     * The Refunds report's dimensions and measures are:
     * 
     * | Index          | Dimensions     |
     * |----------------|----------------|
     * | `index` = 0    | Period         |
     * | `index` = 1    | Refund metrics |
     * 
     * | Index          | Measures    |
     * |----------------|------------|
     * | `index` = 0    | Count      |
     * | `index` = 1    | Value      |
     * | `index` = 2    | Percentage |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceRefundsReportResponse getRefunds(
            GetCommerceRefundsReportRequest request) throws Exception {
        return getRefunds(request, Optional.empty());
    }
    
    /**
     * Get refunds report
     * The *Get refunds report* endpoint returns the number and total value of refunds and the refund rate for a specific company's commerce connection over one or more periods of time.
     * 
     * This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 
     * 
     * [Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the refunds metrics.
     * 
     * #### Response structure
     * 
     * The Refunds report's dimensions and measures are:
     * 
     * | Index          | Dimensions     |
     * |----------------|----------------|
     * | `index` = 0    | Period         |
     * | `index` = 1    | Refund metrics |
     * 
     * | Index          | Measures    |
     * |----------------|------------|
     * | `index` = 0    | Count      |
     * | `index` = 1    | Value      |
     * | `index` = 2    | Percentage |
     * 
     * The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCommerceRefundsReportResponse getRefunds(
            GetCommerceRefundsReportRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCommerceRefundsReportRequest.class,
                _baseUrl,
                "/data/companies/{companyId}/connections/{connectionId}/assess/commerceMetrics/refunds",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetCommerceRefundsReportRequest.class,
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
                                "get-commerce-refunds-report", 
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
                                "get-commerce-refunds-report",
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
                         "get-commerce-refunds-report", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCommerceRefundsReportResponse.Builder _resBuilder = 
            GetCommerceRefundsReportResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCommerceRefundsReportResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CommerceReport _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CommerceReport>() {});
                _res.withCommerceReport(Optional.ofNullable(_out));
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
