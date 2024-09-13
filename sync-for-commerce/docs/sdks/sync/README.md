# Sync
(*sync()*)

## Overview

Initiate data syncs and monitor their status.

### Available Operations

* [get](#get) - Get sync status
* [getLastSuccessfulSync](#getlastsuccessfulsync) - Last successful sync
* [getLatestSync](#getlatestsync) - Latest sync status
* [getStatus](#getstatus) - Get sync status
* [list](#list) - List sync statuses
* [request](#request) - Initiate new sync
* [requestForDateRange](#requestfordaterange) - Initiate sync for specific range

## get

Get the sync status for a specified sync

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetSyncByIdRequest;
import io.codat.sync.commerce.models.operations.GetSyncByIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetSyncByIdRequest req = GetSyncByIdRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncId("6fb40d5e-b13e-11ed-afa1-0242ac120002")
                .build();

            GetSyncByIdResponse res = sdk.sync().get()
                .request(req)
                .call();

            if (res.companySyncStatus().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetSyncByIdRequest](../../models/operations/GetSyncByIdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetSyncByIdResponse](../../models/operations/GetSyncByIdResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getLastSuccessfulSync

Gets the status of the last successful sync

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetLastSuccessfulSyncRequest;
import io.codat.sync.commerce.models.operations.GetLastSuccessfulSyncResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetLastSuccessfulSyncRequest req = GetLastSuccessfulSyncRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetLastSuccessfulSyncResponse res = sdk.sync().getLastSuccessfulSync()
                .request(req)
                .call();

            if (res.companySyncStatus().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetLastSuccessfulSyncRequest](../../models/operations/GetLastSuccessfulSyncRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetLastSuccessfulSyncResponse](../../models/operations/GetLastSuccessfulSyncResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getLatestSync

Gets the latest sync status

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetLatestSyncRequest;
import io.codat.sync.commerce.models.operations.GetLatestSyncResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetLatestSyncRequest req = GetLatestSyncRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetLatestSyncResponse res = sdk.sync().getLatestSync()
                .request(req)
                .call();

            if (res.companySyncStatus().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLatestSyncRequest](../../models/operations/GetLatestSyncRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLatestSyncResponse](../../models/operations/GetLatestSyncResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getStatus

Gets a list of sync statuses.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetSyncStatusRequest;
import io.codat.sync.commerce.models.operations.GetSyncStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetSyncStatusRequest req = GetSyncStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetSyncStatusResponse res = sdk.sync().getStatus()
                .request(req)
                .call();

            if (res.syncStatus().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSyncStatusRequest](../../models/operations/GetSyncStatusRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSyncStatusResponse](../../models/operations/GetSyncStatusResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

Gets a list of sync statuses

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.ListSyncsRequest;
import io.codat.sync.commerce.models.operations.ListSyncsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListSyncsRequest req = ListSyncsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            ListSyncsResponse res = sdk.sync().list()
                .request(req)
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListSyncsRequest](../../models/operations/ListSyncsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListSyncsResponse](../../models/operations/ListSyncsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## request

Run a Commerce sync from the last successful sync up to the date provided (optional), otherwise UtcNow is used.\r\nIf there was no previously successful sync, the start date in the config is used.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.SyncToLatestArgs;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.RequestSyncRequest;
import io.codat.sync.commerce.models.operations.RequestSyncResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            RequestSyncRequest req = RequestSyncRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncToLatestArgs(SyncToLatestArgs.builder()
                    .syncTo("2022-10-23T00:00:00Z")
                    .build())
                .build();

            RequestSyncResponse res = sdk.sync().request()
                .request(req)
                .call();

            if (res.syncSummary().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RequestSyncRequest](../../models/operations/RequestSyncRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RequestSyncResponse](../../models/operations/RequestSyncResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## requestForDateRange

Initiate a sync for the specified start date to the specified finish date in the request payload.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.DateRange;
import io.codat.sync.commerce.models.components.SyncRange;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.RequestSyncForDateRangeRequest;
import io.codat.sync.commerce.models.operations.RequestSyncForDateRangeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            RequestSyncForDateRangeRequest req = RequestSyncForDateRangeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncRange(SyncRange.builder()
                    .dateRange(DateRange.builder()
                        .finish("2022-10-23T00:00:00Z")
                        .start("2022-10-23T00:00:00Z")
                        .build())
                    .build())
                .build();

            RequestSyncForDateRangeResponse res = sdk.sync().requestForDateRange()
                .request(req)
                .call();

            if (res.syncSummary().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RequestSyncForDateRangeRequest](../../models/operations/RequestSyncForDateRangeRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RequestSyncForDateRangeResponse](../../models/operations/RequestSyncForDateRangeResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
