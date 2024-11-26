# Integrations
(*integrations()*)

## Overview

Get a list of integrations supported by Sync for Commerce and their logos.

### Available Operations

* [getBranding](#getbranding) - Get branding for an integration
* [list](#list) - List integrations

## getBranding

Retrieve Integration branding assets.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.GetIntegrationBrandingRequest;
import io.codat.sync.commerce.models.operations.GetIntegrationBrandingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

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
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetIntegrationBrandingRequest](../../models/operations/GetIntegrationBrandingRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetIntegrationBrandingResponse](../../models/operations/GetIntegrationBrandingResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

Retrieve a list of available integrations support by data type and state of release.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.ErrorMessage;
import io.codat.sync.commerce.models.operations.ListIntegrationsRequest;
import io.codat.sync.commerce.models.operations.ListIntegrationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListIntegrationsRequest req = ListIntegrationsRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListIntegrationsResponse res = sdk.integrations().list()
                .request(req)
                .call();

        if (res.integrations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListIntegrationsRequest](../../models/operations/ListIntegrationsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListIntegrationsResponse](../../models/operations/ListIntegrationsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 400, 401, 402, 403, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |