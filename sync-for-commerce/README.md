# Sync for Commerce

<!-- Start Codat Library Description -->
﻿Embedded accounting integrations for POS and eCommerce platforms.
<!-- End Codat Library Description -->

<!-- Start Summary [summary] -->
## Summary

Sync for Commerce: The API for Sync for Commerce. 

Sync for Commerce automatically replicates and reconciles sales data from a merchant’s source PoS, Payments, and eCommerce systems into their accounting software. This eliminates manual processing by merchants and transforms their ability to run and grow their business.
  
[Explore product](https://docs.codat.io/commerce/overview) | [See our OpenAPI spec](https://github.com/codatio/oas)

Not seeing the endpoints you're expecting? We've [reorganized our products](https://docs.codat.io/updates/230901-new-products), and you may be using a [different version of Sync for Commerce](https://docs.codat.io/sync-for-commerce-v1-api#/).

---

<!-- Start Codat Tags Table -->
## Endpoints

| Endpoints | Description |
| :- |:- |
| Connections | Create new and manage existing data connections for a company. |
| Sync | Initiate data syncs and monitor their status. |
| Sync flow settings | Control text and visibility settings for the Sync Flow. |
| Integrations | Get a list of integrations supported by Sync for Commerce and their logos. |
| Advanced controls | View and manage mapping configured for a company's commerce sync. |
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
implementation 'io.codat:sync.commerce:0.3.0'
```

Maven:
```xml
<dependency>
    <groupId>io.codat</groupId>
    <artifactId>sync.commerce</artifactId>
    <version>0.3.0</version>
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

        if (res.localizationInfo().isPresent()) {
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

### [advancedControls()](docs/sdks/advancedcontrols/README.md)

* [createCompany](docs/sdks/advancedcontrols/README.md#createcompany) - Create company
* [getConfiguration](docs/sdks/advancedcontrols/README.md#getconfiguration) - Get company configuration
* [listCompanies](docs/sdks/advancedcontrols/README.md#listcompanies) - List companies
* [setConfiguration](docs/sdks/advancedcontrols/README.md#setconfiguration) - Set configuration


### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [getSyncFlowUrl](docs/sdks/connections/README.md#getsyncflowurl) - Start new sync flow
* [list](docs/sdks/connections/README.md#list) - List connections
* [updateAuthorization](docs/sdks/connections/README.md#updateauthorization) - Update authorization
* [updateConnection](docs/sdks/connections/README.md#updateconnection) - Update connection

### [integrations()](docs/sdks/integrations/README.md)

* [getBranding](docs/sdks/integrations/README.md#getbranding) - Get branding for an integration
* [list](docs/sdks/integrations/README.md#list) - List integrations

### [sync()](docs/sdks/sync/README.md)

* [get](docs/sdks/sync/README.md#get) - Get sync status
* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](docs/sdks/sync/README.md#getlatestsync) - Latest sync status
* [getStatus](docs/sdks/sync/README.md#getstatus) - Get sync status
* [list](docs/sdks/sync/README.md#list) - List sync statuses
* [request](docs/sdks/sync/README.md#request) - Initiate new sync
* [requestForDateRange](docs/sdks/sync/README.md#requestfordaterange) - Initiate sync for specific range

### [syncFlowSettings()](docs/sdks/syncflowsettings/README.md)

* [getConfigTextSyncFlow](docs/sdks/syncflowsettings/README.md#getconfigtextsyncflow) - Get preferences for text fields
* [getVisibleAccounts](docs/sdks/syncflowsettings/README.md#getvisibleaccounts) - List visible accounts
* [updateConfigTextSyncFlow](docs/sdks/syncflowsettings/README.md#updateconfigtextsyncflow) - Update preferences for text fields
* [updateVisibleAccountsSyncFlow](docs/sdks/syncflowsettings/README.md#updatevisibleaccountssyncflow) - Update visible accounts

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import io.codat.sync.commerce.utils.BackoffStrategy;
import io.codat.sync.commerce.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
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

        if (res.localizationInfo().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import io.codat.sync.commerce.utils.BackoffStrategy;
import io.codat.sync.commerce.utils.RetryConfig;
import java.lang.Exception;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
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

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

        if (res.localizationInfo().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `getConfigTextSyncFlow` method throws the following exceptions:

| Error Type                 | Status Code                  | Content Type     |
| -------------------------- | ---------------------------- | ---------------- |
| models/errors/ErrorMessage | 401, 402, 403, 429, 500, 503 | application/json |
| models/errors/SDKError     | 4XX, 5XX                     | \*/\*            |

### Example

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

        if (res.localizationInfo().isPresent()) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .serverURL("https://api.codat.io")
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

        if (res.localizationInfo().isPresent()) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

        GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

        if (res.localizationInfo().isPresent()) {
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
