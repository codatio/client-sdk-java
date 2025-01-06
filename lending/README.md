# Lending

<!-- Start Codat Library Description -->
Lending helps you make smarter credit decisions on small businesses by enabling you to pull your customers' latest data from the operating systems they are already using. You can use that data for automating decisioning and surfacing new insights on the customer, all via one API.
<!-- End Codat Library Description -->

<!-- Start Summary [summary] -->
## Summary

Lending API: Our Lending API helps you make smarter credit decisions on small businesses by enabling you to pull your customers' latest data from accounting, banking, and commerce software they are already using. It also includes features to help providers verify the accuracy of data and process it more efficiently.

The Lending API is built on top of the latest accounting, commerce, and banking data, providing you with the most important data points you need to get a full picture of SMB creditworthiness and make a comprehensive assessment of your customers.

[Explore product](https://docs.codat.io/lending/overview) | [See OpenAPI spec](https://github.com/codatio/oas)

<!-- Start Codat Tags Table -->
## Endpoints

| Endpoints | Description |
| :- |:- |
| Companies | Create and manage your SMB users' companies. |
| Connections | Create new and manage existing data connections for a company. |
| Bank statements | Retrieve banking data from linked bank accounts. |
| Sales | Retrieve standardized sales data from a linked commerce software. |
| Financial statements | Financial data and reports from a linked accounting software. |
| Liabilities | Debt and other liabilities. |
| Accounts payable | Data from a linked accounting software representing money the business owes money to its suppliers. |
| Accounts receivable | Data from a linked accounting software representing money owed to the business for sold goods or services. |
| Transactions | Data from a linked accounting software representing transactions. |
| Company info | View company information fetched from the source platform. |
| Data integrity | Match mutable accounting data with immutable banking data to increase confidence in financial data. |
| Excel reports | Download reports in Excel format. |
| Manage data | Control how data is retrieved from an integration. |
| File upload | Endpoints to manage uploaded files. |
| Loan writeback | Implement the [loan writeback](https://docs.codat.io/lending/guides/loan-writeback/introduction) procedure in your lending process to maintain an accurate position of a loan during the entire lending cycle. |
<!-- End Codat Tags Table -->
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
  * [Endpoints](#endpoints)
  * [SDK Installation](#sdk-installation)
  * [Example Usage](#example-usage)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Authentication](#authentication)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'io.codat:lending:3.1.0'
```

Maven:
```xml
<dependency>
    <groupId>io.codat</groupId>
    <artifactId>lending</artifactId>
    <version>3.1.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.shared.AccountCategoriesUpdatedWebhook;
import io.codat.lending.models.shared.AccountCategoriesUpdatedWebhookData;
import io.codat.lending.models.webhooks.AccountCategoriesUpdatedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        CodatLending sdk = CodatLending.builder()
            .build();

        AccountCategoriesUpdatedWebhook req = AccountCategoriesUpdatedWebhook.builder()
                .alertId("a9367074-b5c3-42c4-9be4-be129f43577e")
                .clientId("bae71d36-ff47-420a-b4a6-f8c9ddf41140")
                .clientName("Bank of Dave")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .data(AccountCategoriesUpdatedWebhookData.builder()
                    .modifiedDate("2022-10-23")
                    .build())
                .dataConnectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .message("Account categories updated for company f1c35bdc-1546-41b9-baf4-3f31135af968.")
                .ruleId("70af3071-65d9-4ec3-b3cb-5283e8d55dac")
                .ruleType("Account Categories Updated")
                .build();

        AccountCategoriesUpdatedResponse res = sdk.accountCategoriesUpdated()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [accountingBankData()](docs/sdks/codatlendingaccountingbankdata/README.md)

* [listTransactions](docs/sdks/codatlendingaccountingbankdata/README.md#listtransactions) - List bank account transactions

#### [accountingBankData().accounts()](docs/sdks/accounts/README.md)

* [get](docs/sdks/accounts/README.md#get) - Get bank account
* [list](docs/sdks/accounts/README.md#list) - List bank accounts

### [accountsPayable()](docs/sdks/accountspayable/README.md)


#### [accountsPayable().billCreditNotes()](docs/sdks/billcreditnotes/README.md)

* [get](docs/sdks/billcreditnotes/README.md#get) - Get bill credit note
* [list](docs/sdks/billcreditnotes/README.md#list) - List bill credit notes

#### [accountsPayable().billPayments()](docs/sdks/billpayments/README.md)

* [get](docs/sdks/billpayments/README.md#get) - Get bill payment
* [list](docs/sdks/billpayments/README.md#list) - List bill payments

#### [accountsPayable().bills()](docs/sdks/bills/README.md)

* [downloadAttachment](docs/sdks/bills/README.md#downloadattachment) - Download bill attachment
* [get](docs/sdks/bills/README.md#get) - Get bill
* [getAttachment](docs/sdks/bills/README.md#getattachment) - Get bill attachment
* [list](docs/sdks/bills/README.md#list) - List bills
* [listAttachments](docs/sdks/bills/README.md#listattachments) - List bill attachments

#### [accountsPayable().suppliers()](docs/sdks/suppliers/README.md)

* [downloadAttachment](docs/sdks/suppliers/README.md#downloadattachment) - Download supplier attachment
* [get](docs/sdks/suppliers/README.md#get) - Get supplier
* [getAttachment](docs/sdks/suppliers/README.md#getattachment) - Get supplier attachment
* [list](docs/sdks/suppliers/README.md#list) - List suppliers
* [listAttachments](docs/sdks/suppliers/README.md#listattachments) - List supplier attachments

### [accountsReceivable()](docs/sdks/accountsreceivable/README.md)


#### [accountsReceivable().creditNotes()](docs/sdks/creditnotes/README.md)

* [get](docs/sdks/creditnotes/README.md#get) - Get credit note
* [list](docs/sdks/creditnotes/README.md#list) - List credit notes

#### [accountsReceivable().customers()](docs/sdks/customers/README.md)

* [downloadAttachment](docs/sdks/customers/README.md#downloadattachment) - Download customer attachment
* [get](docs/sdks/customers/README.md#get) - Get customer
* [getAttachment](docs/sdks/customers/README.md#getattachment) - Get customer attachment
* [list](docs/sdks/customers/README.md#list) - List customers
* [listAttachments](docs/sdks/customers/README.md#listattachments) - List customer attachments

#### [accountsReceivable().directIncomes()](docs/sdks/directincomes/README.md)

* [downloadAttachment](docs/sdks/directincomes/README.md#downloadattachment) - Download direct income attachment
* [get](docs/sdks/directincomes/README.md#get) - Get direct income
* [getAttachment](docs/sdks/directincomes/README.md#getattachment) - Get direct income attachment
* [list](docs/sdks/directincomes/README.md#list) - List direct incomes
* [listAttachments](docs/sdks/directincomes/README.md#listattachments) - List direct income attachments

#### [accountsReceivable().invoices()](docs/sdks/invoices/README.md)

* [downloadAttachment](docs/sdks/invoices/README.md#downloadattachment) - Download invoice attachment
* [downloadPdf](docs/sdks/invoices/README.md#downloadpdf) - Get invoice as PDF
* [get](docs/sdks/invoices/README.md#get) - Get invoice
* [getAttachment](docs/sdks/invoices/README.md#getattachment) - Get invoice attachment
* [list](docs/sdks/invoices/README.md#list) - List invoices
* [listAttachments](docs/sdks/invoices/README.md#listattachments) - List invoice attachments
* [listReconciled](docs/sdks/invoices/README.md#listreconciled) - List reconciled invoices

#### [accountsReceivable().payments()](docs/sdks/payments/README.md)

* [get](docs/sdks/payments/README.md#get) - Get payment
* [list](docs/sdks/payments/README.md#list) - List payments

#### [accountsReceivable().reports()](docs/sdks/reports/README.md)

* [getAgedCreditors](docs/sdks/reports/README.md#getagedcreditors) - Aged creditors report
* [getAgedDebtors](docs/sdks/reports/README.md#getageddebtors) - Aged debtors report
* [isAgedCreditorsAvailable](docs/sdks/reports/README.md#isagedcreditorsavailable) - Aged creditors report available
* [isAgedDebtorsAvailable](docs/sdks/reports/README.md#isageddebtorsavailable) - Aged debtors report available

### [banking()](docs/sdks/banking/README.md)


#### [banking().accountBalances()](docs/sdks/accountbalances/README.md)

* [list](docs/sdks/accountbalances/README.md#list) - List account balances

#### [banking().accounts()](docs/sdks/codatlendingaccounts/README.md)

* [get](docs/sdks/codatlendingaccounts/README.md#get) - Get account
* [list](docs/sdks/codatlendingaccounts/README.md#list) - List accounts

#### [banking().categorizedStatement()](docs/sdks/categorizedstatement/README.md)

* [get](docs/sdks/categorizedstatement/README.md#get) - Get categorized bank statement

#### [banking().transactionCategories()](docs/sdks/transactioncategories/README.md)

* [get](docs/sdks/transactioncategories/README.md#get) - Get transaction category
* [list](docs/sdks/transactioncategories/README.md#list) - List transaction categories

#### [banking().transactions()](docs/sdks/codatlendingbankingtransactions/README.md)

* [get](docs/sdks/codatlendingbankingtransactions/README.md#get) - Get bank transaction
* [list](docs/sdks/codatlendingbankingtransactions/README.md#list) - List transactions

### [bankStatements()](docs/sdks/bankstatements/README.md)

* [endUploadSession](docs/sdks/bankstatements/README.md#enduploadsession) - End upload session
* [getUploadConfiguration](docs/sdks/bankstatements/README.md#getuploadconfiguration) - Get upload configuration
* [setUploadConfiguration](docs/sdks/bankstatements/README.md#setuploadconfiguration) - Set upload configuration
* [startUploadSession](docs/sdks/bankstatements/README.md#startuploadsession) - Start upload session
* [uploadBankStatementData](docs/sdks/bankstatements/README.md#uploadbankstatementdata) - Upload data


### [companies()](docs/sdks/companies/README.md)

* [create](docs/sdks/companies/README.md#create) - Create company
* [delete](docs/sdks/companies/README.md#delete) - Delete a company
* [get](docs/sdks/companies/README.md#get) - Get company
* [list](docs/sdks/companies/README.md#list) - List companies
* [update](docs/sdks/companies/README.md#update) - Update company

### [companyInfo()](docs/sdks/companyinfo/README.md)

* [getAccountingProfile](docs/sdks/companyinfo/README.md#getaccountingprofile) - Get company accounting profile
* [getCommerceProfile](docs/sdks/companyinfo/README.md#getcommerceprofile) - Get company commerce profile

### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [delete](docs/sdks/connections/README.md#delete) - Delete connection
* [get](docs/sdks/connections/README.md#get) - Get connection
* [list](docs/sdks/connections/README.md#list) - List connections
* [unlink](docs/sdks/connections/README.md#unlink) - Unlink connection

### [dataIntegrity()](docs/sdks/dataintegrity/README.md)

* [details](docs/sdks/dataintegrity/README.md#details) - List data integrity details
* [status](docs/sdks/dataintegrity/README.md#status) - Get data integrity status
* [summaries](docs/sdks/dataintegrity/README.md#summaries) - Get data integrity summaries

### [excelReports()](docs/sdks/excelreports/README.md)

* [download](docs/sdks/excelreports/README.md#download) - Download Excel report
* [generate](docs/sdks/excelreports/README.md#generate) - Generate Excel report
* [getStatus](docs/sdks/excelreports/README.md#getstatus) - Get Excel report status

### [fileUpload()](docs/sdks/fileupload/README.md)

* [download](docs/sdks/fileupload/README.md#download) - Download all files for a company
* [listUploaded](docs/sdks/fileupload/README.md#listuploaded) - List all files uploaded by a company
* [upload](docs/sdks/fileupload/README.md#upload) - Upload files for a company

### [financialStatements()](docs/sdks/financialstatements/README.md)


#### [financialStatements().accounts()](docs/sdks/codatlendingfinancialstatementsaccounts/README.md)

* [get](docs/sdks/codatlendingfinancialstatementsaccounts/README.md#get) - Get account
* [list](docs/sdks/codatlendingfinancialstatementsaccounts/README.md#list) - List accounts

#### [financialStatements().balanceSheet()](docs/sdks/balancesheet/README.md)

* [get](docs/sdks/balancesheet/README.md#get) - Get balance sheet
* [getCategorizedAccounts](docs/sdks/balancesheet/README.md#getcategorizedaccounts) - Get categorized balance sheet statement

#### [financialStatements().cashFlow()](docs/sdks/cashflow/README.md)

* [get](docs/sdks/cashflow/README.md#get) - Get cash flow statement

#### [financialStatements().profitAndLoss()](docs/sdks/profitandloss/README.md)

* [get](docs/sdks/profitandloss/README.md#get) - Get profit and loss
* [getCategorizedAccounts](docs/sdks/profitandloss/README.md#getcategorizedaccounts) - Get categorized profit and loss statement

### [liabilities()](docs/sdks/liabilities/README.md)

* [generateLoanSummary](docs/sdks/liabilities/README.md#generateloansummary) - Generate loan summaries report
* [generateLoanTransactions](docs/sdks/liabilities/README.md#generateloantransactions) - Generate loan transactions report
* [getLoanSummary](docs/sdks/liabilities/README.md#getloansummary) - Get loan summaries
* [listLoanTransactions](docs/sdks/liabilities/README.md#listloantransactions) - List loan transactions

### [loanWriteback()](docs/sdks/loanwriteback/README.md)


#### [loanWriteback().accounts()](docs/sdks/codatlendingloanwritebackaccounts/README.md)

* [create](docs/sdks/codatlendingloanwritebackaccounts/README.md#create) - Create account
* [getCreateModel](docs/sdks/codatlendingloanwritebackaccounts/README.md#getcreatemodel) - Get create account model

#### [loanWriteback().bankAccounts()](docs/sdks/bankaccounts/README.md)

* [create](docs/sdks/bankaccounts/README.md#create) - Create bank account
* [getCreateUpdateModel](docs/sdks/bankaccounts/README.md#getcreateupdatemodel) - Get create/update bank account model

#### [loanWriteback().bankTransactions()](docs/sdks/banktransactions/README.md)

* [create](docs/sdks/banktransactions/README.md#create) - Create bank account transactions
* [getCreateModel](docs/sdks/banktransactions/README.md#getcreatemodel) - Get create bank account transactions model

#### [loanWriteback().createOperations()](docs/sdks/createoperations/README.md)

* [get](docs/sdks/createoperations/README.md#get) - Get create operation
* [list](docs/sdks/createoperations/README.md#list) - List create operations

#### [loanWriteback().directCosts()](docs/sdks/directcosts/README.md)

* [create](docs/sdks/directcosts/README.md#create) - Create direct cost
* [getCreateModel](docs/sdks/directcosts/README.md#getcreatemodel) - Get create direct cost model

#### [loanWriteback().payments()](docs/sdks/codatlendingpayments/README.md)

* [create](docs/sdks/codatlendingpayments/README.md#create) - Create payment
* [getCreateModel](docs/sdks/codatlendingpayments/README.md#getcreatemodel) - Get create payment model

#### [loanWriteback().sourceAccounts()](docs/sdks/sourceaccounts/README.md)

* [create](docs/sdks/sourceaccounts/README.md#create) - Create source account
* [createMapping](docs/sdks/sourceaccounts/README.md#createmapping) - Create bank feed account mapping
* [listMappings](docs/sdks/sourceaccounts/README.md#listmappings) - List bank feed account mappings

#### [loanWriteback().suppliers()](docs/sdks/codatlendingsuppliers/README.md)

* [create](docs/sdks/codatlendingsuppliers/README.md#create) - Create supplier
* [getCreateUpdateModel](docs/sdks/codatlendingsuppliers/README.md#getcreateupdatemodel) - Get create/update supplier model

#### [loanWriteback().transfers()](docs/sdks/transfers/README.md)

* [create](docs/sdks/transfers/README.md#create) - Create transfer
* [getCreateModel](docs/sdks/transfers/README.md#getcreatemodel) - Get create transfer model

### [manageData()](docs/sdks/managedata/README.md)

* [getStatus](docs/sdks/managedata/README.md#getstatus) - Get data status

#### [manageData().pullOperations()](docs/sdks/pulloperations/README.md)

* [get](docs/sdks/pulloperations/README.md#get) - Get pull operation
* [list](docs/sdks/pulloperations/README.md#list) - List pull operations

#### [manageData().refresh()](docs/sdks/refresh/README.md)

* [allDataTypes](docs/sdks/refresh/README.md#alldatatypes) - Refresh all data
* [dataType](docs/sdks/refresh/README.md#datatype) - Refresh data type

### [manageReports()](docs/sdks/managereports/README.md)

* [generateReport](docs/sdks/managereports/README.md#generatereport) - Generate report
* [listReports](docs/sdks/managereports/README.md#listreports) - List reports

### [sales()](docs/sdks/sales/README.md)


#### [sales().customers()](docs/sdks/codatlendingcustomers/README.md)

* [get](docs/sdks/codatlendingcustomers/README.md#get) - Get customer
* [list](docs/sdks/codatlendingcustomers/README.md#list) - List customers

#### [sales().disputes()](docs/sdks/disputes/README.md)

* [get](docs/sdks/disputes/README.md#get) - Get dispute
* [list](docs/sdks/disputes/README.md#list) - List disputes

#### [sales().locations()](docs/sdks/locations/README.md)

* [get](docs/sdks/locations/README.md#get) - Get location
* [list](docs/sdks/locations/README.md#list) - List locations

#### [sales().metrics()](docs/sdks/metrics/README.md)

* [getCustomerRetention](docs/sdks/metrics/README.md#getcustomerretention) - Get customer retention metrics
* [getLifetimeValue](docs/sdks/metrics/README.md#getlifetimevalue) - Get lifetime value metrics
* [getRevenue](docs/sdks/metrics/README.md#getrevenue) - Get commerce revenue metrics

#### [sales().orders()](docs/sdks/orders/README.md)

* [get](docs/sdks/orders/README.md#get) - Get order
* [list](docs/sdks/orders/README.md#list) - List orders

#### [sales().paymentMethods()](docs/sdks/paymentmethods/README.md)

* [get](docs/sdks/paymentmethods/README.md#get) - Get payment method
* [list](docs/sdks/paymentmethods/README.md#list) - List payment methods

#### [sales().payments()](docs/sdks/codatlendingsalespayments/README.md)

* [get](docs/sdks/codatlendingsalespayments/README.md#get) - Get payment
* [list](docs/sdks/codatlendingsalespayments/README.md#list) - List payments

#### [sales().productCategories()](docs/sdks/productcategories/README.md)

* [get](docs/sdks/productcategories/README.md#get) - Get product category
* [list](docs/sdks/productcategories/README.md#list) - List product categories

#### [sales().products()](docs/sdks/products/README.md)

* [get](docs/sdks/products/README.md#get) - Get product
* [list](docs/sdks/products/README.md#list) - List products

#### [sales().reports()](docs/sdks/codatlendingreports/README.md)

* [getOrders](docs/sdks/codatlendingreports/README.md#getorders) - Get orders report
* [getRefunds](docs/sdks/codatlendingreports/README.md#getrefunds) - Get refunds report

#### [sales().transactions()](docs/sdks/codatlendingtransactions/README.md)

* [get](docs/sdks/codatlendingtransactions/README.md#get) - Get transaction
* [list](docs/sdks/codatlendingtransactions/README.md#list) - List transactions

### [transactions()](docs/sdks/transactions/README.md)


#### [transactions().accountTransactions()](docs/sdks/accounttransactions/README.md)

* [get](docs/sdks/accounttransactions/README.md#get) - Get account transaction
* [list](docs/sdks/accounttransactions/README.md#list) - List account transactions

#### [transactions().directCosts()](docs/sdks/codatlendingdirectcosts/README.md)

* [downloadAttachment](docs/sdks/codatlendingdirectcosts/README.md#downloadattachment) - Download direct cost attachment
* [get](docs/sdks/codatlendingdirectcosts/README.md#get) - Get direct cost
* [getAttachment](docs/sdks/codatlendingdirectcosts/README.md#getattachment) - Get direct cost attachment
* [list](docs/sdks/codatlendingdirectcosts/README.md#list) - List direct costs
* [listAttachments](docs/sdks/codatlendingdirectcosts/README.md#listattachments) - List direct cost attachments

#### [transactions().journalEntries()](docs/sdks/journalentries/README.md)

* [get](docs/sdks/journalentries/README.md#get) - Get journal entry
* [list](docs/sdks/journalentries/README.md#list) - List journal entries

#### [transactions().journals()](docs/sdks/journals/README.md)

* [get](docs/sdks/journals/README.md#get) - Get journal
* [list](docs/sdks/journals/README.md#list) - List journals

#### [transactions().transfers()](docs/sdks/codatlendingtransfers/README.md)

* [get](docs/sdks/codatlendingtransfers/README.md#get) - Get transfer
* [list](docs/sdks/codatlendingtransfers/README.md#list) - List transfers

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Security;
import io.codat.lending.utils.BackoffStrategy;
import io.codat.lending.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Technicalium")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .call();

        if (res.company().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Security;
import io.codat.lending.utils.BackoffStrategy;
import io.codat.lending.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Technicalium")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

        if (res.company().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `create` method throws the following exceptions:

| Error Type                 | Status Code                       | Content Type     |
| -------------------------- | --------------------------------- | ---------------- |
| models/errors/ErrorMessage | 400, 401, 402, 403, 429, 500, 503 | application/json |
| models/errors/SDKError     | 4XX, 5XX                          | \*/\*            |

### Example

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Technicalium")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

        if (res.company().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .serverURL("https://api.codat.io")
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Technicalium")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

        if (res.company().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type   | Scheme  |
| ------------ | ------ | ------- |
| `authHeader` | apiKey | API key |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Technicalium")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

        if (res.company().isPresent()) {
            // handle response
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
