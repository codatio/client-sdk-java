# MappingOptions
(*mappingOptions()*)

## Overview

Get accounts, trackingCategories and taxRates that can be used in your create and update requests.

### Available Operations

* [getMappingOptions](#getmappingoptions) - Mapping options

## getMappingOptions

Gets the mapping options (accounts, trackingCategories and taxRates) for a company's accounting software

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetMappingOptionsRequest;
import io.codat.sync.expenses.models.operations.GetMappingOptionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetMappingOptionsRequest req = GetMappingOptionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        GetMappingOptionsResponse res = sdk.mappingOptions().getMappingOptions()
                .request(req)
                .call();

        if (res.mappingOptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetMappingOptionsRequest](../../models/operations/GetMappingOptionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetMappingOptionsResponse](../../models/operations/GetMappingOptionsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |