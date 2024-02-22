# Integrations
(*integrations()*)

## Overview

View useful information about codat's integrations.

### Available Operations

* [getBranding](#getbranding) - Get branding for an integration
* [list](#list) - List integrations

## getBranding

Retrieve Integration branding assets.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetIntegrationBrandingRequest;
import io.codat.sync.commerce.models.operations.GetIntegrationBrandingResponse;
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

            GetIntegrationBrandingRequest req = GetIntegrationBrandingRequest.builder()
                .platformKey("gbol")
                .build();

            GetIntegrationBrandingResponse res = sdk.integrations().getBranding()
                .request(req)
                .call();

            if (res.branding().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [io.codat.sync.commerce.models.operations.GetIntegrationBrandingRequest](../../models/operations/GetIntegrationBrandingRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.GetIntegrationBrandingResponse>](../../models/operations/GetIntegrationBrandingResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

Retrieve a list of available integrations support by data type and state of release.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.ListIntegrationsRequest;
import io.codat.sync.commerce.models.operations.ListIntegrationsResponse;
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

            ListIntegrationsRequest req = ListIntegrationsRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListIntegrationsResponse res = sdk.integrations().list()
                .request(req)
                .call();

            if (res.integrations().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [io.codat.sync.commerce.models.operations.ListIntegrationsRequest](../../models/operations/ListIntegrationsRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.ListIntegrationsResponse>](../../models/operations/ListIntegrationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
