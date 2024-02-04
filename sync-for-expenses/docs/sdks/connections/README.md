# Connections
(*connections()*)

## Overview

Create and manage partner expense connection.

### Available Operations

* [createConnection](#createconnection) - Create connection
* [createPartnerExpenseConnection](#createpartnerexpenseconnection) - Create partner expense connection
* [deleteConnection](#deleteconnection) - Delete connection
* [getConnection](#getconnection) - Get connection
* [listConnections](#listconnections) - List connections
* [unlinkConnection](#unlinkconnection) - Unlink connection

## createConnection

﻿Creates a connection for the company by providing a valid `platformKey`. 

Use the [List Integrations](https://docs.codat.io/sync-for-expenses-api#/operations/list-integrations) endpoint to access valid platform keys. 

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateConnectionRequest;
import io.codat.sync_for_expenses.models.operations.CreateConnectionRequestBody;
import io.codat.sync_for_expenses.models.operations.CreateConnectionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CreateConnectionRequest req = CreateConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .requestBody(CreateConnectionRequestBody.builder()
                    .platformKey("gbol")
                    .build())
                .build();

            CreateConnectionResponse res = sdk.connections().createConnection()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.sync_for_expenses.models.operations.CreateConnectionRequest](../../models/operations/CreateConnectionRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.CreateConnectionResponse>](../../models/operations/CreateConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## createPartnerExpenseConnection

Creates a partner expense data connection

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreatePartnerExpenseConnectionRequest;
import io.codat.sync_for_expenses.models.operations.CreatePartnerExpenseConnectionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CreatePartnerExpenseConnectionRequest req = CreatePartnerExpenseConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            CreatePartnerExpenseConnectionResponse res = sdk.connections().createPartnerExpenseConnection()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [io.codat.sync_for_expenses.models.operations.CreatePartnerExpenseConnectionRequest](../../models/operations/CreatePartnerExpenseConnectionRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.CreatePartnerExpenseConnectionResponse>](../../models/operations/CreatePartnerExpenseConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## deleteConnection

﻿Revoke and remove a connection from a company.
This operation is not reversible. The end user would need to reauthorize a new data connection if you wish to view new data for this company.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.DeleteConnectionRequest;
import io.codat.sync_for_expenses.models.operations.DeleteConnectionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            DeleteConnectionRequest req = DeleteConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            DeleteConnectionResponse res = sdk.connections().deleteConnection()
                .request(req)
                .call();

            // handle response

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.sync_for_expenses.models.operations.DeleteConnectionRequest](../../models/operations/DeleteConnectionRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.DeleteConnectionResponse>](../../models/operations/DeleteConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getConnection

﻿Returns a specific connection for a company when valid identifiers are provided. If the identifiers are for a deleted company and/or connection, a not found response is returned.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetConnectionRequest;
import io.codat.sync_for_expenses.models.operations.GetConnectionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetConnectionRequest req = GetConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetConnectionResponse res = sdk.connections().getConnection()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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
| `request`                                                                                                            | [io.codat.sync_for_expenses.models.operations.GetConnectionRequest](../../models/operations/GetConnectionRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetConnectionResponse>](../../models/operations/GetConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listConnections

﻿List the connections for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.ListConnectionsRequest;
import io.codat.sync_for_expenses.models.operations.ListConnectionsResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListConnectionsRequest req = ListConnectionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListConnectionsResponse res = sdk.connections().listConnections()
                .request(req)
                .call();

            if (res.connections().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [io.codat.sync_for_expenses.models.operations.ListConnectionsRequest](../../models/operations/ListConnectionsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.ListConnectionsResponse>](../../models/operations/ListConnectionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## unlinkConnection

﻿This allows you to deauthorize a connection, without deleting it from Codat. This means you can still view any data that has previously been pulled into Codat, and also lets you re-authorize in future if your customer wishes to resume sharing their data.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.UnlinkConnectionRequest;
import io.codat.sync_for_expenses.models.operations.UnlinkConnectionResponse;
import io.codat.sync_for_expenses.models.operations.UnlinkConnectionUpdateConnection;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.DataConnectionStatus;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UnlinkConnectionRequest req = UnlinkConnectionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .requestBody(UnlinkConnectionUpdateConnection.builder()
                    .status(DataConnectionStatus.PENDING_AUTH)
                    .build())
                .build();

            UnlinkConnectionResponse res = sdk.connections().unlinkConnection()
                .request(req)
                .call();

            if (res.connection().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.sync_for_expenses.models.operations.UnlinkConnectionRequest](../../models/operations/UnlinkConnectionRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.UnlinkConnectionResponse>](../../models/operations/UnlinkConnectionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
