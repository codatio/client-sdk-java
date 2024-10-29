# Integrations
(*integrations()*)

## Overview

Get a list of integrations supported by Codat and their logos.

### Available Operations

* [get](#get) - Get integration
* [getBranding](#getbranding) - Get branding
* [list](#list) - List integrations

## get

Get single integration, by platformKey

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetIntegrationRequest;
import io.codat.platform.models.operations.GetIntegrationResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetIntegrationRequest req = GetIntegrationRequest.builder()
                .platformKey("gbol")
                .build();

        GetIntegrationResponse res = sdk.integrations().get()
                .request(req)
                .call();

        if (res.integration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetIntegrationRequest](../../models/operations/GetIntegrationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetIntegrationResponse](../../models/operations/GetIntegrationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getBranding

Get branding for platform.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetIntegrationsBrandingRequest;
import io.codat.platform.models.operations.GetIntegrationsBrandingResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetIntegrationsBrandingRequest req = GetIntegrationsBrandingRequest.builder()
                .platformKey("gbol")
                .build();

        GetIntegrationsBrandingResponse res = sdk.integrations().getBranding()
                .request(req)
                .call();

        if (res.branding().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetIntegrationsBrandingRequest](../../models/operations/GetIntegrationsBrandingRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetIntegrationsBrandingResponse](../../models/operations/GetIntegrationsBrandingResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

List your available integrations

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ListIntegrationsRequest;
import io.codat.platform.models.operations.ListIntegrationsResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
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