/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.operations;

import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.utils.Options;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallCreateCompany {
        io.codat.lending.models.operations.CreateCompanyResponse create(
            Optional<? extends CompanyRequestBody> request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteCompany {
        io.codat.lending.models.operations.DeleteCompanyResponse delete(
            DeleteCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCompany {
        io.codat.lending.models.operations.GetCompanyResponse get(
            GetCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCompanies {
        io.codat.lending.models.operations.ListCompaniesResponse list(
            ListCompaniesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUpdateCompany {
        io.codat.lending.models.operations.UpdateCompanyResponse update(
            UpdateCompanyRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateConnection {
        io.codat.lending.models.operations.CreateConnectionResponse create(
            CreateConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDeleteConnection {
        io.codat.lending.models.operations.DeleteConnectionResponse delete(
            DeleteConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetConnection {
        io.codat.lending.models.operations.GetConnectionResponse get(
            GetConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListConnections {
        io.codat.lending.models.operations.ListConnectionsResponse list(
            ListConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUnlinkConnection {
        io.codat.lending.models.operations.UnlinkConnectionResponse unlink(
            UnlinkConnectionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallEndBankStatementUploadSession {
        io.codat.lending.models.operations.EndBankStatementUploadSessionResponse endUploadSession(
            EndBankStatementUploadSessionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBankStatementUploadConfiguration {
        io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse getUploadConfiguration(
            GetBankStatementUploadConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSetBankStatementUploadConfiguration {
        io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse setUploadConfiguration(
            SetBankStatementUploadConfigurationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallStartBankStatementUploadSession {
        io.codat.lending.models.operations.StartBankStatementUploadSessionResponse startUploadSession(
            StartBankStatementUploadSessionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUploadBankStatementData {
        io.codat.lending.models.operations.UploadBankStatementDataResponse uploadBankStatementData(
            UploadBankStatementDataRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingAccountTransaction {
        io.codat.lending.models.operations.GetAccountingAccountTransactionResponse get(
            GetAccountingAccountTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingAccountTransactions {
        io.codat.lending.models.operations.ListAccountingAccountTransactionsResponse list(
            ListAccountingAccountTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingDirectCostAttachment {
        io.codat.lending.models.operations.DownloadAccountingDirectCostAttachmentResponse downloadAttachment(
            DownloadAccountingDirectCostAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingDirectCost {
        io.codat.lending.models.operations.GetAccountingDirectCostResponse get(
            GetAccountingDirectCostRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingDirectCostAttachment {
        io.codat.lending.models.operations.GetAccountingDirectCostAttachmentResponse getAttachment(
            GetAccountingDirectCostAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingDirectCosts {
        io.codat.lending.models.operations.ListAccountingDirectCostsResponse list(
            ListAccountingDirectCostsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingDirectCostAttachments {
        io.codat.lending.models.operations.ListAccountingDirectCostAttachmentsResponse listAttachments(
            ListAccountingDirectCostAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingTransfer {
        io.codat.lending.models.operations.GetAccountingTransferResponse get(
            GetAccountingTransferRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingTransfers {
        io.codat.lending.models.operations.ListAccountingTransfersResponse list(
            ListAccountingTransfersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingJournalEntry {
        io.codat.lending.models.operations.GetAccountingJournalEntryResponse get(
            GetAccountingJournalEntryRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingJournalEntries {
        io.codat.lending.models.operations.ListAccountingJournalEntriesResponse list(
            ListAccountingJournalEntriesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingJournal {
        io.codat.lending.models.operations.GetAccountingJournalResponse get(
            GetAccountingJournalRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingJournals {
        io.codat.lending.models.operations.ListAccountingJournalsResponse list(
            ListAccountingJournalsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBankAccountTransactions {
        io.codat.lending.models.operations.ListAccountingBankAccountTransactionsResponse listTransactions(
            ListAccountingBankAccountTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBankAccount {
        io.codat.lending.models.operations.GetAccountingBankAccountResponse get(
            GetAccountingBankAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBankAccounts {
        io.codat.lending.models.operations.ListAccountingBankAccountsResponse list(
            ListAccountingBankAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBankingAccountBalances {
        io.codat.lending.models.operations.ListBankingAccountBalancesResponse list(
            ListBankingAccountBalancesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBankingAccount {
        io.codat.lending.models.operations.GetBankingAccountResponse get(
            GetBankingAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBankingAccounts {
        io.codat.lending.models.operations.ListBankingAccountsResponse list(
            ListBankingAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBankingTransactionCategory {
        io.codat.lending.models.operations.GetBankingTransactionCategoryResponse get(
            GetBankingTransactionCategoryRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBankingTransactionCategories {
        io.codat.lending.models.operations.ListBankingTransactionCategoriesResponse list(
            ListBankingTransactionCategoriesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetBankingTransaction {
        io.codat.lending.models.operations.GetBankingTransactionResponse get(
            GetBankingTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListBankingTransactions {
        io.codat.lending.models.operations.ListBankingTransactionsResponse list(
            ListBankingTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCategorizedBankStatement {
        io.codat.lending.models.operations.GetCategorizedBankStatementResponse get(
            GetCategorizedBankStatementRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingBillAttachment {
        io.codat.lending.models.operations.DownloadAccountingBillAttachmentResponse downloadAttachment(
            DownloadAccountingBillAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBill {
        io.codat.lending.models.operations.GetAccountingBillResponse get(
            GetAccountingBillRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBillAttachment {
        io.codat.lending.models.operations.GetAccountingBillAttachmentResponse getAttachment(
            GetAccountingBillAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBills {
        io.codat.lending.models.operations.ListAccountingBillsResponse list(
            ListAccountingBillsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBillAttachments {
        io.codat.lending.models.operations.ListAccountingBillAttachmentsResponse listAttachments(
            ListAccountingBillAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingSupplierAttachment {
        io.codat.lending.models.operations.DownloadAccountingSupplierAttachmentResponse downloadAttachment(
            DownloadAccountingSupplierAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingSupplier {
        io.codat.lending.models.operations.GetAccountingSupplierResponse get(
            GetAccountingSupplierRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingSupplierAttachment {
        io.codat.lending.models.operations.GetAccountingSupplierAttachmentResponse getAttachment(
            GetAccountingSupplierAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingSuppliers {
        io.codat.lending.models.operations.ListAccountingSuppliersResponse list(
            ListAccountingSuppliersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingSupplierAttachments {
        io.codat.lending.models.operations.ListAccountingSupplierAttachmentsResponse listAttachments(
            ListAccountingSupplierAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBillCreditNote {
        io.codat.lending.models.operations.GetAccountingBillCreditNoteResponse get(
            GetAccountingBillCreditNoteRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBillCreditNotes {
        io.codat.lending.models.operations.ListAccountingBillCreditNotesResponse list(
            ListAccountingBillCreditNotesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBillPayment {
        io.codat.lending.models.operations.GetAccountingBillPaymentResponse get(
            GetAccountingBillPaymentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingBillPayments {
        io.codat.lending.models.operations.ListAccountingBillPaymentsResponse list(
            ListAccountingBillPaymentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceCustomer {
        io.codat.lending.models.operations.GetCommerceCustomerResponse get(
            GetCommerceCustomerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceCustomers {
        io.codat.lending.models.operations.ListCommerceCustomersResponse list(
            ListCommerceCustomersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceDispute {
        io.codat.lending.models.operations.GetCommerceDisputeResponse get(
            GetCommerceDisputeRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceDisputes {
        io.codat.lending.models.operations.ListCommerceDisputesResponse list(
            ListCommerceDisputesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceLocation {
        io.codat.lending.models.operations.GetCommerceLocationResponse get(
            GetCommerceLocationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceLocations {
        io.codat.lending.models.operations.ListCommerceLocationsResponse list(
            ListCommerceLocationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceOrder {
        io.codat.lending.models.operations.GetCommerceOrderResponse get(
            GetCommerceOrderRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceOrders {
        io.codat.lending.models.operations.ListCommerceOrdersResponse list(
            ListCommerceOrdersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommercePaymentMethod {
        io.codat.lending.models.operations.GetCommercePaymentMethodResponse get(
            GetCommercePaymentMethodRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommercePaymentMethods {
        io.codat.lending.models.operations.ListCommercePaymentMethodsResponse list(
            ListCommercePaymentMethodsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommercePayment {
        io.codat.lending.models.operations.GetCommercePaymentResponse get(
            GetCommercePaymentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommercePayments {
        io.codat.lending.models.operations.ListCommercePaymentsResponse list(
            ListCommercePaymentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceProductCategory {
        io.codat.lending.models.operations.GetCommerceProductCategoryResponse get(
            GetCommerceProductCategoryRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceProductCategories {
        io.codat.lending.models.operations.ListCommerceProductCategoriesResponse list(
            ListCommerceProductCategoriesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceProduct {
        io.codat.lending.models.operations.GetCommerceProductResponse get(
            GetCommerceProductRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceProducts {
        io.codat.lending.models.operations.ListCommerceProductsResponse list(
            ListCommerceProductsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceTransaction {
        io.codat.lending.models.operations.GetCommerceTransactionResponse get(
            GetCommerceTransactionRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCommerceTransactions {
        io.codat.lending.models.operations.ListCommerceTransactionsResponse list(
            ListCommerceTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceCustomerRetentionMetrics {
        io.codat.lending.models.operations.GetCommerceCustomerRetentionMetricsResponse getCustomerRetention(
            GetCommerceCustomerRetentionMetricsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceLifetimeValueMetrics {
        io.codat.lending.models.operations.GetCommerceLifetimeValueMetricsResponse getLifetimeValue(
            GetCommerceLifetimeValueMetricsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceRevenueMetrics {
        io.codat.lending.models.operations.GetCommerceRevenueMetricsResponse getRevenue(
            GetCommerceRevenueMetricsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceOrdersReport {
        io.codat.lending.models.operations.GetCommerceOrdersReportResponse getOrders(
            GetCommerceOrdersReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceRefundsReport {
        io.codat.lending.models.operations.GetCommerceRefundsReportResponse getRefunds(
            GetCommerceRefundsReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingProfile {
        io.codat.lending.models.operations.GetAccountingProfileResponse getAccountingProfile(
            GetAccountingProfileRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCommerceProfile {
        io.codat.lending.models.operations.GetCommerceProfileResponse getCommerceProfile(
            GetCommerceProfileRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingCustomerAttachment {
        io.codat.lending.models.operations.DownloadAccountingCustomerAttachmentResponse downloadAttachment(
            DownloadAccountingCustomerAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingCustomer {
        io.codat.lending.models.operations.GetAccountingCustomerResponse get(
            GetAccountingCustomerRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingCustomerAttachment {
        io.codat.lending.models.operations.GetAccountingCustomerAttachmentResponse getAttachment(
            GetAccountingCustomerAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingCustomers {
        io.codat.lending.models.operations.ListAccountingCustomersResponse list(
            ListAccountingCustomersRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingCustomerAttachments {
        io.codat.lending.models.operations.ListAccountingCustomerAttachmentsResponse listAttachments(
            ListAccountingCustomerAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingDirectIncomeAttachment {
        io.codat.lending.models.operations.DownloadAccountingDirectIncomeAttachmentResponse downloadAttachment(
            DownloadAccountingDirectIncomeAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingDirectIncome {
        io.codat.lending.models.operations.GetAccountingDirectIncomeResponse get(
            GetAccountingDirectIncomeRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingDirectIncomeAttachment {
        io.codat.lending.models.operations.GetAccountingDirectIncomeAttachmentResponse getAttachment(
            GetAccountingDirectIncomeAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingDirectIncomes {
        io.codat.lending.models.operations.ListAccountingDirectIncomesResponse list(
            ListAccountingDirectIncomesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingDirectIncomeAttachments {
        io.codat.lending.models.operations.ListAccountingDirectIncomeAttachmentsResponse listAttachments(
            ListAccountingDirectIncomeAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingInvoiceAttachment {
        io.codat.lending.models.operations.DownloadAccountingInvoiceAttachmentResponse downloadAttachment(
            DownloadAccountingInvoiceAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadAccountingInvoicePdf {
        io.codat.lending.models.operations.DownloadAccountingInvoicePdfResponse downloadPdf(
            DownloadAccountingInvoicePdfRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingInvoice {
        io.codat.lending.models.operations.GetAccountingInvoiceResponse get(
            GetAccountingInvoiceRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingInvoiceAttachment {
        io.codat.lending.models.operations.GetAccountingInvoiceAttachmentResponse getAttachment(
            GetAccountingInvoiceAttachmentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingInvoices {
        io.codat.lending.models.operations.ListAccountingInvoicesResponse list(
            ListAccountingInvoicesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingInvoiceAttachments {
        io.codat.lending.models.operations.ListAccountingInvoiceAttachmentsResponse listAttachments(
            ListAccountingInvoiceAttachmentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListReconciledInvoices {
        io.codat.lending.models.operations.ListReconciledInvoicesResponse listReconciled(
            ListReconciledInvoicesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingCreditNote {
        io.codat.lending.models.operations.GetAccountingCreditNoteResponse get(
            GetAccountingCreditNoteRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingCreditNotes {
        io.codat.lending.models.operations.ListAccountingCreditNotesResponse list(
            ListAccountingCreditNotesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingPayment {
        io.codat.lending.models.operations.GetAccountingPaymentResponse get(
            GetAccountingPaymentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingPayments {
        io.codat.lending.models.operations.ListAccountingPaymentsResponse list(
            ListAccountingPaymentsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingAgedCreditorsReport {
        io.codat.lending.models.operations.GetAccountingAgedCreditorsReportResponse getAgedCreditors(
            GetAccountingAgedCreditorsReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingAgedDebtorsReport {
        io.codat.lending.models.operations.GetAccountingAgedDebtorsReportResponse getAgedDebtors(
            GetAccountingAgedDebtorsReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallIsAgedCreditorsReportAvailable {
        io.codat.lending.models.operations.IsAgedCreditorsReportAvailableResponse isAgedCreditorsAvailable(
            IsAgedCreditorsReportAvailableRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallIsAgedDebtorsReportAvailable {
        io.codat.lending.models.operations.IsAgedDebtorsReportAvailableResponse isAgedDebtorsAvailable(
            IsAgedDebtorsReportAvailableRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadFiles {
        io.codat.lending.models.operations.DownloadFilesResponse download(
            DownloadFilesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListFiles {
        io.codat.lending.models.operations.ListFilesResponse listUploaded(
            ListFilesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallUploadFiles {
        io.codat.lending.models.operations.UploadFilesResponse upload(
            UploadFilesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankAccount {
        io.codat.lending.models.operations.CreateBankAccountResponse create(
            CreateBankAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateUpdateBankAccountsModel {
        io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelResponse getCreateUpdateModel(
            GetCreateUpdateBankAccountsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateBankTransactions {
        io.codat.lending.models.operations.CreateBankTransactionsResponse create(
            CreateBankTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateBankTransactionsModel {
        io.codat.lending.models.operations.GetCreateBankTransactionsModelResponse getCreateModel(
            GetCreateBankTransactionsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateAccount {
        io.codat.lending.models.operations.CreateAccountResponse create(
            CreateAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateChartOfAccountsModel {
        io.codat.lending.models.operations.GetCreateChartOfAccountsModelResponse getCreateModel(
            GetCreateChartOfAccountsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateDirectCost {
        io.codat.lending.models.operations.CreateDirectCostResponse create(
            CreateDirectCostRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateDirectCostsModel {
        io.codat.lending.models.operations.GetCreateDirectCostsModelResponse getCreateModel(
            GetCreateDirectCostsModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreatePayment {
        io.codat.lending.models.operations.CreatePaymentResponse create(
            CreatePaymentRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreatePaymentModel {
        io.codat.lending.models.operations.GetCreatePaymentModelResponse getCreateModel(
            GetCreatePaymentModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateSupplier {
        io.codat.lending.models.operations.CreateSupplierResponse create(
            CreateSupplierRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateUpdateSuppliersModel {
        io.codat.lending.models.operations.GetCreateUpdateSuppliersModelResponse getCreateUpdateModel(
            GetCreateUpdateSuppliersModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallCreateTransfer {
        io.codat.lending.models.operations.CreateTransferResponse create(
            CreateTransferRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateTransfersModel {
        io.codat.lending.models.operations.GetCreateTransfersModelResponse getCreateModel(
            GetCreateTransfersModelRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCreateOperation {
        io.codat.lending.models.operations.GetCreateOperationResponse get(
            GetCreateOperationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListCreateOperations {
        io.codat.lending.models.operations.ListCreateOperationsResponse list(
            ListCreateOperationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingAccount {
        io.codat.lending.models.operations.GetAccountingAccountResponse get(
            GetAccountingAccountRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListAccountingAccounts {
        io.codat.lending.models.operations.ListAccountingAccountsResponse list(
            ListAccountingAccountsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingBalanceSheet {
        io.codat.lending.models.operations.GetAccountingBalanceSheetResponse get(
            GetAccountingBalanceSheetRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCategorizedBalanceSheetStatement {
        io.codat.lending.models.operations.GetCategorizedBalanceSheetStatementResponse getCategorizedAccounts(
            GetCategorizedBalanceSheetStatementRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingCashFlowStatement {
        io.codat.lending.models.operations.GetAccountingCashFlowStatementResponse get(
            GetAccountingCashFlowStatementRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccountingProfitAndLoss {
        io.codat.lending.models.operations.GetAccountingProfitAndLossResponse get(
            GetAccountingProfitAndLossRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetCategorizedProfitAndLossStatement {
        io.codat.lending.models.operations.GetCategorizedProfitAndLossStatementResponse getCategorizedAccounts(
            GetCategorizedProfitAndLossStatementRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDataStatus {
        io.codat.lending.models.operations.GetDataStatusResponse getStatus(
            GetDataStatusRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRefreshAllDataTypes {
        io.codat.lending.models.operations.RefreshAllDataTypesResponse allDataTypes(
            RefreshAllDataTypesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallRefreshDataType {
        io.codat.lending.models.operations.RefreshDataTypeResponse dataType(
            RefreshDataTypeRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetPullOperation {
        io.codat.lending.models.operations.GetPullOperationResponse get(
            GetPullOperationRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListPullOperations {
        io.codat.lending.models.operations.ListPullOperationsResponse list(
            ListPullOperationsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerateLoanSummary {
        io.codat.lending.models.operations.GenerateLoanSummaryResponse generateLoanSummary(
            GenerateLoanSummaryRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerateLoanTransactions {
        io.codat.lending.models.operations.GenerateLoanTransactionsResponse generateLoanTransactions(
            GenerateLoanTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetLoanSummary {
        io.codat.lending.models.operations.GetLoanSummaryResponse getLoanSummary(
            GetLoanSummaryRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListLoanTransactions {
        io.codat.lending.models.operations.ListLoanTransactionsResponse listLoanTransactions(
            ListLoanTransactionsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallListDataIntegrityDetails {
        io.codat.lending.models.operations.ListDataIntegrityDetailsResponse details(
            ListDataIntegrityDetailsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDataIntegrityStatus {
        io.codat.lending.models.operations.GetDataIntegrityStatusResponse status(
            GetDataIntegrityStatusRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetDataIntegritySummaries {
        io.codat.lending.models.operations.GetDataIntegritySummariesResponse summaries(
            GetDataIntegritySummariesRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallDownloadExcelReport {
        io.codat.lending.models.operations.DownloadExcelReportResponse download(
            DownloadExcelReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGenerateExcelReport {
        io.codat.lending.models.operations.GenerateExcelReportResponse generate(
            GenerateExcelReportRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetExcelReportGenerationStatus {
        io.codat.lending.models.operations.GetExcelReportGenerationStatusResponse getStatus(
            GetExcelReportGenerationStatusRequest request,
            Optional<Options> options) throws Exception;
    }


}
