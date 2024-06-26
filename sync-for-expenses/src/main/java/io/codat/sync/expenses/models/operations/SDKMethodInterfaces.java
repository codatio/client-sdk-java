/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.expenses.models.operations;

import io.codat.sync.expenses.utils.Options;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallCreateCompany {
        io.codat.sync.expenses.models.operations.CreateCompanyResponse create(
            Optional<? extends io.codat.sync.expenses.models.components.CompanyRequestBody> request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteCompany {
        io.codat.sync.expenses.models.operations.DeleteCompanyResponse delete(
            io.codat.sync.expenses.models.operations.DeleteCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompany {
        io.codat.sync.expenses.models.operations.GetCompanyResponse get(
            io.codat.sync.expenses.models.operations.GetCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCompanies {
        io.codat.sync.expenses.models.operations.ListCompaniesResponse list(
            io.codat.sync.expenses.models.operations.ListCompaniesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateCompany {
        io.codat.sync.expenses.models.operations.UpdateCompanyResponse update(
            io.codat.sync.expenses.models.operations.UpdateCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateConnection {
        io.codat.sync.expenses.models.operations.CreateConnectionResponse create(
            io.codat.sync.expenses.models.operations.CreateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreatePartnerExpenseConnection {
        io.codat.sync.expenses.models.operations.CreatePartnerExpenseConnectionResponse createPartnerExpenseConnection(
            io.codat.sync.expenses.models.operations.CreatePartnerExpenseConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteConnection {
        io.codat.sync.expenses.models.operations.DeleteConnectionResponse delete(
            io.codat.sync.expenses.models.operations.DeleteConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConnection {
        io.codat.sync.expenses.models.operations.GetConnectionResponse get(
            io.codat.sync.expenses.models.operations.GetConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListConnections {
        io.codat.sync.expenses.models.operations.ListConnectionsResponse list(
            io.codat.sync.expenses.models.operations.ListConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUnlinkConnection {
        io.codat.sync.expenses.models.operations.UnlinkConnectionResponse unlink(
            io.codat.sync.expenses.models.operations.UnlinkConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateAccount {
        io.codat.sync.expenses.models.operations.CreateAccountResponse create(
            io.codat.sync.expenses.models.operations.CreateAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateChartOfAccountsModel {
        io.codat.sync.expenses.models.operations.GetCreateChartOfAccountsModelResponse getCreateModel(
            io.codat.sync.expenses.models.operations.GetCreateChartOfAccountsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateCustomer {
        io.codat.sync.expenses.models.operations.CreateCustomerResponse create(
            io.codat.sync.expenses.models.operations.CreateCustomerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCustomer {
        io.codat.sync.expenses.models.operations.GetCustomerResponse get(
            io.codat.sync.expenses.models.operations.GetCustomerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCustomers {
        io.codat.sync.expenses.models.operations.ListCustomersResponse list(
            io.codat.sync.expenses.models.operations.ListCustomersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateCustomer {
        io.codat.sync.expenses.models.operations.UpdateCustomerResponse update(
            io.codat.sync.expenses.models.operations.UpdateCustomerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateSupplier {
        io.codat.sync.expenses.models.operations.CreateSupplierResponse create(
            io.codat.sync.expenses.models.operations.CreateSupplierRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSupplier {
        io.codat.sync.expenses.models.operations.GetSupplierResponse get(
            io.codat.sync.expenses.models.operations.GetSupplierRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSuppliers {
        io.codat.sync.expenses.models.operations.ListSuppliersResponse list(
            io.codat.sync.expenses.models.operations.ListSuppliersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateSupplier {
        io.codat.sync.expenses.models.operations.UpdateSupplierResponse update(
            io.codat.sync.expenses.models.operations.UpdateSupplierRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDataStatus {
        io.codat.sync.expenses.models.operations.GetDataStatusResponse get(
            io.codat.sync.expenses.models.operations.GetDataStatusRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetPullOperation {
        io.codat.sync.expenses.models.operations.GetPullOperationResponse getPullOperation(
            io.codat.sync.expenses.models.operations.GetPullOperationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListPullOperations {
        io.codat.sync.expenses.models.operations.ListPullOperationsResponse listPullOperations(
            io.codat.sync.expenses.models.operations.ListPullOperationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRefreshAllDataTypes {
        io.codat.sync.expenses.models.operations.RefreshAllDataTypesResponse refreshAllDataTypes(
            io.codat.sync.expenses.models.operations.RefreshAllDataTypesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRefreshDataType {
        io.codat.sync.expenses.models.operations.RefreshDataTypeResponse refreshDataType(
            io.codat.sync.expenses.models.operations.RefreshDataTypeRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetPushOperation {
        io.codat.sync.expenses.models.operations.GetPushOperationResponse get(
            io.codat.sync.expenses.models.operations.GetPushOperationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListPushOperations {
        io.codat.sync.expenses.models.operations.ListPushOperationsResponse list(
            io.codat.sync.expenses.models.operations.ListPushOperationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompanyConfiguration {
        io.codat.sync.expenses.models.operations.GetCompanyConfigurationResponse get(
            io.codat.sync.expenses.models.operations.GetCompanyConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetMappingOptions {
        io.codat.sync.expenses.models.operations.GetMappingOptionsResponse getMappingOptions(
            io.codat.sync.expenses.models.operations.GetMappingOptionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSetCompanyConfiguration {
        io.codat.sync.expenses.models.operations.SetCompanyConfigurationResponse set(
            io.codat.sync.expenses.models.operations.SetCompanyConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateExpenseTransaction {
        io.codat.sync.expenses.models.operations.CreateExpenseTransactionResponse create(
            io.codat.sync.expenses.models.operations.CreateExpenseTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateExpenseTransaction {
        io.codat.sync.expenses.models.operations.UpdateExpenseTransactionResponse update(
            io.codat.sync.expenses.models.operations.UpdateExpenseTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateReimbursableExpenseTransaction {
        io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse create(
            io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateReimbursableExpenseTransaction {
        io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse update(
            io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSyncById {
        io.codat.sync.expenses.models.operations.GetSyncByIdResponse get(
            io.codat.sync.expenses.models.operations.GetSyncByIdRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetLastSuccessfulSync {
        io.codat.sync.expenses.models.operations.GetLastSuccessfulSyncResponse getLastSuccessfulSync(
            io.codat.sync.expenses.models.operations.GetLastSuccessfulSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetLatestSync {
        io.codat.sync.expenses.models.operations.GetLatestSyncResponse getLatestSync(
            io.codat.sync.expenses.models.operations.GetLatestSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallInitiateSync {
        io.codat.sync.expenses.models.operations.InitiateSyncResponse initiateSync(
            io.codat.sync.expenses.models.operations.InitiateSyncRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSyncs {
        io.codat.sync.expenses.models.operations.ListSyncsResponse list(
            io.codat.sync.expenses.models.operations.ListSyncsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetSyncTransaction {
        io.codat.sync.expenses.models.operations.GetSyncTransactionResponse get(
            io.codat.sync.expenses.models.operations.GetSyncTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListSyncTransactions {
        io.codat.sync.expenses.models.operations.ListSyncTransactionsResponse list(
            io.codat.sync.expenses.models.operations.ListSyncTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUploadExpenseAttachment {
        io.codat.sync.expenses.models.operations.UploadExpenseAttachmentResponse upload(
            io.codat.sync.expenses.models.operations.UploadExpenseAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateTransferTransaction {
        io.codat.sync.expenses.models.operations.CreateTransferTransactionResponse create(
            io.codat.sync.expenses.models.operations.CreateTransferTransactionRequest request,
            Optional<Options> options) throws Exception;
    }

}
