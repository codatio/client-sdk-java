# Connections
(*connections()*)

## Overview

Create new and manage existing data connections for a company.

### Available Operations

* [create](#create) - Create connection
* [delete](#delete) - Delete connection
* [get](#get) - Get connection
* [list](#list) - List connections
* [unlink](#unlink) - Unlink connection

## create

﻿Creates a connection for the company by providing a valid `platformKey`. 

Use the [List Integrations](https://docs.codat.io/sync-for-payables-api#/operations/list-integrations) endpoint to access valid platform keys. 

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.CreateConnectionRequest;
import io.codat.sync.payables.models.operations.CreateConnectionRequestBody;
import io.codat.sync.payables.models.operations.CreateConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
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
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateConnectionRequest](../../models/operations/CreateConnectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateConnectionResponse](../../models/operations/CreateConnectionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## delete

﻿Revoke and remove a connection from a company.
This operation is not reversible. The end user would need to reauthorize a new data connection if you wish to view new data for this company.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.DeleteConnectionRequest;
import io.codat.sync.payables.models.operations.DeleteConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        DeleteConnectionRequest req = DeleteConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        DeleteConnectionResponse res = sdk.connections().delete()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteConnectionRequest](../../models/operations/DeleteConnectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteConnectionResponse](../../models/operations/DeleteConnectionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## get

﻿Returns a specific connection for a company when valid identifiers are provided. If the identifiers are for a deleted company and/or connection, a not found response is returned.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.GetConnectionRequest;
import io.codat.sync.payables.models.operations.GetConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetConnectionRequest req = GetConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetConnectionResponse res = sdk.connections().get()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetConnectionRequest](../../models/operations/GetConnectionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetConnectionResponse](../../models/operations/GetConnectionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

﻿List the connections for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.ListConnectionsRequest;
import io.codat.sync.payables.models.operations.ListConnectionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListConnectionsRequest req = ListConnectionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListConnectionsResponse res = sdk.connections().list()
                .request(req)
                .call();

        if (res.connections().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListConnectionsRequest](../../models/operations/ListConnectionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListConnectionsResponse](../../models/operations/ListConnectionsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## unlink

﻿This allows you to deauthorize a connection, without deleting it from Codat. This means you can still view any data that has previously been pulled into Codat, and also lets you re-authorize in future if your customer wishes to resume sharing their data.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.UnlinkConnectionRequest;
import io.codat.sync.payables.models.operations.UnlinkConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UnlinkConnectionRequest req = UnlinkConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        UnlinkConnectionResponse res = sdk.connections().unlink()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UnlinkConnectionRequest](../../models/operations/UnlinkConnectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UnlinkConnectionResponse](../../models/operations/UnlinkConnectionResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |