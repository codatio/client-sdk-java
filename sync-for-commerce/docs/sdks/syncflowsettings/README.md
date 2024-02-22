# SyncFlowSettings
(*syncFlowSettings()*)

## Overview

Configure preferences for any given Sync for Commerce company using sync flow.

### Available Operations

* [getConfigTextSyncFlow](#getconfigtextsyncflow) - Get preferences for text fields
* [getVisibleAccounts](#getvisibleaccounts) - List visible accounts
* [updateConfigTextSyncFlow](#updateconfigtextsyncflow) - Update preferences for text fields
* [updateVisibleAccountsSyncFlow](#updatevisibleaccountssyncflow) - Update visible accounts

## getConfigTextSyncFlow

Return preferences set for the text fields on sync flow.

### Example Usage

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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest](../../models/operations/GetConfigTextSyncFlowRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse>](../../models/operations/GetConfigTextSyncFlowResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getVisibleAccounts

Return accounts which are visible on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetVisibleAccountsRequest;
import io.codat.sync.commerce.models.operations.GetVisibleAccountsResponse;
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

            GetVisibleAccountsRequest req = GetVisibleAccountsRequest.builder()
                .clientId("86fe9741-738d-4f2c-8e96-9c3f84156e91")
                .platformKey("gbol")
                .build();

            GetVisibleAccountsResponse res = sdk.syncFlowSettings().getVisibleAccounts()
                .request(req)
                .call();

            if (res.visibleAccounts().isPresent()) {
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

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.sync.commerce.models.operations.GetVisibleAccountsRequest](../../models/operations/GetVisibleAccountsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.GetVisibleAccountsResponse>](../../models/operations/GetVisibleAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateConfigTextSyncFlow

Set preferences for the text fields on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Localization;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowResponse;
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

            UpdateConfigTextSyncFlowRequest req = UpdateConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .requestBody(java.util.Map.ofEntries(
                    entry("key", Localization.builder()
                        .build())))
                .build();

            UpdateConfigTextSyncFlowResponse res = sdk.syncFlowSettings().updateConfigTextSyncFlow()
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowRequest](../../models/operations/UpdateConfigTextSyncFlowRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowResponse>](../../models/operations/UpdateConfigTextSyncFlowResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateVisibleAccountsSyncFlow

Update which accounts are visible on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.components.VisibleAccounts;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowRequest;
import io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowResponse;
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

            UpdateVisibleAccountsSyncFlowRequest req = UpdateVisibleAccountsSyncFlowRequest.builder()
                .platformKey("gbol")
                .visibleAccounts(VisibleAccounts.builder()
                    .visibleAccounts(java.util.List.of(
                        "<value>"))
                    .build())
                .build();

            UpdateVisibleAccountsSyncFlowResponse res = sdk.syncFlowSettings().updateVisibleAccountsSyncFlow()
                .request(req)
                .call();

            if (res.visibleAccounts().isPresent()) {
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

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowRequest](../../models/operations/UpdateVisibleAccountsSyncFlowRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowResponse>](../../models/operations/UpdateVisibleAccountsSyncFlowResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
