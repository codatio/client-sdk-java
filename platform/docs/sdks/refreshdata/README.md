# RefreshData
(*refreshData()*)

## Overview

Initiate data refreshes, view pull status and history.

### Available Operations

* [all](#all) - Refresh all data
* [byDataType](#bydatatype) - Refresh data type
* [get](#get) - Get data status
* [getPullOperation](#getpulloperation) - Get pull operation
* [listPullOperations](#listpulloperations) - List pull operations

## all

Refreshes all data types with `fetch on first link` set to `true` for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

[Read more](https://docs.codat.io/core-concepts/data-type-settings) about data type settings and `fetch on first link`.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.RefreshCompanyDataRequest;
import io.codat.platform.models.operations.RefreshCompanyDataResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            RefreshCompanyDataRequest req = RefreshCompanyDataRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            RefreshCompanyDataResponse res = sdk.refreshData().all()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RefreshCompanyDataRequest](../../models/operations/RefreshCompanyDataRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RefreshCompanyDataResponse](../../models/operations/RefreshCompanyDataResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## byDataType

Refreshes a given data type for a given company.

This is an asynchronous operation, and will bring updated data into Codat from the linked integration for you to view.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.RefreshDataTypeRequest;
import io.codat.platform.models.operations.RefreshDataTypeResponse;
import io.codat.platform.models.shared.SchemaDataType;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            RefreshDataTypeRequest req = RefreshDataTypeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(SchemaDataType.INVOICES)
                .build();

            RefreshDataTypeResponse res = sdk.refreshData().byDataType()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RefreshDataTypeRequest](../../models/operations/RefreshDataTypeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RefreshDataTypeResponse](../../models/operations/RefreshDataTypeResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## get

Get the state of each data type for a company

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetCompanyDataStatusRequest;
import io.codat.platform.models.operations.GetCompanyDataStatusResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCompanyDataStatusRequest req = GetCompanyDataStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetCompanyDataStatusResponse res = sdk.refreshData().get()
                .request(req)
                .call();

            if (res.dataStatuses().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCompanyDataStatusRequest](../../models/operations/GetCompanyDataStatusRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCompanyDataStatusResponse](../../models/operations/GetCompanyDataStatusResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getPullOperation

Retrieve information about a single dataset or pull operation.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetPullOperationRequest;
import io.codat.platform.models.operations.GetPullOperationResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetPullOperationRequest req = GetPullOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .datasetId("7911a54a-c808-4f4b-b87e-b195f52b4da5")
                .build();

            GetPullOperationResponse res = sdk.refreshData().getPullOperation()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPullOperationRequest](../../models/operations/GetPullOperationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPullOperationResponse](../../models/operations/GetPullOperationResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listPullOperations

Gets the pull operation history (datasets) for a given company.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.ListPullOperationsRequest;
import io.codat.platform.models.operations.ListPullOperationsResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListPullOperationsRequest req = ListPullOperationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListPullOperationsResponse res = sdk.refreshData().listPullOperations()
                .request(req)
                .call();

            if (res.pullOperations().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPullOperationsRequest](../../models/operations/ListPullOperationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPullOperationsResponse](../../models/operations/ListPullOperationsResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
