# CreateOperations
(*loanWriteback().createOperations()*)

## Overview

### Available Operations

* [get](#get) - Get create operation
* [list](#list) - List create operations

## get

Retrieve create operation.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreateOperationRequest;
import io.codat.lending.models.operations.GetCreateOperationResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreateOperationRequest req = GetCreateOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .pushOperationKey("b888f774-3e7c-4135-a18c-6b985523c4bc")
                .build();

        GetCreateOperationResponse res = sdk.loanWriteback().createOperations().get()
                .request(req)
                .call();

        if (res.pushOperation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCreateOperationRequest](../../models/operations/GetCreateOperationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCreateOperationResponse](../../models/operations/GetCreateOperationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

List create operations.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListCreateOperationsRequest;
import io.codat.lending.models.operations.ListCreateOperationsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListCreateOperationsRequest req = ListCreateOperationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListCreateOperationsResponse res = sdk.loanWriteback().createOperations().list()
                .request(req)
                .call();

        if (res.pushOperations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListCreateOperationsRequest](../../models/operations/ListCreateOperationsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListCreateOperationsResponse](../../models/operations/ListCreateOperationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |