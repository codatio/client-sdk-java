# ManageData
(*manageData()*)

## Overview

Control and monitor the retrieval of data from an integration.

### Available Operations

* [get](#get) - Get data status
* [getPullOperation](#getpulloperation) - Get pull operation
* [listPullOperations](#listpulloperations) - List pull operations
* [refreshAllDataTypes](#refreshalldatatypes) - Refresh all data
* [refreshDataType](#refreshdatatype) - Refresh data type

## get

Get the state of each data type for a company

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetDataStatusRequest;
import io.codat.sync.expenses.models.operations.GetDataStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetDataStatusRequest req = GetDataStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        GetDataStatusResponse res = sdk.manageData().get()
                .request(req)
                .call();

        if (res.dataStatuses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetDataStatusRequest](../../models/operations/GetDataStatusRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetDataStatusResponse](../../models/operations/GetDataStatusResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getPullOperation

Retrieve information about a single dataset or pull operation.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetPullOperationRequest;
import io.codat.sync.expenses.models.operations.GetPullOperationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetPullOperationRequest req = GetPullOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .datasetId("71a4c0fb-8e15-45bd-958d-330b4e6e9f07")
                .build();

        GetPullOperationResponse res = sdk.manageData().getPullOperation()
                .request(req)
                .call();

        if (res.pullOperation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPullOperationRequest](../../models/operations/GetPullOperationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPullOperationResponse](../../models/operations/GetPullOperationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listPullOperations

Gets the pull operation history (datasets) for a given company.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.ListPullOperationsRequest;
import io.codat.sync.expenses.models.operations.ListPullOperationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListPullOperationsRequest req = ListPullOperationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListPullOperationsResponse res = sdk.manageData().listPullOperations()
                .request(req)
                .call();

        if (res.pullOperations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPullOperationsRequest](../../models/operations/ListPullOperationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPullOperationsResponse](../../models/operations/ListPullOperationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## refreshAllDataTypes

Refreshes all data types with `fetch on first link` set to `true` for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

[Read more](https://docs.codat.io/core-concepts/data-type-settings) about data type settings and `fetch on first link`.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.RefreshAllDataTypesRequest;
import io.codat.sync.expenses.models.operations.RefreshAllDataTypesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        RefreshAllDataTypesRequest req = RefreshAllDataTypesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        RefreshAllDataTypesResponse res = sdk.manageData().refreshAllDataTypes()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RefreshAllDataTypesRequest](../../models/operations/RefreshAllDataTypesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RefreshAllDataTypesResponse](../../models/operations/RefreshAllDataTypesResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## refreshDataType

Refreshes a given data type for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.SchemaDataType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.RefreshDataTypeRequest;
import io.codat.sync.expenses.models.operations.RefreshDataTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        RefreshDataTypeRequest req = RefreshDataTypeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(SchemaDataType.INVOICES)
                .build();

        RefreshDataTypeResponse res = sdk.manageData().refreshDataType()
                .request(req)
                .call();

        if (res.pullOperation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RefreshDataTypeRequest](../../models/operations/RefreshDataTypeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RefreshDataTypeResponse](../../models/operations/RefreshDataTypeResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |