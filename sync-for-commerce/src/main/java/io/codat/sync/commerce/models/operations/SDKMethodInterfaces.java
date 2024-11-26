/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.commerce.models.operations;

import io.codat.sync.commerce.models.components.CreateCompany;
import io.codat.sync.commerce.utils.Options;
import java.lang.Exception;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallGetConfigTextSyncFlow {
        GetConfigTextSyncFlowResponse getConfigTextSyncFlow(
            GetConfigTextSyncFlowRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetVisibleAccounts {
        GetVisibleAccountsResponse getVisibleAccounts(
            GetVisibleAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateConfigTextSyncFlow {
        UpdateConfigTextSyncFlowResponse updateConfigTextSyncFlow(
            UpdateConfigTextSyncFlowRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateVisibleAccountsSyncFlow {
        UpdateVisibleAccountsSyncFlowResponse updateVisibleAccountsSyncFlow(
            UpdateVisibleAccountsSyncFlowRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateCompany {
        CreateCompanyResponse createCompany(
            Optional<? extends CreateCompany> request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConfiguration {
        GetConfigurationResponse getConfiguration(
            GetConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCompanies {
        ListCompaniesResponse listCompanies(
            ListCompaniesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSetConfiguration {
        SetConfigurationResponse setConfiguration(
            SetConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateConnection {
        CreateConnectionResponse create(
            CreateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSyncFlowUrl {
        GetSyncFlowUrlResponse getSyncFlowUrl(
            GetSyncFlowUrlRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListConnections {
        ListConnectionsResponse list(
            ListConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateConnectionAuthorization {
        UpdateConnectionAuthorizationResponse updateAuthorization(
            UpdateConnectionAuthorizationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateConnection {
        UpdateConnectionResponse updateConnection(
            UpdateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSyncById {
        GetSyncByIdResponse get(
            GetSyncByIdRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetLastSuccessfulSync {
        GetLastSuccessfulSyncResponse getLastSuccessfulSync(
            GetLastSuccessfulSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetLatestSync {
        GetLatestSyncResponse getLatestSync(
            GetLatestSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSyncStatus {
        GetSyncStatusResponse getStatus(
            GetSyncStatusRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSyncs {
        ListSyncsResponse list(
            ListSyncsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRequestSync {
        RequestSyncResponse request(
            RequestSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRequestSyncForDateRange {
        RequestSyncForDateRangeResponse requestForDateRange(
            RequestSyncForDateRangeRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetIntegrationBranding {
        GetIntegrationBrandingResponse getBranding(
            GetIntegrationBrandingRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListIntegrations {
        ListIntegrationsResponse list(
            ListIntegrationsRequest request,
            Optional<Options> options) throws Exception;
    }


}
