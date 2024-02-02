# Lending

<!-- Start Codat Library Description -->
Lending helps you make smarter credit decisions on small businesses by enabling you to pull your customers' latest data from the operating systems they are already using. You can use that data for automating decisioning and surfacing new insights on the customer, all via one API.
<!-- End Codat Library Description -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'io.codat.lending:openapi:0.1.0'
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [companies()](docs/sdks/companies/README.md)

* [createCompany](docs/sdks/companies/README.md#createcompany) - Create company
* [deleteCompany](docs/sdks/companies/README.md#deletecompany) - Delete a company
* [getCompany](docs/sdks/companies/README.md#getcompany) - Get company
* [listCompanies](docs/sdks/companies/README.md#listcompanies) - List companies
* [updateCompany](docs/sdks/companies/README.md#updatecompany) - Update company

### [connections()](docs/sdks/connections/README.md)

* [createConnection](docs/sdks/connections/README.md#createconnection) - Create connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get connection
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [unlinkConnection](docs/sdks/connections/README.md#unlinkconnection) - Unlink connection


### [transactions().accountTransactions()](docs/sdks/accounttransactions/README.md)

* [getAccountingAccountTransaction](docs/sdks/accounttransactions/README.md#getaccountingaccounttransaction) - Get account transaction
* [listAccountingAccountTransactions](docs/sdks/accounttransactions/README.md#listaccountingaccounttransactions) - List account transactions

### [transactions().directCosts()](docs/sdks/codatlendingdirectcosts/README.md)

* [downloadAccountingDirectCostAttachment](docs/sdks/codatlendingdirectcosts/README.md#downloadaccountingdirectcostattachment) - Download direct cost attachment
* [getAccountingDirectCost](docs/sdks/codatlendingdirectcosts/README.md#getaccountingdirectcost) - Get direct cost
* [getAccountingDirectCostAttachment](docs/sdks/codatlendingdirectcosts/README.md#getaccountingdirectcostattachment) - Get direct cost attachment
* [listAccountingDirectCosts](docs/sdks/codatlendingdirectcosts/README.md#listaccountingdirectcosts) - List direct costs
* [listAccountingDirectCostAttachments](docs/sdks/codatlendingdirectcosts/README.md#listaccountingdirectcostattachments) - List direct cost attachments

### [transactions().transfers()](docs/sdks/codatlendingtransfers/README.md)

* [getAccountingTransfer](docs/sdks/codatlendingtransfers/README.md#getaccountingtransfer) - Get transfer
* [listAccountingTransfers](docs/sdks/codatlendingtransfers/README.md#listaccountingtransfers) - List transfers

### [transactions().journalEntries()](docs/sdks/journalentries/README.md)

* [getAccountingJournalEntry](docs/sdks/journalentries/README.md#getaccountingjournalentry) - Get journal entry
* [listAccountingJournalEntries](docs/sdks/journalentries/README.md#listaccountingjournalentries) - List journal entries

### [transactions().journals()](docs/sdks/journals/README.md)

* [getAccountingJournal](docs/sdks/journals/README.md#getaccountingjournal) - Get journal
* [listAccountingJournals](docs/sdks/journals/README.md#listaccountingjournals) - List journals

### [accountingBankData()](docs/sdks/codatlendingaccountingbankdata/README.md)

* [listAccountingBankAccountTransactions](docs/sdks/codatlendingaccountingbankdata/README.md#listaccountingbankaccounttransactions) - List bank account transactions

### [accountingBankData().accounts()](docs/sdks/accounts/README.md)

* [getAccountingBankAccount](docs/sdks/accounts/README.md#getaccountingbankaccount) - Get bank account
* [listAccountingBankAccounts](docs/sdks/accounts/README.md#listaccountingbankaccounts) - List bank accounts


### [banking().accountBalances()](docs/sdks/accountbalances/README.md)

* [listBankingAccountBalances](docs/sdks/accountbalances/README.md#listbankingaccountbalances) - List account balances

### [banking().accounts()](docs/sdks/codatlendingaccounts/README.md)

* [getBankingAccount](docs/sdks/codatlendingaccounts/README.md#getbankingaccount) - Get account
* [listBankingAccounts](docs/sdks/codatlendingaccounts/README.md#listbankingaccounts) - List accounts

### [banking().transactionCategories()](docs/sdks/transactioncategories/README.md)

* [getBankingTransactionCategory](docs/sdks/transactioncategories/README.md#getbankingtransactioncategory) - Get transaction category
* [listBankingTransactionCategories](docs/sdks/transactioncategories/README.md#listbankingtransactioncategories) - List transaction categories

### [banking().transactions()](docs/sdks/codatlendingbankingtransactions/README.md)

* [getBankingTransaction](docs/sdks/codatlendingbankingtransactions/README.md#getbankingtransaction) - Get bank transaction
* [listBankingTransactions](docs/sdks/codatlendingbankingtransactions/README.md#listbankingtransactions) - List transactions

### [banking().categorizedStatement()](docs/sdks/categorizedstatement/README.md)

* [getCategorizedBankStatement](docs/sdks/categorizedstatement/README.md#getcategorizedbankstatement) - Get categorized bank statement


### [accountsPayable().bills()](docs/sdks/bills/README.md)

* [downloadAccountingBillAttachment](docs/sdks/bills/README.md#downloadaccountingbillattachment) - Download bill attachment
* [getAccountingBill](docs/sdks/bills/README.md#getaccountingbill) - Get bill
* [getAccountingBillAttachment](docs/sdks/bills/README.md#getaccountingbillattachment) - Get bill attachment
* [listAccountingBills](docs/sdks/bills/README.md#listaccountingbills) - List bills
* [listAccountingBillAttachments](docs/sdks/bills/README.md#listaccountingbillattachments) - List bill attachments

### [accountsPayable().suppliers()](docs/sdks/suppliers/README.md)

* [downloadAccountingSupplierAttachment](docs/sdks/suppliers/README.md#downloadaccountingsupplierattachment) - Download supplier attachment
* [getAccountingSupplier](docs/sdks/suppliers/README.md#getaccountingsupplier) - Get supplier
* [getAccountingSupplierAttachment](docs/sdks/suppliers/README.md#getaccountingsupplierattachment) - Get supplier attachment
* [listAccountingSuppliers](docs/sdks/suppliers/README.md#listaccountingsuppliers) - List suppliers
* [listAccountingSupplierAttachments](docs/sdks/suppliers/README.md#listaccountingsupplierattachments) - List supplier attachments

### [accountsPayable().billCreditNotes()](docs/sdks/billcreditnotes/README.md)

* [getAccountingBillCreditNote](docs/sdks/billcreditnotes/README.md#getaccountingbillcreditnote) - Get bill credit note
* [listAccountingBillCreditNotes](docs/sdks/billcreditnotes/README.md#listaccountingbillcreditnotes) - List bill credit notes

### [accountsPayable().billPayments()](docs/sdks/billpayments/README.md)

* [getAccountingBillPayment](docs/sdks/billpayments/README.md#getaccountingbillpayment) - Get bill payment
* [listAccountingBillPayments](docs/sdks/billpayments/README.md#listaccountingbillpayments) - List bill payments


### [sales().customers()](docs/sdks/codatlendingcustomers/README.md)

* [getCommerceCustomer](docs/sdks/codatlendingcustomers/README.md#getcommercecustomer) - Get customer
* [listCommerceCustomers](docs/sdks/codatlendingcustomers/README.md#listcommercecustomers) - List customers

### [sales().disputes()](docs/sdks/disputes/README.md)

* [getCommerceDispute](docs/sdks/disputes/README.md#getcommercedispute) - Get dispute
* [listCommerceDisputes](docs/sdks/disputes/README.md#listcommercedisputes) - List disputes

### [sales().locations()](docs/sdks/locations/README.md)

* [getCommerceLocation](docs/sdks/locations/README.md#getcommercelocation) - Get location
* [listCommerceLocations](docs/sdks/locations/README.md#listcommercelocations) - List locations

### [sales().orders()](docs/sdks/orders/README.md)

* [getCommerceOrder](docs/sdks/orders/README.md#getcommerceorder) - Get order
* [listCommerceOrders](docs/sdks/orders/README.md#listcommerceorders) - List orders

### [sales().paymentMethods()](docs/sdks/paymentmethods/README.md)

* [getCommercePaymentMethod](docs/sdks/paymentmethods/README.md#getcommercepaymentmethod) - Get payment method
* [listCommercePaymentMethods](docs/sdks/paymentmethods/README.md#listcommercepaymentmethods) - List payment methods

### [sales().payments()](docs/sdks/codatlendingsalespayments/README.md)

* [getCommercePayment](docs/sdks/codatlendingsalespayments/README.md#getcommercepayment) - Get payment
* [listCommercePayments](docs/sdks/codatlendingsalespayments/README.md#listcommercepayments) - List payments

### [sales().productCategories()](docs/sdks/productcategories/README.md)

* [getCommerceProductCategory](docs/sdks/productcategories/README.md#getcommerceproductcategory) - Get product category
* [listCommerceProductCategories](docs/sdks/productcategories/README.md#listcommerceproductcategories) - List product categories

### [sales().products()](docs/sdks/products/README.md)

* [getCommerceProduct](docs/sdks/products/README.md#getcommerceproduct) - Get product
* [listCommerceProducts](docs/sdks/products/README.md#listcommerceproducts) - List products

### [sales().transactions()](docs/sdks/codatlendingtransactions/README.md)

* [getCommerceTransaction](docs/sdks/codatlendingtransactions/README.md#getcommercetransaction) - Get transaction
* [listCommerceTransactions](docs/sdks/codatlendingtransactions/README.md#listcommercetransactions) - List transactions

### [sales().metrics()](docs/sdks/metrics/README.md)

* [getCommerceCustomerRetentionMetrics](docs/sdks/metrics/README.md#getcommercecustomerretentionmetrics) - Get customer retention metrics
* [getCommerceLifetimeValueMetrics](docs/sdks/metrics/README.md#getcommercelifetimevaluemetrics) - Get lifetime value metrics
* [getCommerceRevenueMetrics](docs/sdks/metrics/README.md#getcommercerevenuemetrics) - Get commerce revenue metrics

### [sales().reports()](docs/sdks/codatlendingreports/README.md)

* [getCommerceOrdersReport](docs/sdks/codatlendingreports/README.md#getcommerceordersreport) - Get orders report
* [getCommerceRefundsReport](docs/sdks/codatlendingreports/README.md#getcommercerefundsreport) - Get refunds report

### [companyInfo()](docs/sdks/companyinfo/README.md)

* [getAccountingProfile](docs/sdks/companyinfo/README.md#getaccountingprofile) - Get company accounting profile
* [getCommerceProfile](docs/sdks/companyinfo/README.md#getcommerceprofile) - Get company commerce profile


### [accountsReceivable().customers()](docs/sdks/customers/README.md)

* [downloadAccountingCustomerAttachment](docs/sdks/customers/README.md#downloadaccountingcustomerattachment) - Download customer attachment
* [getAccountingCustomer](docs/sdks/customers/README.md#getaccountingcustomer) - Get customer
* [getAccountingCustomerAttachment](docs/sdks/customers/README.md#getaccountingcustomerattachment) - Get customer attachment
* [listAccountingCustomers](docs/sdks/customers/README.md#listaccountingcustomers) - List customers
* [listAccountingCustomerAttachments](docs/sdks/customers/README.md#listaccountingcustomerattachments) - List customer attachments

### [accountsReceivable().directIncomes()](docs/sdks/directincomes/README.md)

* [downloadAccountingDirectIncomeAttachment](docs/sdks/directincomes/README.md#downloadaccountingdirectincomeattachment) - Download direct income attachment
* [getAccountingDirectIncome](docs/sdks/directincomes/README.md#getaccountingdirectincome) - Get direct income
* [getAccountingDirectIncomeAttachment](docs/sdks/directincomes/README.md#getaccountingdirectincomeattachment) - Get direct income attachment
* [listAccountingDirectIncomes](docs/sdks/directincomes/README.md#listaccountingdirectincomes) - List direct incomes
* [listAccountingDirectIncomeAttachments](docs/sdks/directincomes/README.md#listaccountingdirectincomeattachments) - List direct income attachments

### [accountsReceivable().invoices()](docs/sdks/invoices/README.md)

* [downloadAccountingInvoiceAttachment](docs/sdks/invoices/README.md#downloadaccountinginvoiceattachment) - Download invoice attachment
* [downloadAccountingInvoicePdf](docs/sdks/invoices/README.md#downloadaccountinginvoicepdf) - Get invoice as PDF
* [getAccountingInvoice](docs/sdks/invoices/README.md#getaccountinginvoice) - Get invoice
* [getAccountingInvoiceAttachment](docs/sdks/invoices/README.md#getaccountinginvoiceattachment) - Get invoice attachment
* [listAccountingInvoices](docs/sdks/invoices/README.md#listaccountinginvoices) - List invoices
* [listAccountingInvoiceAttachments](docs/sdks/invoices/README.md#listaccountinginvoiceattachments) - List invoice attachments
* [listReconciledInvoices](docs/sdks/invoices/README.md#listreconciledinvoices) - List reconciled invoices

### [accountsReceivable().creditNotes()](docs/sdks/creditnotes/README.md)

* [getAccountingCreditNote](docs/sdks/creditnotes/README.md#getaccountingcreditnote) - Get credit note
* [listAccountingCreditNotes](docs/sdks/creditnotes/README.md#listaccountingcreditnotes) - List credit notes

### [accountsReceivable().payments()](docs/sdks/payments/README.md)

* [getAccountingPayment](docs/sdks/payments/README.md#getaccountingpayment) - Get payment
* [listAccountingPayments](docs/sdks/payments/README.md#listaccountingpayments) - List payments

### [accountsReceivable().reports()](docs/sdks/reports/README.md)

* [getAccountingAgedCreditorsReport](docs/sdks/reports/README.md#getaccountingagedcreditorsreport) - Aged creditors report
* [getAccountingAgedDebtorsReport](docs/sdks/reports/README.md#getaccountingageddebtorsreport) - Aged debtors report
* [isAgedCreditorsReportAvailable](docs/sdks/reports/README.md#isagedcreditorsreportavailable) - Aged creditors report available
* [isAgedDebtorsReportAvailable](docs/sdks/reports/README.md#isageddebtorsreportavailable) - Aged debtors report available

### [fileUpload()](docs/sdks/fileupload/README.md)

* [downloadFiles](docs/sdks/fileupload/README.md#downloadfiles) - Download all files for a company
* [listFiles](docs/sdks/fileupload/README.md#listfiles) - List all files uploaded by a company
* [uploadFiles](docs/sdks/fileupload/README.md#uploadfiles) - Upload files for a company


### [loanWriteback().bankAccounts()](docs/sdks/bankaccounts/README.md)

* [createBankAccount](docs/sdks/bankaccounts/README.md#createbankaccount) - Create bank account
* [getCreateUpdateBankAccountsModel](docs/sdks/bankaccounts/README.md#getcreateupdatebankaccountsmodel) - Get create/update bank account model

### [loanWriteback().bankTransactions()](docs/sdks/banktransactions/README.md)

* [createBankTransactions](docs/sdks/banktransactions/README.md#createbanktransactions) - Create bank account transactions
* [getCreateBankTransactionsModel](docs/sdks/banktransactions/README.md#getcreatebanktransactionsmodel) - Get create bank account transactions model

### [loanWriteback().accounts()](docs/sdks/codatlendingloanwritebackaccounts/README.md)

* [createAccount](docs/sdks/codatlendingloanwritebackaccounts/README.md#createaccount) - Create account
* [getCreateChartOfAccountsModel](docs/sdks/codatlendingloanwritebackaccounts/README.md#getcreatechartofaccountsmodel) - Get create account model

### [loanWriteback().directCosts()](docs/sdks/directcosts/README.md)

* [createDirectCost](docs/sdks/directcosts/README.md#createdirectcost) - Create direct cost
* [getCreateDirectCostsModel](docs/sdks/directcosts/README.md#getcreatedirectcostsmodel) - Get create direct cost model

### [loanWriteback().payments()](docs/sdks/codatlendingpayments/README.md)

* [createPayment](docs/sdks/codatlendingpayments/README.md#createpayment) - Create payment
* [getCreatePaymentModel](docs/sdks/codatlendingpayments/README.md#getcreatepaymentmodel) - Get create payment model

### [loanWriteback().suppliers()](docs/sdks/codatlendingsuppliers/README.md)

* [createSupplier](docs/sdks/codatlendingsuppliers/README.md#createsupplier) - Create supplier
* [getCreateUpdateSuppliersModel](docs/sdks/codatlendingsuppliers/README.md#getcreateupdatesuppliersmodel) - Get create/update supplier model

### [loanWriteback().transfers()](docs/sdks/transfers/README.md)

* [createTransfer](docs/sdks/transfers/README.md#createtransfer) - Create transfer
* [getCreateTransfersModel](docs/sdks/transfers/README.md#getcreatetransfersmodel) - Get create transfer model

### [loanWriteback().createOperations()](docs/sdks/createoperations/README.md)

* [getCreateOperation](docs/sdks/createoperations/README.md#getcreateoperation) - Get create operation
* [listCreateOperations](docs/sdks/createoperations/README.md#listcreateoperations) - List create operations


### [financialStatements().accounts()](docs/sdks/codatlendingfinancialstatementsaccounts/README.md)

* [getAccountingAccount](docs/sdks/codatlendingfinancialstatementsaccounts/README.md#getaccountingaccount) - Get account
* [listAccountingAccounts](docs/sdks/codatlendingfinancialstatementsaccounts/README.md#listaccountingaccounts) - List accounts

### [financialStatements().balanceSheet()](docs/sdks/balancesheet/README.md)

* [getAccountingBalanceSheet](docs/sdks/balancesheet/README.md#getaccountingbalancesheet) - Get balance sheet
* [getCategorizedBalanceSheetStatement](docs/sdks/balancesheet/README.md#getcategorizedbalancesheetstatement) - Get categorized balance sheet statement

### [financialStatements().cashFlow()](docs/sdks/cashflow/README.md)

* [getAccountingCashFlowStatement](docs/sdks/cashflow/README.md#getaccountingcashflowstatement) - Get cash flow statement

### [financialStatements().profitAndLoss()](docs/sdks/profitandloss/README.md)

* [getAccountingProfitAndLoss](docs/sdks/profitandloss/README.md#getaccountingprofitandloss) - Get profit and loss
* [getCategorizedProfitAndLossStatement](docs/sdks/profitandloss/README.md#getcategorizedprofitandlossstatement) - Get categorized profit and loss statement

### [manageData()](docs/sdks/managedata/README.md)

* [getDataStatus](docs/sdks/managedata/README.md#getdatastatus) - Get data status

### [manageData().refresh()](docs/sdks/refresh/README.md)

* [refreshAllDataTypes](docs/sdks/refresh/README.md#refreshalldatatypes) - Refresh all data
* [refreshDataType](docs/sdks/refresh/README.md#refreshdatatype) - Refresh data type

### [manageData().pullOperations()](docs/sdks/pulloperations/README.md)

* [getPullOperation](docs/sdks/pulloperations/README.md#getpulloperation) - Get pull operation
* [listPullOperations](docs/sdks/pulloperations/README.md#listpulloperations) - List pull operations

### [liabilities()](docs/sdks/liabilities/README.md)

* [generateLoanSummary](docs/sdks/liabilities/README.md#generateloansummary) - Generate loan summaries report
* [generateLoanTransactions](docs/sdks/liabilities/README.md#generateloantransactions) - Generate loan transactions report
* [getLoanSummary](docs/sdks/liabilities/README.md#getloansummary) - Get loan summaries
* [listLoanTransactions](docs/sdks/liabilities/README.md#listloantransactions) - List loan transactions

### [dataIntegrity()](docs/sdks/dataintegrity/README.md)

* [listDataIntegrityDetails](docs/sdks/dataintegrity/README.md#listdataintegritydetails) - List data integrity details
* [getDataIntegrityStatus](docs/sdks/dataintegrity/README.md#getdataintegritystatus) - Get data integrity status
* [getDataIntegritySummaries](docs/sdks/dataintegrity/README.md#getdataintegritysummaries) - Get data integrity summaries

### [excelReports()](docs/sdks/excelreports/README.md)

* [downloadExcelReport](docs/sdks/excelreports/README.md#downloadexcelreport) - Download Excel report
* [generateExcelReport](docs/sdks/excelreports/README.md#generateexcelreport) - Generate Excel report
* [getExcelReportGenerationStatus](docs/sdks/excelreports/README.md#getexcelreportgenerationstatus) - Get Excel report status
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

### Example

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.codat.io` | None |

#### Example

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .serverIndex(0)
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .serverURL("https://api.codat.io")
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `authHeader` | apiKey       | API key      |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->


<!-- Start Codat Support Notes -->
### Support

If you encounter any challenges while utilizing our SDKs, please don't hesitate to reach out for assistance. 
You can raise any issues by contacting your dedicated Codat representative or reaching out to our [support team](mailto:support@codat.io).
We're here to help ensure a smooth experience for you.
<!-- End Codat Support Notes -->
### Library generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
