# Connections
(*connections()*)

## Overview

Create new and manage existing Sync for Commerce connections using the Sync flow UI.

### Available Operations

* [create](#create) - Create connection
* [getSyncFlowUrl](#getsyncflowurl) - Start new sync flow
* [list](#list) - List connections
* [updateAuthorization](#updateauthorization) - Update authorization
* [updateConnection](#updateconnection) - Update connection

## create

﻿Creates a connection for the company by providing a valid `platformKey`. 

Use the [List Integrations](https://docs.codat.io/sync-for-sync-for-commerce-api#/operations/list-integrations) endpoint to access valid platform keys. 

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.CreateConnectionRequest;
import io.codat.sync.commerce.models.operations.CreateConnectionRequestBody;
import io.codat.sync.commerce.models.operations.CreateConnectionResponse;
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

            CreateConnectionRequest req = CreateConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .requestBody(CreateConnectionRequestBody.builder()
                    .platformKey("gbol")
                    .build())
                .build();

            CreateConnectionResponse res = sdk.connections().create()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
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
| `request`                                                                                                              | [io.codat.sync.commerce.models.operations.CreateConnectionRequest](../../models/operations/CreateConnectionRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.CreateConnectionResponse>](../../models/operations/CreateConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getSyncFlowUrl

Create a new company and connections. Get a URL for Sync Flow, including a one time passcode.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetSyncFlowUrlRequest;
import io.codat.sync.commerce.models.operations.GetSyncFlowUrlResponse;
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

            GetSyncFlowUrlRequest req = GetSyncFlowUrlRequest.builder()
                .accountingKey("<value>")
                .commerceKey("<value>")
                .merchantIdentifier("<value>")
                .build();

            GetSyncFlowUrlResponse res = sdk.connections().getSyncFlowUrl()
                .request(req)
                .call();

            if (res.syncFlowUrl().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.sync.commerce.models.operations.GetSyncFlowUrlRequest](../../models/operations/GetSyncFlowUrlRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.GetSyncFlowUrlResponse>](../../models/operations/GetSyncFlowUrlResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

﻿List the connections for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.ListConnectionsRequest;
import io.codat.sync.commerce.models.operations.ListConnectionsResponse;
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

            ListConnectionsRequest req = ListConnectionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListConnectionsResponse res = sdk.connections().list()
                .request(req)
                .call();

            if (res.connections().isPresent()) {
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [io.codat.sync.commerce.models.operations.ListConnectionsRequest](../../models/operations/ListConnectionsRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.ListConnectionsResponse>](../../models/operations/ListConnectionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateAuthorization

Update data connection's authorization.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.UpdateConnectionAuthorizationRequest;
import io.codat.sync.commerce.models.operations.UpdateConnectionAuthorizationResponse;
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

            UpdateConnectionAuthorizationRequest req = UpdateConnectionAuthorizationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .requestBody(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .build();

            UpdateConnectionAuthorizationResponse res = sdk.connections().updateAuthorization()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
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
| `request`                                                                                                                                        | [io.codat.sync.commerce.models.operations.UpdateConnectionAuthorizationRequest](../../models/operations/UpdateConnectionAuthorizationRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.UpdateConnectionAuthorizationResponse>](../../models/operations/UpdateConnectionAuthorizationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateConnection

Update a data connection

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.DataConnectionStatus;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.components.UpdateConnection;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.UpdateConnectionRequest;
import io.codat.sync.commerce.models.operations.UpdateConnectionResponse;
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

            UpdateConnectionRequest req = UpdateConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .updateConnection(UpdateConnection.builder()
                    .status(DataConnectionStatus.DEAUTHORIZED)
                    .build())
                .build();

            UpdateConnectionResponse res = sdk.connections().updateConnection()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
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
| `request`                                                                                                              | [io.codat.sync.commerce.models.operations.UpdateConnectionRequest](../../models/operations/UpdateConnectionRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.sync.commerce.models.operations.UpdateConnectionResponse>](../../models/operations/UpdateConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
