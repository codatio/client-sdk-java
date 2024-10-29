# ConnectionManagement
(*connectionManagement()*)

## Overview

Configure UI and retrieve access tokens for authentication used by **Connections SDK**.

### Available Operations

* [getAccessToken](#getaccesstoken) - Get access token

## getAccessToken

﻿Use the *Get access token* endpoint to retrieve a new access token for use with the [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management). The token is only valid for one hour and applies to a single company.

The embeddable [Connections SDK](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenRequest;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetConnectionManagementAccessTokenRequest req = GetConnectionManagementAccessTokenRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        GetConnectionManagementAccessTokenResponse res = sdk.connectionManagement().getAccessToken()
                .request(req)
                .call();

        if (res.connectionManagementAccessToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [GetConnectionManagementAccessTokenRequest](../../models/operations/GetConnectionManagementAccessTokenRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[GetConnectionManagementAccessTokenResponse](../../models/operations/GetConnectionManagementAccessTokenResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |