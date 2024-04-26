# ConnectionManagement
(*connectionManagement()*)

## Overview

Configure connection management UI and retrieve access tokens for authentication.

### Available Operations

* [getAccessToken](#getaccesstoken) - Get access token

## getAccessToken

﻿Use the *Get access token* endpoint to retrieve a new access token for use by the [connection management UI](https://docs.codat.io/auth-flow/optimize/connection-management).

The embedded [connection management UI](https://docs.codat.io/auth-flow/optimize/connection-management) lets your customers control access to their data by allowing them to manage their existing connections.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenRequest;
import io.codat.platform.models.operations.GetConnectionManagementAccessTokenResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                             | [io.codat.platform.models.operations.GetConnectionManagementAccessTokenRequest](../../models/operations/GetConnectionManagementAccessTokenRequest.md) | :heavy_check_mark:                                                                                                                                    | The request object to use for the request.                                                                                                            |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetConnectionManagementAccessTokenResponse>](../../models/operations/GetConnectionManagementAccessTokenResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,404,429,500,503                  | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |
