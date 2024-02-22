# Sync for Commerce

<!-- Start Codat Library Description -->
﻿Embedded accounting integrations for POS and eCommerce platforms.
<!-- End Codat Library Description -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'io.codat.sync.commerce:openapi:0.1.0'
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

### [syncFlowSettings()](docs/sdks/syncflowsettings/README.md)

* [getConfigTextSyncFlow](docs/sdks/syncflowsettings/README.md#getconfigtextsyncflow) - Get preferences for text fields
* [getVisibleAccounts](docs/sdks/syncflowsettings/README.md#getvisibleaccounts) - List visible accounts
* [updateConfigTextSyncFlow](docs/sdks/syncflowsettings/README.md#updateconfigtextsyncflow) - Update preferences for text fields
* [updateVisibleAccountsSyncFlow](docs/sdks/syncflowsettings/README.md#updatevisibleaccountssyncflow) - Update visible accounts

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

### [sync()](docs/sdks/sync/README.md)

* [get](docs/sdks/sync/README.md#get) - Get sync status
* [getLastSuccessfulSync](docs/sdks/sync/README.md#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](docs/sdks/sync/README.md#getlatestsync) - Latest sync status
* [getStatus](docs/sdks/sync/README.md#getstatus) - Get sync status
* [list](docs/sdks/sync/README.md#list) - List sync statuses
* [request](docs/sdks/sync/README.md#request) - Initiate new sync
* [requestForDateRange](docs/sdks/sync/README.md#requestfordaterange) - Initiate sync for specific range

### [integrations()](docs/sdks/integrations/README.md)

* [getBranding](docs/sdks/integrations/README.md#getbranding) - Get branding for an integration
* [list](docs/sdks/integrations/README.md#list) - List integrations
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import io.codat.sync.commerce.utils.BackoffStrategy;
import io.codat.sync.commerce.utils.RetryConfig;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import io.codat.sync.commerce.utils.BackoffStrategy;
import io.codat.sync.commerce.utils.RetryConfig;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .serverIndex(0)
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
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
