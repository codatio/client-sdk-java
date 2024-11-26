# Sync for Expenses

<!-- Start Codat Library Description -->
﻿Embedded accounting integrations for corporate card providers.
<!-- End Codat Library Description -->

<!-- Start Summary [summary] -->
## Summary

Sync for Expenses: The API for Sync for Expenses.

Sync for Expenses is an API and a set of supporting tools. It has been built to
enable corporate card and expense management platforms to provide high-quality
integrations with multiple accounting software through a standardized API.

[Explore product](https://docs.codat.io/sync-for-expenses/overview) | [See our OpenAPI spec](https://github.com/codatio/oas)

Not seeing the endpoints you're expecting? We've [reorganized our products](https://docs.codat.io/updates/230901-new-products), and you may be using a [different version of Sync for Expenses](https://docs.codat.io/sync-for-expenses-v1-api#/).

---
<!-- Start Codat Tags Table -->
## Endpoints

| Endpoints | Description |
| :- |:- |
| Companies | Create and manage your SMB users' companies. |
| Connections | Create new and manage existing data connections for a company. |
| Configuration | View and manage mapping configuration and defaults for expense transactions. |
| Sync | Monitor the status of data syncs. |
| Expenses | Create and update transactions that represent your customers' spend. |
| Transfers | Create and update transactions that represent the movement of your customers' money. |
| Reimbursements | Create and update transactions that represent your customers' repayable spend. |
| Attachments | Attach receipts to a transaction for a complete audit trail. |
| Transaction status | Monitor the status of individual transactions in data syncs. |
| Manage data | Control and monitor the retrieval of data from an integration. |
| Push operations | View historic push operations. |
| Accounts | Create accounts and view account schemas. |
| Customers | Get, create, and update customers. |
| Suppliers | Get, create, and update suppliers. |
<!-- End Codat Tags Table -->
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
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
implementation 'io.codat:sync.expenses:1.0.0'
```

Maven:
```xml
<dependency>
    <groupId>io.codat</groupId>
    <artifactId>sync.expenses</artifactId>
    <version>1.0.0</version>
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [accounts()](docs/sdks/accounts/README.md)

* [create](docs/sdks/accounts/README.md#create) - Create account
* [getCreateModel](docs/sdks/accounts/README.md#getcreatemodel) - Get create account model

### [adjustments()](docs/sdks/adjustments/README.md)

* [create](docs/sdks/adjustments/README.md#create) - Create adjustment transaction

### [attachments()](docs/sdks/attachments/README.md)

* [upload](docs/sdks/attachments/README.md#upload) - Upload attachment

### [bankAccounts()](docs/sdks/bankaccounts/README.md)

* [create](docs/sdks/bankaccounts/README.md#create) - Create bank account
* [getCreateModel](docs/sdks/bankaccounts/README.md#getcreatemodel) - Get create bank account model


### [companies()](docs/sdks/companies/README.md)

* [create](docs/sdks/companies/README.md#create) - Create company
* [delete](docs/sdks/companies/README.md#delete) - Delete a company
* [get](docs/sdks/companies/README.md#get) - Get company
* [list](docs/sdks/companies/README.md#list) - List companies
* [update](docs/sdks/companies/README.md#update) - Update company

### [companyInfo()](docs/sdks/companyinfo/README.md)

* [get](docs/sdks/companyinfo/README.md#get) - Get company info

### [configuration()](docs/sdks/configuration/README.md)

* [get](docs/sdks/configuration/README.md#get) - Get company configuration
* [set](docs/sdks/configuration/README.md#set) - Set company configuration

### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [createPartnerExpenseConnection](docs/sdks/connections/README.md#createpartnerexpenseconnection) - Create partner expense connection
* [delete](docs/sdks/connections/README.md#delete) - Delete connection
* [get](docs/sdks/connections/README.md#get) - Get connection
* [list](docs/sdks/connections/README.md#list) - List connections
* [unlink](docs/sdks/connections/README.md#unlink) - Unlink connection

### [customers()](docs/sdks/customers/README.md)

* [create](docs/sdks/customers/README.md#create) - Create customer
* [get](docs/sdks/customers/README.md#get) - Get customer
* [list](docs/sdks/customers/README.md#list) - List customers
* [update](docs/sdks/customers/README.md#update) - Update customer

### [expenses()](docs/sdks/expenses/README.md)

* [create](docs/sdks/expenses/README.md#create) - Create expense transaction
* [update](docs/sdks/expenses/README.md#update) - Update expense transactions

### [manageData()](docs/sdks/managedata/README.md)

* [get](docs/sdks/managedata/README.md#get) - Get data status
* [getPullOperation](docs/sdks/managedata/README.md#getpulloperation) - Get pull operation
* [listPullOperations](docs/sdks/managedata/README.md#listpulloperations) - List pull operations
* [refreshAllDataTypes](docs/sdks/managedata/README.md#refreshalldatatypes) - Refresh all data
* [refreshDataType](docs/sdks/managedata/README.md#refreshdatatype) - Refresh data type

### [mappingOptions()](docs/sdks/mappingoptions/README.md)

* [getMappingOptions](docs/sdks/mappingoptions/README.md#getmappingoptions) - Mapping options

### [pushOperations()](docs/sdks/pushoperations/README.md)

* [get](docs/sdks/pushoperations/README.md#get) - Get push operation
* [list](docs/sdks/pushoperations/README.md#list) - List push operations

### [reimbursements()](docs/sdks/reimbursements/README.md)

* [create](docs/sdks/reimbursements/README.md#create) - Create reimbursable expense transaction
* [update](docs/sdks/reimbursements/README.md#update) - Update reimbursable expense transaction

### [suppliers()](docs/sdks/suppliers/README.md)

* [create](docs/sdks/suppliers/README.md#create) - Create supplier
* [get](docs/sdks/suppliers/README.md#get) - Get supplier
* [list](docs/sdks/suppliers/README.md#list) - List suppliers
* [update](docs/sdks/suppliers/README.md#update) - Update supplier

### [sync()](docs/sdks/sync/README.md)

* [get](docs/sdks/sync/README.md#get) - Get sync status
* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](docs/sdks/sync/README.md#getlatestsync) - Latest sync status
* [list](docs/sdks/sync/README.md#list) - List sync statuses

### [transactionStatus()](docs/sdks/transactionstatus/README.md)

* [get](docs/sdks/transactionstatus/README.md#get) - Get sync transaction
* [list](docs/sdks/transactionstatus/README.md#list) - List sync transactions

### [transfers()](docs/sdks/transfers/README.md)

* [create](docs/sdks/transfers/README.md#create) - Create transfer transaction

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import io.codat.sync.expenses.utils.BackoffStrategy;
import io.codat.sync.expenses.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import io.codat.sync.expenses.utils.BackoffStrategy;
import io.codat.sync.expenses.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
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
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .serverURL("https://api.codat.io")
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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

To authenticate with the API the `authHeader` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
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
