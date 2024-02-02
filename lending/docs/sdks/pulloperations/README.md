# PullOperations
(*manageData().pullOperations()*)

### Available Operations

* [getPullOperation](#getpulloperation) - Get pull operation
* [listPullOperations](#listpulloperations) - List pull operations

## getPullOperation

Retrieve information about a single dataset or pull operation.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetPullOperationRequest;
import io.codat.lending.models.operations.GetPullOperationResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetPullOperationRequest req = GetPullOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .datasetId("b18d8d81-fd7b-4764-a31e-475cb1f36591")
                .build();

            GetPullOperationResponse res = sdk.manageData().pullOperations().getPullOperation()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [io.codat.lending.models.operations.GetPullOperationRequest](../../models/operations/GetPullOperationRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetPullOperationResponse>](../../models/operations/GetPullOperationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listPullOperations

Gets the pull operation history (datasets) for a given company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListPullOperationsRequest;
import io.codat.lending.models.operations.ListPullOperationsResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
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

            ListPullOperationsResponse res = sdk.manageData().pullOperations().listPullOperations()
                .request(req)
                .call();

            if (res.pullOperations().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
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
| `request`                                                                                                            | [io.codat.lending.models.operations.ListPullOperationsRequest](../../models/operations/ListPullOperationsRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListPullOperationsResponse>](../../models/operations/ListPullOperationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
