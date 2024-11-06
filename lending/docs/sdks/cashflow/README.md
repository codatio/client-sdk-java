# CashFlow
(*financialStatements().cashFlow()*)

## Overview

### Available Operations

* [get](#get) - Get cash flow statement

## get

Gets the latest cash flow statement for a company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingCashFlowStatementRequest;
import io.codat.lending.models.operations.GetAccountingCashFlowStatementResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingCashFlowStatementRequest req = GetAccountingCashFlowStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

        GetAccountingCashFlowStatementResponse res = sdk.financialStatements().cashFlow().get()
                .request(req)
                .call();

        if (res.accountingCashFlowStatement().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetAccountingCashFlowStatementRequest](../../models/operations/GetAccountingCashFlowStatementRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetAccountingCashFlowStatementResponse](../../models/operations/GetAccountingCashFlowStatementResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |