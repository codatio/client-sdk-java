# CompanyInfo
(*companyInfo()*)

## Overview

View the company information of your customers' linked accounting software.

### Available Operations

* [get](#get) - Get company info

## get

Gets the latest basic info for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetCompanyInfoRequest;
import io.codat.sync.expenses.models.operations.GetCompanyInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetCompanyInfoRequest req = GetCompanyInfoRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        GetCompanyInfoResponse res = sdk.companyInfo().get()
                .request(req)
                .call();

        if (res.companyInformation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCompanyInfoRequest](../../models/operations/GetCompanyInfoRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCompanyInfoResponse](../../models/operations/GetCompanyInfoResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |