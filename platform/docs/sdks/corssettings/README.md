# CorsSettings
(*connectionManagement().corsSettings()*)

## Overview

### Available Operations

* [get](#get) - Get CORS settings
* [set](#set) - Set CORS settings

## get

﻿The *Get CORS settings* endpoint returns the allowed origins (i.e. your domains) you want to allow cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)) with Codat. 

Enabling CORS with Codat is required by our embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) to access Codat's API endpoints.

The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetConnectionManagementCorsSettingsResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetConnectionManagementCorsSettingsResponse res = sdk.connectionManagement().corsSettings().get()
                .call();

        if (res.connectionManagementAllowedOrigins().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetConnectionManagementCorsSettingsResponse](../../models/operations/GetConnectionManagementCorsSettingsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## set

﻿The *Set CORS settings* endpoint allows you to register allowed origins (i.e. your domains) for use in cross-origin resource sharing ([CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing)).
 
Enabling CORS with Codat is required by our embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) to access Codat's API endpoints. 

The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.SetConnectionManagementCorsSettingsResponse;
import io.codat.platform.models.shared.ConnectionManagementAllowedOrigins;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ConnectionManagementAllowedOrigins req = ConnectionManagementAllowedOrigins.builder()
                .allowedOrigins(List.of(
                    "https://www.bank-of-dave.com"))
                .build();

        SetConnectionManagementCorsSettingsResponse res = sdk.connectionManagement().corsSettings().set()
                .request(req)
                .call();

        if (res.connectionManagementAllowedOrigins().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ConnectionManagementAllowedOrigins](../../models/shared/ConnectionManagementAllowedOrigins.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[SetConnectionManagementCorsSettingsResponse](../../models/operations/SetConnectionManagementCorsSettingsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |