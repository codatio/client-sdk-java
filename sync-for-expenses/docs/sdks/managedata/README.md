# ManageData
(*manageData()*)

## Overview

Asynchronously retrieve data from an integration to refresh data in Codat.

### Available Operations

* [getDataStatus](#getdatastatus) - Get data status
* [getPullOperation](#getpulloperation) - Get pull operation
* [listPullOperations](#listpulloperations) - List pull operations
* [refreshAllDataTypes](#refreshalldatatypes) - Refresh all data
* [refreshDataType](#refreshdatatype) - Refresh data type

## getDataStatus

Get the state of each data type for a company

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetDataStatusRequest;
import io.codat.sync_for_expenses.models.operations.GetDataStatusResponse;
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

            GetDataStatusRequest req = GetDataStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetDataStatusResponse res = sdk.manageData().getDataStatus()
                .request(req)
                .call();

            if (res.dataStatuses().isPresent()) {
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
| `request`                                                                                                            | [io.codat.sync_for_expenses.models.operations.GetDataStatusRequest](../../models/operations/GetDataStatusRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetDataStatusResponse>](../../models/operations/GetDataStatusResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getPullOperation

Retrieve information about a single dataset or pull operation.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetPullOperationRequest;
import io.codat.sync_for_expenses.models.operations.GetPullOperationResponse;
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

            GetPullOperationRequest req = GetPullOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .datasetId("7911a54a-c808-4f4b-b87e-b195f52b4da5")
                .build();

            GetPullOperationResponse res = sdk.manageData().getPullOperation()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
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
| `request`                                                                                                                  | [io.codat.sync_for_expenses.models.operations.GetPullOperationRequest](../../models/operations/GetPullOperationRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetPullOperationResponse>](../../models/operations/GetPullOperationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listPullOperations

Gets the pull operation history (datasets) for a given company.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.ListPullOperationsRequest;
import io.codat.sync_for_expenses.models.operations.ListPullOperationsResponse;
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

            ListPullOperationsRequest req = ListPullOperationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListPullOperationsResponse res = sdk.manageData().listPullOperations()
                .request(req)
                .call();

            if (res.pullOperations().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [io.codat.sync_for_expenses.models.operations.ListPullOperationsRequest](../../models/operations/ListPullOperationsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.ListPullOperationsResponse>](../../models/operations/ListPullOperationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## refreshAllDataTypes

Refreshes all data types with `fetch on first link` set to `true` for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

[Read more](https://docs.codat.io/core-concepts/data-type-settings) about data type settings and `fetch on first link`.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.RefreshAllDataTypesRequest;
import io.codat.sync_for_expenses.models.operations.RefreshAllDataTypesResponse;
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

            RefreshAllDataTypesRequest req = RefreshAllDataTypesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            RefreshAllDataTypesResponse res = sdk.manageData().refreshAllDataTypes()
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [io.codat.sync_for_expenses.models.operations.RefreshAllDataTypesRequest](../../models/operations/RefreshAllDataTypesRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.RefreshAllDataTypesResponse>](../../models/operations/RefreshAllDataTypesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## refreshDataType

Refreshes a given data type for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.RefreshDataTypeRequest;
import io.codat.sync_for_expenses.models.operations.RefreshDataTypeResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.SchemaDataType;
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

            RefreshDataTypeRequest req = RefreshDataTypeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(SchemaDataType.INVOICES)
                .connectionId("d6258093-be98-4f60-90e1-ca6bcd49fb9a")
                .build();

            RefreshDataTypeResponse res = sdk.manageData().refreshDataType()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
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
| `request`                                                                                                                | [io.codat.sync_for_expenses.models.operations.RefreshDataTypeRequest](../../models/operations/RefreshDataTypeRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.RefreshDataTypeResponse>](../../models/operations/RefreshDataTypeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
