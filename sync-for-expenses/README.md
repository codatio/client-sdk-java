# Sync for Expenses

<!-- Start Codat Library Description -->
﻿Embedded accounting integrations for corporate card providers.
<!-- End Codat Library Description -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'io.codat.sync_for_expenses:openapi:0.1.0'
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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
* [createPartnerExpenseConnection](docs/sdks/connections/README.md#createpartnerexpenseconnection) - Create partner expense connection
* [deleteConnection](docs/sdks/connections/README.md#deleteconnection) - Delete connection
* [getConnection](docs/sdks/connections/README.md#getconnection) - Get connection
* [listConnections](docs/sdks/connections/README.md#listconnections) - List connections
* [unlinkConnection](docs/sdks/connections/README.md#unlinkconnection) - Unlink connection

### [accounts()](docs/sdks/accounts/README.md)

* [createAccount](docs/sdks/accounts/README.md#createaccount) - Create account
* [getCreateChartOfAccountsModel](docs/sdks/accounts/README.md#getcreatechartofaccountsmodel) - Get create account model

### [customers()](docs/sdks/customers/README.md)

* [createCustomer](docs/sdks/customers/README.md#createcustomer) - Create customer
* [getCustomer](docs/sdks/customers/README.md#getcustomer) - Get customer
* [listCustomers](docs/sdks/customers/README.md#listcustomers) - List customers
* [updateCustomer](docs/sdks/customers/README.md#updatecustomer) - Update customer

### [suppliers()](docs/sdks/suppliers/README.md)

* [createSupplier](docs/sdks/suppliers/README.md#createsupplier) - Create supplier
* [getSupplier](docs/sdks/suppliers/README.md#getsupplier) - Get supplier
* [listSuppliers](docs/sdks/suppliers/README.md#listsuppliers) - List suppliers
* [updateSupplier](docs/sdks/suppliers/README.md#updatesupplier) - Update supplier

### [manageData()](docs/sdks/managedata/README.md)

* [getDataStatus](docs/sdks/managedata/README.md#getdatastatus) - Get data status
* [getPullOperation](docs/sdks/managedata/README.md#getpulloperation) - Get pull operation
* [listPullOperations](docs/sdks/managedata/README.md#listpulloperations) - List pull operations
* [refreshAllDataTypes](docs/sdks/managedata/README.md#refreshalldatatypes) - Refresh all data
* [refreshDataType](docs/sdks/managedata/README.md#refreshdatatype) - Refresh data type

### [pushOperations()](docs/sdks/pushoperations/README.md)

* [getPushOperation](docs/sdks/pushoperations/README.md#getpushoperation) - Get push operation
* [listPushOperations](docs/sdks/pushoperations/README.md#listpushoperations) - List push operations

### [configuration()](docs/sdks/configuration/README.md)

* [getCompanyConfiguration](docs/sdks/configuration/README.md#getcompanyconfiguration) - Get company configuration
* [getMappingOptions](docs/sdks/configuration/README.md#getmappingoptions) - Mapping options
* [setCompanyConfiguration](docs/sdks/configuration/README.md#setcompanyconfiguration) - Set company configuration

### [expenses()](docs/sdks/expenses/README.md)

* [createExpenseTransaction](docs/sdks/expenses/README.md#createexpensetransaction) - Create expense transaction
* [updateExpenseTransaction](docs/sdks/expenses/README.md#updateexpensetransaction) - Update expense-transactions
* [uploadExpenseAttachment](docs/sdks/expenses/README.md#uploadexpenseattachment) - Upload attachment

### [sync()](docs/sdks/sync/README.md)

* [getSyncById](docs/sdks/sync/README.md#getsyncbyid) - Get sync status
* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](docs/sdks/sync/README.md#getlatestsync) - Latest sync status
* [initiateSync](docs/sdks/sync/README.md#initiatesync) - Initiate sync
* [listSyncs](docs/sdks/sync/README.md#listsyncs) - List sync statuses

### [transactionStatus()](docs/sdks/transactionstatus/README.md)

* [getSyncTransaction](docs/sdks/transactionstatus/README.md#getsynctransaction) - Get sync transaction
* [listSyncTransactions](docs/sdks/transactionstatus/README.md#listsynctransactions) - List sync transactions
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

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .serverIndex(0)
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .serverURL("https://api.codat.io")
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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
