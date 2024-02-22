# Sync for Expenses

<!-- Start Codat Library Description -->
﻿Embedded accounting integrations for corporate card providers.
<!-- End Codat Library Description -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'io.codat.sync.expenses:openapi:0.1.0'
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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

* [create](docs/sdks/companies/README.md#create) - Create company
* [delete](docs/sdks/companies/README.md#delete) - Delete a company
* [get](docs/sdks/companies/README.md#get) - Get company
* [list](docs/sdks/companies/README.md#list) - List companies
* [update](docs/sdks/companies/README.md#update) - Update company

### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [createPartnerExpenseConnection](docs/sdks/connections/README.md#createpartnerexpenseconnection) - Create partner expense connection
* [delete](docs/sdks/connections/README.md#delete) - Delete connection
* [get](docs/sdks/connections/README.md#get) - Get connection
* [list](docs/sdks/connections/README.md#list) - List connections
* [unlink](docs/sdks/connections/README.md#unlink) - Unlink connection

### [accounts()](docs/sdks/accounts/README.md)

* [create](docs/sdks/accounts/README.md#create) - Create account
* [getCreateModel](docs/sdks/accounts/README.md#getcreatemodel) - Get create account model

### [customers()](docs/sdks/customers/README.md)

* [create](docs/sdks/customers/README.md#create) - Create customer
* [get](docs/sdks/customers/README.md#get) - Get customer
* [list](docs/sdks/customers/README.md#list) - List customers
* [update](docs/sdks/customers/README.md#update) - Update customer

### [suppliers()](docs/sdks/suppliers/README.md)

* [create](docs/sdks/suppliers/README.md#create) - Create supplier
* [get](docs/sdks/suppliers/README.md#get) - Get supplier
* [list](docs/sdks/suppliers/README.md#list) - List suppliers
* [update](docs/sdks/suppliers/README.md#update) - Update supplier

### [manageData()](docs/sdks/managedata/README.md)

* [get](docs/sdks/managedata/README.md#get) - Get data status
* [getPullOperation](docs/sdks/managedata/README.md#getpulloperation) - Get pull operation
* [listPullOperations](docs/sdks/managedata/README.md#listpulloperations) - List pull operations
* [refreshAllDataTypes](docs/sdks/managedata/README.md#refreshalldatatypes) - Refresh all data
* [refreshDataType](docs/sdks/managedata/README.md#refreshdatatype) - Refresh data type

### [pushOperations()](docs/sdks/pushoperations/README.md)

* [get](docs/sdks/pushoperations/README.md#get) - Get push operation
* [list](docs/sdks/pushoperations/README.md#list) - List push operations

### [configuration()](docs/sdks/configuration/README.md)

* [get](docs/sdks/configuration/README.md#get) - Get company configuration
* [getMappingOptions](docs/sdks/configuration/README.md#getmappingoptions) - Mapping options
* [set](docs/sdks/configuration/README.md#set) - Set company configuration

### [expenses()](docs/sdks/expenses/README.md)

* [create](docs/sdks/expenses/README.md#create) - Create expense transaction
* [update](docs/sdks/expenses/README.md#update) - Update expense-transactions
* [uploadAttachment](docs/sdks/expenses/README.md#uploadattachment) - Upload attachment

### [sync()](docs/sdks/sync/README.md)

* [get](docs/sdks/sync/README.md#get) - Get sync status
* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](docs/sdks/sync/README.md#getlatestsync) - Latest sync status
* [initiateSync](docs/sdks/sync/README.md#initiatesync) - Initiate sync
* [list](docs/sdks/sync/README.md#list) - List sync statuses

### [transactionStatus()](docs/sdks/transactionstatus/README.md)

* [get](docs/sdks/transactionstatus/README.md#get) - Get sync transaction
* [list](docs/sdks/transactionstatus/README.md#list) - List sync transactions
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import io.codat.sync.expenses.utils.BackoffStrategy;
import io.codat.sync.expenses.utils.RetryConfig;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import io.codat.sync.expenses.utils.BackoffStrategy;
import io.codat.sync.expenses.utils.RetryConfig;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

### Example

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .serverIndex(0)
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .serverURL("https://api.codat.io")
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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

To authenticate with the API the `authHeader` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.CompanyRequestBody;
import io.codat.sync.expenses.models.components.GroupItems;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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
