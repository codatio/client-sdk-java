/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending;

import com.fasterxml.jackson.core.type.TypeReference;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.DownloadFilesRequest;
import io.codat.lending.models.operations.DownloadFilesRequestBuilder;
import io.codat.lending.models.operations.DownloadFilesResponse;
import io.codat.lending.models.operations.ListFilesRequest;
import io.codat.lending.models.operations.ListFilesRequestBuilder;
import io.codat.lending.models.operations.ListFilesResponse;
import io.codat.lending.models.operations.SDKMethodInterfaces.*;
import io.codat.lending.models.operations.UploadFilesRequest;
import io.codat.lending.models.operations.UploadFilesRequestBuilder;
import io.codat.lending.models.operations.UploadFilesResponse;
import io.codat.lending.models.shared.File;
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

/**
 * Endpoints to manage uploaded files.
 */
public class FileUpload implements
            MethodCallDownloadFiles,
            MethodCallListFiles,
            MethodCallUploadFiles {

    private final SDKConfiguration sdkConfiguration;

    FileUpload(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Download all files for a company
     * The *Download files* endpoint downloads all files that have  been uploaded by to SMB to Codat. A `date` may be specified to download any files uploaded on the date provided.
     * @return The call builder
     */
    public DownloadFilesRequestBuilder download() {
        return new DownloadFilesRequestBuilder(this);
    }

    /**
     * Download all files for a company
     * The *Download files* endpoint downloads all files that have  been uploaded by to SMB to Codat. A `date` may be specified to download any files uploaded on the date provided.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DownloadFilesResponse download(
            DownloadFilesRequest request) throws Exception {
        return download(request, Optional.empty());
    }
    
    /**
     * Download all files for a company
     * The *Download files* endpoint downloads all files that have  been uploaded by to SMB to Codat. A `date` may be specified to download any files uploaded on the date provided.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DownloadFilesResponse download(
            DownloadFilesRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DownloadFilesRequest.class,
                _baseUrl,
                "/companies/{companyId}/files/download",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/octet-stream")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                DownloadFilesRequest.class,
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
                                "download-files", 
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
                                "download-files",
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
                         "download-files", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DownloadFilesResponse.Builder _resBuilder = 
            DownloadFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
            _resBuilder.data(_httpRes.body());
        }

        DownloadFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
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
     * List all files uploaded by a company
     * ﻿The *List files* endpoint returns a list of all files uploaded to Codat by the SMB. 
     * @return The call builder
     */
    public ListFilesRequestBuilder listUploaded() {
        return new ListFilesRequestBuilder(this);
    }

    /**
     * List all files uploaded by a company
     * ﻿The *List files* endpoint returns a list of all files uploaded to Codat by the SMB. 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse listUploaded(
            ListFilesRequest request) throws Exception {
        return listUploaded(request, Optional.empty());
    }
    
    /**
     * List all files uploaded by a company
     * ﻿The *List files* endpoint returns a list of all files uploaded to Codat by the SMB. 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListFilesResponse listUploaded(
            ListFilesRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListFilesRequest.class,
                _baseUrl,
                "/companies/{companyId}/files",
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
                                "list-files", 
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
                                "list-files",
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
                         "list-files", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListFilesResponse.Builder _resBuilder = 
            ListFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<File> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<File>>() {});
                _res.withFiles(Optional.ofNullable(_out));
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



    /**
     * Upload files for a company
     * The *Upload files* endpoint uploads multiple files provided by the SMB to Codat. This may include personal identity documents, pitch decks, contracts, or files with accounting and banking data.
     * 
     * Uploaded files must meet the following requirements:
     * 
     * - Up to 20 files can be uploaded at a time.
     * - PDF, XLS, XLSX, XLSB, CSV, DOC, DOCX, PPT, PPTX, JPEG, JPG, and PNG files can be uploaded.
     * - Each file can be up to 10MB in size.
     * @return The call builder
     */
    public UploadFilesRequestBuilder upload() {
        return new UploadFilesRequestBuilder(this);
    }

    /**
     * Upload files for a company
     * The *Upload files* endpoint uploads multiple files provided by the SMB to Codat. This may include personal identity documents, pitch decks, contracts, or files with accounting and banking data.
     * 
     * Uploaded files must meet the following requirements:
     * 
     * - Up to 20 files can be uploaded at a time.
     * - PDF, XLS, XLSX, XLSB, CSV, DOC, DOCX, PPT, PPTX, JPEG, JPG, and PNG files can be uploaded.
     * - Each file can be up to 10MB in size.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFilesResponse upload(
            UploadFilesRequest request) throws Exception {
        return upload(request, Optional.empty());
    }
    
    /**
     * Upload files for a company
     * The *Upload files* endpoint uploads multiple files provided by the SMB to Codat. This may include personal identity documents, pitch decks, contracts, or files with accounting and banking data.
     * 
     * Uploaded files must meet the following requirements:
     * 
     * - Up to 20 files can be uploaded at a time.
     * - PDF, XLS, XLSX, XLSB, CSV, DOC, DOCX, PPT, PPTX, JPEG, JPG, and PNG files can be uploaded.
     * - Each file can be up to 10MB in size.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UploadFilesResponse upload(
            UploadFilesRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UploadFilesRequest.class,
                _baseUrl,
                "/companies/{companyId}/connections/{connectionId}/files",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UploadFilesRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "fileUpload",
                "multipart",
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
                                "upload-files", 
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
                                "upload-files",
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
                         "upload-files", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UploadFilesResponse.Builder _resBuilder = 
            UploadFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UploadFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
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
