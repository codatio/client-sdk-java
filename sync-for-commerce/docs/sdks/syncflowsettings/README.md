# SyncFlowSettings
(*syncFlowSettings()*)

## Overview

Control text and visibility settings for the Sync Flow.

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
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetConfigTextSyncFlowRequest](../../models/operations/GetConfigTextSyncFlowRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetConfigTextSyncFlowResponse](../../models/operations/GetConfigTextSyncFlowResponse.md)**

### Errors

| Error Object               | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/ErrorMessage | 401,402,403,429,500,503    | application/json           |
| models/errors/SDKError     | 4xx-5xx                    | \*\/*                      |


## getVisibleAccounts

Return accounts which are visible on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetVisibleAccountsRequest;
import io.codat.sync.commerce.models.operations.GetVisibleAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetVisibleAccountsRequest](../../models/operations/GetVisibleAccountsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetVisibleAccountsResponse](../../models/operations/GetVisibleAccountsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## updateConfigTextSyncFlow

Set preferences for the text fields on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.UpdateConfigTextSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateConfigTextSyncFlowRequest req = UpdateConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

            UpdateConfigTextSyncFlowResponse res = sdk.syncFlowSettings().updateConfigTextSyncFlow()
                .request(req)
                .call();

            if (res.localizationInfo().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateConfigTextSyncFlowRequest](../../models/operations/UpdateConfigTextSyncFlowRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateConfigTextSyncFlowResponse](../../models/operations/UpdateConfigTextSyncFlowResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 400,401,402,403,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## updateVisibleAccountsSyncFlow

Update which accounts are visible on sync flow.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowRequest;
import io.codat.sync.commerce.models.operations.UpdateVisibleAccountsSyncFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateVisibleAccountsSyncFlowRequest req = UpdateVisibleAccountsSyncFlowRequest.builder()
                .platformKey("gbol")
                .build();

            UpdateVisibleAccountsSyncFlowResponse res = sdk.syncFlowSettings().updateVisibleAccountsSyncFlow()
                .request(req)
                .call();

            if (res.visibleAccounts().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateVisibleAccountsSyncFlowRequest](../../models/operations/UpdateVisibleAccountsSyncFlowRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateVisibleAccountsSyncFlowResponse](../../models/operations/UpdateVisibleAccountsSyncFlowResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
