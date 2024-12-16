# Bank Feeds

<!-- Start Codat Library Description -->
﻿Bank Feeds API enables your SMB users to set up bank feeds from accounts in your application to supported accounting platforms.
<!-- End Codat Library Description -->

<!-- Start Summary [summary] -->
## Summary

Bank Feeds API: Bank Feeds API enables your SMB users to set up bank feeds from accounts in your application to supported accounting software.

A bank feed is a connection between a source bank account in your application and a target bank account in a supported accounting software.

[Explore product](https://docs.codat.io/bank-feeds-api/overview) | [See OpenAPI spec](https://github.com/codatio/oas)

---
<!-- Start Codat Tags Table -->
## Endpoints

| Endpoints | Description |
| :- |:- |
| Companies | Create and manage your SMB users' companies. |
| Connections | Create new and manage existing data connections for a company. |
| Source accounts | Provide and manage lists of source bank accounts. |
| Account mapping | Extra functionality for building an account management UI. |
| Company information | Get detailed information about a company from the underlying platform. |
| Transactions | Create new bank account transactions for a company's connections, and see previous operations. |
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
implementation 'io.codat:bank-feeds:3.0.0'
```

Maven:
```xml
<dependency>
    <groupId>io.codat</groupId>
    <artifactId>bank-feeds</artifactId>
    <version>3.0.0</version>
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

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyReference;
import io.codat.bank_feeds.models.components.CompanyReferenceLinks;
import io.codat.bank_feeds.models.components.SourceAccount;
import io.codat.bank_feeds.models.components.SourceAccountWebhook;
import io.codat.bank_feeds.models.components.SourceAccountWebhookPayload;
import io.codat.bank_feeds.models.components.SourceAccountWebhookPayloadSourceAccount;
import io.codat.bank_feeds.models.components.Status;
import io.codat.bank_feeds.models.webhooks.BankFeedsSourceAccountConnectedResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
            .build();

        SourceAccountWebhook req = SourceAccountWebhook.builder()
                .eventType("bankFeeds.sourceAccount.connected")
                .generatedDate("2022-10-23T00:00:00Z")
                .id("ba29118f-5406-4e59-b05c-ba307ca38d01")
                .payload(SourceAccountWebhookPayload.builder()
                    .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                    .referenceCompany(CompanyReference.builder()
                        .description("Requested early access to the new financing scheme.")
                        .id("0498e921-9b53-4396-a412-4f2f5983b0a2")
                        .links(CompanyReferenceLinks.builder()
                            .portal("https://app.codat.io/companies/0498e921-9b53-4396-a412-4f2f5983b0a2/summary")
                            .build())
                        .name("Toft stores")
                        .build())
                    .sourceAccount(SourceAccountWebhookPayloadSourceAccount.of(SourceAccount.builder()
                        .id("acc-002")
                        .accountName("account-081")
                        .accountNumber("12345678")
                        .balance(new BigDecimal("99.99"))
                        .currency("GBP")
                        .modifiedDate("2023-01-09T14:14:14.105Z")
                        .sortCode("040004")
                        .status(Status.PENDING)
                        .build()))
                    .build())
                .build();

        BankFeedsSourceAccountConnectedResponse res = sdk.bankFeedsSourceAccountConnected()
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

### [accountMapping()](docs/sdks/accountmapping/README.md)

* [create](docs/sdks/accountmapping/README.md#create) - Create bank feed account mapping
* [get](docs/sdks/accountmapping/README.md#get) - List bank feed accounts

### [bankAccounts()](docs/sdks/bankaccounts/README.md)

* [create](docs/sdks/bankaccounts/README.md#create) - Create bank account
* [getCreateModel](docs/sdks/bankaccounts/README.md#getcreatemodel) - Get create/update bank account model
* [list](docs/sdks/bankaccounts/README.md#list) - List bank accounts


### [companies()](docs/sdks/companies/README.md)

* [create](docs/sdks/companies/README.md#create) - Create company
* [delete](docs/sdks/companies/README.md#delete) - Delete a company
* [get](docs/sdks/companies/README.md#get) - Get company
* [getAccessToken](docs/sdks/companies/README.md#getaccesstoken) - Get company access token
* [list](docs/sdks/companies/README.md#list) - List companies
* [update](docs/sdks/companies/README.md#update) - Update company

### [companyInformation()](docs/sdks/companyinformation/README.md)

* [get](docs/sdks/companyinformation/README.md#get) - Get company information

### [configuration()](docs/sdks/configuration/README.md)

* [get](docs/sdks/configuration/README.md#get) - Get configuration
* [set](docs/sdks/configuration/README.md#set) - Set configuration

### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [delete](docs/sdks/connections/README.md#delete) - Delete connection
* [get](docs/sdks/connections/README.md#get) - Get connection
* [list](docs/sdks/connections/README.md#list) - List connections
* [unlink](docs/sdks/connections/README.md#unlink) - Unlink connection

### [sourceAccounts()](docs/sdks/sourceaccounts/README.md)

* [create](docs/sdks/sourceaccounts/README.md#create) - Create single source account
* [createBatch](docs/sdks/sourceaccounts/README.md#createbatch) - Create source accounts
* [delete](docs/sdks/sourceaccounts/README.md#delete) - Delete source account
* [deleteCredentials](docs/sdks/sourceaccounts/README.md#deletecredentials) - Delete all source account credentials
* [generateCredentials](docs/sdks/sourceaccounts/README.md#generatecredentials) - Generate source account credentials
* [list](docs/sdks/sourceaccounts/README.md#list) - List source accounts
* [update](docs/sdks/sourceaccounts/README.md#update) - Update source account

### [sync()](docs/sdks/sync/README.md)

* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Get last successful sync

### [transactions()](docs/sdks/transactions/README.md)

* [create](docs/sdks/transactions/README.md#create) - Create bank transactions
* [getCreateModel](docs/sdks/transactions/README.md#getcreatemodel) - Get create bank transactions model
* [getCreateOperation](docs/sdks/transactions/README.md#getcreateoperation) - Get create operation
* [listCreateOperations](docs/sdks/transactions/README.md#listcreateoperations) - List create operations

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import io.codat.bank_feeds.utils.BackoffStrategy;
import io.codat.bank_feeds.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import io.codat.bank_feeds.utils.BackoffStrategy;
import io.codat.bank_feeds.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
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

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .serverURL("https://api.codat.io")
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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

To authenticate with the API the `authHeader` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.errors.ErrorMessage;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
