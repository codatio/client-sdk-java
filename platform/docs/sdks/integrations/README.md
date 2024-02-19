# Integrations
(*integrations()*)

## Overview

View and manage your available integrations in Codat.

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
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetIntegrationRequest;
import io.codat.platform.models.operations.GetIntegrationResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.platform.models.operations.GetIntegrationRequest](../../models/operations/GetIntegrationRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetIntegrationResponse>](../../models/operations/GetIntegrationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getBranding

Get branding for platform.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetIntegrationsBrandingRequest;
import io.codat.platform.models.operations.GetIntegrationsBrandingResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [io.codat.platform.models.operations.GetIntegrationsBrandingRequest](../../models/operations/GetIntegrationsBrandingRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetIntegrationsBrandingResponse>](../../models/operations/GetIntegrationsBrandingResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

List your available integrations

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListIntegrationsRequest;
import io.codat.platform.models.operations.ListIntegrationsResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [io.codat.platform.models.operations.ListIntegrationsRequest](../../models/operations/ListIntegrationsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.platform.models.operations.ListIntegrationsResponse>](../../models/operations/ListIntegrationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
